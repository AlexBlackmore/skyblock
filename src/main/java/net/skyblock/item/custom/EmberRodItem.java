package net.skyblock.item.custom;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import net.skyblock.item.ModItem;
import net.skyblock.util.ModRarity;

public class EmberRodItem extends ModItem {
    public EmberRodItem(Item.Settings settings) {
        super(settings, ModRarity.EPIC);
    }

}
