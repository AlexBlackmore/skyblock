package net.skyblock.item;

import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.util.Rarity;
import net.skyblock.Skyblock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.skyblock.util.ModRarity;

public class EnchantedItems {
    public static final Item ACACIA_LOG = registerItem("enchanted_acacia_log",
            (EnchantedItem) new EnchantedItem(Items.ACACIA_LOG).setModRarity(ModRarity.UNCOMMON));
    public static final Item BAKED_POTATO = registerItem("enchanted_baked_potato",
            (EnchantedItem) new EnchantedItem(Items.POTATO).setModRarity(ModRarity.RARE));
    public static final Item BLAZE_POWDER = registerItem("enchanted_blaze_powder",
            (EnchantedItem) new EnchantedItem(Items.BLAZE_POWDER).setModRarity(ModRarity.UNCOMMON));
    public static final Item BLAZE_ROD = registerItem("enchanted_blaze_rod",
            (EnchantedItem) new EnchantedItem(Items.BLAZE_ROD).setModRarity(ModRarity.RARE));
    public static final Item CACTUS = registerItem("enchanted_cactus",
            (EnchantedItem) new EnchantedItem(Items.CACTUS).setModRarity(ModRarity.RARE));
    public static final Item CAKE = registerItem("enchanted_cake",
            (EnchantedItem) new EnchantedItem(Items.CAKE).setModRarity(ModRarity.UNCOMMON));
    public static final Item COAL = registerItem("enchanted_coal",
            (EnchantedItem) new EnchantedItem(Items.COAL).setModRarity(ModRarity.UNCOMMON));
    public static final Item COBBLESTONE = registerItem("enchanted_cobblestone",
            (EnchantedItem) new EnchantedItem(Items.COBBLESTONE).setModRarity(ModRarity.UNCOMMON));
    public static final Item COCOA_BEANS = registerItem("enchanted_cocoa_beans",
            (EnchantedItem) new EnchantedItem(Items.COCOA_BEANS).setModRarity(ModRarity.UNCOMMON));
    public static final Item COOKED_CHICKEN = registerItem("enchanted_cooked_chicken",
            (EnchantedItem) new EnchantedItem(Items.COOKED_CHICKEN).setModRarity(ModRarity.RARE));
    public static final Item COOKED_MUTTON = registerItem("enchanted_cooked_mutton",
            (EnchantedItem) new EnchantedItem(Items.COOKED_MUTTON).setModRarity(ModRarity.RARE));
    public static final Item COOKED_PORKCHOP = registerItem("enchanted_cooked_porkchop",
            (EnchantedItem) new EnchantedItem(Items.COOKED_PORKCHOP).setModRarity(ModRarity.RARE));
    public static final Item COOKIE = registerItem("enchanted_cookie",
            (EnchantedItem) new EnchantedItem(Items.COOKIE).setModRarity(ModRarity.RARE));
    public static final Item DIAMOND = registerItem("enchanted_diamond",
            (EnchantedItem) new EnchantedItem(Items.DIAMOND).setModRarity(ModRarity.UNCOMMON));
    public static final Item EMERALD = registerItem("enchanted_emerald",
            (EnchantedItem) new EnchantedItem(Items.EMERALD).setModRarity(ModRarity.UNCOMMON));
    public static final Item FERMENTED_SPIDER_EYE = registerItem("enchanted_fermented_spider_eye",
            (EnchantedItem) new EnchantedItem(Items.FERMENTED_SPIDER_EYE).setModRarity(ModRarity.RARE));
    public static final Item GHAST_TEAR = registerItem("enchanted_ghast_tear",
            (EnchantedItem) new EnchantedItem(Items.GHAST_TEAR).setModRarity(ModRarity.UNCOMMON));
    public static final Item GLISTERING_MELON_SLICE = registerItem("enchanted_glistering_melon_slice",
            (EnchantedItem) new EnchantedItem(Items.GLISTERING_MELON_SLICE).setModRarity(ModRarity.RARE));
    public static final Item GLOWSTONE = registerItem("enchanted_glowstone",
            (EnchantedItem) new EnchantedItem(Items.GLOWSTONE).setModRarity(ModRarity.RARE));
    public static final Item GLOWSTONE_DUST = registerItem("enchanted_glowstone_dust",
            (EnchantedItem) new EnchantedItem(Items.GLOWSTONE_DUST).setModRarity(ModRarity.UNCOMMON));
    public static final Item GOLD_BLOCK = registerItem("enchanted_gold_block",
            (EnchantedItem) new EnchantedItem(Items.GOLD_BLOCK).setModRarity(ModRarity.RARE));
    public static final Item GOLD_INGOT = registerItem("enchanted_gold_ingot",
            (EnchantedItem) new EnchantedItem(Items.GOLD_INGOT).setModRarity(ModRarity.UNCOMMON));
    public static final Item GREEN_DYE = registerItem("enchanted_green_dye",
            (EnchantedItem) new EnchantedItem(Items.GREEN_DYE).setModRarity(ModRarity.UNCOMMON));
    public static final Item HAY_BLOCK = registerItem("enchanted_hay_block",
            (EnchantedItem) new EnchantedItem(Items.HAY_BLOCK).setModRarity(ModRarity.UNCOMMON));
    public static final Item ICE = registerItem("enchanted_ice",
            (EnchantedItem) new EnchantedItem(Items.ICE).setModRarity(ModRarity.UNCOMMON));
    public static final Item INK_SAC = registerItem("enchanted_ink_sac",
            (EnchantedItem) new EnchantedItem(Items.INK_SAC).setModRarity(ModRarity.UNCOMMON));
    public static final Item IRON_INGOT = registerItem("enchanted_iron_ingot",
            (EnchantedItem) new EnchantedItem(Items.IRON_INGOT).setModRarity(ModRarity.UNCOMMON));
    public static final Item MELON_SLICE = registerItem("enchanted_melon_slice",
            (EnchantedItem) new EnchantedItem(Items.MELON_SLICE).setModRarity(ModRarity.UNCOMMON));
    public static final Item MUTTON = registerItem("enchanted_mutton",
            (EnchantedItem) new EnchantedItem(Items.MUTTON).setModRarity(ModRarity.UNCOMMON));
    public static final Item NETHERRACK = registerItem("enchanted_netherrack",
            (EnchantedItem) new EnchantedItem(Items.NETHERRACK).setModRarity(ModRarity.UNCOMMON));
    public static final Item POISONOUS_POTATO = registerItem("enchanted_poisonous_potato",
            (EnchantedItem) new EnchantedItem(Items.POISONOUS_POTATO).setModRarity(ModRarity.UNCOMMON));
    public static final Item POTATO = registerItem("enchanted_potato",
            (EnchantedItem) new EnchantedItem(Items.POTATO).setModRarity(ModRarity.UNCOMMON));
    public static final Item RABBIT_FOOT = registerItem("enchanted_rabbit_foot",
            (EnchantedItem) new EnchantedItem(Items.RABBIT_FOOT).setModRarity(ModRarity.RARE));
    public static final Item RABBIT_HIDE = registerItem("enchanted_rabbit_hide",
            (EnchantedItem) new EnchantedItem(Items.RABBIT_HIDE).setModRarity(ModRarity.RARE));
    public static final Item REDSTONE = registerItem("enchanted_redstone",
            (EnchantedItem) new EnchantedItem(Items.ACACIA_LOG).setModRarity(ModRarity.UNCOMMON));
    public static final Item REDSTONE_BLOCK = registerItem("enchanted_redstone_block",
            (EnchantedItem) new EnchantedItem(Items.REDSTONE_BLOCK).setModRarity(ModRarity.RARE));
    public static final Item REDSTONE_LAMP = registerItem("enchanted_redstone_lamp",
            (EnchantedItem) new EnchantedItem(Items.REDSTONE_LAMP).setModRarity(ModRarity.RARE));
    public static final Item SPIDER_EYE = registerItem("enchanted_spider_eye",
            (EnchantedItem) new EnchantedItem(Items.SPIDER_EYE).setModRarity(ModRarity.UNCOMMON));
    public static final Item SUGAR = registerItem("enchanted_sugar",
            (EnchantedItem) new EnchantedItem(Items.SUGAR).setModRarity(ModRarity.UNCOMMON));
    public static final Item SUGAR_CANE = registerItem("enchanted_sugar_cane",
            (EnchantedItem) new EnchantedItem(Items.SUGAR_CANE).setModRarity(ModRarity.RARE));
    private static Item registerItem(String name, EnchantedItem item) {
        return Registry.register(Registries.ITEM, new Identifier(Skyblock.MOD_ID, name), item);
    }
    public static void registerEnchantedItems() {
        Skyblock.LOGGER.info("Registering Enchanted Items for " + Skyblock.MOD_ID);
    }
}
