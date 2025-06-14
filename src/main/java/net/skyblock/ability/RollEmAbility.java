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

public class RollEmAbility extends Ability {
    private final Block block;
    private final String id;
    public RollEmAbility(Block block, String id) {
        super("roll_em", 4);
        this.block = block;
        this.id = id;
    }

    @Override
    public boolean postMine(ItemStack stack, World world, BlockState state, BlockPos pos, LivingEntity miner) {
        if (state.getBlock() == this.block && miner instanceof PlayerEntity player && world instanceof ServerWorld server) {
            @Nullable CommandManager commandManager = server.getServer().getCommandManager();
            if (commandManager != null) {
                commandManager.executeWithPrefix(player.getCommandSource(server).withLevel(4),
                        "execute if predicate skyblock:drops/roll_em/" + this.id + "/uncommon run advancement grant @s only skyblock:commands/drops/roll_em/" + this.id + "/uncommon");
                commandManager.executeWithPrefix(player.getCommandSource(server).withLevel(4),
                        "execute if predicate skyblock:drops/roll_em/" + this.id + "/rare run advancement grant @s only skyblock:commands/drops/roll_em/" + this.id + "/rare");
                commandManager.executeWithPrefix(player.getCommandSource(server).withLevel(4),
                        "execute if predicate skyblock:drops/roll_em/" + this.id + "/crazy_rare run advancement grant @s only skyblock:commands/drops/roll_em/" + this.id + "/crazy_rare");
                commandManager.executeWithPrefix(player.getCommandSource(server).withLevel(4),
                        "execute if predicate skyblock:drops/roll_em/" + this.id + "/pray_to_rngesus run advancement grant @s only skyblock:commands/drops/roll_em/" + this.id + "/pray_to_rngesus");
            }
        }
        return super.postMine(stack, world, state, pos, miner);
    }

    @Override
    public Object[] getTooltipArguments(int i, ItemStack stack) {
        switch(i) {
            case 0, 3 -> {
                return new Object[]{this.block.getName()};
            }
            default -> {
                return new Object[]{};
            }
        }
    }
}
