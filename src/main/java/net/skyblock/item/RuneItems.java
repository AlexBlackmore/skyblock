package net.skyblock.item;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.skyblock.Skyblock;

public class RuneItems {
    public static final Item BLOOD = registerItem("blood_rune", new RuneItem(RuneItem.Type.MELEE).setLoreKey("blood_rune"));
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Skyblock.MOD_ID, name), item);
    }
    public static void registerRuneItems() {
        Skyblock.LOGGER.info("Registering Rune Items for " + Skyblock.MOD_ID);
    }
}
