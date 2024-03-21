package net.skyblock.block.custom;

import net.minecraft.block.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.skyblock.block.ModBlock;
import net.skyblock.util.ModRarity;

public class ChestPlus extends ModBlock {
    private static final VoxelShape SHAPE = Block.createCuboidShape(4,0,4,12,18, 12);
    public ChestPlus(Settings settings) {
        super("chest_plus", ModRarity.RARE, settings);
    }
    public ChestPlus(Settings settings, ModRarity rarity) {
        super("chest_plus", rarity, settings);
    }

//    @Nullable
//    @Override
//    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
//        return null;
//    }
    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }
    @Override
    public BlockRenderType getRenderType(BlockState state) {
        return BlockRenderType.MODEL;
    }
}
