package net.skyblock.block.custom;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.skyblock.block.ModBlock;
import net.skyblock.util.ModRarity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CenturyCakeBlock extends ModBlock {
    private final float BONUS;
    private final StatusEffect EFFECT;
    private final EntityAttribute ATTRIBUTE;
    private final int DURATION = 48000;

    private static final VoxelShape SHAPE = Block.createCuboidShape(4,0,4,12,18, 12);
    public CenturyCakeBlock(StatusEffect effect, float bonus, EntityAttribute attribute) {
        super("century_cake", ModRarity.UNCOMMON, FabricBlockSettings.copyOf(Blocks.CAKE));
        this.EFFECT = effect;
        this.BONUS = bonus;
        this.ATTRIBUTE = attribute;
    }
    public CenturyCakeBlock(StatusEffect effect, float bonus, EntityAttribute attribute, ModRarity rarity) {
        super("century_cake", rarity, FabricBlockSettings.copyOf(Blocks.CAKE));
        this.EFFECT = effect;
        this.BONUS = bonus;
        this.ATTRIBUTE = attribute;
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        StatusEffectInstance effect = new StatusEffectInstance(this.EFFECT, this.DURATION, 0, true, false, false);

        if (world.isClient()) {
            if(!player.hasStatusEffect(this.EFFECT)) {
                List<Object> args3 = this.getLoreArgs(3);
                List<Object> args4 = this.getLoreArgs(4);
                player.sendMessage(Text.translatable("block.skyblock.century_cake.use", args3.get(0), args3.get(1), args4.get(0)));
            } else if (Objects.requireNonNull(player.getStatusEffect(this.EFFECT)).getDuration() < this.DURATION-80) {
                List<Object> args3 = this.getLoreArgs(3);
                List<Object> args4 = this.getLoreArgs(4);
                player.sendMessage(Text.translatable("block.skyblock.century_cake.refresh", args3.get(0), args3.get(1), args4.get(0)));
            }
        }

        player.addStatusEffect(new StatusEffectInstance(effect));
        return ActionResult.SUCCESS;
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }

    @Override
    public BlockRenderType getRenderType(BlockState state) {
        return BlockRenderType.MODEL;
    }

    @Override
    public List<Object> getLoreArgs(ItemStack stack, int i) {
        return this.getLoreArgs(i);
    }
    public List<Object> getLoreArgs(int i) {
        List<Object> list = new ArrayList<>();
        switch (i) {
            case 3 -> {
                if (this.BONUS >= 1.0f) {
                    list.add(Text.literal("+" + (int)BONUS).formatted(Formatting.GREEN));
                } else {
                    list.add(Text.literal("+" + (int)(BONUS*100) + "%").formatted(Formatting.GREEN));
                }
                list.add(Text.translatable(this.ATTRIBUTE.getTranslationKey()));
            }
            case 4 -> {
                list.add(Text.literal("2 days").formatted(Formatting.GREEN));
            }
            default -> {}
        }
        return list;
    }
}
