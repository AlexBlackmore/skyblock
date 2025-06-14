package net.skyblock.ability;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.ExperienceOrbEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.GameRules;
import net.minecraft.world.World;

import java.util.function.Consumer;

public class StonkAbility extends Ability {
    private final Block block = Blocks.END_STONE;
    private final float chance = 0.05f;
    private final int experience = 1;

    public StonkAbility() {
        super("stonk", 5);
    }

    //Mimic code from Block.class: dropExperienceWhenMined(), dropExperience()
    @Override
    public boolean postMine(ItemStack stack, World world, BlockState state, BlockPos pos, LivingEntity miner) {
        if (world instanceof ServerWorld server && state.getBlock() == this.block) {
            int i = EnchantmentHelper.getBlockExperience(server, stack, this.experience);
            if (i > 0) {
                if (server.getGameRules().getBoolean(GameRules.DO_TILE_DROPS)) {
                    ExperienceOrbEntity.spawn(server, Vec3d.ofCenter(pos), i);
                }
            }
        }
        return super.postMine(stack, world, state, pos, miner);
    }

    @Override
    public Object[] getTooltipArguments(int i, ItemStack stack) {
        switch(i) {
            case 0, 4 -> {
                return new Object[]{this.block.getName()};
            }
            case 3 -> {
                return new Object[]{"§a" + (int)(this.chance*100) + "%"};
            }
            default -> {
                return new Object[]{};
            }
        }
    }
}
