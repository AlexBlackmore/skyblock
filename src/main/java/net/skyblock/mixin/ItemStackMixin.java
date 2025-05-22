package net.skyblock.mixin;

import net.fabricmc.fabric.api.item.v1.FabricItemStack;
import net.minecraft.component.ComponentHolder;
import net.minecraft.component.ComponentMap;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.item.ItemStack;
import net.minecraft.text.HoverEvent;
import net.minecraft.text.MutableText;
import net.minecraft.text.Text;
import net.minecraft.text.Texts;
import net.minecraft.util.Formatting;
import net.minecraft.util.Rarity;
import net.skyblock.util.ExpandedRarity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ItemStack.class)
public abstract class ItemStackMixin implements ComponentHolder, FabricItemStack {

    /**
     * @author unreal
     * @reason removed rarity increase after enchanting
     */
    @Overwrite
    public Rarity getRarity() {
        ItemStack stack = (ItemStack)(Object)this;
//        if (!this.hasEnchantments()) {
//            return rarity;
//        } else {
//            return switch (rarity) {
//                case COMMON, UNCOMMON -> Rarity.RARE;
//                case RARE -> Rarity.EPIC;
//                default -> rarity;
//            };
//        }
        return stack.getOrDefault(DataComponentTypes.RARITY, Rarity.COMMON);
    }

    /**
     * @author unreal
     * @reason added expanded rarity
     */
    @Overwrite
    public Text getFormattedName() {
        ItemStack stack = (ItemStack)(Object)this;
        MutableText mutableText = Text.empty();
        if (stack.getItem() instanceof ExpandedRarity modItem && stack.getRarity()==Rarity.EPIC) {
            mutableText = mutableText.append(stack.getName()).formatted(modItem.getModRarity().getFormatting());
        } else {
            mutableText = mutableText.append(stack.getName()).formatted(stack.getRarity().getFormatting());
        }

        if (this.contains(DataComponentTypes.CUSTOM_NAME)) {
            mutableText.formatted(Formatting.ITALIC);
        }

        return mutableText;
    }

    /**
     * @author unreal
     * @reason added expanded rarity
     */
    @Overwrite
    public Text toHoverableText() {
        ItemStack stack = (ItemStack)(Object)this;
        MutableText mutableText = Text.empty().append(stack.getName());
        if (this.contains(DataComponentTypes.CUSTOM_NAME)) {
            mutableText.formatted(Formatting.ITALIC);
        }

        MutableText mutableText2 = Texts.bracketed(mutableText);
        if (!stack.isEmpty()) {
            if (stack.getItem() instanceof ExpandedRarity modItem && stack.getRarity()==Rarity.EPIC) {
                mutableText2.formatted(modItem.getModRarity().getFormatting()).styled(style -> style.withHoverEvent(new HoverEvent.ShowItem(stack)));
            } else {
                mutableText2.formatted(stack.getRarity().getFormatting()).styled(style -> style.withHoverEvent(new HoverEvent.ShowItem(stack)));
            }
        }

        return mutableText2;
    }

    @Shadow abstract Text getName();
}
