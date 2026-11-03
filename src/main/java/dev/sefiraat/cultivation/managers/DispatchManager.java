package dev.sefiraat.cultivation.managers;

import dev.sefiraat.cultivation.implementation.commands.CultivationCommands;
import org.bukkit.command.PluginCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class DispatchManager {

    public DispatchManager(JavaPlugin plugin) {
        PluginCommand command = plugin.getCommand("cultivation");
        if (command != null) {
            CultivationCommands executor = new CultivationCommands();
            command.setExecutor(executor);
            command.setTabCompleter(executor);
        }
    }
}
