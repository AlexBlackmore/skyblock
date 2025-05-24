package net.skyblock.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.Blocks;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.AttributeModifierSlot;
import net.minecraft.component.type.AttributeModifiersComponent;
import net.minecraft.component.type.LoreComponent;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.item.*;
import net.minecraft.registry.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.skyblock.Skyblock;
import net.skyblock.ability.*;
import net.skyblock.attribute.ModEntityAttributes;
import net.skyblock.component.ModDataComponentTypes;
import net.skyblock.util.ExpandedRarity;
import net.skyblock.util.ModTags;

public class ModTools {
    private static final float DEFAULT_WOODEN_MINING_SPEED = 70.0f;
    private static final float DEFAULT_GOLDEN_MINING_SPEED = 250.0f;
    private static final float DEFAULT_STONE_MINING_SPEED = 110.0f;
    private static final float DEFAULT_IRON_MINING_SPEED = 160.0f;
    private static final float DEFAULT_DIAMOND_MINING_SPEED = 220.0f;
    private static final float DEFAULT_PICKAXE_ATTACK_SPEED  = -2.8f;
    private static final float DEFAULT_SHOVEL_ATTACK_SPEED  = -3.0f;
    private static final float DEFAULT_SWORD_ATTACK_SPEED  = -2.4f;
    private static final float DEFAULT_IRON_AXE_ATTACK_SPEED  = -3.1f;
    private static final float DEFAULT_STONE_AXE_ATTACK_SPEED = -3.2f;

    //PICKAXES
    public static final Item LAPIS_PICKAXE = ModItems.registerItem("lapis_pickaxe",
            new ModItem(getItemSettings("lapis_pickaxe", 3).pickaxe(ModToolMaterials.LAPIS, 4.0f, DEFAULT_PICKAXE_ATTACK_SPEED)));

    public static final Item ROOKIE_PICKAXE = ModItems.registerItem("rookie_pickaxe",
            new ModItem(getPickaxeItemSettings("rookie_pickaxe", 0, ModToolMaterials.ROOKIE)
                    .component(DataComponentTypes.ATTRIBUTE_MODIFIERS, AttributeModifiersComponent.builder()
                            .add(ModEntityAttributes.ORE_FORTUNE, new EntityAttributeModifier(Identifier.of(Skyblock.MOD_ID, "rookie_pickaxe_ore_fortune"),
                                    0.05, EntityAttributeModifier.Operation.ADD_MULTIPLIED_BASE), AttributeModifierSlot.MAINHAND)
                            .add(EntityAttributes.ATTACK_DAMAGE, new EntityAttributeModifier(Identifier.of(Skyblock.MOD_ID, "rookie_pickaxe_attack_damage"),
                                    3.0, EntityAttributeModifier.Operation.ADD_VALUE), AttributeModifierSlot.MAINHAND)
                            .add(EntityAttributes.ATTACK_SPEED, new EntityAttributeModifier(Identifier.of(Skyblock.MOD_ID, "rookie_pickaxe_attack_speed"),
                                    DEFAULT_PICKAXE_ATTACK_SPEED, EntityAttributeModifier.Operation.ADD_VALUE), AttributeModifierSlot.MAINHAND).build())));

    public static final Item ZOMBIE_PICKAXE_LEGACY = ModItems.registerItem("zombie_pickaxe_legacy",
            new ModItem(getItemSettings("zombie_pickaxe_legacy", 0).pickaxe(ModToolMaterials.ZOMBIE, 5, DEFAULT_PICKAXE_ATTACK_SPEED),
                    ExpandedRarity.ModRarity.COMMON, new Ability[]{new ZombieAbility()}));

    public static final Item JUNGLE_PICKAXE = ModItems.registerItem("jungle_pickaxe",
            new ModItem(getItemSettings("jungle_pickaxe", 0)
                    .pickaxe(ModToolMaterials.JUNGLE_PICKAXE, 10, DEFAULT_PICKAXE_ATTACK_SPEED)
                    .rarity(Rarity.UNCOMMON)));

