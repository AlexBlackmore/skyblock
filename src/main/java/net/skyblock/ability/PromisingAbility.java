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

public class PromisingAbility extends Ability {
    private final int[] levels;

    public PromisingAbility() {
        super("promising", 4);
        this.levels = new int[]{50, 250, 750, 1750, 3750};
        this.setShowName(false);
    }
    public PromisingAbility(int[] levels) {
        super("promising", 4);
        this.levels = levels;
        this.setShowName(false);
    }

    @Override
    public boolean postMine(ItemStack stack, World world, BlockState state, BlockPos pos, LivingEntity miner) {
        @Nullable Integer blocksBroken = stack.get(ModDataComponentTypes.BLOCKS_BROKEN);
        if (blocksBroken != null) {
            blocksBroken++;
            stack.set(ModDataComponentTypes.BLOCKS_BROKEN, blocksBroken);
            if (miner instanceof PlayerEntity player && world instanceof ServerWorld server) {
//                player.sendMessage(Text.literal("Promising Tool Blocks Broken " + blocksBroken), true);
                @Nullable CommandManager commandManager = server.getServer().getCommandManager();
                if (commandManager != null) {
                    commandManager.executeWithPrefix(player.getCommandSource(server).withLevel(4),
                            "function skyblock:ability/promising_tool");
                }
            }
        }

        return super.postMine(stack, world, state, pos, miner);
    }

    @Override
    public Object[] getTooltipArguments(int i, ItemStack stack) {
        @Nullable Integer blocksBroken = stack.get(ModDataComponentTypes.BLOCKS_BROKEN);
        if (blocksBroken != null) {
            int nextLevel = 1;
            for (int a : this.levels) {
                if (blocksBroken > a) nextLevel++;
            }

            switch(i) {
                case 0 -> {
                    return new Object[]{ Text.translatable("enchantment.minecraft.efficiency").formatted(Formatting.BLUE), Text.translatable("enchantment.level." + nextLevel).formatted(Formatting.BLUE)};
                }
                case 1 -> {
                    return new Object[]{"§a" + FormattingUtil.commaSeparateInt(levels[nextLevel-1])};
                }
                case 3 -> {
                    return new Object[]{"§a" + FormattingUtil.commaSeparateInt(blocksBroken)};
                }
                default -> {
                    return new Object[]{};
                }
            }
        }
        return new Object[]{};
    }
}
