package net.skyblock.item.custom;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.skyblock.item.ModArmorMaterial;
import net.skyblock.item.ModDyeableArmorItem;
import net.skyblock.util.ModRarity;

public class FarmSuitItem extends ModDyeableArmorItem {
    public FarmSuitItem(Type type) {
        super(ModArmorMaterial.FARM_SUIT, type, new FabricItemSettings(), ModRarity.COMMON, "farm_suit", 16776960);
    }
}