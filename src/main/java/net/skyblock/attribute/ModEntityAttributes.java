package net.skyblock.attribute;

import net.minecraft.entity.attribute.ClampedEntityAttribute;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.skyblock.Skyblock;

public class ModEntityAttributes {
    private static final double ARBITRARY_MAX = Double.MAX_VALUE;

    //Combat stats
    public static RegistryEntry<EntityAttribute> INTELLIGENCE = Registry.registerReference(Registries.ATTRIBUTE, Identifier.ofVanilla("generic.intelligence"),
            new ClampedEntityAttribute("attribute.name.intelligence", 100.0, 0.0, ARBITRARY_MAX).setTracked(true));
    public static RegistryEntry<EntityAttribute> CRIT_DAMAGE = Registry.registerReference(Registries.ATTRIBUTE, Identifier.ofVanilla("generic.crit_damage"),
            new ClampedEntityAttribute("attribute.name.crit_damage", 0.5, 0.0, ARBITRARY_MAX).setTracked(true));
    public static RegistryEntry<EntityAttribute> CRIT_CHANCE = Registry.registerReference(Registries.ATTRIBUTE, Identifier.ofVanilla("generic.crit_chance"),
            new ClampedEntityAttribute("attribute.name.crit_chance", 0.3, 0.0, ARBITRARY_MAX).setTracked(true));
    public static RegistryEntry<EntityAttribute> FEROCITY = Registry.registerReference(Registries.ATTRIBUTE, Identifier.ofVanilla("generic.ferocity"),
            new ClampedEntityAttribute("attribute.name.ferocity", 0.0, 0.0, 5.0).setTracked(true));
    public static RegistryEntry<EntityAttribute> ABILITY_DAMAGE = Registry.registerReference(Registries.ATTRIBUTE, Identifier.ofVanilla("generic.ability_damage"),
            new ClampedEntityAttribute("attribute.name.ability_damage", 1.0, 0.0, ARBITRARY_MAX).setTracked(true));
    public static RegistryEntry<EntityAttribute> HEALTH_REGEN = Registry.registerReference(Registries.ATTRIBUTE, Identifier.ofVanilla("generic.health_regen"),
            new ClampedEntityAttribute("attribute.name.health_regen", 1.0, 0.0, ARBITRARY_MAX).setTracked(true));
    public static RegistryEntry<EntityAttribute> VITALITY = Registry.registerReference(Registries.ATTRIBUTE, Identifier.ofVanilla("generic.vitality"),
            new ClampedEntityAttribute("attribute.name.vitality", 1.0, 0.0, ARBITRARY_MAX).setTracked(true));

    //Misc. stats
    public static RegistryEntry<EntityAttribute> SEA_CREATURE_CHANCE = Registry.registerReference(Registries.ATTRIBUTE, Identifier.ofVanilla("player.sea_creature_chance"),
            new ClampedEntityAttribute("attribute.name.sea_creature_chance", 0.2, 0.0, 1.0).setTracked(true));
    public static RegistryEntry<EntityAttribute> PET_LUCK = Registry.registerReference(Registries.ATTRIBUTE, Identifier.ofVanilla("player.pet_luck"),
            new ClampedEntityAttribute("attribute.name.pet_luck", 1.0, 0.0, ARBITRARY_MAX).setTracked(true));
    public static RegistryEntry<EntityAttribute> FISHING_SPEED = Registry.registerReference(Registries.ATTRIBUTE, Identifier.ofVanilla("player.fishing_speed"),
            new ClampedEntityAttribute("attribute.name.fishing_speed", 1.0, 0.0, 350).setTracked(true));

