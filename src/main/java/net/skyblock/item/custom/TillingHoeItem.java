package net.skyblock.item.custom;

import com.mojang.datafixers.util.Pair;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.item.ToolMaterial;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.skyblock.item.ModHoeItem;
import net.skyblock.util.ModRarity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class TillingHoeItem extends ModHoeItem {
    public final int DIAMETER;
    public TillingHoeItem(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings, ModRarity rarity, String name, int diameter) {
        super(material, attackDamage, attackSpeed, settings, rarity, name);
        this.DIAMETER = diameter;
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        if (iterate(context) == ActionResult.PASS) {
            return ActionResult.PASS;
        } else {
            for (int x = -1*this.DIAMETER /2; x<=this.DIAMETER /2; x++) {
                for (int z = -1*this.DIAMETER /2; z<=this.DIAMETER /2; z++) {
                    if (!(x==0 && z==0)) {
                        iterate(new ItemUsageContext(Objects.requireNonNull(context.getPlayer()), context.getHand(),
                                new BlockHitResult(context.getHitPos(), context.getSide(), context.getBlockPos().add(x, 0, z), context.hitsInsideBlock())));
                    }
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
    public List<Object> getLoreArgs(int i) {
        List<Object> list = new ArrayList<>();
        switch (i) {
            case 1 -> {
                list.add("§9" + this.DIAMETER + "x" + this.DIAMETER);
            }
            default -> {}
        }
        return list;
    }
}
