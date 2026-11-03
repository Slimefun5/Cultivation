package dev.sefiraat.cultivation.api.slimefun.items.trees;

import dev.sefiraat.cultivation.Cultivation;
import dev.sefiraat.cultivation.Registry;
import dev.sefiraat.cultivation.api.slimefun.RecipeTypes;
import dev.sefiraat.cultivation.api.slimefun.items.produce.ProduceCore;
import dev.sefiraat.cultivation.api.utils.Skins;
import io.github.thebusybiscuit.slimefun5.api.SlimefunAddon;
import io.github.thebusybiscuit.slimefun5.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun5.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun5.api.items.SlimefunItemStack;
import org.bukkit.Location;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;

public class CultivationTree extends SlimefunItem {
    private final ProduceCore produce;
    private final Skins skin;
    private final CultivationLeaves leaves;
    private final TreeDesign treeDesign;

    public CultivationTree(ItemGroup itemGroup,
                           SlimefunItemStack item,
                           TreeDesign treeDesign,
                           ProduceCore produce,
                           Skins skin
    ) {
        super(itemGroup, item, RecipeTypes.TRADING_FLETCHER, new ItemStack[0]);
        this.treeDesign = treeDesign;
        this.produce = produce;
        this.skin = skin;
        leaves = new CultivationLeaves(this).buildRegister(Cultivation.getInstance());
    }

    public boolean testBuild(@Nonnull Location location) {
        return this.treeDesign.testBuild(location);
    }

    public void grow(@Nonnull Location location) {
        this.treeDesign.grow(location, this);
    }

    public ProduceCore getProduce() {
        return produce;
    }

    public Skins getSkin() {
        return skin;
    }

    public CultivationLeaves getLeaves() {
        return leaves;
    }

    public TreeDesign getTreeDesign() {
        return treeDesign;
    }

    public CultivationTree buildRegister(@Nonnull SlimefunAddon addon) {
        Registry.getInstance().addTree(this);
        register(addon);
        return this;
    }

}
