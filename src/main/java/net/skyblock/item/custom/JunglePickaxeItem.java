package net.skyblock.item.custom;

import net.minecraft.block.BlockState;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterials;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.util.Rarity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.skyblock.item.ModMiningToolItem;
import net.skyblock.item.ModToolMaterials;

public class JunglePickaxeItem extends ModMiningToolItem {
    public JunglePickaxeItem(Settings settings) {
        super(10.0f, -2.8f, 11.0f, ModToolMaterials.TITANIUM, BlockTags.PICKAXE_MINEABLE,  settings.rarity(Rarity.UNCOMMON));
    }

    @Override
    public boolean hasGlint(ItemStack stack) {
        return true;
    }
}
