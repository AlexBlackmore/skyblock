package net.skyblock.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.*;
import net.minecraft.util.Rarity;
import net.skyblock.Skyblock;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.skyblock.item.custom.*;
import net.skyblock.util.ModRarity;

public class ModItems {
    public static final Item MITHRIL = registerItem("mithril", new ModItem(new FabricItemSettings(), ModRarity.COMMON, "mithril"));
    public static final Item TITANIUM = registerItem("titanium", new ModItem(new FabricItemSettings(), ModRarity.RARE, "titanium"));
//    public static final Item BASKET_OF_SEEDS = registerItem("basket_of_seeds", new ModPlayerHeadItem(new Item.Settings().rarity(Rarity.EPIC)));
    public static final Item MAGICAL_WATER_BUCKET = registerItem("magical_water_bucket", new MagicalBucketItem(Fluids.WATER, new FabricItemSettings(), "magical_water_bucket"));
    public static final Item MAGICAL_LAVA_BUCKET = registerItem("magical_lava_bucket", new MagicalBucketItem(Fluids.LAVA, new FabricItemSettings().rarity(Rarity.UNCOMMON), "magical_lava_bucket"));
    public static final Item MAGICAL_MILK_BUCKET = registerItem("magical_milk_bucket", new MagicalMilkBucket(new FabricItemSettings(), "magical_milk_bucket"));
    public static final Item ROOKIE_HOE = registerItem("rookie_hoe", new HoeItem(ToolMaterials.STONE, -1, -2.0f, new FabricItemSettings()));
    public static final Item HOE_OF_GREAT_TILLING = registerItem("hoe_of_great_tilling", new TillingHoeItem(ToolMaterials.STONE, -1, 0.0f, new FabricItemSettings(), ModRarity.UNCOMMON, "hoe_of_great_tilling", 3));
    public static final Item HOE_OF_GREATER_TILLING = registerItem("hoe_of_greater_tilling", new TillingHoeItem(ToolMaterials.DIAMOND, -3, 0.0f, new FabricItemSettings(), ModRarity.RARE, "hoe_of_great_tilling", 5));
    public static final Item HOE_OF_GREATEST_TILLING = registerItem("hoe_of_greatest_tilling", new GreatestTillingHoeItem(new FabricItemSettings()));
    public static final Item FOUL_FLESH = registerItem("foul_flesh", new Item(new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item TRUE_ESSENCE = registerItem("true_essence", new EnchantedItem(new FabricItemSettings()));
    public static final Item REFINED_MINERAL = registerItem("refined_mineral", new Item(new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item ZOMBIE_PICKAXE = registerItem("zombie_pickaxe", new ZombiePickaxeItem(new FabricItemSettings()));
    public static final Item JUNGLE_PICKAXE = registerItem("jungle_pickaxe", new JunglePickaxeItem(new FabricItemSettings()));
    public static final Item ROOKIE_PICKAXE = registerItem("rookie_pickaxe", new ModPickaxe(ToolMaterials.STONE, new FabricItemSettings().rarity(Rarity.COMMON)));
    public static final Item FRACTURED_MITHRIL_PICKAXE = registerItem("fractured_mithril_pickaxe", new ModPickaxe(ModToolMaterial.FRACTURED_MITHRIL, new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item BANDAGED_MITHRIL_PICKAXE = registerItem("bandaged_mithril_pickaxe", new ModPickaxe(ModToolMaterial.BANDAGED_MITHRIL, new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item MITHRIL_PICKAXE = registerItem("mithril_pickaxe", new MithrilPickaxeItem(ModToolMaterial.MITHRIL, new FabricItemSettings(), ModRarity.UNCOMMON, 5, 20));
    public static final Item REFINED_MITHRIL_PICKAXE = registerItem("refined_mithril_pickaxe", new MithrilPickaxeItem(ModToolMaterial.REFINED_MITHRIL, new FabricItemSettings(), ModRarity.RARE, 10, 50));
    public static final Item TITANIUM_PICKAXE = registerItem("titanium_pickaxe", new TitaniumPickaxeItem(ModToolMaterial.TITANIUM, new FabricItemSettings(), ModRarity.RARE, 10));
    public static final Item REFINED_TITANIUM_PICKAXE = registerItem("refined_titanium_pickaxe", new TitaniumPickaxeItem(ModToolMaterial.REFINED_TITANIUM, new FabricItemSettings(), ModRarity.RARE, 15));
    public static final Item PICKONIMBUS_2000 = registerItem("pickonimbus_2000", new Pickonimbus2000Pickaxe());
    public static final Item BINGONIMBUS_2000 = registerItem("bingonimbus_2000", new ModPickaxe(ModToolMaterial.PICKONIMBUS, new FabricItemSettings(), ModRarity.EPIC, "bingonimbus_2000"));

    public static final Item FARM_SUIT_HELMET = registerItem("farm_suit_helmet", new ModDyeableArmorItem(ModArmorMaterial.FARM_SUIT, ArmorItem.Type.HELMET, new FabricItemSettings(), ModRarity.COMMON, "farm_suit", 16776960));
    public static final Item FARM_SUIT_CHESTPLATE = registerItem("farm_suit_chestplate", new ModDyeableArmorItem(ModArmorMaterial.FARM_SUIT, ArmorItem.Type.CHESTPLATE, new FabricItemSettings(), ModRarity.COMMON, "farm_suit", 16776960));
    public static final Item FARM_SUIT_LEGGINGS = registerItem("farm_suit_leggings", new ModDyeableArmorItem(ModArmorMaterial.FARM_SUIT, ArmorItem.Type.LEGGINGS, new FabricItemSettings(), ModRarity.COMMON, "farm_suit", 16776960));
    public static final Item FARM_SUIT_BOOTS = registerItem("farm_suit_boots", new ModDyeableArmorItem(ModArmorMaterial.FARM_SUIT, ArmorItem.Type.BOOTS, new FabricItemSettings(), ModRarity.COMMON, "farm_suit", 16776960));

    public static final Item FARM_ARMOR_HELMET = registerItem("farm_armor_helmet", new ModDyeableArmorItem(ModArmorMaterial.FARM_ARMOR, ArmorItem.Type.HELMET, new FabricItemSettings(), ModRarity.RARE, "farm_armor", 16766720));
    public static final Item FARM_ARMOR_CHESTPLATE = registerItem("farm_armor_chestplate", new ModDyeableArmorItem(ModArmorMaterial.FARM_ARMOR, ArmorItem.Type.CHESTPLATE, new FabricItemSettings(), ModRarity.RARE, "farm_armor", 16766720));
    public static final Item FARM_ARMOR_LEGGINGS = registerItem("farm_armor_leggings", new ModDyeableArmorItem(ModArmorMaterial.FARM_ARMOR, ArmorItem.Type.LEGGINGS, new FabricItemSettings(), ModRarity.RARE, "farm_armor", 16766720));
    public static final Item FARM_ARMOR_BOOTS = registerItem("farm_armor_boots", new ModDyeableArmorItem(ModArmorMaterial.FARM_ARMOR, ArmorItem.Type.BOOTS, new FabricItemSettings(), ModRarity.RARE, "farm_armor", 16766720));

    public static final Item MUSHROOM_HELMET = registerItem("mushroom_helmet", new ModDyeableArmorItem(ModArmorMaterial.MUSHROOM, ArmorItem.Type.HELMET, new FabricItemSettings(), ModRarity.COMMON, "mushroom_armor", 16711680));
    public static final Item MUSHROOM_CHESTPLATE = registerItem("mushroom_chestplate", new ModDyeableArmorItem(ModArmorMaterial.MUSHROOM, ArmorItem.Type.CHESTPLATE, new FabricItemSettings(), ModRarity.COMMON, "mushroom_armor", 16711680));
    public static final Item MUSHROOM_LEGGINGS = registerItem("mushroom_leggings", new ModDyeableArmorItem(ModArmorMaterial.MUSHROOM, ArmorItem.Type.LEGGINGS, new FabricItemSettings(), ModRarity.COMMON, "mushroom_armor", 16711680));
    public static final Item MUSHROOM_BOOTS = registerItem("mushroom_boots", new ModDyeableArmorItem(ModArmorMaterial.MUSHROOM, ArmorItem.Type.BOOTS, new FabricItemSettings(), ModRarity.COMMON, "mushroom_armor", 16711680));

    public static final Item ROSETTAS_HELMET = registerItem("rosettas_helmet", new ModArmorItem(ModArmorMaterial.ROSETTAS, ArmorItem.Type.HELMET, new FabricItemSettings(), ModRarity.UNCOMMON, "rosettas_armor"));
    public static final Item ROSETTAS_CHESTPLATE = registerItem("rosettas_chestplate", new ModArmorItem(ModArmorMaterial.ROSETTAS, ArmorItem.Type.CHESTPLATE, new FabricItemSettings(), ModRarity.UNCOMMON, "rosettas_armor"));
    public static final Item ROSETTAS_LEGGINGS = registerItem("rosettas_leggings", new ModArmorItem(ModArmorMaterial.ROSETTAS, ArmorItem.Type.LEGGINGS, new FabricItemSettings(), ModRarity.UNCOMMON, "rosettas_armor"));
    public static final Item ROSETTAS_BOOTS = registerItem("rosettas_boots", new ModArmorItem(ModArmorMaterial.ROSETTAS, ArmorItem.Type.BOOTS, new FabricItemSettings(), ModRarity.UNCOMMON, "rosettas_armor"));

    public static final Item SQUIRE_HELMET = registerItem("squire_helmet", new ModArmorItem(ModArmorMaterial.SQUIRE, ArmorItem.Type.HELMET, new FabricItemSettings(), ModRarity.UNCOMMON, "squire_armor"));
    public static final Item SQUIRE_CHESTPLATE = registerItem("squire_chestplate", new ModArmorItem(ModArmorMaterial.SQUIRE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings(), ModRarity.UNCOMMON, "squire_armor"));
    public static final Item SQUIRE_LEGGINGS = registerItem("squire_leggings", new ModArmorItem(ModArmorMaterial.SQUIRE, ArmorItem.Type.LEGGINGS, new FabricItemSettings(), ModRarity.UNCOMMON, "squire_armor"));
    public static final Item SQUIRE_BOOTS = registerItem("squire_boots", new ModDyeableArmorItem(ModArmorMaterial.SQUIRE, ArmorItem.Type.BOOTS, new FabricItemSettings(), ModRarity.UNCOMMON, "squire_armor", 5526612));

    public static final Item CELESTE_HELMET = registerItem("celeste_helmet", new ModDyeableArmorItem(ModArmorMaterial.CELESTE, ArmorItem.Type.HELMET, new FabricItemSettings(), ModRarity.UNCOMMON, "celeste_armor", 13930226));
    public static final Item CELESTE_CHESTPLATE = registerItem("celeste_chestplate", new ModDyeableArmorItem(ModArmorMaterial.CELESTE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings(), ModRarity.UNCOMMON, "celeste_armor", 16748254));
    public static final Item CELESTE_LEGGINGS = registerItem("celeste_leggings", new ModDyeableArmorItem(ModArmorMaterial.CELESTE, ArmorItem.Type.LEGGINGS, new FabricItemSettings(), ModRarity.UNCOMMON, "celeste_armor", 16748234));
    public static final Item CELESTE_BOOTS = registerItem("celeste_boots", new ModDyeableArmorItem(ModArmorMaterial.CELESTE, ArmorItem.Type.BOOTS, new FabricItemSettings(), ModRarity.UNCOMMON, "celeste_armor", 16748214));

    private static ModItem registerItem(String name, ModItem item) {
        return Registry.register(Registries.ITEM, new Identifier(Skyblock.MOD_ID, name), item);
    }
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Skyblock.MOD_ID, name), item);
    }
    public static void registerModItems() {
        Skyblock.LOGGER.info("Registering Mod Items for " + Skyblock.MOD_ID);

        EnchantedItems.registerEnchantedItems();
    }
}
