package net.skyblock.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.potion.Potion;
import net.skyblock.util.ModRarity;
import org.jetbrains.annotations.Nullable;

public class ModPotion extends Potion {
    public ModRarity rarity;

    public ModPotion(int r, @Nullable String s, StatusEffectInstance ... effects) {
        super(s, effects);
        switch (r){
            case 1 -> rarity = ModRarity.UNCOMMON;
            case 2 -> rarity = ModRarity.RARE;
            case 3 -> rarity = ModRarity.EPIC;
            case 4 -> rarity = ModRarity.LEGENDARY;
            case 5 -> rarity = ModRarity.MYTHIC;
            case 6 -> rarity = ModRarity.DIVINE;
            case 7 -> rarity = ModRarity.SPECIAL;
            case 8 -> rarity = ModRarity.VERY_SPECIAL;
            default -> rarity = ModRarity.COMMON;
        }
    }

    public ModRarity getModRarity() {
        return this.rarity;
    }
}
