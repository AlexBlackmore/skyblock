package net.skyblock;

import net.skyblock.block.ModBlocks;
import net.skyblock.block.entity.ModBlockEntities;
import net.skyblock.effect.ModStatusEffects;
import net.skyblock.enchantment.ModEnchantments;
import net.skyblock.item.ModItem;
import net.skyblock.item.ModItemGroups;
import net.skyblock.item.ModItems;
import net.fabricmc.api.ModInitializer;

import net.skyblock.item.ModPotions;
import net.skyblock.screen.ModScreenHandlers;
import net.skyblock.sound.ModSounds;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Skyblock implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final String MOD_ID = "skyblock";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		ModItems.registerModItems();
		ModItemGroups.registerItemGroups();
		ModBlocks.registerModBlocks();
		ModStatusEffects.registerStatusEffects();
		ModEnchantments.registerModEnchantments();
		ModPotions.registerPotions();
		ModSounds.registerSounds();

		ModBlockEntities.registerBlockEntities();
		ModScreenHandlers.registerScreenHandlers();

	}
}