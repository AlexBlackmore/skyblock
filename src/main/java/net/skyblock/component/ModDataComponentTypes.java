package net.skyblock.component;

import net.minecraft.component.ComponentType;
import net.minecraft.network.codec.PacketCodecs;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.dynamic.Codecs;
import net.skyblock.Skyblock;

import java.util.function.UnaryOperator;

public class ModDataComponentTypes {

    //TODO figure out how to create a custom data component type that can implement the TooltipAppender interface
    public static final ComponentType<Integer> BLOCKS_BROKEN = register("blocks_broken", builder -> builder.codec(Codecs.POSITIVE_INT).packetCodec(PacketCodecs.VAR_INT));
    public static final ComponentType<Integer> COMPACT = register("compact", builder -> builder.codec(Codecs.POSITIVE_INT).packetCodec(PacketCodecs.VAR_INT));
    public static final ComponentType<Integer> MATHEMATICAL_HOE = register("mathematical_hoe", builder -> builder.codec(Codecs.POSITIVE_INT).packetCodec(PacketCodecs.VAR_INT));


    private static <T>ComponentType<T> register(String name, UnaryOperator<ComponentType.Builder<T>> builderOperator) {
        return Registry.register(Registries.DATA_COMPONENT_TYPE, Identifier.of(Skyblock.MOD_ID, name), builderOperator.apply(ComponentType.builder()).build());
    }
    public static void registerDataComponentTypes() {
        Skyblock.LOGGER.info("Registering Data Component Types for " + Skyblock.MOD_ID);
    }
}
