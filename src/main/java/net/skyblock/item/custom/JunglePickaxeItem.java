package net.skyblock.item.custom;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.skyblock.item.ModPickaxe;
import net.skyblock.item.ModToolMaterials;
import net.skyblock.util.ModRarity;

import java.util.ArrayList;
import java.util.List;

public class JunglePickaxeItem extends ModPickaxe {
    public JunglePickaxeItem(Settings settings) {
        super(ModToolMaterials.JUNGLE, settings, ModRarity.UNCOMMON, "jungle_pickaxe");
    }

    @Override
    public List<Object> getLoreArgs(int i) {
        List<Object> list = new ArrayList<>();
        switch (i) {
            case 2 -> {
                list.add(Text.translatable("item.skyblock.sludge_juice").formatted(Formatting.YELLOW));
            }
            case 3 -> {
                list.add(Text.translatable("location.skyblock.crystal_hollows.jungle"));
                list.add(Text.translatable("location.skyblock.crystal_hollows"));
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
