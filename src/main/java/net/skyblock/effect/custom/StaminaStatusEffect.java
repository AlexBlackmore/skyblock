package net.skyblock.effect.custom;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.InstantStatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import org.jetbrains.annotations.Nullable;

public class StaminaStatusEffect extends InstantStatusEffect {
    public StaminaStatusEffect(StatusEffectCategory statusEffectCategory, int i) {
        super(statusEffectCategory, i);
    }

    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        float health = 30.0f;
        if (amplifier > 0) {
            health += 3.0f + getHealthValue(amplifier);
        }
        entity.heal(health);
    }

    @Override
    public void applyInstantEffect(@Nullable Entity source, @Nullable Entity attacker, LivingEntity target, int amplifier, double proximity) {
        float health = 30.0f;
        if (amplifier > 0) {
            health += 3.0f + getHealthValue(amplifier);
        }
        target.heal(health);
    }

    private float getHealthValue(int amplifier) {
        if (amplifier == 0) {
            return 30;
        } else if (amplifier == 1) {
            return 40;
        } else {
            return getHealthValue(amplifier-2) + getHealthValue(amplifier-1);
        }
    }
}
