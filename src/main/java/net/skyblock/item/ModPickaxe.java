package net.skyblock.item;

import net.minecraft.block.Block;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.*;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.text.Text;
import net.minecraft.world.World;
import net.skyblock.util.LoreUtil;
import net.skyblock.util.ModItemInterface;
import net.skyblock.util.ModRarity;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ModPickaxe extends PickaxeItem implements ModItemInterface {
    private ModRarity rarity;
    private String loreKey;
    public ModPickaxe(ToolMaterial material, Settings settings) {
        super(material, 0, -2.8f, settings);
        this.rarity = ModRarity.convertRarity(this);
    }
    public ModPickaxe(ToolMaterial material, Settings settings, ModRarity rarity, String name) {
        super(material, 0, -2.8f, settings.rarity(ModRarity.convertModRarity(rarity)));
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
