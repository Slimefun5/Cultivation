package dev.sefiraat.sefilib.string;

import io.github.thebusybiscuit.slimefun5.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun5.libraries.dough.items.CustomItemStack;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.Particle;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import java.util.ArrayList;
import java.util.List;

public class Theme {

    public static final Theme WARNING = new Theme(ChatColor.YELLOW, "Warning");
    public static final Theme ERROR = new Theme(ChatColor.RED, "Error");
    public static final Theme NOTICE = new Theme(ChatColor.WHITE, "Notice");
    public static final Theme PASSIVE = new Theme(ChatColor.GRAY);
    public static final Theme SUCCESS = new Theme(ChatColor.GREEN, "Success");
    public static final Theme CLICK_INFO = new Theme(ChatColor.of("#e4ed32"), "Click here");

    private final ChatColor color;
    private final String loreLine;

    public Theme(@Nonnull ChatColor color) {
        this(color, "");
    }

    public Theme(@Nonnull ChatColor color, @Nonnull String loreLine) {
        this.color = color;
        this.loreLine = loreLine;
    }

    public String color(String string) {
        return this.color + string;
    }

    public String apply(Object object) {
        return this.color + String.valueOf(object);
    }

    public String asTitle(Object title, Object value) {
        return this.color + String.valueOf(title) + ": " + PASSIVE.color + value;
    }

    public ChatColor getColor() {
        return this.color;
    }

    public String getLoreLine() {
        return this.loreLine;
    }

    public Particle.DustOptions getDustOptions(float size) {
        java.awt.Color awtColor = this.color.getColor();
        Color bukkitColor = awtColor != null
            ? Color.fromRGB(awtColor.getRed(), awtColor.getGreen(), awtColor.getBlue())
            : Color.WHITE;
        return new Particle.DustOptions(bukkitColor, size);
    }

    @Override
    public String toString() {
        return this.color.toString();
    }

    @Nonnull
    @ParametersAreNonnullByDefault
    public static String applyThemeToString(Theme theme, Object object) {
        return theme.getColor() + String.valueOf(object);
    }

    @Nonnull
    @ParametersAreNonnullByDefault
    public static String applyThemeAsTitle(Theme theme, String title, Object value) {
        return theme.getColor() + title + ": " + PASSIVE.getColor() + value;
    }

    @Nonnull
    @ParametersAreNonnullByDefault
    public static ItemStack themedItemStack(Material material, Theme themeType, String name, @Nullable List<String> lore) {
        List<String> finalLore = new ArrayList<>();
        if (lore != null) {
            for (String s : lore) {
                finalLore.add(PASSIVE.getColor() + s);
            }
        }
        finalLore.add(CLICK_INFO.getColor() + themeType.getLoreLine());
        return CustomItemStack.create(material, applyThemeToString(themeType, name), finalLore.toArray(new String[0]));
    }

    @Nonnull
    public static SlimefunItemStack themedSlimefunItemStack(String id, ItemStack item, Theme theme, String name, String... lore) {
        List<String> finalLore = new ArrayList<>();
        for (String s : lore) {
            finalLore.add(PASSIVE.getColor() + s);
        }
        finalLore.add(CLICK_INFO.getColor() + theme.getLoreLine());
        return new SlimefunItemStack(id, item, applyThemeToString(theme, name), finalLore.toArray(new String[0]));
    }

    @Nonnull
    public static SlimefunItemStack themedSlimefunItemStack(String id, ItemStack item, Theme theme, String name, List<String> lore) {
        return themedSlimefunItemStack(id, item, theme, name, lore.toArray(new String[0]));
    }

    @Nonnull
    public static SlimefunItemStack themedSlimefunItemStack(String id, Material material, Theme theme, String name, String... lore) {
        return themedSlimefunItemStack(id, new ItemStack(material), theme, name, lore);
    }

    @Nonnull
    public static SlimefunItemStack themedSeed(String id, ItemStack item, Theme theme, String name, String[] stats, String[] lore) {
        List<String> finalLore = new ArrayList<>();
        for (String s : stats) {
            finalLore.add(s);
        }
        if (lore != null) {
            for (String s : lore) {
                finalLore.add(PASSIVE.getColor() + s);
            }
        }
        finalLore.add(CLICK_INFO.getColor() + theme.getLoreLine());
        return new SlimefunItemStack(id, item, applyThemeToString(theme, name), finalLore.toArray(new String[0]));
    }

    @Nonnull
    public static SlimefunItemStack themedSeed(String id, ItemStack item, Theme theme, String name, List<String> stats, List<String> lore) {
        return themedSeed(id, item, theme, name, stats.toArray(new String[0]), lore != null ? lore.toArray(new String[0]) : null);
    }
}
