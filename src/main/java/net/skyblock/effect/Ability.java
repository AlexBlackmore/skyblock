package net.skyblock.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.AttributeContainer;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;

import java.util.ArrayList;
import java.util.List;

public class Ability {
    public String name;
    public boolean fullSetBonus = false;
    private final int coolDown;
    private final StatusEffect effect;

    public Ability(String name, StatusEffect effect, int coolDown) {
        this.name = name;
        this.effect = effect;
        this.coolDown = coolDown;
    }
    public Ability(String name, StatusEffect effect, int coolDown, boolean fullSetBonus) {
        this.name = name;
        this.effect = effect;
        this.coolDown = coolDown;
        this.fullSetBonus = fullSetBonus;
    }

    public void apply(PlayerEntity player) {
        if (!player.hasStatusEffect(this.effect)) {
            player.addStatusEffect(new StatusEffectInstance(this.effect, this.coolDown, 0, true, false, false));
        }
    }
    public StatusEffect getEffect() { return this.effect; }
    public int getCoolDown() { return this.coolDown; }
    public List<Object> getLoreArgs(int i) {
        return new ArrayList<>();
    };
    public String getLoreKey () {
        return "effect.skyblock." + name;
    }
}
