package net.skyblock.item.abilities;

import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

import java.util.ArrayList;
import java.util.List;

public class BonusSpeed extends Ability {
    public static final int BOOST = 20;
    public BonusSpeed() { super("bonus_speed", true); }

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