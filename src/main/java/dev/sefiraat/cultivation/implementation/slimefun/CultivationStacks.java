package dev.sefiraat.cultivation.implementation.slimefun;


import com.google.common.collect.ImmutableList;
import dev.sefiraat.cultivation.api.utils.CultivationThemes;
import dev.sefiraat.cultivation.api.utils.Skins;
import dev.sefiraat.cultivation.libs.sefilib.itemstacks.ItemStackGenerators;
import dev.sefiraat.cultivation.libs.sefilib.string.Theme;
import io.github.thebusybiscuit.slimefun5.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun5.utils.LoreBuilder;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import java.util.List;

public final class CultivationStacks {

    private CultivationStacks() {
        throw new IllegalStateException("Utility class");
    }

    // region Trees

    public static final SlimefunItemStack TREE_BANANA = CultivationThemes.themedSlimefunItemStack(
        "CLT_TREE_BANANA",
        new ItemStack(Material.ACACIA_SAPLING),
        CultivationThemes.SAPLING,
        "Cultivation Tree: Banana",
        ImmutableList.of(
            "A tree that grows fingers, grim!"
        )
    );

    public static final SlimefunItemStack TREE_LEMON = CultivationThemes.themedSlimefunItemStack(
        "CLT_TREE_LEMON",
        new ItemStack(Material.ACACIA_SAPLING),
        CultivationThemes.SAPLING,
        "Cultivation Tree: Lemon",
        ImmutableList.of(
            "Just looking at this tree taste sour."
        )
    );

    public static final SlimefunItemStack TREE_ORANGE = CultivationThemes.themedSlimefunItemStack(
        "CLT_TREE_ORANGE",
        new ItemStack(Material.JUNGLE_SAPLING),
        CultivationThemes.SAPLING,
        "Cultivation Tree: Orange",
        ImmutableList.of(
            "Little orbs of sunshine."
        )
    );

    public static final SlimefunItemStack TREE_GREEN_APPLE = CultivationThemes.themedSlimefunItemStack(
        "CLT_TREE_GREEN_APPLE",
        new ItemStack(Material.BIRCH_SAPLING),
        CultivationThemes.SAPLING,
        "Cultivation Tree: Green Apple",
        ImmutableList.of(
            "Grows large and crisp green apples."
        )
    );

    public static final SlimefunItemStack TREE_PINEAPPLE = CultivationThemes.themedSlimefunItemStack(
        "CLT_TREE_PINEAPPLE",
        new ItemStack(Material.JUNGLE_SAPLING),
        CultivationThemes.SAPLING,
        "Cultivation Tree: Pineapple",
        ImmutableList.of(
            "WHERE IS MY PIZZA?"
        )
    );

    public static final SlimefunItemStack TREE_MANGO = CultivationThemes.themedSlimefunItemStack(
        "CLT_TREE_MANGO",
        new ItemStack(Material.OAK_SAPLING),
        CultivationThemes.SAPLING,
        "Cultivation Tree: Mango",
        ImmutableList.of(
            "Best when at it's ripest."
        )
    );

    public static final SlimefunItemStack TREE_PEACH = CultivationThemes.themedSlimefunItemStack(
        "CLT_TREE_PEACH",
        new ItemStack(Material.BIRCH_SAPLING),
        CultivationThemes.SAPLING,
        "Cultivation Tree: Peach",
        ImmutableList.of(
            "James was looking for this, I think?"
        )
    );

    public static final SlimefunItemStack TREE_APRICOT = CultivationThemes.themedSlimefunItemStack(
        "CLT_TREE_APRICOT",
        new ItemStack(Material.BIRCH_SAPLING),
        CultivationThemes.SAPLING,
        "Cultivation Tree: Apricot",
        ImmutableList.of(
            "Inside is a single pit of despair."
        )
    );

    public static final SlimefunItemStack TREE_PEAR = CultivationThemes.themedSlimefunItemStack(
        "CLT_TREE_PEAR",
        new ItemStack(Material.ACACIA_SAPLING),
        CultivationThemes.SAPLING,
        "Cultivation Tree: Pear",
        ImmutableList.of(
            "A Pair of Pears were paired for parity."
        )
    );

    public static final SlimefunItemStack TREE_CHERRY = CultivationThemes.themedSlimefunItemStack(
        "CLT_TREE_CHERRY",
        new ItemStack(Material.OAK_SAPLING),
        CultivationThemes.SAPLING,
        "Cultivation Tree: Cherry",
        ImmutableList.of(
            "Tie the knot!"
        )
    );

    public static final SlimefunItemStack TREE_KIWI = CultivationThemes.themedSlimefunItemStack(
        "CLT_TREE_KIWI",
        new ItemStack(Material.BIRCH_SAPLING),
        CultivationThemes.SAPLING,
        "Cultivation Tree: Kiwi",
        ImmutableList.of(
            "A New Zealand Tree? Have I got that right?"
        )
    );

    public static final SlimefunItemStack TREE_LIME = CultivationThemes.themedSlimefunItemStack(
        "CLT_TREE_LIME",
        new ItemStack(Material.JUNGLE_SAPLING),
        CultivationThemes.SAPLING,
        "Cultivation Tree: Lime",
        ImmutableList.of(
            "Did you know Limes are just Lemons holding their breath?"
        )
    );

    public static final SlimefunItemStack TREE_CHESTNUT = CultivationThemes.themedSlimefunItemStack(
        "CLT_TREE_CHESTNUT",
        new ItemStack(Material.OAK_SAPLING),
        CultivationThemes.SAPLING,
        "Cultivation Tree: Chestnut",
        ImmutableList.of(
            "A tree clearly designed to be climbed."
        )
    );

    public static final SlimefunItemStack TREE_HAZELNUT = CultivationThemes.themedSlimefunItemStack(
        "CLT_TREE_HAZELNUT",
        new ItemStack(Material.OAK_SAPLING),
        CultivationThemes.SAPLING,
        "Cultivation Tree: Hazelnut",
        ImmutableList.of(
            "Shaking this tree is a childhood past-time."
        )
    );

    public static final SlimefunItemStack TREE_PECAN = CultivationThemes.themedSlimefunItemStack(
        "CLT_TREE_PECAN",
        new ItemStack(Material.BIRCH_SAPLING),
        CultivationThemes.SAPLING,
        "Cultivation Tree: Pecan",
        ImmutableList.of(
            "Can we grow this tree? Yes pe-can!"
        )
    );

    // endregion

    // region Bushes

    public static final SlimefunItemStack BUSH_GRAPE = CultivationThemes.themedSlimefunItemStack(
        "CLT_BUSH_GRAPE",
        Skins.SPIKEY_PURPLE_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "Cultivation Bush: Grape",
        ImmutableList.of(
            "Ripe and juicy grapes that practically fall",
            "off the bush."
        )
    );

    public static final SlimefunItemStack BUSH_PEANUTS = CultivationThemes.themedSlimefunItemStack(
        "CLT_BUSH_PEANUTS",
        Skins.SPIKEY_GREEN_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "Cultivation Bush: Peanuts",
        ImmutableList.of(
            "Solid and fragrant and full of protein."
        )
    );

    public static final SlimefunItemStack BUSH_STRAWBERRY = CultivationThemes.themedSlimefunItemStack(
        "CLT_BUSH_STRAWBERRY",
        Skins.SPIKEY_RED_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "Cultivation Bush: Strawberry",
        ImmutableList.of(
            "Solid and fragrant and full of protein."
        )
    );

    public static final SlimefunItemStack BUSH_RICE = CultivationThemes.themedSlimefunItemStack(
        "CLT_BUSH_RICE",
        Skins.SPIKEY_YELLOW_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "Cultivation Bush: Rice",
        ImmutableList.of(
            "The ultimate staple food."
        )
    );

    public static final SlimefunItemStack BUSH_GARLIC = CultivationThemes.themedSlimefunItemStack(
        "CLT_BUSH_GARLIC",
        Skins.SPIKEY_YELLOW_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "Cultivation Bush: Garlic",
        ImmutableList.of(
            "This bush has simply the worst breath."
        )
    );

    public static final SlimefunItemStack BUSH_CAYENNE_PEPPER = CultivationThemes.themedSlimefunItemStack(
        "CLT_BUSH_CAYENNE_PEPPER",
        Skins.SPIKEY_RED_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "Cultivation Bush: Cayenne Pepper",
        ImmutableList.of(
            "A bush with a peppery attitude."
        )
    );

    public static final SlimefunItemStack BUSH_TOMATO = CultivationThemes.themedSlimefunItemStack(
        "CLT_BUSH_TOMATO",
        Skins.SPIKEY_RED_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "Cultivation Bush: Tomato",
        ImmutableList.of(
            "Ripe and ready."
        )
    );

    public static final SlimefunItemStack BUSH_BELL_PEPPER = CultivationThemes.themedSlimefunItemStack(
        "CLT_BUSH_BELL_PEPPER",
        Skins.SPIKEY_RED_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "Cultivation Bush: Bell Pepper",
        ImmutableList.of(
            "Careful walking by this, you may ring",
            "the bell."
        )
    );

    public static final SlimefunItemStack BUSH_ONION = CultivationThemes.themedSlimefunItemStack(
        "CLT_BUSH_ONION",
        Skins.SPIKEY_YELLOW_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "Cultivation Bush: Onion",
        ImmutableList.of(
            "Does this bush look like it's tearing up?"
        )
    );

    public static final SlimefunItemStack BUSH_PEA = CultivationThemes.themedSlimefunItemStack(
        "CLT_BUSH_PEA",
        Skins.SPIKEY_GREEN_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "Cultivation Bush: Peas",
        ImmutableList.of(
            "I prefer Q's"
        )
    );

    public static final SlimefunItemStack BUSH_RAPESEED = CultivationThemes.themedSlimefunItemStack(
        "CLT_BUSH_RAPESEED",
        Skins.SPIKEY_BLUE_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "Cultivation Bush: Rapeseed",
        ImmutableList.of(
            "This bush is exuding some oily substance."
        )
    );

    public static final SlimefunItemStack BUSH_LETTUCE = CultivationThemes.themedSlimefunItemStack(
        "CLT_BUSH_LETTUCE",
        Skins.SPIKEY_GREEN_4.getPlayerHead(),
        CultivationThemes.BUSH,
        "Cultivation Bush: Lettuce",
        ImmutableList.of(
            "Does lettuce even grow on bushes?",
            "Spoiler: No, it doesn't."
        )
    );

    public static final SlimefunItemStack BUSH_MUSTARD = CultivationThemes.themedSlimefunItemStack(
        "CLT_BUSH_MUSTARD",
        Skins.SPIKEY_YELLOW_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "Cultivation Bush: Mustard Seeds",
        ImmutableList.of(
            "Like fire in your mouth."
        )
    );

    public static final SlimefunItemStack BUSH_BROCCOLI = CultivationThemes.themedSlimefunItemStack(
        "CLT_BUSH_BROCCOLI",
        Skins.SPIKEY_GREEN_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "Cultivation Bush: Broccoli",
        ImmutableList.of(
            "Tiny trees you can eat? Who invented this!?"
        )
    );

    public static final SlimefunItemStack BUSH_CINNAMON = CultivationThemes.themedSlimefunItemStack(
        "CLT_BUSH_CINNAMON",
        Skins.SPIKEY_ORANGE_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "Cultivation Bush: Cinnamon",
        ImmutableList.of(
            "A delightfully fragrant bush."
        )
    );

    public static final SlimefunItemStack BUSH_BASIL = CultivationThemes.themedSlimefunItemStack(
        "CLT_BUSH_BASIL",
        Skins.SPIKEY_GREEN_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "Cultivation Bush: Basil",
        ImmutableList.of(
            "A light hearted bush full of whimsy."
        )
    );

    public static final SlimefunItemStack BUSH_BAY_LEAF = CultivationThemes.themedSlimefunItemStack(
        "CLT_BUSH_BAY_LEAF",
        Skins.SPIKEY_GREEN_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "Cultivation Bush: Bay Leaf",
        ImmutableList.of(
            "The smell of this bush travels for miles."
        )
    );

    public static final SlimefunItemStack BUSH_CILANTRO = CultivationThemes.themedSlimefunItemStack(
        "CLT_BUSH_CILANTRO",
        Skins.SPIKEY_GREEN_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "Cultivation Bush: Cilantro",
        ImmutableList.of(
            "A faint citrus and spice smell comes from this bush."
        )
    );

    public static final SlimefunItemStack BUSH_CHICORY = CultivationThemes.themedSlimefunItemStack(
        "CLT_BUSH_CHICORY",
        Skins.SPIKEY_BLUE_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "Cultivation Bush: Chicory",
        ImmutableList.of(
            "I thought chicory was a root? Does this addon",
            "even do it's research!?"
        )
    );

    public static final SlimefunItemStack BUSH_CHIVES = CultivationThemes.themedSlimefunItemStack(
        "CLT_BUSH_CHIVES",
        Skins.SPIKEY_GREEN_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "Cultivation Bush: Chives",
        ImmutableList.of(
            "A bush that produces what is, effectively, the world's",
            "smallest onion."
        )
    );

    public static final SlimefunItemStack BUSH_CLOVE = CultivationThemes.themedSlimefunItemStack(
        "CLT_BUSH_CLOVE",
        Skins.SPIKEY_GREEN_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "Cultivation Bush: Clove",
        ImmutableList.of(
            "A bush that just reminds me of Christmas."
        )
    );

    public static final SlimefunItemStack BUSH_CUMIN = CultivationThemes.themedSlimefunItemStack(
        "CLT_BUSH_CUMIN",
        Skins.SPIKEY_YELLOW_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "Cultivation Bush: Cumin",
        ImmutableList.of(
            "A bush that lets of a warm citrus aroma."
        )
    );

    public static final SlimefunItemStack BUSH_CHILLI_PEPPER = CultivationThemes.themedSlimefunItemStack(
        "CLT_BUSH_CHILLI_PEPPER",
        Skins.SPIKEY_RED_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "Cultivation Bush: Chilli Pepper",
        ImmutableList.of(
            "Just looking at this bush burns my tongue."
        )
    );

    public static final SlimefunItemStack BUSH_CURRY_LEAF = CultivationThemes.themedSlimefunItemStack(
        "CLT_BUSH_CURRY_LEAF",
        Skins.SPIKEY_RED_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "Cultivation Bush: Curry Leaf",
        ImmutableList.of(
            "Best when dry roasted."
        )
    );

    public static final SlimefunItemStack BUSH_DILL = CultivationThemes.themedSlimefunItemStack(
        "CLT_BUSH_DILL",
        Skins.SPIKEY_GREEN_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "Cultivation Bush: Dill",
        ImmutableList.of(
            "This bush grows much faster than others."
        )
    );

    public static final SlimefunItemStack BUSH_FENNEL = CultivationThemes.themedSlimefunItemStack(
        "CLT_BUSH_FENNEL",
        Skins.SPIKEY_GREEN_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "Cultivation Bush: Fennel",
        ImmutableList.of(
            "Why does this bush repel bugs!?"
        )
    );

    public static final SlimefunItemStack BUSH_GINGER = CultivationThemes.themedSlimefunItemStack(
        "CLT_BUSH_GINGER",
        Skins.SPIKEY_YELLOW_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "Cultivation Bush: Ginger",
        ImmutableList.of(
            "This bush is nice when boiled whole."
        )
    );

    public static final SlimefunItemStack BUSH_HORSERADISH = CultivationThemes.themedSlimefunItemStack(
        "CLT_BUSH_HORSERADISH",
        Skins.SPIKEY_YELLOW_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "Cultivation Bush: Horseradish",
        ImmutableList.of(
            "Again, this growing on a bush just doesn't make sense."
        )
    );

    public static final SlimefunItemStack BUSH_JASMINE = CultivationThemes.themedSlimefunItemStack(
        "CLT_BUSH_JASMINE",
        Skins.SPIKEY_YELLOW_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "Cultivation Bush: Jasmine",
        ImmutableList.of(
            "The scent from this bush is so soft and mellow."
        )
    );

    public static final SlimefunItemStack BUSH_JUNIPER_BERRY = CultivationThemes.themedSlimefunItemStack(
        "CLT_BUSH_JUNIPER_BERRY",
        Skins.SPIKEY_BLUE_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "Cultivation Bush: Juniper Berry",
        ImmutableList.of(
            "So sweet on the bush, peppery when dried."
        )
    );

    public static final SlimefunItemStack BUSH_KAFFIR_LIME = CultivationThemes.themedSlimefunItemStack(
        "CLT_BUSH_KAFFIR_LIME",
        Skins.SPIKEY_GREEN_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "Cultivation Bush: Kaffir Lime",
        ImmutableList.of(
            "A bush whose leafs are more wanted than it's fruit."
        )
    );

    public static final SlimefunItemStack BUSH_LAVENDER = CultivationThemes.themedSlimefunItemStack(
        "CLT_BUSH_LAVENDER",
        Skins.SPIKEY_PURPLE_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "Cultivation Bush: Lavender",
        ImmutableList.of(
            "This bush wafts it's smell everywhere."
        )
    );

    public static final SlimefunItemStack BUSH_LICORICE = CultivationThemes.themedSlimefunItemStack(
        "CLT_BUSH_LICORICE",
        Skins.SPIKEY_YELLOW_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "Cultivation Bush: Licorice",
        ImmutableList.of(
            "Gross"
        )
    );

