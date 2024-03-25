package net.skyblock.item;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.LootTables;
import net.minecraft.loot.context.LootContextParameterSet;
import net.minecraft.loot.context.LootContextParameters;
import net.minecraft.loot.context.LootContextTypes;
import net.minecraft.registry.Registries;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.skyblock.util.LoreUtil;
import net.skyblock.util.ModItemInterface;
import net.skyblock.util.ModRarity;
import org.jetbrains.annotations.Nullable;

import java.util.Collections;
import java.util.List;

public class ModMiningToolItem extends MiningToolItem implements ModItemInterface {
    private Multimap<EntityAttribute, EntityAttributeModifier> attributeModifiers;
    private ModRarity rarity = ModRarity.COMMON;
    private String loreKey;
    private boolean hasGlint = false;

    private Multimap<EntityAttribute, EntityAttributeModifier> BuildDefaultAttributes(ToolMaterial material) {
        ImmutableMultimap.Builder<EntityAttribute, EntityAttributeModifier> builder = ImmutableMultimap.builder();
        builder.put(EntityAttributes.GENERIC_ATTACK_DAMAGE, new EntityAttributeModifier(ATTACK_DAMAGE_MODIFIER_ID, "Tool modifier", material.getAttackDamage(), EntityAttributeModifier.Operation.ADDITION));
        builder.put(EntityAttributes.GENERIC_ATTACK_SPEED, new EntityAttributeModifier(ATTACK_SPEED_MODIFIER_ID, "Tool modifier", -2.8f, EntityAttributeModifier.Operation.ADDITION));
        return builder.build();
    }
    public ModMiningToolItem(ToolMaterial material, TagKey<Block> effectiveBlocks, Settings settings) {
        super(0, -2.8f, material, effectiveBlocks, settings);
        this.rarity = ModRarity.convertRarity(this);

        if (material instanceof ModToolMaterial modMaterial) {
            this.attributeModifiers = modMaterial.getStats();
        } else {
            this.attributeModifiers = BuildDefaultAttributes(material);
        }
    }

    public void modifyLoot(List<ItemStack> loot, PlayerEntity player, ItemStack tool) {}

    public void generateAdditionalLoot(ItemStack stack, ServerWorld world, BlockState state, BlockPos pos, LivingEntity miner) {
        LootContextParameterSet.Builder builder = new LootContextParameterSet.Builder(world).add(LootContextParameters.ORIGIN, Vec3d.ofCenter(pos)).add(LootContextParameters.TOOL, stack).addOptional(LootContextParameters.THIS_ENTITY, miner);
        Identifier lootTableId = Registries.ITEM.getId(this).withPrefixedPath("items/");

        if (lootTableId == LootTables.EMPTY) {
            return;
        }

        LootContextParameterSet lootContextParameterSet = builder.add(LootContextParameters.BLOCK_STATE, state).build(LootContextTypes.BLOCK);
        ServerWorld serverWorld = lootContextParameterSet.getWorld();
        LootTable lootTable = serverWorld.getServer().getLootManager().getLootTable(lootTableId);
        lootTable.generateLoot(lootContextParameterSet).forEach(loot -> Block.dropStack(world, pos, loot));
    }

    public ModMiningToolItem setLoreKey(String name) {
            this.loreKey = "lore.skyblock." + name;
            return this;
    }
    public ModMiningToolItem setModRarity(ModRarity rarity) {
        this.rarity = rarity;
        return this;
    }
    public ModMiningToolItem setGlint(boolean hasGlint) {
        this.hasGlint = hasGlint;
        return this;
    }

    @Override
    public Multimap<EntityAttribute, EntityAttributeModifier> getAttributeModifiers(EquipmentSlot slot) {
        if (slot == EquipmentSlot.MAINHAND) {
            return this.attributeModifiers;
        }
        return super.getAttributeModifiers(slot);
    }

    @Override
    public Text getName() {
        return Text.translatable(this.getTranslationKey()).formatted(this.rarity.formatting);
    }
    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        LoreUtil.appendLore(stack, tooltip, this);
        super.appendTooltip(stack, world, tooltip, context);
    }
    public String getLoreKey() {
        return this.loreKey;
    }

    public ModRarity getModRarity() {return this.rarity;}

    @Override
    public boolean hasGlint(ItemStack stack) {
        return this.hasGlint || super.hasGlint(stack);
    }
}
