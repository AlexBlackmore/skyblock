package net.skyblock.ability;

import net.minecraft.block.BlockState;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.function.Consumer;

public abstract class Ability {
    public String name;
    public final int loreLines;
    private boolean showName = true;

    private int cost = 0;

    private boolean isActive = false;
    private int duration = 0;
    private RegistryEntry<StatusEffect> activeEffect = StatusEffects.HUNGER;

    private boolean hasMax = false;

    private int cooldown = 0;
    private RegistryEntry<StatusEffect> cooldownEffect = StatusEffects.NAUSEA;


    public Ability(String name, int loreLines) {
        this.name = name;
        this.loreLines = loreLines;
    }

    public boolean isHidden() {
        return (!this.showName && this.cost==0 && cooldown==0 && !hasMax && this.loreLines == 0);
    }

    public Ability setShowName(boolean showName) {
        this.showName = showName;
        return this;
    }
    public Ability setCost(int cost) {
        this.cost = cost;
        return this;
    }
    public int getCost() {
        return this.cost;
    }

    public Ability setActive() {
        this.isActive = true;
        return this;
    }
    public Ability setActive(int duration, RegistryEntry<StatusEffect> effect) {
        this.duration = duration;
        this.activeEffect = effect;
        this.isActive = true;
        return this;
    }
    public RegistryEntry<StatusEffect> getActiveEffect() {
        return this.activeEffect;
    }
    public int getDuration() {
        return this.duration;
    }
    public StatusEffectInstance getActiveEffectInstance() {
        return new StatusEffectInstance(activeEffect, duration);
    }

    //Sets only cooldown duration, will keep default cooldown effect (nausea)
    public Ability setCooldown(int cooldown) {
        this.cooldown = cooldown;
        return this;
    }
    public Ability setCooldown(int cooldown, RegistryEntry<StatusEffect> effect) {
        this.cooldown = cooldown;
        this.cooldownEffect = effect;
        return this;
    }
    public RegistryEntry<StatusEffect> getCooldownEffect() {
        return this.cooldownEffect;
    }
    public int getCooldown() {
        return this.cooldown;
    }
    public StatusEffectInstance getCooldownEffectInstance() {
        return new StatusEffectInstance(cooldownEffect, duration, 0, true, false, false, new StatusEffectInstance(cooldownEffect, duration+cooldown));
    }

    public Ability setHasMax(boolean hasMax) {
        this.hasMax = hasMax;
        return this;
    }

    public boolean canUse(World world, PlayerEntity user, Hand hand) {return true;}

    public ActionResult use(World world, PlayerEntity user, Hand hand) {
        if (isActive && canUse(world, user, hand)) {
            if (duration > 0) {
                user.addStatusEffect(getActiveEffectInstance());
            }
            if (cooldown > 0) {
                user.addStatusEffect(getCooldownEffectInstance());
            }
        }

        return ActionResult.PASS;
    }

    public boolean postMine(ItemStack stack, World world, BlockState state, BlockPos pos, LivingEntity miner) {return false;}

    public ActionResult useOnBlock(ItemUsageContext context) {return ActionResult.PASS;}

    public Object[] getTooltipArguments(int i, ItemStack stack) {
        return new Object[]{};
    }

    public void appendTooltip(ItemStack stack, Consumer<Text> textConsumer) {
        if (!isHidden()) {
            if (this.showName) {
                if (this.isActive) {
                    textConsumer.accept(Text.translatable("lore.skyblock.ability", Text.translatable("ability.skyblock." + this.name).formatted(Formatting.GOLD), Text.translatable("lore.skyblock.ability.right_click")));
                } else {
                    textConsumer.accept(Text.translatable("lore.skyblock.ability", Text.translatable("ability.skyblock." + this.name).formatted(Formatting.GOLD), ""));
                }
            }
            for (int i=0 ; i<this.loreLines ; i++) {
                textConsumer.accept(Text.translatable("ability.skyblock." + name + "." + i, getTooltipArguments(i, stack)));
            }
            if (this.hasMax) {
                textConsumer.accept(Text.translatable("lore.skyblock.ability.max", getTooltipArguments(-1, stack)));
            }
            if (this.cost != 0) {
                textConsumer.accept(Text.translatable("lore.skyblock.ability.cost", getTooltipArguments(-2, stack)));
            }
            if (this.cooldown >= 20) {
                textConsumer.accept(Text.translatable("lore.skyblock.ability.cooldown", "§a" + (this.cooldown/20) + "s"));
            }
        }
    }

    public float getMiningSpeed(ItemStack stack, BlockState state) {
        return 0.0f;
    }
}
