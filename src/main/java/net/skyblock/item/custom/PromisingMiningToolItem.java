package net.skyblock.item.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.skyblock.item.ModMiningToolItem;
import net.skyblock.util.FormattingUtil;
import net.skyblock.util.LoreUtil;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PromisingMiningToolItem extends ModMiningToolItem {
    public static final String PROMISING_KEY = "PromisingBlocksBroken";
    private int[] blockLevels = new int[]{50, 250, 750, 1750, 3750};
//    private int[] blockLevels = new int[]{5, 10, 15, 20, 25};
    private Enchantment enchant = Enchantments.EFFICIENCY;
    public PromisingMiningToolItem(ToolMaterial material, TagKey<Block> effectiveBlocks, Item.Settings settings) {
        super(material, effectiveBlocks, settings);
        this.setLoreKey("promising_tool");
    }
    public Enchantment getEnchantment() {
        return this.enchant;
    }
    public PromisingMiningToolItem setEnchantment(Enchantment enchant) {
        this.enchant = enchant;
        return this;
    }
    public int[] getBlockLevels() {
        return this.blockLevels;
    }
    public PromisingMiningToolItem setBlockLevels(int[] blockLevels) {
        this.blockLevels = blockLevels;
        return this;
    }

    @Override
    public boolean postMine(ItemStack stack, World world, BlockState state, BlockPos pos, LivingEntity miner) {
        NbtCompound nbt = stack.getOrCreateNbt();
        int blocks = nbt.getInt(PROMISING_KEY)+1;
        nbt.putInt(PROMISING_KEY, blocks);
        stack.setNbt(nbt);

        int level = EnchantmentHelper.getLevel(this.enchant, stack);
        if (level < blockLevels.length) {
            if (blocks >= blockLevels[level]) {
                if (level==0) {
                    stack.addEnchantment(this.enchant, 1);
                } else {
                    Map<Enchantment, Integer> enchants = EnchantmentHelper.get(stack);
                    enchants.put(this.enchant, level+1);
                    EnchantmentHelper.set(enchants, stack);
                }
            }
        }

        return super.postMine(stack, world, state, pos, miner);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        if (EnchantmentHelper.getLevel(this.enchant, stack) < this.blockLevels.length) {
            LoreUtil.appendLore(stack, tooltip, this);
        }

        int blocks = 0;
        if (stack.hasNbt()) {
            assert stack.getNbt() != null;
            blocks = stack.getNbt().getInt(PROMISING_KEY);
        }
        tooltip.add(Text.translatable("lore.skyblock.promising_tool_blocks", Text.literal(FormattingUtil.formatNumber(blocks)).formatted(Formatting.GREEN)));
        tooltip.add(Text.literal(""));
//        super.appendTooltip(stack, world, tooltip, context);
    }

    @Override
    public List<Object> getLoreArgs(ItemStack stack, int i) {
        List<Object> list = new ArrayList<>();
        switch (i) {
            case 1 -> {
                list.add(Text.translatable(this.enchant.getTranslationKey()).formatted(Formatting.BLUE));
                int level = EnchantmentHelper.getLevel(this.enchant, stack) + 1;
                list.add(Text.translatable("enchantment.level." + level).formatted(Formatting.BLUE));
            }
            case 2 -> {
                int blocks = 0;
                if (stack.hasNbt()) {
                    assert stack.getNbt() != null;
                    blocks = stack.getNbt().getInt(PROMISING_KEY);
                }

                int level = EnchantmentHelper.getLevel(this.enchant, stack);
                if (level < this.blockLevels.length) {
                    list.add(Text.literal(FormattingUtil.formatNumber(this.blockLevels[level] - blocks)).formatted(Formatting.GREEN));
                }
            }
            default -> {}
        }
        return list;
    }
}
