package net.skyblock.item;

import net.minecraft.item.Item;
import net.minecraft.util.Rarity;
import net.skyblock.Skyblock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class EnchantedItems {
    public static final Item ACACIA_LOG = registerItem("enchanted_acacia_log",
            new EnchantedItem(new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item BAKED_POTATO = registerItem("enchanted_baked_potato",
            new EnchantedItem(new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item BLAZE_POWDER = registerItem("enchanted_blaze_powder",
            new EnchantedItem(new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item BLAZE_ROD = registerItem("enchanted_blaze_rod",
            new EnchantedItem(new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item CACTUS = registerItem("enchanted_cactus",
            new EnchantedItem(new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item CAKE = registerItem("enchanted_cake",
            new EnchantedItem(new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item COAL = registerItem("enchanted_coal",
            new EnchantedItem(new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item COCOA_BEANS = registerItem("enchanted_cocoa_beans",
            new EnchantedItem(new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item COOKED_CHICKEN = registerItem("enchanted_cooked_chicken",
            new EnchantedItem(new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item COOKED_MUTTON = registerItem("enchanted_cooked_mutton",
            new EnchantedItem(new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item COOKED_PORKCHOP = registerItem("enchanted_cooked_porkchop",
            new EnchantedItem(new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item COOKIE = registerItem("enchanted_cookie",
            new EnchantedItem(new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item DIAMOND = registerItem("enchanted_diamond",
            new EnchantedItem(new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item EMERALD = registerItem("enchanted_emerald",
            new EnchantedItem(new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item FERMENTED_SPIDER_EYE = registerItem("enchanted_fermented_spider_eye",
            new EnchantedItem(new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item GHAST_TEAR = registerItem("enchanted_ghast_tear",
            new EnchantedItem(new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item GLISTERING_MELON_SLICE = registerItem("enchanted_glistering_melon_slice",
            new EnchantedItem(new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item GLOWSTONE = registerItem("enchanted_glowstone",
            new EnchantedItem(new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item GLOWSTONE_DUST = registerItem("enchanted_glowstone_dust",
            new EnchantedItem(new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item GOLD_BLOCK = registerItem("enchanted_gold_block",
            new EnchantedItem(new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item GOLD_INGOT = registerItem("enchanted_gold_ingot",
            new EnchantedItem(new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item GREEN_DYE = registerItem("enchanted_green_dye",
            new EnchantedItem(new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item ICE = registerItem("enchanted_ice",
            new EnchantedItem(new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item INK_SAC = registerItem("enchanted_ink_sac",
            new EnchantedItem(new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item IRON_INGOT = registerItem("enchanted_iron_ingot",
            new EnchantedItem(new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item MELON_SLICE = registerItem("enchanted_melon_slice",
            new EnchantedItem(new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item MUTTON = registerItem("enchanted_mutton",
            new EnchantedItem(new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item NETHERRACK = registerItem("enchanted_netherrack",
            new EnchantedItem(new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item POISONOUS_POTATO = registerItem("enchanted_poisonous_potato",
            new EnchantedItem(new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item POTATO = registerItem("enchanted_potato",
            new EnchantedItem(new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item RABBIT_FOOT = registerItem("enchanted_rabbit_foot",
            new EnchantedItem(new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item RABBIT_HIDE = registerItem("enchanted_rabbit_hide",
            new EnchantedItem(new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item REDSTONE = registerItem("enchanted_redstone",
            new EnchantedItem(new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item REDSTONE_BLOCK = registerItem("enchanted_redstone_block",
            new EnchantedItem(new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item REDSTONE_LAMP = registerItem("enchanted_redstone_lamp",
            new EnchantedItem(new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item SPIDER_EYE = registerItem("enchanted_spider_eye",
            new EnchantedItem(new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item SUGAR = registerItem("enchanted_sugar",
            new EnchantedItem(new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item SUGAR_CANE = registerItem("enchanted_sugar_cane",
            new EnchantedItem(new FabricItemSettings().rarity(Rarity.RARE)));
    private static Item registerItem(String name, EnchantedItem item) {
        return Registry.register(Registries.ITEM, new Identifier(Skyblock.MOD_ID, name), item);
    }
    public static void registerEnchantedItems() {
        Skyblock.LOGGER.info("Registering Enchanted Items for " + Skyblock.MOD_ID);
    }
}
