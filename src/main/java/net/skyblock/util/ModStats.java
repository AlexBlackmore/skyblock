package net.skyblock.util;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.skyblock.attribute.ModEntityAttributes;

import java.util.UUID;

public class ModStats {
//    protected static final UUID ATTACK_DAMAGE_MODIFIER_ID = UUID.fromString("CB3F55D3-645C-4F38-A497-9C13A33DB5CF");
//    protected static final UUID ATTACK_SPEED_MODIFIER_ID = UUID.fromString("FA233E1C-4180-4865-B01B-BCCE9785ACA3");
//    protected static final UUID BOOTS_PROTECTION_MODIFIER_ID = UUID.fromString("845DB27C-C624-495F-8C9F-6020A9A58B6B");
//    protected static final UUID LEGGINGS_PROTECTION_MODIFIER_ID = UUID.fromString("D8499B04-0E66-4726-AB29-64469D734E0D");
//    protected static final UUID CHESTPLATE_PROTECTION_MODIFIER_ID = UUID.fromString("9F3D476D-C118-4544-8365-64846904B48E");
//    protected static final UUID HELMET_PROTECTION_MODIFIER_ID = UUID.fromString("2AD3F246-FEE1-4E67-B886-69FD380BB150");

    private float armor = 0;
    private float armorToughness = 0;
    private float attackDamage = 0;
    private float attackKnockback = 0;
    private float attackSpeed = 0;
    private float knockbackResistance = 0;
    private float luck = 0;
    private float maxHealth = 0;
    private float movementSpeed = 0;

    private float intelligence = 0;
    private float critChance = 0;
    private float critDamage = 0;
    private float abilityDamage = 0;
    private float ferocity = 0;
    private float healthRegen = 0;
    private float vitality = 0;
    private float miningSpeed = 0;
    private float miningFortune = 0;
    private float farmingFortune = 0;
    private float foragingFortune = 0;
    private float pristine = 0;
    private float alchemyWisdom = 0;
    private float combatWisdom = 0;
    private float enchantingWisdom = 0;
    private float farmingWisdom = 0;
    private float fishingWisdom = 0;
    private float foragingWisdom = 0;
    private float miningWisdom = 0;
    private float petLuck = 0;
    private float seaCreatureChance = 0;
    private float fishingSpeed = 0;

    public ModStats() {}

