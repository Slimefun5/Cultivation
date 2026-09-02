package dev.sefiraat.cultivation.implementation.utils;

import dev.sefiraat.cultivation.Cultivation;
import io.github.thebusybiscuit.slimefun5.libraries.keys.NamespacedKey;

import javax.annotation.Nonnull;

public final class Keys {

    private Keys() {
        throw new IllegalStateException("Utility class");
    }

    // Region Slimefun BlockStorage Keys
    public static final String FLORA_GROWTH_STAGE = "growth-stage";
    public static final String FLORA_OWNER = "plant-owner";
    public static final org.bukkit.NamespacedKey COOLDOWN = newBukkitKey("cooldown");
    public static final org.bukkit.NamespacedKey DROPPED_PLAYER = newBukkitKey("dropped-player");
    public static final org.bukkit.NamespacedKey RECIPE_ID = newBukkitKey("recipe-id");
    public static final org.bukkit.NamespacedKey SATIATED = newBukkitKey("satiated");

    @Nonnull
    public static NamespacedKey newKey(@Nonnull String value) {
        return new NamespacedKey(Cultivation.getInstance(), value);
    }

    @Nonnull
    public static org.bukkit.NamespacedKey newBukkitKey(@Nonnull String value) {
        return new org.bukkit.NamespacedKey(Cultivation.getInstance(), value);
    }
}
