package net.skyblock.util;

import net.minecraft.block.Block;
import net.minecraft.entity.EntityType;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.skyblock.Skyblock;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> GIVES_FORAGING_XP = createTag("gives_foraging_xp");
        public static final TagKey<Block> PURE_ORES = createTag("pure_ores");
        public static final TagKey<Block> DEEPSLATE_ORES = createTag("deepslate_ores");
        public static final TagKey<Block> GRAVEL = createTag("gravel");
        public static final TagKey<Block> MUSHROOMS = createTag("mushrooms");
        public static final TagKey<Block> MUSHROOM_BLOCKS = createTag("mushroom_blocks");
        public static final TagKey<Block> ORES = createTag("ores");
        public static final TagKey<Block> DWARVEN_METALS = createTag("dwarven_metals");
        public static final TagKey<Block> MITHRIL_ORES = createTag("mithril_ores");
        public static final TagKey<Block> UMBER_ORES = createTag("umber_ores");
        public static final TagKey<Block> TUNGSTEN_ORES = createTag("tungsten_ores");
        public static final TagKey<Block> NEEDS_NETHERITE_TOOL = createTag("needs_netherite_tool");
        public static final TagKey<Block> NEEDS_BREAKING_POWER_6 = createTag("needs_breaking_power_6");
        public static final TagKey<Block> NEEDS_BREAKING_POWER_7 = createTag("needs_breaking_power_7");
        public static final TagKey<Block> NEEDS_BREAKING_POWER_8 = createTag("needs_breaking_power_8");
        public static final TagKey<Block> NEEDS_BREAKING_POWER_9 = createTag("needs_breaking_power_9");
        public static final TagKey<Block> INCORRECT_FOR_BREAKING_POWER_6 = createTag("incorrect_for_breaking_power_6");
        public static final TagKey<Block> INCORRECT_FOR_BREAKING_POWER_7 = createTag("incorrect_for_breaking_power_7");
        public static final TagKey<Block> INCORRECT_FOR_BREAKING_POWER_8 = createTag("incorrect_for_breaking_power_8");
        public static final TagKey<Block> INCORRECT_FOR_BREAKING_POWER_9 = createTag("incorrect_for_breaking_power_9");

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(Skyblock.MOD_ID, name));
        }
    }

    public static class Items {
        //TODO: repairing tools with custom tags does not currently work for some reason? Need to figure out why
        public static final TagKey<Item> EMPTY = createTag("empty");
        public static final TagKey<Item> LAPIS_TOOL_MATERIALS = createTag("lapis_tool_materials");
        public static final TagKey<Item> ZOMBIE_TOOL_MATERIALS = createTag("zombie_tool_materials");
        public static final TagKey<Item> MITHRIL_TOOL_MATERIALS = createTag("mithril_tool_materials");
        public static final TagKey<Item> JUNGLE_AXE_MATERIALS = createTag("jungle_axe_materials");
        public static final TagKey<Item> JUNGLE_PICKAXE_MATERIALS = createTag("jungle_pickaxe_materials");
        public static final TagKey<Item> TREECAPITATOR_TOOL_MATERIALS = createTag("treecapitator_materials");
        public static final TagKey<Item> PROMISING_TOOL_MATERIALS = createTag("promising_tool_materials");
        public static final TagKey<Item> FLINT_TOOL_MATERIALS = createTag("flint_tool_materials");
        public static final TagKey<Item> MELON_DICER_TOOL_MATERIALS = createTag("melon_dicer_tool_materials");
        public static final TagKey<Item> PUMPKIN_DICER_TOOL_MATERIALS = createTag("pumpkin_dicer_tool_materials");
        public static final TagKey<Item> TITANIUM_TOOL_MATERIALS = createTag("titanium_tool_materials");
        public static final TagKey<Item> WHEAT_TOOL_MATERIALS = createTag("wheat_tool_materials");
        public static final TagKey<Item> ENCHANTED_WHEAT_TOOL_MATERIALS = createTag("enchanted_wheat_tool_materials");
        public static final TagKey<Item> ENCHANTED_HAY_BLOCK_TOOL_MATERIALS = createTag("enchanted_hay_block_tool_materials");
        public static final TagKey<Item> CARROT_TOOL_MATERIALS = createTag("carrot_tool_materials");
        public static final TagKey<Item> ENCHANTED_CARROT_TOOL_MATERIALS = createTag("enchanted_carrot_tool_materials");
        public static final TagKey<Item> ENCHANTED_GOLDEN_CARROT_TOOL_MATERIALS = createTag("enchanted_golden_carrot_tool_materials");
        public static final TagKey<Item> POTATO_TOOL_MATERIALS = createTag("potato_tool_materials");
        public static final TagKey<Item> ENCHANTED_POTATO_TOOL_MATERIALS = createTag("enchanted_potato_tool_materials");
        public static final TagKey<Item> ENCHANTED_BAKED_POTATO_TOOL_MATERIALS = createTag("enchanted_baked_potato_tool_materials");
        public static final TagKey<Item> SUGAR_CANE_TOOL_MATERIALS = createTag("sugar_cane_tool_materials");
        public static final TagKey<Item> ENCHANTED_SUGAR_TOOL_MATERIALS = createTag("enchanted_sugar_tool_materials");
        public static final TagKey<Item> ENCHANTED_SUGAR_CANE_TOOL_MATERIALS = createTag("enchanted_sugar_cane_tool_materials");
        public static final TagKey<Item> NETHER_WART_TOOL_MATERIALS = createTag("nether_wart_tool_materials");
        public static final TagKey<Item> ENCHANTED_NETHER_WART_TOOL_MATERIALS = createTag("enchanted_nether_wart_materials");
        public static final TagKey<Item> MUTANT_NETHER_WART_TOOL_MATERIALS = createTag("mutant_nether_wart_tool_materials");

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(Skyblock.MOD_ID, name));
        }
    }

    public static class EntityTypes {
        public static final TagKey<EntityType<?>> HOSTILE = createTag("hostile");
        public static final TagKey<EntityType<?>> NEUTRAL = createTag("neutral");

        private static TagKey<EntityType<?>> createTag(String name) {
            return TagKey.of(RegistryKeys.ENTITY_TYPE, Identifier.of(Skyblock.MOD_ID, name));
        }
    }
}
