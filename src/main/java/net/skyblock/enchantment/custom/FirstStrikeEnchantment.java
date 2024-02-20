package net.skyblock.enchantment.custom;

import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.text.Text;
import net.skyblock.enchantment.ModEnchantment;

import java.util.Map;

public class FirstStrikeEnchantment extends ModEnchantment {


    public FirstStrikeEnchantment(Rarity weight, EnchantmentTarget target, EquipmentSlot... slotTypes) {
        super(weight, target, slotTypes);
    }

//    @Override
//    public void onTargetDamaged(LivingEntity user, Entity target, int level) {
//    }

    @Override
    public int getMaxLevel() { return 4; }

    @Override
    public int getTrueMaxLevel() {
        return 5;
    }
}
