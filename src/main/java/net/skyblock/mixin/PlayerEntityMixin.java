package net.skyblock.mixin;

import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;
import net.skyblock.attribute.ModEntityAttributes;
import net.skyblock.effect.ModStatusEffects;
import net.skyblock.enchantment.ModEnchantments;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

import java.util.Objects;

@Mixin(PlayerEntity.class)
public abstract class PlayerEntityMixin extends LivingEntity {

    protected PlayerEntityMixin(EntityType<? extends LivingEntity> entityType, World world) {
        super(entityType, world);
    }

    /**
     * @author unreal
     * @reason Added ModEntity Attributes
     */
    @Overwrite
    public static DefaultAttributeContainer.Builder createPlayerAttributes() {
        ModEntityAttributes.registerEntityAttributes();

        return LivingEntity.createLivingAttributes()
                .add(EntityAttributes.GENERIC_ATTACK_DAMAGE, 1.0)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.1f)
                .add(EntityAttributes.GENERIC_ATTACK_SPEED)
                .add(EntityAttributes.GENERIC_LUCK)
                .add(ModEntityAttributes.INTELLIGENCE)
                .add(ModEntityAttributes.CRIT_DAMAGE)
                .add(ModEntityAttributes.CRIT_CHANCE)
                .add(ModEntityAttributes.FEROCITY)
                .add(ModEntityAttributes.ABILITY_DAMAGE)
                .add(ModEntityAttributes.HEALTH_REGEN)
                .add(ModEntityAttributes.VITALITY)
                .add(ModEntityAttributes.SEA_CREATURE_CHANCE)
                .add(ModEntityAttributes.PET_LUCK)
                .add(ModEntityAttributes.FISHING_SPEED)
                .add(ModEntityAttributes.COMBAT_WISDOM)
                .add(ModEntityAttributes.MINING_WISDOM)
                .add(ModEntityAttributes.FARMING_WISDOM)
                .add(ModEntityAttributes.FORAGING_WISDOM)
                .add(ModEntityAttributes.ENCHANTING_WISDOM)
                .add(ModEntityAttributes.ALCHEMY_WISDOM)
                .add(ModEntityAttributes.FISHING_WISDOM)
                .add(ModEntityAttributes.MINING_SPEED)
                .add(ModEntityAttributes.PRISTINE)
                .add(ModEntityAttributes.FORAGING_FORTUNE)
                .add(ModEntityAttributes.FARMING_FORTUNE)
                .add(ModEntityAttributes.MINING_FORTUNE);
    }

    /**
     * @author unreal
     * @reason Added Divine Gift enchantment
     */
    @Overwrite
    public float getLuck() {
        float luck = (float)this.getAttributeValue(EntityAttributes.GENERIC_LUCK);
        luck += EnchantmentHelper.getEquipmentLevel(ModEnchantments.DIVINE_GIFT, this) * 2;
        return luck;
    }

    @Override
    public void heal(float amount) {
        float vitality = (float)this.getAttributeValue(ModEntityAttributes.VITALITY);
        super.heal(amount * vitality);
    }

    @ModifyVariable(method = "addExperience(I)V", at = @At("HEAD"), argsOnly = true)
    private int addExperience(int experience) {
        float multiplier = 1.0f;
        if (this.hasStatusEffect(ModStatusEffects.EXPERIENCE)) {
            int amplifier = Objects.requireNonNull(this.getStatusEffect(ModStatusEffects.EXPERIENCE)).getAmplifier();
            multiplier += (amplifier+1)*0.05;
        }

        return (int)(experience * multiplier);
    }
}
