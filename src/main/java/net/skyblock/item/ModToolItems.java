package net.skyblock.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterials;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.skyblock.Skyblock;
import net.skyblock.item.custom.*;
import net.skyblock.util.ModRarity;

public class ModToolItems {
    public static final Item STONK = registerItem("stonk", new StonkItem(ToolMaterials.GOLD, BlockTags.PICKAXE_MINEABLE, new FabricItemSettings()).setModRarity(ModRarity.EPIC));
    public static final Item PROMISING_PICKAXE = registerItem("promising_pickaxe", new PromisingMiningToolItem(ToolMaterials.IRON, BlockTags.PICKAXE_MINEABLE, new FabricItemSettings()).setModRarity(ModRarity.UNCOMMON));
    public static final Item PROMISING_AXE = registerItem("promising_axe", new PromisingMiningToolItem(ToolMaterials.IRON, BlockTags.AXE_MINEABLE, new FabricItemSettings()).setModRarity(ModRarity.UNCOMMON));
    public static final Item PROMISING_SHOVEL = registerItem("promising_shovel", new PromisingShovelItem(ToolMaterials.IRON, new FabricItemSettings()).setModRarity(ModRarity.UNCOMMON));
    public static final Item ZOMBIE_PICKAXE = registerItem("zombie_pickaxe", new ZombiePickaxeItem(new FabricItemSettings()));
    public static final Item JUNGLE_PICKAXE = registerItem("jungle_pickaxe", new JunglePickaxeItem(new FabricItemSettings()));
    public static final Item ROOKIE_PICKAXE = registerItem("rookie_pickaxe", new ModMiningToolItem(ToolMaterials.STONE, BlockTags.PICKAXE_MINEABLE, new FabricItemSettings().rarity(Rarity.COMMON)));
    public static final Item FRACTURED_MITHRIL_PICKAXE = registerItem("fractured_mithril_pickaxe", new ModMiningToolItem(ModToolMaterial.FRACTURED_MITHRIL, BlockTags.PICKAXE_MINEABLE, new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item BANDAGED_MITHRIL_PICKAXE = registerItem("bandaged_mithril_pickaxe", new ModMiningToolItem(ModToolMaterial.BANDAGED_MITHRIL, BlockTags.PICKAXE_MINEABLE, new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item MITHRIL_PICKAXE = registerItem("mithril_pickaxe", new MithrilPickaxeItem(ModToolMaterial.MITHRIL, new FabricItemSettings(), ModRarity.UNCOMMON, 5, 20));
    public static final Item REFINED_MITHRIL_PICKAXE = registerItem("refined_mithril_pickaxe", new MithrilPickaxeItem(ModToolMaterial.REFINED_MITHRIL, new FabricItemSettings(), ModRarity.RARE, 10, 50));
    public static final Item TITANIUM_PICKAXE = registerItem("titanium_pickaxe", new TitaniumPickaxeItem(ModToolMaterial.TITANIUM, new FabricItemSettings(), 10).setModRarity(ModRarity.RARE));
    public static final Item REFINED_TITANIUM_PICKAXE = registerItem("refined_titanium_pickaxe", new TitaniumPickaxeItem(ModToolMaterial.REFINED_TITANIUM, new FabricItemSettings(), 15).setModRarity(ModRarity.RARE));
    public static final Item PICKONIMBUS_2000 = registerItem("pickonimbus_2000", new PickonimbusPickaxe(5000).setModRarity(ModRarity.EPIC).setLoreKey("pickonimbus_2000"));
    public static final Item BINGONIMBUS_2000 = registerItem("bingonimbus_2000", new PickonimbusPickaxe().setModRarity(ModRarity.EPIC).setLoreKey("bingonimbus_2000"));
    public static final Item ROOKIE_HOE = registerItem("rookie_hoe", new HoeItem(ToolMaterials.STONE, -1, -2.0f, new FabricItemSettings()));
    public static final Item HOE_OF_GREAT_TILLING = registerItem("hoe_of_great_tilling", new TillingHoeItem(ToolMaterials.STONE, -1, 0.0f, new FabricItemSettings(),  3).setModRarity(ModRarity.UNCOMMON));
    public static final Item HOE_OF_GREATER_TILLING = registerItem("hoe_of_greater_tilling", new TillingHoeItem(ToolMaterials.DIAMOND, -3, 0.0f, new FabricItemSettings(), 5).setModRarity(ModRarity.RARE));
    public static final Item HOE_OF_GREATEST_TILLING = registerItem("hoe_of_greatest_tilling", new GreatestTillingHoeItem(new FabricItemSettings()));
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Skyblock.MOD_ID, name), item);
    }
    public static void registerModToolItems() {
        Skyblock.LOGGER.info("Registering Mod Tool Items for " + Skyblock.MOD_ID);
    }
}
