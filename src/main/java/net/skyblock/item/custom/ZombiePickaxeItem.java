package net.skyblock.item.custom;

import net.minecraft.block.BlockState;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;
import net.minecraft.item.ToolMaterials;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.skyblock.item.ModPickaxe;
import net.skyblock.item.ModToolMaterials;
import net.skyblock.util.ModRarity;
import net.skyblock.util.ModTags;

import java.util.ArrayList;
import java.util.List;

public class ZombiePickaxeItem extends ModPickaxe {
    private static final int DURATION = 5;
    private static final String STATUS_EFFECT = "effect.minecraft.haste";
    private static final int AMPLIFIER = 1;

    public ZombiePickaxeItem(Settings settings) {
        super(ModToolMaterials.ZOMBIE, settings, ModRarity.COMMON, "zombie_pickaxe");
    }
//    public ZombiePickaxeItem(Item.Settings settings) {
//        super(0.0f, -2.8f, 6, ToolMaterials.IRON, BlockTags.PICKAXE_MINEABLE,  settings, ModRarity.COMMON, NAME);
//    }

    @Override
    public boolean postMine(ItemStack stack, World world, BlockState state, BlockPos pos, LivingEntity miner) {
        if (!world.isClient && state.getHardness(world, pos) != 0.0f) {
            if (state.isIn(ModTags.Blocks.ORES)) {
                miner.addStatusEffect(new StatusEffectInstance(StatusEffects.HASTE, DURATION*20, 1));
            }
            stack.damage(1, miner, e -> e.sendEquipmentBreakStatus(EquipmentSlot.MAINHAND));
        }
        return true;
    }

    @Override
    public List<Object> getLoreArgs(int i) {
        List<Object> list = new ArrayList<>();
        switch (i) {
            case 1 -> {
                list.add(Text.translatable("potion.withAmplifier", Text.translatable(STATUS_EFFECT), Text.translatable("potion.potency."+AMPLIFIER)).formatted(Formatting.BLUE));
                list.add("§a"+DURATION+"s");
            }
            default -> {}
        }
        return list;
    }
}
