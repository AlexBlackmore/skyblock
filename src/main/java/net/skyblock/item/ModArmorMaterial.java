package net.skyblock.item;

import com.google.common.collect.Multimap;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ArmorMaterials;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.skyblock.Skyblock;
import net.skyblock.effect.Ability;
import net.skyblock.effect.abilities.BonusSpeedAbility;
import net.skyblock.effect.abilities.FarmerAuraAbility;
import net.skyblock.effect.abilities.HasteAbility;
import net.skyblock.effect.abilities.NightAffinityAbility;
import net.skyblock.util.ModStats;

import java.util.function.Supplier;

public enum ModArmorMaterial implements ArmorMaterial {
    FARM_SUIT("farm_suit", ArmorMaterials.LEATHER.getEnchantability(), ArmorMaterials.LEATHER.getEquipSound(), () -> Ingredient.ofItems(Items.HAY_BLOCK), 10,
            new Ability[]{new BonusSpeedAbility(3), new FarmerAuraAbility()}, new ModStats[] {
                new ModStats().setArmor(3.0f).setFarmingFortune(0.05f),
                new ModStats().setArmor(8.0f).setFarmingFortune(0.05f),
                new ModStats().setArmor(6.0f).setFarmingFortune(0.05f),
                new ModStats().setArmor(3.0f).setFarmingFortune(0.05f)}),
    FARM_ARMOR("farm_armor", ArmorMaterials.LEATHER.getEnchantability(), ArmorMaterials.LEATHER.getEquipSound(), () -> Ingredient.ofItems(EnchantedItems.HAY_BLOCK), 30,
            new Ability[]{new BonusSpeedAbility(4)}, new ModStats[] {
                new ModStats().setMaxHealth(4.0f).setArmor(8.0f).setFarmingFortune(0.10f),
                new ModStats().setMaxHealth(4.0f).setArmor(15.0f).setFarmingFortune(0.10f),
                new ModStats().setMaxHealth(4.0f).setArmor(10.0f).setFarmingFortune(0.10f),
                new ModStats().setMaxHealth(4.0f).setArmor(7.0f).setFarmingFortune(0.10f)}),
    MUSHROOM("mushroom", ArmorMaterials.LEATHER.getEnchantability(), ArmorMaterials.LEATHER.getEquipSound(), () -> Ingredient.ofItems(Items.RED_MUSHROOM), 10,
            new Ability[]{new NightAffinityAbility()}, new ModStats[] {
                new ModStats().setMaxHealth(4.0f),
                new ModStats().setMaxHealth(2.0f).setArmor(2.0f),
                new ModStats().setMaxHealth(2.0f).setArmor(1.0f),
                new ModStats().setMaxHealth(3.0f)}),
    ROSETTAS("rosettas", ArmorMaterials.DIAMOND.getEnchantability(), ArmorMaterials.DIAMOND.getEquipSound(), () -> Ingredient.ofItems(Items.DIAMOND), 20,
            new Ability[]{}, new ModStats[] {
                new ModStats().setArmor(4.0f),
                new ModStats().setArmor(8.0f),
                new ModStats().setArmor(6.0f),
                new ModStats().setArmor(4.0f)}),
    SQUIRE("squire", ArmorMaterials.IRON.getEnchantability(), ArmorMaterials.IRON.getEquipSound(), () -> Ingredient.ofItems(Items.BEDROCK), 20,
            new Ability[]{}, new ModStats[] {
            new ModStats().setMaxHealth(5.0f).setArmor(5.0f),
            new ModStats().setMaxHealth(8.0f).setArmor(8.0f),
            new ModStats().setMaxHealth(6.0f).setArmor(6.0f),
            new ModStats().setMaxHealth(4.0f).setArmor(4.0f)}),
    CELESTE("celeste", ArmorMaterials.LEATHER.getEnchantability(), ArmorMaterials.LEATHER.getEquipSound(), () -> Ingredient.ofItems(Items.LEATHER), 20,
            new Ability[]{}, new ModStats[] {
            new ModStats().setArmor(2.0f).setIntelligence(30),
            new ModStats().setMaxHealth(4.0f).setArmor(4.0f).setIntelligence(60),
            new ModStats().setMaxHealth(3.0f).setArmor(3.0f).setIntelligence(40),
            new ModStats().setMaxHealth(1.0f).setArmor(1.0f).setIntelligence(20)}),
    MINERS_OUTFIT("miners_outfit", ArmorMaterials.LEATHER.getEnchantability(), ArmorMaterials.LEATHER.getEquipSound(), () -> Ingredient.ofItems(Items.LEATHER), 20,
            new Ability[]{new HasteAbility(1)}, new ModStats[] {
            new ModStats().setArmor(3.0f),
            new ModStats().setArmor(8.0f),
            new ModStats().setArmor(6.0f),
            new ModStats().setArmor(3.0f)})
;
    private final String name;
    private final int enchantability;
    private final SoundEvent equipSound;
    private final Supplier<Ingredient> repairIngredient;
    private final int durabilityMultiplier;
    private static final int[] BASE_DURABILITY = {11,16,15,13};
    private final Ability[] abilities;
    private ModStats[] stats;
    private final boolean[] fullSet;