    public static final SlimefunItemStack BUSH_MACE = CultivationThemes.themedSlimefunItemStack(
        "CLT_BUSH_MACE",
        Skins.SPIKEY_PURPLE_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "Cultivation Bush: Mace",
        ImmutableList.of(
            "This bush seems to be repelling attackers?"
        )
    );

    public static final SlimefunItemStack BUSH_MARJORAM = CultivationThemes.themedSlimefunItemStack(
        "CLT_BUSH_MARJORAM",
        Skins.SPIKEY_YELLOW_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "Cultivation Bush: Marjoram",
        ImmutableList.of(
            "A large woody smelling bush."
        )
    );

    public static final SlimefunItemStack BUSH_MINT = CultivationThemes.themedSlimefunItemStack(
        "CLT_BUSH_MINT",
        Skins.SPIKEY_GREEN_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "Cultivation Bush: Mint",
        ImmutableList.of(
            "Simply the best smelling bush."
        )
    );

    public static final SlimefunItemStack BUSH_OREGANO = CultivationThemes.themedSlimefunItemStack(
        "CLT_BUSH_OREGANO",
        Skins.SPIKEY_GREEN_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "Cultivation Bush: Oregano",
        ImmutableList.of(
            "This pungent smelling bush deters visitors."
        )
    );

    public static final SlimefunItemStack BUSH_PARSLEY = CultivationThemes.themedSlimefunItemStack(
        "CLT_BUSH_PARSLEY",
        Skins.SPIKEY_GREEN_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "Cultivation Bush: Parsley",
        ImmutableList.of(
            "Throw this bush in lava, now :D"
        )
    );

    public static final SlimefunItemStack BUSH_ROSEMARY = CultivationThemes.themedSlimefunItemStack(
        "CLT_BUSH_ROSEMARY",
        Skins.SPIKEY_GREEN_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "Cultivation Bush: Rosemary",
        ImmutableList.of(
            "A bush whose smell reminds people of sunday lunches."
        )
    );

    public static final SlimefunItemStack BUSH_SASSAFRAS = CultivationThemes.themedSlimefunItemStack(
        "CLT_BUSH_SASSAFRAS",
        Skins.SPIKEY_GREEN_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "Cultivation Bush: Sassafras",
        ImmutableList.of(
            "This bush love to be planted near small bodies",
            "of water."
        )
    );

    public static final SlimefunItemStack BUSH_SHISO = CultivationThemes.themedSlimefunItemStack(
        "CLT_BUSH_SHISO",
        Skins.SPIKEY_PURPLE_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "Cultivation Bush: Shiso",
        ImmutableList.of(
            "I like to think this bush is the love child",
            "of a mint bush and a basil bush. Too bad",
            "bush breeding isn't a thing!"
        )
    );

    public static final SlimefunItemStack BUSH_STAR_ANISE = CultivationThemes.themedSlimefunItemStack(
        "CLT_BUSH_STAR_ANISE",
        Skins.SPIKEY_ORANGE_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "Cultivation Bush: Star Anise",
        ImmutableList.of(
            "A small comes off this bush that is so unique",
            "to anise, you can't even believe."
        )
    );

    public static final SlimefunItemStack BUSH_TARRAGON = CultivationThemes.themedSlimefunItemStack(
        "CLT_BUSH_TARRAGON",
        Skins.SPIKEY_GREEN_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "Cultivation Bush: Tarragon",
        ImmutableList.of(
            "This bush doesn't like to draw too much attention."
        )
    );

    public static final SlimefunItemStack BUSH_THYME = CultivationThemes.themedSlimefunItemStack(
        "CLT_BUSH_THYME",
        Skins.SPIKEY_GREEN_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "Cultivation Bush: Thyme",
        ImmutableList.of(
            "This bush is always running out of... Thyme... *cough*"
        )
    );

    public static final SlimefunItemStack BUSH_TURMERIC = CultivationThemes.themedSlimefunItemStack(
        "CLT_BUSH_TURMERIC",
        Skins.SPIKEY_YELLOW_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "Cultivation Bush: Turmeric",
        ImmutableList.of(
            "A waft of spice hits your nose just",
            "holding this bush."
        )
    );

    public static final SlimefunItemStack BUSH_VANILLA = CultivationThemes.themedSlimefunItemStack(
        "CLT_BUSH_VANILLA",
        Skins.SPIKEY_YELLOW_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "Cultivation Bush: Vanilla",
        ImmutableList.of(
            "This bush grows natively near StarBucks locations."
        )
    );

    public static final SlimefunItemStack BUSH_WASABI = CultivationThemes.themedSlimefunItemStack(
        "CLT_BUSH_WASABI",
        Skins.SPIKEY_GREEN_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "Cultivation Bush: Wasabi",
        ImmutableList.of(
            "Another root growing off of a bush?",
            "Sigh..."
        )
    );

    public static final SlimefunItemStack BUSH_ARTICHOKE = CultivationThemes.themedSlimefunItemStack(
        "CLT_BUSH_ARTICHOKE",
        Skins.SPIKEY_YELLOW_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "Cultivation Bush: Artichoke",
        ImmutableList.of(
            "By far the best bush to strangle an",
            "artist with. Sigh. Puns be hard."
        )
    );

    public static final SlimefunItemStack BUSH_AUBERGINE = CultivationThemes.themedSlimefunItemStack(
        "CLT_BUSH_AUBERGINE",
        Skins.SPIKEY_PURPLE_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "Cultivation Bush: Aubergine",
        ImmutableList.of(
            "I refuse to use the word eggplant. I just do."
        )
    );

    public static final SlimefunItemStack BUSH_ASPARAGUS = CultivationThemes.themedSlimefunItemStack(
        "CLT_BUSH_ASPARAGUS",
        Skins.SPIKEY_GREEN_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "Cultivation Bush: Asparagus",
        ImmutableList.of(
            "This asparagus bush makes a good",
            "stalker!"
        )
    );

    public static final SlimefunItemStack BUSH_BRUSSELS_SPROUTS = CultivationThemes.themedSlimefunItemStack(
        "CLT_BUSH_BRUSSELS_SPROUTS",
        Skins.SPIKEY_GREEN_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "Cultivation Bush: Brussels Sprouts",
        ImmutableList.of(
            "A bush that can sometimes produce noxious",
            "gas."
        )
    );

    public static final SlimefunItemStack BUSH_CABBAGE = CultivationThemes.themedSlimefunItemStack(
        "CLT_BUSH_CABBAGE",
        Skins.SPIKEY_PURPLE_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "Cultivation Bush: Cabbage",
        ImmutableList.of(
            "A bush that comes with a large amount of",
            "emotional cabbage."
        )
    );

    public static final SlimefunItemStack BUSH_CAULIFLOWER = CultivationThemes.themedSlimefunItemStack(
        "CLT_BUSH_CAULIFLOWER",
        Skins.SPIKEY_YELLOW_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "Cultivation Bush: Cauliflower",
        ImmutableList.of(
            "A bush capable of producing little clouds",
            "of delight."
        )
    );

    public static final SlimefunItemStack BUSH_CELERY = CultivationThemes.themedSlimefunItemStack(
        "CLT_BUSH_CELERY",
        Skins.SPIKEY_GREEN_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "Cultivation Bush: Celery",
        ImmutableList.of(
            "This bush is redundant.",
            "Sefi doesn't like Celery."
        )
    );

    public static final SlimefunItemStack BUSH_KALE = CultivationThemes.themedSlimefunItemStack(
        "CLT_BUSH_KALE",
        Skins.SPIKEY_GREEN_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "Cultivation Bush: Kale",
        ImmutableList.of(
            "When you plant this bush, you get the feeling",
            "that everything is going to be o-kale."
        )
    );

    public static final SlimefunItemStack BUSH_SPINACH = CultivationThemes.themedSlimefunItemStack(
        "CLT_BUSH_SPINACH",
        Skins.SPIKEY_GREEN_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "Cultivation Bush: Spinach",
        ImmutableList.of(
            "This bush is Popeye's best friend."
        )
    );

    public static final SlimefunItemStack BUSH_BLACK_BEANS = CultivationThemes.themedSlimefunItemStack(
        "CLT_BUSH_BLACK_BEANS",
        Skins.SPIKEY_PURPLE_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "Cultivation Bush: Black Beans",
        ImmutableList.of(
            "This bush gently whispers to you:",
            "You are a great human bean."
        )
    );

    public static final SlimefunItemStack BUSH_GREEN_BEANS = CultivationThemes.themedSlimefunItemStack(
        "CLT_BUSH_GREEN_BEANS",
        Skins.SPIKEY_GREEN_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "Cultivation Bush: Green Beans",
        ImmutableList.of(
            "Throw tomato sauce over this bush to make",
            "baked beans."
        )
    );

    public static final SlimefunItemStack BUSH_CHICKPEAS = CultivationThemes.themedSlimefunItemStack(
        "CLT_BUSH_CHICKPEAS",
        Skins.SPIKEY_ORANGE_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "Cultivation Bush: Chickpeas",
        ImmutableList.of(
            "A bush made by breeding a chicken with",
            "a pea. SCIENCE."
        )
    );

    public static final SlimefunItemStack BUSH_SOY_BEANS = CultivationThemes.themedSlimefunItemStack(
        "CLT_BUSH_SOY_BEANS",
        Skins.SPIKEY_YELLOW_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "Cultivation Bush: Soy Beans",
        ImmutableList.of(
            "This bush is a friendly delight. It makes",
            "me soy happy."
        )
    );

    public static final SlimefunItemStack BUSH_PINTO_BEANS = CultivationThemes.themedSlimefunItemStack(
        "CLT_BUSH_PINTO_BEANS",
        Skins.SPIKEY_PURPLE_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "Cultivation Bush: Pinto Beans",
        ImmutableList.of(
            "It wont be long until we successfully breed",
            "a direct-burrito bush, right?"
        )
    );

    public static final SlimefunItemStack BUSH_RUNNER_BEANS = CultivationThemes.themedSlimefunItemStack(
        "CLT_BUSH_RUNNER_BEANS",
        Skins.SPIKEY_GREEN_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "Cultivation Bush: Runner Beans",
        ImmutableList.of(
            "This bush has feet o.o?"
        )
    );

    public static final SlimefunItemStack BUSH_NETTLES = CultivationThemes.themedSlimefunItemStack(
        "CLT_BUSH_NETTLES",
        Skins.SPIKEY_GREEN_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "Cultivation Bush: Nettles",
        ImmutableList.of(
            "Be careful when walking through this bush!"
        )
    );

    public static final SlimefunItemStack BUSH_OKRA = CultivationThemes.themedSlimefunItemStack(
        "CLT_BUSH_OKRA",
        Skins.SPIKEY_PURPLE_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "Cultivation Bush: Okra",
        ImmutableList.of(
            "Voted the number 1 vegetable according to",
            "Okra Winfrey's Vegetable Club."
        )
    );

    public static final SlimefunItemStack BUSH_LEEK = CultivationThemes.themedSlimefunItemStack(
        "CLT_BUSH_LEEK",
        Skins.SPIKEY_GREEN_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "Cultivation Bush: Leek",
        ImmutableList.of(
            "Did you know a leek is just an onion that",
            "wears a corset? True story."
        )
    );

    public static final SlimefunItemStack BUSH_SHALLOT = CultivationThemes.themedSlimefunItemStack(
        "CLT_BUSH_SHALLOT",
        Skins.SPIKEY_PURPLE_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "Cultivation Bush: Shallot",
        ImmutableList.of(
            "This bush rapidly produces lovely mini onions.",
            "Luckily you don't need a shallot."
        )
    );

    public static final SlimefunItemStack BUSH_JALAPENO = CultivationThemes.themedSlimefunItemStack(
        "CLT_BUSH_JALAPENO",
        Skins.SPIKEY_RED_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "Cultivation Bush: Jalapeno",
        ImmutableList.of(
            "Just holding this bush gives you a",
            "1% change to set ablaze."
        )
    );

    public static final SlimefunItemStack BUSH_RADICCHIO = CultivationThemes.themedSlimefunItemStack(
        "CLT_BUSH_RADICCHIO",
        Skins.SPIKEY_PURPLE_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "Cultivation Bush: Radicchio",
        ImmutableList.of(
            "Want to sound fancy? But Radicchio into any",
            "meal - it's basically like cabbage but",
            "makes you seem refined."
        )
    );

    public static final SlimefunItemStack BUSH_RHUBARB = CultivationThemes.themedSlimefunItemStack(
        "CLT_BUSH_RHUBARB",
        Skins.SPIKEY_PURPLE_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "Cultivation Bush: Rhubarb",
        ImmutableList.of(
            "Did you know rhubarb was a vegetable?",
            "I thought it was a type of hammer."
        )
    );

    public static final SlimefunItemStack BUSH_CELERIAC = CultivationThemes.themedSlimefunItemStack(
        "CLT_BUSH_CELERIAC",
        Skins.SPIKEY_ORANGE_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "Cultivation Bush: Celeriac",
        ImmutableList.of(
            "Yet another root growing off of a bush?",
            "SefiDumb™"
        )
    );

    public static final SlimefunItemStack BUSH_PARSNIP = CultivationThemes.themedSlimefunItemStack(
        "CLT_BUSH_PARSNIP",
        Skins.SPIKEY_YELLOW_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "Cultivation Bush: Parsnip",
        ImmutableList.of(
            "Just skip the middleman and roast the bush",
            "directly."
        )
    );

    public static final SlimefunItemStack BUSH_RUTABAGA = CultivationThemes.themedSlimefunItemStack(
        "CLT_BUSH_RUTABAGA",
        Skins.SPIKEY_PURPLE_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "Cultivation Bush: Rutabaga",
        ImmutableList.of(
            "Swede. Its a swede."
        )
    );

    public static final SlimefunItemStack BUSH_RADDISH = CultivationThemes.themedSlimefunItemStack(
        "CLT_BUSH_RADDISH",
        Skins.SPIKEY_RED_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "Cultivation Bush: Raddish",
        ImmutableList.of(
            "This plant just did a skateboarding trick.",
            "Totally Rad...ish."
        )
    );

    public static final SlimefunItemStack BUSH_SWEET_POTATO = CultivationThemes.themedSlimefunItemStack(
        "CLT_BUSH_SWEET_POTATO",
        Skins.SPIKEY_PURPLE_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "Cultivation Bush: Sweet Potato",
        ImmutableList.of(
            "This bush is just so sweet. I heard it",
            "complimenting you while you weren't listening."
        )
    );

    public static final SlimefunItemStack BUSH_TURNIP = CultivationThemes.themedSlimefunItemStack(
        "CLT_BUSH_TURNIP",
        Skins.SPIKEY_ORANGE_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "Cultivation Bush: Turnip",
        ImmutableList.of(
            "According to the British Government",
            "this bush will solve all our problems."
        )
    );

    public static final SlimefunItemStack BUSH_SWEETCORN = CultivationThemes.themedSlimefunItemStack(
        "CLT_BUSH_SWEETCORN",
        Skins.SPIKEY_YELLOW_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "Cultivation Bush: Sweetcorn",
        ImmutableList.of(
            "This bush is just crying out to be built into",
            "a maze."
        )
    );

    public static final SlimefunItemStack BUSH_COURGETTE = CultivationThemes.themedSlimefunItemStack(
        "CLT_BUSH_COURGETTE",
        Skins.SPIKEY_GREEN_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "Cultivation Bush: Courgette",
        ImmutableList.of(
            "Why does this bush just keep shouting the",
            "word Zucchini? I guess it must be american?"
        )
    );

    public static final SlimefunItemStack BUSH_CUCUMBER = CultivationThemes.themedSlimefunItemStack(
        "CLT_BUSH_CUCUMBER",
        Skins.SPIKEY_GREEN_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "Cultivation Bush: Cucumber",
        ImmutableList.of(
            "This bush was designed solely for the purposes",
            "of your lovely summer salads."
        )
    );

    public static final SlimefunItemStack BUSH_MARROW = CultivationThemes.themedSlimefunItemStack(
        "CLT_BUSH_MARROW",
        Skins.SPIKEY_GREEN_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "Cultivation Bush: Marrow",
        ImmutableList.of(
            "I'm surprised this bush can hold it's",
            "own weight."
        )
    );

    public static final SlimefunItemStack BUSH_AVOCADO = CultivationThemes.themedSlimefunItemStack(
        "CLT_BUSH_AVOCADO",
        Skins.SPIKEY_GREEN_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "Cultivation Bush: Avocado",
        ImmutableList.of(
            "This bush has been bred specifically to not",
            "use too much water."
        )
    );

    public static final SlimefunItemStack BUSH_GREEN_ONION = CultivationThemes.themedSlimefunItemStack(
        "CLT_BUSH_GREEN_ONION",
        Skins.SPIKEY_GREEN_4.getPlayerHead(),
        CultivationThemes.BUSH,
        "Cultivation Bush: Green Onion",
        ImmutableList.of(
            "Also known as Scallions.",
            "Green Onions generally have a",
            "milder taste than most onions."
        )
    );

    public static final SlimefunItemStack BUSH_BLACK_PEPPER = CultivationThemes.themedSlimefunItemStack(
        "CLT_BUSH_PEPPER",
        Skins.SPIKEY_PURPLE_5.getPlayerHead(),
        CultivationThemes.BUSH,
        "Cultivation Bush: Black Pepper",
        ImmutableList.of(
            "Black Pepper was an important part of the",
            "spice trade between India and Europe",
            "as early as Greek and Roman times."
        )
    );

