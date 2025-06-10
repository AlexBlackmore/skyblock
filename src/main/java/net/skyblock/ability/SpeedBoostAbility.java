package net.skyblock.ability;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.server.command.CommandManager;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
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
    public ActionResult use(World world, PlayerEntity user, Hand hand) {
        if (world instanceof ServerWorld server && !user.hasStatusEffect(getActiveEffect()) && !user.hasStatusEffect(getCooldownEffect())) {
            @Nullable CommandManager commandManager = server.getServer().getCommandManager();
            if (commandManager != null) {
                commandManager.executeWithPrefix(user.getCommandSource(server).withLevel(4),
                        "execute if score @s mana matches " + getCost() + ".. run tag @s add SUCCESS");
                if (user.getCommandTags().contains("SUCCESS") || user.isCreative()) {
                    commandManager.executeWithPrefix(user.getCommandSource(server).withLevel(4),
                            "scoreboard players remove @s[tag=SUCCESS] mana " + getCost());
                    commandManager.executeWithPrefix(user.getCommandSource(server).withLevel(4),
                            "tag @s[tag=SUCCESS] remove SUCCESS");
                } else {
                    user.sendMessage(Text.translatable("message.skyblock.not_enough_mana"), false);
                    return ActionResult.PASS;
                }
            } else {
                return ActionResult.PASS;
            }

            user.addStatusEffect(new StatusEffectInstance(getActiveEffect(), getDuration()));
            user.addStatusEffect(new StatusEffectInstance(getCooldownEffect(), getDuration() + getCooldown()));
        }

        return super.use(world, user, hand);
    }

    @Override
    public void appendTooltip(ItemStack stack, Consumer<Text> textConsumer) {
        textConsumer.accept(Text.translatable("lore.skyblock.ability", Text.translatable("ability.skyblock." + this.name).formatted(Formatting.GOLD), Text.translatable("lore.skyblock.ability.right_click")));
        for (int i=0 ; i<this.loreLines ; i++) {
            if (i == 0) {
                textConsumer.accept(Text.translatable("ability.skyblock." + name + "." + i, "§8" + (int)(this.boost*100) + "%",Text.translatable("attribute.name.movement_speed").formatted(Formatting.BLUE), "§a" + getDuration()/20 + "s"));
            } else {
                textConsumer.accept(Text.translatable("ability.skyblock." + name + "." + i));
            }
        }
        textConsumer.accept(Text.translatable("lore.skyblock.ability.cost", "§3" + getCost() + " mana"));
        textConsumer.accept(Text.translatable("lore.skyblock.ability.cooldown", "§a" + (getCooldown()/20) + "s"));
    }
}
