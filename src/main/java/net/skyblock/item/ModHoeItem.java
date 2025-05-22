package net.skyblock.item;

import net.minecraft.block.BlockState;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.LoreComponent;
import net.minecraft.component.type.TooltipDisplayComponent;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.*;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.skyblock.Skyblock;
import net.skyblock.ability.Ability;
import net.skyblock.util.ExpandedRarity;

import java.util.function.Consumer;

public class ModHoeItem extends ModItem {
    public ModHoeItem(Settings settings) {
        super(settings);
    }
    public ModHoeItem(Settings settings, ModRarity rarity, Ability[] abilities) {
        super(settings, rarity, abilities);
    }
}
