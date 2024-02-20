package net.skyblock.util;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class Lore {
    public static void appendLore(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context, String loreKey) {
        for (int i=1 ; i<64 ; i++) {
            Text line = Text.translatable(loreKey + "." + i);
            if (line.getString().equals(loreKey + "." + i)) {
                if (i>1) {
                    tooltip.add(Text.literal(" "));
                }
                break;
            } else {
                tooltip.add(line);
            }
        }
    }
}
