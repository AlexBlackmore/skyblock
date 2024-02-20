package net.skyblock.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.HoeItem;
import net.minecraft.item.ToolMaterials;
import net.minecraft.util.Rarity;
import net.skyblock.Skyblock;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.skyblock.item.custom.*;
import net.skyblock.util.ModRarity;

public class ModItems {
    public static final ModItem MITHRIL = registerItem("mithril", new ModItem(new FabricItemSettings(), ModRarity.COMMON, "mithril"));
    public static final Item MAGICAL_WATER_BUCKET = registerItem("magical_water_bucket", new MagicalBucketItem(Fluids.WATER, new FabricItemSettings(), "magical_water_bucket"));
    public static final Item MAGICAL_LAVA_BUCKET = registerItem("magical_lava_bucket", new MagicalBucketItem(Fluids.LAVA, new FabricItemSettings().rarity(Rarity.UNCOMMON), "magical_water_bucket"));
    public static final Item MAGICAL_MILK_BUCKET = registerItem("magical_milk_bucket", new MagicalMilkBucket(new FabricItemSettings(), "magical_milk_bucket"));
    public static final Item ROOKIE_HOE = registerItem("rookie_hoe", new HoeItem(ToolMaterials.STONE, -1, -2.0f, new FabricItemSettings()));
    public static final Item HOE_OF_GREAT_TILLING = registerItem("hoe_of_great_tilling", new TillingHoeItem(ToolMaterials.STONE, -1, -2.0f, new FabricItemSettings().rarity(Rarity.UNCOMMON), 3));
    public static final Item HOE_OF_GREATER_TILLING = registerItem("hoe_of_greater_tilling", new TillingHoeItem(ToolMaterials.DIAMOND, -3, 0.0f, new FabricItemSettings().rarity(Rarity.RARE), 5));
    public static final Item HOE_OF_GREATEST_TILLING = registerItem("hoe_of_greatest_tilling", new GreatestTillingHoeItem(new FabricItemSettings()));
    public static final Item FOUL_FLESH = registerItem("foul_flesh", new Item(new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item TRUE_ESSENCE = registerItem("true_essence", new EnchantedItem(new FabricItemSettings()));
    public static final Item REFINED_MINERAL = registerItem("refined_mineral", new Item(new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item ZOMBIE_PICKAXE = registerItem("zombie_pickaxe", new ZombiePickaxeItem(new FabricItemSettings()));
    public static final Item JUNGLE_PICKAXE = registerItem("jungle_pickaxe", new JunglePickaxeItem(new FabricItemSettings()));
    public static final Item FRACTURED_MITHRIL_PICKAXE = registerItem("fractured_mithril_pickaxe", new MithrilPickaxeItem(6.0f, 7.0f, new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item BANDAGED_MITHRIL_PICKAXE = registerItem("bandaged_mithril_pickaxe", new MithrilPickaxeItem(6.0f, 8.0f, new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item MITHRIL_PICKAXE = registerItem("mithril_pickaxe", new MithrilPickaxeItem(8.0f, 9.0f, new FabricItemSettings().rarity(Rarity.UNCOMMON), 5, 20));
    public static final Item REFINED_MITHRIL_PICKAXE = registerItem("refined_mithril_pickaxe", new MithrilPickaxeItem(10.0f, 10.0f, new FabricItemSettings().rarity(Rarity.RARE), 10, 50));

    private static ModItem registerItem(String name, ModItem item) {
        return Registry.register(Registries.ITEM, new Identifier(Skyblock.MOD_ID, name), item);
    }
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Skyblock.MOD_ID, name), item);
    }
    public static void registerModItems() {
        Skyblock.LOGGER.info("Registering Mod Items for " + Skyblock.MOD_ID);

        EnchantedItems.registerEnchantedItems();
    }
}
