package net.skyblock.mixin.client;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.client.color.block.BlockColors;
import net.minecraft.client.color.item.ItemColors;
import net.minecraft.client.color.world.FoliageColors;
import net.minecraft.client.color.world.GrassColors;
import net.minecraft.item.*;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.nbt.NbtElement;
import net.minecraft.potion.PotionUtil;
import net.skyblock.item.ModArmorItems;
import net.skyblock.item.ModItems;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(ItemColors.class)
public class ItemColorsMixin {
    /**
     * @author
     * @reason
     */
    @Overwrite
    public static ItemColors create(BlockColors blockColors) {
        ItemColors itemColors = new ItemColors();
        itemColors.register((stack, tintIndex) -> tintIndex > 0 ? -1 : ((DyeableItem)stack.getItem()).getColor(stack), Items.LEATHER_HELMET, Items.LEATHER_CHESTPLATE, Items.LEATHER_LEGGINGS, Items.LEATHER_BOOTS, Items.LEATHER_HORSE_ARMOR);
        itemColors.register((stack, tintIndex) -> tintIndex > 0 ? -1 : ((DyeableItem)stack.getItem()).getColor(stack), ModArmorItems.FARM_SUIT_HELMET, ModArmorItems.FARM_SUIT_CHESTPLATE, ModArmorItems.FARM_SUIT_LEGGINGS, ModArmorItems.FARM_SUIT_BOOTS);
        itemColors.register((stack, tintIndex) -> tintIndex > 0 ? -1 : ((DyeableItem)stack.getItem()).getColor(stack), ModArmorItems.FARM_ARMOR_HELMET, ModArmorItems.FARM_ARMOR_CHESTPLATE, ModArmorItems.FARM_ARMOR_LEGGINGS, ModArmorItems.FARM_ARMOR_BOOTS);
        itemColors.register((stack, tintIndex) -> tintIndex > 0 ? -1 : ((DyeableItem)stack.getItem()).getColor(stack), ModArmorItems.MUSHROOM_HELMET, ModArmorItems.MUSHROOM_CHESTPLATE, ModArmorItems.MUSHROOM_LEGGINGS, ModArmorItems.MUSHROOM_BOOTS);
        itemColors.register((stack, tintIndex) -> tintIndex > 0 ? -1 : ((DyeableItem)stack.getItem()).getColor(stack), ModArmorItems.SQUIRE_BOOTS);
        itemColors.register((stack, tintIndex) -> tintIndex > 0 ? -1 : ((DyeableItem)stack.getItem()).getColor(stack), ModArmorItems.CELESTE_HELMET, ModArmorItems.CELESTE_CHESTPLATE, ModArmorItems.CELESTE_LEGGINGS, ModArmorItems.CELESTE_BOOTS);
        itemColors.register((stack, tintIndex) -> tintIndex > 0 ? -1 : ((DyeableItem)stack.getItem()).getColor(stack), ModArmorItems.MINERS_OUTFIT_HELMET, ModArmorItems.MINERS_OUTFIT_CHESTPLATE, ModArmorItems.MINERS_OUTFIT_LEGGINGS, ModArmorItems.MINERS_OUTFIT_BOOTS);
        itemColors.register((stack, tintIndex) -> tintIndex > 0 ? -1 : ((DyeableItem)stack.getItem()).getColor(stack), ModArmorItems.GLACITE_CHESTPLATE, ModArmorItems.GLACITE_LEGGINGS, ModArmorItems.GLACITE_BOOTS);
        itemColors.register((stack, tintIndex) -> GrassColors.getColor((double)0.5, (double)1.0), Blocks.TALL_GRASS, Blocks.LARGE_FERN);
        itemColors.register((stack, tintIndex) -> {
            int[] is;
            if (tintIndex != 1) {
                return -1;
            }
            NbtCompound nbtCompound = stack.getSubNbt("Explosion");
            int[] nArray = is = nbtCompound != null && nbtCompound.contains("Colors", (int) NbtElement.INT_ARRAY_TYPE) ? nbtCompound.getIntArray("Colors") : null;
            if (is == null || is.length == 0) {
                return 0x8A8A8A;
            }
            if (is.length == 1) {
                return is[0];
            }
            int i = 0;
            int j = 0;
            int k = 0;
            for (int l : is) {
                i += (l & 0xFF0000) >> 16;
                j += (l & 0xFF00) >> 8;
                k += (l & 0xFF) >> 0;
            }
            return (i /= is.length) << 16 | (j /= is.length) << 8 | (k /= is.length);
        }, new ItemConvertible[]{Items.FIREWORK_STAR});
        itemColors.register((stack, tintIndex) -> tintIndex > 0 ? -1 : PotionUtil.getColor((ItemStack)stack), new ItemConvertible[]{Items.POTION, Items.SPLASH_POTION, Items.LINGERING_POTION});
        for (SpawnEggItem spawnEggItem : SpawnEggItem.getAll()) {
            itemColors.register((stack, tintIndex) -> spawnEggItem.getColor(tintIndex), new ItemConvertible[]{spawnEggItem});
        }
        itemColors.register((stack, tintIndex) -> {
            BlockState blockState = ((BlockItem)stack.getItem()).getBlock().getDefaultState();
            return blockColors.getColor(blockState, null, null, tintIndex);
        }, new ItemConvertible[]{Blocks.GRASS_BLOCK, Blocks.SHORT_GRASS, Blocks.FERN, Blocks.VINE, Blocks.OAK_LEAVES, Blocks.SPRUCE_LEAVES, Blocks.BIRCH_LEAVES, Blocks.JUNGLE_LEAVES, Blocks.ACACIA_LEAVES, Blocks.DARK_OAK_LEAVES, Blocks.LILY_PAD});
        itemColors.register((stack, tintIndex) -> FoliageColors.getMangroveColor(), new ItemConvertible[]{Blocks.MANGROVE_LEAVES});
        itemColors.register((stack, tintIndex) -> tintIndex == 0 ? PotionUtil.getColor((ItemStack)stack) : -1, new ItemConvertible[]{Items.TIPPED_ARROW});
        itemColors.register((stack, tintIndex) -> tintIndex == 0 ? -1 : FilledMapItem.getMapColor((ItemStack)stack), new ItemConvertible[]{Items.FILLED_MAP});
        return itemColors;
    }
}
