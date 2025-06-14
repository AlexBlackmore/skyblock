package net.skyblock.ability;

import net.minecraft.block.BlockState;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.server.command.CommandManager;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.skyblock.component.ModDataComponentTypes;
import net.skyblock.util.FormattingUtil;
import org.jetbrains.annotations.Nullable;

import java.util.function.Consumer;

public class StoredPotentialAbility extends Ability {
    public StoredPotentialAbility() {
        super("stored_potential", 2);
        this.setHasMax(true);
    }

    @Override
    public boolean postMine(ItemStack stack, World world, BlockState state, BlockPos pos, LivingEntity miner) {
        @Nullable Integer blocksBroken = stack.get(ModDataComponentTypes.BLOCKS_BROKEN);
        if (blocksBroken != null) {
            blocksBroken++;
            stack.set(ModDataComponentTypes.BLOCKS_BROKEN, blocksBroken);
            if (miner instanceof PlayerEntity player && world instanceof ServerWorld server && Math.floorMod(blocksBroken, 100)==0) {
                @Nullable CommandManager commandManager = server.getServer().getCommandManager();
                if (commandManager != null) {
                    commandManager.executeWithPrefix(player.getCommandSource(server).withLevel(4),
                            "function skyblock:ability/stored_potential");
                }
            }
        }

        return super.postMine(stack, world, state, pos, miner);
    }

    @Override
    public Object[] getTooltipArguments(int i, ItemStack stack) {
        @Nullable Integer blocksBroken = stack.get(ModDataComponentTypes.BLOCKS_BROKEN);
        if (blocksBroken != null) {
            switch(i) {
                case 0 -> {
                    return new Object[]{"§9+10%", Text.translatable("attribute.name.mining_efficiency").formatted(Formatting.BLUE)};
                }
                case -1 -> {
                    return new Object[]{Text.literal("§8+250% ").append(Text.translatable("attribute.name.mining_efficiency")).formatted(Formatting.DARK_GRAY)};
                }
                default -> {
                    return new Object[]{};
                }
            }
        }
        return new Object[]{};
    }
}
