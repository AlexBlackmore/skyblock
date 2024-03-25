package net.skyblock.item.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.ExperienceOrbEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.skyblock.item.ModMiningToolItem;
import net.skyblock.util.FormattingUtil;

import java.util.ArrayList;
import java.util.List;

public class StonkItem extends ModMiningToolItem {
    private final float CHANCE = 0.05f;
    private final int EXPERIENCE = 3;
    public StonkItem(ToolMaterial material, TagKey<Block> effectiveBlocks, Settings settings) {
        super(material, effectiveBlocks, settings);
        this.setLoreKey("stonk");
    }

    @Override
    public boolean postMine(ItemStack stack, World world, BlockState state, BlockPos pos, LivingEntity miner) {
        if (world instanceof ServerWorld server && state.getBlock() == Blocks.END_STONE) {
            ExperienceOrbEntity.spawn(server, Vec3d.ofCenter(pos), this.EXPERIENCE);
            if (Math.random() < this.CHANCE) {
                this.generateAdditionalLoot(stack, server, state, pos, miner);
            }
        }
        return super.postMine(stack, world, state, pos, miner);
    }

//    @Override
//    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
//        super.inventoryTick(stack, world, entity, slot, selected);
//
//        if (!world.isClient && !stack.getOrCreateNbt().getBoolean("Generated")) {
//            if (EnchantmentHelper.getLevel(Enchantments.EFFICIENCY, stack)==0) {
//                assert stack.getNbt() != null;
//                stack.getNbt().putBoolean("Generated", true);
//                stack.addEnchantment(Enchantments.EFFICIENCY, 6);
//                entity.sendMessage(Text.literal("Generated Stonk enchantment"));
//            }
//        }
//    }

    @Override
    public List<Object> getLoreArgs(ItemStack stack, int i) {
        List<Object> list = new ArrayList<>();
        switch (i) {
            case 1 -> list.add(Text.translatable("block.minecraft.end_stone"));
            case 2 -> list.add(Text.translatable("formatting.skyblock.plural", Text.translatable("entity.minecraft.endermite")).formatted(Formatting.RED));
            case 3 -> list.add(Text.translatable("formatting.skyblock.plural", Text.translatable("entity.minecraft.experience_orb")).formatted(Formatting.AQUA));
            case 4 -> list.add(Text.literal(FormattingUtil.formatPercent(this.CHANCE)).formatted(Formatting.GREEN));
            default -> {}
        }
        return list;
    }
}
