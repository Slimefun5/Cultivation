package dev.sefiraat.cultivation.implementation.compat;

import io.github.thebusybiscuit.slimefun5.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun5.api.items.groups.NestedItemGroup;
import io.github.thebusybiscuit.slimefun5.api.items.groups.SubItemGroup;
import io.github.thebusybiscuit.slimefun5.api.player.PlayerProfile;
import io.github.thebusybiscuit.slimefun5.core.guide.SlimefunGuide;
import io.github.thebusybiscuit.slimefun5.core.guide.SlimefunGuideMode;
import io.github.thebusybiscuit.slimefun5.libraries.dough.items.CustomItemStack;
import io.github.thebusybiscuit.slimefun5.libraries.keys.NamespacedKey;
import io.github.thebusybiscuit.slimefun5.utils.ChestMenuUtils;
import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.ChestMenu;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;
import java.util.List;

public class SimpleFlexGroup extends NestedItemGroup {

    private static final int PAGE_SIZE = 36;
    private static final int GUIDE_BACK = 1;
    private static final int PAGE_PREVIOUS = 46;
    private static final int PAGE_NEXT = 52;
    private static final int[] HEADER = {0, 1, 2, 3, 4, 5, 6, 7, 8};
    private static final int[] FOOTER = {45, 46, 47, 48, 49, 50, 51, 52, 53};

    private final JavaPlugin plugin;
    private final String name;
    private final List<MenuItem> menuItems = new ArrayList<>();

    public SimpleFlexGroup(JavaPlugin plugin, String name, NamespacedKey key, ItemStack item) {
        super(key, item);
        this.plugin = plugin;
        this.name = name;
    }

    public SimpleFlexGroup addItemGroup(ItemGroup group) {
        this.menuItems.add(MenuItem.of(group));
        if (group instanceof SubItemGroup subGroup) {
            addSubGroup(subGroup);
        }
        return this;
    }

    public SimpleFlexGroup addMenuItem(MenuItem item) {
        this.menuItems.add(item);
        return this;
    }

    @Override
    public boolean isVisible(Player p, PlayerProfile profile, SlimefunGuideMode layout) {
        return true;
    }

    @Override
    public void open(Player p, PlayerProfile profile, SlimefunGuideMode layout) {
        ChestMenu menu = new ChestMenu(name);
        for (int i = 0; i < 54; i++) {
            menu.addItem(i, null, ChestMenuUtils.getEmptyClickHandler());
        }
        menu.setEmptySlotsClickable(false);
        setupPage(p, profile, layout, menu, 1);
        menu.open(p);
    }

    private void setupPage(Player p, PlayerProfile profile, SlimefunGuideMode layout, ChestMenu menu, int page) {
        for (int i = 0; i < 54; i++) {
            menu.replaceExistingItem(i, null);
            menu.addMenuClickHandler(i, ChestMenuUtils.getEmptyClickHandler());
        }

        reapplyHeader(p, profile, layout, menu);

        int totalPages = Math.max(1, (int) Math.ceil((double) menuItems.size() / PAGE_SIZE));
        int start = (page - 1) * PAGE_SIZE;
        int end = Math.min(start + PAGE_SIZE, menuItems.size());

        for (int i = start; i < end; i++) {
            int slot = 9 + (i - start);
            MenuItem menuItem = menuItems.get(i);
            if (menuItem.getItemGroup() != null) {
                ItemGroup group = menuItem.getItemGroup();
                menu.replaceExistingItem(slot, group.getItem(p));
                menu.addMenuClickHandler(slot, (pl, s, item, action) -> {
                    SlimefunGuide.openItemGroup(profile, group, layout, 1);
                    return false;
                });
            } else if (menuItem.getItem() != null) {
                menu.replaceExistingItem(slot, menuItem.getItem());
                menu.addMenuClickHandler(slot, menuItem.getClickHandler());
            }
        }

        reapplyFooter(p, profile, layout, menu, page, totalPages);
    }

    private void reapplyHeader(Player p, PlayerProfile profile, SlimefunGuideMode layout, ChestMenu menu) {
        for (int slot : HEADER) {
            menu.replaceExistingItem(slot, CustomItemStack.create(Material.GRAY_STAINED_GLASS_PANE, " "));
            menu.addMenuClickHandler(slot, ChestMenuUtils.getEmptyClickHandler());
        }

        menu.replaceExistingItem(GUIDE_BACK, ChestMenuUtils.getBackButton(p));
        menu.addMenuClickHandler(GUIDE_BACK, (pl, slot, item, action) -> {
            SlimefunGuide.openMainMenu(profile, layout, 1);
            return false;
        });
    }

    private void reapplyFooter(Player p, PlayerProfile profile, SlimefunGuideMode layout, ChestMenu menu, int page, int totalPages) {
        for (int slot : FOOTER) {
            menu.replaceExistingItem(slot, CustomItemStack.create(Material.GRAY_STAINED_GLASS_PANE, " "));
            menu.addMenuClickHandler(slot, ChestMenuUtils.getEmptyClickHandler());
        }

        if (page > 1) {
            menu.replaceExistingItem(PAGE_PREVIOUS, ChestMenuUtils.getPreviousButton(p, page, totalPages));
            menu.addMenuClickHandler(PAGE_PREVIOUS, (pl, slot, item, action) -> {
                p.playSound(p.getLocation(), Sound.ITEM_BOOK_PAGE_TURN, 1.0f, 1.0f);
                setupPage(p, profile, layout, menu, page - 1);
                return false;
            });
        }

        if (page < totalPages) {
            menu.replaceExistingItem(PAGE_NEXT, ChestMenuUtils.getNextButton(p, page, totalPages));
            menu.addMenuClickHandler(PAGE_NEXT, (pl, slot, item, action) -> {
                p.playSound(p.getLocation(), Sound.ITEM_BOOK_PAGE_TURN, 1.0f, 1.0f);
                setupPage(p, profile, layout, menu, page + 1);
                return false;
            });
        }
    }
}
