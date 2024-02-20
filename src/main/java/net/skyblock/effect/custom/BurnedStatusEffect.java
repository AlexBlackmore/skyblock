package net.skyblock.effect.custom;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.AttributeContainer;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.skyblock.effect.ModStatusEffect;
import net.skyblock.effect.ModStatusEffects;

import java.util.Objects;

public class BurnedStatusEffect extends ModStatusEffect {
    public BurnedStatusEffect(StatusEffectCategory category, int color) {
        super(category, color);
    }

    @Override
    public void onRemoved(LivingEntity entity, AttributeContainer attributes, int amplifier) {}

    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
            entity.damage(entity.getDamageSources().onFire(), (float) Objects.requireNonNull(entity.getStatusEffect(ModStatusEffects.BURNING)).getAmplifier()+1.0f);
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return duration % 20 == 0;
    }

    @Override
    public void onApplied(LivingEntity entity, AttributeContainer attributes, int amplifier) {
        entity.setOnFireFor(Objects.requireNonNull(entity.getStatusEffect(ModStatusEffects.BURNING)).getDuration()/20);
    }
}
