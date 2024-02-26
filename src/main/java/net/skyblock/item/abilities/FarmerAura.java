package net.skyblock.item.abilities;

import net.minecraft.entity.player.PlayerEntity;

import java.util.ArrayList;
import java.util.List;

public class FarmerAura extends Ability {
    public static final int DURATION = 3;
    public static final int RANGE = 15;
    public FarmerAura() {
        super("farmer_aura", true);
    }

    @Override
    public void apply(PlayerEntity player) {

    }

    @Override
    public List<Object> getLoreArgs(int i) {
        List<Object> list = new ArrayList<>();
        switch (i) {
            case 3 -> {
                list.add("§e" + RANGE);
            }
            case 4 -> {
                list.add("§a" + DURATION + "s");
            }
            default -> {}
        }
        return list;
    }
}
