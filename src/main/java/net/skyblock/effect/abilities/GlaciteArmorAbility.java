package net.skyblock.effect.abilities;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.skyblock.effect.Abilities;
import net.skyblock.effect.Ability;

import java.util.ArrayList;
import java.util.List;

public class GlaciteArmorAbility extends Ability {
    public GlaciteArmorAbility() {
        super("glacite_armor", Abilities.EXPERT_MINER_ABILITY, 99);
    }

    @Override
    public void apply(PlayerEntity player) {

    }

    @Override
    public List<Object> getLoreArgs(int i) {
        List<Object> list = new ArrayList<>();
        switch (i) {
            case 1 -> {
                list.add(Text.translatable("attribute.name.generic.armor"));
            }
            case 2 -> {
                list.add(Text.literal("doubled").formatted(Formatting.GREEN));
            }
            default -> {}
        }
        return list;
    }
}