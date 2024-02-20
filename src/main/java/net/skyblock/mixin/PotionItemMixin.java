package net.skyblock.mixin;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.PotionItem;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionUtil;
import net.minecraft.util.Rarity;
import net.skyblock.item.ModPotion;
import net.skyblock.util.ModRarity;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(PotionItem.class)
public class PotionItemMixin extends Item {

    public PotionItemMixin(Settings settings) {
        super(settings);
    }

    @Override
    public Rarity getRarity(ItemStack stack) {
        if (PotionUtil.getPotion(stack) instanceof ModPotion potion) {
            return switch ((potion.getModRarity())) {
                case UNCOMMON -> Rarity.UNCOMMON;
                case RARE -> Rarity.RARE;
                case EPIC -> Rarity.EPIC;
                default -> Rarity.COMMON;
            };
        } else {
            return Rarity.COMMON;
        }
    }
}
