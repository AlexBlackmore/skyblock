package net.skyblock.effect.abilities;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeKeys;
import net.skyblock.effect.Abilities;
import net.skyblock.effect.Ability;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class HasteAbility extends Ability {
    private final int amplifier;
    public HasteAbility(int amplifier) {
        super("haste", StatusEffects.HASTE, 219, true);
        this.amplifier = amplifier;
    }

    @Override
    public void apply(PlayerEntity player) {
        StatusEffectInstance effect = new StatusEffectInstance(this.getEffect(), this.getCoolDown(), this.amplifier, true, false, false);

        if(!player.hasStatusEffect(effect.getEffectType())) {
            player.addStatusEffect(new StatusEffectInstance(effect));
        } else if (Objects.requireNonNull(player.getStatusEffect(effect.getEffectType())).getDuration()<=141) {
            player.addStatusEffect(new StatusEffectInstance(effect));
        }
    }

    @Override
    public List<Object> getLoreArgs(int i) {
        List<Object> list = new ArrayList<>();
        switch (i) {
            case 2 -> {
                list.add(Text.translatable("potion.withAmplifier", Text.translatable(this.getEffect().getTranslationKey()), Text.translatable("potion.potency."+this.amplifier)).formatted(Formatting.BLUE));
            }
            default -> {}
        }
        return list;
    }
}