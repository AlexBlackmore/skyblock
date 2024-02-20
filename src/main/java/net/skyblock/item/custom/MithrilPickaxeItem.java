package net.skyblock.item.custom;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.text.Text;
import net.minecraft.util.Rarity;
import net.minecraft.world.World;
import net.skyblock.item.ModMiningToolItem;
import net.skyblock.item.ModToolMaterials;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class MithrilPickaxeItem extends ModMiningToolItem {
    private static final String NAME = "mithril_pickaxe";
    private int mithrilPowder = 0;
    private int mithrilMiningSpeed = 0;
    public MithrilPickaxeItem(float attackDamage, float miningSpeed, Settings settings) {
        super(attackDamage, -2.8f, miningSpeed, ModToolMaterials.TITANIUM, BlockTags.PICKAXE_MINEABLE, settings);
    }
    public MithrilPickaxeItem(float attackDamage, float miningSpeed, Settings settings, int powder, int speed) {
        super(attackDamage, -2.8f, miningSpeed, ModToolMaterials.TITANIUM, BlockTags.PICKAXE_MINEABLE,  settings);
        this.mithrilPowder = powder;
        this.mithrilMiningSpeed = speed;
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        if (this.mithrilPowder>0) {
            String loreKey = "lore.skyblock." + NAME;
            tooltip.add(Text.translatable(loreKey + "." + 1, "§a+"+this.mithrilPowder+"%", Text.translatable("currency.skyblock.mithril_powder")));
            tooltip.add(Text.translatable(loreKey + "." + 2));
            tooltip.add(Text.translatable(loreKey + "." + 3));
            tooltip.add(Text.translatable(loreKey + "." + 4, "§a+"+ this.mithrilMiningSpeed+"%", Text.translatable("attribute.name.generic.mining_speed")));
            tooltip.add(Text.translatable(loreKey + "." + 5));
            tooltip.add(Text.literal(" "));
        }
    }
    @Override
    public boolean hasGlint(ItemStack stack) {
        return true;
    }
}