    // endregion

    // region Plants

    public static final SlimefunItemStack PLANT_DARKNESS = CultivationThemes.themedSlimefunItemStack(
        "CLT_PLANT_DARKNESS",
        Skins.SEED_RED.getPlayerHead(),
        CultivationThemes.PLANT,
        "Primal Plant: Darkness",
        ImmutableList.of(
            "A plant that seethes in unbridled",
            "rage.",
            "",
            Theme.WARNING.apply("Primal plants dont produce items"),
            Theme.WARNING.apply("and are just for breeding.")
        )
    );

    public static final SlimefunItemStack PLANT_LIGHT = CultivationThemes.themedSlimefunItemStack(
        "CLT_PLANT_LIGHT",
        Skins.SEED_YELLOW.getPlayerHead(),
        CultivationThemes.PLANT,
        "Primal Plant: Light",
        ImmutableList.of(
            "A plant that exudes an aura",
            "of pure love.",
            "",
            Theme.WARNING.apply("Primal plants dont produce items"),
            Theme.WARNING.apply("and are just for breeding.")
        )
    );

    public static final SlimefunItemStack PLANT_EARTH = CultivationThemes.themedSlimefunItemStack(
        "CLT_PLANT_EARTH",
        Skins.SEED_GREEN.getPlayerHead(),
        CultivationThemes.PLANT,
        "Primal Plant: Earth",
        ImmutableList.of(
            "A plant that enriches the world",
            "surrounding it.",
            "",
            Theme.WARNING.apply("Primal plants dont produce items"),
            Theme.WARNING.apply("and are just for breeding.")
        )
    );

    public static final SlimefunItemStack PLANT_WATER = CultivationThemes.themedSlimefunItemStack(
        "CLT_PLANT_WATER",
        Skins.SEED_BLUE.getPlayerHead(),
        CultivationThemes.PLANT,
        "Primal Plant: Water",
        ImmutableList.of(
            "A plant that nurtures and provides",
            "life to the surrounding area.",
            "",
            Theme.WARNING.apply("Primal plants dont produce items"),
            Theme.WARNING.apply("and are just for breeding.")
        )
    );

    public static final SlimefunItemStack PLANT_FIRE = CultivationThemes.themedSlimefunItemStack(
        "CLT_PLANT_FIRE",
        Skins.SEED_RED.getPlayerHead(),
        CultivationThemes.PLANT,
        "Primal Plant: Fire",
        ImmutableList.of(
            "A plant that both provides the",
            "sources of destruction as well as",
            "rebirth.",
            "",
            Theme.WARNING.apply("Primal plants dont produce items"),
            Theme.WARNING.apply("and are just for breeding.")
        )
    );

    public static final SlimefunItemStack PLANT_AIR = CultivationThemes.themedSlimefunItemStack(
        "CLT_PLANT_AIR",
        Skins.SEED_CYAN.getPlayerHead(),
        CultivationThemes.PLANT,
        "Primal Plant: Air",
        ImmutableList.of(
            "A plant that quietly hums with",
            "the melody of the surrounding nature.",
            "",
            Theme.WARNING.apply("Primal plants dont produce items"),
            Theme.WARNING.apply("and are just for breeding.")
        )
    );

    public static final SlimefunItemStack PLANT_POWER = CultivationThemes.themedSlimefunItemStack(
        "CLT_PLANT_POWER",
        Skins.SEED_RED.getPlayerHead(),
        CultivationThemes.PLANT,
        "Primal Plant: Power",
        ImmutableList.of(
            "A plant that positively exudes power.",
            "",
            Theme.WARNING.apply("Primal plants dont produce items"),
            Theme.WARNING.apply("and are just for breeding.")
        )
    );

    public static final SlimefunItemStack PLANT_WEALTH = CultivationThemes.themedSlimefunItemStack(
        "CLT_PLANT_WEALTH",
        Skins.SEED_ORANGE.getPlayerHead(),
        CultivationThemes.PLANT,
        "Primal Plant: Wealth",
        ImmutableList.of(
            "A plant that just screams exuberant wealth.",
            "",
            Theme.WARNING.apply("Primal plants dont produce items"),
            Theme.WARNING.apply("and are just for breeding.")
        )
    );

    public static final SlimefunItemStack PLANT_SPECTRUM = CultivationThemes.themedSlimefunItemStack(
        "CLT_PLANT_SPECTRUM",
        Skins.SEED_BLUE.getPlayerHead(),
        CultivationThemes.PLANT,
        "Primal Plant: Spectrum",
        ImmutableList.of(
            "A plant that slightly shifts it's color.",
            "",
            Theme.WARNING.apply("Primal plants dont produce items"),
            Theme.WARNING.apply("and are just for breeding.")
        )
    );

    public static final SlimefunItemStack PLANT_DIRT = CultivationThemes.themedSlimefunItemStack(
        "CLT_PLANT_DIRT",
        Skins.SEED_PURPLE.getPlayerHead(),
        CultivationThemes.PLANT,
        "Cultivation Plant: Dirt",
        ImmutableList.of(
            "Dirty on the surface but holding the",
            "building blocks for life itself."
        )
    );

    public static final SlimefunItemStack PLANT_GRASS = CultivationThemes.themedSlimefunItemStack(
        "CLT_PLANT_GRASS",
        Skins.SEED_GREEN.getPlayerHead(),
        CultivationThemes.PLANT,
        "Cultivation Plant: Grass",
        ImmutableList.of(
            "The burgeoning life bound fourth",
            "from the ground."
        )
    );

    public static final SlimefunItemStack PLANT_FLOWER = CultivationThemes.themedSlimefunItemStack(
        "CLT_PLANT_FLOWER",
        Skins.SEED_ORANGE.getPlayerHead(),
        CultivationThemes.PLANT,
        "Cultivation Plant: Flowering",
        ImmutableList.of(
            "A beautiful cornucopia presented well."
        )
    );

    public static final SlimefunItemStack PLANT_VINE = CultivationThemes.themedSlimefunItemStack(
        "CLT_PLANT_VINE",
        Skins.SEED_GREEN.getPlayerHead(),
        CultivationThemes.PLANT,
        "Cultivation Plant: Vine",
        ImmutableList.of(
            "A plant that instantly tangles itself",
            "up."
        )
    );

    public static final SlimefunItemStack PLANT_SAND = CultivationThemes.themedSlimefunItemStack(
        "CLT_PLANT_SAND",
        Skins.SEED_YELLOW.getPlayerHead(),
        CultivationThemes.PLANT,
        "Cultivation Plant: Sand",
        ImmutableList.of(
            "This plant can sometimes crumble apart",
            "at a single touch."
        )
    );

    public static final SlimefunItemStack PLANT_RED_SAND = CultivationThemes.themedSlimefunItemStack(
        "CLT_PLANT_RED_SAND",
        Skins.SEED_RED.getPlayerHead(),
        CultivationThemes.PLANT,
        "Cultivation Plant: Red Sand",
        ImmutableList.of(
            "This plant can sometimes crumble apart",
            "at a single touch - but... red-er."
        )
    );

    public static final SlimefunItemStack PLANT_MOSS = CultivationThemes.themedSlimefunItemStack(
        "CLT_PLANT_MOSS",
        Skins.SEED_GREEN.getPlayerHead(),
        CultivationThemes.PLANT,
        "Cultivation Plant: Moss",
        ImmutableList.of(
            "This plant tends to spread uncontrollably."
        )
    );

    public static final SlimefunItemStack PLANT_SAPLING = CultivationThemes.themedSlimefunItemStack(
        "CLT_PLANT_SAPLING",
        Skins.SEED_GREEN.getPlayerHead(),
        CultivationThemes.PLANT,
        "Cultivation Plant: Sapling",
        ImmutableList.of(
            "This plant doesn't even make sense..."
        )
    );

    public static final SlimefunItemStack PLANT_MUSHROOM = CultivationThemes.themedSlimefunItemStack(
        "CLT_PLANT_MUSHROOM",
        Skins.SEED_RED.getPlayerHead(),
        CultivationThemes.PLANT,
        "Cultivation Plant: Mushroom",
        ImmutableList.of(
            "Yup, a plant that makes mushrooms.",
            "Everything is totally normal over here."
        )
    );

    public static final SlimefunItemStack PLANT_WITHER_ROSE = CultivationThemes.themedSlimefunItemStack(
        "CLT_PLANT_WITHER_ROSE",
        Skins.SEED_RED.getPlayerHead(),
        CultivationThemes.PLANT,
        "Cultivation Plant: Wither Rose",
        ImmutableList.of(
            "This plant, somehow, pulsates a harmful",
            "aura around itself."
        )
    );

    public static final SlimefunItemStack PLANT_DARK_FLORA = CultivationThemes.themedSlimefunItemStack(
        "CLT_PLANT_DARK_FLORA",
        Skins.SEED_PURPLE.getPlayerHead(),
        CultivationThemes.PLANT,
        "Cultivation Plant: Dark Flora",
        ImmutableList.of(
            "A silent evil sits within this simple seed."
        )
    );

    public static final SlimefunItemStack PLANT_GLOWING_VINE = CultivationThemes.themedSlimefunItemStack(
        "CLT_PLANT_GLOWING_VINE",
        Skins.SEED_YELLOW.getPlayerHead(),
        CultivationThemes.PLANT,
        "Cultivation Plant: Glowing Vine",
        ImmutableList.of(
            "A faint light emits from within this seed."
        )
    );

    public static final SlimefunItemStack PLANT_DIM_LIT = CultivationThemes.themedSlimefunItemStack(
        "CLT_PLANT_DIM_LIT",
        Skins.SEED_BLUE.getPlayerHead(),
        CultivationThemes.PLANT,
        "Cultivation Plant: Dim Lit",
        ImmutableList.of(
            "A very dim light emits from within this seed."
        )
    );

    public static final SlimefunItemStack PLANT_COW = CultivationThemes.themedSlimefunItemStack(
        "CLT_PLANT_COW",
        Skins.SEED_PURPLE.getPlayerHead(),
        CultivationThemes.PLANT,
        "Cultivation Plant: Cow",
        ImmutableList.of(
            "If you hold this seed up to your ear",
            "and listen very carefully, you can hear",
            "an occasional mooing."
        )
    );

    public static final SlimefunItemStack PLANT_CHICKEN = CultivationThemes.themedSlimefunItemStack(
        "CLT_PLANT_CHICKEN",
        Skins.SEED_CYAN.getPlayerHead(),
        CultivationThemes.PLANT,
        "Cultivation Plant: Chicken",
        ImmutableList.of(
            "Rumour says that if you hold this",
            "seed above your head and jump from a",
            "high place, you will glide rather than",
            "fall."
        )
    );

    public static final SlimefunItemStack PLANT_FISH = CultivationThemes.themedSlimefunItemStack(
        "CLT_PLANT_FISH",
        Skins.SEED_BLUE.getPlayerHead(),
        CultivationThemes.PLANT,
        "Cultivation Plant: Fish",
        ImmutableList.of(
            "A ripe smell emanates from this seed."
        )
    );

    public static final SlimefunItemStack PLANT_TURTLE = CultivationThemes.themedSlimefunItemStack(
        "CLT_PLANT_TURTLE",
        Skins.SEED_GREEN.getPlayerHead(),
        CultivationThemes.PLANT,
        "Cultivation Plant: Turtle",
        ImmutableList.of(
            "A seed surrounded by a rock hard shell."
        )
    );

    public static final SlimefunItemStack PLANT_VILLAGER = CultivationThemes.themedSlimefunItemStack(
        "CLT_PLANT_VILLAGER",
        Skins.SEED_YELLOW.getPlayerHead(),
        CultivationThemes.PLANT,
        "Cultivation Plant: Villager",
        ImmutableList.of(
            "Yup, we condensed the essence of a villager",
            "into a plant. Apparently it hurt a lot."
        )
    );

    public static final SlimefunItemStack PLANT_RABBIT = CultivationThemes.themedSlimefunItemStack(
        "CLT_PLANT_RABBIT",
        Skins.SEED_ORANGE.getPlayerHead(),
        CultivationThemes.PLANT,
        "Cultivation Plant: Rabbit",
        ImmutableList.of(
            "Bugs would be proud."
        )
    );

    public static final SlimefunItemStack PLANT_SHEEP = CultivationThemes.themedSlimefunItemStack(
        "CLT_PLANT_SHEEP",
        Skins.SEED_YELLOW.getPlayerHead(),
        CultivationThemes.PLANT,
        "Cultivation Plant: Sheep",
        ImmutableList.of(
            "A plant with a coarse woolly texture."
        )
    );

    public static final SlimefunItemStack PLANT_PIG = CultivationThemes.themedSlimefunItemStack(
        "CLT_PLANT_PIG",
        Skins.SEED_RED.getPlayerHead(),
        CultivationThemes.PLANT,
        "Cultivation Plant: Pig",
        ImmutableList.of(
            "A plant that snorts randomly."
        )
    );

    public static final SlimefunItemStack PLANT_BEE = CultivationThemes.themedSlimefunItemStack(
        "CLT_PLANT_BEE",
        Skins.SEED_YELLOW.getPlayerHead(),
        CultivationThemes.PLANT,
        "Cultivation Plant: Bee",
        ImmutableList.of(
            "A plant with a very small, delicate, set of wings."
        )
    );

    public static final SlimefunItemStack PLANT_SQUID = CultivationThemes.themedSlimefunItemStack(
        "CLT_PLANT_SQUID",
        Skins.SEED_PURPLE.getPlayerHead(),
        CultivationThemes.PLANT,
        "Cultivation Plant: Squid",
        ImmutableList.of(
            "Be careful, just touching this plant",
            "has the chance to explode ink all over",
            "the place."
        )
    );

    public static final SlimefunItemStack PLANT_GLOW_SQUID = CultivationThemes.themedSlimefunItemStack(
        "CLT_PLANT_GLOW_SQUID",
        Skins.SEED_GREEN.getPlayerHead(),
        CultivationThemes.PLANT,
        "Cultivation Plant: Glow Squid",
        ImmutableList.of(
            "A glittering plant with a faint glow."
        )
    );

    public static final SlimefunItemStack PLANT_FROG = CultivationThemes.themedSlimefunItemStack(
        "CLT_PLANT_FROG",
        Skins.SEED_GREEN.getPlayerHead(),
        CultivationThemes.PLANT,
        "Cultivation Plant: Frog",
        ImmutableList.of(
            "Ribbit!"
        )
    );

    public static final SlimefunItemStack PLANT_GOAT = CultivationThemes.themedSlimefunItemStack(
        "CLT_PLANT_GOAT",
        Skins.SEED_ORANGE.getPlayerHead(),
        CultivationThemes.PLANT,
        "Cultivation Plant: Goat",
        ImmutableList.of(
            "A randomly violent plant that loves",
            "to jump around."
        )
    );

    public static final SlimefunItemStack PLANT_RAINBOW = CultivationThemes.themedSlimefunItemStack(
        "CLT_PLANT_RAINBOW",
        Skins.SEED_BLUE.getPlayerHead(),
        CultivationThemes.PLANT,
        "Cultivation Plant: Rainbow",
        ImmutableList.of(
            "There may or may not be a pot of gold",
            "at the end of this plant."
        )
    );

    public static final SlimefunItemStack PLANT_WAXY = CultivationThemes.themedSlimefunItemStack(
        "CLT_PLANT_WAXY",
        Skins.SEED_YELLOW.getPlayerHead(),
        CultivationThemes.PLANT,
        "Cultivation Plant: Waxy",
        ImmutableList.of(
            "The sap from this plant forms into",
            "perfect candle shaped wax."
        )
    );

    public static final SlimefunItemStack PLANT_WOOLLY = CultivationThemes.themedSlimefunItemStack(
        "CLT_PLANT_WOOLLY",
        Skins.SEED_PURPLE.getPlayerHead(),
        CultivationThemes.PLANT,
        "Cultivation Plant: Woolly",
        ImmutableList.of(
            "A woolly plant, from root to petals!."
        )
    );

    public static final SlimefunItemStack PLANT_TERRA = CultivationThemes.themedSlimefunItemStack(
        "CLT_PLANT_TERRA",
        Skins.SEED_PURPLE.getPlayerHead(),
        CultivationThemes.PLANT,
        "Cultivation Plant: Terra",
        ImmutableList.of(
            "A hard earthy plant that cracks under pressure."
        )
    );

    public static final SlimefunItemStack PLANT_GLAZED = CultivationThemes.themedSlimefunItemStack(
        "CLT_PLANT_GLAZED",
        Skins.SEED_ORANGE.getPlayerHead(),
        CultivationThemes.PLANT,
        "Cultivation Plant: Glazed",
        ImmutableList.of(
            "A plant that grows with an intricate design."
        )
    );

    public static final SlimefunItemStack PLANT_DUSTY = CultivationThemes.themedSlimefunItemStack(
        "CLT_PLANT_DUSTY",
        Skins.SEED_YELLOW.getPlayerHead(),
        CultivationThemes.PLANT,
        "Cultivation Plant: Dusty",
        ImmutableList.of(
            "This plant needs special care, the slightest",
            "strong breeze can be enough to make it fall",
            "apart."
        )
    );

    public static final SlimefunItemStack PLANT_CONCRETE = CultivationThemes.themedSlimefunItemStack(
        "CLT_PLANT_CONCRETE",
        Skins.SEED_CYAN.getPlayerHead(),
        CultivationThemes.PLANT,
        "Cultivation Plant: Concrete",
        ImmutableList.of(
            "This plant struggle to grow as it",
            "hardens so quickly."
        )
    );

