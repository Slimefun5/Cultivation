package dev.sefiraat.cultivation;

import dev.sefiraat.cultivation.implementation.slimefun.items.Bushes;
import dev.sefiraat.cultivation.implementation.slimefun.items.Crafting;
import dev.sefiraat.cultivation.implementation.slimefun.items.Foods;
import dev.sefiraat.cultivation.implementation.slimefun.items.Ingredients;
import dev.sefiraat.cultivation.implementation.slimefun.items.Machines;
import dev.sefiraat.cultivation.implementation.slimefun.items.Plants;
import dev.sefiraat.cultivation.implementation.slimefun.items.Products;
import dev.sefiraat.cultivation.implementation.slimefun.items.Tools;
import dev.sefiraat.cultivation.implementation.slimefun.items.Trees;
import dev.sefiraat.cultivation.managers.ConfigManager;
import dev.sefiraat.cultivation.managers.DispatchManager;
import dev.sefiraat.cultivation.managers.ListenerManager;
import dev.sefiraat.cultivation.managers.SupportedPluginManager;
import dev.sefiraat.cultivation.managers.TaskManager;
import dev.sefiraat.cultivation.libs.sefilib.entity.display.DisplayGroupManager;
import io.github.thebusybiscuit.slimefun5.api.SlimefunAddon;
import io.github.thebusybiscuit.slimefun5.implementation.Slimefun;
import org.bstats.bukkit.Metrics;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class Cultivation extends JavaPlugin implements SlimefunAddon {
    private static final int BSTATS_ID = 18184;

    private static Cultivation instance;

    private ConfigManager configManager;
    private SupportedPluginManager supportedPluginManager;
    private ListenerManager listenerManager;
    private TaskManager taskManager;
    private DispatchManager dispatchManager;
    private DisplayGroupManager displayGroupManager;
    private Registry registry;

    @Override
    public void onEnable() {
        instance = this;

        if (!hasDisplayEntities()) {
            getLogger().severe("Cultivation needs Minecraft 1.19.4 or above: its plants are display entities, which older versions do not have");
            getServer().getPluginManager().disablePlugin(this);
            return;
        }

        saveDefaultConfig();
        this.configManager = new ConfigManager();

        this.supportedPluginManager = new SupportedPluginManager();
        this.listenerManager = new ListenerManager();
        this.taskManager = new TaskManager();
        this.dispatchManager = new DispatchManager(this);
        this.displayGroupManager = new DisplayGroupManager(this);
        this.registry = new Registry();

        setupItems();
        setupStats();

        Slimefun.getItemTranslationService().registerTranslations(this);
        Slimefun.getLocalization().registerItemGroupTranslations(this);
        Slimefun.getLocalization().registerRecipeTypeTranslations(this);
    }

    private void setupItems() {
        Bushes.setup(this);
        Crafting.setup(this);
        Tools.setup(this);
        Machines.setup(this);
        Plants.setup(this);
        Trees.setup(this);
        Products.setup(this);
        Ingredients.setup(this);
        Foods.setup(this);
    }

    @Override
    public void onDisable() {
        if (this.configManager != null) {
            this.configManager.saveAll();
        }
    }

    /**
     * @implNote Checked by name before any class that names a display entity loads, so that the refusal on an older
     *           server is one log line rather than a class loading error.
     */
    private static boolean hasDisplayEntities() {
        try {
            Class.forName("org.bukkit.entity.Display");
            return true;
        } catch (ClassNotFoundException absent) {
            return false;
        }
    }

    /** Core reports every addon's metrics itself unless the server sets {@code metrics.disable-addon-metrics} to false. */
    private static boolean addonMetricsEnabled() {
        return Slimefun.getCfg().contains("metrics.disable-addon-metrics") && !Slimefun.getCfg().getBoolean("metrics.disable-addon-metrics");
    }

    @Nonnull
    @Override
    public JavaPlugin getJavaPlugin() {
        return this;
    }

    @Nullable
    @Override
    public String getBugTrackerURL() {
        return "https://github.com/Slimefun5/Cultivation/issues";
    }

    private void setupStats() {
        if (addonMetricsEnabled()) {
            new Metrics(this, BSTATS_ID);
        }
    }

    public static Cultivation getInstance() {
        return Cultivation.instance;
    }

    public static void logError(@Nonnull String string) {
        instance.getLogger().severe(string);
    }

    public static void logWarning(@Nonnull String string) {
        instance.getLogger().warning(string);
    }

    public static void logInfo(@Nonnull String string) {
        instance.getLogger().info(string);
    }

    @Nonnull
    public static PluginManager getPluginManager() {
        return Cultivation.getInstance().getServer().getPluginManager();
    }

    public static ConfigManager getConfigManager() {
        return Cultivation.getInstance().configManager;
    }

    public static SupportedPluginManager getSupportedPluginManager() {
        return Cultivation.getInstance().supportedPluginManager;
    }

    public static ListenerManager getListenerManager() {
        return Cultivation.getInstance().listenerManager;
    }

    public static TaskManager getRunnableManager() {
        return Cultivation.getInstance().taskManager;
    }

    public static Registry getPlantRegistry() {
        return Cultivation.getInstance().registry;
    }

    public DispatchManager getDispatchManager() {
        return dispatchManager;
    }
}