    public Multimap<EntityAttribute, EntityAttributeModifier> buildMultimap() {
        ImmutableMultimap.Builder<EntityAttribute, EntityAttributeModifier> builder = ImmutableMultimap.builder();

//        private float armor = 0;
        if (this.armor!=0) {
            builder.put(EntityAttributes.GENERIC_ARMOR, new EntityAttributeModifier(UUID.randomUUID(), "Armor modifier",
                    this.armor, EntityAttributeModifier.Operation.ADDITION));
        }
//        private float armorToughness = 0;
        if (this.armorToughness !=0) {
            builder.put(EntityAttributes.GENERIC_ARMOR_TOUGHNESS, new EntityAttributeModifier(UUID.randomUUID(), "Armor Toughness modifier",
                    this.armorToughness, EntityAttributeModifier.Operation.ADDITION));
        }
//        private float attackDamage = 0;
        if (this.attackDamage!=0) {
            builder.put(EntityAttributes.GENERIC_ATTACK_DAMAGE, new EntityAttributeModifier(UUID.randomUUID(), "Attack Damage modifier",
                    this.attackDamage, EntityAttributeModifier.Operation.ADDITION));
        }
//        private float attackKnockback = 0;
        if (this.attackKnockback!=0) {
            builder.put(EntityAttributes.GENERIC_ATTACK_KNOCKBACK, new EntityAttributeModifier(UUID.randomUUID(), "Attack Knockback modifier",
                    this.attackKnockback, EntityAttributeModifier.Operation.MULTIPLY_BASE));
        }
//        private float attackSpeed = 0;
        if (this.attackSpeed!=0) {
            builder.put(EntityAttributes.GENERIC_ATTACK_SPEED, new EntityAttributeModifier(UUID.randomUUID(), "Attack Speed modifier",
                    this.attackSpeed, EntityAttributeModifier.Operation.MULTIPLY_BASE));
        }
//        private float knockbackResistance = 0;
        if (this.knockbackResistance!=0) {
            builder.put(EntityAttributes.GENERIC_KNOCKBACK_RESISTANCE, new EntityAttributeModifier(UUID.randomUUID(), "Knockback Resistance modifier",
                    this.knockbackResistance, EntityAttributeModifier.Operation.MULTIPLY_BASE));
        }
//        private float luck = 0;
        if (this.luck !=0) {
            builder.put(EntityAttributes.GENERIC_LUCK, new EntityAttributeModifier(UUID.randomUUID(), "Luck modifier",
                    this.luck, EntityAttributeModifier.Operation.ADDITION));
        }
//        private float maxHealth = 0;
        if (this.maxHealth!=0) {
            builder.put(EntityAttributes.GENERIC_MAX_HEALTH, new EntityAttributeModifier(UUID.randomUUID(), "Max Health modifier",
                    this.maxHealth, EntityAttributeModifier.Operation.ADDITION));
        }
//        private float movementSpeed = 0;
        if (this.movementSpeed!=0) {
            builder.put(EntityAttributes.GENERIC_MOVEMENT_SPEED, new EntityAttributeModifier(UUID.randomUUID(), "Movement Speed modifier",
                    this.movementSpeed, EntityAttributeModifier.Operation.MULTIPLY_BASE));
        }
//
//        private float intelligence = 0;
        if (this.intelligence!=0) {
            builder.put(ModEntityAttributes.INTELLIGENCE, new EntityAttributeModifier(UUID.randomUUID(), "Intelligence modifier",
                    this.intelligence, EntityAttributeModifier.Operation.ADDITION));
        }
//        private float critChance = 0;
        if (this.critChance!=0) {
            builder.put(ModEntityAttributes.CRIT_CHANCE, new EntityAttributeModifier(UUID.randomUUID(), "Crit Chance modifier",
                    this.critChance, EntityAttributeModifier.Operation.MULTIPLY_BASE));
        }
//        private float critDamage = 0;
        if (this.critDamage!=0) {
            builder.put(ModEntityAttributes.CRIT_DAMAGE, new EntityAttributeModifier(UUID.randomUUID(), "Crit Damage modifier",
                    this.critDamage, EntityAttributeModifier.Operation.MULTIPLY_BASE));
        }
//        private float abilityDamage = 0;
        if (this.abilityDamage!=0) {
            builder.put(ModEntityAttributes.ABILITY_DAMAGE, new EntityAttributeModifier(UUID.randomUUID(), "Ability Damage modifier",
                    this.abilityDamage, EntityAttributeModifier.Operation.MULTIPLY_BASE));
        }
//        private float ferocity = 0;
        if (this.ferocity!=0) {
            builder.put(ModEntityAttributes.FEROCITY, new EntityAttributeModifier(UUID.randomUUID(), "Ferocity modifier",
                    this.ferocity, EntityAttributeModifier.Operation.MULTIPLY_BASE));
        }
//        private float healthRegen = 0;
        if (this.healthRegen!=0) {
            builder.put(ModEntityAttributes.HEALTH_REGEN, new EntityAttributeModifier(UUID.randomUUID(), "Health Regen modifier",
                    this.healthRegen, EntityAttributeModifier.Operation.MULTIPLY_BASE));
        }
//        private float vitality = 0;
        if (this.vitality!=0) {
            builder.put(ModEntityAttributes.VITALITY, new EntityAttributeModifier(UUID.randomUUID(), "Vitality modifier",
                    this.vitality, EntityAttributeModifier.Operation.MULTIPLY_BASE));
        }
//        private float miningSpeed = 0;
        if (this.miningSpeed!=0) {
            builder.put(ModEntityAttributes.MINING_SPEED, new EntityAttributeModifier(UUID.randomUUID(), "Mining Speed modifier",
                    this.miningSpeed, EntityAttributeModifier.Operation.MULTIPLY_BASE));
        }
//        private float miningFortune = 0;
        if (this.miningFortune!=0) {
            builder.put(ModEntityAttributes.MINING_FORTUNE, new EntityAttributeModifier(UUID.randomUUID(), "Mining Fortune modifier",
                    this.miningFortune, EntityAttributeModifier.Operation.MULTIPLY_BASE));
        }
//        private float farmingFortune = 0;
        if (this.farmingFortune!=0) {
            builder.put(ModEntityAttributes.FARMING_FORTUNE, new EntityAttributeModifier(UUID.randomUUID(), "Farming Fortune modifier",
                    this.farmingFortune, EntityAttributeModifier.Operation.MULTIPLY_BASE));
        }
//        private float foragingFortune = 0;
        if (this.foragingFortune!=0) {
            builder.put(ModEntityAttributes.FORAGING_FORTUNE, new EntityAttributeModifier(UUID.randomUUID(), "Foraging Fortune modifier",
                    this.foragingFortune, EntityAttributeModifier.Operation.MULTIPLY_BASE));
        }
//        private float pristine = 0;
        if (this.pristine!=0) {
            builder.put(ModEntityAttributes.PRISTINE, new EntityAttributeModifier(UUID.randomUUID(), "Pristine modifier",
                    this.pristine, EntityAttributeModifier.Operation.MULTIPLY_BASE));
        }
//        private float alchemyWisdom = 0;
        if (this.alchemyWisdom!=0) {
            builder.put(ModEntityAttributes.ALCHEMY_WISDOM, new EntityAttributeModifier(UUID.randomUUID(), "Alchemy Wisdom modifier",
                    this.alchemyWisdom, EntityAttributeModifier.Operation.MULTIPLY_BASE));
        }
//        private float combatWisdom = 0;
        if (this.combatWisdom!=0) {
            builder.put(ModEntityAttributes.COMBAT_WISDOM, new EntityAttributeModifier(UUID.randomUUID(), "Combat Wisdom modifier",
                    this.combatWisdom, EntityAttributeModifier.Operation.MULTIPLY_BASE));
        }
//        private float enchantingWisdom = 0;
        if (this.enchantingWisdom!=0) {
            builder.put(ModEntityAttributes.ENCHANTING_WISDOM, new EntityAttributeModifier(UUID.randomUUID(), "Enchanting Wisdom modifier",
                    this.enchantingWisdom, EntityAttributeModifier.Operation.MULTIPLY_BASE));
        }
//        private float farmingWisdom = 0;
        if (this.farmingWisdom!=0) {
            builder.put(ModEntityAttributes.FARMING_WISDOM, new EntityAttributeModifier(UUID.randomUUID(), "Farming Wisdom modifier",
                    this.farmingWisdom, EntityAttributeModifier.Operation.MULTIPLY_BASE));
        }
//        private float fishingWisdom = 0;
        if (this.fishingWisdom!=0) {
            builder.put(ModEntityAttributes.FISHING_WISDOM, new EntityAttributeModifier(UUID.randomUUID(), "Fishing Wisdom modifier",
                    this.fishingWisdom, EntityAttributeModifier.Operation.MULTIPLY_BASE));
        }
//        private float foragingWisdom = 0;
        if (this.foragingWisdom!=0) {
            builder.put(ModEntityAttributes.FORAGING_WISDOM, new EntityAttributeModifier(UUID.randomUUID(), "Foraging Wisdom modifier",
                    this.foragingWisdom, EntityAttributeModifier.Operation.MULTIPLY_BASE));
        }
//        private float miningWisdom = 0;
        if (this.miningWisdom!=0) {
            builder.put(ModEntityAttributes.MINING_WISDOM, new EntityAttributeModifier(UUID.randomUUID(), "Mining Wisdom modifier",
                    this.miningWisdom, EntityAttributeModifier.Operation.MULTIPLY_BASE));
        }
//        private float petLuck = 0;
        if (this.petLuck!=0) {
            builder.put(ModEntityAttributes.PET_LUCK, new EntityAttributeModifier(UUID.randomUUID(), "Pet Luck modifier",
                    this.petLuck, EntityAttributeModifier.Operation.MULTIPLY_BASE));
        }
//        private float seaCreatureChance = 0;
        if (this.seaCreatureChance!=0) {
            builder.put(ModEntityAttributes.SEA_CREATURE_CHANCE, new EntityAttributeModifier(UUID.randomUUID(), "Sea Creature Chance modifier",
                    this.seaCreatureChance, EntityAttributeModifier.Operation.MULTIPLY_BASE));
        }
//        private float fishingSpeed = 0;
        if (this.fishingSpeed!=0) {
            builder.put(ModEntityAttributes.FISHING_SPEED, new EntityAttributeModifier(UUID.randomUUID(), "Fishing Speed modifier",
                    this.fishingSpeed, EntityAttributeModifier.Operation.MULTIPLY_BASE));
        }

        return builder.build();
    }

