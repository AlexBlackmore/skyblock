package net.skyblock.item;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterial;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Rarity;
import net.skyblock.util.ModTags;

public class ModToolMaterials {
    //From hypixel wiki
    private static final float DEFAULT_WOODEN_MINING_SPEED = 70.0f;
    private static final float DEFAULT_GOLDEN_MINING_SPEED = 250.0f;
    private static final float DEFAULT_STONE_MINING_SPEED = 110.0f;
    private static final float DEFAULT_IRON_MINING_SPEED = 160.0f;
    private static final float DEFAULT_DIAMOND_MINING_SPEED = 220.0f;

    public static final ToolMaterial ROOKIE = new ToolMaterial(BlockTags.INCORRECT_FOR_STONE_TOOL, ToolMaterial.STONE.durability(), ToolMaterial.STONE.speed() * 1.3636f, 0.0f, ToolMaterial.STONE.enchantmentValue(), ModTags.Items.EMPTY);
    public static final ToolMaterial ZOMBIE = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, ToolMaterial.IRON.durability(), ToolMaterial.IRON.speed() * 1.1875f, 0.0f, ToolMaterial.IRON.enchantmentValue(), ModTags.Items.ZOMBIE_TOOL_MATERIALS);
    public static final ToolMaterial PROMISING = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, ToolMaterial.IRON.durability() * 2, ToolMaterial.IRON.speed() * 0.3125f, 0.0f, ToolMaterial.IRON.enchantmentValue(), ModTags.Items.PROMISING_TOOL_MATERIALS);

    //Creates single-use tool material
    public static ToolMaterial getToolMaterial(int breakingPower, int durability, float speed, float attackDamage, int enchantmentValue, TagKey<Item> repairItems) {
        TagKey<Block> incorrectBlocksForDrops;
        switch (breakingPower) {
            case 1 -> incorrectBlocksForDrops = BlockTags.INCORRECT_FOR_WOODEN_TOOL;
            case 2 -> incorrectBlocksForDrops = BlockTags.INCORRECT_FOR_STONE_TOOL;
            case 3 -> incorrectBlocksForDrops = BlockTags.INCORRECT_FOR_IRON_TOOL;
            case 4 -> incorrectBlocksForDrops = BlockTags.INCORRECT_FOR_DIAMOND_TOOL;
            case 5 -> incorrectBlocksForDrops = BlockTags.INCORRECT_FOR_NETHERITE_TOOL;
            case 6 -> incorrectBlocksForDrops = ModTags.Blocks.INCORRECT_FOR_BREAKING_POWER_6;
            case 7 -> incorrectBlocksForDrops = ModTags.Blocks.INCORRECT_FOR_BREAKING_POWER_7;
            case 8 -> incorrectBlocksForDrops = ModTags.Blocks.INCORRECT_FOR_BREAKING_POWER_8;
            case 9 -> incorrectBlocksForDrops = ModTags.Blocks.INCORRECT_FOR_BREAKING_POWER_9;
            default -> incorrectBlocksForDrops = BlockTags.INCORRECT_FOR_GOLD_TOOL;
        }

        return new ToolMaterial(incorrectBlocksForDrops, durability, speed, attackDamage, enchantmentValue, repairItems);
    }

    //Creates material with scaled durability and speed based on a vanilla material but with a unique breaking power.
    //Converts mining speed system used on hypixel to vanilla by taking a tool's given hypixel speed, divides it by the
    // vanilla hypixel mining speed, and uses that multiplier to scale the vanilla speed
    public static ToolMaterial getToolMaterial(ToolMaterial vanilla, int breakingPower, int durabilityMultiplier, float speedNumerator, TagKey<Item> repairItems) {
        if (vanilla == ToolMaterial.WOOD) speedNumerator /= DEFAULT_WOODEN_MINING_SPEED;
        else if (vanilla == ToolMaterial.STONE) speedNumerator /= DEFAULT_STONE_MINING_SPEED;
        else if (vanilla == ToolMaterial.GOLD) speedNumerator /= DEFAULT_GOLDEN_MINING_SPEED;
        else if (vanilla == ToolMaterial.IRON) speedNumerator /= DEFAULT_IRON_MINING_SPEED;
        else if (vanilla == ToolMaterial.DIAMOND) speedNumerator /= DEFAULT_DIAMOND_MINING_SPEED;

        return getToolMaterial(breakingPower, vanilla.durability() * durabilityMultiplier, vanilla.speed() * speedNumerator, 0, vanilla.enchantmentValue(), repairItems);
    }

    //Creates material by scaling the durability and speed values of a vanilla material
    public static ToolMaterial getToolMaterial(ToolMaterial vanilla, int durabilityMultiplier, float speedMultiplier, TagKey<Item> repairItems) {
        int breakingPower;
        if (vanilla == ToolMaterial.STONE) breakingPower = 2;
        else if (vanilla == ToolMaterial.IRON) breakingPower = 3;
        else if (vanilla == ToolMaterial.DIAMOND) breakingPower = 4;
        else if (vanilla == ToolMaterial.NETHERITE) breakingPower = 5;
        else breakingPower = 1;

        int durability = vanilla.durability();
        if (vanilla == ToolMaterial.GOLD) {
            durability = ToolMaterial.NETHERITE.durability();
        }

        return getToolMaterial(breakingPower, durability * durabilityMultiplier, vanilla.speed() * speedMultiplier, 0, vanilla.enchantmentValue(), repairItems);
    }

    //Creates irrepairable material with durability scaled based on rarity
    public static ToolMaterial getToolMaterial(ToolMaterial vanilla, Rarity rarity) {
        return getToolMaterial(vanilla, rarity.ordinal() + 1, 1, ModTags.Items.EMPTY);
    }
}
