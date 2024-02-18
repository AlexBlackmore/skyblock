package net.skyblock.mixin;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.MutableText;
import net.minecraft.text.Text;
import net.minecraft.util.Rarity;
import net.skyblock.item.ModItem;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(ItemStack.class)
public abstract class ItemStackMixin {

    @Shadow public abstract Text getName();
    @Shadow public abstract Rarity getRarity();
    @Shadow public abstract Item getItem();

    @ModifyVariable(method = "getTooltip", at =  @At("STORE"), ordinal = 0)
    private MutableText getTooltip(MutableText m) {
        if (this.getItem() instanceof ModItem item) {
            return Text.empty().append(this.getName()).formatted(item.getModRarity().formatting);
        } else {
            return Text.empty().append(this.getName()).formatted(this.getRarity().formatting);
        }
    }
}
