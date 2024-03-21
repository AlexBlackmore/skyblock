package net.skyblock.item.custom;

import net.minecraft.advancement.criterion.Criteria;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.FluidDrainable;
import net.minecraft.block.FluidFillable;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.*;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.sound.SoundEvent;
import net.minecraft.stat.Stats;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.RaycastContext;
import net.minecraft.world.World;
import net.minecraft.world.event.GameEvent;
import net.skyblock.util.LoreUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class MagicalBucketItem extends BucketItem {
    private final Fluid fluid;
    private final String loreKey;

    public MagicalBucketItem(Fluid fluid, Item.Settings settings, String name) {
        super(fluid, settings.maxCount(1));
        this.fluid = fluid;
        this.loreKey = "lore.skyblock." + name;
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, @NotNull PlayerEntity user, Hand hand) {
        ItemStack itemStack = user.getStackInHand(hand);
        BlockHitResult blockHitResult = BucketItem.raycast(world, user, this.fluid == Fluids.EMPTY ? RaycastContext.FluidHandling.SOURCE_ONLY : RaycastContext.FluidHandling.NONE);
        if (blockHitResult.getType() == HitResult.Type.MISS) {
            return TypedActionResult.pass(itemStack);
        }
        if (blockHitResult.getType() == HitResult.Type.BLOCK) {
            BlockPos blockPos3;
            BlockPos blockPos = blockHitResult.getBlockPos();
            Direction direction = blockHitResult.getSide();
            BlockPos blockPos2 = blockPos.offset(direction);
            if (!world.canPlayerModifyAt(user, blockPos) || !user.canPlaceOn(blockPos2, direction, itemStack)) {
                return TypedActionResult.fail(itemStack);
            }
            if (this.fluid == Fluids.EMPTY) {
                FluidDrainable fluidDrainable;
                ItemStack itemStack2;
                BlockState blockState = world.getBlockState(blockPos);
                Block block = blockState.getBlock();
                if (block instanceof FluidDrainable && !(itemStack2 = (fluidDrainable = (FluidDrainable)((Object)block)).tryDrainFluid(user, world, blockPos, blockState)).isEmpty()) {
                    user.incrementStat(Stats.USED.getOrCreateStat(this));
                    fluidDrainable.getBucketFillSound().ifPresent(sound -> user.playSound((SoundEvent)sound, 1.0f, 1.0f));
                    world.emitGameEvent((Entity)user, GameEvent.FLUID_PICKUP, blockPos);
                    ItemStack itemStack3 = ItemUsage.exchangeStack(itemStack, user, itemStack2);
                    if (!world.isClient) {
                        Criteria.FILLED_BUCKET.trigger((ServerPlayerEntity)user, itemStack2);
                    }
                    return TypedActionResult.success(itemStack3, world.isClient());
                }
                return TypedActionResult.fail(itemStack);
            }
            BlockState blockState = world.getBlockState(blockPos);
            BlockPos blockPos4 = blockPos3 = blockState.getBlock() instanceof FluidFillable && this.fluid == Fluids.WATER ? blockPos : blockPos2;
            if (this.placeFluid(user, world, blockPos3, blockHitResult)) {
                this.onEmptied(user, world, itemStack, blockPos3);
                if (user instanceof ServerPlayerEntity) {
                    Criteria.PLACED_BLOCK.trigger((ServerPlayerEntity)user, blockPos3, itemStack);
                }
                user.incrementStat(Stats.USED.getOrCreateStat(this));
                return TypedActionResult.success(itemStack, world.isClient());
            }
            return TypedActionResult.fail(itemStack);
        }
        return TypedActionResult.pass(itemStack);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        LoreUtil.appendLore(stack, tooltip, loreKey);
        super.appendTooltip(stack, world, tooltip, context);
    }

    @Override
    public boolean hasGlint(ItemStack stack) {
        return true;
    }

}