    //Wisdom stats
    public static RegistryEntry<EntityAttribute> COMBAT_WISDOM = Registry.registerReference(Registries.ATTRIBUTE, Identifier.ofVanilla("wisdom.combat"),
            new ClampedEntityAttribute("attribute.name.wisdom.combat", 1.0, 0.0, ARBITRARY_MAX).setTracked(true));
    public static RegistryEntry<EntityAttribute> MINING_WISDOM = Registry.registerReference(Registries.ATTRIBUTE, Identifier.ofVanilla("wisdom.mining"),
            new ClampedEntityAttribute("attribute.name.wisdom.mining", 1.0, 0.0, ARBITRARY_MAX).setTracked(true));
    public static RegistryEntry<EntityAttribute> FARMING_WISDOM = Registry.registerReference(Registries.ATTRIBUTE, Identifier.ofVanilla("wisdom.farming"),
            new ClampedEntityAttribute("attribute.name.wisdom.farming", 1.0, 0.0, ARBITRARY_MAX).setTracked(true));
    public static RegistryEntry<EntityAttribute> FORAGING_WISDOM = Registry.registerReference(Registries.ATTRIBUTE, Identifier.ofVanilla("wisdom.foraging"),
            new ClampedEntityAttribute("attribute.name.wisdom.foraging", 1.0, 0.0, ARBITRARY_MAX).setTracked(true));
    public static RegistryEntry<EntityAttribute> ENCHANTING_WISDOM = Registry.registerReference(Registries.ATTRIBUTE, Identifier.ofVanilla("wisdom.enchanting"),
            new ClampedEntityAttribute("attribute.name.wisdom.enchanting", 1.0, 0.0, ARBITRARY_MAX).setTracked(true));
    public static RegistryEntry<EntityAttribute> ALCHEMY_WISDOM = Registry.registerReference(Registries.ATTRIBUTE, Identifier.ofVanilla("wisdom.alchemy"),
            new ClampedEntityAttribute("attribute.name.wisdom.alchemy", 1.0, 0.0, ARBITRARY_MAX).setTracked(true));
    public static RegistryEntry<EntityAttribute> FISHING_WISDOM = Registry.registerReference(Registries.ATTRIBUTE, Identifier.ofVanilla("wisdom.fishing"),
            new ClampedEntityAttribute("attribute.name.wisdom.fishing", 1.0, 0.0, ARBITRARY_MAX).setTracked(true));

    //Gathering stats
    public static RegistryEntry<EntityAttribute> PRISTINE = Registry.registerReference(Registries.ATTRIBUTE, Identifier.ofVanilla("player.pristine"),
            new ClampedEntityAttribute("attribute.name.pristine", 1.0, 0.0, ARBITRARY_MAX).setTracked(true));
    public static RegistryEntry<EntityAttribute> FORAGING_FORTUNE = Registry.registerReference(Registries.ATTRIBUTE, Identifier.ofVanilla("fortune.foraging"),
            new ClampedEntityAttribute("attribute.name.fortune.foraging", 1.0, 0.0, ARBITRARY_MAX).setTracked(true));