    public static final SlimefunItemStack PLANT_STAINED = CultivationThemes.themedSlimefunItemStack(
        "CLT_PLANT_STAINED",
        Skins.SEED_CYAN.getPlayerHead(),
        CultivationThemes.PLANT,
        "Cultivation Plant: Stained",
        ImmutableList.of(
            "This plant splits light into a veritable",
            "spectrum to nearby objects."
        )
    );

    public static final SlimefunItemStack PLANT_COBBLESTONE = CultivationThemes.themedSlimefunItemStack(
        "CLT_PLANT_COBBLESTONE",
        Skins.SEED_PURPLE.getPlayerHead(),
        CultivationThemes.PLANT,
        "Cultivation Plant: Cobblestone",
        ImmutableList.of(
            "This plant is hard as a rock."
        )
    );

    public static final SlimefunItemStack PLANT_GRAVEL = CultivationThemes.themedSlimefunItemStack(
        "CLT_PLANT_GRAVEL",
        Skins.SEED_PURPLE.getPlayerHead(),
        CultivationThemes.PLANT,
        "Cultivation Plant: Gravel",
        ImmutableList.of(
            "This plant really doesn't know how",
            "to keep itself together."
        )
    );

    public static final SlimefunItemStack PLANT_CLAY = CultivationThemes.themedSlimefunItemStack(
        "CLT_PLANT_CLAY",
        Skins.SEED_PURPLE.getPlayerHead(),
        CultivationThemes.PLANT,
        "Cultivation Plant: Clay",
        ImmutableList.of(
            "This plant can be formed and reshaped freely.",
            "That doesn't mean it's a good idea to do so,",
            "though!"
        )
    );

    public static final SlimefunItemStack PLANT_IGNEOUS = CultivationThemes.themedSlimefunItemStack(
        "CLT_PLANT_IGNEOUS",
        Skins.SEED_BLUE.getPlayerHead(),
        CultivationThemes.PLANT,
        "Cultivation Plant: Igneous",
        ImmutableList.of(
            "This plant has been formed by heat and",
            "pressure. Don't look at me like that! All",
            "these plant descriptions make total sense."
        )
    );

    public static final SlimefunItemStack PLANT_DEEPSLATE = CultivationThemes.themedSlimefunItemStack(
        "CLT_PLANT_DEEPSLATE",
        Skins.SEED_BLUE.getPlayerHead(),
        CultivationThemes.PLANT,
        "Cultivation Plant: Deepslate",
        ImmutableList.of(
            "Deep, slatey, <insert lore here>."
        )
    );

    public static final SlimefunItemStack PLANT_REINFORCED = CultivationThemes.themedSlimefunItemStack(
        "CLT_PLANT_REINFORCED",
        Skins.SEED_BLUE.getPlayerHead(),
        CultivationThemes.PLANT,
        "Cultivation Plant: Reinforced",
        ImmutableList.of(
            "A plant that is able to hold itself up",
            "through anything."
        )
    );

    public static final SlimefunItemStack PLANT_BLACKSTONE = CultivationThemes.themedSlimefunItemStack(
        "CLT_PLANT_BLACKSTONE",
        Skins.SEED_PURPLE.getPlayerHead(),
        CultivationThemes.PLANT,
        "Cultivation Plant: Blackstone",
        ImmutableList.of(
            "A plant that has been known to absorb light."
        )
    );

    public static final SlimefunItemStack PLANT_NETHERRACK = CultivationThemes.themedSlimefunItemStack(
        "CLT_PLANT_NETHERRACK",
        Skins.SEED_RED.getPlayerHead(),
        CultivationThemes.PLANT,
        "Cultivation Plant: Netherrack",
        ImmutableList.of(
            "A tough hardy plant able to survive",
            "in most locales."
        )
    );

    public static final SlimefunItemStack PLANT_DARK_GRASS = CultivationThemes.themedSlimefunItemStack(
        "CLT_PLANT_DARK_GRASS",
        Skins.SEED_PURPLE.getPlayerHead(),
        CultivationThemes.PLANT,
        "Cultivation Plant: Dark Grass",
        ImmutableList.of(
            "A plant that has really lost it's",
            "identity."
        )
    );

    public static final SlimefunItemStack PLANT_MAGMA = CultivationThemes.themedSlimefunItemStack(
        "CLT_PLANT_MAGMA",
        Skins.SEED_RED.getPlayerHead(),
        CultivationThemes.PLANT,
        "Cultivation Plant: Magma",
        ImmutableList.of(
            "A plant that's so hot it burns it's",
            "surroundings."
        )
    );

    public static final SlimefunItemStack PLANT_SOUL = CultivationThemes.themedSlimefunItemStack(
        "CLT_PLANT_SOUL",
        Skins.SEED_RED.getPlayerHead(),
        CultivationThemes.PLANT,
        "Cultivation Plant: Soul",
        ImmutableList.of(
            "A plant that can be heard screaming",
            "when its quiet."
        )
    );

    public static final SlimefunItemStack PLANT_BASALT = CultivationThemes.themedSlimefunItemStack(
        "CLT_PLANT_BASALT",
        Skins.SEED_PURPLE.getPlayerHead(),
        CultivationThemes.PLANT,
        "Cultivation Plant: Basalt",
        ImmutableList.of(
            "A very boring and dull plant."
        )
    );

    public static final SlimefunItemStack PLANT_GLASS = CultivationThemes.themedSlimefunItemStack(
        "CLT_PLANT_GLASS",
        Skins.SEED_YELLOW.getPlayerHead(),
        CultivationThemes.PLANT,
        "Cultivation Plant: Glass",
        ImmutableList.of(
            "At the right angle, you could",
            "swear you can see through this plant."
        )
    );

    public static final SlimefunItemStack PLANT_MUD = CultivationThemes.themedSlimefunItemStack(
        "CLT_PLANT_MUD",
        Skins.SEED_BLUE.getPlayerHead(),
        CultivationThemes.PLANT,
        "Cultivation Plant: Mud",
        ImmutableList.of(
            "A plant that is nearly as dirty as",
            "the ground it comes from."
        )
    );

    public static final SlimefunItemStack PLANT_END_STONE = CultivationThemes.themedSlimefunItemStack(
        "CLT_PLANT_END_STONE",
        Skins.SEED_YELLOW.getPlayerHead(),
        CultivationThemes.PLANT,
        "Cultivation Plant: End Stone",
        ImmutableList.of(
            "A plant that hums with the void."
        )
    );

    public static final SlimefunItemStack PLANT_PURPUR = CultivationThemes.themedSlimefunItemStack(
        "CLT_PLANT_PURPUR",
        Skins.SEED_PURPLE.getPlayerHead(),
        CultivationThemes.PLANT,
        "Cultivation Plant: Purpur",
        ImmutableList.of(
            "An odd plant, seems far lighter",
            "than most."
        )
    );

    public static final SlimefunItemStack PLANT_COAL = CultivationThemes.themedSlimefunItemStack(
        "CLT_PLANT_COAL",
        Skins.SEED_RED.getPlayerHead(),
        CultivationThemes.PLANT,
        "Cultivation Plant: Coal",
        ImmutableList.of(
            "A plant that holds such potential."
        )
    );

    public static final SlimefunItemStack PLANT_RAW_IRON = CultivationThemes.themedSlimefunItemStack(
        "CLT_PLANT_RAW_IRON",
        Skins.SEED_RED.getPlayerHead(),
        CultivationThemes.PLANT,
        "Cultivation Plant: Raw Iron",
        ImmutableList.of(
            "A sturdy plant able to withstand most",
            "environments."
        )
    );

    public static final SlimefunItemStack PLANT_RAW_COPPER = CultivationThemes.themedSlimefunItemStack(
        "CLT_PLANT_RAW_COPPER",
        Skins.SEED_ORANGE.getPlayerHead(),
        CultivationThemes.PLANT,
        "Cultivation Plant: Raw Copper",
        ImmutableList.of(
            "If left alone, this plant sometimes",
            "attracts lightning."
        )
    );

    public static final SlimefunItemStack PLANT_RAW_GOLD = CultivationThemes.themedSlimefunItemStack(
        "CLT_PLANT_RAW_GOLD",
        Skins.SEED_YELLOW.getPlayerHead(),
        CultivationThemes.PLANT,
        "Cultivation Plant: Raw Gold",
        ImmutableList.of(
            "This plant is commonly stolen by piglins",
            "if nearby."
        )
    );

    public static final SlimefunItemStack PLANT_REDSTONE = CultivationThemes.themedSlimefunItemStack(
        "CLT_PLANT_REDSTONE",
        Skins.SEED_RED.getPlayerHead(),
        CultivationThemes.PLANT,
        "Cultivation Plant: Redstone",
        ImmutableList.of(
            "A plant brimming with power throughout."
        )
    );

    public static final SlimefunItemStack PLANT_LAPIS = CultivationThemes.themedSlimefunItemStack(
        "CLT_PLANT_LAPIS",
        Skins.SEED_BLUE.getPlayerHead(),
        CultivationThemes.PLANT,
        "Cultivation Plant: Lapis",
        ImmutableList.of(
            "A plant with a faint magical aura."
        )
    );

    public static final SlimefunItemStack PLANT_DIAMOND = CultivationThemes.themedSlimefunItemStack(
        "CLT_PLANT_DIAMOND",
        Skins.SEED_BLUE.getPlayerHead(),
        CultivationThemes.PLANT,
        "Cultivation Plant: Diamond",
        ImmutableList.of(
            "A plant that just speaks of riches."
        )
    );

    public static final SlimefunItemStack PLANT_EMERALD = CultivationThemes.themedSlimefunItemStack(
        "CLT_PLANT_EMERALD",
        Skins.SEED_GREEN.getPlayerHead(),
        CultivationThemes.PLANT,
        "Cultivation Plant: Emerald",
        ImmutableList.of(
            "Owners of this plant have to jump",
            "through hoops just to be able to afford it."
        )
    );

    public static final SlimefunItemStack PLANT_NETHER_QUARTZ = CultivationThemes.themedSlimefunItemStack(
        "CLT_PLANT_NETHER_QUARTZ",
        Skins.SEED_PURPLE.getPlayerHead(),
        CultivationThemes.PLANT,
        "Cultivation Plant: Nether Quartz",
        ImmutableList.of(
            "This plant has thorns so sharp that",
            "it's hard to work with."
        )
    );

    public static final SlimefunItemStack PLANT_SCRAPPY = CultivationThemes.themedSlimefunItemStack(
        "CLT_PLANT_SCRAPPY",
        Skins.SEED_RED.getPlayerHead(),
        CultivationThemes.PLANT,
        "Cultivation Plant: Scrappy",
        ImmutableList.of(
            "This plant really is the pinnacle of",
            "horticulturalism."
        )
    );

    public static final SlimefunItemStack PLANT_AMETHYST = CultivationThemes.themedSlimefunItemStack(
        "CLT_PLANT_AMETHYST",
        Skins.SEED_PURPLE.getPlayerHead(),
        CultivationThemes.PLANT,
        "Cultivation Plant: Amethyst",
        ImmutableList.of(
            "This plant loves to flourish in deep, dark",
            "locales."
        )
    );

    public static final SlimefunItemStack PLANT_ECHO = CultivationThemes.themedSlimefunItemStack(
        "CLT_PLANT_ECHO",
        Skins.SEED_PURPLE.getPlayerHead(),
        CultivationThemes.PLANT,
        "Cultivation Plant: Echo",
        ImmutableList.of(
            "This plant always knows how to find",
            "its way home."
        )
    );

    public static final SlimefunItemStack PLANT_SKELETON = CultivationThemes.themedSlimefunItemStack(
        "CLT_PLANT_SKELETON",
        Skins.SEED_GREEN.getPlayerHead(),
        CultivationThemes.PLANT,
        "Cultivation Plant: Skeleton",
        ImmutableList.of(
            "A plant that rattles as it sways."
        )
    );

    public static final SlimefunItemStack PLANT_SPIDER = CultivationThemes.themedSlimefunItemStack(
        "CLT_PLANT_SPIDER",
        Skins.SEED_RED.getPlayerHead(),
        CultivationThemes.PLANT,
        "Cultivation Plant: Spider",
        ImmutableList.of(
            "Kill it, kill it NAO!"
        )
    );

    public static final SlimefunItemStack PLANT_CREEPER = CultivationThemes.themedSlimefunItemStack(
        "CLT_PLANT_CREEPER",
        Skins.SEED_GREEN.getPlayerHead(),
        CultivationThemes.PLANT,
        "Cultivation Plant: Creeper",
        ImmutableList.of(
            "Tsssssssssttt..."
        )
    );

    public static final SlimefunItemStack PLANT_ZOMBIE = CultivationThemes.themedSlimefunItemStack(
        "CLT_PLANT_ZOMBIE",
        Skins.SEED_GREEN.getPlayerHead(),
        CultivationThemes.PLANT,
        "Cultivation Plant: Zombie",
        ImmutableList.of(
            "This plant is dripping... something..."
        )
    );

    public static final SlimefunItemStack PLANT_DROWNED = CultivationThemes.themedSlimefunItemStack(
        "CLT_PLANT_DROWNED",
        Skins.SEED_BLUE.getPlayerHead(),
        CultivationThemes.PLANT,
        "Cultivation Plant: Drowned",
        ImmutableList.of(
            "A Plant that is dripping wet, all",
            "the time."
        )
    );

    public static final SlimefunItemStack PLANT_GUARDIAN = CultivationThemes.themedSlimefunItemStack(
        "CLT_PLANT_GUARDIAN",
        Skins.SEED_BLUE.getPlayerHead(),
        CultivationThemes.PLANT,
        "Cultivation Plant: Guardian",
        ImmutableList.of(
            "When touched, this plant releases",
            "spines."
        )
    );

    public static final SlimefunItemStack PLANT_ELDER_GUARDIAN = CultivationThemes.themedSlimefunItemStack(
        "CLT_PLANT_ELDER_GUARDIAN",
        Skins.SEED_BLUE.getPlayerHead(),
        CultivationThemes.PLANT,
        "Cultivation Plant: Elder Guardian",
        ImmutableList.of(
            "Being near this plants makes people",
            "sluggish."
        )
    );

    public static final SlimefunItemStack PLANT_GHAST = CultivationThemes.themedSlimefunItemStack(
        "CLT_PLANT_GHAST",
        Skins.SEED_YELLOW.getPlayerHead(),
        CultivationThemes.PLANT,
        "Cultivation Plant: Ghast",
        ImmutableList.of(
            "A plant that has been known to",
            "randomly shoot fire balls."
        )
    );

    public static final SlimefunItemStack PLANT_SLIME = CultivationThemes.themedSlimefunItemStack(
        "CLT_PLANT_SLIME",
        Skins.SEED_GREEN.getPlayerHead(),
        CultivationThemes.PLANT,
        "Cultivation Plant: Slime",
        ImmutableList.of(
            "Why is it so sticky?"
        )
    );

    public static final SlimefunItemStack PLANT_MAGMA_CUBE = CultivationThemes.themedSlimefunItemStack(
        "CLT_PLANT_MAGMA_CUBE",
        Skins.SEED_RED.getPlayerHead(),
        CultivationThemes.PLANT,
        "Cultivation Plant: Magma Cube",
        ImmutableList.of(
            "When not being watched, this plant",
            "likes to bounce up and down."
        )
    );

    public static final SlimefunItemStack PLANT_BLAZE = CultivationThemes.themedSlimefunItemStack(
        "CLT_PLANT_BLAZE",
        Skins.SEED_RED.getPlayerHead(),
        CultivationThemes.PLANT,
        "Cultivation Plant: Blaze",
        ImmutableList.of(
            "A plant that is scorched around the edges."
        )
    );

    public static final SlimefunItemStack PLANT_WITHER_SKELETON = CultivationThemes.themedSlimefunItemStack(
        "CLT_PLANT_WITHER_SKELETON",
        Skins.SEED_PURPLE.getPlayerHead(),
        CultivationThemes.PLANT,
        "Cultivation Plant: Wither Skeleton",
        ImmutableList.of(
            "A plant known to be elusive and hardy."
        )
    );

    public static final SlimefunItemStack PLANT_WITHER = CultivationThemes.themedSlimefunItemStack(
        "CLT_PLANT_WITHER",
        Skins.SEED_PURPLE.getPlayerHead(),
        CultivationThemes.PLANT,
        "Cultivation Plant: Wither",
        ImmutableList.of(
            "A deadly plant that must be treated",
            "with care."
        )
    );

    public static final SlimefunItemStack PLANT_PHANTOM = CultivationThemes.themedSlimefunItemStack(
        "CLT_PLANT_PHANTOM",
        Skins.SEED_BLUE.getPlayerHead(),
        CultivationThemes.PLANT,
        "Cultivation Plant: Phantom",
        ImmutableList.of(
            "A plant with lofty leaves."
        )
    );

    public static final SlimefunItemStack PLANT_SHULKER = CultivationThemes.themedSlimefunItemStack(
        "CLT_PLANT_SHULKER",
        Skins.SEED_PURPLE.getPlayerHead(),
        CultivationThemes.PLANT,
        "Cultivation Plant: Shulker",
        ImmutableList.of(
            "A plant that often levitates off",
            "of the ground."
        )
    );

