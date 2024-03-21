package net.skyblock.item.custom;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.text.Text;
import net.skyblock.item.ModMiningToolItem;

import java.util.ArrayList;
import java.util.List;

public class TitaniumPickaxeItem extends ModMiningToolItem {
    private int titaniumMiningFortune = 0;

    public TitaniumPickaxeItem(ToolMaterial material, Settings settings, int fortune) {
        super(material, BlockTags.PICKAXE_MINEABLE, settings);
        this.setLoreKey("titanium_pickaxe");
        this.setGlint(true);
        this.titaniumMiningFortune = fortune;
    }
    @Override
    public List<Object> getLoreArgs(ItemStack stack, int i) {
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
}
