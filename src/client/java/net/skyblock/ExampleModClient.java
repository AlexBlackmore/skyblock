package net.skyblock;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.minecraft.client.render.RenderLayer;
import net.skyblock.block.ModBlocks;
import net.skyblock.screen.ModScreenHandlers;
import net.skyblock.screen.RunicPedestalScreen;

public class ExampleModClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		HandledScreens.register(ModScreenHandlers.RUNIC_PEDESTAL_SCREEN_HANDLER, RunicPedestalScreen::new);

		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CENTURY_CAKE_PINK, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CENTURY_CAKE_RED, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CENTURY_CAKE_ORANGE, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CENTURY_CAKE_YELLOW, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CENTURY_CAKE_LIME, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CENTURY_CAKE_AQUA, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CENTURY_CAKE_BLUE, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CENTURY_CAKE_MAGENTA, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CENTURY_CAKE_BLACK, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CENTURY_CAKE_BROWN, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CENTURY_CAKE_WHITE, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CENTURY_CAKE_CYAN, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CENTURY_CAKE_GREEN, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CENTURY_CAKE_GRAY, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.RUNIC_PEDESTAL, RenderLayer.getTranslucent());
	}
}