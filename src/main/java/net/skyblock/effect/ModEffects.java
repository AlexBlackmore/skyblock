package net.skyblock.effect;

import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;
import net.skyblock.Skyblock;
import net.skyblock.attribute.ModEntityAttributes;
import org.jetbrains.annotations.NotNull;

public class ModEffects {
    public static final RegistryEntry<StatusEffect> RUNIC = register("runic", new ModEffect(StatusEffectCategory.BENEFICIAL, getFormattingColourValues(Formatting.LIGHT_PURPLE))
            .addAttributeModifier(EntityAttributes.MAX_HEALTH, Identifier.of(Skyblock.MOD_ID, "runic_max_health"), 3.0, EntityAttributeModifier.Operation.ADD_MULTIPLIED_BASE)
            .addAttributeModifier(EntityAttributes.ATTACK_DAMAGE, Identifier.of(Skyblock.MOD_ID, "runic_attack_damage"), 1.0, EntityAttributeModifier.Operation.ADD_MULTIPLIED_BASE));

    public static final RegistryEntry<StatusEffect> ADRENALINE = register("adrenaline", new AdrenalineEffect()
            .addAttributeModifier(EntityAttributes.MOVEMENT_SPEED, Identifier.of(Skyblock.MOD_ID, "adrenaline_movement_speed"), 0.05, EntityAttributeModifier.Operation.ADD_MULTIPLIED_BASE));

    public static final RegistryEntry<StatusEffect> AGILITY = register("agility", new ModEffect(StatusEffectCategory.BENEFICIAL, getFormattingColourValues(Formatting.DARK_PURPLE))
            .addAttributeModifier(EntityAttributes.MOVEMENT_SPEED, Identifier.of(Skyblock.MOD_ID, "agility_movement_speed"), 0.1, EntityAttributeModifier.Operation.ADD_MULTIPLIED_BASE));

    public static final RegistryEntry<StatusEffect> ARCHERY = register("archery", new ModEffect(StatusEffectCategory.BENEFICIAL, getFormattingColourValues(Formatting.AQUA)));

    public static final RegistryEntry<StatusEffect> STAMINA = register("stamina", new ModEffect(StatusEffectCategory.BENEFICIAL, getFormattingColourValues(Formatting.GREEN)));

    public static final RegistryEntry<StatusEffect> BURNING = register("burning", new ModEffect(StatusEffectCategory.HARMFUL, getFormattingColourValues(Formatting.GOLD)));

    public static final RegistryEntry<StatusEffect> CRITICAL = register("critical", new ModEffect(StatusEffectCategory.BENEFICIAL, getFormattingColourValues(Formatting.DARK_RED))
            .addAttributeModifier(ModEntityAttributes.CRIT_CHANCE, Identifier.of(Skyblock.MOD_ID, "critical_crit_chance"), 0.1, EntityAttributeModifier.Operation.ADD_MULTIPLIED_BASE)
            .addAttributeModifier(ModEntityAttributes.CRIT_DAMAGE, Identifier.of(Skyblock.MOD_ID, "critical_crit_damage"), 0.1, EntityAttributeModifier.Operation.ADD_MULTIPLIED_BASE));

    public static final RegistryEntry<StatusEffect> DODGE = register("dodge", new ModEffect(StatusEffectCategory.BENEFICIAL, getFormattingColourValues(Formatting.BLUE)));

    public static final RegistryEntry<StatusEffect> EXPERIENCE = register("experience", new ModEffect(StatusEffectCategory.BENEFICIAL, getFormattingColourValues(Formatting.BLUE)));

    public static final RegistryEntry<StatusEffect> MANA = register("mana", new ModEffect(StatusEffectCategory.BENEFICIAL, getFormattingColourValues(Formatting.BLUE)));

    public static final RegistryEntry<StatusEffect> RABBIT = register("rabbit", new ModEffect(StatusEffectCategory.BENEFICIAL, getFormattingColourValues(Formatting.GREEN))
            .addAttributeModifier(EntityAttributes.MOVEMENT_SPEED, Identifier.of(Skyblock.MOD_ID, "rabbit_movement_speed"), 0.1, EntityAttributeModifier.Operation.ADD_MULTIPLIED_BASE));

