package net.skyblock.util;

import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import net.minecraft.network.codec.PacketCodec;
import net.minecraft.network.codec.PacketCodecs;
import net.minecraft.util.Formatting;
import net.minecraft.util.Rarity;
import net.minecraft.util.StringIdentifiable;
import net.minecraft.util.function.ValueLists;

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

        //    public static final Codec<net.minecraft.util.Rarity> CODEC = StringIdentifiable.createBasicCodec(net.minecraft.util.Rarity::values);
//    public static final IntFunction<net.minecraft.util.Rarity> ID_TO_VALUE = ValueLists.createIndexToValueFunction(
//            value -> value.index, values(), ValueLists.OutOfBoundsHandling.ZERO
//    );
//    public static final PacketCodec<ByteBuf, net.minecraft.util.Rarity> PACKET_CODEC = PacketCodecs.indexed(ID_TO_VALUE, value -> value.index);
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

        @Override
        public String asString() {
            return this.name;
        }
    }

    ModRarity getModRarity();

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