    public static final SlimefunItemStack PLANT_ENDERMAN = CultivationThemes.themedSlimefunItemStack(
        "CLT_PLANT_ENDERMAN",
        Skins.SEED_GREEN.getPlayerHead(),
        CultivationThemes.PLANT,
        "Cultivation Plant: Enderman",
        ImmutableList.of(
            "If not treated carefully, this plant",
            "may teleport randomly!"
        )
    );

    public static final SlimefunItemStack PLANT_ENDER_DRAGON = CultivationThemes.themedSlimefunItemStack(
        "CLT_PLANT_ENDER_DRAGON",
        Skins.SEED_PURPLE.getPlayerHead(),
        CultivationThemes.PLANT,
        "Cultivation Plant: Ender Dragon",
        ImmutableList.of(
            "A real boss of a plant."
        )
    );

    public static final SlimefunItemStack PLANT_WITCH = CultivationThemes.themedSlimefunItemStack(
        "CLT_PLANT_WITCH",
        Skins.SEED_PURPLE.getPlayerHead(),
        CultivationThemes.PLANT,
        "Cultivation Plant: Witch",
        ImmutableList.of(
            "A plant that sounds like it's softly",
            "muttering spells."
        )
    );

    // endregion

    // region Bushes


    // endregion

    // region Tools

    public static final SlimefunItemStack CROP_STICKS = CultivationThemes.themedSlimefunItemStack(
        "CLT_CROP_STICKS",
        Material.STICK,
        CultivationThemes.TOOL,
        "Crop Sticks",
        "Crop sticks must be applied to a",
        "placed seed in order for it to grow.",
        "Placing a second set will cross-crop",
        "the plant allowing it to spread and/or",
        "breed."
    );

    public static final SlimefunItemStack HARVESTING_TOOL_SIMPLE = CultivationThemes.themedSlimefunItemStack(
        "CLT_HARVESTING_TOOL_SIMPLE",
        Material.TRIPWIRE_HOOK,
        CultivationThemes.TOOL,
        "Simple Harvesting Tool",
        "A very basic tool that allows",
        "the user to harvest Cultivation Plants.",
        Theme.WARNING + "Works on Tier 1 plants",
        "",
        Theme.applyThemeAsTitle(Theme.CLICK_INFO, "Right Click", "Harvests a fully grown Cultivation Plant"),
        "",
        LoreBuilder.usesLeft(50)
    );

    public static final SlimefunItemStack TRIMMING_TOOL_SIMPLE = CultivationThemes.themedSlimefunItemStack(
        "CLT_TRIMMING_TOOL_SIMPLE",
        Material.SHEARS,
        CultivationThemes.TOOL,
        "Simple Trimming Tool",
        "A very basic tool that allows",
        "the user to trim Cultivation Bushes.",
        "",
        Theme.applyThemeAsTitle(Theme.CLICK_INFO, "Right Click", "Takes a trimming of a fully grown Cultivation Bush"),
        "",
        LoreBuilder.usesLeft(50)
    );

    public static final SlimefunItemStack PLANT_ANALYSER = CultivationThemes.themedSlimefunItemStack(
        "CLT_PLANT_ANALYSER",
        Material.DIAMOND,
        CultivationThemes.TOOL,
        "Plant Analyser",
        "A very basic tool that allows",
        "you to see a growing plant's details",
        "",
        Theme.applyThemeAsTitle(
            Theme.CLICK_INFO,
            "Right Click",
            "Lets you know the species and growth details of a plant."
        ),
        Theme.applyThemeAsTitle(Theme.CLICK_INFO, "Shift Right Click", "Displays a plant or bushes name.")
    );

    public static final SlimefunItemStack RECIPE_UNLOCK = CultivationThemes.themedSlimefunItemStack(
        "CLT_RECIPE_UNLOCK",
        Material.PAPER,
        CultivationThemes.TOOL,
        "Cultivation Knowledge Script",
        "Right click to learn a Cultivation",
        "breeding recipe.",
        "",
        Theme.CLICK_INFO.asTitle("Unlocks", "{0}")
    );

    public static final SlimefunItemStack SEED_PACK = CultivationThemes.themedSlimefunItemStack(
        "CLT_SEED_PACK",
        Material.COMPOSTER,
        CultivationThemes.TOOL,
        "Seed Pack",
        "Right click to open this pack.",
        "",
        Theme.CLICK_INFO.asTitle("Set to", "Nothing")
    );

    // endregion

    // region Machines

    public static final SlimefunItemStack GARDEN_CLOCHE = CultivationThemes.themedSlimefunItemStack(
        "CLT_GARDEN_CLOCHE",
        Material.GLASS,
        CultivationThemes.MACHINE,
        "Garden Cloche",
        "Grows plants inside it automatically.",
        "",
        Theme.CLICK_INFO.asTitle("Power per Tick", 100)
    );

    public static final SlimefunItemStack COUNTER_NOTHING = CultivationThemes.themedSlimefunItemStack(
        "CLT_COUNTER_NOTHING",
        Material.STRIPPED_DARK_OAK_LOG,
        CultivationThemes.MACHINE,
        "Kitchen Counter: Empty",
        "Just for decoration!",
        "",
        Theme.CLICK_INFO + "Pro Tip! When placed, you can shift + right",
        Theme.CLICK_INFO + "click and the block(s) you're holding will",
        Theme.CLICK_INFO + "change the kitchen design. Try it out!"
    );

    public static final SlimefunItemStack COUNTER_CHOPPING = CultivationThemes.themedSlimefunItemStack(
        "CLT_COUNTER_CHOPPING",
        Material.SMITHING_TABLE,
        CultivationThemes.MACHINE,
        "Kitchen Counter: Chopping Board",
        "Right click this block to chop produce.",
        "",
        Theme.CLICK_INFO + "Pro Tip! When placed, you can shift + right",
        Theme.CLICK_INFO + "click and the block(s) you're holding will",
        Theme.CLICK_INFO + "change the kitchen design. Try it out!"
    );

    public static final SlimefunItemStack COUNTER_SLICING = CultivationThemes.themedSlimefunItemStack(
        "CLT_COUNTER_SLICING",
        Material.CARTOGRAPHY_TABLE,
        CultivationThemes.MACHINE,
        "Kitchen Counter: Slicing Board",
        "Right click this block to slice produce.",
        "",
        Theme.CLICK_INFO + "Pro Tip! When placed, you can shift + right",
        Theme.CLICK_INFO + "click and the block(s) you're holding will",
        Theme.CLICK_INFO + "change the kitchen design. Try it out!"
    );

    public static final SlimefunItemStack COUNTER_MASHER = CultivationThemes.themedSlimefunItemStack(
        "CLT_COUNTER_MASHER",
        Material.CRAFTING_TABLE,
        CultivationThemes.MACHINE,
        "Kitchen Counter: Mashing Bowl",
        "Right click this block to mash produce.",
        "",
        Theme.CLICK_INFO + "Pro Tip! When placed, you can shift + right",
        Theme.CLICK_INFO + "click and the block(s) you're holding will",
        Theme.CLICK_INFO + "change the kitchen design. Try it out!"
    );

    public static final SlimefunItemStack COUNTER_GRINDER = CultivationThemes.themedSlimefunItemStack(
        "CLT_COUNTER_GRINDER",
        Material.CAULDRON,
        CultivationThemes.MACHINE,
        "Kitchen Counter: Grinding Pestle and Mortar",
        "Right click this block to grind produce.",
        "",
        Theme.CLICK_INFO + "Pro Tip! When placed, you can shift + right",
        Theme.CLICK_INFO + "click and the block(s) you're holding will",
        Theme.CLICK_INFO + "change the kitchen design. Try it out!"
    );

    public static final SlimefunItemStack COUNTER_BLENDER = CultivationThemes.themedSlimefunItemStack(
        "CLT_COUNTER_BLENDER",
        Material.FLETCHING_TABLE,
        CultivationThemes.MACHINE,
        "Kitchen Counter: Blender",
        "Right click this block to blend produce.",
        "",
        Theme.CLICK_INFO + "Pro Tip! When placed, you can shift + right",
        Theme.CLICK_INFO + "click and the block(s) you're holding will",
        Theme.CLICK_INFO + "change the kitchen design. Try it out!"
    );

    public static final SlimefunItemStack COUNTER_OVEN = CultivationThemes.themedSlimefunItemStack(
        "CLT_COUNTER_OVEN",
        Material.FURNACE,
        CultivationThemes.MACHINE,
        "Kitchen Counter: Oven",
        "Can bake certain produce items.",
        "",
        Theme.CLICK_INFO + "Pro Tip! When placed, you can shift + right",
        Theme.CLICK_INFO + "click and the block(s) you're holding will",
        Theme.CLICK_INFO + "change the kitchen design. Try it out!"
    );

    public static final SlimefunItemStack COUNTER_FRYER = CultivationThemes.themedSlimefunItemStack(
        "CLT_COUNTER_FRYING",
        Material.BLACK_STAINED_GLASS,
        CultivationThemes.MACHINE,
        "Kitchen Counter: Frying Pan",
        "Can fry certain produce items.",
        "",
        Theme.CLICK_INFO + "Pro Tip! When placed, you can shift + right",
        Theme.CLICK_INFO + "click and the block(s) you're holding will",
        Theme.CLICK_INFO + "change the kitchen design. Try it out!"
    );

    public static final SlimefunItemStack COUNTER_BOILING = CultivationThemes.themedSlimefunItemStack(
        "CLT_COUNTER_BOILING",
        Material.BLACK_STAINED_GLASS,
        CultivationThemes.MACHINE,
        "Kitchen Counter: Boiling Pot",
        "Can boil certain items.",
        "",
        Theme.CLICK_INFO + "Pro Tip! When placed, you can shift + right",
        Theme.CLICK_INFO + "click and the block(s) you're holding will",
        Theme.CLICK_INFO + "change the kitchen design. Try it out!"
    );

    public static final SlimefunItemStack COUNTER_GRILL = CultivationThemes.themedSlimefunItemStack(
        "CLT_COUNTER_GRILL",
        Material.CAMPFIRE,
        CultivationThemes.MACHINE,
        "Kitchen Counter: Grill",
        "Can grill certain produce items.",
        "",
        Theme.CLICK_INFO + "Pro Tip! When placed, you can shift + right",
        Theme.CLICK_INFO + "click and the block(s) you're holding will",
        Theme.CLICK_INFO + "change the kitchen design. Try it out!"
    );

    public static final SlimefunItemStack COUNTER_FINISHING = CultivationThemes.themedSlimefunItemStack(
        "CLT_COUNTER_FINISHING",
        Material.CRAFTING_TABLE,
        CultivationThemes.MACHINE,
        "Kitchen Counter: Finishing",
        "Used to craft products/by-products into",
        "other by-products or finished foods.",
        "",
        Theme.CLICK_INFO + "Pro Tip! When placed, you can shift + right",
        Theme.CLICK_INFO + "click and the block(s) you're holding will",
        Theme.CLICK_INFO + "change the kitchen design. Try it out!"
    );

    // endregion

    // region Produce

    public static final SlimefunItemStack BANANA = CultivationThemes.themedSlimefunItemStack(
        "CLT_BANANA",
        Skins.BANANA.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "Banana",
        "I like the look and peel of this!"
    );

    public static final SlimefunItemStack LEMON = CultivationThemes.themedSlimefunItemStack(
        "CLT_LEMON",
        Skins.LEMON.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "Lemon",
        "Why the sour look?"
    );

    public static final SlimefunItemStack ORANGE = CultivationThemes.themedSlimefunItemStack(
        "CLT_ORANGE",
        Skins.ORANGE.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "Orange",
        "Isn't this meant to be clockwork?"
    );

    public static final SlimefunItemStack GREEN_APPLE = CultivationThemes.themedSlimefunItemStack(
        "CLT_GREEN_APPLE",
        Skins.GREEN_APPLE.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "Green Apple",
        "The note says... Dear Teacher?"
    );

    public static final SlimefunItemStack PINEAPPLE = CultivationThemes.themedSlimefunItemStack(
        "CLT_PINEAPPLE",
        Skins.PINEAPPLE.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "Pineapple",
        "This belongs on every pizza in existence.",
        "Wanna fight about it!?"
    );

    public static final SlimefunItemStack MANGO = CultivationThemes.themedSlimefunItemStack(
        "CLT_MANGO",
        Skins.MANGO.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "Mango",
        "MAN, I gotta GO.",
        "Lore is hard..."
    );

    public static final SlimefunItemStack PEACH = CultivationThemes.themedSlimefunItemStack(
        "CLT_PEACH",
        Skins.PEACH.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "Peach",
        "We don't talk about the Emoji"
    );

    public static final SlimefunItemStack APRICOT = CultivationThemes.themedSlimefunItemStack(
        "CLT_APRICOT",
        Skins.APRICOT.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "Apricot",
        "You can make Pokéballs out of these.",
        "...",
        "What do you mean that's different thing...?"
    );

    public static final SlimefunItemStack PEAR = CultivationThemes.themedSlimefunItemStack(
        "CLT_PEAR",
        Skins.PEAR.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "Pear",
        "Wouldn't you say this looks pear-fect?"
    );

    public static final SlimefunItemStack CHERRY = CultivationThemes.themedSlimefunItemStack(
        "CLT_CHERRY",
        Skins.CHERRY.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "Cherry",
        "Oh, I thought they grew Glacé'd, shame!"
    );

    public static final SlimefunItemStack KIWI = CultivationThemes.themedSlimefunItemStack(
        "CLT_KIWI",
        Skins.KIWI.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "Kiwi",
        "I put this in the addon under duress.",
        "Kiwis are evil and anyone who",
        "uses them will automatically lose",
        "100 points."
    );

    public static final SlimefunItemStack LIME = CultivationThemes.themedSlimefunItemStack(
        "CLT_LIME",
        Skins.KIWI.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "Lime",
        "One upon a lime there was a delicious fruit..."
    );

    public static final SlimefunItemStack CHESTNUT = CultivationThemes.themedSlimefunItemStack(
        "CLT_CHESTNUT",
        Skins.CHESTNUT.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "Chestnut",
        "Designed to be baked, immediately."
    );

    public static final SlimefunItemStack HAZELNUT = CultivationThemes.themedSlimefunItemStack(
        "CLT_HAZELNUT",
        Skins.HAZELNUT.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "Hazelnut",
        "Do whatever you need to turn this into",
        "a coffee for me, now!"
    );

    public static final SlimefunItemStack PECAN = CultivationThemes.themedSlimefunItemStack(
        "CLT_PECAN",
        Skins.PECAN.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "Pecan",
        "Just begging to be made into a pie."
    );

    public static final SlimefunItemStack GRAPE = CultivationThemes.themedSlimefunItemStack(
        "CLT_GRAPE",
        Skins.GRAPE.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "Grape",
        "So plump!"
    );

    public static final SlimefunItemStack PEANUT = CultivationThemes.themedSlimefunItemStack(
        "CLT_PEANUT",
        Skins.PEANUT.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "Peanut",
        "Reece's here I come!"
    );

    public static final SlimefunItemStack STRAWBERRY = CultivationThemes.themedSlimefunItemStack(
        "CLT_STRAWBERRY",
        Skins.STRAWBERRY.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "Strawberry",
        "Just add cream!"
    );

    public static final SlimefunItemStack RICE = CultivationThemes.themedSlimefunItemStack(
        "CLT_RICE",
        Skins.RICE.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "Rice",
        "Remember, you only live rice!"
    );

    public static final SlimefunItemStack GARLIC = CultivationThemes.themedSlimefunItemStack(
        "CLT_GARLIC",
        Skins.GARLIC.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "Garlic",
        "Quick, before the vampires come!"
    );

    public static final SlimefunItemStack CAYENNE_PEPPER = CultivationThemes.themedSlimefunItemStack(
        "CLT_CAYENNE_PEPPER",
        Skins.PEPPERS.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "Cayenne Pepper",
        "A soft spicy treat."
    );

    public static final SlimefunItemStack TOMATO = CultivationThemes.themedSlimefunItemStack(
        "CLT_TOMATO",
        Skins.TOMATO.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "Tomato",
        "Right off of the vine.... err... bush?"
    );

    public static final SlimefunItemStack BELL_PEPPER = CultivationThemes.themedSlimefunItemStack(
        "CLT_BELL_PEPPER",
        Skins.BELL_PEPPER.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "Bell Pepper",
        "Really rings true."
    );

    public static final SlimefunItemStack ONION = CultivationThemes.themedSlimefunItemStack(
        "CLT_ONION",
        Skins.ONION.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "Onion",
        "Wait, why are you crying?"
    );

    public static final SlimefunItemStack PEA = CultivationThemes.themedSlimefunItemStack(
        "CLT_PEA",
        Skins.GREEN_APPLE.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "Peas",
        "Often found in pairs within a pod, or so I hear."
    );

    public static final SlimefunItemStack RAPESEED = CultivationThemes.themedSlimefunItemStack(
        "CLT_RAPESEED",
        new ItemStack(Material.MELON_SEEDS),
        CultivationThemes.PRODUCE,
        "Rapeseed",
        "Oft-used to create oils."
    );

    public static final SlimefunItemStack LETTUCE = CultivationThemes.themedSlimefunItemStack(
        "CLT_LETTUCE",
        Skins.LETTUCE.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "Lettuce",
        "Thin, watery and yet delicious."
    );

