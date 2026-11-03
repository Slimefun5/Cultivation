package dev.sefiraat.cultivation.implementation.slimefun.tools;

import dev.sefiraat.cultivation.api.datatypes.SeedPackDataType;
import dev.sefiraat.cultivation.api.datatypes.instances.FloraLevelProfile;
import dev.sefiraat.cultivation.api.datatypes.instances.SeedPackInstance;
import dev.sefiraat.cultivation.api.slimefun.items.plants.CultivationPlant;
import dev.sefiraat.cultivation.implementation.localization.Messages;
import dev.sefiraat.cultivation.libs.sefilib.string.Theme;
import io.github.thebusybiscuit.slimefun5.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun5.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun5.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun5.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun5.core.handlers.ItemUseHandler;
import io.github.thebusybiscuit.slimefun5.libraries.dough.data.persistent.PersistentDataAPI;
import io.github.thebusybiscuit.slimefun5.libraries.dough.items.CustomItemStack;
import io.github.thebusybiscuit.slimefun5.utils.ChestMenuUtils;
import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.ChestMenu;
import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.ClickAction;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import javax.annotation.Nonnull;
import java.util.HashMap;
import java.util.List;

public class SeedPack extends SlimefunItem {

    public SeedPack(ItemGroup group, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(group, item, recipeType, recipe);
    }

    @Override
    public void preRegister() {
        addItemHandler(onRightClick());
    }

    @Nonnull
    public ItemUseHandler onRightClick() {
        return playerRightClickEvent -> {
            playerRightClickEvent.cancel();
            ItemStack itemStack = playerRightClickEvent.getItem();
            Player player = playerRightClickEvent.getPlayer();
            if (itemStack.getAmount() > 1) {
                player.sendMessage(Theme.ERROR.apply(Messages.get(player, "seed-pack.unstack-first", "You must unstack your Seed Packs first.")));
                return;
            }
            SeedPackGui gui = new SeedPackGui(itemStack, player);
            gui.open(player);
        };
    }

    public static class SeedPackGui extends ChestMenu {

        protected static final int[] BACKGROUND_SLOTS = new int[]{
            0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 13, 14, 15, 17, 18,
            20, 24, 26, 27, 29, 30, 31, 32, 33, 35, 36, 37, 38, 39, 40,
            41, 42, 43, 44
        };
        protected static final int SEED_SET_SLOT = 19;
        protected static final int[] SEED_SET_BACKGROUND = new int[]{
            10, 28
        };
        protected static final int SEED_PICKUP_SLOT = 25;
        protected static final int[] SEED_PICKUP_BACKGROUND = new int[]{
            16, 34
        };

        protected static final int INCREMENT_LEVEL_SLOT = 21;
        protected static final int INCREMENT_SPEED_SLOT = 22;
        protected static final int INCREMENT_STRENGTH_SLOT = 23;

        private int level = 1;
        private int speed = 1;
        private int strength = 1;

        private final ItemStack packStack;
        private final Player viewer;
        private final ItemStack noSeedSetStack;
        private final ItemStack emptySeedSetStack;
        private SeedPackInstance instance;

