package dev.sefiraat.cultivation.implementation.slimefun.tools;

import dev.sefiraat.cultivation.api.slimefun.items.bushes.CultivationBush;
import dev.sefiraat.cultivation.implementation.compat.RefillableUseItem;
import io.github.thebusybiscuit.slimefun5.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun5.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun5.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun5.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun5.core.handlers.ItemUseHandler;
import me.mrCookieSlime.Slimefun.api.BlockStorage;
import org.bukkit.block.Block;
import org.bukkit.inventory.ItemStack;
import javax.annotation.Nonnull;

public class TrimmingTool extends RefillableUseItem {
    public TrimmingTool(ItemGroup group,
                        SlimefunItemStack item,
                        RecipeType recipeType,
                        ItemStack[] recipe,
                        int maxUses
    ) {
        super(group, item, recipeType, recipe);
        setMaxUseCount(maxUses);
    }

    @Nonnull
    @Override
    public ItemUseHandler getItemHandler() {
        return playerRightClickEvent -> {
            if (!playerRightClickEvent.getClickedBlock().isPresent()) {
                // No block preset
                return;
            }

            Block block = playerRightClickEvent.getClickedBlock().get();
            SlimefunItem item = BlockStorage.check(block);

            if (item instanceof CultivationBush && ((CultivationBush) item).isMature(block)) {
                CultivationBush trimmable = (CultivationBush) item;
                ItemStack trimmingResult = trimmable.getTrimmingResult();
                trimmable.updateGrowthStage(block.getLocation(), 1);
                block.getWorld().dropItem(block.getLocation(), trimmingResult.clone());
            }

            damageItem(playerRightClickEvent.getPlayer(), playerRightClickEvent.getItem());
        };
    }
}
