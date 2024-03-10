package net.skyblock.attribute;

import net.minecraft.entity.attribute.ClampedEntityAttribute;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.skyblock.Skyblock;

public class ModEntityAttributes {
    private static final double ARBITRARY_MAX = 2048;

    //Combat stats
    public static EntityAttribute STRENGTH = Registry.register(Registries.ATTRIBUTE, "generic.strength",
            new ClampedEntityAttribute("attribute.name.generic.strength", 0.0, 0.0, ARBITRARY_MAX).setTracked(true));
    public static EntityAttribute INTELLIGENCE = Registry.register(Registries.ATTRIBUTE, "generic.intelligence",
            new ClampedEntityAttribute("attribute.name.generic.intelligence", 100.0, 0.0, ARBITRARY_MAX).setTracked(true));
    public static EntityAttribute CRIT_DAMAGE = Registry.register(Registries.ATTRIBUTE, "generic.crit_damage",
            new ClampedEntityAttribute("attribute.name.generic.crit_damage", 0.5, 0.0, ARBITRARY_MAX).setTracked(true));
    public static EntityAttribute CRIT_CHANCE = Registry.register(Registries.ATTRIBUTE, "generic.crit_chance",
            new ClampedEntityAttribute("attribute.name.generic.crit_chance", 0.3, 0.0, ARBITRARY_MAX).setTracked(true));
    public static EntityAttribute FEROCITY = Registry.register(Registries.ATTRIBUTE, "generic.ferocity",
            new ClampedEntityAttribute("attribute.name.generic.ferocity", 0.0, 0.0, 5.0).setTracked(true));
    public static EntityAttribute ABILITY_DAMAGE = Registry.register(Registries.ATTRIBUTE, "generic.ability_damage",
            new ClampedEntityAttribute("attribute.name.generic.ability_damage", 1.0, 0.0, ARBITRARY_MAX).setTracked(true));
    public static EntityAttribute HEALTH_REGEN = Registry.register(Registries.ATTRIBUTE, "generic.health_regen",
            new ClampedEntityAttribute("attribute.name.generic.health_regen", 1.0, 0.0, ARBITRARY_MAX).setTracked(true));
    public static EntityAttribute VITALITY = Registry.register(Registries.ATTRIBUTE, "generic.vitality",
            new ClampedEntityAttribute("attribute.name.generic.vitality", 1.0, 0.0, ARBITRARY_MAX).setTracked(true));

    //Misc. stats
    public static EntityAttribute SEA_CREATURE_CHANCE = Registry.register(Registries.ATTRIBUTE, "player.sea_creature_chance",
            new ClampedEntityAttribute("attribute.name.player.sea_creature_chance", 0.2, 0.0, 1.0).setTracked(true));
    public static EntityAttribute PET_LUCK = Registry.register(Registries.ATTRIBUTE, "player.pet_luck",
            new ClampedEntityAttribute("attribute.name.player.pet_luck", 1.0, 0.0, ARBITRARY_MAX).setTracked(true));
    public static EntityAttribute FISHING_SPEED = Registry.register(Registries.ATTRIBUTE, "player.fishing_speed",
            new ClampedEntityAttribute("attribute.name.player.fishing_speed", 1.0, 0.0, 350).setTracked(true));

    //Wisdom stats
    public static EntityAttribute COMBAT_WISDOM = Registry.register(Registries.ATTRIBUTE, "wisdom.combat",
            new ClampedEntityAttribute("attribute.name.wisdom.combat", 1.0, 0.0, ARBITRARY_MAX).setTracked(true));
    public static EntityAttribute MINING_WISDOM = Registry.register(Registries.ATTRIBUTE, "wisdom.mining",
            new ClampedEntityAttribute("attribute.name.wisdom.mining", 1.0, 0.0, ARBITRARY_MAX).setTracked(true));
    public static EntityAttribute FARMING_WISDOM = Registry.register(Registries.ATTRIBUTE, "wisdom.farming",
            new ClampedEntityAttribute("attribute.name.wisdom.farming", 1.0, 0.0, ARBITRARY_MAX).setTracked(true));
    public static EntityAttribute FORAGING_WISDOM = Registry.register(Registries.ATTRIBUTE, "wisdom.foraging",
            new ClampedEntityAttribute("attribute.name.wisdom.foraging", 1.0, 0.0, ARBITRARY_MAX).setTracked(true));
    public static EntityAttribute ENCHANTING_WISDOM = Registry.register(Registries.ATTRIBUTE, "wisdom.enchanting",
            new ClampedEntityAttribute("attribute.name.wisdom.enchanting", 1.0, 0.0, ARBITRARY_MAX).setTracked(true));
    public static EntityAttribute ALCHEMY_WISDOM = Registry.register(Registries.ATTRIBUTE, "wisdom.alchemy",
            new ClampedEntityAttribute("attribute.name.wisdom.alchemy", 1.0, 0.0, ARBITRARY_MAX).setTracked(true));
    public static EntityAttribute FISHING_WISDOM = Registry.register(Registries.ATTRIBUTE, "wisdom.fishing",
            new ClampedEntityAttribute("attribute.name.wisdom.fishing", 1.0, 0.0, ARBITRARY_MAX).setTracked(true));

    //Gathering stats
    public static EntityAttribute MINING_SPEED = Registry.register(Registries.ATTRIBUTE, "player.mining_speed",
            new ClampedEntityAttribute("attribute.name.player.mining_speed", 1.0, 0.0, ARBITRARY_MAX).setTracked(true));
    public static EntityAttribute PRISTINE = Registry.register(Registries.ATTRIBUTE, "player.pristine",
            new ClampedEntityAttribute("attribute.name.player.pristine", 1.0, 0.0, ARBITRARY_MAX).setTracked(true));
    public static EntityAttribute FORAGING_FORTUNE = Registry.register(Registries.ATTRIBUTE, "fortune.foraging",
            new ClampedEntityAttribute("attribute.name.fortune.foraging", 1.0, 0.0, ARBITRARY_MAX).setTracked(true));
    public static EntityAttribute FARMING_FORTUNE = Registry.register(Registries.ATTRIBUTE, "fortune.farming",
            new ClampedEntityAttribute("attribute.name.fortune.farming", 1.0, 0.0, ARBITRARY_MAX).setTracked(true));
    public static EntityAttribute MINING_FORTUNE = Registry.register(Registries.ATTRIBUTE, "fortune.mining",
            new ClampedEntityAttribute("attribute.name.fortune.mining", 1.0, 0.0, ARBITRARY_MAX).setTracked(true));

    public static void registerEntityAttributes() {
        Skyblock.LOGGER.info("Registering Mod Entity Attributes for " + Skyblock.MOD_ID);
    }

    public static double getCritChance(PlayerEntity player) {
        double chance = 0;
        chance += player.getAttributeValue(ModEntityAttributes.CRIT_CHANCE);
        return chance;
    }
    public static double getCritDamage(PlayerEntity player) {
        double damage = 0;
        damage += player.getAttributeValue(ModEntityAttributes.CRIT_DAMAGE);
//        int level = EnchantmentHelper.getEquipmentLevel(ModEnchantments.CRITICAL, player);
//        damage += level * 0.1;
//        if (level >= 6) { damage += 0.1; }
//        if (level >= 7) { damage += 0.2; }
        return damage;
    }
}
