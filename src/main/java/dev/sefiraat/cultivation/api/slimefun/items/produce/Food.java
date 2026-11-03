package dev.sefiraat.cultivation.api.slimefun.items.produce;

import dev.sefiraat.cultivation.api.slimefun.groups.CultivationGroups;
import dev.sefiraat.cultivation.implementation.slimefun.CultivationStacks;
import dev.sefiraat.cultivation.implementation.utils.Keys;
import dev.sefiraat.cultivation.libs.sefilib.itemstacks.Cooldowns;
import dev.sefiraat.cultivation.libs.sefilib.string.Theme;
import io.github.thebusybiscuit.slimefun5.libraries.dough.data.persistent.PersistentDataAPI;
import io.github.thebusybiscuit.slimefun5.api.SlimefunAddon;
import io.github.thebusybiscuit.slimefun5.api.events.PlayerRightClickEvent;
import io.github.thebusybiscuit.slimefun5.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun5.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun5.core.handlers.ItemUseHandler;
import io.github.thebusybiscuit.slimefun5.implementation.items.SimpleSlimefunItem;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import javax.annotation.Nonnull;

import javax.annotation.Nonnull;
import java.util.function.Consumer;
import dev.sefiraat.cultivation.implementation.localization.Messages;

public class Food extends SimpleSlimefunItem<ItemUseHandler> {

    private final Consumer<Player> eatingEffects;
    private Messages.Text eatingMessage = new Messages.Text("food.eaten", "Lovely! You're all full up.");

    public Food(SlimefunItemStack item,
                RecipeType recipeType,
                ItemStack[] recipe,
                Consumer<Player> effect
    ) {
        super(CultivationGroups.FOODS, item, recipeType, recipe);
        this.eatingEffects = effect;
    }

    @Nonnull
    @Override
    public ItemUseHandler getItemHandler() {
        return new ItemUseHandler() {
            @Override
            public void onRightClick(PlayerRightClickEvent e) {
                Player player = e.getPlayer();
                boolean lemonDrop = getId().equals(CultivationStacks.LEMON_DROP.getItemId());
                if (Cooldowns.isOnCooldown(Keys.SATIATED, player) && !lemonDrop) {
                    player.sendMessage(Theme.WARNING.apply(Messages.get(player, "food.not-hungry",
                        "You aren't hungry yet! You can only eat once every half a day (10 minutes).")));
                    return;
                }
                if (!lemonDrop) {
                    Cooldowns.addCooldown(Keys.SATIATED, player, 600);
                } else {
                    PersistentDataAPI.remove(player, Keys.SATIATED);
                }
                e.getItem().setAmount(e.getItem().getAmount() - 1);
                player.sendMessage(Theme.SUCCESS.apply(Messages.get(player, eatingMessage)));
                eatingEffects.accept(player);
            }
        };
    }

    public Food overrideEatingMessage(@Nonnull String key, @Nonnull String english) {
        this.eatingMessage = new Messages.Text(key, english);
        return this;
    }

    public Food buildRegister(@Nonnull SlimefunAddon addon) {
        register(addon);
        return this;
    }
}
