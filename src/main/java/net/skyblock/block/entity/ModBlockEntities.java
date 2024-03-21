package net.skyblock.block.entity;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.skyblock.Skyblock;
import net.skyblock.block.ModBlocks;

public class ModBlockEntities {
    public static final BlockEntityType<RunicPedestalBlockEntity> RUNIC_PEDESTAL_BLOCK_ENTITY =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(Skyblock.MOD_ID, "runic_pedestal_be"),
                    FabricBlockEntityTypeBuilder.create(RunicPedestalBlockEntity::new, ModBlocks.RUNIC_PEDESTAL).build());

    public static void registerBlockEntities() {
        Skyblock.LOGGER.info("Registering Mod Block Entities for " + Skyblock.MOD_ID);
    }
}
