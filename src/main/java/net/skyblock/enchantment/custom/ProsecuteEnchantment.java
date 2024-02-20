package net.skyblock.enchantment.custom;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;
import net.skyblock.enchantment.ModEnchantment;
import net.skyblock.enchantment.ModEnchantments;

public class ProsecuteEnchantment extends ModEnchantment {
    public ProsecuteEnchantment(Rarity weight, EnchantmentTarget target, EquipmentSlot... slotTypes) {
        super(weight, target, slotTypes);
    }

    @Override
    public int getTrueMaxLevel() {
        return 6;
    }

    @Override
    public boolean canAccept(Enchantment other) {
        return super.canAccept(other) && other != ModEnchantments.EXECUTE;
    }
}
