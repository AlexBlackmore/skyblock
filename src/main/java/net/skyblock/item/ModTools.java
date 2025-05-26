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
import net.minecraft.util.Unit;
import net.skyblock.Skyblock;
import net.skyblock.ability.*;
import net.skyblock.attribute.ModEntityAttributes;
import net.skyblock.component.ModDataComponentTypes;
import net.skyblock.util.ExpandedRarity;
import net.skyblock.util.ModTags;


public class ModTools {
    private static final float DEFAULT_PICKAXE_ATTACK_SPEED  = -2.8f;
    private static final float DEFAULT_SHOVEL_ATTACK_SPEED  = -3.0f;
    private static final float DEFAULT_SWORD_ATTACK_SPEED  = -2.4f;
    private static final float DEFAULT_IRON_AXE_ATTACK_SPEED  = -3.1f;
    private static final float DEFAULT_STONE_AXE_ATTACK_SPEED = -3.2f;

    //PICKAXES
    public static final Item LAPIS_PICKAXE = ModItems.registerItem("lapis_pickaxe",
            new ModItem(getItemSettings("lapis_pickaxe", 3)
                    .pickaxe(ModToolMaterials.getToolMaterial(ToolMaterial.DIAMOND, 4, 2, 200f, ModTags.Items.LAPIS_TOOL_MATERIALS), 4.0f, DEFAULT_PICKAXE_ATTACK_SPEED)));

    public static final Item ZOMBIE_PICKAXE_LEGACY = ModItems.registerItem("zombie_pickaxe_legacy",
            new ModItem(getItemSettings("zombie_pickaxe_legacy", 0)
                    .pickaxe(ModToolMaterials.ZOMBIE, 5, DEFAULT_PICKAXE_ATTACK_SPEED),
                    ExpandedRarity.ModRarity.COMMON, new Ability[]{new ZombieAbility()}));

    //TODO: create Rotten Ability (need effect I think)
    public static final Item ZOMBIE_PICKAXE = ModItems.registerItem("zombie_pickaxe",
            new ModItem(getPickaxeItemSettings("zombie_pickaxe", ModToolMaterials.ZOMBIE),
                    ExpandedRarity.ModRarity.COMMON, new Ability[]{new RottenAbility()}));

    public static final Item ROOKIE_PICKAXE = ModItems.registerItem("rookie_pickaxe",
            new ModItem(getPickaxeItemSettings("rookie_pickaxe", ModToolMaterials.ROOKIE)
                    .component(DataComponentTypes.ATTRIBUTE_MODIFIERS, AttributeModifiersComponent.builder()
                            .add(ModEntityAttributes.ORE_FORTUNE, new EntityAttributeModifier(Identifier.of(Skyblock.MOD_ID, "rookie_pickaxe_ore_fortune"),
                                    0.05, EntityAttributeModifier.Operation.ADD_MULTIPLIED_BASE), AttributeModifierSlot.MAINHAND)
                            .add(EntityAttributes.ATTACK_DAMAGE, new EntityAttributeModifier(Identifier.of(Skyblock.MOD_ID, "rookie_pickaxe_attack_damage"),
                                    3.0, EntityAttributeModifier.Operation.ADD_VALUE), AttributeModifierSlot.MAINHAND)
                            .add(EntityAttributes.ATTACK_SPEED, new EntityAttributeModifier(Identifier.of(Skyblock.MOD_ID, "rookie_pickaxe_attack_speed"),
                                    DEFAULT_PICKAXE_ATTACK_SPEED, EntityAttributeModifier.Operation.ADD_VALUE), AttributeModifierSlot.MAINHAND).build())));

    public static final Item PROMISING_PICKAXE_LEGACY = ModItems.registerItem("promising_pickaxe_legacy",
            new ModItem(getPickaxeItemSettings("promising_pickaxe_legacy", ModToolMaterials.PROMISING)
                    .component(ModDataComponentTypes.BLOCKS_BROKEN, 0)
                    .component(DataComponentTypes.ATTRIBUTE_MODIFIERS, AttributeModifiersComponent.builder()
                            .add(EntityAttributes.ATTACK_DAMAGE, new EntityAttributeModifier(Identifier.of(Skyblock.MOD_ID, "promising_pickaxe_legacy_attack_damage"),
                                    4.0, EntityAttributeModifier.Operation.ADD_VALUE), AttributeModifierSlot.MAINHAND)
                            .add(EntityAttributes.ATTACK_SPEED, new EntityAttributeModifier(Identifier.of(Skyblock.MOD_ID, "promising_pickaxe_legacy_attack_speed"),
                                    DEFAULT_PICKAXE_ATTACK_SPEED, EntityAttributeModifier.Operation.ADD_VALUE), AttributeModifierSlot.MAINHAND).build()),
                    ExpandedRarity.ModRarity.UNCOMMON, new Ability[]{new PromisingAbility()}));