    public float getMaxHealth() {
        return maxHealth;
    }
    public ModStats setMaxHealth(float maxHealth) {
        this.maxHealth = maxHealth;
        return this;
    }

    public float getArmor() {
        return armor;
    }

    public ModStats setArmor(float armor) {
        this.armor = armor;
        return this;
    }

    public float getAttackDamage() {
        return attackDamage;
    }

    public ModStats setAttackDamage(float attackDamage) {
        this.attackDamage = attackDamage;
        return this;
    }

    public float getIntelligence() {
        return intelligence;
    }

    public ModStats setIntelligence(float intelligence) {
        this.intelligence = intelligence;
        return this;
    }

    public float getCritChance() {
        return critChance;
    }

    public ModStats setCritChance(float critChance) {
        this.critChance = critChance;
        return this;
    }

    public float getCritDamage() {
        return critDamage;
    }

    public ModStats setCritDamage(float critDamage) {
        this.critDamage = critDamage;
        return this;
    }

    public float getAttackSpeed() {
        return attackSpeed;
    }

    public ModStats setAttackSpeed(float attackSpeed) {
        this.attackSpeed = attackSpeed;
        return this;
    }

    public float getAbilityDamage() {
        return abilityDamage;
    }

    public ModStats setAbilityDamage(float abilityDamage) {
        this.abilityDamage = abilityDamage;
        return this;
    }

