package net.skyblock.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.LoreComponent;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.skyblock.Skyblock;
import net.skyblock.item.ModItems;

public class ModBlocks {
    //TODO: check that blocks are copying all qualities from vanilla blocks (sounds etc.)
    public static final Block PURE_COAL = registerOreBlock("pure_coal", Blocks.COAL_BLOCK, 60.0f, 0, 10, 20);
    public static final Block PURE_IRON = registerOreBlock("pure_iron", Blocks.IRON_BLOCK, 60.0f, 20);
    public static final Block PURE_GOLD = registerOreBlock("pure_gold", Blocks.GOLD_BLOCK, 60.0f, 20);
    public static final Block PURE_LAPIS = registerOreBlock("pure_lapis", Blocks.LAPIS_BLOCK, 60.0f, 3, 6, 20);
    public static final Block PURE_REDSTONE = registerOreBlock("pure_redstone", Blocks.REDSTONE_BLOCK, 60.0f, 2, 10, 20);
    public static final Block PURE_EMERALD = registerOreBlock("pure_emerald", Blocks.EMERALD_BLOCK, 60.0f, 15, 35, 20);
    public static final Block PURE_DIAMOND = registerOreBlock("pure_diamond", Blocks.DIAMOND_BLOCK, 60.0f, 15, 35, 20);
    public static final Block PURE_QUARTZ = registerOreBlock("pure_quartz", Blocks.QUARTZ_BLOCK, 60.0f, 10, 25, 18);
    public static final Block SULPHUR_ORE = registerOreBlock("sulphur_ore", Blocks.SPONGE, 50.0f, 1);
    public static final Block HARD_STONE = registerOreBlock("hard_stone", Blocks.STONE, 5.0f, 1, 2);
    public static final Block DARK_POOR_MITHRIL_ORE = registerOreBlock("dark_poor_mithril_ore", Blocks.GRAY_WOOL, 50.0f, 4, 9, 45);
    public static final Block POOR_MITHRIL_ORE = registerOreBlock("poor_mithril_ore", Blocks.CYAN_TERRACOTTA, 50.0f, 4, 9, 45);
    public static final Block DARK_MITHRIL_ORE = registerOreBlock("dark_mithril_ore", Blocks.DARK_PRISMARINE, 80.0f, 4, 9, 45);
    public static final Block SMOOTH_MITHRIL_ORE = registerOreBlock("smooth_mithril_ore", Blocks.PRISMARINE_BRICKS, 80.0f, 4, 9, 45);
    public static final Block MITHRIL_ORE = registerOreBlock("mithril_ore", Blocks.PRISMARINE, 80.0f, 4, 9, 45);
    public static final Block RICH_MITHRIL_ORE = registerOreBlock("rich_mithril_ore", Blocks.LIGHT_BLUE_WOOL, 150.0f, 4, 9, 45);
    public static final Block TITANIUM_ORE = registerOreBlock("titanium_ore", Blocks.POLISHED_DIORITE, 200.0f, 5, 20, 100);
    public static final Block POOR_UMBER_ORE = registerOreBlock("poor_umber_ore", Blocks.TERRACOTTA, 560.0f, 9, 15, 75);
    public static final Block UMBER_ORE = registerOreBlock("umber_ore", Blocks.BROWN_TERRACOTTA, 560.0f, 9, 15, 75);
    public static final Block RICH_UMBER_ORE = registerOreBlock("rich_umber_ore", Blocks.RED_SANDSTONE, 560.0f, 9, 15, 75);
    public static final Block POOR_TUNGSTEN_ORE = registerOreBlock("poor_tungsten_ore", Blocks.COBBLESTONE, 560.0f, 9, 15, 75);
    public static final Block TUNGSTEN_ORE = registerOreBlock("tungsten_ore", Blocks.CLAY, 560.0f, 9, 15, 75);
    public static final Block GLACITE_ORE = registerOreBlock("glacite_ore", Blocks.PACKED_ICE, 600.0f, 9, 16, 80);

//    private static Block registerAbstractBlock(String name, Block block, float strength, boolean requiresTool) {
//        Block newBlock = Registry.register(Registries.BLOCK, Identifier.of(Skyblock.MOD_ID, name),
//                new Block(AbstractBlock.Settings.copy(block).strength(strength).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Skyblock.MOD_ID,name)))));
//        registerBlockItem(name, newBlock);
//        return newBlock;
//    }
//    private static Block registerAbstractBlockWithLore(String name, Block block, float strength, boolean requiresTool, int length) {
//        Block newBlock = Registry.register(Registries.BLOCK, Identifier.of(Skyblock.MOD_ID, name),
//                new Block(AbstractBlock.Settings.copy(block).strength(strength).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Skyblock.MOD_ID,name)))));
//        registerBlockItemWithLore(name, newBlock, length);
//        return newBlock;
//    }

    private static Block registerOreBlock(String name, Block block, float strength, int miningXp) {
        Block newBlock = Registry.register(Registries.BLOCK, Identifier.of(Skyblock.MOD_ID, name),
                new ModOreBlock(name, block, strength, 0, 0, miningXp));
        registerBlockItem(name, newBlock);
        return newBlock;
    }
    private static Block registerOreBlock(String name, Block block, float strength,int miningXp, int loreLines) {
        Block newBlock = Registry.register(Registries.BLOCK, Identifier.of(Skyblock.MOD_ID, name),
                new ModOreBlock(name, block, strength, 0, 0, miningXp));
        registerBlockItemWithLore(name, newBlock, loreLines);
        return newBlock;
    }
    private static Block registerOreBlock(String name, Block block, float strength, int min, int max, int miningXp) {
        Block newBlock = Registry.register(Registries.BLOCK, Identifier.of(Skyblock.MOD_ID, name),
                new ModOreBlock(name, block, strength, min, max, miningXp));
        registerBlockItem(name, newBlock);
        return newBlock;
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(Skyblock.MOD_ID, name),
                new BlockItem(block, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Skyblock.MOD_ID,name)))));
    }
    private static void registerBlockItemWithLore(String name, Block block, int length) {
        Registry.register(Registries.ITEM, Identifier.of(Skyblock.MOD_ID, name),
                new BlockItem(block, new Item.Settings()
                        .component(DataComponentTypes.LORE, new LoreComponent(ModItems.getLoreList(name,length)))
                        .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Skyblock.MOD_ID,name)))));
    }

    public static void registerModBlocks() {
        Skyblock.LOGGER.info("Registering ModBlocks for " + Skyblock.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries -> {
            entries.add(ModBlocks.HARD_STONE);
        });
    }
}
