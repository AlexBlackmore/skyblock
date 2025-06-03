package net.skyblock.mixin;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.skyblock.component.ModDataComponentTypes;
import net.skyblock.util.EnchantmentsUtil;
import net.skyblock.util.SkillsUtil;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Block.class)
public class BlockMixin {

    @Inject(method = "onBreak(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/BlockState;Lnet/minecraft/entity/player/PlayerEntity;)Lnet/minecraft/block/BlockState;", at = @At("HEAD"))
    public void inject(World world, BlockPos pos, BlockState state, PlayerEntity player, CallbackInfoReturnable info) {
        if (world instanceof ServerWorld server) {
            //Gives skill xp for blocks mined
            //For some reason running this in AbstractBlock.onStacksDropped using tool.getHolder() does not work?
            SkillsUtil.addExperience(server, pos, state, player);

            ItemStack stack = player.getWeaponStack();
            @Nullable Integer blocksBroken = stack.get(ModDataComponentTypes.COMPACT);
            if (blocksBroken != null) {
                EnchantmentsUtil.CompactEnchantment(blocksBroken, stack, player, server);
            }
        }
    }
}
