package net.skyblock.item;

import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.DyeableArmorItem;
import net.minecraft.item.DyeableItem;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.nbt.NbtElement;

public class DyeableModArmorItem extends DyeableArmorItem {
    public static final int DEFAULT_COLOR = 10511680;
    public DyeableModArmorItem(ArmorMaterial material, Type type, Settings settings) {
        super(material, type, settings);
    }
    @Override
    public int getColor(ItemStack stack) {
        return 10511680;
    }
}
