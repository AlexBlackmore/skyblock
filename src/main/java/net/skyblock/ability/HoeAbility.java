package net.skyblock.ability;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraft.world.event.GameEvent;
import net.skyblock.item.ModTools;

import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class HoeAbility extends Ability {
    private int radius = 0;
    private int length = 0;

    public HoeAbility() {
        super("hoe", 0);
        this.setShowName(false);
    }

    public HoeAbility(int radius) {
        super("hoe", 2);
        this.setShowName(false);
        this.radius = radius;
    }

    public HoeAbility(int length, boolean linear) {
        super("hoe", 0);
        this.setShowName(false);
        if (linear) {
            this.length = length;
        }
    }


    //Copied from HoeItem.class. Allows ModItem hoes to have vanilla hoe capability
    protected static final Map<Block, Pair<Predicate<ItemUsageContext>, Consumer<ItemUsageContext>>> TILLING_ACTIONS = Maps.<Block, Pair<Predicate<ItemUsageContext>, Consumer<ItemUsageContext>>>newHashMap(
            ImmutableMap.of(
                    Blocks.GRASS_BLOCK,
                    Pair.of(HoeAbility::canTillFarmland, createTillAction(Blocks.FARMLAND.getDefaultState())),
                    Blocks.DIRT_PATH,
                    Pair.of(HoeAbility::canTillFarmland, createTillAction(Blocks.FARMLAND.getDefaultState())),
                    Blocks.DIRT,
                    Pair.of(HoeAbility::canTillFarmland, createTillAction(Blocks.FARMLAND.getDefaultState())),
                    Blocks.COARSE_DIRT,
                    Pair.of(HoeAbility::canTillFarmland, createTillAction(Blocks.DIRT.getDefaultState())),
                    Blocks.FARMLAND,
                    Pair.of(HoeAbility::canUntill, createTillAction(Blocks.DIRT.getDefaultState())),
                    Blocks.ROOTED_DIRT,
                    Pair.of(itemUsageContext -> true, createTillAndDropAction(Blocks.DIRT.getDefaultState(), Items.HANGING_ROOTS))
            )
    );

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        World world = context.getWorld();
        BlockPos blockPos = context.getBlockPos();

        if (till(context, world, blockPos) == ActionResult.SUCCESS) {
            if (radius > 0) {
                PlayerEntity player = context.getPlayer();
                Hand hand = context.getHand();
                ItemStack stack = context.getStack();
                Direction side = context.getSide();
                Vec3d hitPos = context.getHitPos();
                boolean hitsInsideBlock = context.hitsInsideBlock();

                for (int x=this.radius*-1 ; x<=this.radius ; x++) {
                    for (int z=this.radius*-1 ; z<=this.radius ; z++) {
                        if (x != 0 || z != 0) {
                            till(new ItemUsageContext(world, player, hand, stack, new BlockHitResult(hitPos.add(x, 0, z), side, blockPos.add(x, 0, z), hitsInsideBlock)), world, blockPos.add(x, 0, z));
                        }
                    }
                }
            } else if (length > 0) {
                PlayerEntity player = context.getPlayer();
                Hand hand = context.getHand();
                ItemStack stack = context.getStack();
                Direction side = context.getSide();
                Vec3d hitPos = context.getHitPos();
                int x = 1;
                int maxDamage = stack.getMaxDamage();
                Direction direction = player.getHorizontalFacing();

                while (x < this.length && stack.getDamage() < maxDamage && till(new ItemUsageContext(world, player, hand, stack, new BlockHitResult(hitPos.offset(direction, x), side, context.getBlockPos().offset(direction, x), context.hitsInsideBlock())), world, blockPos.offset(direction, x)) == ActionResult.SUCCESS) {
                    x++;
                }
            }

            return ActionResult.SUCCESS;
        } else {
            return ActionResult.PASS;
        }

    }

    private ActionResult till(ItemUsageContext context, World world, BlockPos blockPos) {
        Pair<Predicate<ItemUsageContext>, Consumer<ItemUsageContext>> pair = (Pair<Predicate<ItemUsageContext>, Consumer<ItemUsageContext>>)TILLING_ACTIONS.get(
                world.getBlockState(blockPos).getBlock()
        );
        if (pair == null) {
            return ActionResult.PASS;
        } else {
            Predicate<ItemUsageContext> predicate = pair.getFirst();
            Consumer<ItemUsageContext> consumer = pair.getSecond();
            if (predicate.test(context)) {
                PlayerEntity playerEntity = context.getPlayer();
                world.playSound(playerEntity, blockPos, SoundEvents.ITEM_HOE_TILL, SoundCategory.BLOCKS, 1.0F, 1.0F);
                if (!world.isClient) {
                    consumer.accept(context);
                    if (playerEntity != null) {
                        context.getStack().damage(1, playerEntity, LivingEntity.getSlotForHand(context.getHand()));
                    }
                }

                return ActionResult.SUCCESS;
            } else {
                return ActionResult.PASS;
            }
        }
    }

    /**
     * {@return a tilling action that sets a block state}
     *
     * @param result the tilled block state
     */
    public static Consumer<ItemUsageContext> createTillAction(BlockState result) {
        return context -> {
            context.getWorld().setBlockState(context.getBlockPos(), result, Block.NOTIFY_ALL_AND_REDRAW);
            context.getWorld().emitGameEvent(GameEvent.BLOCK_CHANGE, context.getBlockPos(), GameEvent.Emitter.of(context.getPlayer(), result));
        };
    }

    /**
     * {@return a tilling action that sets a block state and drops an item}
     *
     * @param droppedItem the item to drop
     * @param result the tilled block state
     */
    public static Consumer<ItemUsageContext> createTillAndDropAction(BlockState result, ItemConvertible droppedItem) {
        return context -> {
            context.getWorld().setBlockState(context.getBlockPos(), result, Block.NOTIFY_ALL_AND_REDRAW);
            context.getWorld().emitGameEvent(GameEvent.BLOCK_CHANGE, context.getBlockPos(), GameEvent.Emitter.of(context.getPlayer(), result));
            Block.dropStack(context.getWorld(), context.getBlockPos(), context.getSide(), new ItemStack(droppedItem));
        };
    }

    /**
     * {@return whether the used block can be tilled into farmland}
     * This method is used as the tilling predicate for most vanilla blocks except rooted dirt.
     */
    public static boolean canTillFarmland(ItemUsageContext context) {
        return context.getSide() != Direction.DOWN && context.getWorld().getBlockState(context.getBlockPos().up()).isAir() && context.getStack().getItem() != ModTools.HOE_OF_NO_TILLING;
    }

    public static boolean canUntill(ItemUsageContext context) {
        return context.getSide() != Direction.DOWN && context.getStack().getItem() == ModTools.HOE_OF_NO_TILLING;
    }

    @Override
    public void appendTooltip(ItemStack stack, Consumer<Text> textConsumer) {
        for (int i=0 ; i<this.loreLines ; i++) {
            if (i == 0) {
                textConsumer.accept(Text.translatable("ability.skyblock." + name + "." + i, "§9" + ((this.radius*2)+1) + "x" + ((this.radius*2)+1)));
            } else {
                textConsumer.accept(Text.translatable("ability.skyblock." + name + "." + i));
            }
        }
    }
}
