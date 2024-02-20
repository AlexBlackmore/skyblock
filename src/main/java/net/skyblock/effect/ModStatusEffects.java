package net.skyblock.effect;

import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.skyblock.Skyblock;
import net.skyblock.attribute.ModEntityAttributes;
import net.skyblock.effect.custom.*;

public class ModStatusEffects {
    public static StatusEffect RABBIT = Registry.register(Registries.STATUS_EFFECT, new Identifier(Skyblock.MOD_ID, "rabbit"),
            new ModStatusEffect(StatusEffectCategory.BENEFICIAL, 0x55FF55)
                    .addAttributeModifier(EntityAttributes.GENERIC_MOVEMENT_SPEED, "6E88DD6B-AA4B-4721-8CD2-31CFCA40D078", 0.1f, EntityAttributeModifier.Operation.MULTIPLY_BASE));
    public static StatusEffect BURN = Registry.register(Registries.STATUS_EFFECT, new Identifier(Skyblock.MOD_ID, "burning"),
            new ModStatusEffect(StatusEffectCategory.NEUTRAL, 0xFFAA00));
    public static StatusEffect BURNING = Registry.register(Registries.STATUS_EFFECT, new Identifier(Skyblock.MOD_ID, "burned"),
            new BurnedStatusEffect(StatusEffectCategory.HARMFUL, 0x000000));
    public static StatusEffect KNOCKBACK = Registry.register(Registries.STATUS_EFFECT, new Identifier(Skyblock.MOD_ID, "knockback"),
            new ModStatusEffect(StatusEffectCategory.NEUTRAL, 0xAA0000));
    public static StatusEffect VENOMOUS = Registry.register(Registries.STATUS_EFFECT, new Identifier(Skyblock.MOD_ID, "venomous"),
            new ModStatusEffect(StatusEffectCategory.NEUTRAL, 0xAA00AA));
    public static StatusEffect VENOMED = Registry.register(Registries.STATUS_EFFECT, new Identifier(Skyblock.MOD_ID, "venomed"),
            new VenomedStatusEffect(StatusEffectCategory.HARMFUL, 0xAA00AA)
                    .addAttributeModifier(EntityAttributes.GENERIC_MOVEMENT_SPEED, "54655443-BA8D-4296-940B-1A5505C454A9", -0.05f, EntityAttributeModifier.Operation.MULTIPLY_BASE));
    public static StatusEffect STUN = Registry.register(Registries.STATUS_EFFECT, new Identifier(Skyblock.MOD_ID, "stun"),
            new ModStatusEffect(StatusEffectCategory.NEUTRAL, 0x555555));
    public static StatusEffect STUNNED = Registry.register(Registries.STATUS_EFFECT, new Identifier(Skyblock.MOD_ID, "stunned"),
            new ModStatusEffect(StatusEffectCategory.HARMFUL, 0x555555)
                    .addAttributeModifier(EntityAttributes.GENERIC_MOVEMENT_SPEED, "9FB05793-0D69-4CD7-969B-A98F6DE49EA9", -1.0f, EntityAttributeModifier.Operation.MULTIPLY_BASE));
    public static StatusEffect ARCHERY = Registry.register(Registries.STATUS_EFFECT, new Identifier(Skyblock.MOD_ID, "archery"),
            new ModStatusEffect(StatusEffectCategory.BENEFICIAL, 0x55FFFF));
    public static StatusEffect ADRENALINE = Registry.register(Registries.STATUS_EFFECT, new Identifier(Skyblock.MOD_ID, "adrenaline"),
            new AdrenalineStatusEffect(StatusEffectCategory.BENEFICIAL, 0xFF5555)
                    .addAttributeModifier(EntityAttributes.GENERIC_MOVEMENT_SPEED, "242C2599-0901-449F-A2B1-A4F4FDFA2328", 0.05f, EntityAttributeModifier.Operation.MULTIPLY_BASE));
    public static StatusEffect CRITICAL = Registry.register(Registries.STATUS_EFFECT, new Identifier(Skyblock.MOD_ID, "critical"),
            new ModStatusEffect(StatusEffectCategory.BENEFICIAL, 0xAA0000)
                    .addAttributeModifier(ModEntityAttributes.CRIT_CHANCE, "B9BC12AF-CF13-421B-82DB-E419387B94E5", 0.05f, EntityAttributeModifier.Operation.MULTIPLY_BASE)
                    .addAttributeModifier(ModEntityAttributes.CRIT_DAMAGE, "88F553D7-77A5-404F-8BF0-9ACEBEA0870F", 0.10f, EntityAttributeModifier.Operation.MULTIPLY_BASE));
    public static StatusEffect DODGE = Registry.register(Registries.STATUS_EFFECT, new Identifier(Skyblock.MOD_ID, "dodge"),
            new ModStatusEffect(StatusEffectCategory.NEUTRAL, 0x5555FF));
    public static StatusEffect AGILITY = Registry.register(Registries.STATUS_EFFECT, new Identifier(Skyblock.MOD_ID, "agility"),
            new ModStatusEffect(StatusEffectCategory.BENEFICIAL, 0xAA00AA)
                    .addAttributeModifier(EntityAttributes.GENERIC_MOVEMENT_SPEED, "706D5F78-D90B-4061-88C6-2685E407806E", 0.1f, EntityAttributeModifier.Operation.MULTIPLY_BASE));
    public static StatusEffect WOUNDED = Registry.register(Registries.STATUS_EFFECT, new Identifier(Skyblock.MOD_ID, "wounded"),
            new ModStatusEffect(StatusEffectCategory.HARMFUL, 0xAA0000)
                    .addAttributeModifier(ModEntityAttributes.VITALITY, "C5BE902E-6C83-4527-87C2-6C4C10B56577", -0.25f, EntityAttributeModifier.Operation.MULTIPLY_BASE));
    public static StatusEffect EXPERIENCE = Registry.register(Registries.STATUS_EFFECT, new Identifier(Skyblock.MOD_ID, "experience"),
            new ModStatusEffect(StatusEffectCategory.NEUTRAL, 0x5555FF));
    public static StatusEffect MANA = Registry.register(Registries.STATUS_EFFECT, new Identifier(Skyblock.MOD_ID, "mana"),
            new ModStatusEffect(StatusEffectCategory.BENEFICIAL, 0x5555FF));
    public static StatusEffect STAMINA = Registry.register(Registries.STATUS_EFFECT, new Identifier(Skyblock.MOD_ID, "stamina"),
            new StaminaStatusEffect(StatusEffectCategory.BENEFICIAL, 0x55FF55));
    public static StatusEffect TRUE_RESISTANCE = Registry.register(Registries.STATUS_EFFECT, new Identifier(Skyblock.MOD_ID, "true_resistance"),
            new ModStatusEffect(StatusEffectCategory.BENEFICIAL, 0xFFFFFF)
                    .addAttributeModifier(EntityAttributes.GENERIC_ARMOR_TOUGHNESS, "467EA3BB-B76A-4F82-A972-68BED2C36A44", 1.0f, EntityAttributeModifier.Operation.ADDITION));
    public static StatusEffect PET_LUCK = Registry.register(Registries.STATUS_EFFECT, new Identifier(Skyblock.MOD_ID, "pet_luck"),
            new ModStatusEffect(StatusEffectCategory.BENEFICIAL, 0x55FFFF));
    public static StatusEffect SPELUNKER = Registry.register(Registries.STATUS_EFFECT, new Identifier(Skyblock.MOD_ID, "spelunker"),
            new ModStatusEffect(StatusEffectCategory.BENEFICIAL, 0x55FFFF)
                    .addAttributeModifier(ModEntityAttributes.MINING_FORTUNE, "EF3A693C-C11E-4DF2-9EBB-83E8C4BEB6C0", 0.05f, EntityAttributeModifier.Operation.ADDITION));
    public static StatusEffect SPIRIT = Registry.register(Registries.STATUS_EFFECT, new Identifier(Skyblock.MOD_ID, "spirit"),
            new ModStatusEffect(StatusEffectCategory.BENEFICIAL, 0x55FFFF)
                    .addAttributeModifier(EntityAttributes.GENERIC_MOVEMENT_SPEED, "73D3D8ED-4796-4E52-AB60-5C73589B2AF9", 0.1f, EntityAttributeModifier.Operation.MULTIPLY_BASE)
                    .addAttributeModifier(ModEntityAttributes.CRIT_DAMAGE, "9899E360-01C2-49A4-A23F-D846F8CB1469", 0.1f, EntityAttributeModifier.Operation.MULTIPLY_BASE));
    public static StatusEffect KINGS_SCENT = Registry.register(Registries.STATUS_EFFECT, new Identifier(Skyblock.MOD_ID, "kings_scent"),
            new ModStatusEffect(StatusEffectCategory.NEUTRAL, 0x00AA00));
    public static StatusEffect WISPS_ICE_FLAVORED_WATER = Registry.register(Registries.STATUS_EFFECT, new Identifier(Skyblock.MOD_ID, "wisps_ice_flavored_water"),
            new ModStatusEffect(StatusEffectCategory.BENEFICIAL, 0x55FFFF)
                    .addAttributeModifier(ModEntityAttributes.VITALITY, "A81D02CF-01E0-40F9-BE6C-624A7253E527", 0.1f, EntityAttributeModifier.Operation.MULTIPLY_BASE)
                    .addAttributeModifier(EntityAttributes.GENERIC_ARMOR_TOUGHNESS, "4F1EBC93-32C7-4E0A-8EE2-8068D8CF7E48", 5.0f, EntityAttributeModifier.Operation.ADDITION));
    public static StatusEffect COLDFUSION = Registry.register(Registries.STATUS_EFFECT, new Identifier(Skyblock.MOD_ID, "coldfusion"),
            new ModStatusEffect(StatusEffectCategory.BENEFICIAL, 0x55FFFF)
                    .addAttributeModifier(EntityAttributes.GENERIC_ATTACK_DAMAGE, "DE682757-BC2A-475B-B5E7-6EDC2DC18D50", 15.0f, EntityAttributeModifier.Operation.ADDITION)
                    .addAttributeModifier(ModEntityAttributes.CRIT_DAMAGE, "4DEEDD9E-FF2A-45AE-BB2C-ABC3EDF69B65", 0.55f, EntityAttributeModifier.Operation.MULTIPLY_BASE));
    public static StatusEffect MUSHED_GLOWY_TONIC = Registry.register(Registries.STATUS_EFFECT, new Identifier(Skyblock.MOD_ID, "mushed_glowy_tonic"),
            new ModStatusEffect(StatusEffectCategory.BENEFICIAL, 0x00AA00)
                    .addAttributeModifier(ModEntityAttributes.FISHING_SPEED, "C8251C92-E935-440B-8360-98C0059F0D53", 0.30f, EntityAttributeModifier.Operation.MULTIPLY_BASE));
    public static StatusEffect FLYING = Registry.register(Registries.STATUS_EFFECT, new Identifier(Skyblock.MOD_ID, "flying"),
            new FlyingStatusEffect(StatusEffectCategory.NEUTRAL, 0xFFFFFF));
    public static StatusEffect LETHALITY = Registry.register(Registries.STATUS_EFFECT, new Identifier(Skyblock.MOD_ID, "lethality"),
            new ModStatusEffect(StatusEffectCategory.HARMFUL, 0xFFFF)
                    .addAttributeModifier(EntityAttributes.GENERIC_ARMOR, "29DB4744-3010-49CA-AF24-8BDE625C7877", -0.012f, EntityAttributeModifier.Operation.MULTIPLY_TOTAL));

    public static void registerStatusEffects() {
        Skyblock.LOGGER.info("Registering Mod Status Effects for " + Skyblock.MOD_ID);
    }
}
