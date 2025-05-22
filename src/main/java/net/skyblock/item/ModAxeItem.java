package net.skyblock.item;

import net.minecraft.block.BlockState;
import net.minecraft.component.type.TooltipDisplayComponent;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.AxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.item.ToolMaterial;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.skyblock.ability.Ability;
import net.skyblock.util.ExpandedRarity;

import java.util.function.Consumer;

public class ModAxeItem extends ModItem {
    public ModAxeItem(Settings settings) {
        super(settings);
    }

    public ModAxeItem(Settings settings, ModRarity rarity, Ability[] abilities) {
        super(settings, rarity, abilities);
    }
}
