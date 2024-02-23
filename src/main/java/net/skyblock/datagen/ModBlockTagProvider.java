package net.skyblock.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Blocks;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.skyblock.Skyblock;
import net.skyblock.block.ModBlocks;
import net.skyblock.util.ModTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(BlockTags.EMERALD_ORES)
                .add(ModBlocks.DWARVEN_EMERALD);

        getOrCreateTagBuilder(BlockTags.GOLD_ORES)
                .forceAddTag(ModTags.Blocks.DWARVEN_GOLD);

        getOrCreateTagBuilder(BlockTags.REDSTONE_ORES)
                .add(ModBlocks.DWARVEN_REDSTONE);

        getOrCreateTagBuilder(ModTags.Blocks.DWARVEN_GOLD)
                .add(ModBlocks.POOR_DWARVEN_GOLD)
                .add(ModBlocks.DWARVEN_GOLD);

        getOrCreateTagBuilder(ModTags.Blocks.DWARVEN_ORES)
                .forceAddTag(ModTags.Blocks.DWARVEN_GOLD)
                .add(ModBlocks.DWARVEN_REDSTONE)
                .add(ModBlocks.DWARVEN_EMERALD);

        getOrCreateTagBuilder(ModTags.Blocks.MITHRIL_ORES)
                .add(ModBlocks.POOR_MITHRIL_ORE)
                .add(ModBlocks.MITHRIL_ORE)
                .add(ModBlocks.RICH_MITHRIL_ORE);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .forceAddTag(ModTags.Blocks.DWARVEN_ORES)
                .forceAddTag(ModTags.Blocks.MITHRIL_ORES)
                .add(ModBlocks.HARD_STONE)
                .add(ModBlocks.TITANIUM_ORE);

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .forceAddTag(ModTags.Blocks.DWARVEN_ORES);

        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .forceAddTag(ModTags.Blocks.MITHRIL_ORES)
                .add(ModBlocks.HARD_STONE);

        getOrCreateTagBuilder(ModTags.Blocks.ORES)
                .forceAddTag(BlockTags.COAL_ORES)
                .forceAddTag(BlockTags.IRON_ORES)
                .forceAddTag(BlockTags.GOLD_ORES)
                .forceAddTag(BlockTags.LAPIS_ORES)
                .forceAddTag(BlockTags.REDSTONE_ORES)
                .forceAddTag(BlockTags.EMERALD_ORES)
                .forceAddTag(BlockTags.DIAMOND_ORES)
                .forceAddTag(BlockTags.COPPER_ORES)
                .add(Blocks.NETHER_GOLD_ORE)
                .add(Blocks.NETHER_QUARTZ_ORE)
                .add(ModBlocks.TITANIUM_ORE)
                .forceAddTag(ModTags.Blocks.MITHRIL_ORES);

        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BLOCK, new Identifier("fabric", "needs_tool_level_4")))
                .add(ModBlocks.TITANIUM_ORE);
    }
}
