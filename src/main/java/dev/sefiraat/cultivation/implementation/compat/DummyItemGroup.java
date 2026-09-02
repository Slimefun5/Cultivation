package dev.sefiraat.cultivation.implementation.compat;

import io.github.thebusybiscuit.slimefun5.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun5.libraries.keys.NamespacedKey;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class DummyItemGroup extends ItemGroup {

    public DummyItemGroup(NamespacedKey key, ItemStack item) {
        super(key, item);
    }

    public DummyItemGroup(NamespacedKey key, ItemStack item, int tier) {
        super(key, item, tier);
    }

    @Override
    public boolean isHidden(Player p) {
        return true;
    }
}
