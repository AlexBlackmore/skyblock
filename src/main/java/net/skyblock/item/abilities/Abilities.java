package net.skyblock.item.abilities;

import net.skyblock.Skyblock;

public class Abilities {
    public static final Ability BONUS_SPEED = new BonusSpeed();
    public static final Ability FARMER_AURA = new FarmerAura();

    public static void registerAbilities() {
        Skyblock.LOGGER.info("Registering Abilities for " + Skyblock.MOD_ID);
    }
}
