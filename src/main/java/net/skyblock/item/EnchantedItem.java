package net.skyblock.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.skyblock.util.ModRarity;

public class EnchantedItem extends ModItem {
    private final Item item;
    public EnchantedItem(Item item) {
        super(new FabricItemSettings());
        this.item = item;
    }
    public EnchantedItem(Settings settings, Item item) {
        super(settings);
        this.item = item;
    }

    @Override
    public Text getName(ItemStack stack) {
        return Text.translatable("item.skyblock.enchanted_item", item.getName());
    }

    @Override
    public boolean hasGlint(ItemStack stack) {
        return true;
    }
}
