package net.skyblock.util;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

public interface ModItemInterface {

    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context);

    default public List<Object> getLoreArgs(ItemStack stack, int i) {
        return new ArrayList<>();
    }

    public String getLoreKey();

    public default ModRarity getModRarity() {
        return ModRarity.COMMON;
    }
    public Text getName();
}