    public static final SlimefunItemStack MUSTARD_SEEDS = CultivationThemes.themedSlimefunItemStack(
        "CLT_MUSTARD_SEEDS",
        new ItemStack(Material.PUMPKIN_SEEDS),
        CultivationThemes.PRODUCE,
        "Mustard Seeds",
        "Chew them, I dare you!"
    );

    public static final SlimefunItemStack BROCCOLI = CultivationThemes.themedSlimefunItemStack(
        "CLT_BROCCOLI",
        Skins.BROCCOLI.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "Broccoli",
        "Are you a giant holding a tree?",
        "Naw, just a tiny tree :)"
    );

    public static final SlimefunItemStack CINNAMON = CultivationThemes.themedSlimefunItemStack(
        "CLT_CINNAMON",
        new ItemStack(Material.STICK),
        CultivationThemes.PRODUCE,
        "Cinnamon",
        "Great to chew on in it's stick form."
    );

    public static final SlimefunItemStack BASIL = CultivationThemes.themedSlimefunItemStack(
        "CLT_BASIL",
        new ItemStack(Material.SMALL_DRIPLEAF),
        CultivationThemes.PRODUCE,
        "Basil",
        "A sweet leaf with a soft peppery aftertaste."
    );

    public static final SlimefunItemStack BAY_LEAF = CultivationThemes.themedSlimefunItemStack(
        "CLT_BAY_LEAF",
        new ItemStack(Material.LILY_PAD),
        CultivationThemes.PRODUCE,
        "Bay Leaf",
        "A strong aromat with many uses."
    );

    public static final SlimefunItemStack CILANTRO = CultivationThemes.themedSlimefunItemStack(
        "CLT_CILANTRO",
        new ItemStack(Material.MANGROVE_LEAVES),
        CultivationThemes.PRODUCE,
        "Cilantro",
        "A soft spice with a hit of citrus."
    );

    public static final SlimefunItemStack CHICORY = CultivationThemes.themedSlimefunItemStack(
        "CLT_CHICORY",
        new ItemStack(Material.BLUE_ORCHID),
        CultivationThemes.PRODUCE,
        "Chicory",
        "A nutty, bitter root."
    );

    public static final SlimefunItemStack CHIVES = CultivationThemes.themedSlimefunItemStack(
        "CLT_CHIVES",
        new ItemStack(Material.SEAGRASS),
        CultivationThemes.PRODUCE,
        "Chives",
        "A sweat, onion-tasting, herb."
    );

    public static final SlimefunItemStack CLOVE = CultivationThemes.themedSlimefunItemStack(
        "CLT_CLOVE",
        new ItemStack(Material.POPPY),
        CultivationThemes.PRODUCE,
        "Clove",
        "A super warm and intense flavour."
    );

    public static final SlimefunItemStack CUMIN = CultivationThemes.themedSlimefunItemStack(
        "CLT_CUMIN",
        new ItemStack(Material.DANDELION),
        CultivationThemes.PRODUCE,
        "Cumin",
        "A warm citrusy plant."
    );

    public static final SlimefunItemStack CHILLI_PEPPER = CultivationThemes.themedSlimefunItemStack(
        "CLT_CHILLY_PEPPER",
        Skins.PEPPERS.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "Chilly Pepper",
        "I can eat a whole pepper without crying.",
        "Well, half.",
        "WEEEELLL.... 1/4",
        "...",
        "Ok I can touch one on my tounge"
    );

    public static final SlimefunItemStack CURRY_LEAF = CultivationThemes.themedSlimefunItemStack(
        "CLT_CURRY_LEAF",
        new ItemStack(Material.KELP),
        CultivationThemes.PRODUCE,
        "Curry Leaf",
        "The basis of so many wonderful foods."
    );

    public static final SlimefunItemStack DILL = CultivationThemes.themedSlimefunItemStack(
        "CLT_DILL",
        new ItemStack(Material.SHORT_GRASS),
        CultivationThemes.PRODUCE,
        "Dill",
        "Just taste like grass to me. Why",
        "do people like this?"
    );

    public static final SlimefunItemStack FENNEL = CultivationThemes.themedSlimefunItemStack(
        "CLT_FENNEL",
        new ItemStack(Material.OXEYE_DAISY),
        CultivationThemes.PRODUCE,
        "Fennel",
        "Like a mix of Anise and Liquorice."
    );

    public static final SlimefunItemStack GINGER = CultivationThemes.themedSlimefunItemStack(
        "CLT_GINGER",
        new ItemStack(Material.HANGING_ROOTS),
        CultivationThemes.PRODUCE,
        "Ginger",
        "Chopped Ginger in boiling water, heals all ailments!"
    );

    public static final SlimefunItemStack HORSERADISH = CultivationThemes.themedSlimefunItemStack(
        "CLT_HORSERADISH",
        new ItemStack(Material.HANGING_ROOTS),
        CultivationThemes.PRODUCE,
        "Horseradish",
        "$100 if you bite right into it."
    );

    public static final SlimefunItemStack JASMINE = CultivationThemes.themedSlimefunItemStack(
        "CLT_JASMINE",
        new ItemStack(Material.WHITE_TULIP),
        CultivationThemes.PRODUCE,
        "Jasmine",
        "Makes for a wonderful tea."
    );

    public static final SlimefunItemStack JUNIPER_BERRY = CultivationThemes.themedSlimefunItemStack(
        "CLT_JUNIPER_BERRY",
        new ItemStack(Material.GLOW_BERRIES),
        CultivationThemes.PRODUCE,
        "Juniper Berries",
        "Dried to a peppery perfection."
    );

    public static final SlimefunItemStack KAFFIR_LIME = CultivationThemes.themedSlimefunItemStack(
        "CLT_KAFFIR_LIME",
        new ItemStack(Material.KELP),
        CultivationThemes.PRODUCE,
        "Kaffir Lime Leaf",
        "A leaf with a mighty zest."
    );

    public static final SlimefunItemStack LAVENDER = CultivationThemes.themedSlimefunItemStack(
        "CLT_LAVENDER",
        new ItemStack(Material.PURPLE_DYE),
        CultivationThemes.PRODUCE,
        "Lavender",
        "A smell that can make me drift slowly to sleep."
    );

    public static final SlimefunItemStack LICORICE = CultivationThemes.themedSlimefunItemStack(
        "CLT_LICORICE",
        new ItemStack(Material.HANGING_ROOTS),
        CultivationThemes.PRODUCE,
        "Licorice",
        "Run, run away now!"
    );

    public static final SlimefunItemStack MACE = CultivationThemes.themedSlimefunItemStack(
        "CLT_MACE",
        new ItemStack(Material.RED_DYE),
        CultivationThemes.PRODUCE,
        "Mace",
        "Used to spray in the face of attackers.",
        "...",
        "What do you mean that's not the right type of mace?"
    );

    public static final SlimefunItemStack MARJORAM = CultivationThemes.themedSlimefunItemStack(
        "CLT_MARJORAM",
        new ItemStack(Material.DARK_OAK_LEAVES),
        CultivationThemes.PRODUCE,
        "Marjoram",
        "I'm in a bit of a curry, could we talk later?"
    );

    public static final SlimefunItemStack MINT = CultivationThemes.themedSlimefunItemStack(
        "CLT_MINT",
        new ItemStack(Material.MANGROVE_LEAVES),
        CultivationThemes.PRODUCE,
        "Mint",
        "Chew chew chew."
    );

    public static final SlimefunItemStack OREGANO = CultivationThemes.themedSlimefunItemStack(
        "CLT_OREGANO",
        new ItemStack(Material.SPRUCE_LEAVES),
        CultivationThemes.PRODUCE,
        "Oregano",
        "A classic staple cupboard herb."
    );

    public static final SlimefunItemStack PARSLEY = CultivationThemes.themedSlimefunItemStack(
        "CLT_PARSLEY",
        new ItemStack(Material.ACACIA_LEAVES),
        CultivationThemes.PRODUCE,
        "Parsley",
        "Worst. Herb. Ever."
    );

    public static final SlimefunItemStack ROSEMARY = CultivationThemes.themedSlimefunItemStack(
        "CLT_ROSEMARY",
        new ItemStack(Material.BIRCH_LEAVES),
        CultivationThemes.PRODUCE,
        "Rosemary",
        "Often misses thyme."
    );

    public static final SlimefunItemStack SASSAFRAS = CultivationThemes.themedSlimefunItemStack(
        "CLT_SASSAFRAS",
        new ItemStack(Material.OAK_LEAVES),
        CultivationThemes.PRODUCE,
        "Sassafras",
        "Edible Root Beer, seriously google",
        "it, I buy it constantly now."
    );

    public static final SlimefunItemStack SHISO = CultivationThemes.themedSlimefunItemStack(
        "CLT_SHISO",
        new ItemStack(Material.MANGROVE_LEAVES),
        CultivationThemes.PRODUCE,
        "Shiso",
        "Mint with a side of love."
    );

    public static final SlimefunItemStack STAR_ANISE = CultivationThemes.themedSlimefunItemStack(
        "CLT_STAR_ANISE",
        new ItemStack(Material.NETHER_STAR),
        CultivationThemes.PRODUCE,
        "Star Anise",
        "One of the best and most unique flavours."
    );

    public static final SlimefunItemStack TARRAGON = CultivationThemes.themedSlimefunItemStack(
        "CLT_TARRAGON",
        new ItemStack(Material.JUNGLE_LEAVES),
        CultivationThemes.PRODUCE,
        "Tarragon",
        "I literally put this on anything.",
        "Spoiler: Im not a good chef."
    );

    public static final SlimefunItemStack THYME = CultivationThemes.themedSlimefunItemStack(
        "CLT_THYME",
        new ItemStack(Material.BIRCH_LEAVES),
        CultivationThemes.PRODUCE,
        "Thyme",
        "Often missed rosemary."
    );

    public static final SlimefunItemStack TURMERIC = CultivationThemes.themedSlimefunItemStack(
        "CLT_TURMERIC",
        new ItemStack(Material.YELLOW_DYE),
        CultivationThemes.PRODUCE,
        "Turmeric",
        "A strong musky presence to fill out many dishes."
    );

    public static final SlimefunItemStack VANILLA = CultivationThemes.themedSlimefunItemStack(
        "CLT_VANILLA",
        new ItemStack(Material.BLACK_DYE),
        CultivationThemes.PRODUCE,
        "Vanilla",
        "Instructions: Dip directly into a Latte"
    );

    public static final SlimefunItemStack WASABI = CultivationThemes.themedSlimefunItemStack(
        "CLT_WASABI",
        new ItemStack(Material.HANGING_ROOTS),
        CultivationThemes.PRODUCE,
        "Wasabi",
        "Help... wasabi..."
    );

    public static final SlimefunItemStack ARTICHOKE = CultivationThemes.themedSlimefunItemStack(
        "CLT_ARTICHOKE",
        Skins.CABBAGE.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "Artichoke",
        "Rip out it's HEART!"
    );

    public static final SlimefunItemStack AUBERGINE = CultivationThemes.themedSlimefunItemStack(
        "CLT_AUBERGINE",
        Skins.AUBERGINE.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "Aubergine",
        "Bright purple and 100% NOT egg shaped.",
        "Better call it an eggplant, right?"
    );

    public static final SlimefunItemStack ASPARAGUS = CultivationThemes.themedSlimefunItemStack(
        "CLT_ASPARAGUS",
        Skins.ASPARAGUS.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "Asparagus",
        "Careful when visiting the bathroom later."
    );

    public static final SlimefunItemStack BRUSSELS_SPROUTS = CultivationThemes.themedSlimefunItemStack(
        "CLT_BRUSSELS_SPROUTS",
        Skins.KALE.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "Brussels Sprouts",
        "A gassious delight."
    );

    public static final SlimefunItemStack CABBAGE = CultivationThemes.themedSlimefunItemStack(
        "CLT_CABBAGE",
        Skins.CABBAGE.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "Cabbage",
        "A baggage of cabbage."
    );

    public static final SlimefunItemStack CAULIFLOWER = CultivationThemes.themedSlimefunItemStack(
        "CLT_CAULIFLOWER",
        Skins.CAULIFLOWER.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "Cauliflower",
        "A portable cloud!"
    );

    public static final SlimefunItemStack CELERY = CultivationThemes.themedSlimefunItemStack(
        "CLT_CELERY",
        new ItemStack(Material.BAMBOO),
        CultivationThemes.PRODUCE,
        "Celery",
        "Literally just stringy water. Convince",
        "me otherwise."
    );

    public static final SlimefunItemStack KALE = CultivationThemes.themedSlimefunItemStack(
        "CLT_KALE",
        Skins.KALE.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "Kale",
        "Help, im a 2020 smoothie hipster!"
    );

    public static final SlimefunItemStack SPINACH = CultivationThemes.themedSlimefunItemStack(
        "CLT_SPINACH",
        new ItemStack(Material.KELP),
        CultivationThemes.PRODUCE,
        "Spinach",
        "Wilted with love."
    );

    public static final SlimefunItemStack BLACK_BEANS = CultivationThemes.themedSlimefunItemStack(
        "CLT_BLACK_BEANS",
        new ItemStack(Material.MELON_SEEDS),
        CultivationThemes.PRODUCE,
        "Black Beans",
        "A delicious vegetarian protein."
    );

    public static final SlimefunItemStack GREEN_BEANS = CultivationThemes.themedSlimefunItemStack(
        "CLT_GREEN_BEANS",
        new ItemStack(Material.FROGSPAWN),
        CultivationThemes.PRODUCE,
        "Green Beans",
        "How creatively named!"
    );

    public static final SlimefunItemStack CHICKPEAS = CultivationThemes.themedSlimefunItemStack(
        "CLT_CHICKPEAS",
        new ItemStack(Material.BEETROOT_SEEDS),
        CultivationThemes.PRODUCE,
        "Chickpeas",
        "Black eyed peas can sing a tune, chickpeas can only hummus one."
    );

    public static final SlimefunItemStack SOY_BEANS = CultivationThemes.themedSlimefunItemStack(
        "CLT_SOY_BEANS",
        new ItemStack(Material.MELON_SEEDS),
        CultivationThemes.PRODUCE,
        "Soy Beans",
        "Soy milk cometh."
    );

    public static final SlimefunItemStack PINTO_BEANS = CultivationThemes.themedSlimefunItemStack(
        "CLT_PINTO_BEANS",
        new ItemStack(Material.MELON_SEEDS),
        CultivationThemes.PRODUCE,
        "Pinto Beans",
        "Kaching! It's burrito time."
    );

    public static final SlimefunItemStack RUNNER_BEANS = CultivationThemes.themedSlimefunItemStack(
        "CLT_RUNNER_BEANS",
        new ItemStack(Material.KELP),
        CultivationThemes.PRODUCE,
        "Runner Beans",
        "Always trying to get away."
    );

    public static final SlimefunItemStack NETTLES = CultivationThemes.themedSlimefunItemStack(
        "CLT_NETTLES",
        new ItemStack(Material.AZALEA_LEAVES),
        CultivationThemes.PRODUCE,
        "Nettles",
        "Please put on your gloves before holding these."
    );

    public static final SlimefunItemStack OKRA = CultivationThemes.themedSlimefunItemStack(
        "CLT_OKRA",
        Skins.LETTUCE.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "Okra",
        "Grown alot in okra-homa... right, RIGHT?"
    );

    public static final SlimefunItemStack LEEK = CultivationThemes.themedSlimefunItemStack(
        "CLT_LEEK",
        Skins.LEEK.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "Leek",
        "for some reason it's dripping with water?",
        "Perhaps it's sprung a leek?"
    );

    public static final SlimefunItemStack SHALLOT = CultivationThemes.themedSlimefunItemStack(
        "CLT_SHALLOT",
        Skins.ONION.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "Shallot",
        "I do love a lot of shallot."
    );

    public static final SlimefunItemStack JALAPENO = CultivationThemes.themedSlimefunItemStack(
        "CLT_JALAPENO",
        Skins.PEPPERS.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "Jalapeno",
        "HOT HOT HOT."
    );

    public static final SlimefunItemStack RADICCHIO = CultivationThemes.themedSlimefunItemStack(
        "CLT_RADICCHIO",
        Skins.RADDISH.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "Radicchio",
        "Writing all this lore takes so long.",
        "It's radicchio-less."
    );

    public static final SlimefunItemStack RHUBARB = CultivationThemes.themedSlimefunItemStack(
        "CLT_RHUBARB",
        Skins.LEEK.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "Rhubarb",
        "Just be sure to remove the leaves!"
    );

    public static final SlimefunItemStack CELERIAC = CultivationThemes.themedSlimefunItemStack(
        "CLT_CELERIAC",
        Skins.PARSNIP.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "Celeriac",
        "A hearty root that's rooted (heh) in many",
        "traditional recipes."
    );

    public static final SlimefunItemStack PARSNIP = CultivationThemes.themedSlimefunItemStack(
        "CLT_PARSNIP",
        Skins.PARSNIP.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "Parsnip",
        "Requires roasting immediately."
    );

    public static final SlimefunItemStack RUTABAGA = CultivationThemes.themedSlimefunItemStack(
        "CLT_RUTABAGA",
        Skins.RUTABAGA.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "Rutabaga",
        "It actually hurts not calling this a swede."
    );

    public static final SlimefunItemStack RADDISH = CultivationThemes.themedSlimefunItemStack(
        "CLT_RADDISH",
        Skins.RADDISH.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "Raddish",
        "Little pockets of fresh, crisp, sunshine."
    );

