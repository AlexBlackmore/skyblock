package net.skyblock.item;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import net.fabricmc.yarn.constants.MiningLevels;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.item.*;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.skyblock.util.ModRarity;

public class ModMiningToolItem extends ModToolItem implements Vanishable {
    private TagKey<Block> effectiveBlocks;
    protected float miningSpeed;
    private float attackDamage;
    private Multimap<EntityAttribute, EntityAttributeModifier> attributeModifiers;

    public ModMiningToolItem(float attackDamage, float attackSpeed, float miningSpeed, ToolMaterial material, TagKey<Block> effectiveBlocks, Item.Settings settings) {
        super(material, settings);
        construct(attackDamage, attackSpeed, miningSpeed, effectiveBlocks);
    }
    public ModMiningToolItem(float attackDamage, float attackSpeed, float miningSpeed, ToolMaterial material, TagKey<Block> effectiveBlocks, Item.Settings settings, ModRarity rarity) {
        super(material, settings, rarity);
        construct(attackDamage, attackSpeed, miningSpeed, effectiveBlocks);
    }
    public ModMiningToolItem(float attackDamage, float attackSpeed, float miningSpeed, ToolMaterial material, TagKey<Block> effectiveBlocks, Item.Settings settings, ModRarity rarity, String name) {
        super(material, settings, rarity, name);
        construct(attackDamage, attackSpeed, miningSpeed, effectiveBlocks);
    }
    private void construct(float attackDamage, float attackSpeed, float miningSpeed, TagKey<Block> effectiveBlocks) {
        this.effectiveBlocks = effectiveBlocks;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        ImmutableMultimap.Builder<EntityAttribute, EntityAttributeModifier> builder = ImmutableMultimap.builder();
        builder.put(EntityAttributes.GENERIC_ATTACK_DAMAGE, new EntityAttributeModifier(ATTACK_DAMAGE_MODIFIER_ID, "Tool modifier", this.attackDamage, EntityAttributeModifier.Operation.ADDITION));
        builder.put(EntityAttributes.GENERIC_ATTACK_SPEED, new EntityAttributeModifier(ATTACK_SPEED_MODIFIER_ID, "Tool modifier", attackSpeed, EntityAttributeModifier.Operation.ADDITION));
        this.attributeModifiers = builder.build();
    }

    @Override
    public float getMiningSpeedMultiplier(ItemStack stack, BlockState state) {
        return state.isIn(this.effectiveBlocks) ? this.miningSpeed : 1.0f;
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        stack.damage(2, attacker, e -> e.sendEquipmentBreakStatus(EquipmentSlot.MAINHAND));
        return true;
    }

    @Override
    public boolean postMine(ItemStack stack, World world, BlockState state, BlockPos pos, LivingEntity miner) {
        if (!world.isClient && state.getHardness(world, pos) != 0.0f) {
            stack.damage(1, miner, e -> e.sendEquipmentBreakStatus(EquipmentSlot.MAINHAND));
        }
        return true;
    }

    @Override
    public Multimap<EntityAttribute, EntityAttributeModifier> getAttributeModifiers(EquipmentSlot slot) {
        if (slot == EquipmentSlot.MAINHAND) {
            return this.attributeModifiers;
        }
        return super.getAttributeModifiers(slot);
    }

    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public boolean isSuitableFor(BlockState state) {
        int i = this.getMaterial().getMiningLevel();
        if (i < MiningLevels.DIAMOND && state.isIn(BlockTags.NEEDS_DIAMOND_TOOL)) {
            return false;
        }
        if (i < MiningLevels.IRON && state.isIn(BlockTags.NEEDS_IRON_TOOL)) {
            return false;
        }
        if (i < MiningLevels.STONE && state.isIn(BlockTags.NEEDS_STONE_TOOL)) {
            return false;
        }
        return state.isIn(this.effectiveBlocks);
    }
}
