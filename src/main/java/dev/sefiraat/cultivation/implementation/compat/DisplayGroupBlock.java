package dev.sefiraat.cultivation.implementation.compat;

import dev.sefiraat.sefilib.entity.display.DisplayGroup;
import dev.sefiraat.sefilib.entity.display.DisplayInteractable;
import io.github.thebusybiscuit.slimefun5.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun5.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun5.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun5.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun5.core.handlers.BlockBreakHandler;
import io.github.thebusybiscuit.slimefun5.core.handlers.BlockPlaceHandler;
import me.mrCookieSlime.Slimefun.api.BlockStorage;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.inventory.ItemStack;

import java.util.List;
import java.util.UUID;
import java.util.function.Function;

public abstract class DisplayGroupBlock extends SlimefunItem implements DisplayInteractable {

    public static final String KEY_UUID = "display-uuid";

    private final Function<Location, DisplayGroup> displayGroupFunction;

    public DisplayGroupBlock(ItemGroup itemGroup, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe, Function<Location, DisplayGroup> displayGroupFunction) {
        this(itemGroup, item, recipeType, recipe, null, displayGroupFunction);
    }

    public DisplayGroupBlock(ItemGroup itemGroup, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe, ItemStack recipeOutput, Function<Location, DisplayGroup> displayGroupFunction) {
        super(itemGroup, item, recipeType, recipe, recipeOutput);
        this.displayGroupFunction = displayGroupFunction;
    }

    @Override
    public void preRegister() {
        addItemHandler(new BlockPlaceHandler(false) {
            @Override
            public void onPlayerPlace(BlockPlaceEvent event) {
                Location loc = event.getBlock().getLocation();
                DisplayGroup group = displayGroupFunction.apply(loc);
                if (group != null) {
                    setUUID(group, loc);
                }
                whenPlaced(event);
            }
        });

        addItemHandler(new BlockBreakHandler(false, false) {
            @Override
            public void onPlayerBreak(BlockBreakEvent event, ItemStack item, List<ItemStack> drops) {
                Location loc = event.getBlock().getLocation();
                DisplayGroup group = getDisplayGroup(loc);
                if (group != null) {
                    group.remove();
                }
                whenBroken(event, item, drops);
            }
        });
    }

    protected void whenPlaced(BlockPlaceEvent event) {
    }

    protected void whenBroken(BlockBreakEvent event, ItemStack item, List<ItemStack> drops) {
    }

    protected abstract Material getBaseMaterial();

    private void setUUID(DisplayGroup group, Location location) {
        BlockStorage.addBlockInfo(location, KEY_UUID, group.getParentUUID().toString());
    }

    public UUID getUUID(Location location) {
        String uuidString = BlockStorage.getLocationInfo(location, KEY_UUID);
        if (uuidString == null) {
            return null;
        }
        return UUID.fromString(uuidString);
    }

    public DisplayGroup getDisplayGroup(Location location) {
        UUID uuid = getUUID(location);
        if (uuid == null) {
            return null;
        }
        return DisplayGroup.fromUUID(uuid);
    }
}
