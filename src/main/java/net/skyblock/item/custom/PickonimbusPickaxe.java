package net.skyblock.item.custom;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtByte;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.nbt.NbtElement;
import net.minecraft.nbt.NbtHelper;
import net.skyblock.item.ModPickaxe;
import net.skyblock.item.ModToolMaterial;
import net.skyblock.util.ModRarity;

import java.util.ArrayList;
import java.util.List;

public class PickonimbusPickaxe extends ModPickaxe {
    private final boolean UNBREAKABLE;

    public PickonimbusPickaxe(String name) {
        super(ModToolMaterial.PICKONIMBUS, new FabricItemSettings(), ModRarity.EPIC, name);
        this.UNBREAKABLE = true;
    }

    public PickonimbusPickaxe(String name, int durability) {
        super(ModToolMaterial.PICKONIMBUS, new FabricItemSettings().maxDamage(durability), ModRarity.EPIC, name);
        this.UNBREAKABLE = false;
    }

    @Override
    public ItemStack getDefaultStack() {
        ItemStack stack = super.getDefaultStack();
//        if (UNBREAKABLE) {
//            NbtCompound nbt = new NbtCompound();
//            nbt.putBoolean("Unbreakable", true);
//            stack.setNbt(nbt);
//        }
        return stack;
    }

    @Override
    public List<Object> getLoreArgs(int i) {
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
