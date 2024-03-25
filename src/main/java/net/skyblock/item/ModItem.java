package net.skyblock.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Rarity;
import net.minecraft.world.World;
import net.skyblock.util.LoreUtil;
import net.skyblock.util.ModItemInterface;
import net.skyblock.util.ModRarity;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

public class ModItem extends Item implements ModItemInterface {
    private ModRarity rarity = ModRarity.COMMON;
    private String loreKey;
    private boolean hasGlint = false;

    public ModItem() {
        super(new FabricItemSettings());
    }

    public ModItem(Settings settings) {
        super(settings);
    }

//    public ModItem(Settings settings, ModRarity rarity, String name) {
//        super(settings);
//        this.rarity = rarity;
//        this.loreKey = "lore.skyblock." + name;
//    }

    public ModItem setGlint(boolean hasGlint){
        this.hasGlint = hasGlint;
        return this;
    }
    public ModItem setLoreKey(String name){
        this.loreKey = "lore.skyblock." + name;
        return this;
    }
    public ModItem setModRarity(ModRarity rarity){
        this.rarity = rarity;
        return this;
    }

    @Override
    public Text getName() {
        return Text.translatable(this.getTranslationKey()).formatted(this.rarity.formatting);
    }
    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        LoreUtil.appendLore(stack, tooltip, this);
        super.appendTooltip(stack, world, tooltip, context);
    }

    public String getLoreKey() {
        return this.loreKey;
    }
    public ModRarity getModRarity() {return this.rarity;}
    @Override
    public boolean hasGlint(ItemStack stack) {
        return this.hasGlint;
    }
}
