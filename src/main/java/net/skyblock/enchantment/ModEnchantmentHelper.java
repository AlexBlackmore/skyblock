package net.skyblock.enchantment;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;

public class ModEnchantmentHelper {

    public static int getTrueMaxLevel(Enchantment enchantment) {

        if (enchantment instanceof ModEnchantment) {
            return ((ModEnchantment) enchantment).getTrueMaxLevel();
        } else {
            if (enchantment.equals(Enchantments.FIRE_ASPECT)) { return 3; }
            else if (enchantment.equals(Enchantments.LOOTING)) { return 5;}
            else if (enchantment.equals(Enchantments.BANE_OF_ARTHROPODS) ||
                    enchantment.equals(Enchantments.SHARPNESS) ||
                    enchantment.equals(Enchantments.SMITE)) { return 7;}
            else { return enchantment.getMaxLevel(); }
        }
    }
}
