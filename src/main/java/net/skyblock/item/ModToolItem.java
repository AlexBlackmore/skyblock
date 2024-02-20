package net.skyblock.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;
import net.skyblock.util.ModRarity;

public class ModToolItem extends ModItem {
    private final ToolMaterial material;

    public ModToolItem(ToolMaterial material, Item.Settings settings) {
        super(settings.maxDamageIfAbsent(material.getDurability()));
        this.material = material;
    }
    public ModToolItem(ToolMaterial material, Item.Settings settings, ModRarity rarity) {
        super(settings.maxDamageIfAbsent(material.getDurability()), rarity);
        this.material = material;
    }
    public ModToolItem(ToolMaterial material, Item.Settings settings, ModRarity rarity, String name) {
        super(settings.maxDamageIfAbsent(material.getDurability()), rarity, name);
        this.material = material;
    }

    public ToolMaterial getMaterial() {
        return this.material;
    }

    @Override
    public int getEnchantability() {
        return this.material.getEnchantability();
    }

    @Override
    public boolean canRepair(ItemStack stack, ItemStack ingredient) {
        return this.material.getRepairIngredient().test(ingredient) || super.canRepair(stack, ingredient);
    }
}
