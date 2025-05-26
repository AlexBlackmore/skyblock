package net.skyblock.ability;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

import java.util.function.Consumer;

public class CocoaFortuneAbility extends Ability {
    private final float fortune;
    private final Block block;

    public CocoaFortuneAbility(float fortune) {
        super("cocoa_fortune", 3);
        this.fortune = fortune;
        this.block = Blocks.COCOA;
        this.setShowName(false);
    }

    @Override
    public void appendTooltip(ItemStack stack, Consumer<Text> textConsumer) {
        for (int i=0 ; i<this.loreLines ; i++) {
            if (i == 0) {
                textConsumer.accept(Text.translatable("ability.skyblock." + name + "." + i, "§9+" + (int)(this.fortune *100) + "%", Text.translatable("attribute.name.fortune.cocoa_beans").formatted(Formatting.BLUE)));
            } else if (i == 1) {
                textConsumer.accept(Text.translatable("ability.skyblock." + name + "." + i, this.block.getName()));
            }
        }
    }
}
