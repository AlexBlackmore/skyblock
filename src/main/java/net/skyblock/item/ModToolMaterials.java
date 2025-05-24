package net.skyblock.item;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterial;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Rarity;
import net.skyblock.util.ModTags;

public class ModToolMaterials {

    public static final ToolMaterial LAPIS = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, ToolMaterial.DIAMOND.durability() * 2, ToolMaterial.DIAMOND.speed() * 0.9090f, 0.0f, ToolMaterial.DIAMOND.enchantmentValue(), ModTags.Items.LAPIS_TOOL_MATERIALS);
    public static final ToolMaterial ZOMBIE = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, ToolMaterial.IRON.durability(), ToolMaterial.IRON.speed() * 1.1875f, 0.0f, ToolMaterial.IRON.enchantmentValue(), ModTags.Items.ZOMBIE_TOOL_MATERIALS);
    public static final ToolMaterial ROOKIE = new ToolMaterial(BlockTags.INCORRECT_FOR_STONE_TOOL, ToolMaterial.STONE.durability(), ToolMaterial.STONE.speed() * 1.3636f, 0.0f, ToolMaterial.STONE.enchantmentValue(), ModTags.Items.EMPTY);
    public static final ToolMaterial JUNGLE_AXE = new ToolMaterial(BlockTags.INCORRECT_FOR_WOODEN_TOOL, ToolMaterial.WOOD.durability() * 2, ToolMaterial.WOOD.speed(), 0.0f, ToolMaterial.WOOD.enchantmentValue(), ModTags.Items.JUNGLE_AXE_MATERIALS);
    public static final ToolMaterial JUNGLE_PICKAXE = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, ToolMaterial.WOOD.durability() * 2, ToolMaterial.WOOD.speed() * 4.7143f, 0.0f, ToolMaterial.WOOD.enchantmentValue(), ModTags.Items.JUNGLE_PICKAXE_MATERIALS);
    public static final ToolMaterial FRACTURED_MITHRIL_PICKAXE = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, ToolMaterial.WOOD.durability() * 2, ToolMaterial.WOOD.speed() * 4.7143f, 0.0f, ToolMaterial.WOOD.enchantmentValue(), ModTags.Items.JUNGLE_PICKAXE_MATERIALS);
    public static final ToolMaterial TREECAPITATOR = new ToolMaterial(BlockTags.INCORRECT_FOR_GOLD_TOOL, ToolMaterial.GOLD.durability() * 4, ToolMaterial.GOLD.speed(), 0.0f, ToolMaterial.GOLD.enchantmentValue(), ModTags.Items.TREECAPITATOR_TOOL_MATERIALS);
    public static final ToolMaterial PROMISING = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, ToolMaterial.IRON.durability() * 2, ToolMaterial.IRON.speed() * 0.3125f, 0.0f, ToolMaterial.IRON.enchantmentValue(), ModTags.Items.PROMISING_TOOL_MATERIALS);
    public static final ToolMaterial FLINT = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, ToolMaterial.IRON.durability(), ToolMaterial.IRON.speed(), 0.0f, ToolMaterial.IRON.enchantmentValue(), ModTags.Items.FLINT_TOOL_MATERIALS);
    public static final ToolMaterial MELON_DICER = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, ToolMaterial.DIAMOND.durability() * 4, ToolMaterial.DIAMOND.speed(), 0.0f, ToolMaterial.DIAMOND.enchantmentValue(), ModTags.Items.MELON_DICER_TOOL_MATERIALS);
    public static final ToolMaterial PUMPKIN_DICER = new ToolMaterial(BlockTags.INCORRECT_FOR_GOLD_TOOL, ToolMaterial.GOLD.durability() * 4, ToolMaterial.GOLD.speed(), 0.0f, ToolMaterial.GOLD.enchantmentValue(), ModTags.Items.PUMPKIN_DICER_TOOL_MATERIALS);

    public static final ToolMaterial BREAKING_POWER_2 = new ToolMaterial(BlockTags.INCORRECT_FOR_STONE_TOOL, ToolMaterial.STONE.durability(), ToolMaterial.STONE.speed(), ToolMaterial.STONE.attackDamageBonus(), ToolMaterial.STONE.enchantmentValue(), ModTags.Items.EMPTY);
    public static final ToolMaterial BREAKING_POWER_3 = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, ToolMaterial.IRON.durability(), ToolMaterial.IRON.speed(), ToolMaterial.IRON.attackDamageBonus(), ToolMaterial.IRON.enchantmentValue(), ModTags.Items.EMPTY);
    public static final ToolMaterial BREAKING_POWER_4 = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, ToolMaterial.DIAMOND.durability(), ToolMaterial.DIAMOND.speed(), ToolMaterial.DIAMOND.attackDamageBonus(), ToolMaterial.DIAMOND.enchantmentValue(), ModTags.Items.EMPTY);
    public static final ToolMaterial BREAKING_POWER_5 = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, ToolMaterial.NETHERITE.durability(), ToolMaterial.NETHERITE.speed(), ToolMaterial.NETHERITE.attackDamageBonus(), ToolMaterial.NETHERITE.enchantmentValue(), ModTags.Items.EMPTY);

    //Creates irrepairable tool material
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

    //Creates irrepairable material by scaling the durability and speed values of a vanilla material
    public static ToolMaterial getToolMaterial(ToolMaterial vanilla, int breakingPower, int durabilityMultiplier, float speedMultiplier, TagKey<Item> repairItems) {
        return getToolMaterial(breakingPower, vanilla.durability() * durabilityMultiplier, vanilla.speed() * speedMultiplier, 0, vanilla.enchantmentValue(), repairItems);
    }

    //Creates irrepairable material by scaling the durability and speed values of a vanilla material
    public static ToolMaterial getToolMaterial(ToolMaterial vanilla, int durabilityMultiplier, float speedMultiplier, TagKey<Item> repairItems) {
        int breakingPower;
        if (vanilla == ToolMaterial.STONE) breakingPower = 2;
        else if (vanilla == ToolMaterial.IRON) breakingPower = 3;
        else if (vanilla == ToolMaterial.DIAMOND) breakingPower = 4;
        else if (vanilla == ToolMaterial.NETHERITE) breakingPower = 5;
        else breakingPower = 1;

        return getToolMaterial(breakingPower, vanilla.durability() * durabilityMultiplier, vanilla.speed() * speedMultiplier, 0, vanilla.enchantmentValue(), repairItems);
    }

    //Creates irrepairable material with durability scaled based on rarity
    public static ToolMaterial getToolMaterial(ToolMaterial vanilla, Rarity rarity) {
        return getToolMaterial(vanilla, rarity.ordinal() + 1, 1, ModTags.Items.EMPTY);
    }
}
