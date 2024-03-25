package net.skyblock.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.loottable.BlockLootTableGenerator;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.LootTables;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.registry.tag.ItemTags;
import net.skyblock.block.ModBlocks;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.CENTURY_CAKE_WHITE);
        addDrop(ModBlocks.CENTURY_CAKE_YELLOW);
        addDrop(ModBlocks.CENTURY_CAKE_ORANGE);
        addDrop(ModBlocks.CENTURY_CAKE_RED);
        addDrop(ModBlocks.CENTURY_CAKE_PINK);
        addDrop(ModBlocks.CENTURY_CAKE_MAGENTA);
        addDrop(ModBlocks.CENTURY_CAKE_LIME);
        addDrop(ModBlocks.CENTURY_CAKE_GREEN);
        addDrop(ModBlocks.CENTURY_CAKE_CYAN);
        addDrop(ModBlocks.CENTURY_CAKE_GRAY);
        addDrop(ModBlocks.CENTURY_CAKE_BROWN);
        addDrop(ModBlocks.CENTURY_CAKE_BLUE);
        addDrop(ModBlocks.CENTURY_CAKE_BLACK);
        addDrop(ModBlocks.CENTURY_CAKE_AQUA);

//
//        addDrop(ModBlocks.RUBY_ORE, copperLikeOreDrops(ModBlocks.RUBY_ORE, ModItems.RAW_RUBY));
//        addDrop(ModBlocks.DEEPSLATE_RUBY_ORE, copperLikeOreDrops(ModBlocks.DEEPSLATE_RUBY_ORE, ModItems.RAW_RUBY));
//        addDrop(ModBlocks.NETHER_RUBY_ORE, copperLikeOreDrops(ModBlocks.NETHER_RUBY_ORE, ModItems.RAW_RUBY));
//        addDrop(ModBlocks.END_STONE_RUBY_ORE, copperLikeOreDrops(ModBlocks.END_STONE_RUBY_ORE, ModItems.RAW_RUBY));
    }

//    public LootTable.Builder copperLikeOreDrops(Block drop, Item item) {
//        return BlockLootTableGenerator.dropsWithSilkTouch(drop, (LootPoolEntry.Builder)this.applyExplosionDecay(drop,
//                ((LeafEntry.Builder)
//                        ItemEntry.builder(item)
//                                .apply(SetCountLootFunction
//                                        .builder(UniformLootNumberProvider
//                                                .create(2.0f, 5.0f))))
//                        .apply(ApplyBonusLootFunction.oreDrops(Enchantments.FORTUNE))));
//    }
}
