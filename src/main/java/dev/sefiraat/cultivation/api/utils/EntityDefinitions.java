package dev.sefiraat.cultivation.api.utils;

import dev.sefiraat.cultivation.Cultivation;
import dev.sefiraat.cultivation.libs.sefilib.entity.LivingEntityCategory;
import dev.sefiraat.cultivation.libs.sefilib.entity.LivingEntityDefinition;
import dev.sefiraat.cultivation.libs.sefilib.entity.LivingEntitySelector;
import dev.sefiraat.cultivation.libs.sefilib.version.Versions;
import io.github.thebusybiscuit.slimefun5.libraries.dough.versions.MinecraftVersion;
import io.github.thebusybiscuit.slimefun5.libraries.dough.versions.SemanticVersion;
import org.bukkit.Server;

import java.util.Collections;
import java.util.Set;

public final class EntityDefinitions {

    private EntityDefinitions() {
        throw new IllegalStateException("Utility class");
    }

    private static Set<LivingEntityDefinition> passiveMobs;
    private static Set<LivingEntityDefinition> hostileMobs;
    private static Set<LivingEntityDefinition> bossMobs;
    private static Set<LivingEntityDefinition> flyingMobs;

    static {
        SemanticVersion version;
        try {
            version = MinecraftVersion.of(Cultivation.getInstance().getServer());
        } catch (Exception e) {
            version = Versions.VERSION_LATEST;
        }

        passiveMobs = LivingEntitySelector.start()
            .includeCategories(LivingEntityCategory.PASSIVE)
            .setVersion(version)
            .process(LivingEntitySelector.MatchType.MATCH_ALL);

        hostileMobs = LivingEntitySelector.start()
            .includeCategories(LivingEntityCategory.HOSTILE)
            .setVersion(version)
            .process(LivingEntitySelector.MatchType.MATCH_ALL);

        bossMobs = LivingEntitySelector.start()
            .includeCategories(LivingEntityCategory.BOSS)
            .setVersion(version)
            .process(LivingEntitySelector.MatchType.MATCH_ALL);

        flyingMobs = LivingEntitySelector.start()
            .includeCategories(LivingEntityCategory.FLYING)
            .setVersion(version)
            .process(LivingEntitySelector.MatchType.MATCH_ALL);
    }

    public static Set<LivingEntityDefinition> getPassiveMobs() {
        return Collections.unmodifiableSet(passiveMobs);
    }

    public static Set<LivingEntityDefinition> getHostileMobs() {
        return Collections.unmodifiableSet(hostileMobs);
    }

    public static Set<LivingEntityDefinition> getBossMobs() {
        return Collections.unmodifiableSet(bossMobs);
    }

    public static Set<LivingEntityDefinition> getFlyingMobs() {
        return flyingMobs;
    }
}
