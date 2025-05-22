package net.skyblock.mixin;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;
import net.skyblock.attribute.ModEntityAttributes;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;


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
                .add(EntityAttributes.ATTACK_DAMAGE, 1.0)
                .add(EntityAttributes.MOVEMENT_SPEED, 0.1)
                .add(EntityAttributes.ATTACK_SPEED)
                .add(EntityAttributes.LUCK)
                .add(EntityAttributes.BLOCK_INTERACTION_RANGE, 4.5)
                .add(EntityAttributes.ENTITY_INTERACTION_RANGE, 3.0)
                .add(EntityAttributes.BLOCK_BREAK_SPEED)
                .add(EntityAttributes.SUBMERGED_MINING_SPEED)
                .add(EntityAttributes.SNEAKING_SPEED)
                .add(EntityAttributes.MINING_EFFICIENCY)
                .add(EntityAttributes.SWEEPING_DAMAGE_RATIO)
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
                .add(ModEntityAttributes.PRISTINE)
                .add(ModEntityAttributes.FORAGING_FORTUNE)
                .add(ModEntityAttributes.FARMING_FORTUNE)
                .add(ModEntityAttributes.WHEAT_FORTUNE)
                .add(ModEntityAttributes.POTATO_FORTUNE)
                .add(ModEntityAttributes.CARROT_FORTUNE)
                .add(ModEntityAttributes.PUMPKIN_FORTUNE)
                .add(ModEntityAttributes.MELON_FORTUNE)
                .add(ModEntityAttributes.CACTUS_FORTUNE)
                .add(ModEntityAttributes.NETHER_WART_FORTUNE)
                .add(ModEntityAttributes.COCOA_BEANS_FORTUNE)
                .add(ModEntityAttributes.MUSHROOM_FORTUNE)
                .add(ModEntityAttributes.SUGAR_CANE_FORTUNE)
                .add(ModEntityAttributes.MINING_FORTUNE)
                .add(ModEntityAttributes.ORE_FORTUNE)
                .add(ModEntityAttributes.BLOCK_FORTUNE)
                .add(ModEntityAttributes.DWARVEN_METAL_FORTUNE)
                .add(ModEntityAttributes.GEMSTONE_FORTUNE);
    }
}
