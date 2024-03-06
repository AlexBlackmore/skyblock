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
                .add(ModItems.FARM_ARMOR_HELMET, ModItems.FARM_ARMOR_CHESTPLATE, ModItems.FARM_ARMOR_LEGGINGS, ModItems.FARM_ARMOR_BOOTS)
                .add(ModItems.MUSHROOM_HELMET, ModItems.MUSHROOM_CHESTPLATE, ModItems.MUSHROOM_LEGGINGS, ModItems.MUSHROOM_BOOTS)
                .add(ModItems.ROSETTAS_HELMET, ModItems.ROSETTAS_CHESTPLATE, ModItems.ROSETTAS_LEGGINGS, ModItems.ROSETTAS_BOOTS)
                .add(ModItems.SQUIRE_HELMET, ModItems.SQUIRE_CHESTPLATE, ModItems.SQUIRE_LEGGINGS, ModItems.SQUIRE_BOOTS)
                .add(ModItems.CELESTE_HELMET, ModItems.CELESTE_CHESTPLATE, ModItems.CELESTE_LEGGINGS, ModItems.CELESTE_BOOTS)
                .add(ModItems.MINERS_OUTFIT_HELMET, ModItems.MINERS_OUTFIT_CHESTPLATE, ModItems.MINERS_OUTFIT_LEGGINGS, ModItems.MINERS_OUTFIT_BOOTS);

        getOrCreateTagBuilder(ItemTags.MUSIC_DISCS)
                .add(ModItems.SPOOKY_DISC)
                .add(ModItems.BATTLE_DISC)
                .add(ModItems.WINTER_DISC)
                .add(ModItems.DUNGEON_DISC)
                .add(ModItems.CLOWN_DISC)
                .add(ModItems.WATCHER_DISC)
                .add(ModItems.NECRON_DISC)
                .add(ModItems.OLD_DISC);
    }
}
