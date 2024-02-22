package net.skyblock.item;

import net.minecraft.entity.effect.*;
import net.minecraft.item.Items;
import net.minecraft.potion.Potion;
import net.minecraft.potion.Potions;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.skyblock.Skyblock;
import net.skyblock.effect.ModStatusEffects;
import net.skyblock.mixin.BrewingRecipeRegistryMixin;

import java.util.Objects;

public class ModPotions {
    private static final int DEFAULT_DURATION = 3600;
    private static final int REDSTONE_DURATION = 9600;
    private static final int ENCHANTED_REDSTONE_DURATION = 19200;
    private static final int ENCHANTED_REDSTONE_BLOCK_DURATION = 48000;

    public static Potion ENCHANTED_SUGAR;
    public static Potion LONG_ENCHANTED_SUGAR;
    public static Potion STRONG_ENCHANTED_SUGAR;
    public static Potion ENCHANTED_SUGAR_CANE;
    public static Potion LONG_ENCHANTED_SUGAR_CANE;
    public static Potion LONGER_ENCHANTED_SUGAR_CANE;
    public static Potion LONGEST_ENCHANTED_SUGAR_CANE;
    public static Potion STRONG_ENCHANTED_SUGAR_CANE;
    public static Potion STRONGER_ENCHANTED_SUGAR_CANE;
    public static Potion STRONGEST_ENCHANTED_SUGAR_CANE;
    public static Potion BALANCED_ENCHANTED_SUGAR_CANE;

    public static Potion LONGER_LEAPING;
    public static Potion LONGEST_LEAPING;
    public static Potion STRONGER_LEAPING;
    public static Potion STRONGEST_LEAPING;
    public static Potion BALANCED_LEAPING;

    public static Potion ENCHANTED_MELON_SLICE;
    public static Potion STRONG_ENCHANTED_MELON_SLICE;
    public static Potion ENCHANTED_GLISTERING_MELON;
    public static Potion STRONG_ENCHANTED_GLISTERING_MELON;
    public static Potion STRONGER_ENCHANTED_GLISTERING_MELON;
    public static Potion STRONGEST_ENCHANTED_GLISTERING_MELON;

    public static Potion LONGER_POISON;
    public static Potion LONGEST_POISON;
    public static Potion STRONGER_POISON;
    public static Potion STRONGEST_POISON;
    public static Potion BALANCED_POISON;

    public static Potion LONGER_WATER_BREATHING;
    public static Potion LONGEST_WATER_BREATHING;

    public static Potion LONGER_FIRE_RESISTANCE;
    public static Potion LONGEST_FIRE_RESISTANCE;

    public static Potion LONGER_NIGHT_VISION;
    public static Potion LONGEST_NIGHT_VISION;

    public static Potion ENCHANTED_BLAZE_POWDER;
    public static Potion LONG_ENCHANTED_BLAZE_POWDER;
    public static Potion STRONG_ENCHANTED_BLAZE_POWDER;
    public static Potion ENCHANTED_BLAZE_ROD;
    public static Potion LONG_ENCHANTED_BLAZE_ROD;
    public static Potion LONGER_ENCHANTED_BLAZE_ROD;
    public static Potion LONGEST_ENCHANTED_BLAZE_ROD;
    public static Potion STRONG_ENCHANTED_BLAZE_ROD;
    public static Potion STRONGER_ENCHANTED_BLAZE_ROD;
    public static Potion STRONGEST_ENCHANTED_BLAZE_ROD;
    public static Potion BALANCED_ENCHANTED_BLAZE_ROD;

    public static Potion LONGER_INVISIBILITY;
    public static Potion LONGEST_INVISIBILITY;

    public static Potion LONGER_REGENERATION;
    public static Potion LONGEST_REGENERATION;
    public static Potion STRONGER_REGENERATION;
    public static Potion STRONGEST_REGENERATION;
    public static Potion BALANCED_REGENERATION;
    public static Potion ENCHANTED_GHAST_TEAR;
    public static Potion LONG_ENCHANTED_GHAST_TEAR;
    public static Potion LONGER_ENCHANTED_GHAST_TEAR;
    public static Potion LONGEST_ENCHANTED_GHAST_TEAR;
    public static Potion STRONG_ENCHANTED_GHAST_TEAR;
    public static Potion STRONGER_ENCHANTED_GHAST_TEAR;
    public static Potion STRONGEST_ENCHANTED_GHAST_TEAR;
    public static Potion BALANCED_ENCHANTED_GHAST_TEAR;

    public static Potion ENCHANTED_SPIDER_EYE;
    public static Potion LONG_ENCHANTED_SPIDER_EYE;
    public static Potion STRONG_ENCHANTED_SPIDER_EYE;
    public static Potion ENCHANTED_FERMENTED_SPIDER_EYE;
    public static Potion LONG_ENCHANTED_FERMENTED_SPIDER_EYE;
    public static Potion LONGER_ENCHANTED_FERMENTED_SPIDER_EYE;
    public static Potion LONGEST_ENCHANTED_FERMENTED_SPIDER_EYE;
    public static Potion STRONG_ENCHANTED_FERMENTED_SPIDER_EYE;
    public static Potion STRONGER_ENCHANTED_FERMENTED_SPIDER_EYE;
    public static Potion STRONGEST_ENCHANTED_FERMENTED_SPIDER_EYE;
    public static Potion BALANCED_ENCHANTED_FERMENTED_SPIDER_EYE;

    public static Potion ENCHANTED_SUGAR_SLOWNESS;
    public static Potion LONG_ENCHANTED_SUGAR_SLOWNESS;
    public static Potion STRONG_ENCHANTED_SUGAR_SLOWNESS;
    public static Potion ENCHANTED_SUGAR_CANE_SLOWNESS;
    public static Potion LONG_ENCHANTED_SUGAR_CANE_SLOWNESS;
    public static Potion LONGER_ENCHANTED_SUGAR_CANE_SLOWNESS;
    public static Potion LONGEST_ENCHANTED_SUGAR_CANE_SLOWNESS;
    public static Potion STRONG_ENCHANTED_SUGAR_CANE_SLOWNESS;
    public static Potion STRONGER_ENCHANTED_SUGAR_CANE_SLOWNESS;
    public static Potion STRONGEST_ENCHANTED_SUGAR_CANE_SLOWNESS;
    public static Potion BALANCED_ENCHANTED_SUGAR_CANE_SLOWNESS;

    public static Potion ENCHANTED_MELON_SLICE_DAMAGE;
    public static Potion STRONG_ENCHANTED_MELON_SLICE_DAMAGE;
    public static Potion ENCHANTED_GLISTERING_MELON_DAMAGE;
    public static Potion STRONG_ENCHANTED_GLISTERING_MELON_DAMAGE;
    public static Potion STRONGER_ENCHANTED_GLISTERING_MELON_DAMAGE;
    public static Potion STRONGEST_ENCHANTED_GLISTERING_MELON_DAMAGE;

    public static Potion HASTE;
    public static Potion LONG_HASTE;
    public static Potion LONGER_HASTE;
    public static Potion LONGEST_HASTE;
    public static Potion STRONG_HASTE;
    public static Potion STRONGER_HASTE;
    public static Potion STRONGEST_HASTE;
    public static Potion BALANCED_HASTE;

    public static Potion RABBIT;
    public static Potion LONG_RABBIT;
    public static Potion STRONG_RABBIT;
    public static Potion ENCHANTED_RABBIT_FOOT;
    public static Potion LONG_ENCHANTED_RABBIT_FOOT;
    public static Potion LONGER_ENCHANTED_RABBIT_FOOT;
    public static Potion LONGEST_ENCHANTED_RABBIT_FOOT;
    public static Potion STRONG_ENCHANTED_RABBIT_FOOT;
    public static Potion STRONGER_ENCHANTED_RABBIT_FOOT;
    public static Potion STRONGEST_ENCHANTED_RABBIT_FOOT;
    public static Potion BALANCED_ENCHANTED_RABBIT_FOOT;

    public static Potion BURN;
    public static Potion LONG_BURN;
    public static Potion LONGER_BURN;
    public static Potion LONGEST_BURN;
    public static Potion STRONG_BURN;
    public static Potion STRONGER_BURN;
    public static Potion STRONGEST_BURN;
    public static Potion BALANCED_BURN;

    public static Potion KNOCKBACK;
    public static Potion LONG_KNOCKBACK;
    public static Potion LONGER_KNOCKBACK;
    public static Potion LONGEST_KNOCKBACK;
    public static Potion STRONG_KNOCKBACK;
    public static Potion STRONGER_KNOCKBACK;
    public static Potion STRONGEST_KNOCKBACK;
    public static Potion BALANCED_KNOCKBACK;

    public static Potion VENOMOUS;
    public static Potion LONG_VENOMOUS;
    public static Potion LONGER_VENOMOUS;
    public static Potion LONGEST_VENOMOUS;
    public static Potion STRONG_VENOMOUS;
    public static Potion STRONGER_VENOMOUS;
    public static Potion STRONGEST_VENOMOUS;
    public static Potion BALANCED_VENOMOUS;

    public static Potion STUN;
    public static Potion LONG_STUN;
    public static Potion LONGER_STUN;
    public static Potion LONGEST_STUN;
    public static Potion STRONG_STUN;
    public static Potion STRONGER_STUN;
    public static Potion STRONGEST_STUN;
    public static Potion BALANCED_STUN;

    public static Potion ARCHERY;
    public static Potion LONG_ARCHERY;
    public static Potion LONGER_ARCHERY;
    public static Potion LONGEST_ARCHERY;
    public static Potion STRONG_ARCHERY;
    public static Potion STRONGER_ARCHERY;
    public static Potion STRONGEST_ARCHERY;
    public static Potion BALANCED_ARCHERY;

    public static Potion ABSORPTION;
    public static Potion LONG_ABSORPTION;
    public static Potion STRONG_ABSORPTION;
    public static Potion ENCHANTED_GOLD_INGOT;
    public static Potion LONG_ENCHANTED_GOLD_INGOT;
    public static Potion STRONG_ENCHANTED_GOLD_INGOT;
    public static Potion ENCHANTED_GOLD_BLOCK;
    public static Potion LONG_ENCHANTED_GOLD_BLOCK;
    public static Potion LONGER_ENCHANTED_GOLD_BLOCK;
    public static Potion LONGEST_ENCHANTED_GOLD_BLOCK;
    public static Potion STRONG_ENCHANTED_GOLD_BLOCK;
    public static Potion STRONGER_ENCHANTED_GOLD_BLOCK;
    public static Potion STRONGEST_ENCHANTED_GOLD_BLOCK;
    public static Potion BALANCED_ENCHANTED_GOLD_BLOCK;

    public static Potion ADRENALINE;
    public static Potion LONG_ADRENALINE;
    public static Potion STRONG_ADRENALINE;
    public static Potion ENCHANTED_COCOA_BEANS;
    public static Potion LONG_ENCHANTED_COCOA_BEANS;
    public static Potion STRONG_ENCHANTED_COCOA_BEANS;
    public static Potion ENCHANTED_COOKIE;
    public static Potion LONG_ENCHANTED_COOKIE;
    public static Potion LONGER_ENCHANTED_COOKIE;
    public static Potion LONGEST_ENCHANTED_COOKIE;
    public static Potion STRONG_ENCHANTED_COOKIE;
    public static Potion STRONGER_ENCHANTED_COOKIE;
    public static Potion STRONGEST_ENCHANTED_COOKIE;
    public static Potion BALANCED_ENCHANTED_COOKIE;

    public static Potion CRITICAL;
    public static Potion LONG_CRITICAL;
    public static Potion LONGER_CRITICAL;
    public static Potion LONGEST_CRITICAL;
    public static Potion STRONG_CRITICAL;
    public static Potion STRONGER_CRITICAL;
    public static Potion STRONGEST_CRITICAL;
    public static Potion BALANCED_CRITICAL;

    public static Potion DODGE;
    public static Potion LONG_DODGE;
    public static Potion LONGER_DODGE;
    public static Potion LONGEST_DODGE;
    public static Potion STRONG_DODGE;
    public static Potion STRONGER_DODGE;
    public static Potion STRONGEST_DODGE;
    public static Potion BALANCED_DODGE;

    public static Potion AGILITY;
    public static Potion LONG_AGILITY;
    public static Potion LONGER_AGILITY;
    public static Potion LONGEST_AGILITY;
    public static Potion STRONG_AGILITY;
    public static Potion STRONGER_AGILITY;
    public static Potion STRONGEST_AGILITY;
    public static Potion BALANCED_AGILITY;

    public static Potion WOUNDED;
    public static Potion LONG_WOUNDED;
    public static Potion LONGER_WOUNDED;
    public static Potion LONGEST_WOUNDED;
    public static Potion STRONG_WOUNDED;
    public static Potion STRONGER_WOUNDED;
    public static Potion STRONGEST_WOUNDED;
    public static Potion BALANCED_WOUNDED;

    public static Potion EXPERIENCE;
    public static Potion LONG_EXPERIENCE;
    public static Potion LONGER_EXPERIENCE;
    public static Potion LONGEST_EXPERIENCE;
    public static Potion STRONG_EXPERIENCE;
    public static Potion STRONGER_EXPERIENCE;
    public static Potion STRONGEST_EXPERIENCE;
    public static Potion BALANCED_EXPERIENCE;

    public static Potion RESISTANCE;
    public static Potion LONG_RESISTANCE;
    public static Potion STRONG_RESISTANCE;
    public static Potion ENCHANTED_CACTUS_GREEN;
    public static Potion LONG_ENCHANTED_CACTUS_GREEN;
    public static Potion STRONG_ENCHANTED_CACTUS_GREEN;
    public static Potion ENCHANTED_CACTUS;
    public static Potion LONG_ENCHANTED_CACTUS;
    public static Potion LONGER_ENCHANTED_CACTUS;
    public static Potion LONGEST_ENCHANTED_CACTUS;
    public static Potion STRONG_ENCHANTED_CACTUS;
    public static Potion STRONGER_ENCHANTED_CACTUS;
    public static Potion STRONGEST_ENCHANTED_CACTUS;
    public static Potion BALANCED_ENCHANTED_CACTUS;

    public static Potion MANA;
    public static Potion LONG_MANA;
    public static Potion STRONG_MANA;
    public static Potion ENCHANTED_MUTTON;
    public static Potion LONG_ENCHANTED_MUTTON;
    public static Potion STRONG_ENCHANTED_MUTTON;
    public static Potion ENCHANTED_COOKED_MUTTON;
    public static Potion LONG_ENCHANTED_COOKED_MUTTON;
    public static Potion LONGER_ENCHANTED_COOKED_MUTTON;
    public static Potion LONGEST_ENCHANTED_COOKED_MUTTON;
    public static Potion STRONG_ENCHANTED_COOKED_MUTTON;
    public static Potion STRONGER_ENCHANTED_COOKED_MUTTON;
    public static Potion STRONGEST_ENCHANTED_COOKED_MUTTON;
    public static Potion BALANCED_ENCHANTED_COOKED_MUTTON;

    public static Potion STAMINA;
    public static Potion STRONG_STAMINA;
    public static Potion STRONGER_STAMINA;
    public static Potion STRONGEST_STAMINA;

    public static Potion BLINDNESS;
    public static Potion LONG_BLINDNESS;
    public static Potion STRONG_BLINDNESS;
    public static Potion ENCHANTED_INK_SAC;

    public static Potion TRUE_RESISTANCE;
    public static Potion LONG_TRUE_RESISTANCE;
    public static Potion LONGER_TRUE_RESISTANCE;
    public static Potion LONGEST_TRUE_RESISTANCE;
    public static Potion STRONG_TRUE_RESISTANCE;
    public static Potion STRONGER_TRUE_RESISTANCE;
    public static Potion STRONGEST_TRUE_RESISTANCE;
    public static Potion BALANCED_TRUE_RESISTANCE;

