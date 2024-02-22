package net.skyblock.item;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Rarity;
import net.minecraft.world.World;
import net.skyblock.util.LoreUtil;
import net.skyblock.util.ModRarity;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

public class ModItem extends Item {
    private ModRarity rarity = ModRarity.COMMON;
    private String loreKey;

    public ModItem(Settings settings) {
        super(settings);

        if (this.getRarity(this.getDefaultStack()) == Rarity.UNCOMMON) {
            this.rarity = ModRarity.UNCOMMON;
        } else if (this.getRarity(this.getDefaultStack()) == Rarity.RARE) {
            this.rarity = ModRarity.RARE;
        } else if (this.getRarity(this.getDefaultStack()) == Rarity.EPIC) {
            this.rarity = ModRarity.EPIC;
        }
    }
    public ModItem(Settings settings, ModRarity rarity) {
        super(settings);
        this.rarity = rarity;
    }

    public ModItem(Settings settings, ModRarity rarity, String name) {
        super(settings);
        this.rarity = rarity;
        this.loreKey = "lore.skyblock." + name;
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        LoreUtil.appendLore(tooltip, this);
        super.appendTooltip(stack, world, tooltip, context);
    }

    public List<Object> getLoreArgs(int i) {
        return new ArrayList<>();
    }

    public String getLoreKey() {
        return this.loreKey;
    }

    public ModRarity getModRarity() {
        return this.rarity;
    }
}
