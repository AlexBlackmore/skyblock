package net.skyblock.util;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.skyblock.Skyblock;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> MITHRIL_ORES = createTag("mithril_ores");
        public static final TagKey<Block> DWARVEN_ORES = createTag("dwarven_ores");
        public static final TagKey<Block> DWARVEN_GOLD = createTag("dwarven_gold");
        public static final TagKey<Block> ORES = createTag("ores");
        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, new Identifier(Skyblock.MOD_ID, name));
        }
    }

    public static class Items {
        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, new Identifier(Skyblock.MOD_ID, name));
        }
    }
}
