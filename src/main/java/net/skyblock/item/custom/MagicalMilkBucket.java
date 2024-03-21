package net.skyblock.item.custom;

import net.minecraft.advancement.criterion.Criteria;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.MilkBucketItem;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.stat.Stats;
import net.minecraft.text.Text;
import net.minecraft.world.World;
import net.skyblock.util.LoreUtil;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Random;

public class MagicalMilkBucket extends MilkBucketItem {
    private final String loreKey;
    private int randLore;
    public MagicalMilkBucket(Item.Settings settings, String name) {
        super(settings);
        Random rand = new Random();
        this.randLore = rand.nextInt(5);
        this.loreKey = "lore.skyblock." + name;
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        if (user instanceof ServerPlayerEntity serverPlayerEntity) {
            Criteria.CONSUME_ITEM.trigger(serverPlayerEntity, stack);
            serverPlayerEntity.incrementStat(Stats.USED.getOrCreateStat(this));
        }
        if (!world.isClient) {
            user.clearStatusEffects();
            Random rand = new Random();
            this.randLore = rand.nextInt(5);
        }
        return stack;
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        LoreUtil.appendLore(stack, tooltip, this.loreKey + "." + this.randLore);
        super.appendTooltip(stack, world, tooltip, context);
    }
}
