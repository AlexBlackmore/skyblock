package net.skyblock.item.custom;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;
import net.minecraft.text.Text;
import net.skyblock.item.ModPickaxe;
import net.skyblock.util.ModRarity;

import java.util.ArrayList;
import java.util.List;

public class MithrilPickaxeItem extends ModPickaxe {
    private int mithrilPowder = 0;
    private int mithrilMiningSpeed = 0;

    public MithrilPickaxeItem(ToolMaterial material, Settings settings, ModRarity rarity) {
        super(material, settings, rarity, "mithril_pickaxe");
    }
    public MithrilPickaxeItem(ToolMaterial material, Settings settings, ModRarity rarity,  int powder, int speed) {
        super(material,  settings, rarity, "mithril_pickaxe");
        this.mithrilPowder = powder;
        this.mithrilMiningSpeed = speed;
    }
    @Override
    public List<Object> getLoreArgs(int i) {
        List<Object> list = new ArrayList<>();
        switch (i) {
            case 1 -> {
                list.add("§a+"+this.mithrilPowder+"%");
                list.add(Text.translatable("currency.skyblock.mithril_powder"));
            }
            case 4 -> {
                list.add("§a+"+ this.mithrilMiningSpeed+"%");
                list.add(Text.translatable("attribute.name.player.mining_speed"));
            }
            case 5 -> {
                list.add(Text.translatable("block.skyblock.mithril_ore"));
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