    public static final RegistryEntry<StatusEffect> SPELUNKER = register("spelunker", new ModEffect(StatusEffectCategory.BENEFICIAL, getFormattingColourValues(Formatting.AQUA))
            .addAttributeModifier(ModEntityAttributes.MINING_FORTUNE, Identifier.of(Skyblock.MOD_ID, "spelunker_mining_fortune"), 0.05, EntityAttributeModifier.Operation.ADD_MULTIPLIED_BASE));

    public static final RegistryEntry<StatusEffect> STUN = register("stun", new ModEffect(StatusEffectCategory.BENEFICIAL, getFormattingColourValues(Formatting.DARK_GRAY)));

    public static final RegistryEntry<StatusEffect> SPIRIT = register("spirit", new ModEffect(StatusEffectCategory.BENEFICIAL, getFormattingColourValues(Formatting.AQUA))
            .addAttributeModifier(EntityAttributes.MOVEMENT_SPEED, Identifier.of(Skyblock.MOD_ID, "spirit_movement_speed"), 0.1, EntityAttributeModifier.Operation.ADD_MULTIPLIED_BASE)
            .addAttributeModifier(ModEntityAttributes.CRIT_DAMAGE, Identifier.of(Skyblock.MOD_ID, "spirit_crit_damage"), 0.1, EntityAttributeModifier.Operation.ADD_MULTIPLIED_BASE));


    public static final RegistryEntry<StatusEffect> ALCHEMY_XP_BOOST = register("alchemy_xp_boost", new ModEffect(StatusEffectCategory.BENEFICIAL, getFormattingColourValues(Formatting.DARK_AQUA))
            .addAttributeModifier(ModEntityAttributes.ALCHEMY_WISDOM, Identifier.of(Skyblock.MOD_ID, "alchemy_xp_boost"), 0.05, EntityAttributeModifier.Operation.ADD_MULTIPLIED_BASE));

    public static final RegistryEntry<StatusEffect> COMBAT_XP_BOOST = register("combat_xp_boost", new ModEffect(StatusEffectCategory.BENEFICIAL, getFormattingColourValues(Formatting.DARK_AQUA))
            .addAttributeModifier(ModEntityAttributes.COMBAT_WISDOM, Identifier.of(Skyblock.MOD_ID, "combat_xp_boost"), 0.05, EntityAttributeModifier.Operation.ADD_MULTIPLIED_BASE));

    public static final RegistryEntry<StatusEffect> ENCHANTING_XP_BOOST = register("enchanting_xp_boost", new ModEffect(StatusEffectCategory.BENEFICIAL, getFormattingColourValues(Formatting.DARK_AQUA))
            .addAttributeModifier(ModEntityAttributes.ENCHANTING_WISDOM, Identifier.of(Skyblock.MOD_ID, "enchanting_xp_boost"), 0.05, EntityAttributeModifier.Operation.ADD_MULTIPLIED_BASE));

    public static final RegistryEntry<StatusEffect> FARMING_XP_BOOST = register("farming_xp_boost", new ModEffect(StatusEffectCategory.BENEFICIAL, getFormattingColourValues(Formatting.DARK_AQUA))
            .addAttributeModifier(ModEntityAttributes.FARMING_WISDOM, Identifier.of(Skyblock.MOD_ID, "farming_xp_boost"), 0.05, EntityAttributeModifier.Operation.ADD_MULTIPLIED_BASE));

    public static final RegistryEntry<StatusEffect> FISHING_XP_BOOST = register("fishing_xp_boost", new ModEffect(StatusEffectCategory.BENEFICIAL, getFormattingColourValues(Formatting.DARK_AQUA))
            .addAttributeModifier(ModEntityAttributes.FISHING_WISDOM, Identifier.of(Skyblock.MOD_ID, "fishing_xp_boost"), 0.05, EntityAttributeModifier.Operation.ADD_MULTIPLIED_BASE));

