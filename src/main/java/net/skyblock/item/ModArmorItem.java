package net.skyblock.item;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ArmorMaterials;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.world.World;
import net.skyblock.util.ArmorSetUtil;
import net.skyblock.util.LoreUtil;
import net.skyblock.util.ModItemInterface;
import net.skyblock.util.ModRarity;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.UUID;

public class ModArmorItem extends ArmorItem implements ModItemInterface {
    private final Multimap<EntityAttribute, EntityAttributeModifier> attributeModifiers;
    private ModRarity rarity;
    private String loreKey;

    private Multimap<EntityAttribute, EntityAttributeModifier> BuildDefaultAttributes(ArmorMaterial material) {
        ImmutableMultimap.Builder<EntityAttribute, EntityAttributeModifier> builder = ImmutableMultimap.builder();
        builder.put(EntityAttributes.GENERIC_ARMOR, new EntityAttributeModifier(UUID.randomUUID(), "Armor modifier", material.getProtection(type), EntityAttributeModifier.Operation.ADDITION));
        builder.put(EntityAttributes.GENERIC_ARMOR_TOUGHNESS, new EntityAttributeModifier(UUID.randomUUID(), "Armor toughness", material.getToughness(), EntityAttributeModifier.Operation.ADDITION));
        if (material == ArmorMaterials.NETHERITE) {
            builder.put(EntityAttributes.GENERIC_KNOCKBACK_RESISTANCE, new EntityAttributeModifier(UUID.randomUUID(), "Armor knockback resistance", material.getKnockbackResistance(), EntityAttributeModifier.Operation.ADDITION));
        }
        return builder.build();
    }
    public ModArmorItem(ArmorMaterial material, Type type, Settings settings) {
        super(material, type, settings);
        this.rarity = ModRarity.convertRarity(this);

        if (material instanceof ModArmorMaterial modMaterial) {
            this.attributeModifiers = modMaterial.getStats(type);
        } else {
            this.attributeModifiers = BuildDefaultAttributes(material);
        }
    }

    public ModArmorItem(ArmorMaterial material, Type type, Settings settings, ModRarity rarity, String name) {
        super(material, type, settings.rarity(ModRarity.convertModRarity(rarity)));
        this.rarity = rarity;
        this.loreKey = "lore.skyblock." + name;

        if (material instanceof ModArmorMaterial modMaterial) {
            this.attributeModifiers = modMaterial.getStats(type);
        } else {
            this.attributeModifiers = BuildDefaultAttributes(material);
        }
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if(!world.isClient()) {
            if(entity instanceof PlayerEntity player) {
                ArmorSetUtil.evaluateArmorEffects(player);
            }
        }
        super.inventoryTick(stack, world, entity, slot, selected);
    }

    @Override
    public Multimap<EntityAttribute, EntityAttributeModifier> getAttributeModifiers(EquipmentSlot slot) {
        if (slot == this.type.getEquipmentSlot()) {
            return this.attributeModifiers;
        }
        return super.getAttributeModifiers(slot);
    }
    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        if (this.material instanceof ModArmorMaterial modMaterial) {
            for (int i = 0; i < modMaterial.getAbilities().length; i++) {
                LoreUtil.appendLore(tooltip, modMaterial.getAbilities()[i]);
            }
        }
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
