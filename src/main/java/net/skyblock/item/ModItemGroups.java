package net.skyblock.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.skyblock.Skyblock;
import net.skyblock.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup ENCHANTED = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Skyblock.MOD_ID, "enchanted"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.enchanted")).icon(() ->
                    new ItemStack(EnchantedItems.ENCHANTED_POTATO)).entries((displayContext, entries) -> {
                        entries.add(EnchantedItems.ENCHANTED_ACACIA_LOG);
                        entries.add(EnchantedItems.ENCHANTED_BAKED_POTATO);
                        entries.add(EnchantedItems.ENCHANTED_POTATO);
                    }).build());

//    private static void addItemsToBuildingBlocksItemGroup(FabricItemGroupEntries entries) {
//    }
//    private static void addItemsToColoredBlocksItemGroup(FabricItemGroupEntries entries) {
//    }
    private static void addItemsToNaturalItemGroup(FabricItemGroupEntries entries) {
        entries.add(ModBlocks.HARD_STONE);
        entries.add(ModBlocks.POOR_MITHRIL_ORE);
        entries.add(ModBlocks.MITHRIL_ORE);
        entries.add(ModBlocks.RICH_MITHRIL_ORE);
    }
//    private static void addItemsToFunctionalItemGroup(FabricItemGroupEntries entries) {
//    }
//    private static void addItemsToRedstoneItemGroup(FabricItemGroupEntries entries) {
//    }
    private static void addItemsToToolsItemGroup(FabricItemGroupEntries entries) {
        entries.add(ModItems.MAGICAL_WATER_BUCKET);
        entries.add(ModItems.MAGICAL_LAVA_BUCKET);
        entries.add(ModItems.ROOKIE_HOE);
        entries.add(ModItems.HOE_OF_GREAT_TILLING);
        entries.add(ModItems.HOE_OF_GREATER_TILLING);
        entries.add(ModItems.HOE_OF_GREATEST_TILLING);
        entries.add(ModItems.ZOMBIE_PICKAXE);
        entries.add(ModItems.JUNGLE_PICKAXE);
        entries.add(ModItems.FRACTURED_MITHRIL_PICKAXE);
        entries.add(ModItems.BANDAGED_MITHRIL_PICKAXE);
        entries.add(ModItems.MITHRIL_PICKAXE);
        entries.add(ModItems.REFINED_MITHRIL_PICKAXE);
    }
//    private static void addItemsToCombatItemGroup(FabricItemGroupEntries entries) {
//    }
    private static void addItemsToFoodAndDrinkItemGroup(FabricItemGroupEntries entries) {
        entries.add(ModItems.MAGICAL_MILK_BUCKET);
    }
    private static void addItemsToIngredientsItemGroup(FabricItemGroupEntries entries) {
        entries.add(EnchantedItems.ENCHANTED_ACACIA_LOG);
        entries.add(EnchantedItems.ENCHANTED_POTATO);
        entries.add(EnchantedItems.ENCHANTED_BAKED_POTATO);
        entries.add(ModItems.MITHRIL);
        entries.add(ModItems.REFINED_MINERAL);
        entries.add(ModItems.TRUE_ESSENCE);
        entries.add(ModItems.FOUL_FLESH);
    }
//    private static void addItemsToSpawnEggsItemGroup(FabricItemGroupEntries entries) {
//    }
//    private static void addItemsToOperatorItemGroup(FabricItemGroupEntries entries) {
//    }
    public static void registerItemGroups() {
        Skyblock.LOGGER.info("Registering Mod Item Groups for "+Skyblock.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(ModItemGroups::addItemsToNaturalItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(ModItemGroups::addItemsToToolsItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(ModItemGroups::addItemsToFoodAndDrinkItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItemGroups::addItemsToIngredientsItemGroup);
    }
}