    public static final Item PROMISING_PICKAXE_LEGACY = ModItems.registerItem("promising_pickaxe_legacy",
            new ModItem(getPickaxeItemSettings("promising_pickaxe_legacy", 0, ModToolMaterials.PROMISING)
                    .component(ModDataComponentTypes.BLOCKS_BROKEN, 0)
                    .component(DataComponentTypes.ATTRIBUTE_MODIFIERS, AttributeModifiersComponent.builder()
                            .add(EntityAttributes.ATTACK_DAMAGE, new EntityAttributeModifier(Identifier.of(Skyblock.MOD_ID, "rookie_pickaxe_attack_damage"),
                                    4.0, EntityAttributeModifier.Operation.ADD_VALUE), AttributeModifierSlot.MAINHAND)
                            .add(EntityAttributes.ATTACK_SPEED, new EntityAttributeModifier(Identifier.of(Skyblock.MOD_ID, "rookie_pickaxe_attack_speed"),
                                    DEFAULT_PICKAXE_ATTACK_SPEED, EntityAttributeModifier.Operation.ADD_VALUE), AttributeModifierSlot.MAINHAND).build()),
                    ExpandedRarity.ModRarity.UNCOMMON, new Ability[]{new PromisingAbility()}));

    public static final Item PROMISING_PICKAXE = ModItems.registerItem("promising_pickaxe",
            new ModItem(getPickaxeItemSettings("promising_pickaxe", 0, ModToolMaterials.PROMISING)
                    .component(ModDataComponentTypes.BLOCKS_BROKEN, 0)
                    .component(DataComponentTypes.ATTRIBUTE_MODIFIERS, AttributeModifiersComponent.builder()
                            .add(EntityAttributes.BLOCK_BREAK_SPEED, new EntityAttributeModifier(Identifier.of(Skyblock.MOD_ID, "stored_potential"),
                                    0.0, EntityAttributeModifier.Operation.ADD_MULTIPLIED_BASE), AttributeModifierSlot.MAINHAND)
                            .add(EntityAttributes.ATTACK_DAMAGE, new EntityAttributeModifier(Identifier.of(Skyblock.MOD_ID, "promising_pickaxe_attack_damage"),
                                    4.0, EntityAttributeModifier.Operation.ADD_VALUE), AttributeModifierSlot.MAINHAND)
                            .add(EntityAttributes.ATTACK_SPEED, new EntityAttributeModifier(Identifier.of(Skyblock.MOD_ID, "promising_pickaxe_attack_speed"),
                                    DEFAULT_PICKAXE_ATTACK_SPEED, EntityAttributeModifier.Operation.ADD_VALUE), AttributeModifierSlot.MAINHAND).build()),
                    ExpandedRarity.ModRarity.UNCOMMON, new Ability[]{new StoredPotentialAbility()}));

    public static final Item STONK = ModItems.registerItem("stonk",
            new ModItem(getPickaxeItemSettings("stonk", 0, ModToolMaterials.getToolMaterial(ToolMaterial.GOLD, Rarity.EPIC)),
                    ExpandedRarity.ModRarity.EPIC, new Ability[]{new StonkAbility()}));

    public static final Item FRACTURED_MITHRIL_PICKAXE = ModItems.registerItem("fractured_mithril_pickaxe",
            new ModItem(getPickaxeItemSettings("fractured_mithril_pickaxe", 0,
                    ModToolMaterials.getToolMaterial(ToolMaterial.STONE, 5, 2, 225.0f/DEFAULT_STONE_MINING_SPEED, ModTags.Items.MITHRIL_TOOL_MATERIALS))
                    .component(DataComponentTypes.ATTRIBUTE_MODIFIERS, AttributeModifiersComponent.builder()
                            .add(ModEntityAttributes.MINING_FORTUNE, new EntityAttributeModifier(Identifier.of(Skyblock.MOD_ID, "fractured_mithril_pickaxe_mining_fortune"),
                                    0.02, EntityAttributeModifier.Operation.ADD_MULTIPLIED_BASE), AttributeModifierSlot.MAINHAND)
                            .add(EntityAttributes.ATTACK_DAMAGE, new EntityAttributeModifier(Identifier.of(Skyblock.MOD_ID, "fractured_mithril_pickaxe_attack_damage"),
                                    6.0, EntityAttributeModifier.Operation.ADD_VALUE), AttributeModifierSlot.MAINHAND)
                            .add(EntityAttributes.ATTACK_SPEED, new EntityAttributeModifier(Identifier.of(Skyblock.MOD_ID, "fractured_mithril_pickaxe_attack_speed"),
                                    DEFAULT_PICKAXE_ATTACK_SPEED, EntityAttributeModifier.Operation.ADD_VALUE), AttributeModifierSlot.MAINHAND).build())
                    .rarity(Rarity.UNCOMMON)));

