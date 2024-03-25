package net.skyblock.item.custom;

import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Formatting;
import net.skyblock.util.FormattingUtil;
import net.skyblock.util.ModItemInterface;
import net.skyblock.util.ToolUtil;

import java.util.ArrayList;
import java.util.List;

public class PromisingShovelItem extends PromisingMiningToolItem {
    private final Item ITEM = Items.FLINT;
    private final int MULTIPLIER = 2;

    public PromisingShovelItem(ToolMaterial material, Settings settings) {
        super(material, BlockTags.SHOVEL_MINEABLE, settings);
        this.setBlockLevels(new int[]{10, 25, 100, 250, 500, 1000, 2000, 5000, 10000, 20000});
        this.setLoreKey("promising_shovel");
    }

    @Override
    public void modifyLoot(List<ItemStack> loot, PlayerEntity player, ItemStack tool) {
        boolean doubleFlint = false;

        double chance = EnchantmentHelper.getLevel(this.getEnchantment(), tool)/100.0;
        if (chance == 0.0) { return; }

        for (ItemStack stack : loot) {
            if (stack.getItem() == this.ITEM && Math.random() < chance) {
                stack.setCount(stack.getCount()*this.MULTIPLIER);
                doubleFlint = true;
            }
        }

        if (doubleFlint && tool.getItem() instanceof ModItemInterface modTool) {
            player.sendMessage(Text.translatable("message.skyblock.promising_shovel", Text.translatable("formatting.skyblock.multiplier." + this.MULTIPLIER).formatted(Formatting.GREEN), Text.translatable(this.ITEM.getTranslationKey()), modTool.getName()));
        }
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        return ToolUtil.useShovelOnBlock(context);
    }

    @Override
    public List<Object> getLoreArgs(ItemStack stack, int i) {
        List<Object> list = new ArrayList<>();
        switch (i) {
            case 1 -> {
                list.add(Text.translatable(this.getEnchantment().getTranslationKey()).formatted(Formatting.BLUE));
                int level = EnchantmentHelper.getLevel(this.getEnchantment(), stack) + 1;
                list.add(Text.translatable("enchantment.level." + level).formatted(Formatting.BLUE));
            }
            case 2 -> {
                int blocks = 0;
                if (stack.hasNbt()) {
                    assert stack.getNbt() != null;
                    blocks = stack.getNbt().getInt(PROMISING_KEY);
                }

                int level = EnchantmentHelper.getLevel(this.getEnchantment(), stack);
                if (level < this.getBlockLevels().length) {
                    list.add(Text.literal(FormattingUtil.formatNumber(this.getBlockLevels()[level] - blocks)).formatted(Formatting.GREEN));
                }
            }
            case 4 -> {
                list.add(Text.literal(EnchantmentHelper.getLevel(this.getEnchantment(), stack) + "%").formatted(Formatting.GREEN));
                list.add(Text.translatable("formatting.skyblock.multiplier." + this.MULTIPLIER).formatted(Formatting.GREEN));
            }
            case 5 -> list.add(Text.translatable(this.ITEM.getTranslationKey()));
            default -> {}
        }
        return list;
    }
}
