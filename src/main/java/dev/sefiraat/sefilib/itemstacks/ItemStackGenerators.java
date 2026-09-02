package dev.sefiraat.sefilib.itemstacks;

import io.github.thebusybiscuit.slimefun5.libraries.dough.collections.Pair;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.PotionMeta;

public final class ItemStackGenerators {

    private ItemStackGenerators() {
        throw new IllegalStateException("Utility class");
    }

    public static ItemStack createPotion(Color color) {
        ItemStack itemStack = new ItemStack(Material.POTION);
        PotionMeta meta = (PotionMeta) itemStack.getItemMeta();
        if (meta != null) {
            meta.setColor(color);
            meta.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
            itemStack.setItemMeta(meta);
        }
        return itemStack;
    }

    @SafeVarargs
    public static ItemStack createEnchantedItemStack(Material material, Pair<Enchantment, Integer>... enchantments) {
        return createEnchantedItemStack(material, false, enchantments);
    }

    @SafeVarargs
    public static ItemStack createEnchantedItemStack(Material material, boolean hideFlags, Pair<Enchantment, Integer>... enchantments) {
        ItemStack itemStack = new ItemStack(material);
        for (Pair<Enchantment, Integer> pair : enchantments) {
            itemStack.addUnsafeEnchantment(pair.getFirstValue(), pair.getSecondValue());
        }
        if (hideFlags) {
            var meta = itemStack.getItemMeta();
            if (meta != null) {
                meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                itemStack.setItemMeta(meta);
            }
        }
        return itemStack;
    }
}
