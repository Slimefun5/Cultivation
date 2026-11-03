package dev.sefiraat.cultivation.implementation.slimefun.tools;

import org.bukkit.ChatColor;
import io.github.thebusybiscuit.slimefun5.implementation.Slimefun;
import dev.sefiraat.cultivation.api.datatypes.instances.FloraLevelProfile;
import dev.sefiraat.cultivation.api.interfaces.CultivationBushHolder;
import dev.sefiraat.cultivation.api.interfaces.CultivationLevelProfileHolder;
import dev.sefiraat.cultivation.api.interfaces.CultivationPlantHolder;
import dev.sefiraat.cultivation.implementation.utils.DisplayGroupGenerators;
import dev.sefiraat.cultivation.libs.sefilib.entity.display.DisplayGroup;
import dev.sefiraat.cultivation.libs.sefilib.string.Theme;
import io.github.thebusybiscuit.slimefun5.api.events.PlayerRightClickEvent;
import io.github.thebusybiscuit.slimefun5.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun5.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun5.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun5.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun5.core.attributes.NotPlaceable;
import io.github.thebusybiscuit.slimefun5.core.handlers.ItemUseHandler;
import io.github.thebusybiscuit.slimefun5.implementation.items.SimpleSlimefunItem;
import me.mrCookieSlime.Slimefun.api.BlockStorage;
import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import dev.sefiraat.cultivation.implementation.localization.Messages;

public class PlantAnalyser extends SimpleSlimefunItem<ItemUseHandler> implements NotPlaceable {

    public PlantAnalyser(ItemGroup group, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(group, item, recipeType, recipe);
    }

    @Nonnull
    @Override
    public ItemUseHandler getItemHandler() {
        return PlantAnalyser::onRightClick;
    }

    private static void onRightClick(PlayerRightClickEvent playerRightClickEvent) {
        if (!playerRightClickEvent.getClickedBlock().isPresent()) {
            // No block preset
            return;
        }

        Block block = playerRightClickEvent.getClickedBlock().get();
        SlimefunItem item = BlockStorage.check(block);

        if (item == null) {
            return;
        }

        if (playerRightClickEvent.getPlayer().isSneaking()) {
            applyName(item, block);
        } else {
            showStats(playerRightClickEvent, item, block);
        }
    }

    @ParametersAreNonnullByDefault
    private static void showStats(PlayerRightClickEvent event, SlimefunItem item, Block block) {
        if (item instanceof CultivationLevelProfileHolder) {
            CultivationLevelProfileHolder profileHolder = (CultivationLevelProfileHolder) item;
            FloraLevelProfile profile = profileHolder.getLevelProfile(block);
            profile.setAnalyzed(true);
            profileHolder.setLevelProfile(block.getLocation(), profile);
            Player player = event.getPlayer();
            player.sendMessage(Theme.CLICK_INFO.apply(Slimefun.getItemTranslationService().getName(player, item)));
            player.sendMessage(Theme.CLICK_INFO.asTitle(Messages.get(player, "lore.drop-level", "Drop Level"), profile.getLevel()));
            player.sendMessage(Theme.CLICK_INFO.asTitle(Messages.get(player, "lore.growth-speed", "Growth Speed"), profile.getSpeed()));
            player.sendMessage(Theme.CLICK_INFO.asTitle(Messages.get(player, "lore.breed-strength", "Breed Strength"), profile.getStrength()));
        }
    }

    private static void applyName(@Nonnull SlimefunItem item, @Nonnull Block block) {
        DisplayGroup group = getGroup(item, block.getLocation());
        if (group == null) {
            return;
        }
        String name = displayedName(item);

        if (DisplayGroupGenerators.hasName(group)) {
            DisplayGroupGenerators.removeNameFromGroup(group);
        } else {
            DisplayGroupGenerators.addNameToGroup(group, name);
        }
    }

    /** The name floats above the plant for everyone at once, so it is in the server's language, not a viewer's. */
    @Nonnull
    private static String displayedName(@Nonnull SlimefunItem item) {
        String name = Slimefun.getItemTranslationService().getNameForLanguage(null, item.getId());
        return ChatColor.stripColor(name != null ? name : item.getId());
    }

    @Nullable
    private static DisplayGroup getGroup(@Nonnull SlimefunItem item, @Nonnull Location location) {
        if (item instanceof CultivationPlantHolder) {
            CultivationPlantHolder holder = (CultivationPlantHolder) item;
            return holder.getPlantDisplayGroup(location);
        } else if (item instanceof CultivationBushHolder) {
            CultivationBushHolder holder = (CultivationBushHolder) item;
            return holder.getBushDisplayGroup(location);
        }
        return null;
    }
}
