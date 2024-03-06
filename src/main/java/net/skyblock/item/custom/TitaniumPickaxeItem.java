package net.skyblock.item.custom;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;
import net.minecraft.text.Text;
import net.skyblock.item.ModPickaxe;
import net.skyblock.util.ModRarity;

import java.util.ArrayList;
import java.util.List;

public class TitaniumPickaxeItem extends ModPickaxe {
    private int titaniumMiningFortune = 0;

    public TitaniumPickaxeItem(ToolMaterial material, Settings settings, ModRarity rarity) {
        super(material, settings, rarity, "titanium_pickaxe");
    }
    public TitaniumPickaxeItem(ToolMaterial material, Settings settings, ModRarity rarity, int fortune) {
        super(material,  settings, rarity, "titanium_pickaxe");
        this.titaniumMiningFortune = fortune;
    }
    @Override
    public List<Object> getLoreArgs(int i) {
        List<Object> list = new ArrayList<>();
        switch (i) {
            case 1 -> {
                list.add("§a+"+this.titaniumMiningFortune+"%");
                list.add(Text.translatable("attribute.name.fortune.mining"));
            }
            case 2 -> {
                list.add(Text.translatable("block.skyblock.titanium_ore"));
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