    public static Potion PET_LUCK;
    public static Potion LONG_PET_LUCK;
    public static Potion LONGER_PET_LUCK;
    public static Potion LONGEST_PET_LUCK;
    public static Potion STRONG_PET_LUCK;
    public static Potion STRONGER_PET_LUCK;
    public static Potion STRONGEST_PET_LUCK;
    public static Potion BALANCED_PET_LUCK;

    public static Potion SPELUNKER;
    public static Potion LONG_SPELUNKER;
    public static Potion LONGER_SPELUNKER;
    public static Potion LONGEST_SPELUNKER;
    public static Potion STRONG_SPELUNKER;
    public static Potion STRONGER_SPELUNKER;
    public static Potion STRONGEST_SPELUNKER;
    public static Potion BALANCED_SPELUNKER;

    public static Potion SPIRIT;
    public static Potion LONG_SPIRIT;
    public static Potion LONGER_SPIRIT;
    public static Potion LONGEST_SPIRIT;
    public static Potion STRONG_SPIRIT;
    public static Potion STRONGER_SPIRIT;
    public static Potion STRONGEST_SPIRIT;
    public static Potion BALANCED_SPIRIT;

    public static Potion LONG_LUCK;
    public static Potion LONGER_LUCK;
    public static Potion LONGEST_LUCK;
    public static Potion STRONG_LUCK;
    public static Potion STRONGER_LUCK;
    public static Potion STRONGEST_LUCK;
    public static Potion BALANCED_LUCK;

    public static Potion WISPS_ICE_FLAVORED_WATER;
    public static Potion MUSHED_GLOWY_TONIC;

    public static void registerPotion(String name, int amplifier) {

        if (Objects.equals(name, "enchanted_sugar")) {
            ENCHANTED_SUGAR = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, name),
                    new ModPotion(amplifier/2, "swiftness", new StatusEffectInstance(StatusEffects.SPEED, DEFAULT_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.AWKWARD, EnchantedItems.SUGAR, ModPotions.ENCHANTED_SUGAR);

            LONG_ENCHANTED_SUGAR = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "long_"+name),
                    new ModPotion(amplifier/2, "swiftness", new StatusEffectInstance(StatusEffects.SPEED, REDSTONE_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.ENCHANTED_SUGAR, Items.REDSTONE, ModPotions.LONG_ENCHANTED_SUGAR);

            STRONG_ENCHANTED_SUGAR = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "strong_"+name),
                    new ModPotion(amplifier/2, "swiftness", new StatusEffectInstance(StatusEffects.SPEED, DEFAULT_DURATION /2, amplifier+1)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.ENCHANTED_SUGAR, Items.GLOWSTONE_DUST, ModPotions.STRONG_ENCHANTED_SUGAR);

        } else if (Objects.equals(name, "enchanted_sugar_cane")) {
            ENCHANTED_SUGAR_CANE = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, name),
                    new ModPotion(amplifier/2, "swiftness", new StatusEffectInstance(StatusEffects.SPEED, DEFAULT_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.AWKWARD, EnchantedItems.SUGAR_CANE, ModPotions.ENCHANTED_SUGAR_CANE);

            LONG_ENCHANTED_SUGAR_CANE = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "long_" + name),
                    new ModPotion(amplifier/2, "swiftness", new StatusEffectInstance(StatusEffects.SPEED, REDSTONE_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.ENCHANTED_SUGAR_CANE, Items.REDSTONE, ModPotions.LONG_ENCHANTED_SUGAR_CANE);

            LONGER_ENCHANTED_SUGAR_CANE = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "longer_" + name),
                    new ModPotion(amplifier/2, "swiftness", new StatusEffectInstance(StatusEffects.SPEED, ENCHANTED_REDSTONE_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.ENCHANTED_SUGAR_CANE, EnchantedItems.REDSTONE, ModPotions.LONGER_ENCHANTED_SUGAR_CANE);

            LONGEST_ENCHANTED_SUGAR_CANE = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "longest_" + name),
                    new ModPotion(amplifier/2, "swiftness", new StatusEffectInstance(StatusEffects.SPEED, ENCHANTED_REDSTONE_BLOCK_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.ENCHANTED_SUGAR_CANE, EnchantedItems.REDSTONE_BLOCK, ModPotions.LONGEST_ENCHANTED_SUGAR_CANE);

            STRONG_ENCHANTED_SUGAR_CANE = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "strong_" + name),
                    new ModPotion(amplifier/2, "swiftness", new StatusEffectInstance(StatusEffects.SPEED, DEFAULT_DURATION / 2, amplifier + 1)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.ENCHANTED_SUGAR_CANE, Items.GLOWSTONE_DUST, ModPotions.STRONG_ENCHANTED_SUGAR_CANE);

