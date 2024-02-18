package net.skyblock.item;

import net.minecraft.item.Item;
import net.skyblock.util.ModRarity;

public class ModItem extends Item {
    private ModRarity rarity = ModRarity.COMMON;

    public ModItem(Settings settings) {
        super(settings);
    }
    public ModItem(Settings settings, ModRarity rarity) {
        super(settings);
        this.rarity = rarity;
    }

    public ModRarity getModRarity() {
        return this.rarity;
    }
}