    public static final Item BANDAGED_MITHRIL_PICKAXE = ModItems.registerItem("bandaged_mithril_pickaxe",
            new ModItem(getPickaxeItemSettings("bandaged_mithril_pickaxe", 0,
                    ModToolMaterials.getToolMaterial(ToolMaterial.STONE, 5, 2, 250.0f/DEFAULT_STONE_MINING_SPEED, ModTags.Items.MITHRIL_TOOL_MATERIALS))
                    .component(DataComponentTypes.ATTRIBUTE_MODIFIERS, AttributeModifiersComponent.builder()
                            .add(ModEntityAttributes.MINING_FORTUNE, new EntityAttributeModifier(Identifier.of(Skyblock.MOD_ID, "bandaged_mithril_pickaxe_mining_fortune"),
                                    0.04, EntityAttributeModifier.Operation.ADD_MULTIPLIED_BASE), AttributeModifierSlot.MAINHAND)
                            .add(EntityAttributes.ATTACK_DAMAGE, new EntityAttributeModifier(Identifier.of(Skyblock.MOD_ID, "bandaged_mithril_pickaxe_attack_damage"),
                                    6.0, EntityAttributeModifier.Operation.ADD_VALUE), AttributeModifierSlot.MAINHAND)
                            .add(EntityAttributes.ATTACK_SPEED, new EntityAttributeModifier(Identifier.of(Skyblock.MOD_ID, "bandaged_mithril_pickaxe_attack_speed"),
                                    DEFAULT_PICKAXE_ATTACK_SPEED, EntityAttributeModifier.Operation.ADD_VALUE), AttributeModifierSlot.MAINHAND).build())
                    .rarity(Rarity.UNCOMMON)));

    public static final Item MITHRIL_PICKAXE = ModItems.registerItem("mithril_pickaxe",
            new ModItem(getPickaxeItemSettings("mithril_pickaxe", 0,
                    ModToolMaterials.getToolMaterial(ToolMaterial.DIAMOND, 5, 2, 300.0f/DEFAULT_DIAMOND_MINING_SPEED, ModTags.Items.MITHRIL_TOOL_MATERIALS))
                    .component(DataComponentTypes.ATTRIBUTE_MODIFIERS, AttributeModifiersComponent.builder()
                            .add(ModEntityAttributes.MINING_FORTUNE, new EntityAttributeModifier(Identifier.of(Skyblock.MOD_ID, "mithril_pickaxe"),
                                    0.07, EntityAttributeModifier.Operation.ADD_MULTIPLIED_BASE), AttributeModifierSlot.MAINHAND)
                            .add(EntityAttributes.ATTACK_DAMAGE, new EntityAttributeModifier(Identifier.of(Skyblock.MOD_ID, "mithril_pickaxe"),
                                    8.0, EntityAttributeModifier.Operation.ADD_VALUE), AttributeModifierSlot.MAINHAND)
                            .add(EntityAttributes.ATTACK_SPEED, new EntityAttributeModifier(Identifier.of(Skyblock.MOD_ID, "mithril_pickaxe"),
                                    DEFAULT_PICKAXE_ATTACK_SPEED, EntityAttributeModifier.Operation.ADD_VALUE), AttributeModifierSlot.MAINHAND).build())
                    .rarity(Rarity.UNCOMMON)));

