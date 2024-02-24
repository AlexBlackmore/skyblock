package net.skyblock.item;

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
    private ModRarity rarity;
    private String loreKey;

    public ModItem(Settings settings) {
        super(settings);
        this.rarity = ModRarity.convertRarity(this);
    }
    public ModItem(Settings settings, ModRarity rarity) {
        super(settings.rarity(ModRarity.convertModRarity(rarity)));
        this.rarity = rarity;
    }
    public ModItem(Settings settings, ModRarity rarity, String name) {
        super(settings.rarity(ModRarity.convertModRarity(rarity)));
        this.rarity = rarity;
        this.loreKey = "lore.skyblock." + name;
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        LoreUtil.appendLore(tooltip, this);
        super.appendTooltip(stack, world, tooltip, context);
    }
    public String getLoreKey() {
        return this.loreKey;
    }

    public ModRarity getModRarity() {return this.rarity;}
    @Override
    public void setModRarity(ModRarity rarity) {this.rarity = rarity;}
}
