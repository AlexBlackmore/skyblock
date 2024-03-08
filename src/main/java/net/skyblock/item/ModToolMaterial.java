package net.skyblock.item;

import com.google.common.collect.Multimap;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.item.*;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.ItemTags;
import net.skyblock.effect.Ability;
import net.skyblock.util.ModStats;

import java.util.function.Supplier;

public enum ModToolMaterial implements ToolMaterial {
    ZOMBIE(2, ToolMaterials.IRON.getDurability(), 6.3f, 0.0f, ToolMaterials.IRON.getEnchantability(), () -> Ingredient.ofItems(Items.IRON_INGOT)),
    JUNGLE(4, ToolMaterials.DIAMOND.getDurability(), 11.0f, 10.0f, ToolMaterials.WOOD.getEnchantability(), () -> Ingredient.fromTag(ItemTags.PLANKS)),
    FRACTURED_MITHRIL(4, ToolMaterials.DIAMOND.getDurability(), 7.5f, 6.0f, ToolMaterials.STONE.getEnchantability(), () -> Ingredient.ofItems(ModItems.MITHRIL)),
    BANDAGED_MITHRIL(4, ToolMaterials.DIAMOND.getDurability(), 8.3f, 6.0f, ToolMaterials.STONE.getEnchantability(), () -> Ingredient.ofItems(ModItems.MITHRIL)),
    MITHRIL(4, ToolMaterials.DIAMOND.getDurability(), 9.3f, 8.0f, ToolMaterials.IRON.getEnchantability(), () -> Ingredient.ofItems(ModItems.MITHRIL)),
    REFINED_MITHRIL(4, ToolMaterials.NETHERITE.getDurability(), 10.0f, 10.0f, ToolMaterials.IRON.getEnchantability(), () -> Ingredient.ofItems(ModItems.MITHRIL)),
    TITANIUM(5, ToolMaterials.NETHERITE.getDurability(), 10.3f, 12.0f, ToolMaterials.IRON.getEnchantability(), () -> Ingredient.ofItems(ModItems.TITANIUM)),
    REFINED_TITANIUM(5, ToolMaterials.NETHERITE.getDurability(), 13.0f, 13.0f, ToolMaterials.IRON.getEnchantability(), () -> Ingredient.ofItems(ModItems.TITANIUM)),
    PICKONIMBUS(6, 5000, 50.0f, 6.0f, ToolMaterials.DIAMOND.getEnchantability(), () -> Ingredient.ofItems(Items.BEDROCK)),
    BINGONIMBUS(6, 1, 50.0f, ToolMaterials.GOLD.getEnchantability(), () -> Ingredient.ofItems(Items.BEDROCK), new Ability[] {},
            new ModStats().setAttackDamage(6.0f).setMiningFortune(1.0f)),


    ;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngredient;
    private final int itemDurability;
    private int miningLevel = 0;
    private float miningSpeed = 0;
    private Ability[] abilities;
    public ModStats stats;

    ModToolMaterial(int miningLevel, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Supplier<Ingredient> repairIngredient) {
        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.enchantability = enchantability;
        this.repairIngredient = repairIngredient;
        this.stats = new ModStats().setAttackDamage(attackDamage);
    }
    ModToolMaterial(int miningLevel, int itemDurability, float miningSpeed, int enchantability, Supplier<Ingredient> repairIngredient, Ability[] abilities,  ModStats stats) {
        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.enchantability = enchantability;
        this.repairIngredient = repairIngredient;
        this.abilities = abilities;
        this.stats = stats;
    }
    public Ability[] getAbilities() { return this.abilities; }
    public Multimap<EntityAttribute, EntityAttributeModifier> getStats() { return this.stats.buildMultimap(); }

    public float getMaxHealth(ArmorItem.Type type) {
        return this.stats.getMaxHealth();
    }
    public float getArmor(ArmorItem.Type type) {
        return this.stats.getArmor();
    }
    public float getAttackDamage(ArmorItem.Type type) {
        return this.stats.getAttackDamage();
    }
    public float getStrength(ArmorItem.Type type) {
        return this.stats.getStrength();
    }
    public float getIntelligence(ArmorItem.Type type) {
        return this.stats.getIntelligence();
    }
    public float getCritChance(ArmorItem.Type type) {
        return this.stats.getCritChance();
    }
    public float getCritDamage(ArmorItem.Type type) {
        return this.stats.getCritDamage();
    }
    public float getAttackSpeed(ArmorItem.Type type) {
        return this.stats.getAttackSpeed();
    }
    public float getAbilityDamage(ArmorItem.Type type) {
        return this.stats.getAbilityDamage();
    }
    public float getFerocity(ArmorItem.Type type) {
        return this.stats.getFerocity();
    }
    public float getHealthRegen(ArmorItem.Type type) {
        return this.stats.getHealthRegen();
    }
    public float getVitality(ArmorItem.Type type) {
        return this.stats.getVitality();
    }
    public float getMiningSpeed(ArmorItem.Type type) {
        return this.stats.getMiningSpeed();
    }
    public float getFortune(ArmorItem.Type type, String fortune) {
        switch (fortune) {
            case "mining" -> {
                return this.stats.getMiningFortune(); }
            case "farming" -> {
                return this.stats.getFarmingFortune(); }
            case "foraging" -> {
                return this.stats.getForagingFortune(); }
            default -> { return 0.0f; }
        }
    }
    public float getPristine(ArmorItem.Type type) {
        return this.stats.getPristine(); }
    public float getWisdom(ArmorItem.Type type, String wisdom) {
        switch (wisdom) {
            case "alchemy" -> {
                return this.stats.getAlchemyWisdom(); }
            case "combat" -> {
                return this.stats.getCombatWisdom(); }
            case "enchanting" -> {
                return this.stats.getEnchantingWisdom(); }
            case "farming" -> {
                return this.stats.getFarmingWisdom(); }
            case "fishing" -> {
                return this.stats.getFishingWisdom();}
            case "foraging" -> {
                return this.stats.getForagingWisdom(); }
            case "mining" -> {
                return this.stats.getMiningWisdom(); }
            default -> { return 0.0f; }
        }
    }
    public float movementSpeed(ArmorItem.Type type) {
        return this.stats.getMovementSpeed(); }
    public float luck(ArmorItem.Type type) {
        return this.stats.getLuck(); }
    public float petLuck(ArmorItem.Type type) {
        return this.stats.getPetLuck(); }
    public float seaCreatureChance(ArmorItem.Type type) {
        return this.stats.getSeaCreatureChance(); }
    public float fishingSpeed(ArmorItem.Type type) {
        return this.stats.getFishingSpeed(); }

    @Override
    public int getDurability() { return this.itemDurability; }
    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    @Override
    public float getAttackDamage() {
        return this.stats.getAttackDamage();
    }

    @Override
    public int getMiningLevel() {
        return this.miningLevel;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() { return this.repairIngredient.get(); }
}
