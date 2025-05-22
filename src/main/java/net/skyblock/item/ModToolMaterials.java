package net.skyblock.item;

import net.minecraft.item.ToolMaterial;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.util.Rarity;
import net.skyblock.util.ModTags;

public class ModToolMaterials {

    public static final ToolMaterial LAPIS = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, ToolMaterial.DIAMOND.durability() * 2, ToolMaterial.DIAMOND.speed() * 0.9090f, 0.0f, ToolMaterial.DIAMOND.enchantmentValue(), ModTags.Items.LAPIS_TOOL_MATERIALS);
    public static final ToolMaterial ZOMBIE = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, ToolMaterial.IRON.durability(), ToolMaterial.IRON.speed() * 1.1875f, 0.0f, ToolMaterial.IRON.enchantmentValue(), ModTags.Items.ZOMBIE_TOOL_MATERIALS);
    public static final ToolMaterial ROOKIE = new ToolMaterial(BlockTags.INCORRECT_FOR_STONE_TOOL, ToolMaterial.STONE.durability(), ToolMaterial.STONE.speed() * 1.3636f, 0.0f, ToolMaterial.STONE.enchantmentValue(), ModTags.Items.EMPTY);
    public static final ToolMaterial JUNGLE_AXE = new ToolMaterial(BlockTags.INCORRECT_FOR_WOODEN_TOOL, ToolMaterial.WOOD.durability() * 2, ToolMaterial.WOOD.speed(), 0.0f, ToolMaterial.WOOD.enchantmentValue(), ModTags.Items.JUNGLE_AXE_MATERIALS);
    public static final ToolMaterial JUNGLE_PICKAXE = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, ToolMaterial.WOOD.durability() * 2, ToolMaterial.WOOD.speed() * 4.7143f, 0.0f, ToolMaterial.WOOD.enchantmentValue(), ModTags.Items.JUNGLE_PICKAXE_MATERIALS);
    public static final ToolMaterial TREECAPITATOR = new ToolMaterial(BlockTags.INCORRECT_FOR_GOLD_TOOL, ToolMaterial.GOLD.durability() * 4, ToolMaterial.GOLD.speed(), 0.0f, ToolMaterial.GOLD.enchantmentValue(), ModTags.Items.TREECAPITATOR_TOOL_MATERIALS);
    public static final ToolMaterial PROMISING = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, ToolMaterial.IRON.durability() * 2, ToolMaterial.IRON.speed() * 0.3125f, 0.0f, ToolMaterial.IRON.enchantmentValue(), ModTags.Items.PROMISING_TOOL_MATERIALS);
    public static final ToolMaterial FLINT = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, ToolMaterial.IRON.durability(), ToolMaterial.IRON.speed(), 0.0f, ToolMaterial.IRON.enchantmentValue(), ModTags.Items.FLINT_TOOL_MATERIALS);
    public static final ToolMaterial MELON_DICER = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, ToolMaterial.DIAMOND.durability() * 4, ToolMaterial.DIAMOND.speed(), 0.0f, ToolMaterial.DIAMOND.enchantmentValue(), ModTags.Items.MELON_DICER_TOOL_MATERIALS);
    public static final ToolMaterial PUMPKIN_DICER = new ToolMaterial(BlockTags.INCORRECT_FOR_GOLD_TOOL, ToolMaterial.GOLD.durability() * 4, ToolMaterial.GOLD.speed(), 0.0f, ToolMaterial.GOLD.enchantmentValue(), ModTags.Items.PUMPKIN_DICER_TOOL_MATERIALS);
    public static final ToolMaterial BREAKING_POWER_2 = new ToolMaterial(BlockTags.INCORRECT_FOR_STONE_TOOL, ToolMaterial.STONE.durability(), ToolMaterial.STONE.speed(), ToolMaterial.STONE.attackDamageBonus(), ToolMaterial.STONE.enchantmentValue(), ModTags.Items.EMPTY);
    public static final ToolMaterial BREAKING_POWER_3 = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, ToolMaterial.IRON.durability(), ToolMaterial.IRON.speed(), ToolMaterial.IRON.attackDamageBonus(), ToolMaterial.IRON.enchantmentValue(), ModTags.Items.EMPTY);
    public static final ToolMaterial BREAKING_POWER_4 = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, ToolMaterial.DIAMOND.durability(), ToolMaterial.DIAMOND.speed(), ToolMaterial.DIAMOND.attackDamageBonus(), ToolMaterial.DIAMOND.enchantmentValue(), ModTags.Items.EMPTY);
    public static final ToolMaterial BREAKING_POWER_5 = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, ToolMaterial.NETHERITE.durability(), ToolMaterial.NETHERITE.speed(), ToolMaterial.NETHERITE.attackDamageBonus(), ToolMaterial.NETHERITE.enchantmentValue(), ModTags.Items.EMPTY);

    public static ToolMaterial getIrrepairableToolMaterial(ToolMaterial vanillaMaterial, int rarityMultiplier) {
        if (vanillaMaterial.equals(ToolMaterial.WOOD)) return new ToolMaterial(BlockTags.INCORRECT_FOR_WOODEN_TOOL, ToolMaterial.WOOD.durability() * rarityMultiplier, ToolMaterial.WOOD.speed(), 0.0f, ToolMaterial.WOOD.enchantmentValue(), ModTags.Items.EMPTY);
        else if (vanillaMaterial.equals(ToolMaterial.STONE)) return new ToolMaterial(BlockTags.INCORRECT_FOR_STONE_TOOL, ToolMaterial.STONE.durability() * rarityMultiplier, ToolMaterial.STONE.speed(), 0.0f, ToolMaterial.STONE.enchantmentValue(), ModTags.Items.EMPTY);
        else if (vanillaMaterial.equals(ToolMaterial.IRON)) return new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, ToolMaterial.IRON.durability() * rarityMultiplier, ToolMaterial.IRON.speed(), 0.0f, ToolMaterial.IRON.enchantmentValue(), ModTags.Items.EMPTY);
        else if (vanillaMaterial.equals(ToolMaterial.DIAMOND)) return new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, ToolMaterial.DIAMOND.durability() * rarityMultiplier, ToolMaterial.DIAMOND.speed(), 0.0f, ToolMaterial.DIAMOND.enchantmentValue(), ModTags.Items.EMPTY);
        else if (vanillaMaterial.equals(ToolMaterial.NETHERITE)) return new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, ToolMaterial.NETHERITE.durability() * rarityMultiplier, ToolMaterial.NETHERITE.speed(), 0.0f, ToolMaterial.NETHERITE.enchantmentValue(), ModTags.Items.EMPTY);
        else if (vanillaMaterial.equals(ToolMaterial.GOLD)) return new ToolMaterial(BlockTags.INCORRECT_FOR_GOLD_TOOL, ToolMaterial.GOLD.durability() * rarityMultiplier, ToolMaterial.GOLD.speed(), 0.0f, ToolMaterial.GOLD.enchantmentValue(), ModTags.Items.EMPTY);
        else return new ToolMaterial(BlockTags.INCORRECT_FOR_WOODEN_TOOL, ToolMaterial.WOOD.durability() * rarityMultiplier, ToolMaterial.WOOD.speed(), 0.0f, ToolMaterial.WOOD.enchantmentValue(), ModTags.Items.EMPTY);
    }

    public static ToolMaterial getRareIrrepairableToolMaterial(ToolMaterial vanillaMaterial, Rarity rarity) {
        return getIrrepairableToolMaterial(vanillaMaterial, rarity.ordinal() + 1);
    }
}
