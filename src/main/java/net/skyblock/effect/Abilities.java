package net.skyblock.effect;

import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.skyblock.Skyblock;
import net.skyblock.effect.abilities.BonusSpeedAbility;
import net.skyblock.effect.abilities.FarmerAuraAbility;

import java.util.UUID;

public class Abilities {
    public static StatusEffect BONUS_SPEED_EFFECT = Registry.register(Registries.STATUS_EFFECT, new Identifier(Skyblock.MOD_ID, "bonus_speed"),
            new ModStatusEffect(StatusEffectCategory.NEUTRAL, 0xFFFFFF)
                    .addAttributeModifier(EntityAttributes.GENERIC_MOVEMENT_SPEED, UUID.randomUUID().toString(), 0.2f, EntityAttributeModifier.Operation.MULTIPLY_BASE));
    public static final Ability BONUS_SPEED = new BonusSpeedAbility("bonus_speed", BONUS_SPEED_EFFECT);
    public static StatusEffect FARMER_AURA_EFFECT = Registry.register(Registries.STATUS_EFFECT, new Identifier(Skyblock.MOD_ID, "farmer_aura"),
            new ModStatusEffect(StatusEffectCategory.NEUTRAL, 0xFFFFFF));
    public static final Ability FARMER_AURA = new FarmerAuraAbility("farmer_aura", FARMER_AURA_EFFECT);

    public static void registerAbilities() {
        Skyblock.LOGGER.info("Registering Abilities for " + Skyblock.MOD_ID);
    }
}
