package net.skyblock.enchantment.custom;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.skyblock.effect.ModStatusEffects;
import net.skyblock.enchantment.ModEnchantment;
import net.skyblock.enchantment.ModEnchantments;

import java.util.Objects;

public class LethalityEnchantment extends ModEnchantment {
    public LethalityEnchantment(Rarity weight, EnchantmentTarget target, EquipmentSlot... slotTypes) {
        super(weight, target, slotTypes);
    }

    @Override
    public int getTrueMaxLevel() {
        return 6;
    }

    @Override
    public void onTargetDamaged(LivingEntity user, Entity target, int level) {
        level--;

        if (!(((LivingEntity) target).hasStatusEffect(ModStatusEffects.LETHALITY) && Objects.requireNonNull(((LivingEntity) target).getStatusEffect(ModStatusEffects.LETHALITY)).getAmplifier() > level)) {
            ((LivingEntity) target).addStatusEffect(new StatusEffectInstance(ModStatusEffects.LETHALITY, 80, level));
        }
    }
}