        public SeedPackGui(@Nonnull ItemStack packStack, @Nonnull Player viewer) {
            super(Messages.get(viewer, "seed-pack.title", "Seed Pack"));
            ItemMeta itemMeta = packStack.getItemMeta();

            this.packStack = packStack;
            this.viewer = viewer;
            this.noSeedSetStack = paneWithLore(
                Material.ORANGE_STAINED_GLASS_PANE,
                Theme.WARNING.apply(Messages.get(viewer, "seed-pack.no-seed-set", "No Seed Set")),
                Messages.lines(viewer, "seed-pack.no-seed-set-lore", "Click the icon on the left", "while holding a seed to set the pack.")
            );
            this.emptySeedSetStack = paneWithLore(
                Material.RED_STAINED_GLASS_PANE,
                Theme.WARNING.apply(Messages.get(viewer, "seed-pack.empty-set", "Empty Set")),
                Messages.lines(viewer, "seed-pack.empty-set-lore", "You have no seeds matching", "these levels.")
            );
            ItemStack setBackground = CustomItemStack.create(
                Material.GREEN_STAINED_GLASS_PANE,
                Theme.PASSIVE.apply(Messages.get(viewer, "seed-pack.set-here", "Set seed here"))
            );
            ItemStack pickupBackground = CustomItemStack.create(
                Material.GREEN_STAINED_GLASS_PANE,
                Theme.PASSIVE.apply(Messages.get(viewer, "seed-pack.retrieve-here", "Retrieve here"))
            );
            instance = PersistentDataAPI.get(
                itemMeta,
                SeedPackDataType.KEY,
                SeedPackDataType.TYPE,
                new SeedPackInstance()
            );

            setPlayerInventoryClickable(true);

            ChestMenuUtils.drawBackground(this, BACKGROUND_SLOTS);

            for (int i : SEED_PICKUP_BACKGROUND) {
                addItem(i, pickupBackground, ChestMenuUtils.getEmptyClickHandler());
            }

            for (int i : SEED_SET_BACKGROUND) {
                addItem(i, setBackground, ChestMenuUtils.getEmptyClickHandler());
            }

            addItem(SEED_SET_SLOT, noSeedSetStack, this::onClickSeedSetSlot);
            addItem(SEED_PICKUP_SLOT, noSeedSetStack, this::onClickSeedGetSlot);

            addItem(INCREMENT_LEVEL_SLOT, getIncrementStack(Stat.LEVEL, 1), (p, slot, item, action) -> {
                int value;
                if (action.isRightClicked()) {
                    value = Math.max(level - 1, 1);
                } else {
                    value = Math.min(level + 1, 10);
                }
                replaceExistingItem(INCREMENT_LEVEL_SLOT, getIncrementStack(Stat.LEVEL, value));
                this.level = value;
                setOutputStack();
                return false;
            });
            addItem(INCREMENT_SPEED_SLOT, getIncrementStack(Stat.SPEED, 1), (p, slot, item, action) -> {
                int value;
                if (action.isRightClicked()) {
                    value = Math.max(speed - 1, 1);
                } else {
                    value = Math.min(speed + 1, 10);
                }
                replaceExistingItem(INCREMENT_SPEED_SLOT, getIncrementStack(Stat.SPEED, value));
                this.speed = value;
                setOutputStack();
                return false;
            });
            addItem(INCREMENT_STRENGTH_SLOT, getIncrementStack(Stat.STRENGTH, 1), (p, slot, item, action) -> {
                int value;
                if (action.isRightClicked()) {
                    value = Math.max(strength - 1, 1);
                } else {
                    value = Math.min(strength + 1, 10);
                }
                replaceExistingItem(INCREMENT_STRENGTH_SLOT, getIncrementStack(Stat.STRENGTH, value));
                this.strength = value;
                setOutputStack();
                return false;
            });

            setOutputStack();
            setInputStack();
        }

        private boolean onClickSeedSetSlot(Player player, int slot, ItemStack item, ClickAction action) {
            ItemStack itemStack = player.getItemOnCursor();
            if (itemStack == null || itemStack.getType().isAir()) {
                return false;
            }

            SlimefunItem slimefunItem = SlimefunItem.getByItem(itemStack);
            if (!(slimefunItem instanceof CultivationPlant)) {
                player.sendMessage(Theme.WARNING.apply(Messages.get(player, "seed-pack.not-a-seed", "The item must be a Cultivation plant seed.")));
                return false;
            }
            CultivationPlant plant = (CultivationPlant) slimefunItem;

            if (!instance.isEmpty()) {
                player.sendMessage(Theme.WARNING.apply(Messages.get(player, "seed-pack.empty-before-change", "You must empty a pack before changing its plant.")));
                return false;
            }

            this.instance.setStoredItemId(plant.getId());
            replaceExistingItem(SEED_SET_SLOT, getSeedDisplayStack(plant));
            reapplyInstance(plant);

            return false;
        }

        private boolean onClickSeedGetSlot(Player player, int slot, ItemStack item, ClickAction action) {
            SlimefunItem slimefunItem = SlimefunItem.getById(instance.storedItemId);
            if (!(slimefunItem instanceof CultivationPlant)) {
                player.sendMessage(Theme.WARNING.apply(Messages.get(player, "seed-pack.no-plant-set", "You have not set a plant yet.")));
                return false;
            }
            CultivationPlant plant = (CultivationPlant) slimefunItem;

            int amount = instance.getAmount(level, speed, strength);
            if (amount < 1) {
                player.sendMessage(Theme.WARNING.apply(Messages.get(player, "seed-pack.none-stored", "You have none of this seed at these levels.")));
                return false;
            }

            FloraLevelProfile profile = new FloraLevelProfile(level, speed, strength, true);

            ItemStack itemStack = CultivationPlant.getStack(plant, profile);

            HashMap<Integer, ItemStack> remainder = player.getInventory().addItem(itemStack);

            if (remainder.isEmpty()) {
                instance.takeOne(level, speed, strength);
            }
            setOutputStack();
            reapplyInstance(plant);
            return false;
        }

