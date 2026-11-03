package dev.sefiraat.cultivation.implementation.commands;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.stream.JsonReader;
import dev.sefiraat.cultivation.Cultivation;
import dev.sefiraat.cultivation.Registry;
import dev.sefiraat.cultivation.api.datatypes.SeedPackDataType;
import dev.sefiraat.cultivation.api.datatypes.instances.FloraLevelProfile;
import dev.sefiraat.cultivation.api.datatypes.instances.SeedPackInstance;
import dev.sefiraat.cultivation.api.slimefun.items.trees.TreeBlockDescriptor;
import dev.sefiraat.cultivation.implementation.slimefun.tools.SeedPack;
import dev.sefiraat.cultivation.libs.sefilib.entity.display.DisplayGroup;
import dev.sefiraat.cultivation.libs.sefilib.string.Theme;
import io.github.thebusybiscuit.slimefun5.libraries.dough.blocks.BlockPosition;
import io.github.thebusybiscuit.slimefun5.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun5.libraries.dough.data.persistent.PersistentDataAPI;
import me.mrCookieSlime.Slimefun.api.BlockStorage;
import org.bukkit.FluidCollisionMode;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.data.BlockData;
import org.bukkit.block.data.Orientable;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabExecutor;
import org.bukkit.entity.Interaction;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import javax.annotation.Nonnull;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class CultivationCommands implements TabExecutor {

    private static final String STRUCTURES = "cultivation.admin.structures";
    private static final String ENTITIES = "cultivation.admin.entities";
    private static final List<String> SUBCOMMANDS = Arrays.asList("pos1", "pos2", "saveStructure", "loadStructure", "removeEntities", "packpeek");

    @Override
    public boolean onCommand(@Nonnull CommandSender sender, @Nonnull Command command, @Nonnull String label, @Nonnull String[] args) {
        String subcommand = args.length == 0 ? "" : args[0].toLowerCase(Locale.ROOT);
        switch (subcommand) {
            case "pos1":
                return withPermission(sender, STRUCTURES, () -> onPos1(sender));
            case "pos2":
                return withPermission(sender, STRUCTURES, () -> onPos2(sender));
            case "savestructure":
                return withArgument(sender, STRUCTURES, args, name -> saveStructure(sender, name));
            case "loadstructure":
                return withArgument(sender, STRUCTURES, args, name -> loadStructure(sender, name));
            case "removeentities":
                return withArgument(sender, ENTITIES, args, radius -> removeEntities(sender, radius));
            case "packpeek":
                packPeek(sender);
                return true;
            default:
                onDefault(sender);
                return true;
        }
    }

    @Override
    public List<String> onTabComplete(@Nonnull CommandSender sender, @Nonnull Command command, @Nonnull String alias, @Nonnull String[] args) {
        if (args.length != 1) {
            return Collections.emptyList();
        }
        String typed = args[0].toLowerCase(Locale.ROOT);
        return SUBCOMMANDS.stream().filter(name -> name.toLowerCase(Locale.ROOT).startsWith(typed)).collect(Collectors.toList());
    }

    private boolean withPermission(CommandSender sender, String permission, Runnable action) {
        if (!sender.hasPermission(permission)) {
            sender.sendMessage(Theme.WARNING.apply("You do not have permission to do this"));
            return true;
        }
        action.run();
        return true;
    }

    private boolean withArgument(CommandSender sender, String permission, String[] args, Consumer<String> action) {
        if (args.length < 2) {
            onDefault(sender);
            return true;
        }
        return withPermission(sender, permission, () -> action.accept(args[1]));
    }

    public void onDefault(CommandSender sender) {
        sender.sendMessage(Theme.ERROR + "Please provide a valid subcommand.");
    }

    public void onPos1(CommandSender sender) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            Registry.getInstance().addPositionOne(player);
            System.out.println("pos1 set");
        } else {
            sender.sendMessage(Theme.applyThemeToString(Theme.WARNING, "Must be executed by a player"));
        }
    }

    public void onPos2(CommandSender sender) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            Registry.getInstance().addPositionTwo(player);
            System.out.println("pos2 set");
        } else {
            sender.sendMessage(Theme.applyThemeToString(Theme.WARNING, "Must be executed by a player"));
        }
    }

    public void saveStructure(CommandSender sender, String name) {
        if (!(sender instanceof Player)) {
            return;
        }
        Player player = (Player) sender;
        BlockPosition pos1 = Registry.getInstance().getPositionOne(player);
        BlockPosition pos2 = Registry.getInstance().getPositionTwo(player);
        Block base = player.getTargetBlockExact(20, FluidCollisionMode.NEVER);
        if (pos1 == null || pos2 == null || base == null) {
            return;
            //todo send message
        }

        Map<TreeBlockDescriptor, String> blockDescriptors = new HashMap<>();

        int upperX = Math.max(pos1.getX(), pos2.getX());
        int upperY = Math.max(pos1.getY(), pos2.getY());
        int upperZ = Math.max(pos1.getZ(), pos2.getZ());
        int lowerX = Math.min(pos1.getX(), pos2.getX());
        int lowerY = Math.min(pos1.getY(), pos2.getY());
        int lowerZ = Math.min(pos1.getZ(), pos2.getZ());

        for (int x = lowerX; x <= upperX; x++) {
            for (int z = lowerZ; z <= upperZ; z++) {
                for (int y = lowerY; y <= upperY; y++) {
                    BlockPosition blockPosition = new BlockPosition(player.getWorld(), x, y, z);
                    Block block = blockPosition.getBlock();
                    Material blockMaterial = block.getType();
                    if (isNotAllowed(blockMaterial)) {
                        continue;
                    }
                    String blockName = getBlockId(blockPosition.getBlock());
                    int offsetX = x - base.getX();
                    int offsetY = y - base.getY();
                    int offsetZ = z - base.getZ();
                    TreeBlockDescriptor descriptor = new TreeBlockDescriptor(blockName, offsetX, offsetY, offsetZ);

                    BlockData blockData = block.getBlockData();
                    if (blockData instanceof Orientable) {
                        Orientable orientable = (Orientable) blockData;
                        descriptor.setAxis(orientable.getAxis());
                    }

                    blockDescriptors.put(descriptor, blockName);
                }
            }
        }
        try {
            Gson gson = new Gson().newBuilder().setPrettyPrinting().create();
            JsonObject root = new JsonObject();
            JsonArray structure = new JsonArray();
            for (Map.Entry<TreeBlockDescriptor, String> entry : blockDescriptors.entrySet()) {
                JsonObject blockObject = new JsonObject();
                TreeBlockDescriptor descriptor = entry.getKey();
                blockObject.add("block_id", new JsonPrimitive(descriptor.getName()));
                blockObject.add("x", new JsonPrimitive(descriptor.getX()));
                blockObject.add("y", new JsonPrimitive(descriptor.getY()));
                blockObject.add("z", new JsonPrimitive(descriptor.getZ()));
                if (descriptor.getBlockFace() != null) {
                    blockObject.add("direction", new JsonPrimitive(descriptor.getBlockFace().name()));
                }
                if (descriptor.getAxis() != null) {
                    blockObject.add("axis", new JsonPrimitive(descriptor.getAxis().name()));
                }
                structure.add(blockObject);
            }
            root.add("name", new JsonPrimitive(name));
            root.add("structure", structure);
            String path = Cultivation.getInstance().getDataFolder().getAbsolutePath() + File.separator;
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path + name + ".json"));
            gson.toJson(root, bufferedWriter);
            bufferedWriter.flush();
            bufferedWriter.close();
        } catch (IOException ioException) {
            Cultivation.logError(ioException.getMessage());
        }
        System.out.println("saved");
    }

    public void loadStructure(CommandSender sender, String name) {
        if (!(sender instanceof Player)) {
            return;
        }
        Player player = (Player) sender;
        File file = new File(Cultivation.getInstance().getDataFolder() + File.separator + name + ".json");
        try {
            JsonReader jsonReader = new JsonReader(new FileReader(file));
            JsonObject jsonObject = new Gson().fromJson(jsonReader, JsonObject.class);
            JsonArray jsonArray = jsonObject.getAsJsonArray("structure");
            Block base = player.getTargetBlockExact(20, FluidCollisionMode.NEVER);

            if (base == null) {
                return;
            }

            for (JsonElement jsonElement : jsonArray) {
                if (!(jsonElement instanceof JsonObject)) {
                    continue;
                }
                JsonObject object = (JsonObject) jsonElement;

                int x = object.get("x").getAsInt();
                int y = object.get("y").getAsInt();
                int z = object.get("z").getAsInt();
                String blockId = object.get("block_id").getAsString();
                String[] idStrings = blockId.split(":");
                ItemStack itemStack;
                Location location = base.getLocation().clone().add(x, y, z);
                Block block = location.getBlock();
                if (idStrings[0].equals("slimefun")) {
                    SlimefunItem slimefunItem = SlimefunItem.getById(idStrings[1]);
                    if (slimefunItem == null) {
                        continue;
                        //todo better error handling
                    }
                    itemStack = slimefunItem.getItem();
                    Material material = itemStack.getType();
                    block.setType(material, true);
                    BlockStorage.store(block, slimefunItem.getId());
                } else {
                    itemStack = new ItemStack(Material.valueOf(idStrings[1]));
                    Material material = itemStack.getType();
                    block.setType(material);
                }
            }
        } catch (FileNotFoundException exception) {
            Cultivation.logError(exception.getMessage());
        }
    }

    private boolean isNotAllowed(@Nonnull Material material) {
        return material.isAir() || material == Material.WATER || material == Material.LAVA;
    }

    private String getBlockId(Block block) {
        Material blockMaterial = block.getType();
        SlimefunItem slimefunItem = BlockStorage.check(block);
        return slimefunItem == null
               ? "minecraft:" + blockMaterial.name()
               : "slimefun:" + slimefunItem.getId();
    }

    private void removeEntities(CommandSender sender, String radiusArgument) {
        int radius;
        try {
            radius = Integer.parseInt(radiusArgument);
        } catch (NumberFormatException notANumber) {
            onDefault(sender);
            return;
        }
        removeDisplayGroups(sender, radius);
    }

    public void removeDisplayGroups(CommandSender sender, int radius) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            player.getWorld().getNearbyEntities(
                player.getLocation(),
                radius,
                radius,
                radius,
                Interaction.class::isInstance
            ).forEach(entity -> {
                DisplayGroup displayGroup = DisplayGroup.fromInteraction((Interaction) entity);
                if (displayGroup != null) {
                    displayGroup.remove();
                }
            });
        }
    }

    public void packPeek(CommandSender sender) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            ItemStack itemStack = player.getInventory().getItemInMainHand();
            if (itemStack == null || itemStack.getType().isAir()) {
                player.sendMessage(Theme.WARNING.apply("You must be holding a Seed Pack for this"));
                return;
            }

            SlimefunItem slimefunItem = SlimefunItem.getByItem(itemStack);
            if (!(slimefunItem instanceof SeedPack)) {
                player.sendMessage(Theme.WARNING.apply("You must be holding a Seed Pack for this"));
                return;
            }
            SeedPack pack = (SeedPack) slimefunItem;

            ItemMeta itemMeta = itemStack.getItemMeta();
            SeedPackInstance instance = PersistentDataAPI.get(itemMeta, SeedPackDataType.KEY, SeedPackDataType.TYPE);
            if (instance == null) {
                player.sendMessage(Theme.WARNING.apply("This pack is empty!"));
                return;
            }

            player.sendMessage("------------------------------------");
            player.sendMessage("Contents");
            player.sendMessage("------------------------------------");
            for (Map.Entry<FloraLevelProfile, Integer> entry : instance.getAmountMap().entrySet()) {
                FloraLevelProfile profile = entry.getKey();
                String neatKey =
                    " Lv: " + profile.getLevel() +
                    " Sp: " + profile.getSpeed() +
                    " St: " + profile.getStrength();
                player.sendMessage(Theme.CLICK_INFO.asTitle(neatKey, entry.getValue()));
            }
        }
    }
}

