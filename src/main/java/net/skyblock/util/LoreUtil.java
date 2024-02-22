package net.skyblock.util;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemStack;
import net.minecraft.text.MutableText;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableTextContent;
import net.minecraft.world.World;
import net.skyblock.item.ModItem;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class LoreUtil {
    public static void appendLore(List<Text> tooltip, ModItem item) {
        for (int i=1 ; i<64 ; i++) {
//            Text line = Text.translatable(item.getLoreKey() + "." + i);
            MutableText line = MutableText.of(new TranslatableTextContent(item.getLoreKey() + "." + i, null, item.getLoreArgs(i).toArray()));
            if (line.getString().equals(item.getLoreKey() + "." + i)) {
                if (i>1) {
                    tooltip.add(Text.literal(" "));
                }
                break;
            } else {
                tooltip.add(line);
            }
        }
    }

    public static void appendLore(List<Text> tooltip, String loreKey) {
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
