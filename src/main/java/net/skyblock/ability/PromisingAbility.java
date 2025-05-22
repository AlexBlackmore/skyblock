package net.skyblock.ability;

import net.minecraft.block.BlockState;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.ToolComponent;
import net.minecraft.entity.EquipmentSlot;
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
        super("promising", 0);
        this.levels = new int[]{50, 250, 750, 1750, 3750};
        this.setShowName(false);
    }
    public PromisingAbility(int[] levels) {
        super("promising", 0);
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

        ToolComponent toolComponent = stack.get(DataComponentTypes.TOOL);
        if (toolComponent != null) {
            if (!world.isClient && state.getHardness(world, pos) != 0.0F && toolComponent.damagePerBlock() > 0) {
                stack.damage(toolComponent.damagePerBlock(), miner, EquipmentSlot.MAINHAND);
            }
        }
        return false;
    }

    @Override
    public void appendTooltip(ItemStack stack, Consumer<Text> textConsumer) {
        @Nullable Integer blocksBroken = stack.get(ModDataComponentTypes.BLOCKS_BROKEN);
        if (blocksBroken != null) {
            int nextLevel = 1;
            for (int i : this.levels) {
                if (blocksBroken>i) nextLevel++;
            }

            textConsumer.accept(Text.translatable("lore.skyblock.promising_tool.0", Text.translatable("enchantment.minecraft.efficiency").formatted(Formatting.BLUE), Text.translatable("enchantment.level." + nextLevel).formatted(Formatting.BLUE)));
            textConsumer.accept(Text.translatable("lore.skyblock.promising_tool.1", "§a" + FormattingUtil.commaSeparateInt(levels[nextLevel-1])));
            textConsumer.accept(Text.literal(""));
            textConsumer.accept(Text.translatable("lore.skyblock.promising_tool.2", "§a" + FormattingUtil.commaSeparateInt(blocksBroken)));
        }
    }
}
