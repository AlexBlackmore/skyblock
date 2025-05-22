package net.skyblock.mixin;

import net.minecraft.client.gui.hud.InGameHud;
import net.minecraft.text.MutableText;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin(InGameHud.class)
public class InGameHudMixin {

    //TODO: figure out how to implement expanded rarities into hotbar
    //Currently makes all item names appear white above hotbar, for consistancy since implementing expanded rarity in this case would be difficult
    @ModifyArg(method = "renderHeldItemTooltip(Lnet/minecraft/client/gui/DrawContext;)V", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/DrawContext;drawTextWithBackground(Lnet/minecraft/client/font/TextRenderer;Lnet/minecraft/text/Text;IIII)I"), index = 1)
    private Text injected(Text text) {
        return text.copy().formatted(Formatting.WHITE);
    }
}
