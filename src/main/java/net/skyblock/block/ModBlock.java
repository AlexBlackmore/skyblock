package net.skyblock.block;

import net.minecraft.block.Block;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.world.World;
import net.skyblock.Skyblock;
import net.skyblock.util.LoreUtil;
import net.skyblock.util.ModItemInterface;
import net.skyblock.util.ModRarity;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ModBlock extends Block implements ModItemInterface {
    private ModRarity rarity;
    private final String loreKey;
    public ModBlock(String name, ModRarity rarity, Settings settings) {
        super(settings);
        this.loreKey = "lore." + Skyblock.MOD_ID + "." + name;
        this.rarity = rarity;
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        LoreUtil.appendLore(tooltip, this);
        super.appendTooltip(stack, world, tooltip, context);
    }

    @Override
    public List<Object> getLoreArgs(int i) {
        return ModItemInterface.super.getLoreArgs(i);
    }

    @Override
    public String getLoreKey() {
        return this.loreKey;
    }

    @Override
    public ModRarity getModRarity() {
        return this.rarity;
    }

    @Override
    public void setModRarity(ModRarity rarity) {
        this.rarity = rarity;
    }
}
