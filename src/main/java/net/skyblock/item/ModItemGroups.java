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
    public static final ItemGroup RUNES = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Skyblock.MOD_ID, "runes"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.runes")).icon(() ->
                    new ItemStack(RuneItems.BLOOD)).entries((displayContext, entries) -> {
                entries.add(RuneItems.BLOOD);
            }).build());
    public static final ItemGroup ENCHANTED = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Skyblock.MOD_ID, "enchanted"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.enchanted")).icon(() ->
                    new ItemStack(EnchantedItems.POTATO)).entries((displayContext, entries) -> {
                        entries.add(EnchantedItems.ACACIA_LOG);
                        entries.add(EnchantedItems.BAKED_POTATO);
                        entries.add(EnchantedItems.BLAZE_POWDER);
                        entries.add(EnchantedItems.BLAZE_ROD);
                        entries.add(EnchantedItems.CACTUS);
                        entries.add(EnchantedItems.CAKE);
                        entries.add(EnchantedItems.COAL);
                        entries.add(EnchantedItems.COBBLESTONE);
                        entries.add(EnchantedItems.COCOA_BEANS);
                        entries.add(EnchantedItems.COOKED_CHICKEN);
                        entries.add(EnchantedItems.COOKED_MUTTON);
                        entries.add(EnchantedItems.COOKED_PORKCHOP);
                        entries.add(EnchantedItems.COOKIE);
                        entries.add(EnchantedItems.DIAMOND);
                        entries.add(EnchantedItems.EMERALD);
                        entries.add(EnchantedItems.FERMENTED_SPIDER_EYE);
                        entries.add(EnchantedItems.GHAST_TEAR);
                        entries.add(EnchantedItems.GLISTERING_MELON_SLICE);
                        entries.add(EnchantedItems.GLOWSTONE);
                        entries.add(EnchantedItems.GLOWSTONE_DUST);
                        entries.add(EnchantedItems.GOLD_BLOCK);
                        entries.add(EnchantedItems.GOLD_INGOT);
                        entries.add(EnchantedItems.GREEN_DYE);
                        entries.add(EnchantedItems.ICE);
                        entries.add(EnchantedItems.INK_SAC);
                        entries.add(EnchantedItems.IRON_INGOT);
                        entries.add(EnchantedItems.MELON_SLICE);
                        entries.add(EnchantedItems.MUTTON);
                        entries.add(EnchantedItems.NETHERRACK);
                        entries.add(EnchantedItems.POISONOUS_POTATO);
                        entries.add(EnchantedItems.POTATO);
                        entries.add(EnchantedItems.RABBIT_FOOT);
                        entries.add(EnchantedItems.RABBIT_HIDE);
                        entries.add(EnchantedItems.REDSTONE);
                        entries.add(EnchantedItems.REDSTONE_BLOCK);
                        entries.add(EnchantedItems.REDSTONE_LAMP);
                        entries.add(EnchantedItems.SPIDER_EYE);
                        entries.add(EnchantedItems.SUGAR);
                        entries.add(EnchantedItems.SUGAR_CANE);
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
        entries.add(ModBlocks.POOR_DWARVEN_GOLD);
        entries.add(ModBlocks.DWARVEN_GOLD);
        entries.add(ModBlocks.DWARVEN_EMERALD);
        entries.add(ModBlocks.DWARVEN_REDSTONE);
        entries.add(ModBlocks.TITANIUM_ORE);
    }
    private static void addItemsToFunctionalItemGroup(FabricItemGroupEntries entries) {
        entries.add(ModBlocks.WOOD_CHEST_PLUS);
        entries.add(ModBlocks.RUNIC_PEDESTAL);
    }
//    private static void addItemsToRedstoneItemGroup(FabricItemGroupEntries entries) {
//    }
    private static void addItemsToToolsItemGroup(FabricItemGroupEntries entries) {
        entries.add(ModItems.MAGICAL_WATER_BUCKET);
        entries.add(ModItems.MAGICAL_LAVA_BUCKET);
        entries.add(ModToolItems.ROOKIE_PICKAXE);
        entries.add(ModToolItems.ROOKIE_HOE);
        entries.add(ModToolItems.HOE_OF_GREAT_TILLING);
        entries.add(ModToolItems.HOE_OF_GREATER_TILLING);
        entries.add(ModToolItems.HOE_OF_GREATEST_TILLING);
        entries.add(ModToolItems.PROMISING_PICKAXE);
        entries.add(ModToolItems.ZOMBIE_PICKAXE);
        entries.add(ModToolItems.JUNGLE_PICKAXE);
        entries.add(ModToolItems.FRACTURED_MITHRIL_PICKAXE);
        entries.add(ModToolItems.BANDAGED_MITHRIL_PICKAXE);
        entries.add(ModToolItems.MITHRIL_PICKAXE);
        entries.add(ModToolItems.REFINED_MITHRIL_PICKAXE);
        entries.add(ModToolItems.TITANIUM_PICKAXE);
        entries.add(ModToolItems.REFINED_TITANIUM_PICKAXE);
        entries.add(ModToolItems.PICKONIMBUS_2000);
        entries.add(ModToolItems.BINGONIMBUS_2000);
        entries.add(ModMusicDiscItems.SPOOKY_DISC);
        entries.add(ModMusicDiscItems.BATTLE_DISC);
        entries.add(ModMusicDiscItems.WINTER_DISC);
        entries.add(ModMusicDiscItems.DUNGEON_DISC);
        entries.add(ModMusicDiscItems.CLOWN_DISC);
        entries.add(ModMusicDiscItems.WATCHER_DISC);
        entries.add(ModMusicDiscItems.NECRON_DISC);
        entries.add(ModMusicDiscItems.OLD_DISC);
    }
    private static void addItemsToCombatItemGroup(FabricItemGroupEntries entries) {
        entries.add(ModArmorItems.FARM_SUIT_HELMET);
        entries.add(ModArmorItems.FARM_SUIT_CHESTPLATE);
        entries.add(ModArmorItems.FARM_SUIT_LEGGINGS);
        entries.add(ModArmorItems.FARM_SUIT_BOOTS);
        entries.add(ModArmorItems.FARM_ARMOR_HELMET);
        entries.add(ModArmorItems.FARM_ARMOR_CHESTPLATE);
        entries.add(ModArmorItems.FARM_ARMOR_LEGGINGS);
        entries.add(ModArmorItems.FARM_ARMOR_BOOTS);
        entries.add(ModArmorItems.MUSHROOM_HELMET);
        entries.add(ModArmorItems.MUSHROOM_CHESTPLATE);
        entries.add(ModArmorItems.MUSHROOM_LEGGINGS);
        entries.add(ModArmorItems.MUSHROOM_BOOTS);
        entries.add(ModArmorItems.ROSETTAS_HELMET);
        entries.add(ModArmorItems.ROSETTAS_CHESTPLATE);
        entries.add(ModArmorItems.ROSETTAS_LEGGINGS);
        entries.add(ModArmorItems.ROSETTAS_BOOTS);
        entries.add(ModArmorItems.SQUIRE_HELMET);
        entries.add(ModArmorItems.SQUIRE_CHESTPLATE);
        entries.add(ModArmorItems.SQUIRE_LEGGINGS);
        entries.add(ModArmorItems.SQUIRE_BOOTS);
        entries.add(ModArmorItems.CELESTE_HELMET);
        entries.add(ModArmorItems.CELESTE_CHESTPLATE);
        entries.add(ModArmorItems.CELESTE_LEGGINGS);
        entries.add(ModArmorItems.CELESTE_BOOTS);
        entries.add(ModArmorItems.MINERS_OUTFIT_HELMET);
        entries.add(ModArmorItems.MINERS_OUTFIT_CHESTPLATE);
        entries.add(ModArmorItems.MINERS_OUTFIT_LEGGINGS);
        entries.add(ModArmorItems.MINERS_OUTFIT_BOOTS);
        entries.add(ModArmorItems.BLAZE_HAT);
        entries.add(ModArmorItems.GLACITE_HELMET);
        entries.add(ModArmorItems.GLACITE_CHESTPLATE);
        entries.add(ModArmorItems.GLACITE_LEGGINGS);
        entries.add(ModArmorItems.GLACITE_BOOTS);
    }
    private static void addItemsToFoodAndDrinkItemGroup(FabricItemGroupEntries entries) {
        entries.add(ModItems.MAGICAL_MILK_BUCKET);
        entries.add(ModBlocks.CENTURY_CAKE_PINK);
        entries.add(ModBlocks.CENTURY_CAKE_RED);
        entries.add(ModBlocks.CENTURY_CAKE_ORANGE);
        entries.add(ModBlocks.CENTURY_CAKE_YELLOW);
        entries.add(ModBlocks.CENTURY_CAKE_LIME);
        entries.add(ModBlocks.CENTURY_CAKE_AQUA);
        entries.add(ModBlocks.CENTURY_CAKE_BLUE);
        entries.add(ModBlocks.CENTURY_CAKE_MAGENTA);
        entries.add(ModBlocks.CENTURY_CAKE_BLACK);
        entries.add(ModBlocks.CENTURY_CAKE_BROWN);
        entries.add(ModBlocks.CENTURY_CAKE_WHITE);
        entries.add(ModBlocks.CENTURY_CAKE_CYAN);
        entries.add(ModBlocks.CENTURY_CAKE_GREEN);
        entries.add(ModBlocks.CENTURY_CAKE_GRAY);
    }
    private static void addItemsToIngredientsItemGroup(FabricItemGroupEntries entries) {
        entries.add(ModItems.MITHRIL);
        entries.add(ModItems.TITANIUM);
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
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(ModItemGroups::addItemsToFunctionalItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(ModItemGroups::addItemsToToolsItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(ModItemGroups::addItemsToCombatItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(ModItemGroups::addItemsToFoodAndDrinkItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItemGroups::addItemsToIngredientsItemGroup);
    }
}
