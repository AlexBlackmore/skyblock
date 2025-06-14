package net.skyblock.ability;

import net.minecraft.block.BlockState;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.world.World;
import net.skyblock.effect.ModEffects;
import net.skyblock.util.ModEntityPredicates;

public class RottenAbility extends Ability {
    private final RegistryEntry<StatusEffect> EFFECT = ModEffects.ROTTEN;
    private final int RANGE = 30;
    private final int PER_LEVEL = 5;
    private final int MAX_AMPLIFIER = 4;

    public RottenAbility() {
        super("rotten", 3);
        setHasMax(true);
    }

    @Override
    public boolean postMine(ItemStack stack, World world, BlockState state, BlockPos pos, LivingEntity miner) {
        int amplifier = world.getOtherEntities(miner, new Box(pos.add((int) (-0.5*RANGE), (int) (-0.5*RANGE), (int) (-0.5*RANGE)).toCenterPos(),
                pos.add((int) (0.5*RANGE), (int) (0.5*RANGE), (int) (0.5*RANGE)).toCenterPos()), ModEntityPredicates.IS_UNDEAD).size();

        if (amplifier > 0) {
            miner.addStatusEffect(new StatusEffectInstance(EFFECT, 80, Math.min(amplifier-1, MAX_AMPLIFIER)));
        }

        return super.postMine(stack, world, state, pos, miner);
    }

    @Override
    public Object[] getTooltipArguments(int i, ItemStack stack) {
        switch(i) {
            case 0 -> {
                return new Object[]{"§9+" + PER_LEVEL + "%", Text.translatable("attribute.name.fortune.mining").formatted(Formatting.BLUE)};
            }
            case 1 -> {
                return new Object[]{"Undead", "§e" + RANGE};
            }
            case -1 -> {
                return new Object[]{"§8+" + (MAX_AMPLIFIER+1)*PER_LEVEL + "%", Text.translatable("attribute.name.fortune.mining").formatted(Formatting.DARK_GRAY)};
            }
            default -> {
                return new Object[]{};
            }
        }
    }

}
