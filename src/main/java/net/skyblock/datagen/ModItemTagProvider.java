package net.skyblock.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.skyblock.item.ModArmorItems;
import net.skyblock.item.ModItems;
import net.skyblock.item.ModMusicDiscItems;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }
    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModArmorItems.FARM_SUIT_HELMET, ModArmorItems.FARM_SUIT_CHESTPLATE, ModArmorItems.FARM_SUIT_LEGGINGS, ModArmorItems.FARM_SUIT_BOOTS)
                .add(ModArmorItems.FARM_ARMOR_HELMET, ModArmorItems.FARM_ARMOR_CHESTPLATE, ModArmorItems.FARM_ARMOR_LEGGINGS, ModArmorItems.FARM_ARMOR_BOOTS)
                .add(ModArmorItems.MUSHROOM_HELMET, ModArmorItems.MUSHROOM_CHESTPLATE, ModArmorItems.MUSHROOM_LEGGINGS, ModArmorItems.MUSHROOM_BOOTS)
                .add(ModArmorItems.ROSETTAS_HELMET, ModArmorItems.ROSETTAS_CHESTPLATE, ModArmorItems.ROSETTAS_LEGGINGS, ModArmorItems.ROSETTAS_BOOTS)
                .add(ModArmorItems.SQUIRE_HELMET, ModArmorItems.SQUIRE_CHESTPLATE, ModArmorItems.SQUIRE_LEGGINGS, ModArmorItems.SQUIRE_BOOTS)
                .add(ModArmorItems.CELESTE_HELMET, ModArmorItems.CELESTE_CHESTPLATE, ModArmorItems.CELESTE_LEGGINGS, ModArmorItems.CELESTE_BOOTS)
                .add(ModArmorItems.MINERS_OUTFIT_HELMET, ModArmorItems.MINERS_OUTFIT_CHESTPLATE, ModArmorItems.MINERS_OUTFIT_LEGGINGS, ModArmorItems.MINERS_OUTFIT_BOOTS)
                .add(ModArmorItems.GLACITE_CHESTPLATE, ModArmorItems.GLACITE_LEGGINGS, ModArmorItems.GLACITE_BOOTS);

        getOrCreateTagBuilder(ItemTags.MUSIC_DISCS)
                .add(ModMusicDiscItems.SPOOKY_DISC)
                .add(ModMusicDiscItems.BATTLE_DISC)
                .add(ModMusicDiscItems.WINTER_DISC)
                .add(ModMusicDiscItems.DUNGEON_DISC)
                .add(ModMusicDiscItems.CLOWN_DISC)
                .add(ModMusicDiscItems.WATCHER_DISC)
                .add(ModMusicDiscItems.NECRON_DISC)
                .add(ModMusicDiscItems.OLD_DISC);
    }
}