    public static final Item REFINED_MITHRIL_PICKAXE = ModItems.registerItem("refined_mithril_pickaxe",
            new ModItem(getPickaxeItemSettings("refined_mithril_pickaxe", 0,
                    ModToolMaterials.getToolMaterial(ToolMaterial.STONE, 5, 3, 350.0f/DEFAULT_STONE_MINING_SPEED, ModTags.Items.MITHRIL_TOOL_MATERIALS))
                    .component(DataComponentTypes.ATTRIBUTE_MODIFIERS, AttributeModifiersComponent.builder()
                            .add(ModEntityAttributes.MINING_FORTUNE, new EntityAttributeModifier(Identifier.of(Skyblock.MOD_ID, "refined_mithril_pickaxe"),
                                    0.1, EntityAttributeModifier.Operation.ADD_MULTIPLIED_BASE), AttributeModifierSlot.MAINHAND)
                            .add(EntityAttributes.ATTACK_DAMAGE, new EntityAttributeModifier(Identifier.of(Skyblock.MOD_ID, "refined_mithril_pickaxe"),
                                    10.0, EntityAttributeModifier.Operation.ADD_VALUE), AttributeModifierSlot.MAINHAND)
                            .add(EntityAttributes.ATTACK_SPEED, new EntityAttributeModifier(Identifier.of(Skyblock.MOD_ID, "refined_mithril_pickaxe"),
                                    DEFAULT_PICKAXE_ATTACK_SPEED, EntityAttributeModifier.Operation.ADD_VALUE), AttributeModifierSlot.MAINHAND).build())
                    .rarity(Rarity.RARE)));


    //SHOVELS
    public static final Item PROMISING_SHOVEL = ModItems.registerItem("promising_shovel",
            new ModItem(getShovelItemSettings("promising_shovel", 0, ModToolMaterials.PROMISING)
                .component(ModDataComponentTypes.BLOCKS_BROKEN, 0),
                ExpandedRarity.ModRarity.UNCOMMON, new Ability[]{new PromisingAbility(new int[]{10, 25, 100, 250, 500, 1000, 2000, 5000, 10000, 20000}), new ShovelAbility()}));

    public static final Item FLINT_SHOVEL = ModItems.registerItem("flint_shovel",
            new ModItem(getShovelItemSettings("flint_shovel", 3, ModToolMaterials.FLINT),
                ExpandedRarity.ModRarity.COMMON, new Ability[]{new ShovelAbility()}));

    public static final Item SNOW_SHOVEL = ModItems.registerItem("snow_shovel",
            new ModItem(getShovelItemSettings("snow_shovel", 0, ModToolMaterials.getToolMaterial(ToolMaterial.DIAMOND, Rarity.RARE)),
                ExpandedRarity.ModRarity.RARE, new Ability[]{new SnowPlacerAbility(10)}));


    //AXES
    public static final Item ROOKIE_AXE = ModItems.registerItem("rookie_axe",
            new ModItem(getItemSettings("rookie_axe", 0)
                .axe(ModToolMaterials.ROOKIE, 4.0f, DEFAULT_STONE_AXE_ATTACK_SPEED),
                ExpandedRarity.ModRarity.COMMON, new Ability[]{new AxeAbility()}));

    public static final Item JUNGLE_AXE = ModItems.registerItem("jungle_axe",
            new ModItem(getAxeItemSettings("jungle_axe", 4, ModToolMaterials.JUNGLE_AXE),
                    ExpandedRarity.ModRarity.UNCOMMON, new Ability[]{new TimberAbility(10), new AxeAbility()}));

    public static final Item TREECAPITATOR = ModItems.registerItem("treecapitator",
            new ModItem(getAxeItemSettings("treecapitator", 4, ModToolMaterials.TREECAPITATOR),
                    ExpandedRarity.ModRarity.EPIC, new Ability[]{new TimberAbility(35), new AxeAbility()}));

