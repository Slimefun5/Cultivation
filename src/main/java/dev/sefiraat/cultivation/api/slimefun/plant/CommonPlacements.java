package dev.sefiraat.cultivation.api.slimefun.plant;


import com.google.common.collect.ImmutableSet;
import org.bukkit.Material;

import java.util.Set;

public final class CommonPlacements {

    private CommonPlacements() {
        throw new IllegalStateException("Utility class");
    }

    public static final Set<Material> COMMON_OVERWORLD = ImmutableSet.of(
        Material.GRASS_BLOCK,
        Material.DIRT,
        Material.PODZOL,
        Material.MUD,
        Material.COARSE_DIRT
    );

}
