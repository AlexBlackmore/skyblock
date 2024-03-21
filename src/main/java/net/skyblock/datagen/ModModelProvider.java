package net.skyblock.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.item.ArmorItem;
import net.skyblock.item.ModArmorItems;
import net.skyblock.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.registerArmor((ArmorItem) ModArmorItems.FARM_SUIT_HELMET);
        itemModelGenerator.registerArmor((ArmorItem) ModArmorItems.FARM_SUIT_CHESTPLATE);
        itemModelGenerator.registerArmor((ArmorItem) ModArmorItems.FARM_SUIT_LEGGINGS);
        itemModelGenerator.registerArmor((ArmorItem) ModArmorItems.FARM_SUIT_BOOTS);

        itemModelGenerator.registerArmor((ArmorItem) ModArmorItems.FARM_ARMOR_HELMET);
        itemModelGenerator.registerArmor((ArmorItem) ModArmorItems.FARM_ARMOR_CHESTPLATE);
        itemModelGenerator.registerArmor((ArmorItem) ModArmorItems.FARM_ARMOR_LEGGINGS);
        itemModelGenerator.registerArmor((ArmorItem) ModArmorItems.FARM_ARMOR_BOOTS);

        itemModelGenerator.registerArmor((ArmorItem) ModArmorItems.MUSHROOM_HELMET);
        itemModelGenerator.registerArmor((ArmorItem) ModArmorItems.MUSHROOM_CHESTPLATE);
        itemModelGenerator.registerArmor((ArmorItem) ModArmorItems.MUSHROOM_LEGGINGS);
        itemModelGenerator.registerArmor((ArmorItem) ModArmorItems.MUSHROOM_BOOTS);

        itemModelGenerator.registerArmor((ArmorItem) ModArmorItems.ROSETTAS_HELMET);
        itemModelGenerator.registerArmor((ArmorItem) ModArmorItems.ROSETTAS_CHESTPLATE);
        itemModelGenerator.registerArmor((ArmorItem) ModArmorItems.ROSETTAS_LEGGINGS);
        itemModelGenerator.registerArmor((ArmorItem) ModArmorItems.ROSETTAS_BOOTS);

        itemModelGenerator.registerArmor((ArmorItem) ModArmorItems.SQUIRE_HELMET);
        itemModelGenerator.registerArmor((ArmorItem) ModArmorItems.SQUIRE_CHESTPLATE);
        itemModelGenerator.registerArmor((ArmorItem) ModArmorItems.SQUIRE_LEGGINGS);
        itemModelGenerator.registerArmor((ArmorItem) ModArmorItems.SQUIRE_BOOTS);

        itemModelGenerator.registerArmor((ArmorItem) ModArmorItems.CELESTE_HELMET);
        itemModelGenerator.registerArmor((ArmorItem) ModArmorItems.CELESTE_CHESTPLATE);
        itemModelGenerator.registerArmor((ArmorItem) ModArmorItems.CELESTE_LEGGINGS);
        itemModelGenerator.registerArmor((ArmorItem) ModArmorItems.CELESTE_BOOTS);

        itemModelGenerator.registerArmor((ArmorItem) ModArmorItems.MINERS_OUTFIT_HELMET);
        itemModelGenerator.registerArmor((ArmorItem) ModArmorItems.MINERS_OUTFIT_CHESTPLATE);
        itemModelGenerator.registerArmor((ArmorItem) ModArmorItems.MINERS_OUTFIT_LEGGINGS);
        itemModelGenerator.registerArmor((ArmorItem) ModArmorItems.MINERS_OUTFIT_BOOTS);

        itemModelGenerator.registerArmor((ArmorItem) ModArmorItems.GLACITE_CHESTPLATE);
        itemModelGenerator.registerArmor((ArmorItem) ModArmorItems.GLACITE_LEGGINGS);
        itemModelGenerator.registerArmor((ArmorItem) ModArmorItems.GLACITE_BOOTS);
    }
}
