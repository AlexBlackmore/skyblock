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
            new ModStatusEffect(StatusEffectCategory.HARMFUL, 0xFFFFFF)
                    .addAttributeModifier(EntityAttributes.GENERIC_ARMOR, "29DB4744-3010-49CA-AF24-8BDE625C7877", -0.012f, EntityAttributeModifier.Operation.MULTIPLY_TOTAL));
    public static StatusEffect CENTURY_CAKE_MAX_HEALTH = Registry.register(Registries.STATUS_EFFECT, new Identifier(Skyblock.MOD_ID, "century_cake_max_health"),
            new ModStatusEffect(StatusEffectCategory.BENEFICIAL, 0xFF55FF)
                    .addAttributeModifier(EntityAttributes.GENERIC_MAX_HEALTH, "8a6c9550-15f9-4981-bad0-08cd96c753ee", 2.0f, EntityAttributeModifier.Operation.ADDITION));
    public static StatusEffect CENTURY_CAKE_STRENGTH = Registry.register(Registries.STATUS_EFFECT, new Identifier(Skyblock.MOD_ID, "century_cake_strength"),
            new ModStatusEffect(StatusEffectCategory.BENEFICIAL, 0xFF5555)
                    .addAttributeModifier(ModEntityAttributes.STRENGTH, "f4172be8-bb71-4892-846b-a2adf832e1f3", 0.02f, EntityAttributeModifier.Operation.MULTIPLY_TOTAL));
    public static StatusEffect CENTURY_CAKE_FEROCITY = Registry.register(Registries.STATUS_EFFECT, new Identifier(Skyblock.MOD_ID, "century_cake_ferocity"),
            new ModStatusEffect(StatusEffectCategory.BENEFICIAL, 0xFFAA00)
                    .addAttributeModifier(ModEntityAttributes.FEROCITY, "d3523ba4-7d64-4b01-98ae-5d6fc9515fec", 0.02f, EntityAttributeModifier.Operation.MULTIPLY_TOTAL));
    public static StatusEffect CENTURY_CAKE_MOVEMENT_SPEED = Registry.register(Registries.STATUS_EFFECT, new Identifier(Skyblock.MOD_ID, "century_cake_movement_speed"),
            new ModStatusEffect(StatusEffectCategory.BENEFICIAL, 0xFFFF55)
                    .addAttributeModifier(EntityAttributes.GENERIC_MOVEMENT_SPEED, "34a016e0-84d7-4f9e-a853-d56b2ae0e26c", 0.10f, EntityAttributeModifier.Operation.MULTIPLY_BASE));
    public static StatusEffect CENTURY_CAKE_ARMOR = Registry.register(Registries.STATUS_EFFECT, new Identifier(Skyblock.MOD_ID, "century_cake_armor"),
            new ModStatusEffect(StatusEffectCategory.BENEFICIAL, 0x55FF55)
                    .addAttributeModifier(EntityAttributes.GENERIC_ARMOR, "d480635c-7a23-4519-ae7f-0940cfe26718", 1.0f, EntityAttributeModifier.Operation.ADDITION));
    public static StatusEffect CENTURY_CAKE_INTELLIGENCE = Registry.register(Registries.STATUS_EFFECT, new Identifier(Skyblock.MOD_ID, "century_cake_intelligence"),
            new ModStatusEffect(StatusEffectCategory.BENEFICIAL, 0x55FFFF)
                    .addAttributeModifier(ModEntityAttributes.INTELLIGENCE, "4a669acf-ef3c-4f34-8723-f7437b41fe2c", 5.0f, EntityAttributeModifier.Operation.ADDITION));
    public static StatusEffect CENTURY_CAKE_SEA_CREATURE_CHANCE = Registry.register(Registries.STATUS_EFFECT, new Identifier(Skyblock.MOD_ID, "century_cake_sea_creature_chance"),
            new ModStatusEffect(StatusEffectCategory.BENEFICIAL, 0x5555FF)
                    .addAttributeModifier(ModEntityAttributes.SEA_CREATURE_CHANCE, "64b60121-b076-41ac-abc7-3470b0f770f5", 0.01f, EntityAttributeModifier.Operation.MULTIPLY_BASE));
    public static StatusEffect CENTURY_CAKE_PET_LUCK = Registry.register(Registries.STATUS_EFFECT, new Identifier(Skyblock.MOD_ID, "century_cake_pet_luck"),
            new ModStatusEffect(StatusEffectCategory.BENEFICIAL, 0xAA00AA)
                    .addAttributeModifier(ModEntityAttributes.PET_LUCK, "d593c060-1577-4c2f-afd6-19c0ee076537", 0.01f, EntityAttributeModifier.Operation.MULTIPLY_BASE));
    public static StatusEffect CENTURY_CAKE_LUCK = Registry.register(Registries.STATUS_EFFECT, new Identifier(Skyblock.MOD_ID, "century_cake_luck"),
            new ModStatusEffect(StatusEffectCategory.BENEFICIAL, 0x555555)
                    .addAttributeModifier(EntityAttributes.GENERIC_LUCK, "95a2b177-ecce-4875-8206-2e4076f66a5e", 1.0f, EntityAttributeModifier.Operation.ADDITION));
    public static StatusEffect CENTURY_CAKE_FARMING_FORTUNE = Registry.register(Registries.STATUS_EFFECT, new Identifier(Skyblock.MOD_ID, "century_cake_farming_fortune"),
            new ModStatusEffect(StatusEffectCategory.BENEFICIAL, 0xB4684D)
                    .addAttributeModifier(ModEntityAttributes.FARMING_FORTUNE, "c91147c3-4a73-4581-bb34-34785b940ccb", 0.05f, EntityAttributeModifier.Operation.MULTIPLY_BASE));
    public static StatusEffect CENTURY_CAKE_FORAGING_FORTUNE = Registry.register(Registries.STATUS_EFFECT, new Identifier(Skyblock.MOD_ID, "century_cake_foraging_fortune"),
            new ModStatusEffect(StatusEffectCategory.BENEFICIAL, 0xFFFFFF)
                    .addAttributeModifier(ModEntityAttributes.FORAGING_FORTUNE, "36769f86-6e4a-47e4-8766-463aaf9b5342", 0.05f, EntityAttributeModifier.Operation.MULTIPLY_BASE));
    public static StatusEffect CENTURY_CAKE_MINING_FORTUNE = Registry.register(Registries.STATUS_EFFECT, new Identifier(Skyblock.MOD_ID, "century_cake_mining_fortune"),
            new ModStatusEffect(StatusEffectCategory.BENEFICIAL, 0x00AAAA)
                    .addAttributeModifier(ModEntityAttributes.MINING_FORTUNE, "06a722ad-310d-4fe6-bdae-5ef7b845da5b", 0.05f, EntityAttributeModifier.Operation.MULTIPLY_BASE));
    public static StatusEffect CENTURY_CAKE_VITALITY = Registry.register(Registries.STATUS_EFFECT, new Identifier(Skyblock.MOD_ID, "century_cake_vitality"),
            new ModStatusEffect(StatusEffectCategory.BENEFICIAL, 0x00AA00)
                    .addAttributeModifier(ModEntityAttributes.VITALITY, "6f9dd838-ad9a-49b7-ace8-101a3d20ec58", 1.0f, EntityAttributeModifier.Operation.ADDITION));
    public static StatusEffect CENTURY_CAKE_ARMOR_TOUGHNESS = Registry.register(Registries.STATUS_EFFECT, new Identifier(Skyblock.MOD_ID, "century_cake_armor_toughness"),
            new ModStatusEffect(StatusEffectCategory.BENEFICIAL, 0xAAAAAA)
                    .addAttributeModifier(EntityAttributes.GENERIC_ARMOR_TOUGHNESS, "586f4090-4001-4249-a2ed-9478624a177d", 1.0f, EntityAttributeModifier.Operation.ADDITION));

    public static void registerStatusEffects() {
        Abilities.registerAbilities();

        Skyblock.LOGGER.info("Registering Mod Status Effects for " + Skyblock.MOD_ID);
    }
}
