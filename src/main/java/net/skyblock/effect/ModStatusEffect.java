package net.skyblock.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.AttributeContainer;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;

public class ModStatusEffect extends StatusEffect {
    protected ModStatusEffect(StatusEffectCategory category, int color) {
        super(category, color);
    }

    public void onRemoved(LivingEntity entity, AttributeContainer attributes, int amplifier) {}

    public void onApplied(LivingEntity entity, AttributeContainer attributes, int amplifier) {}
}
