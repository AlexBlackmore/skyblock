package net.skyblock.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.skyblock.Skyblock;
import net.skyblock.block.ModBlocks;

public class ModItemGroups {

    public static final ItemGroup ENCHANTED = Registry.register(Registries.ITEM_GROUP, Identifier.of(Skyblock.MOD_ID, "enchanted"),
            FabricItemGroup.builder().icon(() -> new ItemStack(EnchantedItems.ENCHANTED_POTATO))
                    .displayName(Text.translatable("itemgroup.skyblock.enchanted"))
                    .entries(((displayContext, entries) -> {
                        entries.add(EnchantedItems.ENCHANTED_POTATO);
                        entries.add(EnchantedItems.ENCHANTED_MELON_SLICE);
                        entries.add(EnchantedItems.ENCHANTED_MELON);
                        entries.add(EnchantedItems.ENCHANTED_PUMPKIN);
                        entries.add(EnchantedItems.ENCHANTED_JUNGLE_LOG);
                        entries.add(EnchantedItems.ENCHANTED_OBSIDIAN);
                        entries.add(EnchantedItems.ENCHANTED_MITHRIL);
                    }))
                    .build());

    public static final ItemGroup ORES = Registry.register(Registries.ITEM_GROUP, Identifier.of(Skyblock.MOD_ID, "ores"),
            FabricItemGroup.builder().icon(() -> new ItemStack(Blocks.GOLD_ORE))
                    .displayName(Text.translatable("itemgroup.skyblock.ores"))
                    .entries(((displayContext, entries) -> {
                        entries.add(Blocks.COAL_ORE);
                        entries.add(Blocks.IRON_ORE);
                        entries.add(Blocks.GOLD_ORE);
                        entries.add(Blocks.LAPIS_ORE);
                        entries.add(Blocks.REDSTONE_ORE);
                        entries.add(Blocks.EMERALD_ORE);
                        entries.add(Blocks.DIAMOND_ORE);
                        entries.add(Blocks.NETHER_QUARTZ_ORE);
                        entries.add(ModBlocks.PURE_COAL);
                        entries.add(ModBlocks.PURE_IRON);
                        entries.add(ModBlocks.PURE_GOLD);
                        entries.add(ModBlocks.PURE_LAPIS);
                        entries.add(ModBlocks.PURE_REDSTONE);
                        entries.add(ModBlocks.PURE_EMERALD);
                        entries.add(ModBlocks.PURE_DIAMOND);
                        entries.add(ModBlocks.PURE_QUARTZ);
                        entries.add(ModBlocks.SULPHUR_ORE);
                    }))
                    .build());

    public static final ItemGroup SPECIAL = Registry.register(Registries.ITEM_GROUP, Identifier.of(Skyblock.MOD_ID, "special"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.BAT_THE_FISH))
                    .displayName(Text.translatable("itemgroup.skyblock.special"))
                    .entries(((displayContext, entries) -> {
                        entries.add(ModItems.BAT_THE_FISH);
                    }))
                    .build());
    public static final ItemGroup DWARVEN_METALS = Registry.register(Registries.ITEM_GROUP, Identifier.of(Skyblock.MOD_ID, "dwarven_metals"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.MITHRIL_ORE))
                    .displayName(Text.translatable("itemgroup.skyblock.dwarven_metals"))
                    .entries(((displayContext, entries) -> {
                        entries.add(ModBlocks.DARK_POOR_MITHRIL_ORE);
                        entries.add(ModBlocks.POOR_MITHRIL_ORE);
                        entries.add(ModBlocks.DARK_MITHRIL_ORE);
                        entries.add(ModBlocks.SMOOTH_MITHRIL_ORE);
                        entries.add(ModBlocks.MITHRIL_ORE);
                        entries.add(ModBlocks.RICH_MITHRIL_ORE);
                        entries.add(ModBlocks.TITANIUM_ORE);
                        entries.add(ModBlocks.POOR_UMBER_ORE);
                        entries.add(ModBlocks.UMBER_ORE);
                        entries.add(ModBlocks.RICH_UMBER_ORE);
                        entries.add(ModBlocks.POOR_TUNGSTEN_ORE);
                        entries.add(ModBlocks.TUNGSTEN_ORE);
                        entries.add(ModBlocks.GLACITE_ORE);
                    }))
                    .build());
    public static void registerItemGroups() {
        Skyblock.LOGGER.info("Registering ItemGroups for " + Skyblock.MOD_ID);
    }
}
