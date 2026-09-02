package dev.sefiraat.cultivation.implementation.compat;

import io.github.thebusybiscuit.slimefun5.api.items.ItemGroup;
import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.ChestMenu;
import org.bukkit.inventory.ItemStack;

public class MenuItem {

    private ItemStack item;
    private ChestMenu.MenuClickHandler clickHandler;
    private ItemGroup itemGroup;

    public MenuItem(ItemGroup itemGroup) {
        this.itemGroup = itemGroup;
    }

    public MenuItem(ItemStack item, ChestMenu.MenuClickHandler clickHandler) {
        this.item = item;
        this.clickHandler = clickHandler;
    }

    public ItemStack getItem() {
        return item;
    }

    public ChestMenu.MenuClickHandler getClickHandler() {
        return clickHandler;
    }

    public ItemGroup getItemGroup() {
        return itemGroup;
    }

    public static MenuItem of(ItemGroup itemGroup) {
        return new MenuItem(itemGroup);
    }

    public static MenuItem of(ItemStack item, ChestMenu.MenuClickHandler clickHandler) {
        return new MenuItem(item, clickHandler);
    }
}
