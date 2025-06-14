package net.skyblock.ability;

import net.minecraft.block.BlockState;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.skyblock.util.ModTags;

import java.util.Objects;

public class ZombieAbility extends Ability {
    private final RegistryEntry<StatusEffect> EFFECT = StatusEffects.HASTE;
    private final int DURATION = 100;
    private final int AMPLIFIER = 1;

    public ZombieAbility() {
        super("zombie", 2);
        this.setShowName(false);
    }

    @Override
    public boolean postMine(ItemStack stack, World world, BlockState state, BlockPos pos, LivingEntity miner) {
        if (state.isIn(ModTags.Blocks.ORES)) {
            if (miner.hasStatusEffect(EFFECT)) {
                int a = Objects.requireNonNull(miner.getStatusEffect(EFFECT)).getAmplifier();
                int d = Objects.requireNonNull(miner.getStatusEffect(EFFECT)).getDuration();
                if (a > AMPLIFIER || (a == AMPLIFIER && d >= DURATION)) {
                    return super.postMine(stack, world, state, pos, miner);
                }
            }
            miner.addStatusEffect(new StatusEffectInstance(EFFECT, DURATION, AMPLIFIER));
        }
        return super.postMine(stack, world, state, pos, miner);
    }

    @Override
    public Object[] getTooltipArguments(int i, ItemStack stack) {
        if (i == 0) {
            return new Object[]{Text.translatable("potion.withAmplifier", Text.translatable("effect." + EFFECT.getIdAsString().replace(':', '.')), Text.translatable("potion.potency." + AMPLIFIER)).formatted(Formatting.BLUE), "§a" + DURATION / 20 + "s"};
        }
        return new Object[]{};
    }
}
