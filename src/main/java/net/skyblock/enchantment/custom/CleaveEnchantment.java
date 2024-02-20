package net.skyblock.enchantment.custom;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.decoration.ArmorStandEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.MathHelper;
import net.skyblock.enchantment.ModEnchantment;

import java.util.List;

public class CleaveEnchantment extends ModEnchantment {
    public CleaveEnchantment(Rarity weight, EnchantmentTarget target, EquipmentSlot... slotTypes) {
        super(weight, target, slotTypes);
    }

    @Override
    public int getTrueMaxLevel() {
        return 7;
    }

    @Override
    public void onTargetDamaged(LivingEntity user, Entity target, int level) {
        float l = 1.0f + (float)(user.getAttributeValue(EntityAttributes.GENERIC_ATTACK_DAMAGE)*0.03*level);
        List<LivingEntity> list = user.getWorld().getNonSpectatingEntities(LivingEntity.class, target.getBoundingBox().expand(3.0+(0.3*level), 0.25, 3.0+(0.3*level)));
        for (LivingEntity livingEntity : list) {
            if (livingEntity == user || livingEntity == target || user.isTeammate(livingEntity) || livingEntity instanceof ArmorStandEntity && ((ArmorStandEntity) livingEntity).isMarker() || !(user.squaredDistanceTo(livingEntity) < 9.0))
                continue;
            livingEntity.takeKnockback(0.4f, MathHelper.sin(user.getYaw() * ((float) Math.PI / 180)), -MathHelper.cos(user.getYaw() * ((float) Math.PI / 180)));
            livingEntity.damage(user.getDamageSources().playerAttack((PlayerEntity) user), l);
        }

        super.onTargetDamaged(user, target, level);
    }
}
