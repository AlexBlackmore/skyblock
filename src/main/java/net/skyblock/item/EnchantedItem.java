package net.skyblock.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;

public class EnchantedItem extends Item {
    private final Item item;
    public EnchantedItem(Item item, Item.Settings settings) {
        super(settings);
        this.item = item;
    }

    @Override
    public Text getName(ItemStack stack) {
        return Text.translatable("item.skyblock.enchanted_item", item.getName()); //wrapping with String.valueOf will break translation
    }

    @Override
    public boolean hasGlint(ItemStack stack) {
        return true;
    }
}
