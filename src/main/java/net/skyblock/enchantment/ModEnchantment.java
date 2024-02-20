package net.skyblock.enchantment;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;

public class ModEnchantment extends Enchantment {
    protected ModEnchantment(Rarity weight, EnchantmentTarget target, EquipmentSlot... slotTypes) {
        super(weight, target, slotTypes);
    }

    public int getTrueMaxLevel() {
        return this.getMaxLevel();
    }

    @Override
    public int getMaxLevel() {
        return 5;
    }

}
