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
            if (miner instanceof PlayerEntity player && world instanceof ServerWorld server) {
                @Nullable CommandManager commandManager = server.getServer().getCommandManager();
                if (commandManager != null) {
                    commandManager.executeWithPrefix(player.getCommandSource(server).withLevel(4),
                            "function skyblock:ability/stored_potential");
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
            textConsumer.accept(Text.translatable("lore.skyblock.ability", Text.translatable("ability.skyblock.stored_potential").formatted(Formatting.GOLD), ""));
            textConsumer.accept(Text.translatable("ability.skyblock.stored_potential.0", "§9+10%", Text.translatable("attribute.name.block_break_speed").formatted(Formatting.BLUE)));
            textConsumer.accept(Text.translatable("ability.skyblock.stored_potential.1"));
            textConsumer.accept(Text.translatable("lore.skyblock.ability.max", Text.translatable("ability.skyblock.stored_potential.max", "§8+250%", Text.translatable("attribute.name.block_break_speed")).formatted(Formatting.DARK_GRAY)));
            textConsumer.accept(Text.literal(""));
            textConsumer.accept(Text.translatable("lore.skyblock.promising_tool.2", "§a" + FormattingUtil.commaSeparateInt(blocksBroken)));
        }
    }
}
