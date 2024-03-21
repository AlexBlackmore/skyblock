package net.skyblock.item;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.world.World;
import net.skyblock.util.LoreUtil;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class RuneItem extends ModItem {
    public int tier = 1;
    public Type type;

    public RuneItem(Type type) {
        this.type = type;
    }

//    @Override
//    public Text getName() {
//        return Text.translatable("item.skyblock.rune", super.getName(), Text.translatable("enchantment.level.1"));
//    }

    @Override
    public Text getName(ItemStack stack) {
        return Text.translatable("item.skyblock.rune", super.getName(stack), Text.translatable("enchantment.level.1"));
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        super.appendTooltip(stack, world, tooltip, context);
        switch (this.type) {
            case MELEE -> LoreUtil.appendLore(stack, tooltip, "lore.skyblock.rune_weapon");
            case RANGED -> LoreUtil.appendLore(stack, tooltip, "lore.skyblock.rune_ranged");
            case HELMET -> LoreUtil.appendLore(stack, tooltip, "lore.skyblock.rune_helmet");
            case CHESTPLATE -> LoreUtil.appendLore(stack, tooltip, "lore.skyblock.rune_chestplate");
            case LEGGINGS -> LoreUtil.appendLore(stack, tooltip, "lore.skyblock.rune_leggings");
            case BOOTS -> LoreUtil.appendLore(stack, tooltip, "lore.skyblock.rune_boots");
            case HOE -> LoreUtil.appendLore(stack, tooltip, "lore.skyblock.rune_hoe");
        }

    }

    public enum Type {
        MELEE,
        RANGED,
        HELMET,
        CHESTPLATE,
        LEGGINGS,
        BOOTS,
        HOE;
    }
}
