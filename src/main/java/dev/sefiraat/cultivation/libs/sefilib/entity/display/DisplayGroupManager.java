package dev.sefiraat.cultivation.libs.sefilib.entity.display;

import dev.sefiraat.cultivation.libs.sefilib.protections.Protections;
import io.github.thebusybiscuit.slimefun5.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun5.libraries.dough.protection.Interaction;
import me.mrCookieSlime.Slimefun.api.BlockStorage;
import org.bukkit.Bukkit;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.plugin.java.JavaPlugin;

public class DisplayGroupManager implements Listener {

    private static DisplayGroupManager instance;

    public DisplayGroupManager(JavaPlugin plugin) {
        instance = this;
        Bukkit.getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler
    public void onInteraction(PlayerInteractEntityEvent event) {
        Player player = event.getPlayer();
        if (event.getRightClicked().getType() == EntityType.INTERACTION) {
            Block block = event.getRightClicked().getLocation().getBlock();
            SlimefunItem slimefunItem = BlockStorage.check(block);
            if (slimefunItem instanceof DisplayInteractable) {
                EquipmentSlot hand = event.getHand();
                PlayerInteractEvent interactEvent = new PlayerInteractEvent(
                    player,
                    Action.RIGHT_CLICK_BLOCK,
                    player.getInventory().getItem(hand),
                    block,
                    BlockFace.UP
                );
                Bukkit.getPluginManager().callEvent(interactEvent);
                if (hand == EquipmentSlot.HAND) {
                    player.swingMainHand();
                } else {
                    player.swingOffHand();
                }
            }
        }
    }

    @EventHandler
    public void onAttack(EntityDamageByEntityEvent event) {
        if (event.getDamager() instanceof Player) {
            Player player = (Player) event.getDamager();
            if (event.getEntity().getType() == EntityType.INTERACTION) {
                Block block = event.getEntity().getLocation().getBlock();
                SlimefunItem slimefunItem = BlockStorage.check(block);
                if (slimefunItem instanceof DisplayInteractable) {
                    if (Protections.hasPermission(player, block, Interaction.BREAK_BLOCK)) {
                        BlockBreakEvent breakEvent = new BlockBreakEvent(block, player);
                        Bukkit.getPluginManager().callEvent(breakEvent);
                    }
                }
            }
        }
    }

    @EventHandler
    public void onBlockPlace(BlockPlaceEvent event) {
        SlimefunItem slimefunItem = BlockStorage.check(event.getBlock());
        if (slimefunItem instanceof DisplayInteractable) {
            event.setCancelled(true);
        }
    }

    @EventHandler
    public void onBlockBreak(BlockBreakEvent event) {
        Block above = event.getBlock().getRelative(BlockFace.UP);
        SlimefunItem slimefunItem = BlockStorage.check(above);
        if (slimefunItem instanceof DisplayInteractable) {
            BlockBreakEvent breakEvent = new BlockBreakEvent(above, event.getPlayer());
            Bukkit.getPluginManager().callEvent(breakEvent);
            if (!breakEvent.isCancelled()) {
                return;
            }
            event.setCancelled(true);
        }
    }
}
