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
    public Object[] getTooltipArguments(int i, ItemStack stack) {
        switch(i) {
            case 0 -> {
                return new Object[]{"§9+" + (int)(this.fortune *100) + "%", Text.translatable("attribute.name.fortune.cocoa_beans").formatted(Formatting.BLUE)};
            }
            case 2 -> {
                return new Object[]{this.block.getName()};
            }
            default -> {
                return new Object[]{};
            }
        }
    }
}
