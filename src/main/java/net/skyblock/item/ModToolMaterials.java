package net.skyblock.item;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.item.ToolMaterials;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.util.Lazy;

import java.util.function.Supplier;

public enum ModToolMaterials implements ToolMaterial {
//    WOOD(0, 59, 2.0f, 0.0f, 15, () -> Ingredient.fromTag(ItemTags.PLANKS)),
//    GOLD(0, 32, 12.0f, 0.0f, 22, () -> Ingredient.ofItems(Items.GOLD_INGOT)),
//    STONE(1, 131, 4.0f, 1.0f, 5, () -> Ingredient.fromTag(ItemTags.STONE_TOOL_MATERIALS)),
//    IRON(2, 250, 6.0f, 2.0f, 14, () -> Ingredient.ofItems(Items.IRON_INGOT)),
//    DIAMOND(3, 1561, 8.0f, 3.0f, 10, () -> Ingredient.ofItems(Items.DIAMOND)),
//    NETHERITE(4, 2031, 9.0f, 4.0f, 15, () -> Ingredient.ofItems(Items.NETHERITE_INGOT));
    ZOMBIE(2, 250, 6.3f, 0.0f, 14, () -> Ingredient.ofItems(Items.IRON_INGOT)),
    JUNGLE(4, 1561, 11.0f, 10.0f, 15, () -> Ingredient.fromTag(ItemTags.PLANKS)),
    FRACTURED_MITHRIL(4, 1561, 7.5f, 6.0f, 15, () -> Ingredient.ofItems(ModItems.MITHRIL)),
    BANDAGED_MITHRIL(4, 1561, 8.3f, 6.0f, 15, () -> Ingredient.ofItems(ModItems.MITHRIL)),
    MITHRIL(4, 1561, 9.3f, 8.0f, 15, () -> Ingredient.ofItems(ModItems.MITHRIL)),
    REFINED_MITHRIL(4, 2031, 10.0f, 10.0f, 15, () -> Ingredient.ofItems(ModItems.MITHRIL)),
    TITANIUM(4, 2031, 0.0f, 0.0f, 15, () -> Ingredient.ofItems(Items.BEDROCK)),
    RUBY(5, 2501, 0.0f, 0.0f, 15, () -> Ingredient.ofItems(Items.BEDROCK)),
    GEMSTONE(6, 2971, 0.0f, 0.0f, 15, () -> Ingredient.ofItems(Items.BEDROCK)),
    TOPAZ(7, 3441, 0.0f, 0.0f, 15, () -> Ingredient.ofItems(Items.BEDROCK)),
    JASPER(8, 3911, 0.0f, 0.0f, 15, () -> Ingredient.ofItems(Items.BEDROCK));

    private final int miningLevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngredient;

    private ModToolMaterials(int miningLevel, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Supplier<Ingredient> repairIngredient) {
        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getDurability() {
        return this.itemDurability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
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
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}
