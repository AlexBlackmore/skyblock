package net.skyblock.util;

import net.minecraft.item.Item;
import net.minecraft.util.Formatting;
import net.minecraft.util.Rarity;

public enum ModRarity {
    COMMON(Formatting.WHITE),
    UNCOMMON(Formatting.YELLOW),
    RARE(Formatting.AQUA),
    EPIC(Formatting.LIGHT_PURPLE),
    LEGENDARY(Formatting.GOLD),
    MYTHIC(Formatting.DARK_AQUA),
    DIVINE(Formatting.DARK_PURPLE),
    SPECIAL(Formatting.RED),

    VERY_SPECIAL(Formatting.DARK_RED);

    public final Formatting formatting;

    ModRarity(Formatting formatting) {
        this.formatting = formatting;
    }

    public static ModRarity convertRarity(Item item) {
        switch (item.getRarity(item.getDefaultStack())) {
            case COMMON -> {return ModRarity.COMMON;}
            case UNCOMMON -> {return ModRarity.UNCOMMON;}
            case RARE -> {return ModRarity.RARE;}
            case EPIC -> {return ModRarity.EPIC;}
            default -> {return ModRarity.SPECIAL;}
        }
    }
    public static Rarity convertModRarity(ModRarity rarity) {
        switch (rarity) {
            case COMMON -> {return Rarity.COMMON;}
            case UNCOMMON -> {return Rarity.UNCOMMON;}
            case RARE -> {return Rarity.RARE;}
            default -> {return Rarity.EPIC;}
        }
    }
}
