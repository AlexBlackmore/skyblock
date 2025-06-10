package net.skyblock;

import net.fabricmc.api.ModInitializer;

import net.skyblock.attribute.ModEntityAttributes;
import net.skyblock.block.ModBlocks;
import net.skyblock.component.ModDataComponentTypes;
import net.skyblock.effect.ModEffects;
import net.skyblock.item.ModItemGroups;
import net.skyblock.item.ModItems;
import net.skyblock.util.EventUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Skyblock implements ModInitializer {
	public static final String MOD_ID = "skyblock";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModEntityAttributes.registerEntityAttributes();
		ModBlocks.registerModBlocks();
		ModItems.registerModItems();
		ModEffects.registerEffects();

		EventUtil.registerEvents();
		ModDataComponentTypes.registerDataComponentTypes();

	}
}