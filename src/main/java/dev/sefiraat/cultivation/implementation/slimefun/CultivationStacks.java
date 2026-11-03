package dev.sefiraat.cultivation.implementation.slimefun;

import dev.sefiraat.cultivation.api.utils.Skins;
import dev.sefiraat.cultivation.libs.sefilib.itemstacks.ItemStackGenerators;
import io.github.thebusybiscuit.slimefun5.api.items.SlimefunItemStack;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public final class CultivationStacks {

    private CultivationStacks() {
        throw new IllegalStateException("Utility class");
    }

    // region Trees

    public static final SlimefunItemStack TREE_BANANA = new SlimefunItemStack("CLT_TREE_BANANA", new ItemStack(Material.ACACIA_SAPLING));

    public static final SlimefunItemStack TREE_LEMON = new SlimefunItemStack("CLT_TREE_LEMON", new ItemStack(Material.ACACIA_SAPLING));

    public static final SlimefunItemStack TREE_ORANGE = new SlimefunItemStack("CLT_TREE_ORANGE", new ItemStack(Material.JUNGLE_SAPLING));

    public static final SlimefunItemStack TREE_GREEN_APPLE = new SlimefunItemStack("CLT_TREE_GREEN_APPLE", new ItemStack(Material.BIRCH_SAPLING));

    public static final SlimefunItemStack TREE_PINEAPPLE = new SlimefunItemStack("CLT_TREE_PINEAPPLE", new ItemStack(Material.JUNGLE_SAPLING));

    public static final SlimefunItemStack TREE_MANGO = new SlimefunItemStack("CLT_TREE_MANGO", new ItemStack(Material.OAK_SAPLING));

    public static final SlimefunItemStack TREE_PEACH = new SlimefunItemStack("CLT_TREE_PEACH", new ItemStack(Material.BIRCH_SAPLING));

    public static final SlimefunItemStack TREE_APRICOT = new SlimefunItemStack("CLT_TREE_APRICOT", new ItemStack(Material.BIRCH_SAPLING));

    public static final SlimefunItemStack TREE_PEAR = new SlimefunItemStack("CLT_TREE_PEAR", new ItemStack(Material.ACACIA_SAPLING));

    public static final SlimefunItemStack TREE_CHERRY = new SlimefunItemStack("CLT_TREE_CHERRY", new ItemStack(Material.OAK_SAPLING));

    public static final SlimefunItemStack TREE_KIWI = new SlimefunItemStack("CLT_TREE_KIWI", new ItemStack(Material.BIRCH_SAPLING));

    public static final SlimefunItemStack TREE_LIME = new SlimefunItemStack("CLT_TREE_LIME", new ItemStack(Material.JUNGLE_SAPLING));

    public static final SlimefunItemStack TREE_CHESTNUT = new SlimefunItemStack("CLT_TREE_CHESTNUT", new ItemStack(Material.OAK_SAPLING));

    public static final SlimefunItemStack TREE_HAZELNUT = new SlimefunItemStack("CLT_TREE_HAZELNUT", new ItemStack(Material.OAK_SAPLING));

    public static final SlimefunItemStack TREE_PECAN = new SlimefunItemStack("CLT_TREE_PECAN", new ItemStack(Material.BIRCH_SAPLING));

    // endregion

    // region Bushes

    public static final SlimefunItemStack BUSH_GRAPE = new SlimefunItemStack("CLT_BUSH_GRAPE", Skins.SPIKEY_PURPLE_5.getPlayerHead());

    public static final SlimefunItemStack BUSH_PEANUTS = new SlimefunItemStack("CLT_BUSH_PEANUTS", Skins.SPIKEY_GREEN_5.getPlayerHead());

    public static final SlimefunItemStack BUSH_STRAWBERRY = new SlimefunItemStack("CLT_BUSH_STRAWBERRY", Skins.SPIKEY_RED_5.getPlayerHead());

    public static final SlimefunItemStack BUSH_RICE = new SlimefunItemStack("CLT_BUSH_RICE", Skins.SPIKEY_YELLOW_5.getPlayerHead());

    public static final SlimefunItemStack BUSH_GARLIC = new SlimefunItemStack("CLT_BUSH_GARLIC", Skins.SPIKEY_YELLOW_5.getPlayerHead());

    public static final SlimefunItemStack BUSH_CAYENNE_PEPPER = new SlimefunItemStack("CLT_BUSH_CAYENNE_PEPPER", Skins.SPIKEY_RED_5.getPlayerHead());

    public static final SlimefunItemStack BUSH_TOMATO = new SlimefunItemStack("CLT_BUSH_TOMATO", Skins.SPIKEY_RED_5.getPlayerHead());

    public static final SlimefunItemStack BUSH_BELL_PEPPER = new SlimefunItemStack("CLT_BUSH_BELL_PEPPER", Skins.SPIKEY_RED_5.getPlayerHead());

    public static final SlimefunItemStack BUSH_ONION = new SlimefunItemStack("CLT_BUSH_ONION", Skins.SPIKEY_YELLOW_5.getPlayerHead());

    public static final SlimefunItemStack BUSH_PEA = new SlimefunItemStack("CLT_BUSH_PEA", Skins.SPIKEY_GREEN_5.getPlayerHead());

    public static final SlimefunItemStack BUSH_RAPESEED = new SlimefunItemStack("CLT_BUSH_RAPESEED", Skins.SPIKEY_BLUE_5.getPlayerHead());

    public static final SlimefunItemStack BUSH_LETTUCE = new SlimefunItemStack("CLT_BUSH_LETTUCE", Skins.SPIKEY_GREEN_4.getPlayerHead());

    public static final SlimefunItemStack BUSH_MUSTARD = new SlimefunItemStack("CLT_BUSH_MUSTARD", Skins.SPIKEY_YELLOW_5.getPlayerHead());

    public static final SlimefunItemStack BUSH_BROCCOLI = new SlimefunItemStack("CLT_BUSH_BROCCOLI", Skins.SPIKEY_GREEN_5.getPlayerHead());

    public static final SlimefunItemStack BUSH_CINNAMON = new SlimefunItemStack("CLT_BUSH_CINNAMON", Skins.SPIKEY_ORANGE_5.getPlayerHead());

    public static final SlimefunItemStack BUSH_BASIL = new SlimefunItemStack("CLT_BUSH_BASIL", Skins.SPIKEY_GREEN_5.getPlayerHead());

    public static final SlimefunItemStack BUSH_BAY_LEAF = new SlimefunItemStack("CLT_BUSH_BAY_LEAF", Skins.SPIKEY_GREEN_5.getPlayerHead());

    public static final SlimefunItemStack BUSH_CILANTRO = new SlimefunItemStack("CLT_BUSH_CILANTRO", Skins.SPIKEY_GREEN_5.getPlayerHead());

    public static final SlimefunItemStack BUSH_CHICORY = new SlimefunItemStack("CLT_BUSH_CHICORY", Skins.SPIKEY_BLUE_5.getPlayerHead());

    public static final SlimefunItemStack BUSH_CHIVES = new SlimefunItemStack("CLT_BUSH_CHIVES", Skins.SPIKEY_GREEN_5.getPlayerHead());

    public static final SlimefunItemStack BUSH_CLOVE = new SlimefunItemStack("CLT_BUSH_CLOVE", Skins.SPIKEY_GREEN_5.getPlayerHead());

    public static final SlimefunItemStack BUSH_CUMIN = new SlimefunItemStack("CLT_BUSH_CUMIN", Skins.SPIKEY_YELLOW_5.getPlayerHead());

    public static final SlimefunItemStack BUSH_CHILLI_PEPPER = new SlimefunItemStack("CLT_BUSH_CHILLI_PEPPER", Skins.SPIKEY_RED_5.getPlayerHead());

    public static final SlimefunItemStack BUSH_CURRY_LEAF = new SlimefunItemStack("CLT_BUSH_CURRY_LEAF", Skins.SPIKEY_RED_5.getPlayerHead());

    public static final SlimefunItemStack BUSH_DILL = new SlimefunItemStack("CLT_BUSH_DILL", Skins.SPIKEY_GREEN_5.getPlayerHead());

    public static final SlimefunItemStack BUSH_FENNEL = new SlimefunItemStack("CLT_BUSH_FENNEL", Skins.SPIKEY_GREEN_5.getPlayerHead());

    public static final SlimefunItemStack BUSH_GINGER = new SlimefunItemStack("CLT_BUSH_GINGER", Skins.SPIKEY_YELLOW_5.getPlayerHead());

    public static final SlimefunItemStack BUSH_HORSERADISH = new SlimefunItemStack("CLT_BUSH_HORSERADISH", Skins.SPIKEY_YELLOW_5.getPlayerHead());

    public static final SlimefunItemStack BUSH_JASMINE = new SlimefunItemStack("CLT_BUSH_JASMINE", Skins.SPIKEY_YELLOW_5.getPlayerHead());

    public static final SlimefunItemStack BUSH_JUNIPER_BERRY = new SlimefunItemStack("CLT_BUSH_JUNIPER_BERRY", Skins.SPIKEY_BLUE_5.getPlayerHead());

    public static final SlimefunItemStack BUSH_KAFFIR_LIME = new SlimefunItemStack("CLT_BUSH_KAFFIR_LIME", Skins.SPIKEY_GREEN_5.getPlayerHead());

    public static final SlimefunItemStack BUSH_LAVENDER = new SlimefunItemStack("CLT_BUSH_LAVENDER", Skins.SPIKEY_PURPLE_5.getPlayerHead());

    public static final SlimefunItemStack BUSH_LICORICE = new SlimefunItemStack("CLT_BUSH_LICORICE", Skins.SPIKEY_YELLOW_5.getPlayerHead());

    public static final SlimefunItemStack BUSH_MACE = new SlimefunItemStack("CLT_BUSH_MACE", Skins.SPIKEY_PURPLE_5.getPlayerHead());

    public static final SlimefunItemStack BUSH_MARJORAM = new SlimefunItemStack("CLT_BUSH_MARJORAM", Skins.SPIKEY_YELLOW_5.getPlayerHead());

    public static final SlimefunItemStack BUSH_MINT = new SlimefunItemStack("CLT_BUSH_MINT", Skins.SPIKEY_GREEN_5.getPlayerHead());

    public static final SlimefunItemStack BUSH_OREGANO = new SlimefunItemStack("CLT_BUSH_OREGANO", Skins.SPIKEY_GREEN_5.getPlayerHead());

    public static final SlimefunItemStack BUSH_PARSLEY = new SlimefunItemStack("CLT_BUSH_PARSLEY", Skins.SPIKEY_GREEN_5.getPlayerHead());

    public static final SlimefunItemStack BUSH_ROSEMARY = new SlimefunItemStack("CLT_BUSH_ROSEMARY", Skins.SPIKEY_GREEN_5.getPlayerHead());

    public static final SlimefunItemStack BUSH_SASSAFRAS = new SlimefunItemStack("CLT_BUSH_SASSAFRAS", Skins.SPIKEY_GREEN_5.getPlayerHead());

    public static final SlimefunItemStack BUSH_SHISO = new SlimefunItemStack("CLT_BUSH_SHISO", Skins.SPIKEY_PURPLE_5.getPlayerHead());

    public static final SlimefunItemStack BUSH_STAR_ANISE = new SlimefunItemStack("CLT_BUSH_STAR_ANISE", Skins.SPIKEY_ORANGE_5.getPlayerHead());

    public static final SlimefunItemStack BUSH_TARRAGON = new SlimefunItemStack("CLT_BUSH_TARRAGON", Skins.SPIKEY_GREEN_5.getPlayerHead());

    public static final SlimefunItemStack BUSH_THYME = new SlimefunItemStack("CLT_BUSH_THYME", Skins.SPIKEY_GREEN_5.getPlayerHead());

    public static final SlimefunItemStack BUSH_TURMERIC = new SlimefunItemStack("CLT_BUSH_TURMERIC", Skins.SPIKEY_YELLOW_5.getPlayerHead());

    public static final SlimefunItemStack BUSH_VANILLA = new SlimefunItemStack("CLT_BUSH_VANILLA", Skins.SPIKEY_YELLOW_5.getPlayerHead());

    public static final SlimefunItemStack BUSH_WASABI = new SlimefunItemStack("CLT_BUSH_WASABI", Skins.SPIKEY_GREEN_5.getPlayerHead());

    public static final SlimefunItemStack BUSH_ARTICHOKE = new SlimefunItemStack("CLT_BUSH_ARTICHOKE", Skins.SPIKEY_YELLOW_5.getPlayerHead());

    public static final SlimefunItemStack BUSH_AUBERGINE = new SlimefunItemStack("CLT_BUSH_AUBERGINE", Skins.SPIKEY_PURPLE_5.getPlayerHead());

    public static final SlimefunItemStack BUSH_ASPARAGUS = new SlimefunItemStack("CLT_BUSH_ASPARAGUS", Skins.SPIKEY_GREEN_5.getPlayerHead());

    public static final SlimefunItemStack BUSH_BRUSSELS_SPROUTS = new SlimefunItemStack("CLT_BUSH_BRUSSELS_SPROUTS", Skins.SPIKEY_GREEN_5.getPlayerHead());

    public static final SlimefunItemStack BUSH_CABBAGE = new SlimefunItemStack("CLT_BUSH_CABBAGE", Skins.SPIKEY_PURPLE_5.getPlayerHead());

    public static final SlimefunItemStack BUSH_CAULIFLOWER = new SlimefunItemStack("CLT_BUSH_CAULIFLOWER", Skins.SPIKEY_YELLOW_5.getPlayerHead());

    public static final SlimefunItemStack BUSH_CELERY = new SlimefunItemStack("CLT_BUSH_CELERY", Skins.SPIKEY_GREEN_5.getPlayerHead());

    public static final SlimefunItemStack BUSH_KALE = new SlimefunItemStack("CLT_BUSH_KALE", Skins.SPIKEY_GREEN_5.getPlayerHead());

    public static final SlimefunItemStack BUSH_SPINACH = new SlimefunItemStack("CLT_BUSH_SPINACH", Skins.SPIKEY_GREEN_5.getPlayerHead());

    public static final SlimefunItemStack BUSH_BLACK_BEANS = new SlimefunItemStack("CLT_BUSH_BLACK_BEANS", Skins.SPIKEY_PURPLE_5.getPlayerHead());

    public static final SlimefunItemStack BUSH_GREEN_BEANS = new SlimefunItemStack("CLT_BUSH_GREEN_BEANS", Skins.SPIKEY_GREEN_5.getPlayerHead());

    public static final SlimefunItemStack BUSH_CHICKPEAS = new SlimefunItemStack("CLT_BUSH_CHICKPEAS", Skins.SPIKEY_ORANGE_5.getPlayerHead());

    public static final SlimefunItemStack BUSH_SOY_BEANS = new SlimefunItemStack("CLT_BUSH_SOY_BEANS", Skins.SPIKEY_YELLOW_5.getPlayerHead());

    public static final SlimefunItemStack BUSH_PINTO_BEANS = new SlimefunItemStack("CLT_BUSH_PINTO_BEANS", Skins.SPIKEY_PURPLE_5.getPlayerHead());

    public static final SlimefunItemStack BUSH_RUNNER_BEANS = new SlimefunItemStack("CLT_BUSH_RUNNER_BEANS", Skins.SPIKEY_GREEN_5.getPlayerHead());

    public static final SlimefunItemStack BUSH_NETTLES = new SlimefunItemStack("CLT_BUSH_NETTLES", Skins.SPIKEY_GREEN_5.getPlayerHead());

    public static final SlimefunItemStack BUSH_OKRA = new SlimefunItemStack("CLT_BUSH_OKRA", Skins.SPIKEY_PURPLE_5.getPlayerHead());

    public static final SlimefunItemStack BUSH_LEEK = new SlimefunItemStack("CLT_BUSH_LEEK", Skins.SPIKEY_GREEN_5.getPlayerHead());

    public static final SlimefunItemStack BUSH_SHALLOT = new SlimefunItemStack("CLT_BUSH_SHALLOT", Skins.SPIKEY_PURPLE_5.getPlayerHead());

    public static final SlimefunItemStack BUSH_JALAPENO = new SlimefunItemStack("CLT_BUSH_JALAPENO", Skins.SPIKEY_RED_5.getPlayerHead());

    public static final SlimefunItemStack BUSH_RADICCHIO = new SlimefunItemStack("CLT_BUSH_RADICCHIO", Skins.SPIKEY_PURPLE_5.getPlayerHead());

    public static final SlimefunItemStack BUSH_RHUBARB = new SlimefunItemStack("CLT_BUSH_RHUBARB", Skins.SPIKEY_PURPLE_5.getPlayerHead());

    public static final SlimefunItemStack BUSH_CELERIAC = new SlimefunItemStack("CLT_BUSH_CELERIAC", Skins.SPIKEY_ORANGE_5.getPlayerHead());

    public static final SlimefunItemStack BUSH_PARSNIP = new SlimefunItemStack("CLT_BUSH_PARSNIP", Skins.SPIKEY_YELLOW_5.getPlayerHead());

    public static final SlimefunItemStack BUSH_RUTABAGA = new SlimefunItemStack("CLT_BUSH_RUTABAGA", Skins.SPIKEY_PURPLE_5.getPlayerHead());

    public static final SlimefunItemStack BUSH_RADDISH = new SlimefunItemStack("CLT_BUSH_RADDISH", Skins.SPIKEY_RED_5.getPlayerHead());

    public static final SlimefunItemStack BUSH_SWEET_POTATO = new SlimefunItemStack("CLT_BUSH_SWEET_POTATO", Skins.SPIKEY_PURPLE_5.getPlayerHead());

    public static final SlimefunItemStack BUSH_TURNIP = new SlimefunItemStack("CLT_BUSH_TURNIP", Skins.SPIKEY_ORANGE_5.getPlayerHead());

    public static final SlimefunItemStack BUSH_SWEETCORN = new SlimefunItemStack("CLT_BUSH_SWEETCORN", Skins.SPIKEY_YELLOW_5.getPlayerHead());

    public static final SlimefunItemStack BUSH_COURGETTE = new SlimefunItemStack("CLT_BUSH_COURGETTE", Skins.SPIKEY_GREEN_5.getPlayerHead());

    public static final SlimefunItemStack BUSH_CUCUMBER = new SlimefunItemStack("CLT_BUSH_CUCUMBER", Skins.SPIKEY_GREEN_5.getPlayerHead());

    public static final SlimefunItemStack BUSH_MARROW = new SlimefunItemStack("CLT_BUSH_MARROW", Skins.SPIKEY_GREEN_5.getPlayerHead());

    public static final SlimefunItemStack BUSH_AVOCADO = new SlimefunItemStack("CLT_BUSH_AVOCADO", Skins.SPIKEY_GREEN_5.getPlayerHead());

    public static final SlimefunItemStack BUSH_GREEN_ONION = new SlimefunItemStack("CLT_BUSH_GREEN_ONION", Skins.SPIKEY_GREEN_4.getPlayerHead());

    public static final SlimefunItemStack BUSH_BLACK_PEPPER = new SlimefunItemStack("CLT_BUSH_PEPPER", Skins.SPIKEY_PURPLE_5.getPlayerHead());

    // endregion

    // region Plants

    public static final SlimefunItemStack PLANT_DARKNESS = new SlimefunItemStack("CLT_PLANT_DARKNESS", Skins.SEED_RED.getPlayerHead());

    public static final SlimefunItemStack PLANT_LIGHT = new SlimefunItemStack("CLT_PLANT_LIGHT", Skins.SEED_YELLOW.getPlayerHead());

    public static final SlimefunItemStack PLANT_EARTH = new SlimefunItemStack("CLT_PLANT_EARTH", Skins.SEED_GREEN.getPlayerHead());

    public static final SlimefunItemStack PLANT_WATER = new SlimefunItemStack("CLT_PLANT_WATER", Skins.SEED_BLUE.getPlayerHead());

    public static final SlimefunItemStack PLANT_FIRE = new SlimefunItemStack("CLT_PLANT_FIRE", Skins.SEED_RED.getPlayerHead());

    public static final SlimefunItemStack PLANT_AIR = new SlimefunItemStack("CLT_PLANT_AIR", Skins.SEED_CYAN.getPlayerHead());

    public static final SlimefunItemStack PLANT_POWER = new SlimefunItemStack("CLT_PLANT_POWER", Skins.SEED_RED.getPlayerHead());

    public static final SlimefunItemStack PLANT_WEALTH = new SlimefunItemStack("CLT_PLANT_WEALTH", Skins.SEED_ORANGE.getPlayerHead());

    public static final SlimefunItemStack PLANT_SPECTRUM = new SlimefunItemStack("CLT_PLANT_SPECTRUM", Skins.SEED_BLUE.getPlayerHead());

    public static final SlimefunItemStack PLANT_DIRT = new SlimefunItemStack("CLT_PLANT_DIRT", Skins.SEED_PURPLE.getPlayerHead());

    public static final SlimefunItemStack PLANT_GRASS = new SlimefunItemStack("CLT_PLANT_GRASS", Skins.SEED_GREEN.getPlayerHead());

    public static final SlimefunItemStack PLANT_FLOWER = new SlimefunItemStack("CLT_PLANT_FLOWER", Skins.SEED_ORANGE.getPlayerHead());

    public static final SlimefunItemStack PLANT_VINE = new SlimefunItemStack("CLT_PLANT_VINE", Skins.SEED_GREEN.getPlayerHead());

    public static final SlimefunItemStack PLANT_SAND = new SlimefunItemStack("CLT_PLANT_SAND", Skins.SEED_YELLOW.getPlayerHead());

    public static final SlimefunItemStack PLANT_RED_SAND = new SlimefunItemStack("CLT_PLANT_RED_SAND", Skins.SEED_RED.getPlayerHead());

    public static final SlimefunItemStack PLANT_MOSS = new SlimefunItemStack("CLT_PLANT_MOSS", Skins.SEED_GREEN.getPlayerHead());

    public static final SlimefunItemStack PLANT_SAPLING = new SlimefunItemStack("CLT_PLANT_SAPLING", Skins.SEED_GREEN.getPlayerHead());

    public static final SlimefunItemStack PLANT_MUSHROOM = new SlimefunItemStack("CLT_PLANT_MUSHROOM", Skins.SEED_RED.getPlayerHead());

    public static final SlimefunItemStack PLANT_WITHER_ROSE = new SlimefunItemStack("CLT_PLANT_WITHER_ROSE", Skins.SEED_RED.getPlayerHead());

    public static final SlimefunItemStack PLANT_DARK_FLORA = new SlimefunItemStack("CLT_PLANT_DARK_FLORA", Skins.SEED_PURPLE.getPlayerHead());

    public static final SlimefunItemStack PLANT_GLOWING_VINE = new SlimefunItemStack("CLT_PLANT_GLOWING_VINE", Skins.SEED_YELLOW.getPlayerHead());

    public static final SlimefunItemStack PLANT_DIM_LIT = new SlimefunItemStack("CLT_PLANT_DIM_LIT", Skins.SEED_BLUE.getPlayerHead());

    public static final SlimefunItemStack PLANT_COW = new SlimefunItemStack("CLT_PLANT_COW", Skins.SEED_PURPLE.getPlayerHead());

    public static final SlimefunItemStack PLANT_CHICKEN = new SlimefunItemStack("CLT_PLANT_CHICKEN", Skins.SEED_CYAN.getPlayerHead());

    public static final SlimefunItemStack PLANT_FISH = new SlimefunItemStack("CLT_PLANT_FISH", Skins.SEED_BLUE.getPlayerHead());

    public static final SlimefunItemStack PLANT_TURTLE = new SlimefunItemStack("CLT_PLANT_TURTLE", Skins.SEED_GREEN.getPlayerHead());

    public static final SlimefunItemStack PLANT_VILLAGER = new SlimefunItemStack("CLT_PLANT_VILLAGER", Skins.SEED_YELLOW.getPlayerHead());

    public static final SlimefunItemStack PLANT_RABBIT = new SlimefunItemStack("CLT_PLANT_RABBIT", Skins.SEED_ORANGE.getPlayerHead());

    public static final SlimefunItemStack PLANT_SHEEP = new SlimefunItemStack("CLT_PLANT_SHEEP", Skins.SEED_YELLOW.getPlayerHead());

    public static final SlimefunItemStack PLANT_PIG = new SlimefunItemStack("CLT_PLANT_PIG", Skins.SEED_RED.getPlayerHead());

    public static final SlimefunItemStack PLANT_BEE = new SlimefunItemStack("CLT_PLANT_BEE", Skins.SEED_YELLOW.getPlayerHead());

    public static final SlimefunItemStack PLANT_SQUID = new SlimefunItemStack("CLT_PLANT_SQUID", Skins.SEED_PURPLE.getPlayerHead());

    public static final SlimefunItemStack PLANT_GLOW_SQUID = new SlimefunItemStack("CLT_PLANT_GLOW_SQUID", Skins.SEED_GREEN.getPlayerHead());

    public static final SlimefunItemStack PLANT_FROG = new SlimefunItemStack("CLT_PLANT_FROG", Skins.SEED_GREEN.getPlayerHead());

    public static final SlimefunItemStack PLANT_GOAT = new SlimefunItemStack("CLT_PLANT_GOAT", Skins.SEED_ORANGE.getPlayerHead());

    public static final SlimefunItemStack PLANT_RAINBOW = new SlimefunItemStack("CLT_PLANT_RAINBOW", Skins.SEED_BLUE.getPlayerHead());

    public static final SlimefunItemStack PLANT_WAXY = new SlimefunItemStack("CLT_PLANT_WAXY", Skins.SEED_YELLOW.getPlayerHead());

    public static final SlimefunItemStack PLANT_WOOLLY = new SlimefunItemStack("CLT_PLANT_WOOLLY", Skins.SEED_PURPLE.getPlayerHead());

    public static final SlimefunItemStack PLANT_TERRA = new SlimefunItemStack("CLT_PLANT_TERRA", Skins.SEED_PURPLE.getPlayerHead());

    public static final SlimefunItemStack PLANT_GLAZED = new SlimefunItemStack("CLT_PLANT_GLAZED", Skins.SEED_ORANGE.getPlayerHead());

    public static final SlimefunItemStack PLANT_DUSTY = new SlimefunItemStack("CLT_PLANT_DUSTY", Skins.SEED_YELLOW.getPlayerHead());

    public static final SlimefunItemStack PLANT_CONCRETE = new SlimefunItemStack("CLT_PLANT_CONCRETE", Skins.SEED_CYAN.getPlayerHead());

    public static final SlimefunItemStack PLANT_STAINED = new SlimefunItemStack("CLT_PLANT_STAINED", Skins.SEED_CYAN.getPlayerHead());

    public static final SlimefunItemStack PLANT_COBBLESTONE = new SlimefunItemStack("CLT_PLANT_COBBLESTONE", Skins.SEED_PURPLE.getPlayerHead());

    public static final SlimefunItemStack PLANT_GRAVEL = new SlimefunItemStack("CLT_PLANT_GRAVEL", Skins.SEED_PURPLE.getPlayerHead());

    public static final SlimefunItemStack PLANT_CLAY = new SlimefunItemStack("CLT_PLANT_CLAY", Skins.SEED_PURPLE.getPlayerHead());

    public static final SlimefunItemStack PLANT_IGNEOUS = new SlimefunItemStack("CLT_PLANT_IGNEOUS", Skins.SEED_BLUE.getPlayerHead());

    public static final SlimefunItemStack PLANT_DEEPSLATE = new SlimefunItemStack("CLT_PLANT_DEEPSLATE", Skins.SEED_BLUE.getPlayerHead());

    public static final SlimefunItemStack PLANT_REINFORCED = new SlimefunItemStack("CLT_PLANT_REINFORCED", Skins.SEED_BLUE.getPlayerHead());

    public static final SlimefunItemStack PLANT_BLACKSTONE = new SlimefunItemStack("CLT_PLANT_BLACKSTONE", Skins.SEED_PURPLE.getPlayerHead());

    public static final SlimefunItemStack PLANT_NETHERRACK = new SlimefunItemStack("CLT_PLANT_NETHERRACK", Skins.SEED_RED.getPlayerHead());

    public static final SlimefunItemStack PLANT_DARK_GRASS = new SlimefunItemStack("CLT_PLANT_DARK_GRASS", Skins.SEED_PURPLE.getPlayerHead());

    public static final SlimefunItemStack PLANT_MAGMA = new SlimefunItemStack("CLT_PLANT_MAGMA", Skins.SEED_RED.getPlayerHead());

    public static final SlimefunItemStack PLANT_SOUL = new SlimefunItemStack("CLT_PLANT_SOUL", Skins.SEED_RED.getPlayerHead());

    public static final SlimefunItemStack PLANT_BASALT = new SlimefunItemStack("CLT_PLANT_BASALT", Skins.SEED_PURPLE.getPlayerHead());

    public static final SlimefunItemStack PLANT_GLASS = new SlimefunItemStack("CLT_PLANT_GLASS", Skins.SEED_YELLOW.getPlayerHead());

    public static final SlimefunItemStack PLANT_MUD = new SlimefunItemStack("CLT_PLANT_MUD", Skins.SEED_BLUE.getPlayerHead());

    public static final SlimefunItemStack PLANT_END_STONE = new SlimefunItemStack("CLT_PLANT_END_STONE", Skins.SEED_YELLOW.getPlayerHead());

    public static final SlimefunItemStack PLANT_PURPUR = new SlimefunItemStack("CLT_PLANT_PURPUR", Skins.SEED_PURPLE.getPlayerHead());

    public static final SlimefunItemStack PLANT_COAL = new SlimefunItemStack("CLT_PLANT_COAL", Skins.SEED_RED.getPlayerHead());

    public static final SlimefunItemStack PLANT_RAW_IRON = new SlimefunItemStack("CLT_PLANT_RAW_IRON", Skins.SEED_RED.getPlayerHead());

    public static final SlimefunItemStack PLANT_RAW_COPPER = new SlimefunItemStack("CLT_PLANT_RAW_COPPER", Skins.SEED_ORANGE.getPlayerHead());

    public static final SlimefunItemStack PLANT_RAW_GOLD = new SlimefunItemStack("CLT_PLANT_RAW_GOLD", Skins.SEED_YELLOW.getPlayerHead());

    public static final SlimefunItemStack PLANT_REDSTONE = new SlimefunItemStack("CLT_PLANT_REDSTONE", Skins.SEED_RED.getPlayerHead());

    public static final SlimefunItemStack PLANT_LAPIS = new SlimefunItemStack("CLT_PLANT_LAPIS", Skins.SEED_BLUE.getPlayerHead());

    public static final SlimefunItemStack PLANT_DIAMOND = new SlimefunItemStack("CLT_PLANT_DIAMOND", Skins.SEED_BLUE.getPlayerHead());

    public static final SlimefunItemStack PLANT_EMERALD = new SlimefunItemStack("CLT_PLANT_EMERALD", Skins.SEED_GREEN.getPlayerHead());

    public static final SlimefunItemStack PLANT_NETHER_QUARTZ = new SlimefunItemStack("CLT_PLANT_NETHER_QUARTZ", Skins.SEED_PURPLE.getPlayerHead());

    public static final SlimefunItemStack PLANT_SCRAPPY = new SlimefunItemStack("CLT_PLANT_SCRAPPY", Skins.SEED_RED.getPlayerHead());

    public static final SlimefunItemStack PLANT_AMETHYST = new SlimefunItemStack("CLT_PLANT_AMETHYST", Skins.SEED_PURPLE.getPlayerHead());

    public static final SlimefunItemStack PLANT_ECHO = new SlimefunItemStack("CLT_PLANT_ECHO", Skins.SEED_PURPLE.getPlayerHead());

    public static final SlimefunItemStack PLANT_SKELETON = new SlimefunItemStack("CLT_PLANT_SKELETON", Skins.SEED_GREEN.getPlayerHead());

    public static final SlimefunItemStack PLANT_SPIDER = new SlimefunItemStack("CLT_PLANT_SPIDER", Skins.SEED_RED.getPlayerHead());

    public static final SlimefunItemStack PLANT_CREEPER = new SlimefunItemStack("CLT_PLANT_CREEPER", Skins.SEED_GREEN.getPlayerHead());

    public static final SlimefunItemStack PLANT_ZOMBIE = new SlimefunItemStack("CLT_PLANT_ZOMBIE", Skins.SEED_GREEN.getPlayerHead());

    public static final SlimefunItemStack PLANT_DROWNED = new SlimefunItemStack("CLT_PLANT_DROWNED", Skins.SEED_BLUE.getPlayerHead());

    public static final SlimefunItemStack PLANT_GUARDIAN = new SlimefunItemStack("CLT_PLANT_GUARDIAN", Skins.SEED_BLUE.getPlayerHead());

    public static final SlimefunItemStack PLANT_ELDER_GUARDIAN = new SlimefunItemStack("CLT_PLANT_ELDER_GUARDIAN", Skins.SEED_BLUE.getPlayerHead());

    public static final SlimefunItemStack PLANT_GHAST = new SlimefunItemStack("CLT_PLANT_GHAST", Skins.SEED_YELLOW.getPlayerHead());

    public static final SlimefunItemStack PLANT_SLIME = new SlimefunItemStack("CLT_PLANT_SLIME", Skins.SEED_GREEN.getPlayerHead());

    public static final SlimefunItemStack PLANT_MAGMA_CUBE = new SlimefunItemStack("CLT_PLANT_MAGMA_CUBE", Skins.SEED_RED.getPlayerHead());

    public static final SlimefunItemStack PLANT_BLAZE = new SlimefunItemStack("CLT_PLANT_BLAZE", Skins.SEED_RED.getPlayerHead());

    public static final SlimefunItemStack PLANT_WITHER_SKELETON = new SlimefunItemStack("CLT_PLANT_WITHER_SKELETON", Skins.SEED_PURPLE.getPlayerHead());

    public static final SlimefunItemStack PLANT_WITHER = new SlimefunItemStack("CLT_PLANT_WITHER", Skins.SEED_PURPLE.getPlayerHead());

    public static final SlimefunItemStack PLANT_PHANTOM = new SlimefunItemStack("CLT_PLANT_PHANTOM", Skins.SEED_BLUE.getPlayerHead());

    public static final SlimefunItemStack PLANT_SHULKER = new SlimefunItemStack("CLT_PLANT_SHULKER", Skins.SEED_PURPLE.getPlayerHead());

    public static final SlimefunItemStack PLANT_ENDERMAN = new SlimefunItemStack("CLT_PLANT_ENDERMAN", Skins.SEED_GREEN.getPlayerHead());

    public static final SlimefunItemStack PLANT_ENDER_DRAGON = new SlimefunItemStack("CLT_PLANT_ENDER_DRAGON", Skins.SEED_PURPLE.getPlayerHead());

    public static final SlimefunItemStack PLANT_WITCH = new SlimefunItemStack("CLT_PLANT_WITCH", Skins.SEED_PURPLE.getPlayerHead());

    // endregion

    // region Bushes


    // endregion

    // region Tools

    public static final SlimefunItemStack CROP_STICKS = new SlimefunItemStack("CLT_CROP_STICKS", new ItemStack(Material.STICK));

    public static final SlimefunItemStack PLANT_ANALYSER = new SlimefunItemStack("CLT_PLANT_ANALYSER", new ItemStack(Material.DIAMOND));

    public static final SlimefunItemStack RECIPE_UNLOCK = new SlimefunItemStack("CLT_RECIPE_UNLOCK", new ItemStack(Material.PAPER));

    public static final SlimefunItemStack SEED_PACK = new SlimefunItemStack("CLT_SEED_PACK", new ItemStack(Material.COMPOSTER));

    // endregion

    // region Machines

    public static final SlimefunItemStack GARDEN_CLOCHE = new SlimefunItemStack("CLT_GARDEN_CLOCHE", new ItemStack(Material.GLASS));

    public static final SlimefunItemStack COUNTER_NOTHING = new SlimefunItemStack("CLT_COUNTER_NOTHING", new ItemStack(Material.STRIPPED_DARK_OAK_LOG));

    public static final SlimefunItemStack COUNTER_CHOPPING = new SlimefunItemStack("CLT_COUNTER_CHOPPING", new ItemStack(Material.SMITHING_TABLE));

    public static final SlimefunItemStack COUNTER_SLICING = new SlimefunItemStack("CLT_COUNTER_SLICING", new ItemStack(Material.CARTOGRAPHY_TABLE));

    public static final SlimefunItemStack COUNTER_MASHER = new SlimefunItemStack("CLT_COUNTER_MASHER", new ItemStack(Material.CRAFTING_TABLE));

    public static final SlimefunItemStack COUNTER_GRINDER = new SlimefunItemStack("CLT_COUNTER_GRINDER", new ItemStack(Material.CAULDRON));

    public static final SlimefunItemStack COUNTER_BLENDER = new SlimefunItemStack("CLT_COUNTER_BLENDER", new ItemStack(Material.FLETCHING_TABLE));

    public static final SlimefunItemStack COUNTER_OVEN = new SlimefunItemStack("CLT_COUNTER_OVEN", new ItemStack(Material.FURNACE));

    public static final SlimefunItemStack COUNTER_FRYER = new SlimefunItemStack("CLT_COUNTER_FRYING", new ItemStack(Material.BLACK_STAINED_GLASS));

    public static final SlimefunItemStack COUNTER_BOILING = new SlimefunItemStack("CLT_COUNTER_BOILING", new ItemStack(Material.BLACK_STAINED_GLASS));

    public static final SlimefunItemStack COUNTER_GRILL = new SlimefunItemStack("CLT_COUNTER_GRILL", new ItemStack(Material.CAMPFIRE));

    public static final SlimefunItemStack COUNTER_FINISHING = new SlimefunItemStack("CLT_COUNTER_FINISHING", new ItemStack(Material.CRAFTING_TABLE));

    // endregion

    // region Produce

    public static final SlimefunItemStack BANANA = new SlimefunItemStack("CLT_BANANA", Skins.BANANA.getPlayerHead());

    public static final SlimefunItemStack LEMON = new SlimefunItemStack("CLT_LEMON", Skins.LEMON.getPlayerHead());

    public static final SlimefunItemStack ORANGE = new SlimefunItemStack("CLT_ORANGE", Skins.ORANGE.getPlayerHead());

    public static final SlimefunItemStack GREEN_APPLE = new SlimefunItemStack("CLT_GREEN_APPLE", Skins.GREEN_APPLE.getPlayerHead());

    public static final SlimefunItemStack PINEAPPLE = new SlimefunItemStack("CLT_PINEAPPLE", Skins.PINEAPPLE.getPlayerHead());

    public static final SlimefunItemStack MANGO = new SlimefunItemStack("CLT_MANGO", Skins.MANGO.getPlayerHead());

    public static final SlimefunItemStack PEACH = new SlimefunItemStack("CLT_PEACH", Skins.PEACH.getPlayerHead());

    public static final SlimefunItemStack APRICOT = new SlimefunItemStack("CLT_APRICOT", Skins.APRICOT.getPlayerHead());

    public static final SlimefunItemStack PEAR = new SlimefunItemStack("CLT_PEAR", Skins.PEAR.getPlayerHead());

    public static final SlimefunItemStack CHERRY = new SlimefunItemStack("CLT_CHERRY", Skins.CHERRY.getPlayerHead());

    public static final SlimefunItemStack KIWI = new SlimefunItemStack("CLT_KIWI", Skins.KIWI.getPlayerHead());

    public static final SlimefunItemStack LIME = new SlimefunItemStack("CLT_LIME", Skins.KIWI.getPlayerHead());

    public static final SlimefunItemStack CHESTNUT = new SlimefunItemStack("CLT_CHESTNUT", Skins.CHESTNUT.getPlayerHead());

    public static final SlimefunItemStack HAZELNUT = new SlimefunItemStack("CLT_HAZELNUT", Skins.HAZELNUT.getPlayerHead());

    public static final SlimefunItemStack PECAN = new SlimefunItemStack("CLT_PECAN", Skins.PECAN.getPlayerHead());

    public static final SlimefunItemStack GRAPE = new SlimefunItemStack("CLT_GRAPE", Skins.GRAPE.getPlayerHead());

    public static final SlimefunItemStack PEANUT = new SlimefunItemStack("CLT_PEANUT", Skins.PEANUT.getPlayerHead());

    public static final SlimefunItemStack STRAWBERRY = new SlimefunItemStack("CLT_STRAWBERRY", Skins.STRAWBERRY.getPlayerHead());

    public static final SlimefunItemStack RICE = new SlimefunItemStack("CLT_RICE", Skins.RICE.getPlayerHead());

    public static final SlimefunItemStack GARLIC = new SlimefunItemStack("CLT_GARLIC", Skins.GARLIC.getPlayerHead());

    public static final SlimefunItemStack CAYENNE_PEPPER = new SlimefunItemStack("CLT_CAYENNE_PEPPER", Skins.PEPPERS.getPlayerHead());

    public static final SlimefunItemStack TOMATO = new SlimefunItemStack("CLT_TOMATO", Skins.TOMATO.getPlayerHead());

    public static final SlimefunItemStack BELL_PEPPER = new SlimefunItemStack("CLT_BELL_PEPPER", Skins.BELL_PEPPER.getPlayerHead());

    public static final SlimefunItemStack ONION = new SlimefunItemStack("CLT_ONION", Skins.ONION.getPlayerHead());

    public static final SlimefunItemStack PEA = new SlimefunItemStack("CLT_PEA", Skins.GREEN_APPLE.getPlayerHead());

    public static final SlimefunItemStack RAPESEED = new SlimefunItemStack("CLT_RAPESEED", new ItemStack(Material.MELON_SEEDS));

    public static final SlimefunItemStack LETTUCE = new SlimefunItemStack("CLT_LETTUCE", Skins.LETTUCE.getPlayerHead());

    public static final SlimefunItemStack MUSTARD_SEEDS = new SlimefunItemStack("CLT_MUSTARD_SEEDS", new ItemStack(Material.PUMPKIN_SEEDS));

    public static final SlimefunItemStack BROCCOLI = new SlimefunItemStack("CLT_BROCCOLI", Skins.BROCCOLI.getPlayerHead());

    public static final SlimefunItemStack CINNAMON = new SlimefunItemStack("CLT_CINNAMON", new ItemStack(Material.STICK));

    public static final SlimefunItemStack BASIL = new SlimefunItemStack("CLT_BASIL", new ItemStack(Material.SMALL_DRIPLEAF));

    public static final SlimefunItemStack BAY_LEAF = new SlimefunItemStack("CLT_BAY_LEAF", new ItemStack(Material.LILY_PAD));

    public static final SlimefunItemStack CILANTRO = new SlimefunItemStack("CLT_CILANTRO", new ItemStack(Material.MANGROVE_LEAVES));

    public static final SlimefunItemStack CHICORY = new SlimefunItemStack("CLT_CHICORY", new ItemStack(Material.BLUE_ORCHID));

    public static final SlimefunItemStack CHIVES = new SlimefunItemStack("CLT_CHIVES", new ItemStack(Material.SEAGRASS));

    public static final SlimefunItemStack CLOVE = new SlimefunItemStack("CLT_CLOVE", new ItemStack(Material.POPPY));

    public static final SlimefunItemStack CUMIN = new SlimefunItemStack("CLT_CUMIN", new ItemStack(Material.DANDELION));

    public static final SlimefunItemStack CHILLI_PEPPER = new SlimefunItemStack("CLT_CHILLY_PEPPER", Skins.PEPPERS.getPlayerHead());

    public static final SlimefunItemStack CURRY_LEAF = new SlimefunItemStack("CLT_CURRY_LEAF", new ItemStack(Material.KELP));

    public static final SlimefunItemStack DILL = new SlimefunItemStack("CLT_DILL", new ItemStack(Material.SHORT_GRASS));

    public static final SlimefunItemStack FENNEL = new SlimefunItemStack("CLT_FENNEL", new ItemStack(Material.OXEYE_DAISY));

    public static final SlimefunItemStack GINGER = new SlimefunItemStack("CLT_GINGER", new ItemStack(Material.HANGING_ROOTS));

    public static final SlimefunItemStack HORSERADISH = new SlimefunItemStack("CLT_HORSERADISH", new ItemStack(Material.HANGING_ROOTS));

    public static final SlimefunItemStack JASMINE = new SlimefunItemStack("CLT_JASMINE", new ItemStack(Material.WHITE_TULIP));

    public static final SlimefunItemStack JUNIPER_BERRY = new SlimefunItemStack("CLT_JUNIPER_BERRY", new ItemStack(Material.GLOW_BERRIES));

    public static final SlimefunItemStack KAFFIR_LIME = new SlimefunItemStack("CLT_KAFFIR_LIME", new ItemStack(Material.KELP));

    public static final SlimefunItemStack LAVENDER = new SlimefunItemStack("CLT_LAVENDER", new ItemStack(Material.PURPLE_DYE));

    public static final SlimefunItemStack LICORICE = new SlimefunItemStack("CLT_LICORICE", new ItemStack(Material.HANGING_ROOTS));

    public static final SlimefunItemStack MACE = new SlimefunItemStack("CLT_MACE", new ItemStack(Material.RED_DYE));

    public static final SlimefunItemStack MARJORAM = new SlimefunItemStack("CLT_MARJORAM", new ItemStack(Material.DARK_OAK_LEAVES));

    public static final SlimefunItemStack MINT = new SlimefunItemStack("CLT_MINT", new ItemStack(Material.MANGROVE_LEAVES));

    public static final SlimefunItemStack OREGANO = new SlimefunItemStack("CLT_OREGANO", new ItemStack(Material.SPRUCE_LEAVES));

    public static final SlimefunItemStack PARSLEY = new SlimefunItemStack("CLT_PARSLEY", new ItemStack(Material.ACACIA_LEAVES));

    public static final SlimefunItemStack ROSEMARY = new SlimefunItemStack("CLT_ROSEMARY", new ItemStack(Material.BIRCH_LEAVES));

    public static final SlimefunItemStack SASSAFRAS = new SlimefunItemStack("CLT_SASSAFRAS", new ItemStack(Material.OAK_LEAVES));

    public static final SlimefunItemStack SHISO = new SlimefunItemStack("CLT_SHISO", new ItemStack(Material.MANGROVE_LEAVES));

    public static final SlimefunItemStack STAR_ANISE = new SlimefunItemStack("CLT_STAR_ANISE", new ItemStack(Material.NETHER_STAR));

    public static final SlimefunItemStack TARRAGON = new SlimefunItemStack("CLT_TARRAGON", new ItemStack(Material.JUNGLE_LEAVES));

    public static final SlimefunItemStack THYME = new SlimefunItemStack("CLT_THYME", new ItemStack(Material.BIRCH_LEAVES));

    public static final SlimefunItemStack TURMERIC = new SlimefunItemStack("CLT_TURMERIC", new ItemStack(Material.YELLOW_DYE));

    public static final SlimefunItemStack VANILLA = new SlimefunItemStack("CLT_VANILLA", new ItemStack(Material.BLACK_DYE));

    public static final SlimefunItemStack WASABI = new SlimefunItemStack("CLT_WASABI", new ItemStack(Material.HANGING_ROOTS));

    public static final SlimefunItemStack ARTICHOKE = new SlimefunItemStack("CLT_ARTICHOKE", Skins.CABBAGE.getPlayerHead());

    public static final SlimefunItemStack AUBERGINE = new SlimefunItemStack("CLT_AUBERGINE", Skins.AUBERGINE.getPlayerHead());

    public static final SlimefunItemStack ASPARAGUS = new SlimefunItemStack("CLT_ASPARAGUS", Skins.ASPARAGUS.getPlayerHead());

    public static final SlimefunItemStack BRUSSELS_SPROUTS = new SlimefunItemStack("CLT_BRUSSELS_SPROUTS", Skins.KALE.getPlayerHead());

    public static final SlimefunItemStack CABBAGE = new SlimefunItemStack("CLT_CABBAGE", Skins.CABBAGE.getPlayerHead());

    public static final SlimefunItemStack CAULIFLOWER = new SlimefunItemStack("CLT_CAULIFLOWER", Skins.CAULIFLOWER.getPlayerHead());

    public static final SlimefunItemStack CELERY = new SlimefunItemStack("CLT_CELERY", new ItemStack(Material.BAMBOO));

    public static final SlimefunItemStack KALE = new SlimefunItemStack("CLT_KALE", Skins.KALE.getPlayerHead());

    public static final SlimefunItemStack SPINACH = new SlimefunItemStack("CLT_SPINACH", new ItemStack(Material.KELP));

    public static final SlimefunItemStack BLACK_BEANS = new SlimefunItemStack("CLT_BLACK_BEANS", new ItemStack(Material.MELON_SEEDS));

    public static final SlimefunItemStack GREEN_BEANS = new SlimefunItemStack("CLT_GREEN_BEANS", new ItemStack(Material.FROGSPAWN));

    public static final SlimefunItemStack CHICKPEAS = new SlimefunItemStack("CLT_CHICKPEAS", new ItemStack(Material.BEETROOT_SEEDS));

    public static final SlimefunItemStack SOY_BEANS = new SlimefunItemStack("CLT_SOY_BEANS", new ItemStack(Material.MELON_SEEDS));

    public static final SlimefunItemStack PINTO_BEANS = new SlimefunItemStack("CLT_PINTO_BEANS", new ItemStack(Material.MELON_SEEDS));

    public static final SlimefunItemStack RUNNER_BEANS = new SlimefunItemStack("CLT_RUNNER_BEANS", new ItemStack(Material.KELP));

    public static final SlimefunItemStack NETTLES = new SlimefunItemStack("CLT_NETTLES", new ItemStack(Material.AZALEA_LEAVES));

    public static final SlimefunItemStack OKRA = new SlimefunItemStack("CLT_OKRA", Skins.LETTUCE.getPlayerHead());

    public static final SlimefunItemStack LEEK = new SlimefunItemStack("CLT_LEEK", Skins.LEEK.getPlayerHead());

    public static final SlimefunItemStack SHALLOT = new SlimefunItemStack("CLT_SHALLOT", Skins.ONION.getPlayerHead());

    public static final SlimefunItemStack JALAPENO = new SlimefunItemStack("CLT_JALAPENO", Skins.PEPPERS.getPlayerHead());

    public static final SlimefunItemStack RADICCHIO = new SlimefunItemStack("CLT_RADICCHIO", Skins.RADDISH.getPlayerHead());

    public static final SlimefunItemStack RHUBARB = new SlimefunItemStack("CLT_RHUBARB", Skins.LEEK.getPlayerHead());

    public static final SlimefunItemStack CELERIAC = new SlimefunItemStack("CLT_CELERIAC", Skins.PARSNIP.getPlayerHead());

    public static final SlimefunItemStack PARSNIP = new SlimefunItemStack("CLT_PARSNIP", Skins.PARSNIP.getPlayerHead());

    public static final SlimefunItemStack RUTABAGA = new SlimefunItemStack("CLT_RUTABAGA", Skins.RUTABAGA.getPlayerHead());

    public static final SlimefunItemStack RADDISH = new SlimefunItemStack("CLT_RADDISH", Skins.RADDISH.getPlayerHead());

    public static final SlimefunItemStack SWEET_POTATO = new SlimefunItemStack("CLT_SWEET_POTATO", new ItemStack(Material.BEETROOT));

    public static final SlimefunItemStack TURNIP = new SlimefunItemStack("CLT_TURNIP", Skins.TURNIP.getPlayerHead());

    public static final SlimefunItemStack SWEETCORN = new SlimefunItemStack("CLT_SWEETCORN", Skins.CORN.getPlayerHead());

    public static final SlimefunItemStack COURGETTE = new SlimefunItemStack("CLT_COURGETTE", new ItemStack(Material.BAMBOO));

    public static final SlimefunItemStack CUCUMBER = new SlimefunItemStack("CLT_CUCUMBER", new ItemStack(Material.BAMBOO));

    public static final SlimefunItemStack MARROW = new SlimefunItemStack("CLT_MARROW", Skins.SQUASH.getPlayerHead());

    public static final SlimefunItemStack AVOCADO = new SlimefunItemStack("CLT_AVOCADO", Skins.AVOCADO.getPlayerHead());

    public static final SlimefunItemStack GREEN_ONION = new SlimefunItemStack("CLT_GREEN_ONION", Skins.GREEN_ONION.getPlayerHead());

    public static final SlimefunItemStack BLACK_PEPPER = new SlimefunItemStack("CLT_PEPPER", Skins.BLACK_PEPPER.getPlayerHead());

    // endregion

    // region Crafted By Products

    public static final SlimefunItemStack PEANUT_BUTTER = new SlimefunItemStack("CLT_PEANUT_BUTTER", Skins.PEANUT_BUTTER.getPlayerHead());

    public static final SlimefunItemStack GRAPE_JELLY = new SlimefunItemStack("CLT_GRAPE_JELLY", Skins.JAM_JAR_BLUE.getPlayerHead());

    public static final SlimefunItemStack STRAWBERRY_JELLY = new SlimefunItemStack("CLT_STRAWBERRY_JELLY", Skins.JAM_JAR_RED.getPlayerHead());

    public static final SlimefunItemStack MAYONNAISE = new SlimefunItemStack("CLT_MAYONNAISE", new ItemStack(Material.MILK_BUCKET));

    public static final SlimefunItemStack EGG_SALAD = new SlimefunItemStack("CLT_EGG_SALAD", Skins.SPICE_YELLOW.getPlayerHead());

    public static final SlimefunItemStack PIE_CRUST = new SlimefunItemStack("CLT_PIE_CRUST", Skins.PIE_CRUST.getPlayerHead());

    public static final SlimefunItemStack PASTA = new SlimefunItemStack("CLT_PASTA", Skins.PASTA.getPlayerHead());

    public static final SlimefunItemStack BISCUIT_DOUGH = new SlimefunItemStack("CLT_BISCUIT_DOUGH", new ItemStack(Material.BROWN_DYE));

    public static final SlimefunItemStack BISCUIT_BASE = new SlimefunItemStack("CLT_BISCUIT_BASE", new ItemStack(Material.OAK_TRAPDOOR));

    public static final SlimefunItemStack MEATBALLS = new SlimefunItemStack("CLT_MEATBALLS", new ItemStack(Material.BROWN_DYE));

    public static final SlimefunItemStack PEPPERONI = new SlimefunItemStack("CLT_PEPPERONI", Skins.PEPPERONI.getPlayerHead());

    public static final SlimefunItemStack DOUGH = new SlimefunItemStack("CLT_DOUGH", Skins.DOUGH.getPlayerHead());

    public static final SlimefunItemStack CREAM_CHEESE = new SlimefunItemStack("CLT_CREAM_CHEESE", new ItemStack(Material.MILK_BUCKET));

    public static final SlimefunItemStack KETCHUP = new SlimefunItemStack("CLT_KETCHUP", Skins.JAM_JAR_RED.getPlayerHead());

    public static final SlimefunItemStack MUSTARD = new SlimefunItemStack("CLT_MUSTARD", Skins.JAM_JAR_YELLOW.getPlayerHead());

    public static final SlimefunItemStack TORTILLAS = new SlimefunItemStack("CLT_TORTILLAS", Skins.TORILLAS.getPlayerHead());

    public static final SlimefunItemStack PICO_DE_GALLO = new SlimefunItemStack("CLT_PICO_DE_GALLO", Skins.SALSA.getPlayerHead());

    public static final SlimefunItemStack COOKED_BURGER_PATTY = new SlimefunItemStack("CLT_COOKED_BURGER_PATTY", new ItemStack(Material.COOKED_BEEF));

    // endregion

    // region Finished Foods

    public static final SlimefunItemStack FOOD_PEANUT_BUTTER_JELLY_SANDWICH = new SlimefunItemStack("CLT_PEANUT_BUTTER_JELLY_SANDWICH", Skins.PEANUT_BUTTER_JELLY_SANDWICH.getPlayerHead());

    public static final SlimefunItemStack EGG_SALAD_SANDWICH = new SlimefunItemStack("CLT_EGG_SALAD_SANDWICH", Skins.CHEESY_SANDWICH.getPlayerHead());

    public static final SlimefunItemStack BACON_SANDWICH = new SlimefunItemStack("CLT_BACON_SANDWICH", Skins.MEATY_SANDWICH.getPlayerHead());

    public static final SlimefunItemStack SALMON_NIGIRI = new SlimefunItemStack("CLT_SALMON_NIGIRI", Skins.SUSHI_SALMON.getPlayerHead());

    public static final SlimefunItemStack CAJUN_GARLIC_BUTTER_COD = new SlimefunItemStack("CLT_CAJUN_GARLIC_BUTTER_COD", Skins.MEAL_RED_GREEN_BROWN.getPlayerHead());

    public static final SlimefunItemStack SHAKSHUKA = new SlimefunItemStack("CLT_SHAKSHUKA", Skins.SHAKSHUKA.getPlayerHead());

    public static final SlimefunItemStack FUGU = new SlimefunItemStack("CLT_FUGU", Skins.SUSHI_TUNA.getPlayerHead());

    public static final SlimefunItemStack SHEPHERDS_PIE = new SlimefunItemStack("CLT_SHEPHERDS_PIE", Skins.MEAL_YELLOW_RED_BROWN.getPlayerHead());

    public static final SlimefunItemStack CHICKEN_POT_PIE = new SlimefunItemStack("CLT_CHICKEN_POT_PIE", Skins.PIE_BROWN.getPlayerHead());

    public static final SlimefunItemStack CHICKEN_PASTA_BAKE = new SlimefunItemStack("CLT_CHICKEN_PASTA_BAKE", Skins.PASTA_BAKE.getPlayerHead());

    public static final SlimefunItemStack CHICKEN_ALFREDO_MAC_AND_CHEESE = new SlimefunItemStack("CLT_CHICKEN_ALFREDO_MAC_AND_CHEESE", Skins.MAC_AND_CHEESE.getPlayerHead());

    public static final SlimefunItemStack KEY_LIME_PIE = new SlimefunItemStack("CLT_KEY_LIME_PIE", Skins.PIE_LIME.getPlayerHead());

    public static final SlimefunItemStack FRUIT_SALAD = new SlimefunItemStack("CLT_FRUIT_SALAD", Skins.FRUIT_SALAD.getPlayerHead());

    public static final SlimefunItemStack CAESAR_SALAD = new SlimefunItemStack("CLT_CAESAR_SALAD", Skins.FRUIT_SALAD.getPlayerHead());

    public static final SlimefunItemStack BISCUIT = new SlimefunItemStack("CLT_BISCUIT", new ItemStack(Material.COOKIE));

    public static final SlimefunItemStack COMPRESSED_BISCUIT = new SlimefunItemStack("CLT_COMPRESSED_BISCUIT", new ItemStack(Material.COOKIE));

    public static final SlimefunItemStack LEMON_DROP = new SlimefunItemStack("CLT_LEMON_DROP", new ItemStack(Material.YELLOW_DYE));

    public static final SlimefunItemStack GRILLED_SALMON_SALAD = new SlimefunItemStack("CLT_GRILLED_SALMON_SALAD", Skins.MEAL_SALAD.getPlayerHead());

    public static final SlimefunItemStack WITHER_ROSE_SALAD = new SlimefunItemStack("CLT_WITHER_ROSE_SALAD", Skins.MEAL_SALAD.getPlayerHead());

    public static final SlimefunItemStack ORANGE_JUICE = new SlimefunItemStack("CLT_ORANGE_JUICE", ItemStackGenerators.createPotion(Color.YELLOW));

    public static final SlimefunItemStack LASAGNA = new SlimefunItemStack("CLT_LASAGNA", Skins.MEAL_YELLOW_RED_BROWN.getPlayerHead());

    public static final SlimefunItemStack SPAGHETTI = new SlimefunItemStack("CLT_SPAGHETTI", Skins.SPAGHETTI.getPlayerHead());

    public static final SlimefunItemStack SPAGHETTI_AND_MEATBALLS = new SlimefunItemStack("CLT_SPAGHETTI_AND_MEATBALLS", Skins.SPAGHETTI.getPlayerHead());

    public static final SlimefunItemStack PIZZA_CHEESE = new SlimefunItemStack("CLT_PIZZA_CHEESE", Skins.PIZZA_CHEESE.getPlayerHead());

    public static final SlimefunItemStack PIZZA_MUSHROOM = new SlimefunItemStack("CLT_PIZZA_MUSHROOM", Skins.PIZZA_MUSHROOM.getPlayerHead());

    public static final SlimefunItemStack PIZZA_PEPPERONI = new SlimefunItemStack("CLT_PIZZA_PEPPERONI", Skins.PIZZA_PEPPERONI.getPlayerHead());

    public static final SlimefunItemStack CHEESY_SCALLOPED_COURGETTE = new SlimefunItemStack("CLT_CHEESY_SCALLOPED_COURGETTE", Skins.MEAL_RED_GREEN_BROWN.getPlayerHead());

    public static final SlimefunItemStack PECAN_PIE = new SlimefunItemStack("CLT_PECAN_PIE", Skins.PIE_BROWN.getPlayerHead());

    public static final SlimefunItemStack GARLIC_BUTTER_MUSHROOMS = new SlimefunItemStack("CLT_GARLIC_BUTTER_MUSHROOMS", new ItemStack(Material.MUSHROOM_STEW));

    public static final SlimefunItemStack RAMEN_BEEF = new SlimefunItemStack("CLT_RAMEN_BEEF", Skins.RAMEN_BEEF.getPlayerHead());

    public static final SlimefunItemStack RAMEN_CHICKEN = new SlimefunItemStack("CLT_RAMEN_CHICKEN", Skins.RAMEN_CHICKEN.getPlayerHead());

    public static final SlimefunItemStack RAMEN_SEAFOOD = new SlimefunItemStack("CLT_RAMEN_SEAFOOD", Skins.RAMEN_SEAFOOD.getPlayerHead());

    public static final SlimefunItemStack RAMEN_BEEF_HEARTY = new SlimefunItemStack("CLT_RAMEN_BEEF_HEARTY", Skins.RAMEN_HEARTY.getPlayerHead());

    public static final SlimefunItemStack RAMEN_CHICKEN_HEARTY = new SlimefunItemStack("CLT_RAMEN_CHICKEN_HEARTY", Skins.RAMEN_HEARTY.getPlayerHead());

    public static final SlimefunItemStack RAMEN_SEAFOOD_HEARTY = new SlimefunItemStack("CLT_RAMEN_SEAFOOD_HEARTY", Skins.RAMEN_HEARTY.getPlayerHead());

    public static final SlimefunItemStack BAGEL = new SlimefunItemStack("CLT_BAGEL", Skins.BAGEL.getPlayerHead());

    public static final SlimefunItemStack BAGEL_BITE = new SlimefunItemStack("CLT_BAGEL_BITE", Skins.BAGEL_BITE.getPlayerHead());

    public static final SlimefunItemStack BAGEL_CREAM_CHEESE = new SlimefunItemStack("CLT_BAGEL_CREAM_CHEESE", Skins.BAGEL_EVERYTHING.getPlayerHead());

    public static final SlimefunItemStack MEATLOAF = new SlimefunItemStack("CLT_MEATLOAF", Skins.MEATLOAF.getPlayerHead());

    public static final SlimefunItemStack SAUSAGE = new SlimefunItemStack("CLT_SAUSAGE", Skins.SAUSAGE.getPlayerHead());

    public static final SlimefunItemStack SOYLENT = new SlimefunItemStack("CLT_SOYLENT", ItemStackGenerators.createPotion(Color.WHITE));

    public static final SlimefunItemStack TATER_TOTS = new SlimefunItemStack("CLT_TATER_TOTS", Skins.TATER_TOT.getPlayerHead());

    public static final SlimefunItemStack SWEET_BEEHIVE = new SlimefunItemStack("CLT_SWEET_BEEHIVE", Skins.BEEHIVE.getPlayerHead());

    public static final SlimefunItemStack TAQUITO = new SlimefunItemStack("CLT_TAQUITO", Skins.TAQUITO.getPlayerHead());

    public static final SlimefunItemStack BOWL_OF_STEVE = new SlimefunItemStack("CLT_BOWL_OF_STEVE", Skins.STEVE_HEAD_BOWL.getPlayerHead());

    public static final SlimefunItemStack CHEESE_BURGER = new SlimefunItemStack("CLT_CHEESE_BURGER", Skins.BURGER.getPlayerHead());

    public static final SlimefunItemStack CINNAMON_ROLL = new SlimefunItemStack("CLT_CINNAMON_ROLL", Skins.CINNAMON_ROLL.getPlayerHead());

    public static final SlimefunItemStack BLUE_CANDY = new SlimefunItemStack("CLT_BLUE_CANDY", Skins.BLUE_CANDY.getPlayerHead());

    public static final SlimefunItemStack SOFT_BOILED_EGG = new SlimefunItemStack("CLT_SOFT_BOILED_EGG", Skins.BOILED_EGG.getPlayerHead());

    public static final SlimefunItemStack SUGARED_SKULL = new SlimefunItemStack("CLT_SUGARED_SKULL", Skins.SUGARED_SKULL.getPlayerHead());

    // end region
}
