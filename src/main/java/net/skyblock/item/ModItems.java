package net.skyblock.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.*;
import net.minecraft.util.Rarity;
import net.skyblock.Skyblock;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.skyblock.item.custom.*;
import net.skyblock.sound.ModSounds;
import net.skyblock.util.ModRarity;

public class ModItems {
    public static final Item MITHRIL = registerItem("mithril", new ModItem().setLoreKey("mithril").setModRarity(ModRarity.COMMON));
    public static final Item TITANIUM = registerItem("titanium", new ModItem().setLoreKey("titanium").setModRarity(ModRarity.RARE));
    public static final Item MAGICAL_WATER_BUCKET = registerItem("magical_water_bucket", new MagicalBucketItem(Fluids.WATER, new FabricItemSettings(), "magical_water_bucket"));
    public static final Item MAGICAL_LAVA_BUCKET = registerItem("magical_lava_bucket", new MagicalBucketItem(Fluids.LAVA, new FabricItemSettings().rarity(Rarity.UNCOMMON), "magical_lava_bucket"));
    public static final Item MAGICAL_MILK_BUCKET = registerItem("magical_milk_bucket", new MagicalMilkBucket(new FabricItemSettings(), "magical_milk_bucket"));
    public static final Item FOUL_FLESH = registerItem("foul_flesh", new Item(new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item TRUE_ESSENCE = registerItem("true_essence", new ModItem().setLoreKey("true_essence").setGlint(true));
    public static final Item REFINED_MINERAL = registerItem("refined_mineral", new Item(new FabricItemSettings().rarity(Rarity.RARE)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Skyblock.MOD_ID, name), item);
    }
    public static void registerModItems() {
        Skyblock.LOGGER.info("Registering Mod Items for " + Skyblock.MOD_ID);

        EnchantedItems.registerEnchantedItems();
        RuneItems.registerRuneItems();
        ModArmorItems.registerModArmorItems();
        ModToolItems.registerModToolItems();
        ModMusicDiscItems.registerModMusicDiscItems();

    }
}