    public static final SlimefunItemStack SWEET_POTATO = CultivationThemes.themedSlimefunItemStack(
        "CLT_SWEET_POTATO",
        new ItemStack(Material.BEETROOT),
        CultivationThemes.PRODUCE,
        "Sweet Potato",
        "Yam yam yam."
    );

    public static final SlimefunItemStack TURNIP = CultivationThemes.themedSlimefunItemStack(
        "CLT_TURNIP",
        Skins.TURNIP.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "Turnip",
        "Will solve all of life's problems."
    );

    public static final SlimefunItemStack SWEETCORN = CultivationThemes.themedSlimefunItemStack(
        "CLT_SWEETCORN",
        Skins.CORN.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "Sweetcorn",
        "Perhaps the best vegetable around."
    );

    public static final SlimefunItemStack COURGETTE = CultivationThemes.themedSlimefunItemStack(
        "CLT_COURGETTE",
        new ItemStack(Material.BAMBOO),
        CultivationThemes.PRODUCE,
        "Courgette",
        "Pro Tip: Grate this into any pasta sauce",
        "for depth and texture."
    );

    public static final SlimefunItemStack CUCUMBER = CultivationThemes.themedSlimefunItemStack(
        "CLT_CUCUMBER",
        new ItemStack(Material.BAMBOO),
        CultivationThemes.PRODUCE,
        "Cucumber",
        "Water in a green shell, prove me",
        "wrong."
    );

    public static final SlimefunItemStack MARROW = CultivationThemes.themedSlimefunItemStack(
        "CLT_MARROW",
        Skins.SQUASH.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "Marrow",
        "Did you know marrows are found within",
        "your bones?",
        "Yup, Sefi Smort."
    );

    public static final SlimefunItemStack AVOCADO = CultivationThemes.themedSlimefunItemStack(
        "CLT_AVOCADO",
        Skins.AVOCADO.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "Avocado",
        "What hipsters dream about."
    );

    public static final SlimefunItemStack GREEN_ONION = CultivationThemes.themedSlimefunItemStack(
        "CLT_GREEN_ONION",
        Skins.GREEN_ONION.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "Green Onion",
        "Goes great on tacos!"
    );

    public static final SlimefunItemStack BLACK_PEPPER = CultivationThemes.themedSlimefunItemStack(
        "CLT_PEPPER",
        Skins.BLACK_PEPPER.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "Black Pepper",
        "Spicier than salt."
    );

    // endregion

    // region Crafted By Products

    public static final SlimefunItemStack PEANUT_BUTTER = CultivationThemes.themedSlimefunItemStack(
        "CLT_PEANUT_BUTTER",
        Skins.PEANUT_BUTTER.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "Peanut Butter",
        "Akin only to liquid gold."
    );

    public static final SlimefunItemStack GRAPE_JELLY = CultivationThemes.themedSlimefunItemStack(
        "CLT_GRAPE_JELLY",
        Skins.JAM_JAR_BLUE.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "Grape Jelly",
        "Eating it with a spoon is a criminal offence."
    );

    public static final SlimefunItemStack STRAWBERRY_JELLY = CultivationThemes.themedSlimefunItemStack(
        "CLT_STRAWBERRY_JELLY",
        Skins.JAM_JAR_RED.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "Strawberry Jelly",
        "Eating it with a spoon is a criminal offence."
    );

    public static final SlimefunItemStack OIL = CultivationThemes.themedSlimefunItemStack(
        "CLT_OIL",
        Skins.SPICE_YELLOW.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "Oil",
        "Oil. Need I say more?"
    );

    public static final SlimefunItemStack MAYONNAISE = CultivationThemes.themedSlimefunItemStack(
        "CLT_MAYONNAISE",
        new ItemStack(Material.MILK_BUCKET),
        CultivationThemes.PRODUCE,
        "Mayonnaise",
        "A silky smooth mayo that can go with nearly anything."
    );

    public static final SlimefunItemStack EGG_SALAD = CultivationThemes.themedSlimefunItemStack(
        "CLT_EGG_SALAD",
        Skins.SPICE_YELLOW.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "Egg Salad",
        "Open this on a train, I dare you!"
    );

    public static final SlimefunItemStack PIE_CRUST = CultivationThemes.themedSlimefunItemStack(
        "CLT_PIE_CRUST",
        Skins.PIE_CRUST.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "Pie Crust",
        "If it were legal to eat this own it's own",
        "it'd be my main food source."
    );

    public static final SlimefunItemStack PASTA = CultivationThemes.themedSlimefunItemStack(
        "CLT_PASTA",
        Skins.PASTA.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "Pasta",
        "Just plain pasta, simple yet wonderful."
    );

    public static final SlimefunItemStack BISCUIT_DOUGH = CultivationThemes.themedSlimefunItemStack(
        "CLT_BISCUIT_DOUGH",
        new ItemStack(Material.BROWN_DYE),
        CultivationThemes.PRODUCE,
        "Biscuit Dough",
        "Just remind yourself \"Don't eat it raw.\""
    );

    public static final SlimefunItemStack BISCUIT_BASE = CultivationThemes.themedSlimefunItemStack(
        "CLT_BISCUIT_BASE",
        new ItemStack(Material.OAK_TRAPDOOR),
        CultivationThemes.PRODUCE,
        "Biscuit Base",
        "Just 'cause it's flat now doesnt mean",
        "you can eat it raw."
    );

    public static final SlimefunItemStack MEATBALLS = CultivationThemes.themedSlimefunItemStack(
        "CLT_MEATBALLS",
        new ItemStack(Material.BROWN_DYE),
        CultivationThemes.PRODUCE,
        "Meatballs",
        "Balls of meat, who'd-a-thunk it."
    );

    public static final SlimefunItemStack PEPPERONI = CultivationThemes.themedSlimefunItemStack(
        "CLT_PEPPERONI",
        Skins.PEPPERONI.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "Pepperoni",
        "I could eat an entire log of this, easy."
    );

    public static final SlimefunItemStack DOUGH = CultivationThemes.themedSlimefunItemStack(
        "CLT_DOUGH",
        Skins.DOUGH.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "Dough",
        "Just plain ol' dough!"
    );

    public static final SlimefunItemStack CREAM_CHEESE = CultivationThemes.themedSlimefunItemStack(
        "CLT_CREAM_CHEESE",
        new ItemStack(Material.MILK_BUCKET),
        CultivationThemes.PRODUCE,
        "Cream Cheese",
        "More creamy than cheesy."
    );

    public static final SlimefunItemStack KETCHUP = CultivationThemes.themedSlimefunItemStack(
        "CLT_KETCHUP",
        Skins.JAM_JAR_RED.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "Ketchup",
        "Just tomatoes in a creamy form."
    );

    public static final SlimefunItemStack MUSTARD = CultivationThemes.themedSlimefunItemStack(
        "CLT_MUSTARD",
        Skins.JAM_JAR_YELLOW.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "Mustard",
        "Has a little kick to it!"
    );

    public static final SlimefunItemStack TORTILLAS = CultivationThemes.themedSlimefunItemStack(
        "CLT_TORTILLAS",
        Skins.TORILLAS.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "Tortillas",
        "Corn-flour delights"
    );

    public static final SlimefunItemStack PICO_DE_GALLO = CultivationThemes.themedSlimefunItemStack(
        "CLT_PICO_DE_GALLO",
        Skins.SALSA.getPlayerHead(),
        CultivationThemes.PRODUCE,
        "Pico de Gallo",
        "A mild salsa full of pure delicious."
    );

    public static final SlimefunItemStack COOKED_BURGER_PATTY = CultivationThemes.themedSlimefunItemStack(
        "CLT_COOKED_BURGER_PATTY",
        new ItemStack(Material.COOKED_BEEF),
        CultivationThemes.PRODUCE,
        "Cooked Burger Patty",
        "Practically dripping"
    );

    // endregion

    // region Finished Foods

    public static final SlimefunItemStack FOOD_PEANUT_BUTTER_JELLY_SANDWICH = CultivationThemes.themedSlimefunItemStack(
        "CLT_PEANUT_BUTTER_JELLY_SANDWICH",
        Skins.PEANUT_BUTTER_JELLY_SANDWICH.getPlayerHead(),
        CultivationThemes.FOOD,
        "Peanut Butter Jelly Sandwich",
        "It really is the pinnacle of sandwich technology.",
        "",
        Theme.CLICK_INFO.asTitle("Healing", "5 Hearts"),
        Theme.CLICK_INFO.asTitle("Effect 1", "Power + 3")
    );

    public static final SlimefunItemStack EGG_SALAD_SANDWICH = CultivationThemes.themedSlimefunItemStack(
        "CLT_EGG_SALAD_SANDWICH",
        Skins.CHEESY_SANDWICH.getPlayerHead(),
        CultivationThemes.FOOD,
        "Egg Salad Sandwich",
        "Smells a bit, but tastes amazing!",
        "",
        Theme.CLICK_INFO.asTitle("Healing", "5 Hearts"),
        Theme.CLICK_INFO.asTitle("Effect 1", "Haste + 2")
    );

    public static final SlimefunItemStack BACON_SANDWICH = CultivationThemes.themedSlimefunItemStack(
        "CLT_BACON_SANDWICH",
        Skins.MEATY_SANDWICH.getPlayerHead(),
        CultivationThemes.FOOD,
        "Bacon Sandwich",
        "A simple classic!",
        "",
        Theme.CLICK_INFO.asTitle("Healing", "2 Hearts"),
        Theme.CLICK_INFO.asTitle("Effect 1", "Power + 1"),
        Theme.CLICK_INFO.asTitle("Effect 2", "Speed + 1")
    );

    public static final SlimefunItemStack SALMON_NIGIRI = CultivationThemes.themedSlimefunItemStack(
        "CLT_SALMON_NIGIRI",
        Skins.SUSHI_SALMON.getPlayerHead(),
        CultivationThemes.FOOD,
        "Salmon Nigiri",
        "A delightful yet subtle flavour.",
        "",
        Theme.CLICK_INFO.asTitle("Healing", "2 Hearts"),
        Theme.CLICK_INFO.asTitle("Effect 1", "Regen + 1")
    );

    public static final SlimefunItemStack CAJUN_GARLIC_BUTTER_COD = CultivationThemes.themedSlimefunItemStack(
        "CLT_CAJUN_GARLIC_BUTTER_COD",
        Skins.MEAL_RED_GREEN_BROWN.getPlayerHead(),
        CultivationThemes.FOOD,
        "Cajun Garlic Butter Cod",
        "A very simple dish busting with flavour.",
        "",
        Theme.CLICK_INFO.asTitle("Healing", "4 Hearts"),
        Theme.CLICK_INFO.asTitle("Effect 1", "Regen + 2"),
        Theme.CLICK_INFO.asTitle("Effect 2", "Speed + 1")
    );

    public static final SlimefunItemStack SHAKSHUKA = CultivationThemes.themedSlimefunItemStack(
        "CLT_SHAKSHUKA",
        Skins.SHAKSHUKA.getPlayerHead(),
        CultivationThemes.FOOD,
        "Shakshuka",
        "A heart warming dish with eggs for days.",
        "",
        Theme.CLICK_INFO.asTitle("Healing", "4 Hearts"),
        Theme.CLICK_INFO.asTitle("Effect 1", "Hero of the Village + 1"),
        Theme.CLICK_INFO.asTitle("Effect 2", "Luck + 1")
    );

    public static final SlimefunItemStack FUGU = CultivationThemes.themedSlimefunItemStack(
        "CLT_FUGU",
        Skins.SUSHI_TUNA.getPlayerHead(),
        CultivationThemes.FOOD,
        "Fugu",
        "Ready to roll the dice?",
        "",
        Theme.CLICK_INFO.asTitle("Healing", "1 Hearts"),
        Theme.CLICK_INFO.asTitle("Effect 1", "Power + 5"),
        Theme.CLICK_INFO.asTitle("Effect 2", "33% Chance to just die!")
    );

    public static final SlimefunItemStack SHEPHERDS_PIE = CultivationThemes.themedSlimefunItemStack(
        "CLT_SHEPHERDS_PIE",
        Skins.MEAL_YELLOW_RED_BROWN.getPlayerHead(),
        CultivationThemes.FOOD,
        "Shepherds Pie",
        "Warm, hearty and simply wonderful.",
        "",
        Theme.CLICK_INFO.asTitle("Healing", "10 Hearts"),
        Theme.CLICK_INFO.asTitle("Effect 1", "Regen + 2")
    );

    public static final SlimefunItemStack CHICKEN_POT_PIE = CultivationThemes.themedSlimefunItemStack(
        "CLT_CHICKEN_POT_PIE",
        Skins.PIE_BROWN.getPlayerHead(),
        CultivationThemes.FOOD,
        "Chicken Pot Pie",
        "A warming meal that really hits home.",
        "",
        Theme.CLICK_INFO.asTitle("Healing", "10 Hearts"),
        Theme.CLICK_INFO.asTitle("Effect 1", "Jump + 2"),
        Theme.CLICK_INFO.asTitle("Effect 2", "Saturation + 1")
    );

    public static final SlimefunItemStack CHICKEN_PASTA_BAKE = CultivationThemes.themedSlimefunItemStack(
        "CLT_CHICKEN_PASTA_BAKE",
        Skins.PASTA_BAKE.getPlayerHead(),
        CultivationThemes.FOOD,
        "Chicken Pasta Bake",
        "A student staple.",
        "",
        Theme.CLICK_INFO.asTitle("Healing", "5 Hearts"),
        Theme.CLICK_INFO.asTitle("Effect 1", "Night Vision + 1"),
        Theme.CLICK_INFO.asTitle("Effect 2", "Water Breathing + 1")
    );

    public static final SlimefunItemStack CHICKEN_ALFREDO_MAC_AND_CHEESE = CultivationThemes.themedSlimefunItemStack(
        "CLT_CHICKEN_ALFREDO_MAC_AND_CHEESE",
        Skins.MAC_AND_CHEESE.getPlayerHead(),
        CultivationThemes.FOOD,
        "Chicken Alfredo Mac and Cheese",
        "A posh twist on a common classic.",
        "",
        Theme.CLICK_INFO.asTitle("Healing", "1 Hearts"),
        Theme.CLICK_INFO.asTitle("Effect 1", "Fire Resistance + 2"),
        Theme.CLICK_INFO.asTitle("Effect 2", "Damage Resistance + 3")
    );

    public static final SlimefunItemStack KEY_LIME_PIE = CultivationThemes.themedSlimefunItemStack(
        "CLT_KEY_LIME_PIE",
        Skins.PIE_LIME.getPlayerHead(),
        CultivationThemes.FOOD,
        "Key Lime Pie",
        "Simply the best!",
        "",
        Theme.CLICK_INFO.asTitle("Healing", "6 Hearts"),
        Theme.CLICK_INFO.asTitle("Effect 1", "Haste + 4")
    );

    public static final SlimefunItemStack FRUIT_SALAD = CultivationThemes.themedSlimefunItemStack(
        "CLT_FRUIT_SALAD",
        Skins.FRUIT_SALAD.getPlayerHead(),
        CultivationThemes.FOOD,
        "Fruit Salad",
        "If you call it a salad, you can eat as much",
        "as you like, 'cause it's healthy.",
        "",
        Theme.CLICK_INFO.asTitle("Healing", "2 Hearts"),
        Theme.CLICK_INFO.asTitle("Effect 1", "Speed + 3")
    );

    public static final SlimefunItemStack CAESAR_SALAD = CultivationThemes.themedSlimefunItemStack(
        "CLT_CAESAR_SALAD",
        Skins.FRUIT_SALAD.getPlayerHead(),
        CultivationThemes.FOOD,
        "Caesar Salad",
        "A healthy classic.",
        "",
        Theme.CLICK_INFO.asTitle("Healing", "4 Hearts"),
        Theme.CLICK_INFO.asTitle("Effect 1", "Speed + 1"),
        Theme.CLICK_INFO.asTitle("Effect 2", "Invisibility + 1"),
        Theme.CLICK_INFO.asTitle("Effect 3", "Slow Falling + 1")
    );

    public static final SlimefunItemStack BISCUIT = CultivationThemes.themedSlimefunItemStack(
        "CLT_BISCUIT",
        new ItemStack(Material.COOKIE),
        CultivationThemes.FOOD,
        "Biscuit",
        "A little snack with a huge taste.",
        "",
        Theme.CLICK_INFO.asTitle("Effect 1", "Launches you into the air")
    );

    public static final SlimefunItemStack COMPRESSED_BISCUIT = CultivationThemes.themedSlimefunItemStack(
        "CLT_COMPRESSED_BISCUIT",
        new ItemStack(Material.COOKIE),
        CultivationThemes.FOOD,
        "Compressed Biscuit",
        "A little snack with a huge-er taste.",
        "",
        Theme.CLICK_INFO.asTitle("Effect 1", "Launches you into the air")
    );

    public static final SlimefunItemStack LEMON_DROP = CultivationThemes.themedSlimefunItemStack(
        "CLT_LEMON_DROP",
        new ItemStack(Material.YELLOW_DYE),
        CultivationThemes.FOOD,
        "Lemon Drop",
        "A palette cleanser.",
        "",
        Theme.CLICK_INFO.asTitle("Effect 1", "Clears all effects and makes you hungry again.")
    );