    public static RegistryEntry<EntityAttribute> FARMING_FORTUNE = Registry.registerReference(Registries.ATTRIBUTE, Identifier.ofVanilla("fortune.farming"),
            new ClampedEntityAttribute("attribute.name.fortune.farming", 1.0, 0.0, ARBITRARY_MAX).setTracked(true));
    public static RegistryEntry<EntityAttribute> WHEAT_FORTUNE = Registry.registerReference(Registries.ATTRIBUTE, Identifier.ofVanilla("fortune.wheat"),
            new ClampedEntityAttribute("attribute.name.fortune.wheat", 1.0, 0.0, ARBITRARY_MAX).setTracked(true));
    public static RegistryEntry<EntityAttribute> POTATO_FORTUNE = Registry.registerReference(Registries.ATTRIBUTE, Identifier.ofVanilla("fortune.potato"),
            new ClampedEntityAttribute("attribute.name.fortune.potato", 1.0, 0.0, ARBITRARY_MAX).setTracked(true));
    public static RegistryEntry<EntityAttribute> CARROT_FORTUNE = Registry.registerReference(Registries.ATTRIBUTE, Identifier.ofVanilla("fortune.carrot"),
            new ClampedEntityAttribute("attribute.name.fortune.carrot", 1.0, 0.0, ARBITRARY_MAX).setTracked(true));
    public static RegistryEntry<EntityAttribute> PUMPKIN_FORTUNE = Registry.registerReference(Registries.ATTRIBUTE, Identifier.ofVanilla("fortune.pumpkin"),
            new ClampedEntityAttribute("attribute.name.fortune.pumpkin", 1.0, 0.0, ARBITRARY_MAX).setTracked(true));
    public static RegistryEntry<EntityAttribute> MELON_FORTUNE = Registry.registerReference(Registries.ATTRIBUTE, Identifier.ofVanilla("fortune.melon"),
            new ClampedEntityAttribute("attribute.name.fortune.melon", 1.0, 0.0, ARBITRARY_MAX).setTracked(true));
    public static RegistryEntry<EntityAttribute> CACTUS_FORTUNE = Registry.registerReference(Registries.ATTRIBUTE, Identifier.ofVanilla("fortune.cactus"),
            new ClampedEntityAttribute("attribute.name.fortune.cactus", 1.0, 0.0, ARBITRARY_MAX).setTracked(true));
    public static RegistryEntry<EntityAttribute> NETHER_WART_FORTUNE = Registry.registerReference(Registries.ATTRIBUTE, Identifier.ofVanilla("fortune.nether_wart"),
            new ClampedEntityAttribute("attribute.name.fortune.nether_wart", 1.0, 0.0, ARBITRARY_MAX).setTracked(true));
    public static RegistryEntry<EntityAttribute> COCOA_BEANS_FORTUNE = Registry.registerReference(Registries.ATTRIBUTE, Identifier.ofVanilla("fortune.cocoa_beans"),
            new ClampedEntityAttribute("attribute.name.fortune.cocoa_beans", 1.0, 0.0, ARBITRARY_MAX).setTracked(true));
    public static RegistryEntry<EntityAttribute> MUSHROOM_FORTUNE = Registry.registerReference(Registries.ATTRIBUTE, Identifier.ofVanilla("fortune.mushroom"),
            new ClampedEntityAttribute("attribute.name.fortune.mushroom", 1.0, 0.0, ARBITRARY_MAX).setTracked(true));
    public static RegistryEntry<EntityAttribute> SUGAR_CANE_FORTUNE = Registry.registerReference(Registries.ATTRIBUTE, Identifier.ofVanilla("fortune.sugar_cane"),
            new ClampedEntityAttribute("attribute.name.fortune.sugar_cane", 1.0, 0.0, ARBITRARY_MAX).setTracked(true));

    public static RegistryEntry<EntityAttribute> MINING_FORTUNE = Registry.registerReference(Registries.ATTRIBUTE, Identifier.ofVanilla("fortune.mining"),
            new ClampedEntityAttribute("attribute.name.fortune.mining", 1.0, 0.0, ARBITRARY_MAX).setTracked(true));
    public static RegistryEntry<EntityAttribute> ORE_FORTUNE = Registry.registerReference(Registries.ATTRIBUTE, Identifier.ofVanilla("fortune.ore"),
            new ClampedEntityAttribute("attribute.name.fortune.ore", 1.0, 0.0, ARBITRARY_MAX).setTracked(true));
    public static RegistryEntry<EntityAttribute> BLOCK_FORTUNE = Registry.registerReference(Registries.ATTRIBUTE, Identifier.ofVanilla("fortune.block"),
            new ClampedEntityAttribute("attribute.name.fortune.block", 1.0, 0.0, ARBITRARY_MAX).setTracked(true));
    public static RegistryEntry<EntityAttribute> DWARVEN_METAL_FORTUNE = Registry.registerReference(Registries.ATTRIBUTE, Identifier.ofVanilla("fortune.dwarven_metal"),
            new ClampedEntityAttribute("attribute.name.fortune.dwarven_metal", 1.0, 0.0, ARBITRARY_MAX).setTracked(true));
    public static RegistryEntry<EntityAttribute> GEMSTONE_FORTUNE = Registry.registerReference(Registries.ATTRIBUTE, Identifier.ofVanilla("fortune.gemstone"),
            new ClampedEntityAttribute("attribute.name.fortune.gemstone", 1.0, 0.0, ARBITRARY_MAX).setTracked(true));
    public static RegistryEntry<EntityAttribute> TITANIUM_FORTUNE = Registry.registerReference(Registries.ATTRIBUTE, Identifier.ofVanilla("fortune.titanium"),
            new ClampedEntityAttribute("attribute.name.fortune.titanium", 1.0, 0.0, ARBITRARY_MAX).setTracked(true));

    public static void registerEntityAttributes() {
        Skyblock.LOGGER.info("Registering Mod Entity Attributes for " + Skyblock.MOD_ID);
    }
}