package net.skyblock;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.JsonKeySortOrderCallback;
import net.minecraft.registry.RegistryBuilder;
import net.skyblock.datagen.ModBlockTagProvider;
import net.skyblock.datagen.ModItemTagProvider;
import net.skyblock.datagen.ModModelProvider;
import org.jetbrains.annotations.Nullable;

public class SkyblockDataGenerator implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

        pack.addProvider(ModBlockTagProvider::new);
        pack.addProvider(ModItemTagProvider::new);
        pack.addProvider(ModModelProvider::new);
    }
}
