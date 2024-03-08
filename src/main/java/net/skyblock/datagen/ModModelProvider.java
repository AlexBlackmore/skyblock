package net.skyblock.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.item.ArmorItem;
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
        itemModelGenerator.registerArmor((ArmorItem) ModItems.FARM_SUIT_HELMET);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.FARM_SUIT_CHESTPLATE);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.FARM_SUIT_LEGGINGS);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.FARM_SUIT_BOOTS);

        itemModelGenerator.registerArmor((ArmorItem) ModItems.FARM_ARMOR_HELMET);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.FARM_ARMOR_CHESTPLATE);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.FARM_ARMOR_LEGGINGS);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.FARM_ARMOR_BOOTS);

        itemModelGenerator.registerArmor((ArmorItem) ModItems.MUSHROOM_HELMET);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.MUSHROOM_CHESTPLATE);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.MUSHROOM_LEGGINGS);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.MUSHROOM_BOOTS);

        itemModelGenerator.registerArmor((ArmorItem) ModItems.ROSETTAS_HELMET);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.ROSETTAS_CHESTPLATE);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.ROSETTAS_LEGGINGS);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.ROSETTAS_BOOTS);

        itemModelGenerator.registerArmor((ArmorItem) ModItems.SQUIRE_HELMET);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.SQUIRE_CHESTPLATE);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.SQUIRE_LEGGINGS);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.SQUIRE_BOOTS);

        itemModelGenerator.registerArmor((ArmorItem) ModItems.CELESTE_HELMET);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.CELESTE_CHESTPLATE);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.CELESTE_LEGGINGS);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.CELESTE_BOOTS);

        itemModelGenerator.registerArmor((ArmorItem) ModItems.MINERS_OUTFIT_HELMET);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.MINERS_OUTFIT_CHESTPLATE);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.MINERS_OUTFIT_LEGGINGS);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.MINERS_OUTFIT_BOOTS);

        itemModelGenerator.registerArmor((ArmorItem) ModItems.GLACITE_CHESTPLATE);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.GLACITE_LEGGINGS);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.GLACITE_BOOTS);
    }
}