    public static final SlimefunItemStack GRILLED_SALMON_SALAD = CultivationThemes.themedSlimefunItemStack(
        "CLT_GRILLED_SALMON_SALAD",
        Skins.MEAL_SALAD.getPlayerHead(),
        CultivationThemes.FOOD,
        "Grilled Salmon Salad",
        "Delightfully flaky and brilliantly seasoned.",
        "",
        Theme.CLICK_INFO.asTitle("Healing", "4 Hearts"),
        Theme.CLICK_INFO.asTitle("Effect 1", "Regeneration + 1"),
        Theme.CLICK_INFO.asTitle("Effect 2", "Health Boost + 5")
    );

    public static final SlimefunItemStack WITHER_ROSE_SALAD = CultivationThemes.themedSlimefunItemStack(
        "CLT_WITHER_ROSE_SALAD",
        Skins.MEAL_SALAD.getPlayerHead(),
        CultivationThemes.FOOD,
        "Wither Rose Salad",
        "Teeming with power but with a harsh side-effect.",
        "",
        Theme.CLICK_INFO.asTitle("Healing", "Full"),
        Theme.CLICK_INFO.asTitle("Effect 1", "Health Boost + 20"),
        Theme.CLICK_INFO.asTitle("Effect 2", "Wither + 2")
    );

    public static final SlimefunItemStack ORANGE_JUICE = CultivationThemes.themedSlimefunItemStack(
        "CLT_ORANGE_JUICE",
        ItemStackGenerators.createPotion(Color.YELLOW),
        CultivationThemes.FOOD,
        "Orange Juice",
        "It really is the best way to start the day.",
        "",
        Theme.CLICK_INFO.asTitle("Effect 1", "Speed + 4")
    );

    public static final SlimefunItemStack LASAGNA = CultivationThemes.themedSlimefunItemStack(
        "CLT_LASAGNA",
        Skins.MEAL_YELLOW_RED_BROWN.getPlayerHead(),
        CultivationThemes.FOOD,
        "Lasagna",
        "Layers of awesomeness.",
        "",
        Theme.CLICK_INFO.asTitle("Healing", "Full"),
        Theme.CLICK_INFO.asTitle("Effect 1", "Regeneration + 1"),
        Theme.CLICK_INFO.asTitle("Effect 2", "Damage Reduction + 1")
    );

    public static final SlimefunItemStack SPAGHETTI = CultivationThemes.themedSlimefunItemStack(
        "CLT_SPAGHETTI",
        Skins.SPAGHETTI.getPlayerHead(),
        CultivationThemes.FOOD,
        "Spaghetti",
        "Just keep slurping.",
        "",
        Theme.CLICK_INFO.asTitle("Healing", "1 Heart")
    );

    public static final SlimefunItemStack SPAGHETTI_AND_MEATBALLS = CultivationThemes.themedSlimefunItemStack(
        "CLT_SPAGHETTI_AND_MEATBALLS",
        Skins.SPAGHETTI.getPlayerHead(),
        CultivationThemes.FOOD,
        "Spaghetti and Meatballs",
        "Simple, classic and hearty.",
        "",
        Theme.CLICK_INFO.asTitle("Healing", "4 Hearts"),
        Theme.CLICK_INFO.asTitle("Effect 1", "Bad Omen + 1")
    );

    public static final SlimefunItemStack PIZZA_CHEESE = CultivationThemes.themedSlimefunItemStack(
        "CLT_PIZZA_CHEESE",
        Skins.PIZZA_CHEESE.getPlayerHead(),
        CultivationThemes.FOOD,
        "Cheese Pizza",
        "Why anyone would order just cheese? I dont know.",
        "",
        Theme.CLICK_INFO.asTitle("Healing", "4 Hearts"),
        Theme.CLICK_INFO.asTitle("Effect 1", "Slowness + 1")
    );

    public static final SlimefunItemStack PIZZA_MUSHROOM = CultivationThemes.themedSlimefunItemStack(
        "CLT_PIZZA_MUSHROOM",
        Skins.PIZZA_MUSHROOM.getPlayerHead(),
        CultivationThemes.FOOD,
        "Mushroom Pizza",
        "A simple vegetarian pizza full of proteins.",
        "",
        Theme.CLICK_INFO.asTitle("Healing", "6 Hearts"),
        Theme.CLICK_INFO.asTitle("Effect 1", "Slowness + 1"),
        Theme.CLICK_INFO.asTitle("Effect 1", "Haste + 2")
    );

    public static final SlimefunItemStack PIZZA_PEPPERONI = CultivationThemes.themedSlimefunItemStack(
        "CLT_PIZZA_PEPPERONI",
        Skins.PIZZA_PEPPERONI.getPlayerHead(),
        CultivationThemes.FOOD,
        "Pepperoni Pizza",
        "A New York classic full of flavour.",
        "",
        Theme.CLICK_INFO.asTitle("Healing", "6 Hearts"),
        Theme.CLICK_INFO.asTitle("Effect 1", "Speed + 1"),
        Theme.CLICK_INFO.asTitle("Effect 1", "Haste + 1"),
        Theme.CLICK_INFO.asTitle("Effect 1", "Jump + 1")
    );

    public static final SlimefunItemStack CHEESY_SCALLOPED_COURGETTE = CultivationThemes.themedSlimefunItemStack(
        "CLT_CHEESY_SCALLOPED_COURGETTE",
        Skins.MEAL_RED_GREEN_BROWN.getPlayerHead(),
        CultivationThemes.FOOD,
        "Cheesy Scalloped Courgette",
        "A low carb version of an amazing classic.",
        "",
        Theme.CLICK_INFO.asTitle("Healing", "2 Hearts"),
        Theme.CLICK_INFO.asTitle("Effect 1", "Night Vision + 1"),
        Theme.CLICK_INFO.asTitle("Effect 1", "Invisibility + 1")
    );

    public static final SlimefunItemStack PECAN_PIE = CultivationThemes.themedSlimefunItemStack(
        "CLT_PECAN_PIE",
        Skins.PIE_BROWN.getPlayerHead(),
        CultivationThemes.FOOD,
        "Pecan Pie",
        "The only way to eat pure sugar without",
        "being totally judged.",
        "",
        Theme.CLICK_INFO.asTitle("Healing", "4 Hearts"),
        Theme.CLICK_INFO.asTitle("Effect 1", "Levitation + 1")
    );

    public static final SlimefunItemStack GARLIC_BUTTER_MUSHROOMS = CultivationThemes.themedSlimefunItemStack(
        "CLT_GARLIC_BUTTER_MUSHROOMS",
        new ItemStack(Material.MUSHROOM_STEW),
        CultivationThemes.FOOD,
        "Garlic Butter Mushrooms",
        "May easily be the best food item on earth.",
        "",
        Theme.CLICK_INFO.asTitle("Healing", "2 Hearts"),
        Theme.CLICK_INFO.asTitle("Effect 1", "Glowing + 1")
    );

    public static final SlimefunItemStack RAMEN_BEEF = CultivationThemes.themedSlimefunItemStack(
        "CLT_RAMEN_BEEF",
        Skins.RAMEN_BEEF.getPlayerHead(),
        CultivationThemes.FOOD,
        "Ramen (Beef)",
        "A not-so-healthy choice.",
        "",
        Theme.CLICK_INFO.asTitle("Effect 1", "Health Boost + 1")
    );

    public static final SlimefunItemStack RAMEN_CHICKEN = CultivationThemes.themedSlimefunItemStack(
        "CLT_RAMEN_CHICKEN",
        Skins.RAMEN_CHICKEN.getPlayerHead(),
        CultivationThemes.FOOD,
        "Ramen (Chicken)",
        "A not-so-filling choice.",
        "",
        Theme.CLICK_INFO.asTitle("Effect 1", "Health Boost + 1")
    );

    public static final SlimefunItemStack RAMEN_SEAFOOD = CultivationThemes.themedSlimefunItemStack(
        "CLT_RAMEN_SEAFOOD",
        Skins.RAMEN_SEAFOOD.getPlayerHead(),
        CultivationThemes.FOOD,
        "Ramen (Seafood)",
        "A not-so-satisfying choice.",
        "",
        Theme.CLICK_INFO.asTitle("Effect 1", "Health Boost + 1")
    );

    public static final SlimefunItemStack RAMEN_BEEF_HEARTY = CultivationThemes.themedSlimefunItemStack(
        "CLT_RAMEN_BEEF_HEARTY",
        Skins.RAMEN_HEARTY.getPlayerHead(),
        CultivationThemes.FOOD,
        "Ramen (Beef) (Hearty)",
        "A healthy choice.",
        "",
        Theme.CLICK_INFO.asTitle("Healing", "Full"),
        Theme.CLICK_INFO.asTitle("Effect 1", "Health Boost + 2"),
        Theme.CLICK_INFO.asTitle("Effect 2", "Speed + 1")
    );

    public static final SlimefunItemStack RAMEN_CHICKEN_HEARTY = CultivationThemes.themedSlimefunItemStack(
        "CLT_RAMEN_CHICKEN_HEARTY",
        Skins.RAMEN_HEARTY.getPlayerHead(),
        CultivationThemes.FOOD,
        "Ramen (Chicken) (Hearty)",
        "A filling choice.",
        "",
        Theme.CLICK_INFO.asTitle("Healing", "Full"),
        Theme.CLICK_INFO.asTitle("Effect 1", "Health Boost + 2"),
        Theme.CLICK_INFO.asTitle("Effect 2", "Speed + 1")
    );

    public static final SlimefunItemStack RAMEN_SEAFOOD_HEARTY = CultivationThemes.themedSlimefunItemStack(
        "CLT_RAMEN_SEAFOOD_HEARTY",
        Skins.RAMEN_HEARTY.getPlayerHead(),
        CultivationThemes.FOOD,
        "Ramen (Seafood) (Hearty)",
        "A satisfying choice.",
        "",
        Theme.CLICK_INFO.asTitle("Healing", "Full"),
        Theme.CLICK_INFO.asTitle("Effect 1", "Health Boost + 2"),
        Theme.CLICK_INFO.asTitle("Effect 2", "Speed + 1")
    );

    public static final SlimefunItemStack BAGEL = CultivationThemes.themedSlimefunItemStack(
        "CLT_BAGEL",
        Skins.BAGEL.getPlayerHead(),
        CultivationThemes.FOOD,
        "Bagel",
        "Toasted? or...",
        "",
        Theme.CLICK_INFO.asTitle("Healing", "5")
    );

    public static final SlimefunItemStack BAGEL_BITE = CultivationThemes.themedSlimefunItemStack(
        "CLT_BAGEL_BITE",
        Skins.BAGEL_BITE.getPlayerHead(),
        CultivationThemes.FOOD,
        "Bagel Bite",
        "Eat pizza anytime!",
        "",
        Theme.CLICK_INFO.asTitle("Effect 1", "Burns your mouth with every bite!")
    );

    public static final SlimefunItemStack BAGEL_CREAM_CHEESE = CultivationThemes.themedSlimefunItemStack(
        "CLT_BAGEL_CREAM_CHEESE",
        Skins.BAGEL_EVERYTHING.getPlayerHead(),
        CultivationThemes.FOOD,
        "Bagel (Cream Cheese)",
        "It's so good you'll probably want another.",
        "",
        Theme.CLICK_INFO.asTitle("Healing", "10"),
        Theme.CLICK_INFO.asTitle("Effect 1", "Health Boost + 1")
    );

    public static final SlimefunItemStack MEATLOAF = CultivationThemes.themedSlimefunItemStack(
        "CLT_MEATLOAF",
        Skins.MEATLOAF.getPlayerHead(),
        CultivationThemes.FOOD,
        "Meatloaf",
        "Nothing like it! Let's go.",
        "",
        Theme.CLICK_INFO.asTitle("Healing", "Full"),
        Theme.CLICK_INFO.asTitle("Effect 1", "Health Boost + 4"),
        Theme.CLICK_INFO.asTitle("Effect 2", "Damage Reduction + 3"),
        Theme.CLICK_INFO.asTitle("Effect 3", "Haste + 2"),
        Theme.CLICK_INFO.asTitle("Effect 4", "Slowness + 2")
    );

    public static final SlimefunItemStack SAUSAGE = CultivationThemes.themedSlimefunItemStack(
        "CLT_SAUSAGE",
        Skins.SAUSAGE.getPlayerHead(),
        CultivationThemes.FOOD,
        "Sausage",
        "Bacon's brother.",
        "",
        Theme.CLICK_INFO.asTitle("Healing", "2")
    );

    public static final SlimefunItemStack SOYLENT = CultivationThemes.themedSlimefunItemStack(
        "CLT_SOYLENT",
        ItemStackGenerators.createPotion(Color.WHITE),
        CultivationThemes.FOOD,
        "Soylent",
        "Everything the body needs!",
        "",
        Theme.CLICK_INFO.asTitle("Effect 1", "Bad Omen + 1"),
        Theme.CLICK_INFO.asTitle("Effect 2", "Weakness + 4")
    );

    public static final SlimefunItemStack TATER_TOTS = CultivationThemes.themedSlimefunItemStack(
        "CLT_TATER_TOTS",
        Skins.TATER_TOT.getPlayerHead(),
        CultivationThemes.FOOD,
        "Tater Tots",
        "Little potato poppables.",
        "",
        Theme.CLICK_INFO.asTitle("Healing", "1"),
        Theme.CLICK_INFO.asTitle("Effect 1", "Speed + 2")
    );

    public static final SlimefunItemStack SWEET_BEEHIVE = CultivationThemes.themedSlimefunItemStack(
        "CLT_SWEET_BEEHIVE",
        Skins.BEEHIVE.getPlayerHead(),
        CultivationThemes.FOOD,
        "Sweet Beehive",
        "Not sure what made you want to cook this!",
        "",
        Theme.CLICK_INFO.asTitle("Effect 1", "Summons some bees!")
    );

    public static final SlimefunItemStack TAQUITO = CultivationThemes.themedSlimefunItemStack(
        "CLT_TAQUITO",
        Skins.TAQUITO.getPlayerHead(),
        CultivationThemes.FOOD,
        "Taquito",
        "Zim would be proud!",
        "",
        Theme.CLICK_INFO.asTitle("Healing", "4"),
        Theme.CLICK_INFO.asTitle("Effect 1", "Summons Gir to help (It's an Iron Golem, relax).")
    );

    public static final SlimefunItemStack BOWL_OF_STEVE = CultivationThemes.themedSlimefunItemStack(
        "CLT_BOWL_OF_STEVE",
        Skins.STEVE_HEAD_BOWL.getPlayerHead(),
        CultivationThemes.FOOD,
        "Bowl of... Steve?",
        "What the actual &%£$",
        "",
        Theme.CLICK_INFO.asTitle("Effect 1", "Reduces you to 1/2 heart"),
        Theme.CLICK_INFO.asTitle("Effect 2", "Fatigue + 10"),
        Theme.CLICK_INFO.asTitle("Effect 3", "Slow + 5"),
        Theme.CLICK_INFO.asTitle("Effect 4", "Damage + 10")
    );

    public static final SlimefunItemStack CHEESE_BURGER = CultivationThemes.themedSlimefunItemStack(
        "CLT_CHEESE_BURGER",
        Skins.BURGER.getPlayerHead(),
        CultivationThemes.FOOD,
        "Burger",
        "A simple cheese burger, but nothing beats it!",
        "",
        Theme.CLICK_INFO.asTitle("Healing", "4"),
        Theme.CLICK_INFO.asTitle("Effect 1", "Regen + 3")
    );

    public static final SlimefunItemStack CINNAMON_ROLL = CultivationThemes.themedSlimefunItemStack(
        "CLT_CINNAMON_ROLL",
        Skins.CINNAMON_ROLL.getPlayerHead(),
        CultivationThemes.FOOD,
        "Cinnamon Roll",
        "A sweet delight rolled up for fun.",
        "Eating it turns the world on it's head!",
        "",
        Theme.CLICK_INFO.asTitle("Healing", "4"),
        Theme.CLICK_INFO.asTitle("Effect 1", "Levitation + 1"),
        Theme.CLICK_INFO.asTitle("Effect 2", "Slow Falling + 1")
    );

    public static final SlimefunItemStack BLUE_CANDY = CultivationThemes.themedSlimefunItemStack(
        "CLT_BLUE_CANDY",
        Skins.BLUE_CANDY.getPlayerHead(),
        CultivationThemes.FOOD,
        "Candy (Blue)",
        "A delightfully sweet candy.",
        "",
        Theme.CLICK_INFO.asTitle("Effect 1", "Spawns an Allay")
    );

    public static final SlimefunItemStack SOFT_BOILED_EGG = CultivationThemes.themedSlimefunItemStack(
        "CLT_SOFT_BOILED_EGG",
        Skins.BOILED_EGG.getPlayerHead(),
        CultivationThemes.FOOD,
        "Soft Boiled Egg",
        "Just a boiled egg, what's more to say.",
        "",
        Theme.CLICK_INFO.asTitle("Healing", "1"),
        Theme.CLICK_INFO.asTitle("Effect 1", "Can sometimes call a chicken to your aid.")
    );

    public static final SlimefunItemStack SUGARED_SKULL = CultivationThemes.themedSlimefunItemStack(
        "CLT_SUGARED_SKULL",
        Skins.SUGARED_SKULL.getPlayerHead(),
        CultivationThemes.FOOD,
        "Sugared Skull",
        "Is this even food...?",
        "",
        Theme.CLICK_INFO.asTitle("Effect 1", "Darkness + 3")
    );

    // end region
}
