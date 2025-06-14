package net.skyblock.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.text.Text;
import net.skyblock.ability.Ability;

public class AbilityEffect extends ModEffect {
    private Ability ability;
    private boolean isCooldown = false;

    public AbilityEffect(Ability ability, StatusEffectCategory category, int color) {
        super(category, color);
        this.ability = ability;
    }

    public AbilityEffect(Ability ability, boolean isCooldown, StatusEffectCategory category, int color) {
        super(category, color);
        this.ability = ability;
        this.isCooldown = isCooldown;
    }

    @Override
    public Text getName() {
        if (isCooldown) {
            return Text.translatable("ability.skyblock.cooldown_effect", Text.translatable("ability.skyblock." + ability.name));
        } else {
            return Text.translatable("ability.skyblock." + ability.name);
        }
    }
}
