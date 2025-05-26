package net.skyblock.ability;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.skyblock.block.ModBlocks;

import java.util.function.Consumer;

public class TitaniumFortuneAbility extends Ability {
    private final float fortune;
    private final Block block;

    public TitaniumFortuneAbility(float fortune) {
        super("titanium_fortune", 2);
        this.fortune = fortune;
        this.block = ModBlocks.TITANIUM_ORE;
        this.setShowName(false);
    }

    @Override
    public void appendTooltip(ItemStack stack, Consumer<Text> textConsumer) {
        for (int i=0 ; i<this.loreLines ; i++) {
            if (i == 0) {
                textConsumer.accept(Text.translatable("ability.skyblock." + name + "." + i, "§9+" + (int)(this.fortune *100) + "%", Text.translatable("attribute.name.fortune.mining").formatted(Formatting.BLUE)));
            } else if (i == 1) {
                textConsumer.accept(Text.translatable("ability.skyblock." + name + "." + i, this.block.getName()));
            }
        }
    }
}
