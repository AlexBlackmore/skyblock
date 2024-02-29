/*
 * Decompiled with CFR 0.2.1 (FabricMC 53fa44c9).
 */
package net.skyblock.effect.custom;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.AttributeContainer;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.skyblock.effect.ModStatusEffect;

public class AdrenalineStatusEffect
        extends ModStatusEffect {
    public AdrenalineStatusEffect(StatusEffectCategory statusEffectCategory, int i) {
        super(statusEffectCategory, i);
    }

    @Override
    public void onApplied(LivingEntity entity, int amplifier) {
        entity.setAbsorptionAmount(entity.getAbsorptionAmount() + (float)(4 * (amplifier + 1)));
    }
}