    public static final Item PROMISING_PICKAXE = ModItems.registerItem("promising_pickaxe",
            new ModItem(getPickaxeItemSettings("promising_pickaxe", ModToolMaterials.PROMISING)
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
            new ModItem(getPickaxeItemSettings("stonk", ModToolMaterials.getToolMaterial(ToolMaterial.GOLD, 4, 380f, ModTags.Items.EMPTY)),
                    ExpandedRarity.ModRarity.EPIC, new Ability[]{new StonkAbility()}));

    public static final Item JUNGLE_PICKAXE = ModItems.registerItem("jungle_pickaxe",
            new ModItem(getItemSettings("jungle_pickaxe", 0)
                    .pickaxe(ModToolMaterials.getToolMaterial(ToolMaterial.WOOD, 5, 2, 330f, ModTags.Items.JUNGLE_PICKAXE_MATERIALS), 10, DEFAULT_PICKAXE_ATTACK_SPEED)
                    .rarity(Rarity.UNCOMMON)));

    public static final Item FRACTURED_MITHRIL_PICKAXE = ModItems.registerItem("fractured_mithril_pickaxe",
            new ModItem(getPickaxeItemSettings("fractured_mithril_pickaxe",
                    ModToolMaterials.getToolMaterial(ToolMaterial.STONE, 5, 2, 225.0f, ModTags.Items.MITHRIL_TOOL_MATERIALS))
                    .component(DataComponentTypes.ATTRIBUTE_MODIFIERS, AttributeModifiersComponent.builder()
                            .add(ModEntityAttributes.MINING_FORTUNE, new EntityAttributeModifier(Identifier.of(Skyblock.MOD_ID, "fractured_mithril_pickaxe_mining_fortune"),
                                    0.02, EntityAttributeModifier.Operation.ADD_MULTIPLIED_BASE), AttributeModifierSlot.MAINHAND)
                            .add(EntityAttributes.ATTACK_DAMAGE, new EntityAttributeModifier(Identifier.of(Skyblock.MOD_ID, "fractured_mithril_pickaxe_attack_damage"),
                                    6.0, EntityAttributeModifier.Operation.ADD_VALUE), AttributeModifierSlot.MAINHAND)
                            .add(EntityAttributes.ATTACK_SPEED, new EntityAttributeModifier(Identifier.of(Skyblock.MOD_ID, "fractured_mithril_pickaxe_attack_speed"),
                                    DEFAULT_PICKAXE_ATTACK_SPEED, EntityAttributeModifier.Operation.ADD_VALUE), AttributeModifierSlot.MAINHAND).build())
                    .rarity(Rarity.UNCOMMON)));

    public static final Item BANDAGED_MITHRIL_PICKAXE = ModItems.registerItem("bandaged_mithril_pickaxe",
            new ModItem(getPickaxeItemSettings("bandaged_mithril_pickaxe",
                    ModToolMaterials.getToolMaterial(ToolMaterial.STONE, 5, 2, 250.0f, ModTags.Items.MITHRIL_TOOL_MATERIALS))
                    .component(DataComponentTypes.ATTRIBUTE_MODIFIERS, AttributeModifiersComponent.builder()
                            .add(ModEntityAttributes.MINING_FORTUNE, new EntityAttributeModifier(Identifier.of(Skyblock.MOD_ID, "bandaged_mithril_pickaxe_mining_fortune"),
                                    0.04, EntityAttributeModifier.Operation.ADD_MULTIPLIED_BASE), AttributeModifierSlot.MAINHAND)
                            .add(EntityAttributes.ATTACK_DAMAGE, new EntityAttributeModifier(Identifier.of(Skyblock.MOD_ID, "bandaged_mithril_pickaxe_attack_damage"),
                                    6.0, EntityAttributeModifier.Operation.ADD_VALUE), AttributeModifierSlot.MAINHAND)
                            .add(EntityAttributes.ATTACK_SPEED, new EntityAttributeModifier(Identifier.of(Skyblock.MOD_ID, "bandaged_mithril_pickaxe_attack_speed"),
                                    DEFAULT_PICKAXE_ATTACK_SPEED, EntityAttributeModifier.Operation.ADD_VALUE), AttributeModifierSlot.MAINHAND).build())
                    .rarity(Rarity.UNCOMMON)));

    public static final Item MITHRIL_PICKAXE = ModItems.registerItem("mithril_pickaxe",
            new ModItem(getPickaxeItemSettings("mithril_pickaxe",
                    ModToolMaterials.getToolMaterial(ToolMaterial.DIAMOND, 5, 2, 300.0f, ModTags.Items.MITHRIL_TOOL_MATERIALS))
                    .component(DataComponentTypes.ATTRIBUTE_MODIFIERS, AttributeModifiersComponent.builder()
                            .add(ModEntityAttributes.MINING_FORTUNE, new EntityAttributeModifier(Identifier.of(Skyblock.MOD_ID, "mithril_pickaxe_mining_fortune"),
                                    0.07, EntityAttributeModifier.Operation.ADD_MULTIPLIED_BASE), AttributeModifierSlot.MAINHAND)
                            .add(EntityAttributes.ATTACK_DAMAGE, new EntityAttributeModifier(Identifier.of(Skyblock.MOD_ID, "mithril_pickaxe_attack_damage"),
                                    8.0, EntityAttributeModifier.Operation.ADD_VALUE), AttributeModifierSlot.MAINHAND)
                            .add(EntityAttributes.ATTACK_SPEED, new EntityAttributeModifier(Identifier.of(Skyblock.MOD_ID, "mithril_pickaxe_attack_speed"),
                                    DEFAULT_PICKAXE_ATTACK_SPEED, EntityAttributeModifier.Operation.ADD_VALUE), AttributeModifierSlot.MAINHAND).build())
                    .rarity(Rarity.UNCOMMON)));

    public static final Item REFINED_MITHRIL_PICKAXE = ModItems.registerItem("refined_mithril_pickaxe",
            new ModItem(getPickaxeItemSettings("refined_mithril_pickaxe",
                    ModToolMaterials.getToolMaterial(ToolMaterial.STONE, 5, 3, 350.0f, ModTags.Items.MITHRIL_TOOL_MATERIALS))
                    .component(DataComponentTypes.ATTRIBUTE_MODIFIERS, AttributeModifiersComponent.builder()
                            .add(ModEntityAttributes.MINING_FORTUNE, new EntityAttributeModifier(Identifier.of(Skyblock.MOD_ID, "refined_mithril_pickaxe_mining_fortune"),
                                    0.1, EntityAttributeModifier.Operation.ADD_MULTIPLIED_BASE), AttributeModifierSlot.MAINHAND)
                            .add(EntityAttributes.ATTACK_DAMAGE, new EntityAttributeModifier(Identifier.of(Skyblock.MOD_ID, "refined_mithril_pickaxe_attack_damage"),
                                    10.0, EntityAttributeModifier.Operation.ADD_VALUE), AttributeModifierSlot.MAINHAND)
                            .add(EntityAttributes.ATTACK_SPEED, new EntityAttributeModifier(Identifier.of(Skyblock.MOD_ID, "refined_mithril_pickaxe_attack_speed"),
                                    DEFAULT_PICKAXE_ATTACK_SPEED, EntityAttributeModifier.Operation.ADD_VALUE), AttributeModifierSlot.MAINHAND).build())
                    .rarity(Rarity.RARE)));

    public static final Item RUSTY_TITANIUM_PICKAXE = ModItems.registerItem("rusty_titanium_pickaxe",
            new ModItem(getPickaxeItemSettings("rusty_titanium_pickaxe",
                    ModToolMaterials.getToolMaterial(ToolMaterial.WOOD, 5, 2, 100.0f, ModTags.Items.TITANIUM_TOOL_MATERIALS))
                    .component(DataComponentTypes.ATTRIBUTE_MODIFIERS, AttributeModifiersComponent.builder()
                            .add(ModEntityAttributes.TITANIUM_FORTUNE, new EntityAttributeModifier(Identifier.of(Skyblock.MOD_ID, "rusty_titanium_pickaxe_titanium_fortune"),
                                    0.25, EntityAttributeModifier.Operation.ADD_MULTIPLIED_BASE), AttributeModifierSlot.MAINHAND)
                            .add(EntityAttributes.ATTACK_DAMAGE, new EntityAttributeModifier(Identifier.of(Skyblock.MOD_ID, "rusty_titanium_pickaxe_attack_damage"),
                                    11.0, EntityAttributeModifier.Operation.ADD_VALUE), AttributeModifierSlot.MAINHAND)
                            .add(EntityAttributes.ATTACK_SPEED, new EntityAttributeModifier(Identifier.of(Skyblock.MOD_ID, "rusty_titanium_pickaxe_attack_speed"),
                                    DEFAULT_PICKAXE_ATTACK_SPEED, EntityAttributeModifier.Operation.ADD_VALUE), AttributeModifierSlot.MAINHAND).build()),
                    ExpandedRarity.ModRarity.UNCOMMON, new Ability[]{new TitaniumFortuneAbility(0.25f)}));

    public static final Item TITANIUM_PICKAXE = ModItems.registerItem("titanium_pickaxe",
            new ModItem(getPickaxeItemSettings("titanium_pickaxe",
                    ModToolMaterials.getToolMaterial(ToolMaterial.IRON, 6, 3, 140.0f, ModTags.Items.TITANIUM_TOOL_MATERIALS))
                    .component(DataComponentTypes.ATTRIBUTE_MODIFIERS, AttributeModifiersComponent.builder()
                            .add(ModEntityAttributes.TITANIUM_FORTUNE, new EntityAttributeModifier(Identifier.of(Skyblock.MOD_ID, "titanium_pickaxe_titanium_fortune"),
                                    0.5, EntityAttributeModifier.Operation.ADD_MULTIPLIED_BASE), AttributeModifierSlot.MAINHAND)
                            .add(EntityAttributes.ATTACK_DAMAGE, new EntityAttributeModifier(Identifier.of(Skyblock.MOD_ID, "titanium_pickaxe_attack_damage"),
                                    12.0, EntityAttributeModifier.Operation.ADD_VALUE), AttributeModifierSlot.MAINHAND)
                            .add(EntityAttributes.ATTACK_SPEED, new EntityAttributeModifier(Identifier.of(Skyblock.MOD_ID, "titanium_pickaxe_attack_speed"),
                                    DEFAULT_PICKAXE_ATTACK_SPEED, EntityAttributeModifier.Operation.ADD_VALUE), AttributeModifierSlot.MAINHAND).build()),
                    ExpandedRarity.ModRarity.RARE, new Ability[]{new TitaniumFortuneAbility(0.5f)}));

    public static final Item POLISHED_TITANIUM_PICKAXE = ModItems.registerItem("polished_titanium_pickaxe",
            new ModItem(getPickaxeItemSettings("polished_titanium_pickaxe",
                    ModToolMaterials.getToolMaterial(ToolMaterial.IRON, 6, 3, 200.0f, ModTags.Items.TITANIUM_TOOL_MATERIALS))
                    .component(DataComponentTypes.ATTRIBUTE_MODIFIERS, AttributeModifiersComponent.builder()
                            .add(ModEntityAttributes.TITANIUM_FORTUNE, new EntityAttributeModifier(Identifier.of(Skyblock.MOD_ID, "polished_titanium_pickaxe_titanium_fortune"),
                                    1.0, EntityAttributeModifier.Operation.ADD_MULTIPLIED_BASE), AttributeModifierSlot.MAINHAND)
                            .add(EntityAttributes.ATTACK_DAMAGE, new EntityAttributeModifier(Identifier.of(Skyblock.MOD_ID, "polished_titanium_pickaxe_attack_damage"),
                                    13.0, EntityAttributeModifier.Operation.ADD_VALUE), AttributeModifierSlot.MAINHAND)
                            .add(EntityAttributes.ATTACK_SPEED, new EntityAttributeModifier(Identifier.of(Skyblock.MOD_ID, "polished_titanium_pickaxe_attack_speed"),
                                    DEFAULT_PICKAXE_ATTACK_SPEED, EntityAttributeModifier.Operation.ADD_VALUE), AttributeModifierSlot.MAINHAND).build()),
                    ExpandedRarity.ModRarity.RARE, new Ability[]{new TitaniumFortuneAbility(1.0f)}));

    public static final Item PICKONIMBUS_2000 = ModItems.registerItem("pickonimbus_2000",
            new ModItem(getPickaxeItemSettings("pickonimbus_2000", 2,
                    new ToolMaterial(ModTags.Blocks.INCORRECT_FOR_BREAKING_POWER_8, 2000, ToolMaterial.DIAMOND.speed() * 750f / 220f, 6, ToolMaterial.DIAMOND.enchantmentValue(), ModTags.Items.EMPTY))
                    .rarity(Rarity.EPIC)));

    public static final Item BINGONIMBUS_2000 = ModItems.registerItem("bingonimbus_2000",
            new ModItem(getPickaxeItemSettings("bingonimbus_2000", 2,
                    ModToolMaterials.getToolMaterial(ToolMaterial.GOLD, 7, 1, 1500f, ModTags.Items.EMPTY))
                            .component(DataComponentTypes.ATTRIBUTE_MODIFIERS, AttributeModifiersComponent.builder()
                                .add(ModEntityAttributes.MINING_FORTUNE, new EntityAttributeModifier(Identifier.of(Skyblock.MOD_ID, "bingonimbus_2000_mining_fortune"),
                                        1.0, EntityAttributeModifier.Operation.ADD_MULTIPLIED_BASE), AttributeModifierSlot.MAINHAND)
                                .add(EntityAttributes.ATTACK_DAMAGE, new EntityAttributeModifier(Identifier.of(Skyblock.MOD_ID, "bingonimbus_2000_attack_damage"),
                                        6.0, EntityAttributeModifier.Operation.ADD_VALUE), AttributeModifierSlot.MAINHAND)
                                .add(EntityAttributes.ATTACK_SPEED, new EntityAttributeModifier(Identifier.of(Skyblock.MOD_ID, "bingonimbus_2000_attack_speed"),
                                        DEFAULT_PICKAXE_ATTACK_SPEED, EntityAttributeModifier.Operation.ADD_VALUE), AttributeModifierSlot.MAINHAND).build())
                            .rarity(Rarity.EPIC).component(DataComponentTypes.UNBREAKABLE, Unit.INSTANCE)));

    public static final Item PIONEER_PICKAXE = ModItems.registerItem("pioneer_pickaxe",
            new ModItem(getPickaxeItemSettings("pioneer_pickaxe", 3,
                    ModToolMaterials.getToolMaterial(ToolMaterial.WOOD, 1, 1, 1f, ModTags.Items.EMPTY))
                    .component(DataComponentTypes.UNBREAKABLE, Unit.INSTANCE), ExpandedRarity.ModRarity.SPECIAL, new Ability[]{}));


    //SHOVELS
    public static final Item PROMISING_SHOVEL = ModItems.registerItem("promising_shovel",
            new ModItem(getShovelItemSettings("promising_shovel", 0, ModToolMaterials.PROMISING)
                .component(ModDataComponentTypes.BLOCKS_BROKEN, 0),
                ExpandedRarity.ModRarity.UNCOMMON, new Ability[]{new PromisingAbility(new int[]{10, 25, 100, 250, 500, 1000, 2000, 5000, 10000, 20000}), new ShovelAbility()}));

    public static final Item FLINT_SHOVEL = ModItems.registerItem("flint_shovel",
            new ModItem(getShovelItemSettings("flint_shovel", 3, ModToolMaterials.getToolMaterial(ToolMaterial.IRON, 1, 1.0f, ModTags.Items.FLINT_TOOL_MATERIALS)),
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
            new ModItem(getAxeItemSettings("jungle_axe", 4, ModToolMaterials.getToolMaterial(ToolMaterial.WOOD, 2, 1.0f, ModTags.Items.JUNGLE_AXE_MATERIALS)),
                    ExpandedRarity.ModRarity.UNCOMMON, new Ability[]{new TimberAbility(10), new AxeAbility()}));

    public static final Item TREECAPITATOR = ModItems.registerItem("treecapitator",
            new ModItem(getAxeItemSettings("treecapitator", 4, ModToolMaterials.getToolMaterial(ToolMaterial.GOLD, 4, 1.0f, ModTags.Items.TREECAPITATOR_TOOL_MATERIALS)),
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
            new ModItem(getAxeItemSettings("cocoa_chopper", ModToolMaterials.getToolMaterial(ToolMaterial.GOLD, Rarity.EPIC))
                    .component(DataComponentTypes.ATTRIBUTE_MODIFIERS, AttributeModifiersComponent.builder().add(ModEntityAttributes.COCOA_BEANS_FORTUNE,
                            new EntityAttributeModifier(Identifier.of(Skyblock.MOD_ID, "cocoa_chopper_cocoa_beans_fortune"),
                                    0.2, EntityAttributeModifier.Operation.ADD_MULTIPLIED_BASE), AttributeModifierSlot.MAINHAND).build()),
                    ExpandedRarity.ModRarity.EPIC, new Ability[]{new CocoaFortuneAbility(0.2f)}));

    public static final Item MELON_DICER = ModItems.registerItem("melon_dicer",
            new ModItem(getAxeItemSettings("melon_dicer", 2, ModToolMaterials.getToolMaterial(ToolMaterial.DIAMOND, 4, 1.0f, ModTags.Items.MELON_DICER_TOOL_MATERIALS)),
                    ExpandedRarity.ModRarity.EPIC, new Ability[]{new RollEmAbility(Blocks.MELON, "melon")}));

    public static final Item PUMPKIN_DICER = ModItems.registerItem("pumpkin_dicer",
            new ModItem(getAxeItemSettings("pumpkin_dicer", 2, ModToolMaterials.getToolMaterial(ToolMaterial.GOLD, 4, 1.0f, ModTags.Items.PUMPKIN_DICER_TOOL_MATERIALS)),
                    ExpandedRarity.ModRarity.EPIC, new Ability[]{new RollEmAbility(Blocks.PUMPKIN, "pumpkin")}));

    public static final Item EFFICIENT_AXE = ModItems.registerItem("efficient_axe",
            new ModItem(getItemSettings("efficient_axe", 2)
                    .axe(ModToolMaterials.getToolMaterial(ToolMaterial.IRON, Rarity.UNCOMMON), 5.0f, DEFAULT_IRON_AXE_ATTACK_SPEED),
                    ExpandedRarity.ModRarity.UNCOMMON, new Ability[]{new AxeAbility()}));

    public static final Item SWEET_AXE = ModItems.registerItem("sweet_axe",
            new ModItem(getItemSettings("sweet_axe", 2)
                    .axe(ModToolMaterials.getToolMaterial(ToolMaterial.IRON, Rarity.UNCOMMON), 5.0f, DEFAULT_IRON_AXE_ATTACK_SPEED),
                    ExpandedRarity.ModRarity.UNCOMMON, new Ability[]{new AxeAbility()}));


    //SWORDS
    public static final Item CHICKEN_AXE = ModItems.registerItem("chicken_axe",
            new ModItem(getSwordItemSettings("chicken_axe", ModToolMaterials.getToolMaterial(ToolMaterial.WOOD, Rarity.UNCOMMON)),
                    ExpandedRarity.ModRarity.UNCOMMON, new Ability[]{new AnimalAxeAbility("chicken")}));

    public static final Item COW_AXE = ModItems.registerItem("cow_axe",
            new ModItem(getSwordItemSettings("cow_axe", ModToolMaterials.getToolMaterial(ToolMaterial.WOOD, Rarity.UNCOMMON)),
                    ExpandedRarity.ModRarity.UNCOMMON, new Ability[]{new AnimalAxeAbility("cow")}));

    public static final Item MOOSHROOM_AXE = ModItems.registerItem("mooshroom_axe",
            new ModItem(getSwordItemSettings("mooshroom_axe", ModToolMaterials.getToolMaterial(ToolMaterial.WOOD, Rarity.UNCOMMON)),
                    ExpandedRarity.ModRarity.UNCOMMON, new Ability[]{new AnimalAxeAbility("mooshroom")}));

    public static final Item PIG_AXE = ModItems.registerItem("pig_axe",
            new ModItem(getSwordItemSettings("pig_axe", ModToolMaterials.getToolMaterial(ToolMaterial.WOOD, Rarity.UNCOMMON)),
                    ExpandedRarity.ModRarity.UNCOMMON, new Ability[]{new AnimalAxeAbility("pig")}));

    public static final Item RABBIT_AXE = ModItems.registerItem("rabbit_axe",
            new ModItem(getSwordItemSettings("rabbit_axe", ModToolMaterials.getToolMaterial(ToolMaterial.WOOD, Rarity.UNCOMMON)),
                    ExpandedRarity.ModRarity.UNCOMMON, new Ability[]{new AnimalAxeAbility("rabbit")}));

    public static final Item SHEEP_AXE = ModItems.registerItem("sheep_axe",
            new ModItem(getSwordItemSettings("sheep_axe", ModToolMaterials.getToolMaterial(ToolMaterial.WOOD, Rarity.UNCOMMON)),
                    ExpandedRarity.ModRarity.UNCOMMON, new Ability[]{new AnimalAxeAbility("sheep")}));


    //HOES
    public static final Item ROOKIE_HOE = ModItems.registerItem("rookie_hoe",
            new ModItem(getHoeItemSettings("rookie_hoe", 2, ModToolMaterials.ROOKIE),
                    ExpandedRarity.ModRarity.COMMON, new Ability[]{new HoeAbility()}));

    public static final Item BASIC_GARDENING_HOE = ModItems.registerItem("basic_gardening_hoe",
            new ModItem(getHoeItemSettings("basic_gardening_hoe", ModToolMaterials.getToolMaterial(ToolMaterial.IRON, Rarity.UNCOMMON))
                    .component(DataComponentTypes.ATTRIBUTE_MODIFIERS, AttributeModifiersComponent.builder()
                            .add(ModEntityAttributes.FARMING_FORTUNE, new EntityAttributeModifier(Identifier.of(Skyblock.MOD_ID, "basic_gardening_hoe_farming_fortune"),
                                    0.05, EntityAttributeModifier.Operation.ADD_MULTIPLIED_BASE), AttributeModifierSlot.MAINHAND).build()),
                    ExpandedRarity.ModRarity.UNCOMMON, new Ability[]{new HoeAbility()}));

    public static final Item ADVANCED_GARDENING_HOE = ModItems.registerItem("advanced_gardening_hoe",
            new ModItem(getHoeItemSettings("advanced_gardening_hoe", ModToolMaterials.getToolMaterial(ToolMaterial.DIAMOND, Rarity.RARE))
                    .component(DataComponentTypes.ATTRIBUTE_MODIFIERS, AttributeModifiersComponent.builder()
                        .add(ModEntityAttributes.FARMING_FORTUNE, new EntityAttributeModifier(Identifier.of(Skyblock.MOD_ID, "advanced_gardening_hoe_farming_fortune"),
                                0.1, EntityAttributeModifier.Operation.ADD_MULTIPLIED_BASE), AttributeModifierSlot.MAINHAND).build()),
                    ExpandedRarity.ModRarity.RARE, new Ability[]{new HoeAbility()}));

    public static final Item HOE_OF_GREAT_TILLING = ModItems.registerItem("hoe_of_great_tilling",
            new ModItem(getHoeItemSettings("hoe_of_great_tilling", 0, ModToolMaterials.getToolMaterial(ToolMaterial.STONE, Rarity.UNCOMMON)),
                    ExpandedRarity.ModRarity.UNCOMMON, new Ability[]{new HoeAbility(1)}));

    public static final Item HOE_OF_GREATER_TILLING = ModItems.registerItem("hoe_of_greater_tilling",
            new ModItem(getHoeItemSettings("hoe_of_greater_tilling", 0, ModToolMaterials.getToolMaterial(ToolMaterial.IRON, Rarity.RARE)),
                    ExpandedRarity.ModRarity.RARE, new Ability[]{new HoeAbility(2)}));

    public static final Item HOE_OF_GREATEST_TILLING = ModItems.registerItem("hoe_of_greatest_tilling",
            new ModItem(getHoeItemSettings("hoe_of_greatest_tilling", 3, ModToolMaterials.getToolMaterial(ToolMaterial.DIAMOND, Rarity.EPIC)),
                    ExpandedRarity.ModRarity.EPIC, new Ability[]{new HoeAbility(64, true)}));

    public static final Item CACTUS_KNIFE = ModItems.registerItem("cactus_knife",
            new ModItem(getItemSettings("cactus_knife", 1).rarity(Rarity.EPIC).sword(ModToolMaterials.getToolMaterial(ToolMaterial.GOLD, Rarity.EPIC), 0, 0)));

    public static final Item FUNGI_CUTTER = ModItems.registerItem("fungi_cutter",
            new ModItem(getAxeItemSettings("fungi_cutter", ModToolMaterials.getToolMaterial(ToolMaterial.GOLD, Rarity.RARE))
                    .rarity(Rarity.RARE)
                    .component(DataComponentTypes.ATTRIBUTE_MODIFIERS, AttributeModifiersComponent.builder()
                    .add(ModEntityAttributes.MUSHROOM_FORTUNE, new EntityAttributeModifier(Identifier.of(Skyblock.MOD_ID, "fungi_cutter_mushroom_fortune"),
                            0.3, EntityAttributeModifier.Operation.ADD_MULTIPLIED_BASE), AttributeModifierSlot.MAINHAND).build())));


    public static final Item HOE_OF_NO_TILLING = ModItems.registerItem("hoe_of_no_tilling",
            new ModItem(getHoeItemSettings("hoe_of_no_tilling", 4, ModToolMaterials.getToolMaterial(ToolMaterial.GOLD, Rarity.UNCOMMON)).rarity(Rarity.UNCOMMON),
                    ExpandedRarity.ModRarity.UNCOMMON, new Ability[]{new HoeAbility()}));

    //TODO: add Mathematical Hoes



    private static Item.Settings getPickaxeItemSettings(String name, ToolMaterial material) {
        return getItemSettings(name, 0).pickaxe(material, 0.0f, 0.0f);
    }
    private static Item.Settings getPickaxeItemSettings(String name, int loreLines, ToolMaterial material) {
        return getItemSettings(name, loreLines).pickaxe(material, 0.0f, 0.0f);
    }
    private static Item.Settings getShovelItemSettings(String name, int loreLines, ToolMaterial material) {
        return getItemSettings(name, loreLines).shovel(material, 0.0f, 0.0f);
    }
    private static Item.Settings getAxeItemSettings(String name, ToolMaterial material) {
        return getItemSettings(name, 0).axe(material, 0.0f, 0.0f);
    }
    private static Item.Settings getAxeItemSettings(String name, int loreLines, ToolMaterial material) {
        return getItemSettings(name, loreLines).axe(material, 0.0f, 0.0f);
    }
    private static Item.Settings getSwordItemSettings(String name, ToolMaterial material) {
        return getItemSettings(name, 0).sword(material, 0.0f, 0.0f);
    }
    private static Item.Settings getHoeItemSettings(String name, int loreLines, ToolMaterial material) {
        return getItemSettings(name, loreLines).hoe(material, 0.0f, 0.0f);
    }
    private static Item.Settings getHoeItemSettings(String name, ToolMaterial material) {
        return getItemSettings(name, 0).hoe(material, 0.0f, 0.0f);
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
            entries.add(ModTools.BINGONIMBUS_2000);
            entries.add(ModTools.CACTUS_KNIFE);
            entries.add(ModTools.COCOA_CHOPPER);
            entries.add(ModTools.EFFICIENT_AXE);
            entries.add(ModTools.FLINT_SHOVEL);
            entries.add(ModTools.FRACTURED_MITHRIL_PICKAXE);
            entries.add(ModTools.FUNGI_CUTTER);
            entries.add(ModTools.HOE_OF_GREAT_TILLING);
            entries.add(ModTools.HOE_OF_GREATER_TILLING);
            entries.add(ModTools.HOE_OF_GREATEST_TILLING);
            entries.add(ModTools.HOE_OF_NO_TILLING);
            entries.add(ModTools.JUNGLE_AXE);
            entries.add(ModTools.JUNGLE_PICKAXE);
            entries.add(ModTools.LAPIS_PICKAXE);
            entries.add(ModTools.MELON_DICER);
            entries.add(ModTools.MITHRIL_PICKAXE);
            entries.add(ModTools.PICKONIMBUS_2000);
            entries.add(ModTools.PIONEER_PICKAXE);
            entries.add(ModTools.POLISHED_TITANIUM_PICKAXE);
            entries.add(ModTools.PROMISING_AXE);
            entries.add(ModTools.PROMISING_PICKAXE);
            entries.add(ModTools.PROMISING_PICKAXE_LEGACY);
            entries.add(ModTools.PROMISING_SHOVEL);
            entries.add(ModTools.PUMPKIN_DICER);
            entries.add(ModTools.REFINED_MITHRIL_PICKAXE);
            entries.add(ModTools.ROOKIE_AXE);
            entries.add(ModTools.ROOKIE_HOE);
            entries.add(ModTools.ROOKIE_PICKAXE);
            entries.add(ModTools.RUSTY_TITANIUM_PICKAXE);
            entries.add(ModTools.SNOW_SHOVEL);
            entries.add(ModTools.STONK);
            entries.add(ModTools.SWEET_AXE);
            entries.add(ModTools.TITANIUM_PICKAXE);
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
