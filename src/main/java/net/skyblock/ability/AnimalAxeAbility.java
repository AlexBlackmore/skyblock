package net.skyblock.ability;

import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

import java.util.function.Consumer;

public class AnimalAxeAbility extends Ability {
    private final String entity;
    public AnimalAxeAbility(String entity) {
        super("animal_axe", 3);
        setShowName(false);
        this.entity = entity;
    }

    @Override
    public Object[] getTooltipArguments(int i, ItemStack stack) {
        switch(i) {
            case 0 -> {
                return new Object[]{Text.translatable("entity.minecraft." + this.entity).formatted(Formatting.LIGHT_PURPLE)};
            }
            default -> {
                return new Object[]{};
            }
        }
    }
}
