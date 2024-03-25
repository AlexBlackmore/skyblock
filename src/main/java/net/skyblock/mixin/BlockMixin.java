package net.skyblock.mixin;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.skyblock.item.ModMiningToolItem;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

import java.util.List;

@Mixin(Block.class)
public class BlockMixin {

    /**
     * @author unreal
     * @reason allows tools to modify dropped items
     */
    @Overwrite
    public static void dropStacks(BlockState state, World world, BlockPos pos, @Nullable BlockEntity blockEntity, @Nullable Entity entity, ItemStack tool) {
        if (world instanceof ServerWorld) {
            List<ItemStack> loot = Block.getDroppedStacks(state, (ServerWorld)world, pos, blockEntity, entity, tool);

            if (tool.getItem() instanceof ModMiningToolItem modTool && entity instanceof PlayerEntity player) {
                modTool.modifyLoot(loot, player, tool);
            }

            loot.forEach(stack -> Block.dropStack(world, pos, stack));
            state.onStacksDropped((ServerWorld)world, pos, tool, true);
        }
    }
}