    public static final RegistryEntry<StatusEffect> FORAGING_XP_BOOST = register("foraging_xp_boost", new ModEffect(StatusEffectCategory.BENEFICIAL, getFormattingColourValues(Formatting.DARK_AQUA))
            .addAttributeModifier(ModEntityAttributes.FORAGING_WISDOM, Identifier.of(Skyblock.MOD_ID, "foraging_xp_boost"), 0.05, EntityAttributeModifier.Operation.ADD_MULTIPLIED_BASE));

    public static final RegistryEntry<StatusEffect> MINING_XP_BOOST = register("mining_xp_boost", new ModEffect(StatusEffectCategory.BENEFICIAL, getFormattingColourValues(Formatting.DARK_AQUA))
            .addAttributeModifier(ModEntityAttributes.MINING_WISDOM, Identifier.of(Skyblock.MOD_ID, "mining_xp_boost"), 0.05, EntityAttributeModifier.Operation.ADD_MULTIPLIED_BASE));


    public static final RegistryEntry<StatusEffect> SPEED_BOOST_COOLDOWN = register("speed_boost_cooldown", new ModEffect(StatusEffectCategory.NEUTRAL, getFormattingColourValues(Formatting.GREEN)));
    public static final RegistryEntry<StatusEffect> SPEED_BOOST = register("speed_boost", new ModEffect(StatusEffectCategory.BENEFICIAL, getFormattingColourValues(Formatting.WHITE))
            .addAttributeModifier(EntityAttributes.MOVEMENT_SPEED, Identifier.of(Skyblock.MOD_ID, "speed_boost_movement_speed"), 1.0, EntityAttributeModifier.Operation.ADD_MULTIPLIED_BASE));

    public static final RegistryEntry<StatusEffect> TIMBER_COOLDOWN = register("timber_cooldown", new ModEffect(StatusEffectCategory.NEUTRAL, getFormattingColourValues(Formatting.GREEN)));


    public static RegistryEntry<StatusEffect> register(String id, StatusEffect statusEffect) {
        return Registry.registerReference(Registries.STATUS_EFFECT, Identifier.of(Skyblock.MOD_ID, id), statusEffect);
    }

    private static int getFormattingColourValues(@NotNull Formatting colour) {
        Integer value = colour.getColorValue();
        if (value != null) {
            return value;
        } else {
            switch(colour) {
                case DARK_BLUE -> {
                    return Integer.parseInt("0000AA", 16);
                }
                case DARK_GREEN -> {
                    return Integer.parseInt("00AA00", 16);
                }
                case DARK_AQUA -> {
                    return Integer.parseInt("000AA", 16);
                }
                case DARK_RED -> {
                    return Integer.parseInt("AA0000", 16);
                }
                case DARK_PURPLE -> {
                    return Integer.parseInt("AA00AA", 16);
                }
                case GOLD -> {
                    return Integer.parseInt("FFAA00", 16);
                }
                case GRAY -> {
                    return Integer.parseInt("AAAAAA", 16);
                }
                case DARK_GRAY -> {
                    return Integer.parseInt("555555", 16);
                }
                case BLUE -> {
                    return Integer.parseInt("5555FF", 16);
                }
                case GREEN -> {
                    return Integer.parseInt("55FF55", 16);
                }
                case AQUA -> {
                    return Integer.parseInt("55FFFF", 16);
                }
                case RED -> {
                    return Integer.parseInt("FF5555", 16);
                }
                case LIGHT_PURPLE -> {
                    return Integer.parseInt("FF55FF", 16);
                }
                case YELLOW -> {
                    return Integer.parseInt("FFFF55", 16);
                }
                case WHITE -> {
                    return Integer.parseInt("FFFFFF", 16);
                }
                default -> {
                    return 0;
                }
            }
        }
    }

    public static void registerEffects() {
        Skyblock.LOGGER.info("Registering Mod Effects for " + Skyblock.MOD_ID);
    }
}
