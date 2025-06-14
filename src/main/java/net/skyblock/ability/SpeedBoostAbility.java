package net.skyblock.ability;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.server.command.CommandManager;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.world.World;
import net.skyblock.effect.ModEffects;
import org.jetbrains.annotations.Nullable;

import java.util.function.Consumer;

public class SpeedBoostAbility extends Ability {
    private final float boost = 1.0f;

    public SpeedBoostAbility() {
        super("speed_boost", 1);
        setCost(50);
        setActive(600, ModEffects.SPEED_BOOST);
        setCooldown(100, ModEffects.SPEED_BOOST_COOLDOWN);
    }

    @Override
    public boolean canUse(World world, PlayerEntity user, Hand hand) {
        if (world instanceof ServerWorld server && !user.hasStatusEffect(getActiveEffect()) && !user.hasStatusEffect(getCooldownEffect())) {
            @Nullable CommandManager commandManager = server.getServer().getCommandManager();
            if (commandManager != null) {
                commandManager.executeWithPrefix(user.getCommandSource(server).withLevel(4),
                        "execute if score @s mana matches " + getCost() + ".. run tag @s add SUCCESS");
                if (user.getCommandTags().contains("SUCCESS")) {
                    commandManager.executeWithPrefix(user.getCommandSource(server).withLevel(4),
                            "scoreboard players remove @s[tag=SUCCESS] mana " + getCost());
                    commandManager.executeWithPrefix(user.getCommandSource(server).withLevel(4),
                            "tag @s[tag=SUCCESS] remove SUCCESS");
                } else if (!user.isCreative()) {
                    user.sendMessage(Text.translatable("message.skyblock.not_enough_mana"), false);
                    return false;
                }
            } else {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public Object[] getTooltipArguments(int i, ItemStack stack) {
        switch(i) {
            case 0 -> {
                return new Object[]{"§9" + (int)(this.boost*100) + "%",Text.translatable("attribute.name.movement_speed").formatted(Formatting.BLUE), "§a" + getDuration()/20 + "s"};
            }
            case -2 -> {
                return new Object[]{"§3" + getCost() + " mana"};
            }
            default -> {
                return new Object[]{};
            }
        }
    }
}
