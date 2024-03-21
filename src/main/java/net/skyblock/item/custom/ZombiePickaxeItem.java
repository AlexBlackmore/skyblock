package net.skyblock.item.custom;

import net.minecraft.block.BlockState;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.skyblock.item.ModMiningToolItem;
import net.skyblock.item.ModToolMaterial;
import net.skyblock.util.ModTags;

import java.util.ArrayList;
import java.util.List;

public class ZombiePickaxeItem extends ModMiningToolItem {
    private static final int DURATION = 5;
    private static final String STATUS_EFFECT = "effect.minecraft.haste";
    private static final int AMPLIFIER = 1;

    public ZombiePickaxeItem(Settings settings) {
        super(ModToolMaterial.ZOMBIE, BlockTags.PICKAXE_MINEABLE, settings);
        this.setLoreKey("zombie_pickaxe");
    }

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
    public List<Object> getLoreArgs(ItemStack stack, int i) {
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
