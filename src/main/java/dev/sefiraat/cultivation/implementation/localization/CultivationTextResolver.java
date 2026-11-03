package dev.sefiraat.cultivation.implementation.localization;

import dev.sefiraat.cultivation.api.datatypes.FloraLevelProfileDataType;
import dev.sefiraat.cultivation.api.datatypes.SeedPackDataType;
import dev.sefiraat.cultivation.api.datatypes.instances.FloraLevelProfile;
import dev.sefiraat.cultivation.api.datatypes.instances.SeedPackInstance;
import dev.sefiraat.cultivation.implementation.utils.Keys;
import io.github.thebusybiscuit.slimefun5.core.services.localization.ItemTextBlocks;
import io.github.thebusybiscuit.slimefun5.core.services.localization.ItemTextResolver;
import io.github.thebusybiscuit.slimefun5.implementation.Slimefun;
import io.github.thebusybiscuit.slimefun5.libraries.dough.data.persistent.PersistentDataAPI;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Adds the stats only one stack knows: the plant a Seed Pack holds, the plant a Knowledge Script teaches, and an
 * analysed plant's levels. Each comes from the stack's persistent data and is shown in the viewer's language.
 */
public final class CultivationTextResolver implements ItemTextResolver {

    private static final String SEED_PACK = "CLT_SEED_PACK";
    private static final String KNOWLEDGE_SCRIPT = "CLT_RECIPE_UNLOCK";
    private static final String PLANT_PREFIX = "CLT_PLANT_";

    private final ResolverTexts texts;

    public CultivationTextResolver(@Nonnull ResolverTexts texts) {
        this.texts = texts;
    }

    @Nullable
    @Override
    public ItemTextBlocks resolve(@Nullable ItemStack item, @Nonnull String itemId, @Nullable String languageId) {
        ItemMeta meta = item == null ? null : item.getItemMeta();
        if (meta == null) {
            return null;
        }
        List<String> stats;
        if (itemId.equals(SEED_PACK)) {
            stats = seedPackStats(meta, languageId);
        } else if (itemId.equals(KNOWLEDGE_SCRIPT)) {
            stats = knowledgeScriptStats(meta, languageId);
        } else if (itemId.startsWith(PLANT_PREFIX)) {
            stats = analysedPlantStats(meta, languageId);
        } else {
            stats = null;
        }
        return stats == null ? null : ItemTextBlocks.of(null, null, null, stats, null);
    }

    @Nullable
    private List<String> seedPackStats(@Nonnull ItemMeta meta, @Nullable String languageId) {
        SeedPackInstance instance = PersistentDataAPI.get(meta, SeedPackDataType.KEY, SeedPackDataType.TYPE);
        String plantName = instance == null || instance.getStoredItemId() == null ? null : itemName(languageId, instance.getStoredItemId());
        return plantName == null ? null : Collections.singletonList(stat(languageId, "lore.seed-pack-set-to", "Set to", plantName));
    }

    @Nullable
    private List<String> knowledgeScriptStats(@Nonnull ItemMeta meta, @Nullable String languageId) {
        String childId = PersistentDataAPI.getString(meta, Keys.RECIPE_ID);
        String childName = childId == null ? null : itemName(languageId, childId);
        return childName == null ? null : Collections.singletonList(stat(languageId, "lore.knowledge-script-unlocks", "Unlocks", childName));
    }

    @Nullable
    private List<String> analysedPlantStats(@Nonnull ItemMeta meta, @Nullable String languageId) {
        FloraLevelProfile profile = PersistentDataAPI.get(meta, FloraLevelProfileDataType.KEY, FloraLevelProfileDataType.TYPE);
        if (profile == null || !profile.isAnalyzed()) {
            return null;
        }
        return Arrays.asList(
            stat(languageId, "lore.drop-level", "Drop Level", String.valueOf(profile.getLevel())),
            stat(languageId, "lore.growth-speed", "Growth Speed", String.valueOf(profile.getSpeed())),
            stat(languageId, "lore.breed-strength", "Breed Strength", String.valueOf(profile.getStrength()))
        );
    }

    @Nonnull
    private String stat(@Nullable String languageId, @Nonnull String key, @Nonnull String english, @Nonnull String value) {
        String label = texts.get(languageId, key);
        return "&8⇨ &7" + (label != null ? label : english) + ": &b" + value;
    }

    @Nullable
    private static String itemName(@Nullable String languageId, @Nonnull String itemId) {
        return Slimefun.getItemTranslationService().getNameForLanguage(languageId, itemId);
    }
}
