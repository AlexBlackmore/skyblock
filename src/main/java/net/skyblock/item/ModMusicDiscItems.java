package net.skyblock.item;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.skyblock.Skyblock;
import net.skyblock.sound.ModSounds;
import net.skyblock.util.ModRarity;

public class ModMusicDiscItems {
    public static final Item SPOOKY_DISC = registerItem("spooky_disc", new ModMusicDiscItem("spooky_disc", 1, ModSounds.HALLOW_HALLOW, 237, ModRarity.RARE));
    public static final Item BATTLE_DISC = registerItem("battle_disc", new ModMusicDiscItem("battle_disc", 2, ModSounds.BLAST_IN_BANTER_BATTLE, 170, ModRarity.RARE));
    public static final Item WINTER_DISC = registerItem("winter_disc", new ModMusicDiscItem("winter_disc", 3, ModSounds.LET_THEM_EAT_CAKE, 208, ModRarity.RARE));
    public static final Item DUNGEON_DISC = registerItem("dungeon_disc", new ModMusicDiscItem("dungeon_disc", 4, ModSounds.DUNGEON_DRAMA, 157, ModRarity.EPIC));
    public static final Item CLOWN_DISC = registerItem("clown_disc", new ModMusicDiscItem("clown_disc", 5, ModSounds.SUPERIOR_JUDGEMENT, 107, ModRarity.EPIC));
    public static final Item WATCHER_DISC = registerItem("watcher_disc", new ModMusicDiscItem("watcher_disc", 6, ModSounds.THE_WATCHER, 239, ModRarity.EPIC));
    public static final Item NECRON_DISC = registerItem("necron_disc", new ModMusicDiscItem("necron_disc", 7, ModSounds.NECRON_DOOM, 148, ModRarity.EPIC));
    public static final Item OLD_DISC  = registerItem("old_disc", new ModMusicDiscItem("old_disc", 8, ModSounds.THE_WITHER_KING, 350, ModRarity.LEGENDARY));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Skyblock.MOD_ID, name), item);
    }
    public static void registerModMusicDiscItems() {
        Skyblock.LOGGER.info("Registering Mod Music Disc Items for " + Skyblock.MOD_ID);
    }
}
