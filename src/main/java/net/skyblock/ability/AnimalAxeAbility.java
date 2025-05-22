package net.skyblock.ability;

import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

import java.util.function.Consumer;

public class AnimalAxeAbility extends Ability {
    private final String entity;
    public AnimalAxeAbility(String entity) {
        super("animal_axe", 3);
        this.entity = entity;
    }


    @Override
    public void appendTooltip(ItemStack stack, Consumer<Text> textConsumer) {
        for (int i=0 ; i<this.loreLines ; i++) {
            if (i == 0) {
                textConsumer.accept(Text.translatable("ability.skyblock." + name + "." + i, Text.translatable("entity.minecraft." + this.entity).formatted(Formatting.LIGHT_PURPLE)));
            } else {
                textConsumer.accept(Text.translatable("ability.skyblock." + name + "." + i));
            }
        }
    }
}
