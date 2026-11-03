package dev.sefiraat.cultivation.libs.sefilib.protections;

import io.github.thebusybiscuit.slimefun5.implementation.Slimefun;
import io.github.thebusybiscuit.slimefun5.libraries.dough.protection.Interaction;
import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;

import java.util.UUID;

public final class Protections {

    private Protections() {
        throw new IllegalStateException("Utility class");
    }

    public static boolean hasPermission(Player player, Block block, Interaction interaction) {
        return Slimefun.getProtectionManager().hasPermission(player, block.getLocation(), interaction);
    }

    public static boolean hasPermission(Player player, Location location, Interaction interaction) {
        return Slimefun.getProtectionManager().hasPermission(player, location, interaction);
    }

    public static boolean hasPermission(UUID uuid, Block block, Interaction interaction) {
        return Slimefun.getProtectionManager().hasPermission(org.bukkit.Bukkit.getOfflinePlayer(uuid), block.getLocation(), interaction);
    }

    public static boolean hasPermission(UUID uuid, Location location, Interaction interaction) {
        return Slimefun.getProtectionManager().hasPermission(org.bukkit.Bukkit.getOfflinePlayer(uuid), location, interaction);
    }
}
