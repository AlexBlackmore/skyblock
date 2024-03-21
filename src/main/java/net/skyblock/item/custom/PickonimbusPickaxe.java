package net.skyblock.item.custom;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.BlockState;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.skyblock.item.ModMiningToolItem;
import net.skyblock.item.ModToolMaterial;

import java.util.ArrayList;
import java.util.List;

public class PickonimbusPickaxe extends ModMiningToolItem {
    private final boolean UNBREAKABLE;

    public PickonimbusPickaxe() {
        super(ModToolMaterial.PICKONIMBUS, BlockTags.PICKAXE_MINEABLE, new FabricItemSettings().maxDamage(-1));
        this.UNBREAKABLE = true;
    }

    public PickonimbusPickaxe(int durability) {
        super(ModToolMaterial.PICKONIMBUS, BlockTags.PICKAXE_MINEABLE, new FabricItemSettings().maxDamage(durability));
        this.UNBREAKABLE = false;
    }

    @Override
    public boolean postMine(ItemStack stack, World world, BlockState state, BlockPos pos, LivingEntity miner) {
        if (this.UNBREAKABLE && !stack.hasNbt()) {
            stack.getOrCreateNbt().putBoolean("Unbreakable", true);
        }

        return super.postMine(stack, world, state, pos, miner);
    }

    @Override
    public List<Object> getLoreArgs(ItemStack stack, int i) {
        List<Object> list = new ArrayList<>();
        switch (i) {
            case 2 -> {
                list.add("§a" + this.getMaxDamage());
            }
            default -> {}
        }
        return list;
    }
    @Override
    public boolean hasGlint(ItemStack stack) {
        return !UNBREAKABLE;
    }
}
