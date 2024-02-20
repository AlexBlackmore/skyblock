package net.skyblock.enchantment;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.skyblock.Skyblock;
import net.skyblock.enchantment.custom.*;

public class ModEnchantments {
    public static Enchantment CLEAVE = Registry.register(Registries.ENCHANTMENT, new Identifier(Skyblock.MOD_ID, "cleave"),
            new CleaveEnchantment(Enchantment.Rarity.COMMON,
                    EnchantmentTarget.WEAPON, EquipmentSlot.MAINHAND));
    public static Enchantment CRITICAL = Registry.register(Registries.ENCHANTMENT, new Identifier(Skyblock.MOD_ID, "critical"),
            new CriticalEnchantment(Enchantment.Rarity.COMMON,
                    EnchantmentTarget.WEAPON, EquipmentSlot.MAINHAND));
    public static Enchantment CUBISM = Registry.register(Registries.ENCHANTMENT, new Identifier(Skyblock.MOD_ID, "cubism"),
            new CubismEnchantment(Enchantment.Rarity.COMMON,
                    EnchantmentTarget.WEAPON, EquipmentSlot.MAINHAND));
    public static Enchantment DRAGON_HUNTER = Registry.register(Registries.ENCHANTMENT, new Identifier(Skyblock.MOD_ID, "dragon_hunter"),
            new DragonHunterEnchantment(Enchantment.Rarity.UNCOMMON,
                    EnchantmentTarget.WEAPON, EquipmentSlot.MAINHAND));
    public static Enchantment DIVINE_GIFT = Registry.register(Registries.ENCHANTMENT, new Identifier(Skyblock.MOD_ID, "divine_gift"),
            new DivineGiftEnchantment(Enchantment.Rarity.VERY_RARE,
                    EnchantmentTarget.WEAPON, EquipmentSlot.MAINHAND));
    public static Enchantment ENDER_SLAYER = Registry.register(Registries.ENCHANTMENT, new Identifier(Skyblock.MOD_ID, "ender_slayer"),
            new EnderSlayerEnchantment(Enchantment.Rarity.COMMON,
                    EnchantmentTarget.WEAPON, EquipmentSlot.MAINHAND));
    public static Enchantment EXECUTE = Registry.register(Registries.ENCHANTMENT, new Identifier(Skyblock.MOD_ID, "execute"),
            new ExecuteEnchantment(Enchantment.Rarity.UNCOMMON,
                    EnchantmentTarget.WEAPON, EquipmentSlot.MAINHAND));
    public static Enchantment EXPERIENCE = Registry.register(Registries.ENCHANTMENT, new Identifier(Skyblock.MOD_ID, "experience"),
            new ExperienceEnchantment(Enchantment.Rarity.UNCOMMON,
                    EnchantmentTarget.WEAPON, EquipmentSlot.MAINHAND));
    public static Enchantment FIRST_STRIKE = Registry.register(Registries.ENCHANTMENT, new Identifier(Skyblock.MOD_ID, "first_strike"),
            new FirstStrikeEnchantment(Enchantment.Rarity.UNCOMMON,
                    EnchantmentTarget.WEAPON, EquipmentSlot.MAINHAND));
    public static Enchantment GIANT_KILLER = Registry.register(Registries.ENCHANTMENT, new Identifier(Skyblock.MOD_ID, "giant_killer"),
            new GiantKillerEnchantment(Enchantment.Rarity.COMMON,
                    EnchantmentTarget.WEAPON, EquipmentSlot.MAINHAND));
    public static Enchantment LETHALITY = Registry.register(Registries.ENCHANTMENT, new Identifier(Skyblock.MOD_ID, "lethality"),
            new LethalityEnchantment(Enchantment.Rarity.UNCOMMON,
                    EnchantmentTarget.WEAPON, EquipmentSlot.MAINHAND));
    public static Enchantment LIFE_STEAL = Registry.register(Registries.ENCHANTMENT, new Identifier(Skyblock.MOD_ID, "life_steal"),
            new LifeStealEnchantment(Enchantment.Rarity.UNCOMMON,
                    EnchantmentTarget.WEAPON, EquipmentSlot.MAINHAND));
    public static Enchantment LUCK = Registry.register(Registries.ENCHANTMENT, new Identifier(Skyblock.MOD_ID, "luck"),
            new LuckEnchantment(Enchantment.Rarity.COMMON,
                    EnchantmentTarget.WEAPON, EquipmentSlot.MAINHAND));
    public static Enchantment PROSECUTE = Registry.register(Registries.ENCHANTMENT, new Identifier(Skyblock.MOD_ID, "prosecute"),
            new ProsecuteEnchantment(Enchantment.Rarity.UNCOMMON,
                    EnchantmentTarget.WEAPON, EquipmentSlot.MAINHAND));
    public static Enchantment SMOLDERING = Registry.register(Registries.ENCHANTMENT, new Identifier(Skyblock.MOD_ID, "smoldering"),
            new SmolderingEnchantment(Enchantment.Rarity.COMMON,
                    EnchantmentTarget.WEAPON, EquipmentSlot.MAINHAND));
    public static Enchantment TITAN_KILLER = Registry.register(Registries.ENCHANTMENT, new Identifier(Skyblock.MOD_ID, "titan_killer"),
            new TitanKillerEnchantment(Enchantment.Rarity.UNCOMMON,
                    EnchantmentTarget.WEAPON, EquipmentSlot.MAINHAND));
    public static Enchantment THUNDERBOLT = Registry.register(Registries.ENCHANTMENT, new Identifier(Skyblock.MOD_ID, "thunderbolt"),
            new ThunderboltEnchantment(Enchantment.Rarity.UNCOMMON,
                    EnchantmentTarget.WEAPON, EquipmentSlot.MAINHAND));

    public static void registerModEnchantments() {
        Skyblock.LOGGER.info("Registering Mod Enchantments for " + Skyblock.MOD_ID);
    }

}
