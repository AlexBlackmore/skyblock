package net.skyblock.screen;

import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;
import net.skyblock.Skyblock;


public class ModScreenHandlers {
    public static final ScreenHandlerType<RunicPedestalScreenHandler> RUNIC_PEDESTAL_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, new Identifier(Skyblock.MOD_ID, "runecrafting"),
                    new ExtendedScreenHandlerType<>(RunicPedestalScreenHandler::new));

    public static void registerScreenHandlers() {
        Skyblock.LOGGER.info("Registering Screen Handlers for " + Skyblock.MOD_ID);

        Skyblock.LOGGER.info("Registering Menu Items for " + Skyblock.MOD_ID);
        RunicPedestalScreenHandler.registerItems();
    }

}
