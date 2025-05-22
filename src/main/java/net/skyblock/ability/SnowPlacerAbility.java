package net.skyblock.ability;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.SnowBlock;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.server.command.CommandManager;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;
import net.minecraft.world.WorldView;
import org.jetbrains.annotations.Nullable;

public class SnowPlacerAbility extends Ability {
    private final int cost;
    public SnowPlacerAbility(int cost) {
        super("snow_placer", 2);
        this.cost = cost;
        this.setHasCost(true);
        this.setIsActive(true);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        World world = context.getWorld();
        BlockPos blockPos = context.getBlockPos();
        BlockState blockState = world.getBlockState(blockPos);
        if (context.getSide() != Direction.UP) {
            return ActionResult.PASS;
        } else if (world instanceof ServerWorld server) {
            PlayerEntity playerEntity = context.getPlayer();
            @Nullable CommandManager commandManager = server.getServer().getCommandManager();
            if (commandManager != null && playerEntity != null) {
                commandManager.executeWithPrefix(playerEntity.getCommandSource(server).withLevel(4),
                        "execute if score @s coins matches " + this.cost + ".. run tag @s add SUCCESS");
                if (playerEntity.getCommandTags().contains("SUCCESS") || playerEntity.isCreative()) {
                    commandManager.executeWithPrefix(playerEntity.getCommandSource(server).withLevel(4),
                            "scoreboard players remove @s[tag=SUCCESS] coins " + this.cost);
                    commandManager.executeWithPrefix(playerEntity.getCommandSource(server).withLevel(4),
                            "tag @s[tag=SUCCESS] remove SUCCESS");
                } else {
                    playerEntity.sendMessage(Text.translatable("message.skyblock.not_enough_coins"), false);
                    return ActionResult.PASS;
                }
            } else {
                return ActionResult.PASS;
            }

            if (blockState.getBlock() != Blocks.SNOW || blockState.get(SnowBlock.LAYERS) == 8) {
                blockPos = blockPos.up();
            }

            for (int x = -1; x < 2; x++) {
                for (int z = -1; z < 2; z++) {
                    BlockPos pos = new BlockPos(blockPos.getX() + x, blockPos.getY(), blockPos.getZ() + z);
                    BlockState state = world.getBlockState(pos);
                    if ((state.getBlock() == Blocks.AIR || state.getBlock() == Blocks.SNOW) && canPlaceAt(state, world, pos)) {
                        commandManager.executeWithPrefix(playerEntity.getCommandSource(server).withLevel(4),
                                "execute positioned " + pos.getX() + " " + pos.getY() + " " + pos.getZ() + " run function skyblock:ability/snow_placer");
                        context.getStack().damage(1, playerEntity, LivingEntity.getSlotForHand(context.getHand()));
                    }
                }
            }
            return ActionResult.SUCCESS;
        }
        return ActionResult.PASS;
    }

    private boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        BlockState blockState = world.getBlockState(pos.down());
        if (blockState.isIn(BlockTags.SNOW_LAYER_CANNOT_SURVIVE_ON)) {
            return false;
        } else {
            return blockState.isIn(BlockTags.SNOW_LAYER_CAN_SURVIVE_ON) ||
                    Block.isFaceFullSquare(blockState.getCollisionShape(world, pos.down()), Direction.UP) ||
                    blockState.isOf(Blocks.SNOW) && (Integer)blockState.get(SnowBlock.LAYERS) == 8;
        }
    }
}
