package net.skyblock.ability;

import net.minecraft.block.BlockState;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.ToolComponent;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.skyblock.effect.ModEffects;
import net.skyblock.util.SkillsUtil;

import java.util.*;

public class TimberAbility extends Ability {
    private final int maxBlocks;

    public TimberAbility(int maxBlocks) {
        super("timber", 0);
        this.maxBlocks = maxBlocks;
        this.setShowName(false);
        this.setCooldown(40, ModEffects.TIMBER_COOLDOWN);
    }

    @Override
    public boolean postMine(ItemStack stack, World world, BlockState state, BlockPos pos, LivingEntity miner) {
        ToolComponent toolComponent = stack.get(DataComponentTypes.TOOL);
        if (toolComponent != null && world instanceof ServerWorld server && miner instanceof PlayerEntity player) {
            if (player.hasStatusEffect(getCooldownEffect())) {
                return super.postMine(stack, world, state, pos, miner);
            } else {
                player.addStatusEffect(new StatusEffectInstance(getCooldownEffect(), getCooldown()));
            }

            int blocksBroken = 1;
            if (state.isIn(BlockTags.LOGS)) {

                List<BlockPos> connectedBlocks = timber(world, state, pos);
                for (BlockPos block : connectedBlocks) {
                    world.breakBlock(block, true, miner);
                    SkillsUtil.addExperience(server, pos, state, player);
                }
                blocksBroken += connectedBlocks.size() - 1;
            }
            if (state.getHardness(world, pos) != 0.0F && toolComponent.damagePerBlock() > 0) {
                stack.damage(toolComponent.damagePerBlock() * blocksBroken, miner, EquipmentSlot.MAINHAND);
            }
        }
        return super.postMine(stack, world, state, pos, miner);
    }

    private List<BlockPos> timber(World world, BlockState state, BlockPos pos) {
        int maxX = (int)world.getWorldBorder().getBoundEast();
        int minX = (int)world.getWorldBorder().getBoundWest();
        int maxY = world.getHeight();
        int minY = world.getBottomY();
        int maxZ = (int)world.getWorldBorder().getBoundSouth();
        int minZ = (int)world.getWorldBorder().getBoundNorth();

        List<BlockPos> connectedBlocks = new ArrayList<>();
        Queue<BlockPos> queue = new LinkedList<>();
        Set<BlockPos> visited = new HashSet<>();

        int startX = pos.getX();
        int startY = pos.getY();
        int startZ = pos.getZ();

        if (!isValidPosition(startX, startY, startZ, maxX, minX, maxY, minY, maxZ, minZ)) {
            return connectedBlocks; // Starting position is invalid or has no block
        }

//        Block startBlock = grid[startX][startY][startZ];
        queue.offer(pos);
        visited.add(pos);
        connectedBlocks.add(pos); // Add the starting block to the connected list

        int[][] directions = {
                {1, 0, 0}, {-1, 0, 0}, {0, 1, 0}, {0, -1, 0}, {0, 0, 1}, {0, 0, -1}
        };

        while (!queue.isEmpty()) {
            BlockPos currentPos = queue.poll();
            int x = currentPos.getX();
            int y = currentPos.getY();
            int z = currentPos.getZ();

            for (int[] dir : directions) {

                int newX = x + dir[0];
                int newY = y + dir[1];
                int newZ = z + dir[2];

                BlockPos newPos = new BlockPos(newX, newY, newZ);
//                int newXInt = (int) newX;
//                int newYInt = (int) newY;
//                int newZInt = (int) newZ;

                if (isValidPosition(newX, newY, newZ, maxX, minX, maxY, minY, maxZ, minZ) && !visited.contains(newPos)) {
//                    if (!visited.contains(newPos)) {
                    visited.add(newPos);
//                    BlockPos neighbor = grid[newX][newY][newZ];
                    if (world.getBlockState(newPos).equals(state) && connectedBlocks.size() < this.maxBlocks) {
                        connectedBlocks.add(newPos);
                        queue.offer(newPos); // Continue exploring from this new same-type block
                    }
                    // We only add to the queue if it's the same type,
                    // effectively stopping exploration down paths of different types.
                }
            }
        }

        return connectedBlocks;
    }

    private boolean isValidPosition(int x, int y, int z, int maxX, int minX, int maxY, int minY, int maxZ, int minZ) {
        return x >= minX && x < maxX && y >= minY && y < maxY && z >= minZ && z < maxZ;
    }
}
