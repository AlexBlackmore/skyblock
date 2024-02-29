package net.skyblock.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.skyblock.item.ModItems;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }
    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.FARM_SUIT_HELMET, ModItems.FARM_SUIT_CHESTPLATE, ModItems.FARM_SUIT_LEGGINGS, ModItems.FARM_SUIT_BOOTS)
                .add(ModItems.FARM_ARMOR_HELMET, ModItems.FARM_ARMOR_CHESTPLATE, ModItems.FARM_ARMOR_LEGGINGS, ModItems.FARM_ARMOR_BOOTS);
    }
}
