/*
 * Decompiled with CFR 0.2.1 (FabricMC 53fa44c9).
 */
package net.skyblock.effect.custom;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.AttributeContainer;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.NbtCompound;
import net.skyblock.effect.ModStatusEffect;

public class FlyingStatusEffect
        extends ModStatusEffect {
    public FlyingStatusEffect(StatusEffectCategory statusEffectCategory, int i) {
        super(statusEffectCategory, i);
    }

//    @Override
//    public void onRemoved(AttributeContainer attributes, int amplifier) {
//        if (entity instanceof PlayerEntity) {
////            ((PlayerEntity) entity).getAbilities().allowFlying = false;
//            NbtCompound a = new NbtCompound();
//            a.putBoolean("mayfly", false);
//            NbtCompound b = new NbtCompound();
//            b.put("abilities", a);
//            ((PlayerEntity) entity).getAbilities().readNbt(b);
//        }
//    }

    @Override
    public void onApplied(LivingEntity entity, int amplifier) {
        if (entity instanceof PlayerEntity) {
//            ((PlayerEntity) entity).getAbilities().allowFlying = true;
            NbtCompound a = new NbtCompound();
            a.putBoolean("mayfly", true);
            NbtCompound b = new NbtCompound();
            b.put("abilities", a);
            ((PlayerEntity) entity).getAbilities().readNbt(b);
        }
    }
}

