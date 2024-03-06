package net.skyblock.sound;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.skyblock.Skyblock;

public class ModSounds {
    public static final SoundEvent BLAST_IN_BANTER_BATTLE = registerSoundEvent("blast_in_banter_battle");
    public static final SoundEvent DUNGEON_DRAMA = registerSoundEvent("dungeon_drama");
    public static final SoundEvent HALLOW_HALLOW = registerSoundEvent("hallow_hallow");
    public static final SoundEvent LET_THEM_EAT_CAKE = registerSoundEvent("let_them_eat_cake");
    public static final SoundEvent NECRON_DOOM = registerSoundEvent("necron_doom");
    public static final SoundEvent SUPERIOR_JUDGEMENT = registerSoundEvent("superior_judgement");
    public static final SoundEvent THE_WATCHER = registerSoundEvent("the_watcher");
    public static final SoundEvent THE_WITHER_KING = registerSoundEvent("the_wither_king");

    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(Skyblock.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }
    public static void registerSounds() {
        Skyblock.LOGGER.info("Registering Mod Sounds for " + Skyblock.MOD_ID);
    }
}
