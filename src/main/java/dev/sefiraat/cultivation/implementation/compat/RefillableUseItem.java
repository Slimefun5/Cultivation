package dev.sefiraat.cultivation.implementation.compat;

import io.github.thebusybiscuit.slimefun5.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun5.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun5.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun5.implementation.items.LimitedUseItem;
import io.github.thebusybiscuit.slimefun5.libraries.dough.data.persistent.PersistentDataAPI;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public abstract class RefillableUseItem extends LimitedUseItem {

    protected RefillableUseItem(ItemGroup group, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(group, item, recipeType, recipe);
    }

    protected void refillItem(ItemStack item) {
        refillItem(item, getMaxUseCount());
    }

    protected void refillItem(ItemStack item, int uses) {
        ItemMeta meta = item.getItemMeta();
        if (meta != null) {
            io.github.thebusybiscuit.slimefun5.utils.compatibility.PdcCompat.setInt(meta, getStorageKey(), uses);
            updateLore(item, meta, uses);
            item.setItemMeta(meta);
        }
    }

    protected void updateLore(ItemStack item, ItemMeta meta, int uses) {
        // Lore is dynamically updated by Slimefun5
    }
}
