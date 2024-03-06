package net.skyblock.effect.abilities;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BoneMealItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.WorldEvents;
import net.skyblock.effect.Abilities;
import net.skyblock.effect.Ability;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

public class NightAffinityAbility extends Ability {
    public NightAffinityAbility() { super("night_affinity", Abilities.NIGHT_AFFINITY_ABILITY, 99, true); }

    @Override
    public void apply(PlayerEntity player) {
        StatusEffectInstance effect1 = new StatusEffectInstance(StatusEffects.NIGHT_VISION, 299, 0, true, false, false);
        StatusEffectInstance effect2 = new StatusEffectInstance(this.getEffect(), this.getCoolDown(), 1, true, false, false);

        if(!player.hasStatusEffect(effect1.getEffectType())) {
            player.addStatusEffect(new StatusEffectInstance(effect1));
        } else if (Objects.requireNonNull(player.getStatusEffect(effect1.getEffectType())).getDuration()<=201) {
            player.addStatusEffect(new StatusEffectInstance(effect1));
        }

        if (player.getWorld().getTimeOfDay() > 13000 && player.getWorld().getTimeOfDay() < 23000) {
            if(!player.hasStatusEffect(effect2.getEffectType())) {
                player.addStatusEffect(new StatusEffectInstance(effect2));
            } else if (Objects.requireNonNull(player.getStatusEffect(effect2.getEffectType())).getDuration()<=21) {
                player.addStatusEffect(new StatusEffectInstance(effect2));
            }
        }
    }

    @Override
    public List<Object> getLoreArgs(int i) {
        List<Object> list = new ArrayList<>();
        switch (i) {
            case 2 -> {
                list.add(Text.translatable("effect.minecraft.night_vision").formatted(Formatting.BLUE));
            }
            case 4 -> {
                list.add("§atripled");
            }
            default -> {}
        }
        return list;
    }
}
