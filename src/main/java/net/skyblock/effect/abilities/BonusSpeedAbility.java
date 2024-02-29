package net.skyblock.effect.abilities;

import com.google.common.collect.ImmutableList;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.AttributeContainer;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.chunk.ChunkSection;
import net.skyblock.effect.Ability;
import net.skyblock.effect.ModStatusEffect;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

public class BonusSpeedAbility extends Ability {
    public static final int BOOST = 20;
    public BonusSpeedAbility(String name, StatusEffect effect) { super(name, effect, 80, true); }

    @Override
    public void apply(PlayerEntity player) {
        StatusEffectInstance effect = new StatusEffectInstance(this.getEffect(), this.getCoolDown(), 0, true, false, false);
        RegistryEntry<Biome> biome = player.getWorld().getBiome(player.getBlockPos());

        if(!player.hasStatusEffect(effect.getEffectType()) && biome.getKey().isPresent()) {
            if (player.getWorld().getBiome(player.getBlockPos()).matchesKey(BiomeKeys.PLAINS) ||
                player.getWorld().getBiome(player.getBlockPos()).matchesKey(BiomeKeys.RIVER) ||
                player.getWorld().getBiome(player.getBlockPos()).matchesKey(BiomeKeys.WINDSWEPT_HILLS) ||
                player.getWorld().getBiome(player.getBlockPos()).matchesKey(BiomeKeys.DESERT) ||
                player.getWorld().getBiome(player.getBlockPos()).matchesKey(BiomeKeys.BADLANDS) ||
                player.getWorld().getBiome(player.getBlockPos()).matchesKey(BiomeKeys.MUSHROOM_FIELDS) ||
                player.getWorld().getBiome(player.getBlockPos()).matchesKey(BiomeKeys.SPARSE_JUNGLE) ||
                player.getWorld().getBiome(player.getBlockPos()).matchesKey(BiomeKeys.MEADOW) ||
                player.getWorld().getBiome(player.getBlockPos()).matchesKey(BiomeKeys.SUNFLOWER_PLAINS)) {

                player.addStatusEffect(new StatusEffectInstance(effect));
            }
        }
    }

    @Override
    public List<Object> getLoreArgs(int i) {
        List<Object> list = new ArrayList<>();
        switch (i) {
            case 1 -> {
                list.add(Text.translatable("attribute.name.generic.movement_speed"));
                list.add("§a+" + BOOST + "%");
            }
            case 3 -> {
                list.add(Text.translatable("biome.minecraft.plains").formatted(Formatting.DARK_GRAY));
                list.add(Text.translatable("biome.minecraft.river").formatted(Formatting.DARK_GRAY));
                list.add(Text.translatable("biome.minecraft.windswept_hills").formatted(Formatting.DARK_GRAY));
            }
            case 4 -> {
                list.add(Text.translatable("biome.minecraft.desert").formatted(Formatting.DARK_GRAY));
                list.add(Text.translatable("biome.minecraft.badlands").formatted(Formatting.DARK_GRAY));
                list.add(Text.translatable("biome.minecraft.mushroom_fields").formatted(Formatting.DARK_GRAY));
            }
            case 5 -> {
                list.add(Text.translatable("biome.minecraft.sparse_jungle").formatted(Formatting.DARK_GRAY));
                list.add(Text.translatable("biome.minecraft.meadow").formatted(Formatting.DARK_GRAY));
            }
            case 6 -> {
                list.add(Text.translatable("biome.minecraft.sunflower_plains").formatted(Formatting.DARK_GRAY));
            }
            default -> {}
        }
        return list;
    }
}