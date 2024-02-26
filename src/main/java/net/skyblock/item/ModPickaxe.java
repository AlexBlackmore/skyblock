package net.skyblock.item;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import net.minecraft.block.Block;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.item.*;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.text.Text;
import net.minecraft.world.World;
import net.skyblock.util.LoreUtil;
import net.skyblock.util.ModItemInterface;
import net.skyblock.util.ModRarity;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.UUID;

public class ModPickaxe extends PickaxeItem implements ModItemInterface {
    private Multimap<EntityAttribute, EntityAttributeModifier> attributeModifiers;
    private ModRarity rarity;
    private String loreKey;
    private Multimap<EntityAttribute, EntityAttributeModifier> BuildDefaultAttributes(ToolMaterial material) {
        ImmutableMultimap.Builder<EntityAttribute, EntityAttributeModifier> builder = ImmutableMultimap.builder();
        builder.put(EntityAttributes.GENERIC_ATTACK_DAMAGE, new EntityAttributeModifier(ATTACK_DAMAGE_MODIFIER_ID, "Tool modifier", material.getAttackDamage(), EntityAttributeModifier.Operation.ADDITION));
        builder.put(EntityAttributes.GENERIC_ATTACK_SPEED, new EntityAttributeModifier(ATTACK_SPEED_MODIFIER_ID, "Tool modifier", -2.8f, EntityAttributeModifier.Operation.ADDITION));
        return builder.build();
    }
    public ModPickaxe(ToolMaterial material, Settings settings) {
        super(material, 0, -2.8f, settings);
        this.rarity = ModRarity.convertRarity(this);

        if (material instanceof ModToolMaterial modMaterial) {
            this.attributeModifiers = modMaterial.getStats();
        } else {
            this.attributeModifiers = BuildDefaultAttributes(material);
        }
    }
    public ModPickaxe(ToolMaterial material, Settings settings, ModRarity rarity, String name) {
        super(material, 0, -2.8f, settings.rarity(ModRarity.convertModRarity(rarity)));
        this.rarity = rarity;
        this.loreKey = "lore.skyblock." + name;

        if (material instanceof ModToolMaterial modMaterial) {
            this.attributeModifiers = modMaterial.getStats();
        } else {
            this.attributeModifiers = BuildDefaultAttributes(material);
        }
    }

    @Override
    public Multimap<EntityAttribute, EntityAttributeModifier> getAttributeModifiers(EquipmentSlot slot) {
        if (slot == EquipmentSlot.MAINHAND) {
            return this.attributeModifiers;
        }
        return super.getAttributeModifiers(slot);
    }
    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        LoreUtil.appendLore(tooltip, this);
        super.appendTooltip(stack, world, tooltip, context);
    }
    public String getLoreKey() {
        return this.loreKey;
    }

    public ModRarity getModRarity() {return this.rarity;}
    @Override
    public void setModRarity(ModRarity rarity) {this.rarity = rarity;}
}