    public static final Item PROMISING_AXE = ModItems.registerItem("promising_axe",
            new ModItem(getItemSettings("promising_axe", 0)
                    .component(ModDataComponentTypes.BLOCKS_BROKEN, 0)
                    .axe(ModToolMaterials.PROMISING, 5.0f, DEFAULT_IRON_AXE_ATTACK_SPEED),
                    ExpandedRarity.ModRarity.UNCOMMON, new Ability[]{new PromisingAbility(), new AxeAbility()}));

    public static final Item BASIC_GARDENING_AXE = ModItems.registerItem("basic_gardening_axe",
            new ModItem(getAxeItemSettings("basic_gardening_axe", 0, ModToolMaterials.getToolMaterial(ToolMaterial.IRON, Rarity.UNCOMMON))
                    .rarity(Rarity.UNCOMMON)
                    .component(DataComponentTypes.ATTRIBUTE_MODIFIERS, AttributeModifiersComponent.builder().add(ModEntityAttributes.FARMING_FORTUNE,
                            new EntityAttributeModifier(Identifier.of(Skyblock.MOD_ID, "basic_gardening_axe_farming_fortune"),
                                    0.05, EntityAttributeModifier.Operation.ADD_MULTIPLIED_BASE), AttributeModifierSlot.MAINHAND).build())));

    public static final Item ADVANCED_GARDENING_AXE = ModItems.registerItem("advanced_gardening_axe",
            new ModItem(getAxeItemSettings("advanced_gardening_axe", 0, ModToolMaterials.getToolMaterial(ToolMaterial.DIAMOND, Rarity.RARE))
                    .rarity(Rarity.RARE)
                    .component(DataComponentTypes.ATTRIBUTE_MODIFIERS, AttributeModifiersComponent.builder().add(ModEntityAttributes.FARMING_FORTUNE,
                            new EntityAttributeModifier(Identifier.of(Skyblock.MOD_ID, "advanced_gardening_axe_farming_fortune"),
                                    0.1, EntityAttributeModifier.Operation.ADD_MULTIPLIED_BASE), AttributeModifierSlot.MAINHAND).build())));

    public static final Item COCOA_CHOPPER = ModItems.registerItem("cocoa_chopper",
            new ModItem(getAxeItemSettings("cocoa_chopper", 3, ModToolMaterials.getToolMaterial(ToolMaterial.GOLD, Rarity.EPIC))
                    .rarity(Rarity.EPIC)
                    .component(DataComponentTypes.ATTRIBUTE_MODIFIERS, AttributeModifiersComponent.builder().add(ModEntityAttributes.COCOA_BEANS_FORTUNE,
                            new EntityAttributeModifier(Identifier.of(Skyblock.MOD_ID, "cocoa_chopper_cocoa_beans_fortune"),
                                    0.2, EntityAttributeModifier.Operation.ADD_MULTIPLIED_BASE), AttributeModifierSlot.MAINHAND).build())));

    public static final Item MELON_DICER = ModItems.registerItem("melon_dicer",
            new ModItem(getAxeItemSettings("melon_dicer", 2, ModToolMaterials.MELON_DICER),
                    ExpandedRarity.ModRarity.EPIC, new Ability[]{new RollEmAbility(Blocks.MELON, "melon")}));

    public static final Item PUMPKIN_DICER = ModItems.registerItem("pumpkin_dicer",
            new ModItem(getAxeItemSettings("pumpkin_dicer", 2, ModToolMaterials.PUMPKIN_DICER),
                    ExpandedRarity.ModRarity.EPIC, new Ability[]{new RollEmAbility(Blocks.PUMPKIN, "pumpkin")}));

    public static final Item EFFICIENT_AXE = ModItems.registerItem("efficient_axe",
            new ModItem(getItemSettings("efficient_axe", 2)
                    .axe(ModToolMaterials.getToolMaterial(ToolMaterial.IRON, Rarity.UNCOMMON), 5.0f, DEFAULT_IRON_AXE_ATTACK_SPEED),
                    ExpandedRarity.ModRarity.UNCOMMON, new Ability[]{new AxeAbility()}));