            STRONGER_ENCHANTED_SUGAR_CANE = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "stronger_" + name),
                    new ModPotion(amplifier/2+1, "swiftness", new StatusEffectInstance(StatusEffects.SPEED, DEFAULT_DURATION / 2, amplifier + 2)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.ENCHANTED_SUGAR_CANE, EnchantedItems.GLOWSTONE_DUST, ModPotions.STRONGER_ENCHANTED_SUGAR_CANE);

            STRONGEST_ENCHANTED_SUGAR_CANE = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "strongest_" + name),
                    new ModPotion(amplifier/2+1, "swiftness", new StatusEffectInstance(StatusEffects.SPEED, DEFAULT_DURATION / 2, amplifier + 3)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.ENCHANTED_SUGAR_CANE, EnchantedItems.GLOWSTONE, ModPotions.STRONGEST_ENCHANTED_SUGAR_CANE);

            BALANCED_ENCHANTED_SUGAR_CANE = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "balanced_" + name),
                    new ModPotion(amplifier/2+1, "swiftness", new StatusEffectInstance(StatusEffects.SPEED, ENCHANTED_REDSTONE_DURATION, amplifier + 3)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.ENCHANTED_SUGAR_CANE, EnchantedItems.REDSTONE_LAMP, ModPotions.BALANCED_ENCHANTED_SUGAR_CANE);

        } else if (Objects.equals(name, "leaping")) {
            LONGER_LEAPING = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "longer_" + name),
                    new ModPotion(amplifier/2, "leaping", new StatusEffectInstance(StatusEffects.JUMP_BOOST, ENCHANTED_REDSTONE_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.LEAPING, EnchantedItems.REDSTONE, ModPotions.LONGER_LEAPING);

            LONGEST_LEAPING = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "longest_" + name),
                    new ModPotion(amplifier/2, "leaping", new StatusEffectInstance(StatusEffects.JUMP_BOOST, ENCHANTED_REDSTONE_BLOCK_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.LEAPING, EnchantedItems.REDSTONE_BLOCK, ModPotions.LONGEST_LEAPING);

            STRONGER_LEAPING = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "stronger_" + name),
                    new ModPotion(amplifier/2+1, "leaping", new StatusEffectInstance(StatusEffects.JUMP_BOOST, DEFAULT_DURATION / 2, amplifier + 2)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.LEAPING, EnchantedItems.GLOWSTONE_DUST, ModPotions.STRONGER_LEAPING);

            STRONGEST_LEAPING = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "strongest_" + name),
                    new ModPotion(amplifier/2+1, "leaping", new StatusEffectInstance(StatusEffects.JUMP_BOOST, DEFAULT_DURATION / 2, amplifier + 3)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.LEAPING, EnchantedItems.GLOWSTONE, ModPotions.STRONGEST_LEAPING);

            BALANCED_LEAPING = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "balanced_" + name),
                    new ModPotion(amplifier/2+1, "leaping", new StatusEffectInstance(StatusEffects.JUMP_BOOST, ENCHANTED_REDSTONE_DURATION, amplifier + 3)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.LEAPING, EnchantedItems.REDSTONE_LAMP, ModPotions.BALANCED_LEAPING);

        } else if (Objects.equals(name, "enchanted_melon_slice")) {
            ENCHANTED_MELON_SLICE = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, name),
                    new ModPotion(amplifier/2, "healing", new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, DEFAULT_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.AWKWARD, EnchantedItems.MELON_SLICE, ModPotions.ENCHANTED_MELON_SLICE);

            STRONG_ENCHANTED_MELON_SLICE = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "strong_"+name),
                    new ModPotion(amplifier/2, "healing", new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, DEFAULT_DURATION /2, amplifier+1)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.ENCHANTED_MELON_SLICE, Items.GLOWSTONE_DUST, ModPotions.STRONG_ENCHANTED_MELON_SLICE);

        } else if (Objects.equals(name, "enchanted_glistering_melon")) {
            ENCHANTED_GLISTERING_MELON = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, name),
                    new ModPotion(amplifier/2, "healing", new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, DEFAULT_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.AWKWARD, EnchantedItems.GLISTERING_MELON_SLICE, ModPotions.ENCHANTED_GLISTERING_MELON);

            STRONG_ENCHANTED_GLISTERING_MELON = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "strong_" + name),
                    new ModPotion(amplifier/2, "healing", new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, DEFAULT_DURATION / 2, amplifier + 1)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.ENCHANTED_GLISTERING_MELON, Items.GLOWSTONE_DUST, ModPotions.STRONG_ENCHANTED_GLISTERING_MELON);

            STRONGER_ENCHANTED_GLISTERING_MELON = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "stronger_" + name),
                    new ModPotion(amplifier/2+1, "healing", new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, DEFAULT_DURATION / 2, amplifier + 2)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.ENCHANTED_GLISTERING_MELON, EnchantedItems.GLOWSTONE_DUST, ModPotions.STRONGER_ENCHANTED_GLISTERING_MELON);

            STRONGEST_ENCHANTED_GLISTERING_MELON = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "strongest_" + name),
                    new ModPotion(amplifier/2+1, "healing", new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, DEFAULT_DURATION / 2, amplifier + 3)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.ENCHANTED_GLISTERING_MELON, EnchantedItems.GLOWSTONE, ModPotions.STRONGEST_ENCHANTED_GLISTERING_MELON);

        } else if (Objects.equals(name, "poison")) {
            LONGER_POISON = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "longer_" + name),
                    new ModPotion(amplifier/2, "poison", new StatusEffectInstance(StatusEffects.POISON, ENCHANTED_REDSTONE_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.POISON, EnchantedItems.REDSTONE, ModPotions.LONGER_POISON);

            LONGEST_POISON = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "longest_" + name),
                    new ModPotion(amplifier/2, "poison", new StatusEffectInstance(StatusEffects.POISON, ENCHANTED_REDSTONE_BLOCK_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.POISON, EnchantedItems.REDSTONE_BLOCK, ModPotions.LONGEST_POISON);

            STRONGER_POISON = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "stronger_" + name),
                    new ModPotion(amplifier/2+1, "poison", new StatusEffectInstance(StatusEffects.POISON, DEFAULT_DURATION / 2, amplifier + 2)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.POISON, EnchantedItems.GLOWSTONE_DUST, ModPotions.STRONGER_POISON);

            STRONGEST_POISON = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "strongest_" + name),
                    new ModPotion(amplifier/2+1, "poison", new StatusEffectInstance(StatusEffects.POISON, DEFAULT_DURATION / 2, amplifier + 3)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.POISON, EnchantedItems.GLOWSTONE, ModPotions.STRONGEST_POISON);

            BALANCED_POISON = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "balanced_" + name),
                    new ModPotion(amplifier/2+1, "poison", new StatusEffectInstance(StatusEffects.POISON, ENCHANTED_REDSTONE_DURATION, amplifier + 3)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.POISON, EnchantedItems.REDSTONE_LAMP, ModPotions.BALANCED_POISON);

        } else if (Objects.equals(name, "water_breathing")) {
            LONGER_WATER_BREATHING = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "longer_" + name),
                    new ModPotion(amplifier/2, "water_breathing", new StatusEffectInstance(StatusEffects.WATER_BREATHING, ENCHANTED_REDSTONE_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.WATER_BREATHING, EnchantedItems.REDSTONE, ModPotions.LONGER_WATER_BREATHING);

            LONGEST_WATER_BREATHING = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "longest_" + name),
                    new ModPotion(amplifier/2, "water_breathing", new StatusEffectInstance(StatusEffects.WATER_BREATHING, ENCHANTED_REDSTONE_BLOCK_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.WATER_BREATHING, EnchantedItems.REDSTONE_BLOCK, ModPotions.LONGEST_WATER_BREATHING);

        } else if (Objects.equals(name, "fire_resistance")) {
            LONGER_FIRE_RESISTANCE = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "longer_" + name),
                    new ModPotion(amplifier/2, "night_vision", new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, ENCHANTED_REDSTONE_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.FIRE_RESISTANCE, EnchantedItems.REDSTONE, ModPotions.LONGER_FIRE_RESISTANCE);

            LONGEST_FIRE_RESISTANCE = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "longest_" + name),
                    new ModPotion(amplifier/2, "night_vision", new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, ENCHANTED_REDSTONE_BLOCK_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.FIRE_RESISTANCE, EnchantedItems.REDSTONE_BLOCK, ModPotions.LONGEST_FIRE_RESISTANCE);

        } else if (Objects.equals(name, "night_vision")) {
            LONGER_NIGHT_VISION = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "longer_" + name),
                    new ModPotion(amplifier/2, "night_vision", new StatusEffectInstance(StatusEffects.NIGHT_VISION, ENCHANTED_REDSTONE_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.NIGHT_VISION, EnchantedItems.REDSTONE, ModPotions.LONGER_NIGHT_VISION);

            LONGEST_NIGHT_VISION = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "longest_" + name),
                    new ModPotion(amplifier/2, "night_vision", new StatusEffectInstance(StatusEffects.NIGHT_VISION, ENCHANTED_REDSTONE_BLOCK_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.NIGHT_VISION, EnchantedItems.REDSTONE_BLOCK, ModPotions.LONGEST_NIGHT_VISION);

        } else if (Objects.equals(name, "enchanted_blaze_powder")) {
            ENCHANTED_BLAZE_POWDER = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, name),
                    new ModPotion(amplifier/2, "strength", new StatusEffectInstance(StatusEffects.STRENGTH, DEFAULT_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.AWKWARD, EnchantedItems.BLAZE_POWDER, ModPotions.ENCHANTED_BLAZE_POWDER);

            LONG_ENCHANTED_BLAZE_POWDER = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "long_"+name),
                    new ModPotion(amplifier/2, "strength", new StatusEffectInstance(StatusEffects.STRENGTH, REDSTONE_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.ENCHANTED_BLAZE_POWDER, Items.REDSTONE, ModPotions.LONG_ENCHANTED_BLAZE_POWDER);

            STRONG_ENCHANTED_BLAZE_POWDER = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "strong_"+name),
                    new ModPotion(amplifier/2, "strength", new StatusEffectInstance(StatusEffects.STRENGTH, DEFAULT_DURATION /2, amplifier+1)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.ENCHANTED_BLAZE_POWDER, Items.GLOWSTONE_DUST, ModPotions.STRONG_ENCHANTED_BLAZE_POWDER);

        } else if (Objects.equals(name, "enchanted_blaze_rod")) {
            ENCHANTED_BLAZE_ROD = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, name),
                    new ModPotion(amplifier/2, "strength", new StatusEffectInstance(StatusEffects.STRENGTH, DEFAULT_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.AWKWARD, EnchantedItems.BLAZE_ROD, ModPotions.ENCHANTED_BLAZE_ROD);

            LONG_ENCHANTED_BLAZE_ROD = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "long_" + name),
                    new ModPotion(amplifier/2, "strength", new StatusEffectInstance(StatusEffects.STRENGTH, REDSTONE_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.ENCHANTED_BLAZE_ROD, Items.REDSTONE, ModPotions.LONG_ENCHANTED_BLAZE_ROD);

            LONGER_ENCHANTED_BLAZE_ROD = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "longer_" + name),
                    new ModPotion(amplifier/2, "strength", new StatusEffectInstance(StatusEffects.STRENGTH, ENCHANTED_REDSTONE_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.ENCHANTED_BLAZE_ROD, EnchantedItems.REDSTONE, ModPotions.LONGER_ENCHANTED_BLAZE_ROD);

            LONGEST_ENCHANTED_BLAZE_ROD = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "longest_" + name),
                    new ModPotion(amplifier/2, "strength", new StatusEffectInstance(StatusEffects.STRENGTH, ENCHANTED_REDSTONE_BLOCK_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.ENCHANTED_BLAZE_ROD, EnchantedItems.REDSTONE_BLOCK, ModPotions.LONGEST_ENCHANTED_BLAZE_ROD);

            STRONG_ENCHANTED_BLAZE_ROD = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "strong_" + name),
                    new ModPotion(amplifier/2, "strength", new StatusEffectInstance(StatusEffects.STRENGTH, DEFAULT_DURATION / 2, amplifier + 1)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.ENCHANTED_BLAZE_ROD, Items.GLOWSTONE_DUST, ModPotions.STRONG_ENCHANTED_BLAZE_ROD);

            STRONGER_ENCHANTED_BLAZE_ROD = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "stronger_" + name),
                    new ModPotion(amplifier/2+1, "strength", new StatusEffectInstance(StatusEffects.STRENGTH, DEFAULT_DURATION / 2, amplifier + 2)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.ENCHANTED_BLAZE_ROD, EnchantedItems.GLOWSTONE_DUST, ModPotions.STRONGER_ENCHANTED_BLAZE_ROD);

            STRONGEST_ENCHANTED_BLAZE_ROD = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "strongest_" + name),
                    new ModPotion(amplifier/2+1, "strength", new StatusEffectInstance(StatusEffects.STRENGTH, DEFAULT_DURATION / 2, amplifier + 3)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.ENCHANTED_BLAZE_ROD, EnchantedItems.GLOWSTONE, ModPotions.STRONGEST_ENCHANTED_BLAZE_ROD);

            BALANCED_ENCHANTED_BLAZE_ROD = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "balanced_" + name),
                    new ModPotion(amplifier/2+1, "strength", new StatusEffectInstance(StatusEffects.STRENGTH, ENCHANTED_REDSTONE_DURATION, amplifier + 3)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.ENCHANTED_BLAZE_ROD, EnchantedItems.REDSTONE_LAMP, ModPotions.BALANCED_ENCHANTED_BLAZE_ROD);

        } else if (Objects.equals(name, "invisibility")) {
            LONGER_INVISIBILITY = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "longer_" + name),
                    new ModPotion(amplifier/2, "invisibility", new StatusEffectInstance(StatusEffects.INVISIBILITY, ENCHANTED_REDSTONE_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.INVISIBILITY, EnchantedItems.REDSTONE, ModPotions.LONGER_INVISIBILITY);

            LONGEST_INVISIBILITY = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "longest_" + name),
                    new ModPotion(amplifier/2, "invisibility", new StatusEffectInstance(StatusEffects.INVISIBILITY, ENCHANTED_REDSTONE_BLOCK_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.INVISIBILITY, EnchantedItems.REDSTONE_BLOCK, ModPotions.LONGEST_INVISIBILITY);

        } else if (Objects.equals(name, "regeneration")) {
            LONGER_REGENERATION = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "longer_" + name),
                    new ModPotion(amplifier/2, "regeneration", new StatusEffectInstance(StatusEffects.REGENERATION, ENCHANTED_REDSTONE_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.REGENERATION, EnchantedItems.REDSTONE, ModPotions.LONGER_REGENERATION);

            LONGEST_REGENERATION = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "longest_" + name),
                    new ModPotion(amplifier/2, "regeneration", new StatusEffectInstance(StatusEffects.REGENERATION, ENCHANTED_REDSTONE_BLOCK_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.REGENERATION, EnchantedItems.REDSTONE_BLOCK, ModPotions.LONGEST_REGENERATION);

            STRONGER_REGENERATION = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "stronger_" + name),
                    new ModPotion(amplifier/2+1, "regeneration", new StatusEffectInstance(StatusEffects.REGENERATION, DEFAULT_DURATION / 2, amplifier + 2)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.REGENERATION, EnchantedItems.GLOWSTONE_DUST, ModPotions.STRONGER_REGENERATION);

            STRONGEST_REGENERATION = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "strongest_" + name),
                    new ModPotion(amplifier/2+1, "regeneration", new StatusEffectInstance(StatusEffects.REGENERATION, DEFAULT_DURATION / 2, amplifier + 3)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.REGENERATION, EnchantedItems.GLOWSTONE, ModPotions.STRONGEST_REGENERATION);

            BALANCED_REGENERATION = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "balanced_" + name),
                    new ModPotion(amplifier/2+1, "regeneration", new StatusEffectInstance(StatusEffects.REGENERATION, ENCHANTED_REDSTONE_DURATION, amplifier + 3)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.REGENERATION, EnchantedItems.REDSTONE_LAMP, ModPotions.BALANCED_REGENERATION);

        } else if (Objects.equals(name, "enchanted_ghast_tear")) {
            ENCHANTED_GHAST_TEAR = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, name),
                    new ModPotion(amplifier/2, "regeneration", new StatusEffectInstance(StatusEffects.REGENERATION, DEFAULT_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.AWKWARD, EnchantedItems.GHAST_TEAR, ModPotions.ENCHANTED_GHAST_TEAR);

            LONG_ENCHANTED_GHAST_TEAR = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "long_" + name),
                    new ModPotion(amplifier/2, "regeneration", new StatusEffectInstance(StatusEffects.REGENERATION, REDSTONE_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.ENCHANTED_GHAST_TEAR, Items.REDSTONE, ModPotions.LONG_ENCHANTED_GHAST_TEAR);

            LONGER_ENCHANTED_GHAST_TEAR = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "longer_" + name),
                    new ModPotion(amplifier/2, "regeneration", new StatusEffectInstance(StatusEffects.REGENERATION, ENCHANTED_REDSTONE_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.ENCHANTED_GHAST_TEAR, EnchantedItems.REDSTONE, ModPotions.LONGER_ENCHANTED_GHAST_TEAR);

            LONGEST_ENCHANTED_GHAST_TEAR = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "longest_" + name),
                    new ModPotion(amplifier/2, "regeneration", new StatusEffectInstance(StatusEffects.REGENERATION, ENCHANTED_REDSTONE_BLOCK_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.ENCHANTED_GHAST_TEAR, EnchantedItems.REDSTONE_BLOCK, ModPotions.LONGEST_ENCHANTED_GHAST_TEAR);

            STRONG_ENCHANTED_GHAST_TEAR = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "strong_" + name),
                    new ModPotion(amplifier/2, "regeneration", new StatusEffectInstance(StatusEffects.REGENERATION, DEFAULT_DURATION / 2, amplifier + 1)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.ENCHANTED_GHAST_TEAR, Items.GLOWSTONE_DUST, ModPotions.STRONG_ENCHANTED_GHAST_TEAR);

            STRONGER_ENCHANTED_GHAST_TEAR = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "stronger_" + name),
                    new ModPotion(amplifier/2+1, "regeneration", new StatusEffectInstance(StatusEffects.REGENERATION, DEFAULT_DURATION / 2, amplifier + 2)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.ENCHANTED_GHAST_TEAR, EnchantedItems.GLOWSTONE_DUST, ModPotions.STRONGER_ENCHANTED_GHAST_TEAR);

            STRONGEST_ENCHANTED_GHAST_TEAR = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "strongest_" + name),
                    new ModPotion(amplifier/2+1, "regeneration", new StatusEffectInstance(StatusEffects.REGENERATION, DEFAULT_DURATION / 2, amplifier + 3)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.ENCHANTED_GHAST_TEAR, EnchantedItems.GLOWSTONE, ModPotions.STRONGEST_ENCHANTED_GHAST_TEAR);

            BALANCED_ENCHANTED_GHAST_TEAR = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "balanced_" + name),
                    new ModPotion(amplifier/2+1, "regeneration", new StatusEffectInstance(StatusEffects.REGENERATION, ENCHANTED_REDSTONE_DURATION, amplifier + 3)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.ENCHANTED_GHAST_TEAR, EnchantedItems.REDSTONE_LAMP, ModPotions.BALANCED_ENCHANTED_GHAST_TEAR);

        } else if (Objects.equals(name, "enchanted_spider_eye")) {
            ENCHANTED_SPIDER_EYE = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, name),
                    new ModPotion(amplifier/2, "weakness", new StatusEffectInstance(StatusEffects.WEAKNESS, DEFAULT_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.WATER, EnchantedItems.SPIDER_EYE, ModPotions.ENCHANTED_SPIDER_EYE);

            LONG_ENCHANTED_SPIDER_EYE = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "long_" + name),
                    new ModPotion(amplifier/2, "weakness", new StatusEffectInstance(StatusEffects.WEAKNESS, REDSTONE_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.ENCHANTED_SPIDER_EYE, Items.REDSTONE, ModPotions.LONG_ENCHANTED_SPIDER_EYE);

            STRONG_ENCHANTED_SPIDER_EYE = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "strong_" + name),
                    new ModPotion(amplifier/2, "weakness", new StatusEffectInstance(StatusEffects.WEAKNESS, DEFAULT_DURATION / 2, amplifier + 1)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.ENCHANTED_SPIDER_EYE, Items.GLOWSTONE_DUST, ModPotions.STRONG_ENCHANTED_SPIDER_EYE);

        } else if (Objects.equals(name, "enchanted_fermented_spider_eye")) {
            ENCHANTED_FERMENTED_SPIDER_EYE = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, name),
                    new ModPotion(amplifier/2, "weakness", new StatusEffectInstance(StatusEffects.WEAKNESS, DEFAULT_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.AWKWARD, EnchantedItems.FERMENTED_SPIDER_EYE, ModPotions.ENCHANTED_FERMENTED_SPIDER_EYE);

            LONG_ENCHANTED_FERMENTED_SPIDER_EYE = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "long_" + name),
                    new ModPotion(amplifier/2, "weakness", new StatusEffectInstance(StatusEffects.WEAKNESS, REDSTONE_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.ENCHANTED_FERMENTED_SPIDER_EYE, Items.REDSTONE, ModPotions.LONG_ENCHANTED_FERMENTED_SPIDER_EYE);

            LONGER_ENCHANTED_FERMENTED_SPIDER_EYE = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "longer_" + name),
                    new ModPotion(amplifier/2, "weakness", new StatusEffectInstance(StatusEffects.WEAKNESS, ENCHANTED_REDSTONE_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.ENCHANTED_FERMENTED_SPIDER_EYE, EnchantedItems.REDSTONE, ModPotions.LONGER_ENCHANTED_FERMENTED_SPIDER_EYE);

            LONGEST_ENCHANTED_FERMENTED_SPIDER_EYE = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "longest_" + name),
                    new ModPotion(amplifier/2, "weakness", new StatusEffectInstance(StatusEffects.WEAKNESS, ENCHANTED_REDSTONE_BLOCK_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.ENCHANTED_FERMENTED_SPIDER_EYE, EnchantedItems.REDSTONE_BLOCK, ModPotions.LONGEST_ENCHANTED_FERMENTED_SPIDER_EYE);

            STRONG_ENCHANTED_FERMENTED_SPIDER_EYE = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "strong_" + name),
                    new ModPotion(amplifier/2, "weakness", new StatusEffectInstance(StatusEffects.WEAKNESS, DEFAULT_DURATION / 2, amplifier + 1)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.ENCHANTED_FERMENTED_SPIDER_EYE, Items.GLOWSTONE_DUST, ModPotions.STRONG_ENCHANTED_FERMENTED_SPIDER_EYE);

            STRONGER_ENCHANTED_FERMENTED_SPIDER_EYE = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "stronger_" + name),
                    new ModPotion(amplifier/2+1, "weakness", new StatusEffectInstance(StatusEffects.WEAKNESS, DEFAULT_DURATION / 2, amplifier + 2)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.ENCHANTED_FERMENTED_SPIDER_EYE, EnchantedItems.GLOWSTONE_DUST, ModPotions.STRONGER_ENCHANTED_FERMENTED_SPIDER_EYE);

            STRONGEST_ENCHANTED_FERMENTED_SPIDER_EYE = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "strongest_" + name),
                    new ModPotion(amplifier/2+1, "weakness", new StatusEffectInstance(StatusEffects.WEAKNESS, DEFAULT_DURATION / 2, amplifier + 3)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.ENCHANTED_FERMENTED_SPIDER_EYE, EnchantedItems.GLOWSTONE, ModPotions.STRONGEST_ENCHANTED_FERMENTED_SPIDER_EYE);

            BALANCED_ENCHANTED_FERMENTED_SPIDER_EYE = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "balanced_" + name),
                    new ModPotion(amplifier/2+1, "weakness", new StatusEffectInstance(StatusEffects.WEAKNESS, ENCHANTED_REDSTONE_DURATION, amplifier + 3)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.ENCHANTED_FERMENTED_SPIDER_EYE, EnchantedItems.REDSTONE_LAMP, ModPotions.BALANCED_ENCHANTED_FERMENTED_SPIDER_EYE);

        } else if (Objects.equals(name, "enchanted_sugar_slowness")) {
            ENCHANTED_SUGAR_SLOWNESS = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, name),
                    new ModPotion(amplifier/2, "slowness", new StatusEffectInstance(StatusEffects.SLOWNESS, DEFAULT_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.ENCHANTED_SUGAR, Items.FERMENTED_SPIDER_EYE, ModPotions.ENCHANTED_SUGAR_SLOWNESS);

            LONG_ENCHANTED_SUGAR_SLOWNESS = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "long_"+name),
                    new ModPotion(amplifier/2, "slowness", new StatusEffectInstance(StatusEffects.SLOWNESS, REDSTONE_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.ENCHANTED_SUGAR_SLOWNESS, Items.REDSTONE, ModPotions.LONG_ENCHANTED_SUGAR_SLOWNESS);

            STRONG_ENCHANTED_SUGAR_SLOWNESS = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "strong_"+name),
                    new ModPotion(amplifier/2, "slowness", new StatusEffectInstance(StatusEffects.SLOWNESS, DEFAULT_DURATION /2, amplifier+1)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.ENCHANTED_SUGAR_SLOWNESS, Items.GLOWSTONE_DUST, ModPotions.STRONG_ENCHANTED_SUGAR_SLOWNESS);

        } else if (Objects.equals(name, "enchanted_sugar_cane_slowness")) {
            ENCHANTED_SUGAR_CANE_SLOWNESS = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, name),
                    new ModPotion(amplifier/2, "slowness", new StatusEffectInstance(StatusEffects.SLOWNESS, DEFAULT_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.ENCHANTED_SUGAR_CANE, Items.FERMENTED_SPIDER_EYE, ModPotions.ENCHANTED_SUGAR_CANE_SLOWNESS);

            LONG_ENCHANTED_SUGAR_CANE_SLOWNESS = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "long_" + name),
                    new ModPotion(amplifier/2, "slowness", new StatusEffectInstance(StatusEffects.SLOWNESS, REDSTONE_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.ENCHANTED_SUGAR_CANE_SLOWNESS, Items.REDSTONE, ModPotions.LONG_ENCHANTED_SUGAR_CANE_SLOWNESS);

            LONGER_ENCHANTED_SUGAR_CANE_SLOWNESS = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "longer_" + name),
                    new ModPotion(amplifier/2, "slowness", new StatusEffectInstance(StatusEffects.SLOWNESS, ENCHANTED_REDSTONE_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.ENCHANTED_SUGAR_CANE_SLOWNESS, EnchantedItems.REDSTONE, ModPotions.LONGER_ENCHANTED_SUGAR_CANE_SLOWNESS);

            LONGEST_ENCHANTED_SUGAR_CANE_SLOWNESS = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "longest_" + name),
                    new ModPotion(amplifier/2, "slowness", new StatusEffectInstance(StatusEffects.SLOWNESS, ENCHANTED_REDSTONE_BLOCK_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.ENCHANTED_SUGAR_CANE_SLOWNESS, EnchantedItems.REDSTONE_BLOCK, ModPotions.LONGEST_ENCHANTED_SUGAR_CANE_SLOWNESS);

            STRONG_ENCHANTED_SUGAR_CANE_SLOWNESS = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "strong_" + name),
                    new ModPotion(amplifier/2, "slowness", new StatusEffectInstance(StatusEffects.SLOWNESS, DEFAULT_DURATION / 2, amplifier + 1)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.ENCHANTED_SUGAR_CANE_SLOWNESS, Items.GLOWSTONE_DUST, ModPotions.STRONG_ENCHANTED_SUGAR_CANE_SLOWNESS);

            STRONGER_ENCHANTED_SUGAR_CANE_SLOWNESS = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "stronger_" + name),
                    new ModPotion(amplifier/2+1, "slowness", new StatusEffectInstance(StatusEffects.SLOWNESS, DEFAULT_DURATION / 2, amplifier + 2)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.ENCHANTED_SUGAR_CANE_SLOWNESS, EnchantedItems.GLOWSTONE_DUST, ModPotions.STRONGER_ENCHANTED_SUGAR_CANE_SLOWNESS);

            STRONGEST_ENCHANTED_SUGAR_CANE_SLOWNESS = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "strongest_" + name),
                    new ModPotion(amplifier/2+1, "slowness", new StatusEffectInstance(StatusEffects.SLOWNESS, DEFAULT_DURATION / 2, amplifier + 3)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.ENCHANTED_SUGAR_CANE_SLOWNESS, EnchantedItems.GLOWSTONE, ModPotions.STRONGEST_ENCHANTED_SUGAR_CANE_SLOWNESS);

            BALANCED_ENCHANTED_SUGAR_CANE_SLOWNESS = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "balanced_" + name),
                    new ModPotion(amplifier/2+1, "slowness", new StatusEffectInstance(StatusEffects.SLOWNESS, ENCHANTED_REDSTONE_DURATION, amplifier + 3)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.ENCHANTED_SUGAR_CANE_SLOWNESS, EnchantedItems.REDSTONE_LAMP, ModPotions.BALANCED_ENCHANTED_SUGAR_CANE_SLOWNESS);

        } else if (Objects.equals(name, "enchanted_melon_slice_damage")) {
            ENCHANTED_MELON_SLICE_DAMAGE = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, name),
                    new ModPotion(amplifier/2, "harming", new StatusEffectInstance(StatusEffects.INSTANT_DAMAGE, DEFAULT_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.ENCHANTED_MELON_SLICE, Items.FERMENTED_SPIDER_EYE, ModPotions.ENCHANTED_MELON_SLICE_DAMAGE);

            STRONG_ENCHANTED_MELON_SLICE_DAMAGE = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "strong_"+name),
                    new ModPotion(amplifier/2, "harming", new StatusEffectInstance(StatusEffects.INSTANT_DAMAGE, DEFAULT_DURATION /2, amplifier+1)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.ENCHANTED_MELON_SLICE_DAMAGE, Items.GLOWSTONE_DUST, ModPotions.STRONG_ENCHANTED_MELON_SLICE_DAMAGE);

        } else if (Objects.equals(name, "enchanted_glistering_melon_damage")) {
            ENCHANTED_GLISTERING_MELON_DAMAGE = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, name),
                    new ModPotion(amplifier/2, "harming", new StatusEffectInstance(StatusEffects.INSTANT_DAMAGE, DEFAULT_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.ENCHANTED_GLISTERING_MELON, Items.FERMENTED_SPIDER_EYE, ModPotions.ENCHANTED_GLISTERING_MELON_DAMAGE);

            STRONG_ENCHANTED_GLISTERING_MELON_DAMAGE = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "strong_" + name),
                    new ModPotion(amplifier/2, "harming", new StatusEffectInstance(StatusEffects.INSTANT_DAMAGE, DEFAULT_DURATION / 2, amplifier + 1)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.ENCHANTED_GLISTERING_MELON_DAMAGE, Items.GLOWSTONE_DUST, ModPotions.STRONG_ENCHANTED_GLISTERING_MELON_DAMAGE);

            STRONGER_ENCHANTED_GLISTERING_MELON_DAMAGE = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "stronger_" + name),
                    new ModPotion(amplifier/2+1, "harming", new StatusEffectInstance(StatusEffects.INSTANT_DAMAGE, DEFAULT_DURATION / 2, amplifier + 2)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.ENCHANTED_GLISTERING_MELON_DAMAGE, EnchantedItems.GLOWSTONE_DUST, ModPotions.STRONGER_ENCHANTED_GLISTERING_MELON_DAMAGE);

            STRONGEST_ENCHANTED_GLISTERING_MELON_DAMAGE = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "strongest_" + name),
                    new ModPotion(amplifier/2+1, "harming", new StatusEffectInstance(StatusEffects.INSTANT_DAMAGE, DEFAULT_DURATION / 2, amplifier + 3)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.ENCHANTED_GLISTERING_MELON_DAMAGE, EnchantedItems.GLOWSTONE, ModPotions.STRONGEST_ENCHANTED_GLISTERING_MELON_DAMAGE);

        } else if (Objects.equals(name, "haste")) {
            HASTE = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, name),
                    new Potion(new StatusEffectInstance(StatusEffects.HASTE, DEFAULT_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.AWKWARD, Items.COAL, ModPotions.HASTE);

            LONG_HASTE = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "long_" + name),
                    new ModPotion(amplifier/2, "haste", new StatusEffectInstance(StatusEffects.HASTE, REDSTONE_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.HASTE, Items.REDSTONE, ModPotions.LONG_HASTE);

            LONGER_HASTE = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "longer_" + name),
                    new ModPotion(amplifier/2, "haste", new StatusEffectInstance(StatusEffects.HASTE, ENCHANTED_REDSTONE_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.HASTE, EnchantedItems.REDSTONE, ModPotions.LONGER_HASTE);

            LONGEST_HASTE = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "longest_" + name),
                    new ModPotion(amplifier/2, "haste", new StatusEffectInstance(StatusEffects.HASTE, ENCHANTED_REDSTONE_BLOCK_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.HASTE, EnchantedItems.REDSTONE_BLOCK, ModPotions.LONGEST_HASTE);

            STRONG_HASTE = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "strong_" + name),
                    new ModPotion(amplifier/2, "haste", new StatusEffectInstance(StatusEffects.HASTE, DEFAULT_DURATION / 2, amplifier+1)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.HASTE, Items.GLOWSTONE_DUST, ModPotions.STRONG_HASTE);

            STRONGER_HASTE = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "stronger_" + name),
                    new ModPotion(amplifier/2+1, "haste", new StatusEffectInstance(StatusEffects.HASTE, DEFAULT_DURATION / 2, amplifier+2)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.HASTE, EnchantedItems.GLOWSTONE_DUST, ModPotions.STRONGER_HASTE);

            STRONGEST_HASTE = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "strongest_" + name),
                    new ModPotion(amplifier/2+1, "haste", new StatusEffectInstance(StatusEffects.HASTE, DEFAULT_DURATION / 2, amplifier+3)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.HASTE, EnchantedItems.GLOWSTONE, ModPotions.STRONGEST_HASTE);

            BALANCED_HASTE = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "balanced_" + name),
                    new ModPotion(amplifier/2+1, "haste", new StatusEffectInstance(StatusEffects.HASTE, ENCHANTED_REDSTONE_DURATION, amplifier+3)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.HASTE, EnchantedItems.REDSTONE_LAMP, ModPotions.BALANCED_HASTE);

        } else if (Objects.equals(name, "rabbit")) {
            RABBIT = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, name),
                    new Potion(new StatusEffectInstance(ModStatusEffects.RABBIT, DEFAULT_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.AWKWARD, Items.RABBIT, ModPotions.RABBIT);

            LONG_RABBIT = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "long_" + name),
                    new ModPotion(amplifier/2, "rabbit", new StatusEffectInstance(ModStatusEffects.RABBIT, REDSTONE_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.HASTE, Items.REDSTONE, ModPotions.LONG_RABBIT);

            STRONG_RABBIT = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "strong_" + name),
                    new ModPotion(amplifier/2, "rabbit", new StatusEffectInstance(ModStatusEffects.RABBIT, DEFAULT_DURATION / 2, amplifier+1)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.HASTE, Items.GLOWSTONE_DUST, ModPotions.STRONG_RABBIT);

        } else if (Objects.equals(name, "enchanted_rabbit_foot")) {
            ENCHANTED_RABBIT_FOOT = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, name),
                    new ModPotion(amplifier/2, "rabbit", new StatusEffectInstance(ModStatusEffects.RABBIT, DEFAULT_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.AWKWARD, EnchantedItems.RABBIT_FOOT, ModPotions.ENCHANTED_RABBIT_FOOT);

            LONG_ENCHANTED_RABBIT_FOOT = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "long_" + name),
                    new ModPotion(amplifier/2, "rabbit", new StatusEffectInstance(ModStatusEffects.RABBIT, REDSTONE_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.ENCHANTED_RABBIT_FOOT, Items.REDSTONE, ModPotions.LONG_ENCHANTED_RABBIT_FOOT);

            LONGER_ENCHANTED_RABBIT_FOOT = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "longer_" + name),
                    new ModPotion(amplifier/2, "rabbit", new StatusEffectInstance(ModStatusEffects.RABBIT, ENCHANTED_REDSTONE_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.ENCHANTED_RABBIT_FOOT, EnchantedItems.REDSTONE, ModPotions.LONGER_ENCHANTED_RABBIT_FOOT);

            LONGEST_ENCHANTED_RABBIT_FOOT = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "longest_" + name),
                    new ModPotion(amplifier/2, "rabbit", new StatusEffectInstance(ModStatusEffects.RABBIT, ENCHANTED_REDSTONE_BLOCK_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.ENCHANTED_RABBIT_FOOT, EnchantedItems.REDSTONE_BLOCK, ModPotions.LONGEST_ENCHANTED_RABBIT_FOOT);

            STRONG_ENCHANTED_RABBIT_FOOT = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "strong_" + name),
                    new ModPotion(amplifier/2, "rabbit", new StatusEffectInstance(ModStatusEffects.RABBIT, DEFAULT_DURATION / 2, amplifier + 1)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.ENCHANTED_RABBIT_FOOT, Items.GLOWSTONE_DUST, ModPotions.STRONG_ENCHANTED_RABBIT_FOOT);

            STRONGER_ENCHANTED_RABBIT_FOOT = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "stronger_" + name),
                    new ModPotion(amplifier/2+1, "rabbit", new StatusEffectInstance(ModStatusEffects.RABBIT, DEFAULT_DURATION / 2, amplifier + 2)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.ENCHANTED_RABBIT_FOOT, EnchantedItems.GLOWSTONE_DUST, ModPotions.STRONGER_ENCHANTED_RABBIT_FOOT);

            STRONGEST_ENCHANTED_RABBIT_FOOT = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "strongest_" + name),
                    new ModPotion(amplifier/2+1, "rabbit", new StatusEffectInstance(ModStatusEffects.RABBIT, DEFAULT_DURATION / 2, amplifier + 3)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.ENCHANTED_RABBIT_FOOT, EnchantedItems.GLOWSTONE, ModPotions.STRONGEST_ENCHANTED_RABBIT_FOOT);

            BALANCED_ENCHANTED_RABBIT_FOOT = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "balanced_" + name),
                    new ModPotion(amplifier/2+1, "rabbit", new StatusEffectInstance(ModStatusEffects.RABBIT, ENCHANTED_REDSTONE_DURATION, amplifier + 3)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.ENCHANTED_RABBIT_FOOT, EnchantedItems.REDSTONE_LAMP, ModPotions.BALANCED_ENCHANTED_RABBIT_FOOT);

        } else if (Objects.equals(name, "burn")) {
            BURN = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, name),
                    new Potion(new StatusEffectInstance(ModStatusEffects.BURN, DEFAULT_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.AWKWARD, Items.RED_SAND, ModPotions.BURN);

            LONG_BURN = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "long_" + name),
                    new ModPotion(amplifier/2, "burn", new StatusEffectInstance(ModStatusEffects.BURN, REDSTONE_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.BURN, Items.REDSTONE, ModPotions.LONG_BURN);

            LONGER_BURN = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "longer_" + name),
                    new ModPotion(amplifier/2, "burn", new StatusEffectInstance(ModStatusEffects.BURN, ENCHANTED_REDSTONE_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.BURN, EnchantedItems.REDSTONE, ModPotions.LONGER_BURN);

            LONGEST_BURN = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "longest_" + name),
                    new ModPotion(amplifier/2, "burn", new StatusEffectInstance(ModStatusEffects.BURN, ENCHANTED_REDSTONE_BLOCK_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.BURN, EnchantedItems.REDSTONE_BLOCK, ModPotions.LONGEST_BURN);

            STRONG_BURN = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "strong_" + name),
                    new ModPotion(amplifier/2, "burn", new StatusEffectInstance(ModStatusEffects.BURN, DEFAULT_DURATION / 2, amplifier + 1)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.BURN, Items.GLOWSTONE_DUST, ModPotions.STRONG_BURN);

            STRONGER_BURN = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "stronger_" + name),
                    new ModPotion(amplifier/2+1, "burn", new StatusEffectInstance(ModStatusEffects.BURN, DEFAULT_DURATION / 2, amplifier + 2)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.BURN, EnchantedItems.GLOWSTONE_DUST, ModPotions.STRONGER_BURN);

            STRONGEST_BURN = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "strongest_" + name),
                    new ModPotion(amplifier/2+1, "burn", new StatusEffectInstance(ModStatusEffects.BURN, DEFAULT_DURATION / 2, amplifier + 3)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.BURN, EnchantedItems.GLOWSTONE, ModPotions.STRONGEST_BURN);

            BALANCED_BURN = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "balanced_" + name),
                    new ModPotion(amplifier/2+1, "burn", new StatusEffectInstance(ModStatusEffects.BURN, ENCHANTED_REDSTONE_DURATION, amplifier + 3)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.BURN, EnchantedItems.REDSTONE_LAMP, ModPotions.BALANCED_BURN);

        } else if (Objects.equals(name, "knockback")) {
            KNOCKBACK = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, name),
                    new Potion(new StatusEffectInstance(ModStatusEffects.KNOCKBACK, DEFAULT_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.AWKWARD, Items.SLIME_BALL, ModPotions.KNOCKBACK);

            LONG_KNOCKBACK = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "long_" + name),
                    new ModPotion(amplifier/2, "knockback", new StatusEffectInstance(ModStatusEffects.KNOCKBACK, REDSTONE_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.KNOCKBACK, Items.REDSTONE, ModPotions.LONG_KNOCKBACK);

            LONGER_KNOCKBACK = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "longer_" + name),
                    new ModPotion(amplifier/2, "knockback", new StatusEffectInstance(ModStatusEffects.KNOCKBACK, ENCHANTED_REDSTONE_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.KNOCKBACK, EnchantedItems.REDSTONE, ModPotions.LONGER_KNOCKBACK);

            LONGEST_KNOCKBACK = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "longest_" + name),
                    new ModPotion(amplifier/2, "knockback", new StatusEffectInstance(ModStatusEffects.KNOCKBACK, ENCHANTED_REDSTONE_BLOCK_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.KNOCKBACK, EnchantedItems.REDSTONE_BLOCK, ModPotions.LONGEST_KNOCKBACK);

            STRONG_KNOCKBACK = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "strong_" + name),
                    new ModPotion(amplifier/2, "knockback", new StatusEffectInstance(ModStatusEffects.KNOCKBACK, DEFAULT_DURATION / 2, amplifier + 1)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.KNOCKBACK, Items.GLOWSTONE_DUST, ModPotions.STRONG_KNOCKBACK);

            STRONGER_KNOCKBACK = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "stronger_" + name),
                    new ModPotion(amplifier/2+1, "knockback", new StatusEffectInstance(ModStatusEffects.KNOCKBACK, DEFAULT_DURATION / 2, amplifier + 2)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.KNOCKBACK, EnchantedItems.GLOWSTONE_DUST, ModPotions.STRONGER_KNOCKBACK);

            STRONGEST_KNOCKBACK = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "strongest_" + name),
                    new ModPotion(amplifier/2+1, "knockback", new StatusEffectInstance(ModStatusEffects.KNOCKBACK, DEFAULT_DURATION / 2, amplifier + 3)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.KNOCKBACK, EnchantedItems.GLOWSTONE, ModPotions.STRONGEST_KNOCKBACK);

            BALANCED_KNOCKBACK = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "balanced_" + name),
                    new ModPotion(amplifier/2+1, "knockback", new StatusEffectInstance(ModStatusEffects.KNOCKBACK, ENCHANTED_REDSTONE_DURATION, amplifier + 3)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.KNOCKBACK, EnchantedItems.REDSTONE_LAMP, ModPotions.BALANCED_KNOCKBACK);

        } else if (Objects.equals(name, "venomous")) {
            VENOMOUS = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, name),
                    new Potion(new StatusEffectInstance(ModStatusEffects.VENOMOUS, DEFAULT_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.AWKWARD, Items.POISONOUS_POTATO, ModPotions.VENOMOUS);

            LONG_VENOMOUS = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "long_" + name),
                    new ModPotion(amplifier/2, "venomous", new StatusEffectInstance(ModStatusEffects.VENOMOUS, REDSTONE_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.VENOMOUS, Items.REDSTONE, ModPotions.LONG_VENOMOUS);

            LONGER_VENOMOUS = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "longer_" + name),
                    new ModPotion(amplifier/2, "venomous", new StatusEffectInstance(ModStatusEffects.VENOMOUS, ENCHANTED_REDSTONE_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.VENOMOUS, EnchantedItems.REDSTONE, ModPotions.LONGER_VENOMOUS);

            LONGEST_VENOMOUS = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "longest_" + name),
                    new ModPotion(amplifier/2, "venomous", new StatusEffectInstance(ModStatusEffects.VENOMOUS, ENCHANTED_REDSTONE_BLOCK_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.VENOMOUS, EnchantedItems.REDSTONE_BLOCK, ModPotions.LONGEST_VENOMOUS);

            STRONG_VENOMOUS = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "strong_" + name),
                    new ModPotion(amplifier/2, "venomous", new StatusEffectInstance(ModStatusEffects.VENOMOUS, DEFAULT_DURATION / 2, amplifier + 1)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.VENOMOUS, Items.GLOWSTONE_DUST, ModPotions.STRONG_VENOMOUS);

            STRONGER_VENOMOUS = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "stronger_" + name),
                    new ModPotion(amplifier/2+1, "venomous", new StatusEffectInstance(ModStatusEffects.VENOMOUS, DEFAULT_DURATION / 2, amplifier + 2)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.VENOMOUS, EnchantedItems.GLOWSTONE_DUST, ModPotions.STRONGER_VENOMOUS);

            STRONGEST_VENOMOUS = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "strongest_" + name),
                    new ModPotion(amplifier/2+1, "venomous", new StatusEffectInstance(ModStatusEffects.VENOMOUS, DEFAULT_DURATION / 2, amplifier + 3)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.VENOMOUS, EnchantedItems.GLOWSTONE, ModPotions.STRONGEST_VENOMOUS);

            BALANCED_VENOMOUS = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "balanced_" + name),
                    new ModPotion(amplifier/2+1, "venomous", new StatusEffectInstance(ModStatusEffects.VENOMOUS, ENCHANTED_REDSTONE_DURATION, amplifier + 3)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.VENOMOUS, EnchantedItems.REDSTONE_LAMP, ModPotions.BALANCED_VENOMOUS);

        } else if (Objects.equals(name, "stun")) {
            STUN = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, name),
                    new Potion(new StatusEffectInstance(ModStatusEffects.STUN, DEFAULT_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.AWKWARD, Items.OBSIDIAN, ModPotions.STUN);

            LONG_STUN = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "long_" + name),
                    new ModPotion(amplifier/2, "stun", new StatusEffectInstance(ModStatusEffects.STUN, REDSTONE_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.STUN, Items.REDSTONE, ModPotions.LONG_STUN);

            LONGER_STUN = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "longer_" + name),
                    new ModPotion(amplifier/2, "stun", new StatusEffectInstance(ModStatusEffects.STUN, ENCHANTED_REDSTONE_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.STUN, EnchantedItems.REDSTONE, ModPotions.LONGER_STUN);

            LONGEST_STUN = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "longest_" + name),
                    new ModPotion(amplifier/2, "stun", new StatusEffectInstance(ModStatusEffects.STUN, ENCHANTED_REDSTONE_BLOCK_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.STUN, EnchantedItems.REDSTONE_BLOCK, ModPotions.LONGEST_STUN);

            STRONG_STUN = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "strong_" + name),
                    new ModPotion(amplifier/2, "stun", new StatusEffectInstance(ModStatusEffects.STUN, DEFAULT_DURATION / 2, amplifier + 1)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.STUN, Items.GLOWSTONE_DUST, ModPotions.STRONG_STUN);

            STRONGER_STUN = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "stronger_" + name),
                    new ModPotion(amplifier/2+1, "stun", new StatusEffectInstance(ModStatusEffects.STUN, DEFAULT_DURATION / 2, amplifier + 2)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.STUN, EnchantedItems.GLOWSTONE_DUST, ModPotions.STRONGER_STUN);

            STRONGEST_STUN = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "strongest_" + name),
                    new ModPotion(amplifier/2+1, "stun", new StatusEffectInstance(ModStatusEffects.STUN, DEFAULT_DURATION / 2, amplifier + 3)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.STUN, EnchantedItems.GLOWSTONE, ModPotions.STRONGEST_STUN);

            BALANCED_STUN = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "balanced_" + name),
                    new ModPotion(amplifier/2+1, "stun", new StatusEffectInstance(ModStatusEffects.STUN, ENCHANTED_REDSTONE_DURATION, amplifier + 3)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.STUN, EnchantedItems.REDSTONE_LAMP, ModPotions.BALANCED_STUN);

        } else if (Objects.equals(name, "archery")) {
            ARCHERY = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, name),
                    new Potion(new StatusEffectInstance(ModStatusEffects.ARCHERY, DEFAULT_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.AWKWARD, Items.FEATHER, ModPotions.ARCHERY);

            LONG_ARCHERY = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "long_" + name),
                    new ModPotion(amplifier/2, "archery", new StatusEffectInstance(ModStatusEffects.ARCHERY, REDSTONE_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.ARCHERY, Items.REDSTONE, ModPotions.LONG_ARCHERY);

            LONGER_ARCHERY = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "longer_" + name),
                    new ModPotion(amplifier/2, "archery", new StatusEffectInstance(ModStatusEffects.ARCHERY, ENCHANTED_REDSTONE_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.ARCHERY, EnchantedItems.REDSTONE, ModPotions.LONGER_ARCHERY);

            LONGEST_ARCHERY = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "longest_" + name),
                    new ModPotion(amplifier/2, "archery", new StatusEffectInstance(ModStatusEffects.ARCHERY, ENCHANTED_REDSTONE_BLOCK_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.ARCHERY, EnchantedItems.REDSTONE_BLOCK, ModPotions.LONGEST_ARCHERY);

            STRONG_ARCHERY = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "strong_" + name),
                    new ModPotion(amplifier/2, "archery", new StatusEffectInstance(ModStatusEffects.ARCHERY, DEFAULT_DURATION / 2, amplifier + 1)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.ARCHERY, Items.GLOWSTONE_DUST, ModPotions.STRONG_ARCHERY);

            STRONGER_ARCHERY = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "stronger_" + name),
                    new ModPotion(amplifier/2+1, "archery", new StatusEffectInstance(ModStatusEffects.ARCHERY, DEFAULT_DURATION / 2, amplifier + 2)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.ARCHERY, EnchantedItems.GLOWSTONE_DUST, ModPotions.STRONGER_ARCHERY);

            STRONGEST_ARCHERY = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "strongest_" + name),
                    new ModPotion(amplifier/2+1, "archery", new StatusEffectInstance(ModStatusEffects.ARCHERY, DEFAULT_DURATION / 2, amplifier + 3)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.ARCHERY, EnchantedItems.GLOWSTONE, ModPotions.STRONGEST_ARCHERY);

            BALANCED_ARCHERY = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "balanced_" + name),
                    new ModPotion(amplifier/2+1, "archery", new StatusEffectInstance(ModStatusEffects.ARCHERY, ENCHANTED_REDSTONE_DURATION, amplifier + 3)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.ARCHERY, EnchantedItems.REDSTONE_LAMP, ModPotions.BALANCED_ARCHERY);

        } else if (Objects.equals(name, "absorption")) {
            ABSORPTION = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, name),
                    new Potion(new StatusEffectInstance(StatusEffects.ABSORPTION, DEFAULT_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.AWKWARD, Items.GOLD_INGOT, ModPotions.ABSORPTION);

            LONG_ABSORPTION = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "long_" + name),
                    new ModPotion(amplifier/2, "absorption", new StatusEffectInstance(StatusEffects.ABSORPTION, REDSTONE_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.ABSORPTION, Items.REDSTONE, ModPotions.LONG_ABSORPTION);

            STRONG_ABSORPTION = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "strong_" + name),
                    new ModPotion(amplifier/2, "absorption", new StatusEffectInstance(StatusEffects.ABSORPTION, DEFAULT_DURATION / 2, amplifier + 1)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.ABSORPTION, Items.GLOWSTONE_DUST, ModPotions.STRONG_ABSORPTION);

        } else if (Objects.equals(name, "enchanted_gold_ingot")) {
            ENCHANTED_GOLD_INGOT = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, name),
                    new ModPotion(amplifier/2, "absorption", new StatusEffectInstance(StatusEffects.ABSORPTION, DEFAULT_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.AWKWARD, EnchantedItems.GOLD_INGOT, ModPotions.ENCHANTED_GOLD_INGOT);

            LONG_ENCHANTED_GOLD_INGOT = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "long_" + name),
                    new ModPotion(amplifier/2, "absorption", new StatusEffectInstance(StatusEffects.ABSORPTION, REDSTONE_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.ENCHANTED_GOLD_INGOT, Items.REDSTONE, ModPotions.LONG_ENCHANTED_GOLD_INGOT);

            STRONG_ENCHANTED_GOLD_INGOT = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "strong_" + name),
                    new ModPotion(amplifier/2, "absorption", new StatusEffectInstance(StatusEffects.ABSORPTION, DEFAULT_DURATION / 2, amplifier + 1)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.ENCHANTED_GOLD_INGOT, Items.GLOWSTONE_DUST, ModPotions.STRONG_ENCHANTED_GOLD_INGOT);

        } else if (Objects.equals(name, "enchanted_gold_block")) {
            ENCHANTED_GOLD_BLOCK = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, name),
                    new ModPotion(amplifier/2, "absorption", new StatusEffectInstance(StatusEffects.ABSORPTION, DEFAULT_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.AWKWARD, EnchantedItems.GOLD_BLOCK, ModPotions.ENCHANTED_GOLD_BLOCK);

            LONG_ENCHANTED_GOLD_BLOCK = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "long_" + name),
                    new ModPotion(amplifier/2, "absorption", new StatusEffectInstance(StatusEffects.ABSORPTION, REDSTONE_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.ENCHANTED_GOLD_BLOCK, Items.REDSTONE, ModPotions.LONG_ENCHANTED_GOLD_BLOCK);

            LONGER_ENCHANTED_GOLD_BLOCK = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "longer_" + name),
                    new ModPotion(amplifier/2, "absorption", new StatusEffectInstance(StatusEffects.ABSORPTION, ENCHANTED_REDSTONE_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.ENCHANTED_GOLD_BLOCK, EnchantedItems.REDSTONE, ModPotions.LONGER_ENCHANTED_GOLD_BLOCK);

            LONGEST_ENCHANTED_GOLD_BLOCK = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "longest_" + name),
                    new ModPotion(amplifier/2, "absorption", new StatusEffectInstance(StatusEffects.ABSORPTION, ENCHANTED_REDSTONE_BLOCK_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.ENCHANTED_GOLD_BLOCK, EnchantedItems.REDSTONE_BLOCK, ModPotions.LONGEST_ENCHANTED_GOLD_BLOCK);

            STRONG_ENCHANTED_GOLD_BLOCK = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "strong_" + name),
                    new ModPotion(amplifier/2, "absorption", new StatusEffectInstance(StatusEffects.ABSORPTION, DEFAULT_DURATION / 2, amplifier + 1)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.ENCHANTED_GOLD_BLOCK, Items.GLOWSTONE_DUST, ModPotions.STRONG_ENCHANTED_GOLD_BLOCK);

            STRONGER_ENCHANTED_GOLD_BLOCK = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "stronger_" + name),
                    new ModPotion(amplifier/2+1, "absorption", new StatusEffectInstance(StatusEffects.ABSORPTION, DEFAULT_DURATION / 2, amplifier + 2)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.ENCHANTED_GOLD_BLOCK, EnchantedItems.GLOWSTONE_DUST, ModPotions.STRONGER_ENCHANTED_GOLD_BLOCK);

            STRONGEST_ENCHANTED_GOLD_BLOCK = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "strongest_" + name),
                    new ModPotion(amplifier/2+1, "absorption", new StatusEffectInstance(StatusEffects.ABSORPTION, DEFAULT_DURATION / 2, amplifier + 3)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.ENCHANTED_GOLD_BLOCK, EnchantedItems.GLOWSTONE, ModPotions.STRONGEST_ENCHANTED_GOLD_BLOCK);

            BALANCED_ENCHANTED_GOLD_BLOCK = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "balanced_" + name),
                    new ModPotion(amplifier/2+1, "absorption", new StatusEffectInstance(StatusEffects.ABSORPTION, ENCHANTED_REDSTONE_DURATION, amplifier + 3)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.ENCHANTED_GOLD_BLOCK, EnchantedItems.REDSTONE_LAMP, ModPotions.BALANCED_ENCHANTED_GOLD_BLOCK);

        } else if (Objects.equals(name, "adrenaline")) {
            ADRENALINE = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, name),
                    new Potion(new StatusEffectInstance(ModStatusEffects.ADRENALINE, DEFAULT_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.AWKWARD, Items.COCOA_BEANS, ModPotions.ADRENALINE);

            LONG_ADRENALINE = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "long_" + name),
                    new ModPotion(amplifier/2, "adrenaline", new StatusEffectInstance(ModStatusEffects.ADRENALINE, REDSTONE_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.ADRENALINE, Items.REDSTONE, ModPotions.LONG_ADRENALINE);

            STRONG_ADRENALINE = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "strong_" + name),
                    new ModPotion(amplifier/2, "adrenaline", new StatusEffectInstance(ModStatusEffects.ADRENALINE, DEFAULT_DURATION / 2, amplifier + 1)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.ADRENALINE, Items.GLOWSTONE_DUST, ModPotions.STRONG_ADRENALINE);

        } else if (Objects.equals(name, "enchanted_cocoa_beans")) {
            ENCHANTED_COCOA_BEANS = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, name),
                    new ModPotion(amplifier/2, "adrenaline", new StatusEffectInstance(ModStatusEffects.ADRENALINE, DEFAULT_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.AWKWARD, EnchantedItems.COCOA_BEANS, ModPotions.ENCHANTED_COCOA_BEANS);

            LONG_ENCHANTED_COCOA_BEANS = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "long_" + name),
                    new ModPotion(amplifier/2, "adrenaline", new StatusEffectInstance(ModStatusEffects.ADRENALINE, REDSTONE_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.ENCHANTED_COCOA_BEANS, Items.REDSTONE, ModPotions.LONG_ENCHANTED_COCOA_BEANS);

            STRONG_ENCHANTED_COCOA_BEANS = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "strong_" + name),
                    new ModPotion(amplifier/2, "adrenaline", new StatusEffectInstance(ModStatusEffects.ADRENALINE, DEFAULT_DURATION / 2, amplifier + 1)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.ENCHANTED_COCOA_BEANS, Items.GLOWSTONE_DUST, ModPotions.STRONG_ENCHANTED_COCOA_BEANS);

        } else if (Objects.equals(name, "enchanted_cookie")) {
            ENCHANTED_COOKIE = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, name),
                    new ModPotion(amplifier/2, "adrenaline", new StatusEffectInstance(ModStatusEffects.ADRENALINE, DEFAULT_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.AWKWARD, EnchantedItems.COOKIE, ModPotions.ENCHANTED_COOKIE);

            LONG_ENCHANTED_COOKIE = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "long_" + name),
                    new ModPotion(amplifier/2, "adrenaline", new StatusEffectInstance(ModStatusEffects.ADRENALINE, REDSTONE_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.ENCHANTED_COOKIE, Items.REDSTONE, ModPotions.LONG_ENCHANTED_COOKIE);

            LONGER_ENCHANTED_COOKIE = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "longer_" + name),
                    new ModPotion(amplifier/2, "adrenaline", new StatusEffectInstance(ModStatusEffects.ADRENALINE, ENCHANTED_REDSTONE_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.ENCHANTED_COOKIE, EnchantedItems.REDSTONE, ModPotions.LONGER_ENCHANTED_COOKIE);

            LONGEST_ENCHANTED_COOKIE = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "longest_" + name),
                    new ModPotion(amplifier/2, "adrenaline", new StatusEffectInstance(ModStatusEffects.ADRENALINE, ENCHANTED_REDSTONE_BLOCK_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.ENCHANTED_COOKIE, EnchantedItems.REDSTONE_BLOCK, ModPotions.LONGEST_ENCHANTED_COOKIE);

            STRONG_ENCHANTED_COOKIE = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "strong_" + name),
                    new ModPotion(amplifier/2, "adrenaline", new StatusEffectInstance(ModStatusEffects.ADRENALINE, DEFAULT_DURATION / 2, amplifier + 1)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.ENCHANTED_COOKIE, Items.GLOWSTONE_DUST, ModPotions.STRONG_ENCHANTED_COOKIE);

            STRONGER_ENCHANTED_COOKIE = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "stronger_" + name),
                    new ModPotion(amplifier/2+1, "adrenaline", new StatusEffectInstance(ModStatusEffects.ADRENALINE, DEFAULT_DURATION / 2, amplifier + 2)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.ENCHANTED_COOKIE, EnchantedItems.GLOWSTONE_DUST, ModPotions.STRONGER_ENCHANTED_COOKIE);

            STRONGEST_ENCHANTED_COOKIE = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "strongest_" + name),
                    new ModPotion(amplifier/2+1, "adrenaline", new StatusEffectInstance(ModStatusEffects.ADRENALINE, DEFAULT_DURATION / 2, amplifier + 3)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.ENCHANTED_COOKIE, EnchantedItems.GLOWSTONE, ModPotions.STRONGEST_ENCHANTED_COOKIE);

            BALANCED_ENCHANTED_COOKIE = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "balanced_" + name),
                    new ModPotion(amplifier/2+1, "adrenaline", new StatusEffectInstance(ModStatusEffects.ADRENALINE, ENCHANTED_REDSTONE_DURATION, amplifier + 3)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.ENCHANTED_COOKIE, EnchantedItems.REDSTONE_LAMP, ModPotions.BALANCED_ENCHANTED_COOKIE);

        } else if (Objects.equals(name, "critical")) {
            CRITICAL = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, name),
                    new Potion(new StatusEffectInstance(ModStatusEffects.CRITICAL, DEFAULT_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.AWKWARD, Items.FLINT, ModPotions.CRITICAL);

            LONG_CRITICAL = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "long_" + name),
                    new ModPotion(amplifier/2, "critical", new StatusEffectInstance(ModStatusEffects.CRITICAL, REDSTONE_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.CRITICAL, Items.REDSTONE, ModPotions.LONG_CRITICAL);

            LONGER_CRITICAL = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "longer_" + name),
                    new ModPotion(amplifier/2, "critical", new StatusEffectInstance(ModStatusEffects.CRITICAL, ENCHANTED_REDSTONE_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.CRITICAL, EnchantedItems.REDSTONE, ModPotions.LONGER_CRITICAL);

            LONGEST_CRITICAL = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "longest_" + name),
                    new ModPotion(amplifier/2, "critical", new StatusEffectInstance(ModStatusEffects.CRITICAL, ENCHANTED_REDSTONE_BLOCK_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.CRITICAL, EnchantedItems.REDSTONE_BLOCK, ModPotions.LONGEST_CRITICAL);

            STRONG_CRITICAL = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "strong_" + name),
                    new ModPotion(amplifier/2, "critical", new StatusEffectInstance(ModStatusEffects.CRITICAL, DEFAULT_DURATION / 2, amplifier + 1)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.CRITICAL, Items.GLOWSTONE_DUST, ModPotions.STRONG_CRITICAL);

            STRONGER_CRITICAL = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "stronger_" + name),
                    new ModPotion(amplifier/2+1, "critical", new StatusEffectInstance(ModStatusEffects.CRITICAL, DEFAULT_DURATION / 2, amplifier + 2)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.CRITICAL, EnchantedItems.GLOWSTONE_DUST, ModPotions.STRONGER_CRITICAL);

            STRONGEST_CRITICAL = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "strongest_" + name),
                    new ModPotion(amplifier/2+1, "critical", new StatusEffectInstance(ModStatusEffects.CRITICAL, DEFAULT_DURATION / 2, amplifier + 3)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.CRITICAL, EnchantedItems.GLOWSTONE, ModPotions.STRONGEST_CRITICAL);

            BALANCED_CRITICAL = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "balanced_" + name),
                    new ModPotion(amplifier/2+1, "critical", new StatusEffectInstance(ModStatusEffects.CRITICAL, ENCHANTED_REDSTONE_DURATION, amplifier + 3)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.CRITICAL, EnchantedItems.REDSTONE_LAMP, ModPotions.BALANCED_CRITICAL);

        } else if (Objects.equals(name, "dodge")) {
            DODGE = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, name),
                    new Potion(new StatusEffectInstance(ModStatusEffects.DODGE, DEFAULT_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.AWKWARD, Items.SALMON, ModPotions.DODGE);

            LONG_DODGE = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "long_" + name),
                    new ModPotion(amplifier/2, "dodge", new StatusEffectInstance(ModStatusEffects.DODGE, REDSTONE_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.DODGE, Items.REDSTONE, ModPotions.LONG_DODGE);

            LONGER_DODGE = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "longer_" + name),
                    new ModPotion(amplifier/2, "dodge", new StatusEffectInstance(ModStatusEffects.DODGE, ENCHANTED_REDSTONE_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.DODGE, EnchantedItems.REDSTONE, ModPotions.LONGER_DODGE);

            LONGEST_DODGE = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "longest_" + name),
                    new ModPotion(amplifier/2, "dodge", new StatusEffectInstance(ModStatusEffects.DODGE, ENCHANTED_REDSTONE_BLOCK_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.DODGE, EnchantedItems.REDSTONE_BLOCK, ModPotions.LONGEST_DODGE);

            STRONG_DODGE = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "strong_" + name),
                    new ModPotion(amplifier/2, "dodge", new StatusEffectInstance(ModStatusEffects.DODGE, DEFAULT_DURATION / 2, amplifier + 1)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.DODGE, Items.GLOWSTONE_DUST, ModPotions.STRONG_DODGE);

            STRONGER_DODGE = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "stronger_" + name),
                    new ModPotion(amplifier/2+1, "dodge", new StatusEffectInstance(ModStatusEffects.DODGE, DEFAULT_DURATION / 2, amplifier + 2)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.DODGE, EnchantedItems.GLOWSTONE_DUST, ModPotions.STRONGER_DODGE);

            STRONGEST_DODGE = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "strongest_" + name),
                    new ModPotion(amplifier/2+1, "dodge", new StatusEffectInstance(ModStatusEffects.DODGE, DEFAULT_DURATION / 2, amplifier + 3)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.DODGE, EnchantedItems.GLOWSTONE, ModPotions.STRONGEST_DODGE);

            BALANCED_DODGE = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "balanced_" + name),
                    new ModPotion(amplifier/2+1, "dodge", new StatusEffectInstance(ModStatusEffects.DODGE, ENCHANTED_REDSTONE_DURATION, amplifier + 3)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.DODGE, EnchantedItems.REDSTONE_LAMP, ModPotions.BALANCED_DODGE);

        } else if (Objects.equals(name, "agility")) {
            AGILITY = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, name),
                    new Potion(new StatusEffectInstance(ModStatusEffects.AGILITY, DEFAULT_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.AWKWARD, EnchantedItems.CAKE, ModPotions.AGILITY);

            LONG_AGILITY = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "long_" + name),
                    new ModPotion(amplifier/2, "agility", new StatusEffectInstance(ModStatusEffects.AGILITY, REDSTONE_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.AGILITY, Items.REDSTONE, ModPotions.LONG_AGILITY);

            LONGER_AGILITY = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "longer_" + name),
                    new ModPotion(amplifier/2, "agility", new StatusEffectInstance(ModStatusEffects.AGILITY, ENCHANTED_REDSTONE_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.AGILITY, EnchantedItems.REDSTONE, ModPotions.LONGER_AGILITY);

            LONGEST_AGILITY = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "longest_" + name),
                    new ModPotion(amplifier/2, "agility", new StatusEffectInstance(ModStatusEffects.AGILITY, ENCHANTED_REDSTONE_BLOCK_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.AGILITY, EnchantedItems.REDSTONE_BLOCK, ModPotions.LONGEST_AGILITY);

            STRONG_AGILITY = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "strong_" + name),
                    new ModPotion(amplifier/2, "agility", new StatusEffectInstance(ModStatusEffects.AGILITY, DEFAULT_DURATION / 2, amplifier + 1)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.AGILITY, Items.GLOWSTONE_DUST, ModPotions.STRONG_AGILITY);

            STRONGER_AGILITY = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "stronger_" + name),
                    new ModPotion(amplifier/2+1, "agility", new StatusEffectInstance(ModStatusEffects.AGILITY, DEFAULT_DURATION / 2, amplifier + 2)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.AGILITY, EnchantedItems.GLOWSTONE_DUST, ModPotions.STRONGER_AGILITY);

            STRONGEST_AGILITY = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "strongest_" + name),
                    new ModPotion(amplifier/2+1, "agility", new StatusEffectInstance(ModStatusEffects.AGILITY, DEFAULT_DURATION / 2, amplifier + 3)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.AGILITY, EnchantedItems.GLOWSTONE, ModPotions.STRONGEST_AGILITY);

            BALANCED_AGILITY = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "balanced_" + name),
                    new ModPotion(amplifier/2+1, "agility", new StatusEffectInstance(ModStatusEffects.AGILITY, ENCHANTED_REDSTONE_DURATION, amplifier + 3)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.AGILITY, EnchantedItems.REDSTONE_LAMP, ModPotions.BALANCED_AGILITY);

        } else if (Objects.equals(name, "wounded")) {
            WOUNDED = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, name),
                    new Potion(new StatusEffectInstance(ModStatusEffects.WOUNDED, DEFAULT_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.AWKWARD, Items.NETHERRACK, ModPotions.WOUNDED);

            LONG_WOUNDED = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "long_" + name),
                    new ModPotion(amplifier/2, "wounded", new StatusEffectInstance(ModStatusEffects.WOUNDED, REDSTONE_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.WOUNDED, Items.REDSTONE, ModPotions.LONG_WOUNDED);

            LONGER_WOUNDED = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "longer_" + name),
                    new ModPotion(amplifier/2, "wounded", new StatusEffectInstance(ModStatusEffects.WOUNDED, ENCHANTED_REDSTONE_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.WOUNDED, EnchantedItems.REDSTONE, ModPotions.LONGER_WOUNDED);

            LONGEST_WOUNDED = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "longest_" + name),
                    new ModPotion(amplifier/2, "wounded", new StatusEffectInstance(ModStatusEffects.WOUNDED, ENCHANTED_REDSTONE_BLOCK_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.WOUNDED, EnchantedItems.REDSTONE_BLOCK, ModPotions.LONGEST_WOUNDED);

            STRONG_WOUNDED = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "strong_" + name),
                    new ModPotion(amplifier/2, "wounded", new StatusEffectInstance(ModStatusEffects.WOUNDED, DEFAULT_DURATION / 2, amplifier + 1)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.WOUNDED, Items.GLOWSTONE_DUST, ModPotions.STRONG_WOUNDED);

            STRONGER_WOUNDED = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "stronger_" + name),
                    new ModPotion(amplifier/2+1, "wounded", new StatusEffectInstance(ModStatusEffects.WOUNDED, DEFAULT_DURATION / 2, amplifier + 2)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.WOUNDED, EnchantedItems.GLOWSTONE_DUST, ModPotions.STRONGER_WOUNDED);

            STRONGEST_WOUNDED = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "strongest_" + name),
                    new ModPotion(amplifier/2+1, "wounded", new StatusEffectInstance(ModStatusEffects.WOUNDED, DEFAULT_DURATION / 2, amplifier + 3)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.WOUNDED, EnchantedItems.GLOWSTONE, ModPotions.STRONGEST_WOUNDED);

            BALANCED_WOUNDED = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "balanced_" + name),
                    new ModPotion(amplifier/2+1, "wounded", new StatusEffectInstance(ModStatusEffects.WOUNDED, ENCHANTED_REDSTONE_DURATION, amplifier + 3)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.WOUNDED, EnchantedItems.REDSTONE_LAMP, ModPotions.BALANCED_WOUNDED);

        } else if (Objects.equals(name, "experience")) {
            EXPERIENCE = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, name),
                    new Potion(new StatusEffectInstance(ModStatusEffects.EXPERIENCE, DEFAULT_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.AWKWARD, Items.LAPIS_LAZULI, ModPotions.EXPERIENCE);

            LONG_EXPERIENCE = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "long_" + name),
                    new ModPotion(amplifier/2, "experience", new StatusEffectInstance(ModStatusEffects.EXPERIENCE, REDSTONE_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.EXPERIENCE, Items.REDSTONE, ModPotions.LONG_EXPERIENCE);

            LONGER_EXPERIENCE = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "longer_" + name),
                    new ModPotion(amplifier/2, "experience", new StatusEffectInstance(ModStatusEffects.EXPERIENCE, ENCHANTED_REDSTONE_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.EXPERIENCE, EnchantedItems.REDSTONE, ModPotions.LONGER_EXPERIENCE);

            LONGEST_EXPERIENCE = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "longest_" + name),
                    new ModPotion(amplifier/2, "experience", new StatusEffectInstance(ModStatusEffects.EXPERIENCE, ENCHANTED_REDSTONE_BLOCK_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.EXPERIENCE, EnchantedItems.REDSTONE_BLOCK, ModPotions.LONGEST_EXPERIENCE);

            STRONG_EXPERIENCE = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "strong_" + name),
                    new ModPotion(amplifier/2, "experience", new StatusEffectInstance(ModStatusEffects.EXPERIENCE, DEFAULT_DURATION / 2, amplifier + 1)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.EXPERIENCE, Items.GLOWSTONE_DUST, ModPotions.STRONG_EXPERIENCE);

            STRONGER_EXPERIENCE = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "stronger_" + name),
                    new ModPotion(amplifier/2+1, "experience", new StatusEffectInstance(ModStatusEffects.EXPERIENCE, DEFAULT_DURATION / 2, amplifier + 2)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.EXPERIENCE, EnchantedItems.GLOWSTONE_DUST, ModPotions.STRONGER_EXPERIENCE);

            STRONGEST_EXPERIENCE = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "strongest_" + name),
                    new ModPotion(amplifier/2+1, "experience", new StatusEffectInstance(ModStatusEffects.EXPERIENCE, DEFAULT_DURATION / 2, amplifier + 3)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.EXPERIENCE, EnchantedItems.GLOWSTONE, ModPotions.STRONGEST_EXPERIENCE);

            BALANCED_EXPERIENCE = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "balanced_" + name),
                    new ModPotion(amplifier/2+1, "experience", new StatusEffectInstance(ModStatusEffects.EXPERIENCE, ENCHANTED_REDSTONE_DURATION, amplifier + 3)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.EXPERIENCE, EnchantedItems.REDSTONE_LAMP, ModPotions.BALANCED_EXPERIENCE);

        } else if (Objects.equals(name, "resistance")) {
            RESISTANCE = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, name),
                    new Potion(new StatusEffectInstance(StatusEffects.RESISTANCE, DEFAULT_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.AWKWARD, Items.CACTUS, ModPotions.RESISTANCE);

            LONG_RESISTANCE = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "long_" + name),
                    new ModPotion(amplifier/2, "resistance", new StatusEffectInstance(StatusEffects.RESISTANCE, REDSTONE_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.RESISTANCE, Items.REDSTONE, ModPotions.LONG_RESISTANCE);

            STRONG_RESISTANCE = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "strong_" + name),
                    new ModPotion(amplifier/2, "resistance", new StatusEffectInstance(StatusEffects.RESISTANCE, DEFAULT_DURATION / 2, amplifier + 1)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.RESISTANCE, Items.GLOWSTONE_DUST, ModPotions.STRONG_RESISTANCE);

        } else if (Objects.equals(name, "enchanted_cactus_green")) {
            ENCHANTED_CACTUS_GREEN = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, name),
                    new ModPotion(amplifier/2, "resistance", new StatusEffectInstance(StatusEffects.RESISTANCE, DEFAULT_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.AWKWARD, EnchantedItems.GREEN_DYE, ModPotions.ENCHANTED_CACTUS_GREEN);

            LONG_ENCHANTED_CACTUS_GREEN = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "long_" + name),
                    new ModPotion(amplifier/2, "resistance", new StatusEffectInstance(StatusEffects.RESISTANCE, REDSTONE_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.ENCHANTED_CACTUS_GREEN, Items.REDSTONE, ModPotions.LONG_ENCHANTED_CACTUS_GREEN);

            STRONG_ENCHANTED_CACTUS_GREEN = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "strong_" + name),
                    new ModPotion(amplifier/2, "resistance", new StatusEffectInstance(StatusEffects.RESISTANCE, DEFAULT_DURATION / 2, amplifier + 1)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.ENCHANTED_CACTUS_GREEN, Items.GLOWSTONE_DUST, ModPotions.STRONG_ENCHANTED_CACTUS_GREEN);

        } else if (Objects.equals(name, "enchanted_cactus")) {
            ENCHANTED_CACTUS = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, name),
                    new ModPotion(amplifier/2, "resistance", new StatusEffectInstance(StatusEffects.RESISTANCE, DEFAULT_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.AWKWARD, EnchantedItems.CACTUS, ModPotions.ENCHANTED_CACTUS);

            LONG_ENCHANTED_CACTUS = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "long_" + name),
                    new ModPotion(amplifier/2, "resistance", new StatusEffectInstance(StatusEffects.RESISTANCE, REDSTONE_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.ENCHANTED_CACTUS, Items.REDSTONE, ModPotions.LONG_ENCHANTED_CACTUS);

            LONGER_ENCHANTED_CACTUS = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "longer_" + name),
                    new ModPotion(amplifier/2, "resistance", new StatusEffectInstance(StatusEffects.RESISTANCE, ENCHANTED_REDSTONE_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.ENCHANTED_CACTUS, EnchantedItems.REDSTONE, ModPotions.LONGER_ENCHANTED_CACTUS);

            LONGEST_ENCHANTED_CACTUS = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "longest_" + name),
                    new ModPotion(amplifier/2, "resistance", new StatusEffectInstance(StatusEffects.RESISTANCE, ENCHANTED_REDSTONE_BLOCK_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.ENCHANTED_CACTUS, EnchantedItems.REDSTONE_BLOCK, ModPotions.LONGEST_ENCHANTED_CACTUS);

            STRONG_ENCHANTED_CACTUS = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "strong_" + name),
                    new ModPotion(amplifier/2, "resistance", new StatusEffectInstance(StatusEffects.RESISTANCE, DEFAULT_DURATION / 2, amplifier + 1)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.ENCHANTED_CACTUS, Items.GLOWSTONE_DUST, ModPotions.STRONG_ENCHANTED_CACTUS);

            STRONGER_ENCHANTED_CACTUS = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "stronger_" + name),
                    new ModPotion(amplifier/2+1, "resistance", new StatusEffectInstance(StatusEffects.RESISTANCE, DEFAULT_DURATION / 2, amplifier + 2)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.ENCHANTED_CACTUS, EnchantedItems.GLOWSTONE_DUST, ModPotions.STRONGER_ENCHANTED_CACTUS);

            STRONGEST_ENCHANTED_CACTUS = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "strongest_" + name),
                    new ModPotion(amplifier/2+1, "resistance", new StatusEffectInstance(StatusEffects.RESISTANCE, DEFAULT_DURATION / 2, amplifier + 3)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.ENCHANTED_CACTUS, EnchantedItems.GLOWSTONE, ModPotions.STRONGEST_ENCHANTED_CACTUS);

            BALANCED_ENCHANTED_CACTUS = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "balanced_" + name),
                    new ModPotion(amplifier/2+1, "resistance", new StatusEffectInstance(StatusEffects.RESISTANCE, ENCHANTED_REDSTONE_DURATION, amplifier + 3)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.ENCHANTED_CACTUS, EnchantedItems.REDSTONE_LAMP, ModPotions.BALANCED_ENCHANTED_CACTUS);

        } else if (Objects.equals(name, "mana")) {
            MANA = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, name),
                    new Potion(new StatusEffectInstance(ModStatusEffects.MANA, DEFAULT_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.AWKWARD, Items.MUTTON, ModPotions.MANA);

            LONG_MANA = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "long_" + name),
                    new ModPotion(amplifier/2, "mana", new StatusEffectInstance(ModStatusEffects.MANA, REDSTONE_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.MANA, Items.REDSTONE, ModPotions.LONG_MANA);

            STRONG_MANA = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "strong_" + name),
                    new ModPotion(amplifier/2, "mana", new StatusEffectInstance(ModStatusEffects.MANA, DEFAULT_DURATION / 2, amplifier + 1)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.MANA, Items.GLOWSTONE_DUST, ModPotions.STRONG_MANA);

        } else if (Objects.equals(name, "enchanted_mutton")) {
            ENCHANTED_MUTTON = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, name),
                    new ModPotion(amplifier/2, "mana", new StatusEffectInstance(ModStatusEffects.MANA, DEFAULT_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.AWKWARD, EnchantedItems.MUTTON, ModPotions.ENCHANTED_MUTTON);

            LONG_ENCHANTED_MUTTON = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "long_" + name),
                    new ModPotion(amplifier/2, "mana", new StatusEffectInstance(ModStatusEffects.MANA, REDSTONE_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.ENCHANTED_MUTTON, Items.REDSTONE, ModPotions.LONG_ENCHANTED_MUTTON);

            STRONG_ENCHANTED_MUTTON = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "strong_" + name),
                    new ModPotion(amplifier/2, "mana", new StatusEffectInstance(ModStatusEffects.MANA, DEFAULT_DURATION / 2, amplifier + 1)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.ENCHANTED_MUTTON, Items.GLOWSTONE_DUST, ModPotions.STRONG_ENCHANTED_MUTTON);

        } else if (Objects.equals(name, "enchanted_cooked_mutton")) {
            ENCHANTED_COOKED_MUTTON = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, name),
                    new ModPotion(amplifier/2, "mana", new StatusEffectInstance(ModStatusEffects.MANA, DEFAULT_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.AWKWARD, EnchantedItems.COOKED_MUTTON, ModPotions.ENCHANTED_COOKED_MUTTON);

            LONG_ENCHANTED_COOKED_MUTTON = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "long_" + name),
                    new ModPotion(amplifier/2, "mana", new StatusEffectInstance(ModStatusEffects.MANA, REDSTONE_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.ENCHANTED_COOKED_MUTTON, Items.REDSTONE, ModPotions.LONG_ENCHANTED_COOKED_MUTTON);

            LONGER_ENCHANTED_COOKED_MUTTON = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "longer_" + name),
                    new ModPotion(amplifier/2, "mana", new StatusEffectInstance(ModStatusEffects.MANA, ENCHANTED_REDSTONE_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.ENCHANTED_COOKED_MUTTON, EnchantedItems.REDSTONE, ModPotions.LONGER_ENCHANTED_COOKED_MUTTON);

            LONGEST_ENCHANTED_COOKED_MUTTON = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "longest_" + name),
                    new ModPotion(amplifier/2, "mana", new StatusEffectInstance(ModStatusEffects.MANA, ENCHANTED_REDSTONE_BLOCK_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.ENCHANTED_COOKED_MUTTON, EnchantedItems.REDSTONE_BLOCK, ModPotions.LONGEST_ENCHANTED_COOKED_MUTTON);

            STRONG_ENCHANTED_COOKED_MUTTON = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "strong_" + name),
                    new ModPotion(amplifier/2, "mana", new StatusEffectInstance(ModStatusEffects.MANA, DEFAULT_DURATION / 2, amplifier + 1)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.ENCHANTED_COOKED_MUTTON, Items.GLOWSTONE_DUST, ModPotions.STRONG_ENCHANTED_COOKED_MUTTON);

            STRONGER_ENCHANTED_COOKED_MUTTON = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "stronger_" + name),
                    new ModPotion(amplifier/2+1, "mana", new StatusEffectInstance(ModStatusEffects.MANA, DEFAULT_DURATION / 2, amplifier + 2)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.ENCHANTED_COOKED_MUTTON, EnchantedItems.GLOWSTONE_DUST, ModPotions.STRONGER_ENCHANTED_COOKED_MUTTON);

            STRONGEST_ENCHANTED_COOKED_MUTTON = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "strongest_" + name),
                    new ModPotion(amplifier/2+1, "mana", new StatusEffectInstance(ModStatusEffects.MANA, DEFAULT_DURATION / 2, amplifier + 3)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.ENCHANTED_COOKED_MUTTON, EnchantedItems.GLOWSTONE, ModPotions.STRONGEST_ENCHANTED_COOKED_MUTTON);

            BALANCED_ENCHANTED_COOKED_MUTTON = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "balanced_" + name),
                    new ModPotion(amplifier/2+1, "mana", new StatusEffectInstance(ModStatusEffects.MANA, ENCHANTED_REDSTONE_DURATION, amplifier + 3)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.ENCHANTED_COOKED_MUTTON, EnchantedItems.REDSTONE_LAMP, ModPotions.BALANCED_ENCHANTED_COOKED_MUTTON);

        } else if (Objects.equals(name, "stamina")) {
            STAMINA = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, name),
                    new Potion(new StatusEffectInstance(ModStatusEffects.STAMINA, DEFAULT_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.AWKWARD, ModItems.FOUL_FLESH, ModPotions.STAMINA);

            STRONG_STAMINA = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "strong_" + name),
                    new ModPotion(amplifier/2, "stamina", new StatusEffectInstance(ModStatusEffects.STAMINA, DEFAULT_DURATION / 2, amplifier + 1)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.STAMINA, Items.GLOWSTONE_DUST, ModPotions.STRONG_STAMINA);

            STRONGER_STAMINA = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "stronger_" + name),
                    new ModPotion(amplifier/2+1, "stamina", new StatusEffectInstance(ModStatusEffects.STAMINA, DEFAULT_DURATION / 2, amplifier + 2)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.STAMINA, EnchantedItems.GLOWSTONE_DUST, ModPotions.STRONGER_STAMINA);

            STRONGEST_STAMINA = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "strongest_" + name),
                    new ModPotion(amplifier/2+1, "stamina", new StatusEffectInstance(ModStatusEffects.STAMINA, DEFAULT_DURATION / 2, amplifier + 3)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.STAMINA, EnchantedItems.GLOWSTONE, ModPotions.STRONGEST_STAMINA);

        } else if (Objects.equals(name, "blindness")) {
            BLINDNESS = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, name),
                    new Potion(new StatusEffectInstance(StatusEffects.BLINDNESS, DEFAULT_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.AWKWARD, Items.INK_SAC, ModPotions.BLINDNESS);

            LONG_BLINDNESS = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "long_" + name),
                    new ModPotion(amplifier/2, "blindness", new StatusEffectInstance(StatusEffects.BLINDNESS, REDSTONE_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.BLINDNESS, Items.REDSTONE, ModPotions.LONG_BLINDNESS);

            STRONG_BLINDNESS = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "strong_" + name),
                    new ModPotion(amplifier/2, "blindness", new StatusEffectInstance(StatusEffects.BLINDNESS, DEFAULT_DURATION / 2, amplifier + 1)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.BLINDNESS, Items.GLOWSTONE_DUST, ModPotions.STRONG_BLINDNESS);

        } else if (Objects.equals(name, "enchanted_ink_sac")) {
            ENCHANTED_INK_SAC = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, name),
                    new ModPotion(amplifier/2, "blindness", new StatusEffectInstance(StatusEffects.BLINDNESS, DEFAULT_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.AWKWARD, EnchantedItems.INK_SAC, ModPotions.ENCHANTED_INK_SAC);

        } else if (Objects.equals(name, "true_resistance")) {
            TRUE_RESISTANCE = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, name),
                    new Potion(new StatusEffectInstance(ModStatusEffects.TRUE_RESISTANCE, DEFAULT_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.AWKWARD, ModItems.TRUE_ESSENCE, ModPotions.TRUE_RESISTANCE);

            LONG_TRUE_RESISTANCE = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "long_" + name),
                    new ModPotion(amplifier/2, "true_resistance", new StatusEffectInstance(ModStatusEffects.TRUE_RESISTANCE, REDSTONE_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.TRUE_RESISTANCE, Items.REDSTONE, ModPotions.LONG_TRUE_RESISTANCE);

            LONGER_TRUE_RESISTANCE = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "longer_" + name),
                    new ModPotion(amplifier/2, "true_resistance", new StatusEffectInstance(ModStatusEffects.TRUE_RESISTANCE, ENCHANTED_REDSTONE_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.TRUE_RESISTANCE, EnchantedItems.REDSTONE, ModPotions.LONGER_TRUE_RESISTANCE);

            LONGEST_TRUE_RESISTANCE = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "longest_" + name),
                    new ModPotion(amplifier/2, "true_resistance", new StatusEffectInstance(ModStatusEffects.TRUE_RESISTANCE, ENCHANTED_REDSTONE_BLOCK_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.TRUE_RESISTANCE, EnchantedItems.REDSTONE_BLOCK, ModPotions.LONGEST_TRUE_RESISTANCE);

            STRONG_TRUE_RESISTANCE = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "strong_" + name),
                    new ModPotion(amplifier/2, "true_resistance", new StatusEffectInstance(ModStatusEffects.TRUE_RESISTANCE, DEFAULT_DURATION / 2, amplifier + 1)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.TRUE_RESISTANCE, Items.GLOWSTONE_DUST, ModPotions.STRONG_TRUE_RESISTANCE);

            STRONGER_TRUE_RESISTANCE = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "stronger_" + name),
                    new ModPotion(amplifier/2+1, "true_resistance", new StatusEffectInstance(ModStatusEffects.TRUE_RESISTANCE, DEFAULT_DURATION / 2, amplifier + 2)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.TRUE_RESISTANCE, EnchantedItems.GLOWSTONE_DUST, ModPotions.STRONGER_TRUE_RESISTANCE);

            STRONGEST_TRUE_RESISTANCE = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "strongest_" + name),
                    new ModPotion(amplifier/2+1, "true_resistance", new StatusEffectInstance(ModStatusEffects.TRUE_RESISTANCE, DEFAULT_DURATION / 2, amplifier + 3)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.TRUE_RESISTANCE, EnchantedItems.GLOWSTONE, ModPotions.STRONGEST_TRUE_RESISTANCE);

            BALANCED_TRUE_RESISTANCE = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "balanced_" + name),
                    new ModPotion(amplifier/2+1, "true_resistance", new StatusEffectInstance(ModStatusEffects.TRUE_RESISTANCE, ENCHANTED_REDSTONE_DURATION, amplifier + 3)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.TRUE_RESISTANCE, EnchantedItems.REDSTONE_LAMP, ModPotions.BALANCED_TRUE_RESISTANCE);

        } else if (Objects.equals(name, "pet_luck")) {
            PET_LUCK = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, name),
                    new Potion(new StatusEffectInstance(ModStatusEffects.PET_LUCK, DEFAULT_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.AWKWARD, EnchantedItems.RABBIT_HIDE, ModPotions.PET_LUCK);

            LONG_PET_LUCK = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "long_" + name),
                    new ModPotion(amplifier/2, "pet_luck", new StatusEffectInstance(ModStatusEffects.PET_LUCK, REDSTONE_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.PET_LUCK, Items.REDSTONE, ModPotions.LONG_PET_LUCK);

            LONGER_PET_LUCK = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "longer_" + name),
                    new ModPotion(amplifier/2, "pet_luck", new StatusEffectInstance(ModStatusEffects.PET_LUCK, ENCHANTED_REDSTONE_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.PET_LUCK, EnchantedItems.REDSTONE, ModPotions.LONGER_PET_LUCK);

            LONGEST_PET_LUCK = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "longest_" + name),
                    new ModPotion(amplifier/2, "pet_luck", new StatusEffectInstance(ModStatusEffects.PET_LUCK, ENCHANTED_REDSTONE_BLOCK_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.PET_LUCK, EnchantedItems.REDSTONE_BLOCK, ModPotions.LONGEST_PET_LUCK);

            STRONG_PET_LUCK = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "strong_" + name),
                    new ModPotion(amplifier/2, "pet_luck", new StatusEffectInstance(ModStatusEffects.PET_LUCK, DEFAULT_DURATION / 2, amplifier + 1)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.PET_LUCK, Items.GLOWSTONE_DUST, ModPotions.STRONG_PET_LUCK);

            STRONGER_PET_LUCK = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "stronger_" + name),
                    new ModPotion(amplifier/2+1, "pet_luck", new StatusEffectInstance(ModStatusEffects.PET_LUCK, DEFAULT_DURATION / 2, amplifier + 2)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.PET_LUCK, EnchantedItems.GLOWSTONE_DUST, ModPotions.STRONGER_PET_LUCK);

            STRONGEST_PET_LUCK = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "strongest_" + name),
                    new ModPotion(amplifier/2+1, "pet_luck", new StatusEffectInstance(ModStatusEffects.PET_LUCK, DEFAULT_DURATION / 2, amplifier + 3)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.PET_LUCK, EnchantedItems.GLOWSTONE, ModPotions.STRONGEST_PET_LUCK);

            BALANCED_PET_LUCK = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "balanced_" + name),
                    new ModPotion(amplifier/2+1, "pet_luck", new StatusEffectInstance(ModStatusEffects.PET_LUCK, ENCHANTED_REDSTONE_DURATION, amplifier + 3)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.PET_LUCK, EnchantedItems.REDSTONE_LAMP, ModPotions.BALANCED_PET_LUCK);

        } else if (Objects.equals(name, "spelunker")) {
            SPELUNKER = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, name),
                    new Potion(new StatusEffectInstance(ModStatusEffects.SPELUNKER, DEFAULT_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.AWKWARD, ModItems.MITHRIL, ModPotions.SPELUNKER);

            LONG_SPELUNKER = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "long_" + name),
                    new ModPotion(amplifier/2, "spelunker", new StatusEffectInstance(ModStatusEffects.SPELUNKER, REDSTONE_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.SPELUNKER, Items.REDSTONE, ModPotions.LONG_SPELUNKER);

            LONGER_SPELUNKER = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "longer_" + name),
                    new ModPotion(amplifier/2, "spelunker", new StatusEffectInstance(ModStatusEffects.SPELUNKER, ENCHANTED_REDSTONE_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.SPELUNKER, EnchantedItems.REDSTONE, ModPotions.LONGER_SPELUNKER);

            LONGEST_SPELUNKER = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "longest_" + name),
                    new ModPotion(amplifier/2, "spelunker", new StatusEffectInstance(ModStatusEffects.SPELUNKER, ENCHANTED_REDSTONE_BLOCK_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.SPELUNKER, EnchantedItems.REDSTONE_BLOCK, ModPotions.LONGEST_SPELUNKER);

            STRONG_SPELUNKER = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "strong_" + name),
                    new ModPotion(amplifier/2, "spelunker", new StatusEffectInstance(ModStatusEffects.SPELUNKER, DEFAULT_DURATION / 2, amplifier + 1)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.SPELUNKER, Items.GLOWSTONE_DUST, ModPotions.STRONG_SPELUNKER);

            STRONGER_SPELUNKER = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "stronger_" + name),
                    new ModPotion(amplifier/2+1, "spelunker", new StatusEffectInstance(ModStatusEffects.SPELUNKER, DEFAULT_DURATION / 2, amplifier + 2)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.SPELUNKER, EnchantedItems.GLOWSTONE_DUST, ModPotions.STRONGER_SPELUNKER);

            STRONGEST_SPELUNKER = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "strongest_" + name),
                    new ModPotion(amplifier/2+1, "spelunker", new StatusEffectInstance(ModStatusEffects.SPELUNKER, DEFAULT_DURATION / 2, amplifier + 3)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.SPELUNKER, EnchantedItems.GLOWSTONE, ModPotions.STRONGEST_SPELUNKER);

            BALANCED_SPELUNKER = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "balanced_" + name),
                    new ModPotion(amplifier/2+1, "spelunker", new StatusEffectInstance(ModStatusEffects.SPELUNKER, ENCHANTED_REDSTONE_DURATION, amplifier + 3)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.SPELUNKER, EnchantedItems.REDSTONE_LAMP, ModPotions.BALANCED_SPELUNKER);

        } else if (Objects.equals(name, "spirit")) {
            SPIRIT = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, name),
                    new Potion(new StatusEffectInstance(ModStatusEffects.SPIRIT, DEFAULT_DURATION, amplifier)));

            LONG_SPIRIT = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "long_" + name),
                    new ModPotion(amplifier/2, "spirit", new StatusEffectInstance(ModStatusEffects.SPIRIT, REDSTONE_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.SPIRIT, Items.REDSTONE, ModPotions.LONG_SPIRIT);

            LONGER_SPIRIT = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "longer_" + name),
                    new ModPotion(amplifier/2, "spirit", new StatusEffectInstance(ModStatusEffects.SPIRIT, ENCHANTED_REDSTONE_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.SPIRIT, EnchantedItems.REDSTONE, ModPotions.LONGER_SPIRIT);

            LONGEST_SPIRIT = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "longest_" + name),
                    new ModPotion(amplifier/2, "spirit", new StatusEffectInstance(ModStatusEffects.SPIRIT, ENCHANTED_REDSTONE_BLOCK_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.SPIRIT, EnchantedItems.REDSTONE_BLOCK, ModPotions.LONGEST_SPIRIT);

            STRONG_SPIRIT = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "strong_" + name),
                    new ModPotion(amplifier/2, "spirit", new StatusEffectInstance(ModStatusEffects.SPIRIT, DEFAULT_DURATION / 2, amplifier + 1)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.SPIRIT, Items.GLOWSTONE_DUST, ModPotions.STRONG_SPIRIT);

            STRONGER_SPIRIT = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "stronger_" + name),
                    new ModPotion(amplifier/2+1, "spirit", new StatusEffectInstance(ModStatusEffects.SPIRIT, DEFAULT_DURATION / 2, amplifier + 2)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.SPIRIT, EnchantedItems.GLOWSTONE_DUST, ModPotions.STRONGER_SPIRIT);

            STRONGEST_SPIRIT = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "strongest_" + name),
                    new ModPotion(amplifier/2+1, "spirit", new StatusEffectInstance(ModStatusEffects.SPIRIT, DEFAULT_DURATION / 2, amplifier + 3)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.SPIRIT, EnchantedItems.GLOWSTONE, ModPotions.STRONGEST_SPIRIT);

            BALANCED_SPIRIT = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "balanced_" + name),
                    new ModPotion(amplifier/2+1, "spirit", new StatusEffectInstance(ModStatusEffects.SPIRIT, ENCHANTED_REDSTONE_DURATION, amplifier + 3)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.SPIRIT, EnchantedItems.REDSTONE_LAMP, ModPotions.BALANCED_SPIRIT);

        } else if (Objects.equals(name, "luck")) {
            LONG_LUCK = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "long_" + name),
                    new ModPotion(amplifier/2, "luck", new StatusEffectInstance(StatusEffects.LUCK, REDSTONE_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.LUCK, Items.REDSTONE, ModPotions.LONG_LUCK);

            LONGER_LUCK = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "longer_" + name),
                    new ModPotion(amplifier/2, "luck", new StatusEffectInstance(StatusEffects.LUCK, ENCHANTED_REDSTONE_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.LUCK, EnchantedItems.REDSTONE, ModPotions.LONGER_LUCK);

            LONGEST_LUCK = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "longest_" + name),
                    new ModPotion(amplifier/2, "luck", new StatusEffectInstance(StatusEffects.LUCK, ENCHANTED_REDSTONE_BLOCK_DURATION, amplifier)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.LUCK, EnchantedItems.REDSTONE_BLOCK, ModPotions.LONGEST_LUCK);

            STRONG_LUCK = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "strong_" + name),
                    new ModPotion(amplifier/2, "luck", new StatusEffectInstance(StatusEffects.LUCK, DEFAULT_DURATION / 2, amplifier + 1)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.LUCK, Items.GLOWSTONE_DUST, ModPotions.STRONG_LUCK);

            STRONGER_LUCK = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "stronger_" + name),
                    new ModPotion(amplifier/2+1, "luck", new StatusEffectInstance(StatusEffects.LUCK, DEFAULT_DURATION / 2, amplifier + 2)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.LUCK, EnchantedItems.GLOWSTONE_DUST, ModPotions.STRONGER_LUCK);

            STRONGEST_LUCK = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "strongest_" + name),
                    new ModPotion(amplifier/2+1, "luck", new StatusEffectInstance(StatusEffects.LUCK, DEFAULT_DURATION / 2, amplifier + 3)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.LUCK, EnchantedItems.GLOWSTONE, ModPotions.STRONGEST_LUCK);

            BALANCED_LUCK = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, "balanced_" + name),
                    new ModPotion(amplifier/2+1, "luck", new StatusEffectInstance(StatusEffects.LUCK, ENCHANTED_REDSTONE_DURATION, amplifier + 3)));
            BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.LUCK, EnchantedItems.REDSTONE_LAMP, ModPotions.BALANCED_LUCK);

        } else if (Objects.equals(name, "wisps_ice_flavored_water")) {
            WISPS_ICE_FLAVORED_WATER = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, name),
                    new Potion(new StatusEffectInstance(ModStatusEffects.WISPS_ICE_FLAVORED_WATER, DEFAULT_DURATION, amplifier)));

        } else if (Objects.equals(name, "mushed_glowy_tonic")) {
            MUSHED_GLOWY_TONIC = Registry.register(Registries.POTION, new Identifier(Skyblock.MOD_ID, name),
                    new Potion(new StatusEffectInstance(ModStatusEffects.MUSHED_GLOWY_TONIC, DEFAULT_DURATION, amplifier)));

        }
    }

    public static void registerPotions() {
        registerPotion("enchanted_sugar", 2);
        registerPotion("enchanted_sugar_cane", 4);
        registerPotion("jump_boost", 0);
        registerPotion("enchanted_melon_slice", 2);
        registerPotion("enchanted_glistering_melon", 4);
        registerPotion("poison", 0);
        registerPotion("water_breathing", 0);
        registerPotion("fire_resistance", 0);
        registerPotion("night_vision", 0);
        registerPotion("enchanted_blaze_powder", 2);
        registerPotion("enchanted_blaze_rod", 4);
        registerPotion("invisibility", 0);
        registerPotion("regeneration", 0);
        registerPotion("enchanted_ghast_tear", 4);
        registerPotion("enchanted_spider_eye", 2);
        registerPotion("enchanted_fermented_spider_eye", 4);
        registerPotion("enchanted_sugar_slowness", 2);
        registerPotion("enchanted_sugar_cane_slowness", 4);
        registerPotion("enchanted_melon_slice_damage", 2);
        registerPotion("enchanted_glistering_melon_damage", 4);
        registerPotion("haste", 0);
        registerPotion("rabbit", 0);
        registerPotion("enchanted_rabbit_foot", 2);
        registerPotion("burn", 0);
        registerPotion("knockback", 0);
        registerPotion("venomous", 0);
        registerPotion("stun", 0);
        registerPotion("archery", 0);
        registerPotion("absorption", 0);
        registerPotion("enchanted_gold_ingot", 2);
        registerPotion("enchanted_gold_block", 4);
        registerPotion("adrenaline", 0);
        registerPotion("enchanted_cocoa_beans", 2);
        registerPotion("enchanted_cookie", 4);
        registerPotion("critical", 0);
        registerPotion("dodge", 0);
        registerPotion("agility", 0);
        registerPotion("wounded", 0);
        registerPotion("experience", 0);
        registerPotion("resistance", 0);
        registerPotion("enchanted_cactus_green", 2);
        registerPotion("enchanted_cactus", 4);
        registerPotion("mana", 0);
        registerPotion("enchanted_mutton", 2);
        registerPotion("enchanted_cooked_mutton", 4);
        registerPotion("stamina", 0);
        registerPotion("blindness", 0);
        registerPotion("enchanted_ink_sac", 2);
        registerPotion("true_resistance", 0);
        registerPotion("pet_luck", 0);
        registerPotion("spelunker", 0);
        registerPotion("spirit", 0);
        registerPotion("luck", 0);
        registerPotion("wisps_ice_flavored_water", 0);
        registerPotion("mushed_glowy_tonic", 0);
    }
}
