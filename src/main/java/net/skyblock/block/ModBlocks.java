package net.skyblock.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.skyblock.Skyblock;
import net.skyblock.attribute.ModEntityAttributes;
import net.skyblock.block.custom.CenturyCakeBlock;
import net.skyblock.effect.ModStatusEffects;
import net.skyblock.util.ModRarity;

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
    public static final Block CENTURY_CAKE_PINK = registerBlock("century_cake_pink",
            new CenturyCakeBlock(ModStatusEffects.CENTURY_CAKE_MAX_HEALTH,2.0f,  EntityAttributes.GENERIC_MAX_HEALTH));
    public static final Block CENTURY_CAKE_RED = registerBlock("century_cake_red",
            new CenturyCakeBlock(ModStatusEffects.CENTURY_CAKE_STRENGTH,0.02f,  ModEntityAttributes.STRENGTH));
    public static final Block CENTURY_CAKE_ORANGE = registerBlock("century_cake_orange",
            new CenturyCakeBlock(ModStatusEffects.CENTURY_CAKE_FEROCITY,0.02f,  ModEntityAttributes.FEROCITY));
    public static final Block CENTURY_CAKE_YELLOW = registerBlock("century_cake_yellow",
            new CenturyCakeBlock(ModStatusEffects.CENTURY_CAKE_MOVEMENT_SPEED,0.10f,  EntityAttributes.GENERIC_MOVEMENT_SPEED));
    public static final Block CENTURY_CAKE_LIME = registerBlock("century_cake_lime",
            new CenturyCakeBlock(ModStatusEffects.CENTURY_CAKE_ARMOR,1.0f,  EntityAttributes.GENERIC_ARMOR));
    public static final Block CENTURY_CAKE_AQUA = registerBlock("century_cake_aqua",
            new CenturyCakeBlock(ModStatusEffects.CENTURY_CAKE_INTELLIGENCE,5.0f,  ModEntityAttributes.INTELLIGENCE));
    public static final Block CENTURY_CAKE_BLUE = registerBlock("century_cake_blue",
            new CenturyCakeBlock(ModStatusEffects.CENTURY_CAKE_SEA_CREATURE_CHANCE,1,  ModEntityAttributes.SEA_CREATURE_CHANCE));
    public static final Block CENTURY_CAKE_MAGENTA = registerBlock("century_cake_magenta",
            new CenturyCakeBlock(ModStatusEffects.CENTURY_CAKE_PET_LUCK,0.01f,  ModEntityAttributes.PET_LUCK, ModRarity.EPIC));
    public static final Block CENTURY_CAKE_BLACK = registerBlock("century_cake_black",
            new CenturyCakeBlock(ModStatusEffects.CENTURY_CAKE_LUCK,1.0f,  EntityAttributes.GENERIC_LUCK));
    public static final Block CENTURY_CAKE_BROWN = registerBlock("century_cake_brown",
            new CenturyCakeBlock(ModStatusEffects.CENTURY_CAKE_FARMING_FORTUNE,0.05f,  ModEntityAttributes.FARMING_FORTUNE));
    public static final Block CENTURY_CAKE_WHITE = registerBlock("century_cake_white",
            new CenturyCakeBlock(ModStatusEffects.CENTURY_CAKE_FORAGING_FORTUNE,0.05f,  ModEntityAttributes.FORAGING_FORTUNE));
    public static final Block CENTURY_CAKE_CYAN = registerBlock("century_cake_cyan",
            new CenturyCakeBlock(ModStatusEffects.CENTURY_CAKE_MINING_FORTUNE,0.05f,  ModEntityAttributes.MINING_FORTUNE));
    public static final Block CENTURY_CAKE_GREEN = registerBlock("century_cake_green",
            new CenturyCakeBlock(ModStatusEffects.CENTURY_CAKE_VITALITY,0.01f,  ModEntityAttributes.VITALITY));
    public static final Block CENTURY_CAKE_GRAY = registerBlock("century_cake_gray",
            new CenturyCakeBlock(ModStatusEffects.CENTURY_CAKE_ARMOR_TOUGHNESS,1.0f,  EntityAttributes.GENERIC_ARMOR_TOUGHNESS));



    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(Skyblock.MOD_ID, name), block);
    }
    public static Item registerBlockItem(String name, Block block) {
        if (block instanceof ModBlock modBlock) {
            return Registry.register(Registries.ITEM, new Identifier(Skyblock.MOD_ID, name), new ModBlockItem(modBlock, new FabricItemSettings()));
        }
        return Registry.register(Registries.ITEM, new Identifier(Skyblock.MOD_ID, name), new BlockItem(block, new FabricItemSettings()));
    }
    public static void registerModBlocks() {
        Skyblock.LOGGER.info("Registering Mod Blocks for " + Skyblock.MOD_ID);
    }
}
