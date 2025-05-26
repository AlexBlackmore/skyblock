package net.skyblock.util;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.server.command.CommandManager;
import net.minecraft.server.world.ServerWorld;
import net.skyblock.component.ModDataComponentTypes;
import org.jetbrains.annotations.Nullable;

public class EnchantmentsUtil {

    public static void CompactEnchantment(int blocksBroken, ItemStack stack, PlayerEntity player, ServerWorld server) {
        blocksBroken++;
        stack.set(ModDataComponentTypes.COMPACT, blocksBroken);
        @Nullable CommandManager commandManager = server.getServer().getCommandManager();
        if (commandManager != null) {
            commandManager.executeWithPrefix(player.getCommandSource(server).withLevel(4),
                    "function skyblock:ability/compact_enchantment");
        }
    }
}
