package dev.sefiraat.cultivation.implementation.localization;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import dev.sefiraat.cultivation.Cultivation;
import io.github.thebusybiscuit.slimefun5.implementation.Slimefun;

/**
 * Resolves this addon's text for one viewer, from {@code languages/<lang>/messages.yml}.
 *
 * @implNote Colours stay at the call site rather than in the translated value: a translator never edits a colour
 *           code they cannot see the effect of.
 */
public final class Messages {

    private Messages() {}

    @Nonnull
    public static String get(@Nullable CommandSender viewer, @Nonnull String key, @Nonnull String english) {
        return Slimefun.getAddonMessageService().getMessage(asPlayer(viewer), Cultivation.getInstance(), key, english);
    }

    @Nonnull
    public static String get(@Nullable CommandSender viewer, @Nonnull Text text) {
        return get(viewer, text.key, text.english);
    }

    @Nonnull
    public static List<String> lines(@Nullable CommandSender viewer, @Nonnull String key, @Nonnull String... english) {
        return Slimefun.getAddonMessageService().getMessages(asPlayer(viewer), Cultivation.getInstance(), key, Arrays.asList(english));
    }

    /** A message key with its English, for text chosen before anyone views it. */
    public static final class Text {

        private final String key;
        private final String english;

        public Text(@Nonnull String key, @Nonnull String english) {
            this.key = key;
            this.english = english;
        }
    }

    @Nullable
    private static Player asPlayer(@Nullable CommandSender viewer) {
        return viewer instanceof Player ? (Player) viewer : null;
    }
}
