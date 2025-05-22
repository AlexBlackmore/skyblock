package net.skyblock.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.LoreComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.skyblock.Skyblock;
import net.skyblock.util.ExpandedRarity;

import java.util.ArrayList;
import java.util.List;


public class ModItems {
    public static final Item MITHRIL = registerItem("mithril", Rarity.COMMON, 4);
    public static final Item BAT_THE_FISH = registerItem("bat_the_fish", new ModItem("bat_the_fish", ExpandedRarity.ModRarity.SPECIAL, 1));
    public static final Item SLUDGE_JUICE = registerItem("sludge_juice", Rarity.UNCOMMON, 3);

    public static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Skyblock.MOD_ID, name), item);
    }
    public static Item registerItem(String name, Item.Settings settings) {
        return Registry.register(Registries.ITEM, Identifier.of(Skyblock.MOD_ID, name), new Item(settings));
    }
    public static Item registerItem(String name, Rarity rarity, int loreLines) {
        Item.Settings settings = new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Skyblock.MOD_ID,name)))
                .rarity(rarity);

        if (loreLines >= 1) {
            settings = settings.component(DataComponentTypes.LORE, new LoreComponent(ModItems.getLoreList(name,loreLines)));
        }
        return ModItems.registerItem(name, settings);
    }

    public static void registerModItems() {
        Skyblock.LOGGER.info("Registering Mod Items for " + Skyblock.MOD_ID);

        EnchantedItems.registerEnchantedItems();
        ModTools.registerModTools();

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(ModItems.MITHRIL);
            entries.add(ModItems.SLUDGE_JUICE);
        });
    }

    public static List<Text> getLoreList(String name, int loreLines) {
        String key = "lore." + Skyblock.MOD_ID + "." + name;
        List<Text> lines = new ArrayList<>();

        for (int i = 0; i < loreLines; i++) {
            lines.add(Text.translatable(key + "." + i));
        }
        return lines;
    }
}
