package net.skyblock.effect.custom;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.skyblock.effect.ModStatusEffect;
import net.skyblock.effect.ModStatusEffects;

import java.util.Objects;

public class VenomedStatusEffect extends ModStatusEffect {
    public VenomedStatusEffect(StatusEffectCategory category, int color) {
        super(category, color);
    }
    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        entity.damage(entity.getDamageSources().magic(), (float) Objects.requireNonNull(entity.getStatusEffect(ModStatusEffects.VENOMED)).getAmplifier()+1.0f);
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return duration % 20 == 0;
    }
}