    public float getArmorToughness() {
        return armorToughness;
    }

    public ModStats setArmorToughness(float armorToughness) {
        this.armorToughness = armorToughness;
        return this;
    }

    public float getFerocity() {
        return ferocity;
    }

    public ModStats setFerocity(float ferocity) {
        this.ferocity = ferocity;
        return this;
    }

    public float getHealthRegen() {
        return healthRegen;
    }

    public ModStats setHealthRegen(float healthRegen) {
        this.healthRegen = healthRegen;
        return this;
    }

    public float getVitality() {
        return vitality;
    }

    public ModStats setVitality(float vitality) {
        this.vitality = vitality;
        return this;
    }

    public float getKnockbackResistance() {
        return knockbackResistance;
    }

    public ModStats setKnockbackResistance(float knockbackResistance) {
        this.knockbackResistance = knockbackResistance;
        return this;
    }

    public float getMiningSpeed() {
        return miningSpeed;
    }

    public ModStats setMiningSpeed(float miningSpeed) {
        this.miningSpeed = miningSpeed;
        return this;
    }

    public float getMiningFortune() {
        return miningFortune;
    }

    public ModStats setMiningFortune(float miningFortune) {
        this.miningFortune = miningFortune;
        return this;
    }

    public float getFarmingFortune() {
        return farmingFortune;
    }

    public ModStats setFarmingFortune(float farmingFortune) {
        this.farmingFortune = farmingFortune;
        return this;
    }

    public float getForagingFortune() {
        return foragingFortune;
    }

    public ModStats setForagingFortune(float foragingFortune) {
        this.foragingFortune = foragingFortune;
        return this;
    }

    public float getPristine() {
        return pristine;
    }

    public ModStats setPristine(float pristine) {
        this.pristine = pristine;
        return this;
    }

    public float getAlchemyWisdom() {
        return alchemyWisdom;
    }

    public ModStats setAlchemyWisdom(float alchemyWisdom) {
        this.alchemyWisdom = alchemyWisdom;
        return this;
    }

    public float getCombatWisdom() {
        return combatWisdom;
    }

    public ModStats setCombatWisdom(float combatWisdom) {
        this.combatWisdom = combatWisdom;
        return this;
    }

    public float getEnchantingWisdom() {
        return enchantingWisdom;
    }

    public ModStats setEnchantingWisdom(float enchantingWisdom) {
        this.enchantingWisdom = enchantingWisdom;
        return this;
    }

    public float getFarmingWisdom() {
        return farmingWisdom;
    }

    public ModStats setFarmingWisdom(float farmingWisdom) {
        this.farmingWisdom = farmingWisdom;
        return this;
    }

    public float getFishingWisdom() {
        return fishingWisdom;
    }

    public ModStats setFishingWisdom(float fishingWisdom) {
        this.fishingWisdom = fishingWisdom;
        return this;
    }

    public float getForagingWisdom() {
        return foragingWisdom;
    }

    public ModStats setForagingWisdom(float foragingWisdom) {
        this.foragingWisdom = foragingWisdom;
        return this;
    }

    public float getMiningWisdom() {
        return miningWisdom;
    }

    public ModStats setMiningWisdom(float miningWisdom) {
        this.miningWisdom = miningWisdom;
        return this;
    }

    public float getMovementSpeed() {
        return movementSpeed;
    }

    public ModStats setMovementSpeed(float movementSpeed) {
        this.movementSpeed = movementSpeed;
        return this;
    }

    public float getLuck() {
        return luck;
    }

    public ModStats setLuck(float luck) {
        this.luck = luck;
        return this;
    }

    public float getPetLuck() {
        return petLuck;
    }

    public ModStats setPetLuck(float petLuck) {
        this.petLuck = petLuck;
        return this;
    }

    public float getSeaCreatureChance() {
        return seaCreatureChance;
    }

    public ModStats setSeaCreatureChance(float seaCreatureChance) {
        this.seaCreatureChance = seaCreatureChance;
        return this;
    }

    public float getFishingSpeed() {
        return fishingSpeed;
    }

    public ModStats setFishingSpeed(float fishingSpeed) {
        this.fishingSpeed = fishingSpeed;
        return this;
    }

    public float getAttackKnockback() {
        return attackKnockback;
    }

    public void setAttackKnockback(float attackKnockback) {
        this.attackKnockback = attackKnockback;
    }
}
