package net.skyblock.item.custom;

import com.mojang.datafixers.util.Pair;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Rarity;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class GreatestTillingHoeItem extends HoeItem {
    private static final int MAX = 64;
    public GreatestTillingHoeItem(Item.Settings settings) {
        super(ToolMaterials.DIAMOND, -3, 0.0f, settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        if (iterate(context) == ActionResult.PASS) {
            return ActionResult.PASS;
        } else {
            for (int x=1; x<MAX; x++) {
                BlockPos blockPos = context.getBlockPos().offset(context.getPlayer().getHorizontalFacing(), x);

                if (context.getWorld().getBlockState(context.getBlockPos().up(1)).isOf(Blocks.AIR)) {
                    if (iterate(new ItemUsageContext(context.getPlayer(), context.getHand(),
                            new BlockHitResult(context.getHitPos(), context.getSide(), blockPos, context.hitsInsideBlock()))) == ActionResult.PASS) {
                        break;
                    }
                } else {
                    break;
                }
            }
            return ActionResult.success(context.getWorld().isClient);
        }
    }

    private ActionResult iterate(ItemUsageContext context) {
        BlockPos blockPos;
        World world = context.getWorld();
        Pair<Predicate<ItemUsageContext>, Consumer<ItemUsageContext>> pair = TILLING_ACTIONS.get(world.getBlockState(blockPos = context.getBlockPos()).getBlock());
        if (pair == null) {
            return ActionResult.PASS;
        }
        Predicate<ItemUsageContext> predicate = pair.getFirst();
        Consumer<ItemUsageContext> consumer = pair.getSecond();
        if (predicate.test(context)) {
            PlayerEntity playerEntity = context.getPlayer();
            world.playSound(playerEntity, blockPos, SoundEvents.ITEM_HOE_TILL, SoundCategory.BLOCKS, 1.0f, 1.0f);
            if (!world.isClient) {
                consumer.accept(context);
                if (playerEntity != null) {
                    context.getStack().damage(1, playerEntity, p -> p.sendToolBreakStatus(context.getHand()));
                }
            }
            return ActionResult.success(world.isClient);
        }
        return ActionResult.PASS;
    }

    @Override
    public boolean hasGlint(ItemStack stack) {
        return true;
    }
}
