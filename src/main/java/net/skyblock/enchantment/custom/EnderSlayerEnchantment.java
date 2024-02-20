package net.skyblock.enchantment.custom;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;
import net.skyblock.enchantment.ModEnchantment;

public class EnderSlayerEnchantment extends ModEnchantment {
    public EnderSlayerEnchantment(Rarity weight, EnchantmentTarget target, EquipmentSlot... slotTypes) {
        super(weight, target, slotTypes);
    }

    @Override
    public int getTrueMaxLevel() {
        return 7;
    }
}
