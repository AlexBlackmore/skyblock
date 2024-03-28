package net.skyblock.command;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import net.minecraft.command.CommandRegistryAccess;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.command.CommandManager;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.skyblock.util.IEntityDataSaver;

import java.util.Optional;

public class WarpCommand {
    public static void register(CommandDispatcher<ServerCommandSource> serverCommandSourceCommandDispatcher,
                                CommandRegistryAccess commandRegistryAccess,
                                CommandManager.RegistrationEnvironment registrationEnvironment) {
        serverCommandSourceCommandDispatcher.register(CommandManager.literal("warp")
                .then(CommandManager.literal("spawn").executes(WarpCommand::spawn)));
        serverCommandSourceCommandDispatcher.register(CommandManager.literal("warp")
                .then(CommandManager.literal("home").executes(WarpCommand::home)));
    }

    private static int spawn(CommandContext<ServerCommandSource> context) throws CommandSyntaxException {
        PlayerEntity player = context.getSource().getPlayer();
        if (player != null) {
            BlockPos spawn = context.getSource().getWorld().getSpawnPos();

            context.getSource().getPlayer().requestTeleport(spawn.getX()+0.5, spawn.getY(), spawn.getZ()+0.5);
            context.getSource().sendFeedback(() -> Text.literal("Warping you to spawn..."), false);
            return 1;
        }
        return -1;
    }

    private static int home(CommandContext<ServerCommandSource> context) throws CommandSyntaxException {
        PlayerEntity player = context.getSource().getPlayer();
        if (player != null) {
            Optional<Vec3d> home = PlayerEntity.findRespawnPosition(context.getSource().getWorld(), player.getBlockPos(), player.getYaw(), false, player.isAlive());

            if(home.isPresent()) {
                Vec3d teleport = home.get();
                context.getSource().getPlayer().requestTeleport(teleport.getX(), teleport.getY(), teleport.getZ());
                context.getSource().sendFeedback(() -> Text.literal("Warping you to your home..."), false);
                return 1;
            } else {
                context.getSource().sendFeedback(() -> Text.literal("No spawn point has been set!"), false);
                return -1;
            }
        }
        return -1;
    }
}
