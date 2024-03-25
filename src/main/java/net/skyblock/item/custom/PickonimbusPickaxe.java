package net.skyblock.item.custom;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
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
        this.setGlint(false);
    }

    public PickonimbusPickaxe(int durability) {
        super(ModToolMaterial.PICKONIMBUS, BlockTags.PICKAXE_MINEABLE, new FabricItemSettings().maxDamage(durability));
        this.UNBREAKABLE = false;
        this.setGlint(true);
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        super.inventoryTick(stack, world, entity, slot, selected);

        if (!world.isClient && !stack.hasNbt() && this.UNBREAKABLE) {
            stack.getOrCreateNbt().putBoolean("Unbreakable", true);
        }
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
}
