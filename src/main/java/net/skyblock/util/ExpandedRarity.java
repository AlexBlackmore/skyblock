package net.skyblock.util;

import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import net.minecraft.item.ItemStack;
import net.minecraft.network.codec.PacketCodec;
import net.minecraft.network.codec.PacketCodecs;
import net.minecraft.util.Formatting;
import net.minecraft.util.Rarity;
import net.minecraft.util.StringIdentifiable;
import net.minecraft.util.function.ValueLists;
import net.skyblock.component.ModDataComponentTypes;
import org.jetbrains.annotations.Nullable;

import java.util.function.IntFunction;

public interface ExpandedRarity {

    enum ModRarity implements StringIdentifiable {
        COMMON(0, "common", Formatting.WHITE),
        UNCOMMON(1,"uncommon",Formatting.YELLOW),
        RARE(2,"rare",Formatting.AQUA),
        EPIC(3, "epic", Formatting.LIGHT_PURPLE),
        LEGENDARY(4, "legendary", Formatting.GOLD),
        MYTHIC(5, "mythic", Formatting.DARK_PURPLE),
        DIVINE(6, "divine", Formatting.DARK_AQUA),
        SPECIAL(7, "special", Formatting.RED),
        ADMIN(8, "admin", Formatting.DARK_RED);

        private final int index;
        private final String name;
        private final Formatting formatting;

        ModRarity(final int index, final String name, final Formatting formatting) {
            this.index = index;
            this.name = name;
            this.formatting = formatting;
        }

        public Formatting getFormatting() {
            return this.formatting;
        }

        public int getIndex() {return index;}

        @Override
        public String asString() {
            return this.name;
        }
    }


//    static ModRarity getModRarity(int r) {
//        switch (r) {
//            case 1 -> {
//                return ModRarity.UNCOMMON;
//            }
//            case 2 -> {
//                return ModRarity.RARE;
//            }
//            case 3 -> {
//                return ModRarity.EPIC;
//            }
//            case 4 -> {
//                return ModRarity.LEGENDARY;
//            }
//            case 5 -> {
//                return ModRarity.MYTHIC;
//            }
//            case 6 -> {
//                return ModRarity.DIVINE;
//            }
//            case 7 -> {
//                return ModRarity.SPECIAL;
//            }
//            case 8 -> {
//                return ModRarity.ADMIN;
//            }
//            default -> {
//                return ModRarity.COMMON;
//            }
//        }
//    }

    static ModRarity convertRarity(Rarity rarity) {
        switch(rarity) {
            case COMMON -> {
                return ModRarity.COMMON;
            }
            case UNCOMMON -> {
                return ModRarity.UNCOMMON;
            }
            case RARE -> {
                return ModRarity.RARE;
            }
            default -> {
                return ModRarity.EPIC;
            }
        }
    }

    static Rarity getRarity(ModRarity rarity) {
        switch(rarity) {
            case COMMON -> {
                return Rarity.COMMON;
            }
            case UNCOMMON -> {
                return Rarity.UNCOMMON;
            }
            case RARE -> {
                return Rarity.RARE;
            }
            default -> {
                return Rarity.EPIC;
            }
        }
    }
}
