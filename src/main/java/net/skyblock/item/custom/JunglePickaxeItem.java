package net.skyblock.item.custom;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.ExperienceOrbEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.skyblock.block.ModBlocks;
import net.skyblock.item.ModMiningToolItem;
import net.skyblock.item.ModToolMaterial;
import net.skyblock.util.ModRarity;

import java.util.ArrayList;
import java.util.List;

public class JunglePickaxeItem extends ModMiningToolItem {
    private final float CHANCE = 0.03f;
    public JunglePickaxeItem(Settings settings) {
        super(ModToolMaterial.JUNGLE, BlockTags.PICKAXE_MINEABLE, settings);
        this.setModRarity(ModRarity.UNCOMMON);
        this.setLoreKey("jungle_pickaxe");
    }

    @Override
    public boolean postMine(ItemStack stack, World world, BlockState state, BlockPos pos, LivingEntity miner) {
        if (world instanceof ServerWorld server && state.getBlock() == ModBlocks.HARD_STONE) {
            if (Math.random() < this.CHANCE) {
                this.generateAdditionalLoot(stack, server, state, pos, miner);
            }
        }
        return super.postMine(stack, world, state, pos, miner);
    }
    @Override
    public List<Object> getLoreArgs(ItemStack stack, int i) {
        List<Object> list = new ArrayList<>();
        switch (i) {
            case 2 -> {
                list.add(Text.translatable("item.skyblock.sludge_juice").formatted(Formatting.YELLOW));
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