    ModArmorMaterial(String name, int enchantability, SoundEvent equipSound, Supplier<Ingredient> repairIngredient, int durabilityMultiplier, Ability[] abilities, ModStats[] stats) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.enchantability = enchantability;
        this.equipSound = equipSound;
        this.repairIngredient = repairIngredient;
        this.abilities = abilities;
        this.stats = stats;
        this.fullSet = new boolean[] {true, true, true, true};
    }

    public Ability[] getAbilities() { return this.abilities; }
    public Multimap<EntityAttribute, EntityAttributeModifier> getStats(ArmorItem.Type type) { return this.stats[type.ordinal()].buildMultimap(); }
    public boolean requires(int i) {
        return fullSet[i];
    }

    public float getMaxHealth(ArmorItem.Type type) {
        return this.stats[type.ordinal()].getMaxHealth();
    }
    public float getArmor(ArmorItem.Type type) {
        return this.stats[type.ordinal()].getArmor();
    }
    public float getAttackDamage(ArmorItem.Type type) {
        return this.stats[type.ordinal()].getAttackDamage();
    }
    public float getIntelligence(ArmorItem.Type type) {
        return this.stats[type.ordinal()].getIntelligence();
    }
    public float getCritChance(ArmorItem.Type type) {
        return this.stats[type.ordinal()].getCritChance();
    }
    public float getCritDamage(ArmorItem.Type type) {
        return this.stats[type.ordinal()].getCritDamage();
    }
    public float getAttackSpeed(ArmorItem.Type type) {
        return this.stats[type.ordinal()].getAttackSpeed();
    }
    public float getAbilityDamage(ArmorItem.Type type) {
        return this.stats[type.ordinal()].getAbilityDamage();
    }
    public float getFerocity(ArmorItem.Type type) {
        return this.stats[type.ordinal()].getFerocity();
    }
    public float getHealthRegen(ArmorItem.Type type) {
        return this.stats[type.ordinal()].getHealthRegen();
    }
    public float getVitality(ArmorItem.Type type) {
        return this.stats[type.ordinal()].getVitality();
    }
    public float getMiningSpeed(ArmorItem.Type type) {
        return this.stats[type.ordinal()].getMiningSpeed();
    }
    public float getFortune(ArmorItem.Type type, String fortune) {
        switch (fortune) {
            case "mining" -> {
                return this.stats[type.ordinal()].getMiningFortune(); }
            case "farming" -> {
                return this.stats[type.ordinal()].getFarmingFortune(); }
            case "foraging" -> {
                return this.stats[type.ordinal()].getForagingFortune(); }
            default -> { return 0.0f; }
        }
    }
    public float getPristine(ArmorItem.Type type) {
        return this.stats[type.ordinal()].getPristine(); }
    public float getWisdom(ArmorItem.Type type, String wisdom) {
        switch (wisdom) {
            case "alchemy" -> {
                return this.stats[type.ordinal()].getAlchemyWisdom(); }
            case "combat" -> {
                return this.stats[type.ordinal()].getCombatWisdom(); }
            case "enchanting" -> {
                return this.stats[type.ordinal()].getEnchantingWisdom(); }
            case "farming" -> {
                return this.stats[type.ordinal()].getFarmingWisdom(); }
            case "fishing" -> {
                return this.stats[type.ordinal()].getFishingWisdom();}
            case "foraging" -> {
                return this.stats[type.ordinal()].getForagingWisdom(); }
            case "mining" -> {
                return this.stats[type.ordinal()].getMiningWisdom(); }
            default -> { return 0.0f; }
        }
    }
    public float movementSpeed(ArmorItem.Type type) {
        return this.stats[type.ordinal()].getMovementSpeed(); }
    public float luck(ArmorItem.Type type) {
        return this.stats[type.ordinal()].getLuck(); }
    public float petLuck(ArmorItem.Type type) {
        return this.stats[type.ordinal()].getPetLuck(); }
    public float seaCreatureChance(ArmorItem.Type type) {
        return this.stats[type.ordinal()].getSeaCreatureChance(); }
    public float fishingSpeed(ArmorItem.Type type) {
        return this.stats[type.ordinal()].getFishingSpeed(); }

    @Override
    public int getDurability(ArmorItem.Type type) {
        return BASE_DURABILITY[type.ordinal()] * this.durabilityMultiplier;
    }

    @Override
    public int getProtection(ArmorItem.Type type) {
        return (int) this.stats[type.ordinal()].getArmor();
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    @Override
    public String getName() {
        return Skyblock.MOD_ID + ":" + this.name;
    }

    @Override
    public float getToughness() {
        return this.stats[0].getArmorToughness();
    }

    @Override
    public float getKnockbackResistance() {
        return this.stats[0].getKnockbackResistance();
    }
}
