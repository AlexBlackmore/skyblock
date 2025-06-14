package net.skyblock.ability;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.skyblock.block.ModBlocks;


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
    public Object[] getTooltipArguments(int i, ItemStack stack) {
        switch(i) {
            case 0 -> {
                return new Object[]{"§9+" + (int)(this.fortune *100) + "%", Text.translatable("attribute.name.fortune.mining").formatted(Formatting.BLUE)};
            }
            case 1 -> {
                return new Object[]{this.block.getName()};
            }
            default -> {
                return new Object[]{};
            }
        }
    }
}
