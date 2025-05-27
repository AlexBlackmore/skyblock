package net.skyblock.ability;

import net.minecraft.block.Block;
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

public class MathematicalHoeAbility extends Ability {
    private final Block block;
    private final int[] upgradeThresholds = new int[]{100000, 10000000};

    public MathematicalHoeAbility(Block block) {
        super("mathematical_hoe", 2);
        this.block = block;
    }

    @Override
    public boolean postMine(ItemStack stack, World world, BlockState state, BlockPos pos, LivingEntity miner) {
        if (state.getBlock() == this.block) {
            @Nullable Integer blocksBroken = stack.get(ModDataComponentTypes.MATHEMATICAL_HOE);
            if (blocksBroken != null) {
                blocksBroken++;
                stack.set(ModDataComponentTypes.MATHEMATICAL_HOE, blocksBroken);
//                if (miner instanceof PlayerEntity player && world instanceof ServerWorld server) {
////                player.sendMessage(Text.literal("Promising Tool Blocks Broken " + blocksBroken), true);
//                    @Nullable CommandManager commandManager = server.getServer().getCommandManager();
//                    if (commandManager != null) {
//                        commandManager.executeWithPrefix(player.getCommandSource(server).withLevel(4),
//                                "function skyblock:ability/promising_tool");
//                    }
//                }
            }
        }

        return super.postMine(stack, world, state, pos, miner);
    }

    @Override
    public void appendTooltip(ItemStack stack, Consumer<Text> textConsumer) {
        @Nullable Integer blocksBroken = stack.get(ModDataComponentTypes.MATHEMATICAL_HOE);
        if (blocksBroken != null) {
            for (int i=0 ; i<this.loreLines ; i++) {
                if (i==0) {
                    textConsumer.accept(Text.translatable("ability.skyblock." + this.name + "." + i, "§e" + FormattingUtil.commaSeparateInt(blocksBroken), this.block.getName().formatted(Formatting.YELLOW)));
                } else if (i==1) {
                    int upgradeThreshold = 0;
                    for (int t : this.upgradeThresholds) {
                        if (blocksBroken < t) {
                            upgradeThreshold = t;
                            break;
                        }
                    }
                    if (upgradeThreshold != 0) {
                        textConsumer.accept(Text.literal(""));
                        textConsumer.accept(Text.translatable("ability.skyblock." + this.name + "." + i, "§8" + FormattingUtil.commaSeparateInt(upgradeThreshold)));
                    }
                } else {
                    textConsumer.accept(Text.translatable("ability.skyblock." + this.name + "." + i));
                }
            }
        }
    }
}
