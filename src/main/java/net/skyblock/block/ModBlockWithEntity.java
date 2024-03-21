package net.skyblock.block;

import com.mojang.serialization.MapCodec;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BlockEntityProvider;
import net.minecraft.block.BlockState;
import net.minecraft.block.BlockWithEntity;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.skyblock.Skyblock;
import net.skyblock.util.LoreUtil;
import net.skyblock.util.ModItemInterface;
import net.skyblock.util.ModRarity;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ModBlockWithEntity extends BlockWithEntity implements BlockEntityProvider, ModItemInterface {
    private ModRarity rarity;
    private final String loreKey;
    public ModBlockWithEntity(String name, ModRarity rarity, AbstractBlock.Settings settings) {
        super(settings);
        this.loreKey = "lore." + Skyblock.MOD_ID + "." + name;
        this.rarity = rarity;
    }

    @Override
    protected MapCodec<? extends BlockWithEntity> getCodec() {
        return null;
    }

    @Nullable
    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return null;
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        LoreUtil.appendLore(stack, tooltip, this);
        super.appendTooltip(stack, world, tooltip, context);
    }

    @Override
    public List<Object> getLoreArgs(ItemStack stack, int i) {
        return ModItemInterface.super.getLoreArgs(stack, i);
    }

    @Override
    public String getLoreKey() {
        return this.loreKey;
    }

    @Override
    public ModRarity getModRarity() {
        return this.rarity;
    }
}
