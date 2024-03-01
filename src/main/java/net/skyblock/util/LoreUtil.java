package net.skyblock.util;

import net.minecraft.text.MutableText;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableTextContent;
import net.minecraft.util.Formatting;
import net.skyblock.effect.Ability;
import net.skyblock.item.ModItem;

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
    public static void appendLore(List<Text> tooltip, ModItemInterface item) {
        for (int i=1 ; i<64 ; i++) {
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
    public static void appendLore(List<Text> tooltip, Ability ability) {
        if (ability.fullSetBonus) {
            tooltip.add(Text.translatable("lore.skyblock.full_set_bonus", Text.translatable(ability.getLoreKey())).formatted(Formatting.GOLD));
        }
        for (int i=1 ; i<64 ; i++) {
            MutableText line = MutableText.of(new TranslatableTextContent(ability.getLoreKey() + "." + i, null, ability.getLoreArgs(i).toArray()));
            if (line.getString().equals(ability.getLoreKey() + "." + i)) {
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