    public static final Item SWEET_AXE = ModItems.registerItem("sweet_axe",
            new ModItem(getItemSettings("sweet_axe", 2)
                    .axe(ModToolMaterials.getToolMaterial(ToolMaterial.IRON, Rarity.UNCOMMON), 5.0f, DEFAULT_IRON_AXE_ATTACK_SPEED),
                    ExpandedRarity.ModRarity.UNCOMMON, new Ability[]{new AxeAbility()}));


    //HOES
    public static final Item BASIC_GARDENING_HOE = ModItems.registerItem("basic_gardening_hoe",
            new ModItem(getHoeItemSettings("basic_gardening_hoe", 0, ModToolMaterials.getToolMaterial(ToolMaterial.IRON, Rarity.UNCOMMON))
                    .component(DataComponentTypes.ATTRIBUTE_MODIFIERS, AttributeModifiersComponent.builder()
                            .add(ModEntityAttributes.FARMING_FORTUNE, new EntityAttributeModifier(Identifier.of(Skyblock.MOD_ID, "basic_gardening_hoe_farming_fortune"),
                                    0.05, EntityAttributeModifier.Operation.ADD_MULTIPLIED_BASE), AttributeModifierSlot.MAINHAND).build()),
                    ExpandedRarity.ModRarity.UNCOMMON, new Ability[]{new HoeAbility()}));

    public static final Item ADVANCED_GARDENING_HOE = ModItems.registerItem("advanced_gardening_hoe",
            new ModItem(getHoeItemSettings("advanced_gardening_hoe", 0, ModToolMaterials.getToolMaterial(ToolMaterial.DIAMOND, Rarity.RARE))
                    .component(DataComponentTypes.ATTRIBUTE_MODIFIERS, AttributeModifiersComponent.builder()
                        .add(ModEntityAttributes.FARMING_FORTUNE, new EntityAttributeModifier(Identifier.of(Skyblock.MOD_ID, "advanced_gardening_hoe_farming_fortune"),
                                0.1, EntityAttributeModifier.Operation.ADD_MULTIPLIED_BASE), AttributeModifierSlot.MAINHAND).build()),
                    ExpandedRarity.ModRarity.RARE, new Ability[]{new HoeAbility()}));


    //SWORDS
    public static final Item CHICKEN_AXE = ModItems.registerItem("chicken_axe",
            new ModItem(getSwordItemSettings("chicken_axe", 0, ModToolMaterials.getToolMaterial(ToolMaterial.WOOD, Rarity.UNCOMMON)),
                    ExpandedRarity.ModRarity.UNCOMMON, new Ability[]{new AnimalAxeAbility("chicken")}));

    public static final Item COW_AXE = ModItems.registerItem("cow_axe",
            new ModItem(getSwordItemSettings("cow_axe", 0, ModToolMaterials.getToolMaterial(ToolMaterial.WOOD, Rarity.UNCOMMON)),
                    ExpandedRarity.ModRarity.UNCOMMON, new Ability[]{new AnimalAxeAbility("cow")}));

    public static final Item MOOSHROOM_AXE = ModItems.registerItem("mooshroom_axe",
            new ModItem(getSwordItemSettings("mooshroom_axe", 0, ModToolMaterials.getToolMaterial(ToolMaterial.WOOD, Rarity.UNCOMMON)),
                    ExpandedRarity.ModRarity.UNCOMMON, new Ability[]{new AnimalAxeAbility("mooshroom")}));

    public static final Item PIG_AXE = ModItems.registerItem("pig_axe",
            new ModItem(getSwordItemSettings("pig_axe", 0, ModToolMaterials.getToolMaterial(ToolMaterial.WOOD, Rarity.UNCOMMON)),
                    ExpandedRarity.ModRarity.UNCOMMON, new Ability[]{new AnimalAxeAbility("pig")}));

    public static final Item RABBIT_AXE = ModItems.registerItem("rabbit_axe",
            new ModItem(getSwordItemSettings("rabbit_axe", 0, ModToolMaterials.getToolMaterial(ToolMaterial.WOOD, Rarity.UNCOMMON)),
                    ExpandedRarity.ModRarity.UNCOMMON, new Ability[]{new AnimalAxeAbility("rabbit")}));

