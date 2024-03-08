package net.skyblock.effect.abilities;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.text.Text;
import net.skyblock.effect.Abilities;
import net.skyblock.effect.Ability;

import java.util.ArrayList;
import java.util.List;

public class ExpertMinerAbility extends Ability {
    private final int MINING_SPEED = 2;
    public ExpertMinerAbility() {
        super("expert_miner", Abilities.EXPERT_MINER_ABILITY, 99, true);
    }

    @Override
    public void apply(PlayerEntity player) {

    }

    @Override
    public List<Object> getLoreArgs(int i) {
        List<Object> list = new ArrayList<>();
        switch (i) {
            case 1 -> {
                list.add("§a+" + MINING_SPEED + "%");
                list.add(Text.translatable("attribute.name.player.mining_speed"));
            }
            default -> {}
        }
        return list;
    }
}