        private void setInputStack() {
            SlimefunItem slimefunItem = SlimefunItem.getById(instance.storedItemId);
            if (!(slimefunItem instanceof CultivationPlant)) {
                replaceExistingItem(SEED_SET_SLOT, noSeedSetStack);
                return;
            }
            CultivationPlant plant = (CultivationPlant) slimefunItem;
            ItemStack itemStack = getSeedDisplayStack(plant);
            replaceExistingItem(SEED_SET_SLOT, itemStack);
        }

        private void setOutputStack() {
            SlimefunItem slimefunItem = SlimefunItem.getById(instance.storedItemId);
            if (!(slimefunItem instanceof CultivationPlant)) {
                replaceExistingItem(SEED_PICKUP_SLOT, noSeedSetStack);
                return;
            }
            CultivationPlant plant = (CultivationPlant) slimefunItem;
            int amount = instance.getAmount(level, speed, strength);
            ItemStack itemStack = getSeedGetStack(plant, amount);
            replaceExistingItem(SEED_PICKUP_SLOT, itemStack);
        }

        private void reapplyInstance(@Nonnull CultivationPlant plant) {
            ItemMeta itemMeta = this.packStack.getItemMeta();
            if (itemMeta != null) {
                PersistentDataAPI.set(itemMeta, SeedPackDataType.KEY, SeedPackDataType.TYPE, this.instance);
                this.packStack.setItemMeta(itemMeta);
            }
        }

        @Nonnull
        private ItemStack getSeedDisplayStack(@Nonnull CultivationPlant plant) {
            ItemStack itemStack = plant.getItem().clone();
            ItemMeta itemMeta = itemStack.getItemMeta();
            itemMeta.setDisplayName(Theme.CLICK_INFO.apply(Messages.get(viewer, "seed-pack.stored-seed", "Stored Seed Type")));
            itemStack.setItemMeta(itemMeta);
            return ChestMenuUtils.stripTranslationIdentity(itemStack);
        }

        @Nonnull
        private ItemStack getSeedGetStack(@Nonnull CultivationPlant plant, int amount) {
            if (amount == 0) {
                return emptySeedSetStack;
            }
            ItemStack itemStack = plant.getItem().clone();
            ItemMeta itemMeta = itemStack.getItemMeta();
            itemMeta.setDisplayName(Theme.CLICK_INFO.apply(Messages.get(viewer, "seed-pack.take-seed", "Take a seed from the pack")));
            itemStack.setItemMeta(itemMeta);
            itemStack.setAmount(Math.min(amount, 64));
            return ChestMenuUtils.stripTranslationIdentity(itemStack);
        }
        
        @Nonnull
        private ItemStack getIncrementStack(@Nonnull Stat stat, int value) {
            String name = stat.name(viewer);
            return CustomItemStack.create(
                Material.YELLOW_STAINED_GLASS_PANE,
                Theme.CLICK_INFO.apply(name),
                Theme.CLICK_INFO.asTitle(Messages.get(viewer, "seed-pack.left-click", "Left Click"),
                    Messages.get(viewer, "seed-pack.increase", "Increase %stat%").replace("%stat%", name)),
                Theme.CLICK_INFO.asTitle(Messages.get(viewer, "seed-pack.right-click", "Right Click"),
                    Messages.get(viewer, "seed-pack.decrease", "Decrease %stat%").replace("%stat%", name)),
                "",
                Theme.CLICK_INFO.asTitle(Messages.get(viewer, "seed-pack.current", "Current"), value)
            );
        }

        @Nonnull
        private static ItemStack paneWithLore(@Nonnull Material material, @Nonnull String name, @Nonnull List<String> lore) {
            String[] lines = lore.stream().map(Theme.PASSIVE::apply).toArray(String[]::new);
            return CustomItemStack.create(material, name, lines);
        }
    }

    private enum Stat {
        LEVEL("seed-pack.level", "Level"),
        SPEED("seed-pack.speed", "Speed"),
        STRENGTH("seed-pack.strength", "Strength");

        private final String key;
        private final String english;

        Stat(@Nonnull String key, @Nonnull String english) {
            this.key = key;
            this.english = english;
        }

        @Nonnull
        String name(@Nonnull Player viewer) {
            return Messages.get(viewer, key, english);
        }
    }
}