    public static final Item SHEEP_AXE = ModItems.registerItem("sheep_axe",
            new ModItem(getSwordItemSettings("sheep_axe", 0, ModToolMaterials.getToolMaterial(ToolMaterial.WOOD, Rarity.UNCOMMON)),
                    ExpandedRarity.ModRarity.UNCOMMON, new Ability[]{new AnimalAxeAbility("sheep")}));


    private static Item.Settings getPickaxeItemSettings(String name, int loreLines, ToolMaterial material) {
        return getItemSettings(name, loreLines).pickaxe(material, 0.0f, 0.0f);
    }
    private static Item.Settings getShovelItemSettings(String name, int loreLines, ToolMaterial material) {
        return getItemSettings(name, loreLines).shovel(material, 0.0f, 0.0f);
    }
    private static Item.Settings getAxeItemSettings(String name, int loreLines, ToolMaterial material) {
        return getItemSettings(name, loreLines).axe(material, 0.0f, 0.0f);
    }
    private static Item.Settings getSwordItemSettings(String name, int loreLines, ToolMaterial material) {
        return getItemSettings(name, loreLines).sword(material, 0.0f, 0.0f);
    }
    private static Item.Settings getHoeItemSettings(String name, int loreLines, ToolMaterial material) {
        return getItemSettings(name, loreLines).hoe(material, 0.0f, 0.0f);
    }
    private static Item.Settings getItemSettings(String name, int loreLines) {
        Item.Settings settings = new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Skyblock.MOD_ID,name)));

        if (loreLines >= 1) {
            settings = settings.component(DataComponentTypes.LORE, new LoreComponent(ModItems.getLoreList(name,loreLines)));
        }
        return settings;
    }

    public static void registerModTools() {
        Skyblock.LOGGER.info("Registering ModTools for " + Skyblock.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> {
            entries.add(ModTools.ADVANCED_GARDENING_AXE);
            entries.add(ModTools.ADVANCED_GARDENING_HOE);
            entries.add(ModTools.BANDAGED_MITHRIL_PICKAXE);
            entries.add(ModTools.BASIC_GARDENING_AXE);
            entries.add(ModTools.BASIC_GARDENING_HOE);
            entries.add(ModTools.COCOA_CHOPPER);
            entries.add(ModTools.EFFICIENT_AXE);
            entries.add(ModTools.FLINT_SHOVEL);
            entries.add(ModTools.FRACTURED_MITHRIL_PICKAXE);
            entries.add(ModTools.JUNGLE_AXE);
            entries.add(ModTools.JUNGLE_PICKAXE);
            entries.add(ModTools.LAPIS_PICKAXE);
            entries.add(ModTools.MELON_DICER);
            entries.add(ModTools.MITHRIL_PICKAXE);
            entries.add(ModTools.PROMISING_AXE);
            entries.add(ModTools.PROMISING_PICKAXE);
            entries.add(ModTools.PROMISING_PICKAXE_LEGACY);
            entries.add(ModTools.PROMISING_SHOVEL);
            entries.add(ModTools.PUMPKIN_DICER);
            entries.add(ModTools.REFINED_MITHRIL_PICKAXE);
            entries.add(ModTools.ROOKIE_AXE);
            entries.add(ModTools.ROOKIE_PICKAXE);
            entries.add(ModTools.SNOW_SHOVEL);
            entries.add(ModTools.STONK);
            entries.add(ModTools.SWEET_AXE);
            entries.add(ModTools.TREECAPITATOR);
            entries.add(ModTools.ZOMBIE_PICKAXE_LEGACY);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> {
            entries.add(ModTools.CHICKEN_AXE);
            entries.add(ModTools.COW_AXE);
            entries.add(ModTools.MOOSHROOM_AXE);
            entries.add(ModTools.PIG_AXE);
            entries.add(ModTools.RABBIT_AXE);
            entries.add(ModTools.SHEEP_AXE);
        });
    }
}
