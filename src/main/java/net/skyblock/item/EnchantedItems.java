package net.skyblock.item;

import net.skyblock.Skyblock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.skyblock.util.ModRarity;

public class EnchantedItems {
    public static final EnchantedItem ENCHANTED_ACACIA_LOG = registerItem("enchanted_acacia_log", new EnchantedItem(new FabricItemSettings(), ModRarity.UNCOMMON));
    public static final EnchantedItem ENCHANTED_BAKED_POTATO = registerItem("enchanted_baked_potato", new EnchantedItem(new FabricItemSettings(), ModRarity.RARE));
    public static final EnchantedItem ENCHANTED_POTATO = registerItem("enchanted_potato", new EnchantedItem(new FabricItemSettings(), ModRarity.UNCOMMON));

    private static EnchantedItem registerItem(String name, EnchantedItem item) {
        return Registry.register(Registries.ITEM, new Identifier(Skyblock.MOD_ID, name), item);
    }
    public static void registerEnchantedItems() {
        Skyblock.LOGGER.info("Registering Enchanted Items for " + Skyblock.MOD_ID);

    }
}
