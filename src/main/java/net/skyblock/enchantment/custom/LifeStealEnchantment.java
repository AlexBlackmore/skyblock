package net.skyblock.enchantment.custom;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.skyblock.enchantment.ModEnchantment;
import net.skyblock.enchantment.ModEnchantments;

public class LifeStealEnchantment extends ModEnchantment {
    public LifeStealEnchantment(Rarity weight, EnchantmentTarget target, EquipmentSlot... slotTypes) {
        super(weight, target, slotTypes);
    }

    @Override
    public int getMaxLevel() { return 3; }

    @Override
    public int getTrueMaxLevel() {
        return 5;
    }

    @Override
    public void onTargetDamaged(LivingEntity user, Entity target, int level) {
        user.heal(user.getMaxHealth()*0.005f);
    }
}
