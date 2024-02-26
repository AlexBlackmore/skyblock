package net.skyblock.item.custom;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.skyblock.item.ModPickaxe;
import net.skyblock.item.ModToolMaterial;
import net.skyblock.util.ModRarity;

import java.util.ArrayList;
import java.util.List;

public class Pickonimbus2000Pickaxe extends ModPickaxe {

    public Pickonimbus2000Pickaxe() {
        super(ModToolMaterial.PICKONIMBUS, new FabricItemSettings(), ModRarity.EPIC, "pickonimbus_2000");
    }

    @Override
    public List<Object> getLoreArgs(int i) {
        List<Object> list = new ArrayList<>();
        switch (i) {
            case 2 -> {
                list.add("§a" + this.getMaterial().getDurability());
            }
            default -> {}
        }
        return list;
    }
    @Override
    public boolean hasGlint(ItemStack stack) {
        return true;
    }
}
