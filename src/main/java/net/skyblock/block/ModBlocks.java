package net.skyblock.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.skyblock.Skyblock;

public class ModBlocks {
    public static final Block HARD_STONE = registerBlock("hard_stone",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).strength(5.0f)));
    public static final Block POOR_DWARVEN_GOLD = registerBlock("poor_dwarven_gold",
            new ExperienceDroppingBlock(UniformIntProvider.create(10, 20), FabricBlockSettings.copyOf(Blocks.CYAN_TERRACOTTA).strength(40.0f)));
    public static final Block DWARVEN_REDSTONE = registerBlock("dwarven_redstone",
            new ExperienceDroppingBlock(UniformIntProvider.create(10, 20), FabricBlockSettings.copyOf(Blocks.REDSTONE_BLOCK).strength(50.0f)));
    public static final Block DWARVEN_GOLD = registerBlock("dwarven_gold",
            new ExperienceDroppingBlock(UniformIntProvider.create(10, 20), FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).strength(60.0f)));
    public static final Block DWARVEN_EMERALD = registerBlock("dwarven_emerald",
            new ExperienceDroppingBlock(UniformIntProvider.create(10, 20), FabricBlockSettings.copyOf(Blocks.EMERALD_BLOCK).strength(70.0f)));
    public static final Block POOR_MITHRIL_ORE = registerBlock("poor_mithril_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(22, 45), FabricBlockSettings.copyOf(Blocks.CYAN_TERRACOTTA).strength(50.0f)));
    public static final Block MITHRIL_ORE = registerBlock("mithril_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(22, 45), FabricBlockSettings.copyOf(Blocks.DARK_PRISMARINE).strength(80.0f)));
    public static final Block RICH_MITHRIL_ORE = registerBlock("rich_mithril_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(22, 45), FabricBlockSettings.copyOf(Blocks.LIGHT_BLUE_WOOL).strength(150.0f)));
    public static final Block TITANIUM_ORE = registerBlock("titanium_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(50, 100), FabricBlockSettings.copyOf(Blocks.POLISHED_DIORITE).strength(200.0f)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(Skyblock.MOD_ID, name), block);
    }
    public static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(Skyblock.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }
    public static void registerModBlocks() {
        Skyblock.LOGGER.info("Registering Mod Blocks for " + Skyblock.MOD_ID);
    }
}
