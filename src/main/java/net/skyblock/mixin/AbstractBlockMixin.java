package net.skyblock.mixin;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.mob.EndermiteEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.tag.EnchantmentTags;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.GameRules;
import net.skyblock.ability.Ability;
import net.skyblock.ability.StonkAbility;
import net.skyblock.item.ModItem;
import net.skyblock.util.SkillsUtil;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(AbstractBlock.class)
public class AbstractBlockMixin {

    @Inject(method = "onStacksDropped(Lnet/minecraft/block/BlockState;Lnet/minecraft/server/world/ServerWorld;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/item/ItemStack;Z)V", at = @At("HEAD"))
    protected void injected(BlockState state, ServerWorld world, BlockPos pos, ItemStack tool, boolean dropExperience, CallbackInfo info) {
        //Don't know why this doesn't work. Running in Block.onBreak instead
//        if (tool.getHolder() instanceof PlayerEntity player) {
//            SkillsUtil.addExperience(world, pos, state, player);
//            player.sendMessage(Text.literal("AbstractBlock"), false);
//        }

        //Spawns Endermites when mining End Stone
        if (world.getGameRules().getBoolean(GameRules.DO_TILE_DROPS) && state.getBlock() == Blocks.END_STONE
                && !EnchantmentHelper.hasAnyEnchantmentsIn(tool, EnchantmentTags.PREVENTS_INFESTED_SPAWNS)) {

            boolean stonk = false;
            if (tool.getItem() instanceof ModItem item) {
                for (Ability ability : item.abilities) {
                    if (ability instanceof StonkAbility) {
                        stonk = true;
                        break;
                    }
                }
            }

            if (!stonk && Math.random() < 0.05f) {
                this.spawnEndermite(world, pos);
            }
        }
    }

    @Unique
    private void spawnEndermite(ServerWorld world, BlockPos pos) {
        EndermiteEntity endermiteEntity = EntityType.ENDERMITE.create(world, SpawnReason.TRIGGERED);
        if (endermiteEntity != null) {
            endermiteEntity.refreshPositionAndAngles(pos.getX() + 0.5, pos.getY(), pos.getZ() + 0.5, 0.0F, 0.0F);
            world.spawnEntity(endermiteEntity);
            endermiteEntity.playSpawnEffects();
        }
    }
}
