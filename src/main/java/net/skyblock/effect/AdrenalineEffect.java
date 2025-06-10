package net.skyblock.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.util.Formatting;

public class AdrenalineEffect extends ModEffect {
    public AdrenalineEffect() {
        super(StatusEffectCategory.BENEFICIAL, Integer.parseInt("FF5555", 16));
    }

    @Override
    public void onApplied(LivingEntity entity, int amplifier) {
        super.onApplied(entity, amplifier);
        entity.setAbsorptionAmount(Math.max(entity.getAbsorptionAmount(), 4 * (1 + amplifier)));
    }
}
