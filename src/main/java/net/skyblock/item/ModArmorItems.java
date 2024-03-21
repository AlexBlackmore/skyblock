package net.skyblock.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.skyblock.Skyblock;
import net.skyblock.util.ModRarity;

public class ModArmorItems {

    public static final Item FARM_SUIT_HELMET = registerItem("farm_suit_helmet", new ModDyeableArmorItem(ModArmorMaterial.FARM_SUIT, ArmorItem.Type.HELMET, new FabricItemSettings(), 16776960).setLoreKey("farm_suit"));
    public static final Item FARM_SUIT_CHESTPLATE = registerItem("farm_suit_chestplate", new ModDyeableArmorItem(ModArmorMaterial.FARM_SUIT, ArmorItem.Type.CHESTPLATE, new FabricItemSettings(), 16776960).setLoreKey("farm_suit"));
    public static final Item FARM_SUIT_LEGGINGS = registerItem("farm_suit_leggings", new ModDyeableArmorItem(ModArmorMaterial.FARM_SUIT, ArmorItem.Type.LEGGINGS, new FabricItemSettings(), 16776960).setLoreKey("farm_suit"));
    public static final Item FARM_SUIT_BOOTS = registerItem("farm_suit_boots", new ModDyeableArmorItem(ModArmorMaterial.FARM_SUIT, ArmorItem.Type.BOOTS, new FabricItemSettings(), 16776960).setLoreKey("farm_suit"));

    public static final Item FARM_ARMOR_HELMET = registerItem("farm_armor_helmet", new ModDyeableArmorItem(ModArmorMaterial.FARM_ARMOR, ArmorItem.Type.HELMET, new FabricItemSettings(), 16766720).setModRarity(ModRarity.RARE).setLoreKey("farm_armor"));
    public static final Item FARM_ARMOR_CHESTPLATE = registerItem("farm_armor_chestplate", new ModDyeableArmorItem(ModArmorMaterial.FARM_ARMOR, ArmorItem.Type.CHESTPLATE, new FabricItemSettings(), 16766720).setModRarity(ModRarity.RARE).setLoreKey("farm_armor"));
    public static final Item FARM_ARMOR_LEGGINGS = registerItem("farm_armor_leggings", new ModDyeableArmorItem(ModArmorMaterial.FARM_ARMOR, ArmorItem.Type.LEGGINGS, new FabricItemSettings(), 16766720).setModRarity(ModRarity.RARE).setLoreKey("farm_armor"));
    public static final Item FARM_ARMOR_BOOTS = registerItem("farm_armor_boots", new ModDyeableArmorItem(ModArmorMaterial.FARM_ARMOR, ArmorItem.Type.BOOTS, new FabricItemSettings(), 16766720).setModRarity(ModRarity.RARE).setLoreKey("farm_armor"));

    public static final Item MUSHROOM_HELMET = registerItem("mushroom_helmet", new ModDyeableArmorItem(ModArmorMaterial.MUSHROOM, ArmorItem.Type.HELMET, new FabricItemSettings(), 16711680).setLoreKey("mushroom_armor"));
    public static final Item MUSHROOM_CHESTPLATE = registerItem("mushroom_chestplate", new ModDyeableArmorItem(ModArmorMaterial.MUSHROOM, ArmorItem.Type.CHESTPLATE, new FabricItemSettings(), 16711680).setLoreKey("mushroom_armor"));
    public static final Item MUSHROOM_LEGGINGS = registerItem("mushroom_leggings", new ModDyeableArmorItem(ModArmorMaterial.MUSHROOM, ArmorItem.Type.LEGGINGS, new FabricItemSettings(), 16711680).setLoreKey("mushroom_armor"));
    public static final Item MUSHROOM_BOOTS = registerItem("mushroom_boots", new ModDyeableArmorItem(ModArmorMaterial.MUSHROOM, ArmorItem.Type.BOOTS, new FabricItemSettings(), 16711680).setLoreKey("mushroom_armor"));

    public static final Item ROSETTAS_HELMET = registerItem("rosettas_helmet", new ModArmorItem(ModArmorMaterial.ROSETTAS, ArmorItem.Type.HELMET, new FabricItemSettings()).setModRarity(ModRarity.UNCOMMON).setLoreKey("rosettas_armor"));
    public static final Item ROSETTAS_CHESTPLATE = registerItem("rosettas_chestplate", new ModArmorItem(ModArmorMaterial.ROSETTAS, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()).setModRarity(ModRarity.UNCOMMON).setLoreKey("rosettas_armor"));
    public static final Item ROSETTAS_LEGGINGS = registerItem("rosettas_leggings", new ModArmorItem(ModArmorMaterial.ROSETTAS, ArmorItem.Type.LEGGINGS, new FabricItemSettings()).setModRarity(ModRarity.UNCOMMON).setLoreKey("rosettas_armor"));
    public static final Item ROSETTAS_BOOTS = registerItem("rosettas_boots", new ModArmorItem(ModArmorMaterial.ROSETTAS, ArmorItem.Type.BOOTS, new FabricItemSettings()).setModRarity(ModRarity.UNCOMMON).setLoreKey("rosettas_armor"));

