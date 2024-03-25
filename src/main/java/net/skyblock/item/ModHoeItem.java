package net.skyblock.item;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.HoeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;
import net.minecraft.text.Text;
import net.minecraft.world.World;
import net.skyblock.util.LoreUtil;
import net.skyblock.util.ModItemInterface;
import net.skyblock.util.ModRarity;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ModHoeItem extends HoeItem implements ModItemInterface {
    private ModRarity rarity = ModRarity.COMMON;
    private String loreKey;
    private boolean hasGlint = false;

    public ModHoeItem(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }
    public ModHoeItem setModRarity(ModRarity rarity) {
        this.rarity = rarity;
        return this;
    }
    public ModHoeItem setLoreKey(String name) {
        this.loreKey = "lore.skyblock." + name;
        return this;
    }
    public ModHoeItem setGlint(boolean hasGlint) {
        this.hasGlint = hasGlint;
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
        return this.hasGlint || super.hasGlint(stack);
    }

}
