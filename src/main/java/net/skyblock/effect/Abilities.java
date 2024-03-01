package net.skyblock.effect;

import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.skyblock.Skyblock;

import java.util.UUID;

public class Abilities {
    public static StatusEffect BONUS_SPEED_EFFECT = Registry.register(Registries.STATUS_EFFECT, new Identifier(Skyblock.MOD_ID, "bonus_speed"),
            new ModStatusEffect(StatusEffectCategory.NEUTRAL, 0xFFFFFF)
                    .addAttributeModifier(EntityAttributes.GENERIC_MOVEMENT_SPEED, "dc330056-63af-463d-8caf-a50f800c60b7", 0.05f, EntityAttributeModifier.Operation.MULTIPLY_BASE));
    public static StatusEffect FARMER_AURA_EFFECT = Registry.register(Registries.STATUS_EFFECT, new Identifier(Skyblock.MOD_ID, "farmer_aura"),
            new ModStatusEffect(StatusEffectCategory.NEUTRAL, 0xFFFFFF));
    public static StatusEffect NIGHT_AFFINITY_ABILITY = Registry.register(Registries.STATUS_EFFECT, new Identifier(Skyblock.MOD_ID, "night_affinity"),
            new ModStatusEffect(StatusEffectCategory.NEUTRAL, 0xFFFFFF))
            .addAttributeModifier(EntityAttributes.GENERIC_MAX_HEALTH, "f1ad50f5-34ac-4494-979d-29c9c85b6903", 11, EntityAttributeModifier.Operation.ADDITION)
            .addAttributeModifier(EntityAttributes.GENERIC_ARMOR, "f1cf58ff-64c2-462c-be50-12617172f87d", 3, EntityAttributeModifier.Operation.ADDITION);

    public static void registerAbilities() {
        Skyblock.LOGGER.info("Registering Abilities for " + Skyblock.MOD_ID);
    }
}