    public static final Item SQUIRE_HELMET = registerItem("squire_helmet", new ModArmorItem(ModArmorMaterial.SQUIRE, ArmorItem.Type.HELMET, new FabricItemSettings()).setModRarity(ModRarity.UNCOMMON).setLoreKey("squire_armor"));
    public static final Item SQUIRE_CHESTPLATE = registerItem("squire_chestplate", new ModArmorItem(ModArmorMaterial.SQUIRE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()).setModRarity(ModRarity.UNCOMMON).setLoreKey("squire_armor"));
    public static final Item SQUIRE_LEGGINGS = registerItem("squire_leggings", new ModArmorItem(ModArmorMaterial.SQUIRE, ArmorItem.Type.LEGGINGS, new FabricItemSettings()).setModRarity(ModRarity.UNCOMMON).setLoreKey("squire_armor"));
    public static final Item SQUIRE_BOOTS = registerItem("squire_boots", new ModDyeableArmorItem(ModArmorMaterial.SQUIRE, ArmorItem.Type.BOOTS, new FabricItemSettings(), 5526612).setModRarity(ModRarity.UNCOMMON).setLoreKey("squire_armor"));

    public static final Item CELESTE_HELMET = registerItem("celeste_helmet", new ModDyeableArmorItem(ModArmorMaterial.CELESTE, ArmorItem.Type.HELMET, new FabricItemSettings(), 13930226).setModRarity(ModRarity.UNCOMMON).setLoreKey("celeste_armor"));
    public static final Item CELESTE_CHESTPLATE = registerItem("celeste_chestplate", new ModDyeableArmorItem(ModArmorMaterial.CELESTE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings(), 16748254).setModRarity(ModRarity.UNCOMMON).setLoreKey("celeste_armor"));
    public static final Item CELESTE_LEGGINGS = registerItem("celeste_leggings", new ModDyeableArmorItem(ModArmorMaterial.CELESTE, ArmorItem.Type.LEGGINGS, new FabricItemSettings(), 16748234).setModRarity(ModRarity.UNCOMMON).setLoreKey("celeste_armor"));
    public static final Item CELESTE_BOOTS = registerItem("celeste_boots", new ModDyeableArmorItem(ModArmorMaterial.CELESTE, ArmorItem.Type.BOOTS, new FabricItemSettings(), 16748214).setModRarity(ModRarity.UNCOMMON).setLoreKey("celeste_armor"));

    public static final Item MINERS_OUTFIT_HELMET = registerItem("miners_outfit_helmet", new ModDyeableArmorItem(ModArmorMaterial.MINERS_OUTFIT, ArmorItem.Type.HELMET, new FabricItemSettings(), 8026468).setModRarity(ModRarity.UNCOMMON).setLoreKey("miners_outfit"));
    public static final Item MINERS_OUTFIT_CHESTPLATE = registerItem("miners_outfit_chestplate", new ModDyeableArmorItem(ModArmorMaterial.MINERS_OUTFIT, ArmorItem.Type.CHESTPLATE, new FabricItemSettings(), 8026468).setModRarity(ModRarity.UNCOMMON).setLoreKey("miners_outfit"));
    public static final Item MINERS_OUTFIT_LEGGINGS = registerItem("miners_outfit_leggings", new ModDyeableArmorItem(ModArmorMaterial.MINERS_OUTFIT, ArmorItem.Type.LEGGINGS, new FabricItemSettings(), 8026468).setModRarity(ModRarity.UNCOMMON).setLoreKey("miners_outfit"));
    public static final Item MINERS_OUTFIT_BOOTS = registerItem("miners_outfit_boots", new ModDyeableArmorItem(ModArmorMaterial.MINERS_OUTFIT, ArmorItem.Type.BOOTS, new FabricItemSettings(), 8026468).setModRarity(ModRarity.UNCOMMON).setLoreKey("miners_outfit"));
    public static final Item BLAZE_HAT = registerItem("blaze_hat", new ModArmorItem(ModArmorMaterial.BLAZE_HAT, ArmorItem.Type.HELMET, new FabricItemSettings()));

    public static final Item GLACITE_HELMET = registerItem("glacite_helmet", new ModArmorItem(ModArmorMaterial.GLACITE, ArmorItem.Type.HELMET, new FabricItemSettings()).setModRarity(ModRarity.EPIC).setLoreKey("glacite_armor"));
    public static final Item GLACITE_CHESTPLATE = registerItem("glacite_chestplate", new ModDyeableArmorItem(ModArmorMaterial.GLACITE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings(), 261368).setModRarity(ModRarity.EPIC).setLoreKey("glacite_armor"));
    public static final Item GLACITE_LEGGINGS = registerItem("glacite_leggings", new ModDyeableArmorItem(ModArmorMaterial.GLACITE, ArmorItem.Type.LEGGINGS, new FabricItemSettings(), 261368).setModRarity(ModRarity.EPIC).setLoreKey("glacite_armor"));
    public static final Item GLACITE_BOOTS = registerItem("glacite_boots", new ModDyeableArmorItem(ModArmorMaterial.GLACITE, ArmorItem.Type.BOOTS, new FabricItemSettings(), 261368).setModRarity(ModRarity.EPIC).setLoreKey("glacite_armor"));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Skyblock.MOD_ID, name), item);
    }
    public static void registerModArmorItems() {
        Skyblock.LOGGER.info("Registering Mod Armor Items for " + Skyblock.MOD_ID);

    }
}
