package net.skyblock.item;

import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.skyblock.Skyblock;

public class EnchantedItems {
    public static final Item ENCHANTED_COBBLESTONE = registerItem("enchanted_cobblestone", Items.COBBLESTONE, Rarity.UNCOMMON);
    public static final Item ENCHANTED_MELON_SLICE = registerItem("enchanted_melon_slice", Items.MELON_SLICE, Rarity.UNCOMMON);
    public static final Item ENCHANTED_MELON = registerItem("enchanted_melon", Items.MELON, Rarity.RARE);
    public static final Item ENCHANTED_PUMPKIN = registerItem("enchanted_pumpkin", Items.PUMPKIN, Rarity.UNCOMMON);
    public static final Item ENCHANTED_JUNGLE_LOG = registerItem("enchanted_jungle_log", Items.JUNGLE_LOG, Rarity.UNCOMMON);
    public static final Item ENCHANTED_OBSIDIAN = registerItem("enchanted_obsidian", Items.OBSIDIAN, Rarity.UNCOMMON);
    public static final Item ENCHANTED_MITHRIL = registerItem("enchanted_mithril", ModItems.MITHRIL, Rarity.RARE);
    public static final Item ENCHANTED_TITANIUM = registerItem("enchanted_titanium", ModItems.TITANIUM, Rarity.EPIC);
    public static final Item ENCHANTED_WHEAT = registerItem("enchanted_wheat", Items.WHEAT, Rarity.UNCOMMON);
    public static final Item ENCHANTED_HAY_BLOCK = registerItem("enchanted_hay_block", Items.HAY_BLOCK, Rarity.RARE);
    public static final Item ENCHANTED_CARROT = registerItem("enchanted_carrot", Items.CARROT, Rarity.UNCOMMON);
    public static final Item ENCHANTED_GOLDEN_CARROT = registerItem("enchanted_golden_carrot", Items.GOLDEN_CARROT, Rarity.RARE);
    public static final Item ENCHANTED_POTATO = registerItem("enchanted_potato", Items.POTATO, Rarity.UNCOMMON);
    public static final Item ENCHANTED_BAKED_POTATO = registerItem("enchanted_baked_potato", Items.BAKED_POTATO, Rarity.RARE);
    public static final Item ENCHANTED_SUGAR = registerItem("enchanted_sugar", Items.SUGAR, Rarity.UNCOMMON);
    public static final Item ENCHANTED_SUGAR_CANE = registerItem("enchanted_sugar_cane", Items.SUGAR_CANE, Rarity.RARE);
    public static final Item ENCHANTED_NETHER_WART = registerItem("enchanted_nether_wart", Items.NETHER_WART, Rarity.UNCOMMON);
    public static final Item ENCHANTED_SULPHUR = registerItem("enchanted_sulphur", ModItems.SULPHUR, Rarity.RARE);

    private static Item registerItem(String name, Item item, Rarity rarity) {
        return Registry.register(Registries.ITEM, Identifier.of(Skyblock.MOD_ID, name),
                new EnchantedItem(item, new Item.Settings().rarity(rarity).registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Skyblock.MOD_ID,name)))));
    }

    public static void registerEnchantedItems() {
        Skyblock.LOGGER.info("Registering Enchanted Items for " + Skyblock.MOD_ID);
    }
}
