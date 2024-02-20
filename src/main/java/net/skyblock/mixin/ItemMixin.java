package net.skyblock.mixin;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Rarity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(Item.class)
public class ItemMixin {
    private Rarity rarity;

    /**
     * @author unreal
     * @reason removed enchantment coloring
     */
    @Overwrite
    public Rarity getRarity(ItemStack stack) {
        return this.rarity;
    }
}
