package net.skyblock.enchantment.custom;

import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;
import net.skyblock.enchantment.ModEnchantment;

public class ExperienceEnchantment extends ModEnchantment {
    public ExperienceEnchantment(Rarity weight, EnchantmentTarget target, EquipmentSlot... slotTypes) {
        super(weight, target, slotTypes);
    }

    @Override
    public int getMaxLevel() { return 3; }

    @Override
    public int getTrueMaxLevel() {
        return 5;
    }
}
