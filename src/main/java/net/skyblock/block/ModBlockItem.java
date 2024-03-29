package net.skyblock.block;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.world.World;
import net.skyblock.util.ModItemInterface;
import net.skyblock.util.ModRarity;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ModBlockItem extends BlockItem implements ModItemInterface {
    public ModBlockItem(ModBlock block, Settings settings) {
        super(block, settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        if (this.getBlock() instanceof ModBlock modBlock) {
            modBlock.appendTooltip(stack, world, tooltip, context);
        }
    }
    @Override
    public List<Object> getLoreArgs(ItemStack stack, int i) {
        if (this.getBlock() instanceof ModBlock modBlock) {
            return modBlock.getLoreArgs(stack, i);
        }
        return ModItemInterface.super.getLoreArgs(stack, i);
    }
    @Override
    public String getLoreKey() {
        if (this.getBlock() instanceof ModBlock modBlock) {
            return modBlock.getLoreKey();
        }
        return this.getBlock().getTranslationKey();
    }

    @Override
    public ModRarity getModRarity() {
        if (this.getBlock() instanceof ModBlock modBlock) {
            return modBlock.getModRarity();
        }
        return ModRarity.convertRarity(this.asItem());
    }
}
