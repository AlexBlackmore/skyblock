package net.skyblock.ability;

import net.minecraft.block.BlockState;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Formatting;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.function.Consumer;

public abstract class Ability {
    public String name;
    public final int loreLines;
    private boolean showName = true;
    private boolean hasCost = false;
    private boolean isActive = false;
    private boolean hasCooldown = false;
    private boolean hasMax = false;

    public Ability(String name, int loreLines) {
        this.name = name;
        this.loreLines = loreLines;
    }

    public boolean isHidden() {
        return (!this.showName && !this.hasCost && !hasCooldown && !hasMax && this.loreLines == 0);
    }

    public Ability setShowName(boolean showName) {
        this.showName = showName;
        return this;
    }
    public Ability setHasCost(boolean hasCost) {
        this.hasCost = hasCost;
        return this;
    }
    public Ability setIsActive(boolean isActive) {
        this.isActive = isActive;
        return this;
    }
    public Ability setHasCooldown(boolean hasCooldown) {
        this.hasCooldown = hasCooldown;
        return this;
    }
    public Ability setHasMax(boolean hasMax) {
        this.hasMax = hasMax;
        return this;
    }

    public boolean postMine(ItemStack stack, World world, BlockState state, BlockPos pos, LivingEntity miner) {return false;}

    public ActionResult useOnBlock(ItemUsageContext context) {return ActionResult.PASS;}

    public void appendTooltip(ItemStack stack, Consumer<Text> textConsumer) {
        if (isHidden()) {
            return;
        }
        textConsumer.accept(Text.literal(""));
        if (this.showName) {
            if (this.isActive) {
                textConsumer.accept(Text.translatable("lore.skyblock.ability", Text.translatable("ability.skyblock." + this.name).formatted(Formatting.GOLD), Text.translatable("lore.skyblock.ability.right_click")));
            } else {
                textConsumer.accept(Text.translatable("lore.skyblock.ability", Text.translatable("ability.skyblock." + this.name).formatted(Formatting.GOLD), ""));
            }
        }
        for (int i=0 ; i<this.loreLines ; i++) {
            textConsumer.accept(Text.translatable("ability.skyblock." + name + "." + i));
        }
        if (this.hasMax) {
            textConsumer.accept(Text.translatable("lore.skyblock.ability.max", Text.translatable("ability.skyblock." + name + ".max")));
        }
        if (this.hasCost) {
            textConsumer.accept(Text.translatable("lore.skyblock.ability.cost", Text.translatable("ability.skyblock." + name + ".cost")));
        }
        if (this.hasCooldown) {
            textConsumer.accept(Text.translatable("lore.skyblock.ability.cooldown", Text.translatable("ability.skyblock." + name + ".cooldown")));
        }
    }

    public float getMiningSpeed(ItemStack stack, BlockState state) {
        return 0.0f;
    }
}
