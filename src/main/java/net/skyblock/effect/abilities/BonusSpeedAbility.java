package net.skyblock.effect.abilities;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeKeys;
import net.skyblock.effect.Abilities;
import net.skyblock.effect.Ability;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class BonusSpeedAbility extends Ability {
    private final int amplifier;
    public BonusSpeedAbility(int amplifier) {
        super("bonus_speed", Abilities.BONUS_SPEED_ABILITY, 99, true);
        this.amplifier = amplifier;
    }

    @Override
    public void apply(PlayerEntity player) {
        StatusEffectInstance effect = new StatusEffectInstance(this.getEffect(), this.getCoolDown(), amplifier, true, false, false);
        RegistryEntry<Biome> biome = player.getWorld().getBiome(player.getBlockPos());

        if (biome.getKey().isPresent() &&
            (player.getWorld().getBiome(player.getBlockPos()).matchesKey(BiomeKeys.PLAINS) ||
            player.getWorld().getBiome(player.getBlockPos()).matchesKey(BiomeKeys.RIVER) ||
            player.getWorld().getBiome(player.getBlockPos()).matchesKey(BiomeKeys.WINDSWEPT_HILLS) ||
            player.getWorld().getBiome(player.getBlockPos()).matchesKey(BiomeKeys.DESERT) ||
            player.getWorld().getBiome(player.getBlockPos()).matchesKey(BiomeKeys.BADLANDS) ||
            player.getWorld().getBiome(player.getBlockPos()).matchesKey(BiomeKeys.MUSHROOM_FIELDS) ||
            player.getWorld().getBiome(player.getBlockPos()).matchesKey(BiomeKeys.SPARSE_JUNGLE) ||
            player.getWorld().getBiome(player.getBlockPos()).matchesKey(BiomeKeys.MEADOW) ||
            player.getWorld().getBiome(player.getBlockPos()).matchesKey(BiomeKeys.SUNFLOWER_PLAINS))) {

            if(!player.hasStatusEffect(effect.getEffectType())) {
                player.addStatusEffect(new StatusEffectInstance(effect));
            } else if (Objects.requireNonNull(player.getStatusEffect(effect.getEffectType())).getDuration()<=21) {
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
                list.add("§a+" + (amplifier+1)*5 + "%");
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