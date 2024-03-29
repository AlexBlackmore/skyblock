package net.skyblock.effect.abilities;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BoneMealItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.WorldEvents;
import net.skyblock.effect.Abilities;
import net.skyblock.effect.Ability;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FarmerAuraAbility extends Ability {
    public static final int DURATION = 3;
    public static final int RANGE = 5;
    public FarmerAuraAbility() { super("farmer_aura", Abilities.FARMER_AURA_ABILITY, 60, true); }

    @Override
    public void apply(PlayerEntity player) {
        StatusEffectInstance effect = new StatusEffectInstance(this.getEffect(), this.getCoolDown(), 0, true, false, false);

        if(!player.hasStatusEffect(effect.getEffectType())) {
            Random rand = new Random();
            BlockPos pos = new BlockPos(player.getBlockPos().add(rand.nextInt(-1 * RANGE, RANGE), rand.nextInt(-1, 1), rand.nextInt(-1 * RANGE, RANGE)));
            if (BoneMealItem.useOnFertilizable(new ItemStack(Items.BONE_MEAL, 1), player.getWorld(), pos)) {
                player.addStatusEffect(new StatusEffectInstance(effect));
                if (!player.getWorld().isClient) {
                    player.getWorld().syncWorldEvent(WorldEvents.BONE_MEAL_USED, pos, 0);
                }
            }
        }
    }
    @Override
    public List<Object> getLoreArgs(int i) {
        List<Object> list = new ArrayList<>();
        switch (i) {
            case 3 -> {
                list.add("§e" + RANGE);
            }
            case 4 -> {
                list.add("§a" + DURATION + "s");
            }
            default -> {}
        }
        return list;
    }
}
