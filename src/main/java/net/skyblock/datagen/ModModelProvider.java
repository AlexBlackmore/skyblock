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
    }
}
