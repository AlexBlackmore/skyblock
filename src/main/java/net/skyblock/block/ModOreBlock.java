package net.skyblock.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.skyblock.Skyblock;

public class ModOreBlock extends ExperienceDroppingBlock {
    private final int miningXp;

    public ModOreBlock(String name, Block block, float strength) {
        super(UniformIntProvider.create(0, 0), AbstractBlock.Settings.copy(block).strength(strength).requiresTool().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Skyblock.MOD_ID,name))));
        this.miningXp = 0;
    }
    public ModOreBlock(String name, Block block, float strength, int min, int max, int miningXp) {
        super(UniformIntProvider.create(min, max), AbstractBlock.Settings.copy(block).strength(strength).requiresTool().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Skyblock.MOD_ID,name))));
        this.miningXp = miningXp;
    }

    public int getMiningXp() {
        return this.miningXp;
    }
}
