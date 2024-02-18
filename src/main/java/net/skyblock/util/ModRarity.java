package net.skyblock.util;

import net.minecraft.util.Formatting;

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
}
