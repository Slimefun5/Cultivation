package dev.sefiraat.cultivation.implementation.slimefun.machines;

import dev.sefiraat.cultivation.implementation.slimefun.items.Machines;
import dev.sefiraat.cultivation.libs.sefilib.entity.display.DisplayGroup;
import dev.sefiraat.cultivation.libs.sefilib.string.Theme;
import io.github.thebusybiscuit.slimefun5.libraries.dough.items.CustomItemStack;
import io.github.thebusybiscuit.slimefun5.api.events.PlayerRightClickEvent;
import io.github.thebusybiscuit.slimefun5.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun5.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun5.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun5.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun5.core.attributes.EnergyNetComponent;
import io.github.thebusybiscuit.slimefun5.core.networks.energy.EnergyNetComponentType;
import io.github.thebusybiscuit.slimefun5.implementation.Slimefun;
import io.github.thebusybiscuit.slimefun5.libraries.dough.protection.Interaction;
import io.github.thebusybiscuit.slimefun5.utils.ChestMenuUtils;
import me.mrCookieSlime.Slimefun.api.BlockStorage;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenu;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenuPreset;
import me.mrCookieSlime.Slimefun.api.item_transport.ItemTransportFlow;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import javax.annotation.Nonnull;

import javax.annotation.Nonnull;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import dev.sefiraat.cultivation.implementation.localization.Messages;

public class PoweredKitchenMachineSimple extends KitchenRecipeMachineSimple implements EnergyNetComponent {
    private static final int INPUT_SLOT = 20;
    private static final int OUTPUT_SLOT = 24;
    private static final int COOK_SLOT = 22;
    private static final int[] OUTPUT_SLOT_BACKGROUND = new int[]{
        14, 15, 16, 23, 25, 32, 33, 34
    };
    private static final int[] INPUT_SLOT_BACKGROUND = new int[]{
        10, 11, 12, 19, 21, 28, 29, 30
    };
    private static final int[] BACKGROUND = new int[]{
        0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 13, 17, 18, 22, 26, 27, 31, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44
    };

    private final Map<String, ItemStack> recipes = new HashMap<>();
    private final int powerRequirement;

    public PoweredKitchenMachineSimple(ItemGroup itemGroup,
                                       SlimefunItemStack item,
                                       RecipeType recipeType,
                                       ItemStack[] recipe,
                                       Function<Location, DisplayGroup> displayGroupFunction,
                                       int powerRequirement
    ) {
        super(itemGroup, item, recipeType, recipe, displayGroupFunction);
        this.powerRequirement = powerRequirement;
    }

    @Override
    protected void onRightClick(@Nonnull PlayerRightClickEvent event) {
        Player player = event.getPlayer();
        if (player.isSneaking()) {
            super.onRightClick(event);
        } else {
            Block block = event.getClickedBlock().orElse(null);

            if (block == null) {
                return;
            }

            BlockMenu blockMenu = BlockStorage.getInventory(block);

            if (blockMenu == null || !blockMenu.canOpen(block, player)) {
                return;
            }
            blockMenu.open(player);
        }
    }

    @Nonnull
    @Override
    protected Map<String, ItemStack> getRecipes() {
        return recipes;
    }

    @Nonnull
    @Override
    public EnergyNetComponentType getEnergyComponentType() {
        return EnergyNetComponentType.CONSUMER;
    }

    @Override
    public int getCapacity() {
        return 2500;
    }

    @Override
    public void postRegister() {
        new BlockMenuPreset(this.getId(), this.getItemName()) {

            @Override
            public void init() {
                optOutOfHeaderItem();
                ItemStack backgroundInput = CustomItemStack.create(
                    Material.GREEN_STAINED_GLASS_PANE,
                    Theme.PASSIVE.apply("Insert Produce")
                );
                ItemStack backgroundOutput = CustomItemStack.create(
                    Material.ORANGE_STAINED_GLASS_PANE,
                    Theme.PASSIVE.apply("Cooked Output")
                );
                ItemStack cookButton = CustomItemStack.create(
                    Material.RED_STAINED_GLASS_PANE,
                    Theme.CLICK_INFO.apply("Cook Produce"),
                    Theme.CLICK_INFO.asTitle("Power Required", powerRequirement)
                );
                drawBackground(BACKGROUND);
                drawBackground(backgroundInput, INPUT_SLOT_BACKGROUND);
                drawBackground(backgroundOutput, OUTPUT_SLOT_BACKGROUND);
                addItem(COOK_SLOT, cookButton, ChestMenuUtils.getEmptyClickHandler());
            }

            @Override
            public void newInstance(@Nonnull BlockMenu menu, @Nonnull Block b) {
                menu.addMenuClickHandler(COOK_SLOT, (p, slot, item, action) -> {
                    if (getCharge(menu.getLocation()) < powerRequirement) {
                        p.sendMessage(Theme.ERROR.apply(Messages.get(p, "kitchen.not-enough-power", "Not enough power.")));
                        return false;
                    }
                    ItemStack itemStack = menu.getItemInSlot(INPUT_SLOT);
                    if (itemStack == null || itemStack.getType().isAir()) {
                        p.sendMessage(Theme.ERROR.apply(Messages.get(p, "kitchen.input-empty", "Put an item in the input slot.")));
                        return false;
                    }
                    SlimefunItem slimefunItem = SlimefunItem.getByItem(itemStack);
                    String id = itemStack.getType().name();
                    if (slimefunItem != null) {
                        id = slimefunItem.getId();
                    }

                    ItemStack result = testRecipe(id);
                    if (result == null || !menu.fits(result, OUTPUT_SLOT)) {
                        p.sendMessage(Theme.ERROR.apply(Messages.get(p, "kitchen.no-recipe", "No matching recipe.")));
                        return false;
                    }

                    menu.pushItem(result, OUTPUT_SLOT);
                    itemStack.setAmount(itemStack.getAmount() - 1);
                    removeCharge(menu.getLocation(), powerRequirement);
                    p.sendMessage(Theme.SUCCESS.apply(Messages.get(p, "kitchen.cooked", "Tasty!")));
                    return false;
                });
            }

            @Override
            public boolean canOpen(@Nonnull Block block, @Nonnull Player player) {
                return Machines.GARDEN_CLOCHE.canUse(player, false)
                    && Slimefun.getProtectionManager()
                    .hasPermission(player, block.getLocation(), Interaction.INTERACT_BLOCK);
            }

            @Override
            public int[] getSlotsAccessedByItemTransport(ItemTransportFlow flow) {
                if (flow == ItemTransportFlow.WITHDRAW) {
                    return new int[]{OUTPUT_SLOT};
                }
                return new int[0];
            }
        };
    }
}
