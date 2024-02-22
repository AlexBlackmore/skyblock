package net.skyblock.item.custom;

import net.minecraft.block.BlockState;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterials;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.text.Text;
import net.minecraft.util.Rarity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.skyblock.item.ModMiningToolItem;
import net.skyblock.item.ModToolMaterials;
import net.skyblock.util.ModRarity;

import java.util.ArrayList;
import java.util.List;

public class JunglePickaxeItem extends ModMiningToolItem {
    public JunglePickaxeItem(Settings settings) {
        super(10.0f, -2.8f, 11.0f, ModToolMaterials.TITANIUM, BlockTags.PICKAXE_MINEABLE,  settings.rarity(Rarity.UNCOMMON), ModRarity.UNCOMMON, "jungle_pickaxe");
    }

    @Override
    public List<Object> getLoreArgs(int i) {
        List<Object> list = new ArrayList<>();
        switch (i) {
            case 2 -> {
                list.add("§e" + Text.translatable("item.skyblock.sludge_juice"));
            }
            case 3 -> {
                list.add(Text.translatable("location.skyblock.crystal_hollows.jungle"));
                list.add(Text.translatable("location.skyblock.crystal_hollows"));
            }
            default -> {}
        }
        return list;
    }
    @Override
    public boolean hasGlint(ItemStack stack) {
        return true;
    }
}
