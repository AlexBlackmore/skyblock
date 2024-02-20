package net.skyblock.enchantment.custom;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.mob.MobEntity;
import net.skyblock.effect.ModStatusEffects;
import net.skyblock.enchantment.ModEnchantment;
import net.skyblock.enchantment.ModEnchantments;

import java.util.Objects;

public class LuckEnchantment extends ModEnchantment {
    public LuckEnchantment(Rarity weight, EnchantmentTarget target, EquipmentSlot... slotTypes) {
        super(weight, target, slotTypes);
    }

    @Override
    public int getTrueMaxLevel() {
        return 7;
    }

    @Override
    public void onTargetDamaged(LivingEntity user, Entity target, int level) {
        if (target instanceof MobEntity mob) {
            float chance = (float)(level * 0.05) + 0.085f;
            mob.setEquipmentDropChance(EquipmentSlot.HEAD, chance);
            mob.setEquipmentDropChance(EquipmentSlot.CHEST, chance);
            mob.setEquipmentDropChance(EquipmentSlot.LEGS, chance);
            mob.setEquipmentDropChance(EquipmentSlot.FEET, chance);
        }
    }
}
