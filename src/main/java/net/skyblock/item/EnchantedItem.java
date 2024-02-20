package net.skyblock.item;

import net.minecraft.item.ItemStack;
import net.skyblock.util.ModRarity;

public class EnchantedItem extends ModItem {
    public EnchantedItem(Settings settings) {
        super(settings);
    }
    public EnchantedItem(Settings settings, ModRarity rarity) {
        super(settings, rarity);
    }

    @Override
    public boolean hasGlint(ItemStack stack) {
        return true;
    }
}
