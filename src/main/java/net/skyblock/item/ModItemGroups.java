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
//    private static void addItemsToToolsItemGroup(FabricItemGroupEntries entries) {
//    }
//    private static void addItemsToCombatItemGroup(FabricItemGroupEntries entries) {
//    }
//    private static void addItemsToFoodAndDrinkItemGroup(FabricItemGroupEntries entries) {
//    }
    private static void addItemsToIngredientsItemGroup(FabricItemGroupEntries entries) {
        entries.add(EnchantedItems.ENCHANTED_ACACIA_LOG);
        entries.add(EnchantedItems.ENCHANTED_POTATO);
        entries.add(EnchantedItems.ENCHANTED_BAKED_POTATO);
    }
//    private static void addItemsToSpawnEggsItemGroup(FabricItemGroupEntries entries) {
//    }
//    private static void addItemsToOperatorItemGroup(FabricItemGroupEntries entries) {
//    }
    public static void registerItemGroups() {
        Skyblock.LOGGER.info("Registering Mod Item Groups for "+Skyblock.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(ModItemGroups::addItemsToNaturalItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItemGroups::addItemsToIngredientsItemGroup);
    }
}
