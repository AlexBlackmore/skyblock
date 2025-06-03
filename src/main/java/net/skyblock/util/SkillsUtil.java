package net.skyblock.util;

import net.minecraft.block.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.server.command.CommandManager;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.math.BlockPos;
import net.skyblock.attribute.ModEntityAttributes;
import net.skyblock.block.ModBlocks;
import net.skyblock.block.ModOreBlock;
import org.jetbrains.annotations.Nullable;

import java.util.HashMap;
import java.util.Map;

public class SkillsUtil {
//    private static final Map<Block, Double> mining = new HashMap<>();
//    static {
//        mining.put(Blocks.COAL_ORE, 5.0);
//        mining.put(Blocks.IRON_ORE, 5.0);
//        mining.put(Blocks.GOLD_ORE, 6.0);
//        mining.put(Blocks.LAPIS_ORE, 7.0);
//        mining.put(Blocks.REDSTONE_ORE, 7.0);
//        mining.put(Blocks.EMERALD_ORE, 9.0);
//        mining.put(Blocks.DIAMOND_ORE, 10.0);
//        mining.put(ModBlocks.PURE_COAL, 20.0);
//        mining.put(ModBlocks.PURE_IRON, 20.0);
//        mining.put(ModBlocks.PURE_GOLD, 20.0);
//        mining.put(ModBlocks.PURE_LAPIS, 20.0);
//        mining.put(ModBlocks.PURE_REDSTONE, 20.0);
//        mining.put(ModBlocks.PURE_EMERALD, 20.0);
//        mining.put(ModBlocks.PURE_DIAMOND, 20.0);
//        mining.put(ModBlocks.PURE_QUARTZ, 20.0);
//    }

    public static void addExperience(ServerWorld server, BlockPos pos, BlockState state, PlayerEntity player) {
        @Nullable CommandManager commandManager = server.getServer().getCommandManager();
        if (commandManager != null) {
            //Checking that player does not have Silk Touch
            commandManager.executeWithPrefix(player.getCommandSource(server).withLevel(4),
                    "execute unless data entity @s SelectedItem.components.minecraft:enchantments.minecraft:silk_touch run tag @s add SUCCESS");
            if (player.getCommandTags().contains("SUCCESS")) {
                commandManager.executeWithPrefix(player.getCommandSource(server).withLevel(4),
                        "tag @s remove SUCCESS");

                int mining = SkillsUtil.getScaledXp(SkillsUtil.getMiningXp(state), player.getAttributeValue(ModEntityAttributes.MINING_WISDOM));
                int farming = SkillsUtil.getScaledXp(SkillsUtil.getFarmingXp(server, pos, state), player.getAttributeValue(ModEntityAttributes.FARMING_WISDOM));
                int foraging = SkillsUtil.getScaledXp(SkillsUtil.getForagingXp(state), player.getAttributeValue(ModEntityAttributes.FORAGING_WISDOM));

                if (mining > 0) {
                    commandManager.executeWithPrefix(player.getCommandSource(server).withLevel(4),
                            "scoreboard players add @s experience_mining " + mining);
                    commandManager.executeWithPrefix(player.getCommandSource(server).withLevel(4),
                            getXpCommand(mining, "mining"));
                    player.playSound(SoundEvent.of(SoundEvents.ENTITY_EXPERIENCE_ORB_PICKUP.id()));
                }
                if (farming > 0) {
                    commandManager.executeWithPrefix(player.getCommandSource(server).withLevel(4),
                            "scoreboard players add @s experience_farming " + farming);
                    commandManager.executeWithPrefix(player.getCommandSource(server).withLevel(4),
                            getXpCommand(farming, "farming"));
                    player.playSound(SoundEvent.of(SoundEvents.ENTITY_EXPERIENCE_ORB_PICKUP.id()));
                }
                if (foraging > 0) {
                    commandManager.executeWithPrefix(player.getCommandSource(server).withLevel(4),
                            "scoreboard players add @s experience_foraging " + foraging);
                    commandManager.executeWithPrefix(player.getCommandSource(server).withLevel(4),
                            getXpCommand(foraging, "foraging"));
                    player.playSound(SoundEvent.of(SoundEvents.ENTITY_EXPERIENCE_ORB_PICKUP.id()));
                }
            }
        }
    }

    private static String getXpCommand(int xp, String skill) {
        return "title @s actionbar {translate:hud.skyblock.xp,with:[\"" + xp + "\",{translate:advancements." + skill + ".title},{score:{name:\"@s\",objective:experience_" + skill + "}}],color:dark_aqua}";
    }

    public static int getScaledXp(double xp, double wisdom) {
        xp *= wisdom;
        if (Math.random() < (xp - Math.floor(xp))) {
            xp++;
        }
        return (int)xp;
    }

    public static double getMiningXp(BlockState state) {
        double xp = 0;
        Block block = state.getBlock();

        if (block instanceof ModOreBlock modBlock) {
            return modBlock.getMiningXp();
        } else if (state.isIn(BlockTags.BASE_STONE_NETHER) || block == Blocks.ICE) {
            xp = 0.5;
        } else if (state.isIn(BlockTags.STONE_ORE_REPLACEABLES) || state.isIn(ModTags.Blocks.GRAVEL) || block == Blocks.COBBLESTONE) {
            xp = 1;
        } else if (state.isIn(BlockTags.DEEPSLATE_ORE_REPLACEABLES)) {
            xp = 1.5;
        } else if (state.isIn(BlockTags.SAND) || block == Blocks.END_STONE || block == Blocks.MYCELIUM) {
            xp = 3;
        } else if (block == Blocks.PACKED_ICE) {
            xp = 4.5;
        } else if (state.isIn(BlockTags.COAL_ORES) || state.isIn(BlockTags.IRON_ORES) || state.isIn(BlockTags.COPPER_ORES) || block == Blocks.NETHER_QUARTZ_ORE || block == Blocks.NETHER_GOLD_ORE) {
            xp = 5;
        } else if (state.isIn(BlockTags.GOLD_ORES)) {
            xp = 6;
        } else if (state.isIn(BlockTags.LAPIS_ORES) || state.isIn(BlockTags.REDSTONE_ORES) || block == Blocks.GLOWSTONE) {
            xp = 7;
        } else if (state.isIn(BlockTags.EMERALD_ORES)) {
            xp = 9;
        } else if (state.isIn(BlockTags.DIAMOND_ORES)) {
            xp = 10;
        } else if (block == Blocks.OBSIDIAN) {
            xp = 20;
        } else if (block == Blocks.BLUE_ICE) {
            xp = 40.5;
        }

        if (state.isIn(ModTags.Blocks.DEEPSLATE_ORES)) {
            xp *= 1.5;
        }

        return xp;
    }

    public static double getFarmingXp(ServerWorld server, BlockPos pos, BlockState state) {
        Block block = state.getBlock();
        double xp = 0;

        if (block instanceof CropBlock crop) {
            if (crop.getAge(state) == crop.getMaxAge()) {
                xp = 4;
            }
        } else if (block instanceof SugarCaneBlock sugarCane) {
            BlockPos upPos = pos.up();
            while (server.getBlockState(upPos).getBlock() == Blocks.SUGAR_CANE) {
                xp += 2;
                upPos = upPos.up();
            }
            if (xp > 0) {
                xp += 2;
            }
        } else if (block instanceof NetherWartBlock netherWart) {
            if (state.get(NetherWartBlock.AGE) == NetherWartBlock.MAX_AGE) {
                xp = 4;
            }
        } else if (block instanceof CactusBlock cactus) {
            BlockPos upPos = pos.up();
            while (server.getBlockState(upPos).getBlock() == Blocks.CACTUS) {
                xp += 2;
                upPos = upPos.up();
            }
            if (xp > 0) {
                xp += 2;
            }
        } else if (block instanceof CocoaBlock cocoa) {
            if (state.get(CocoaBlock.AGE) == CocoaBlock.MAX_AGE) {
                xp = 4;
            }
        } else if (state.isIn(ModTags.Blocks.MUSHROOMS)) {
            xp = 6;
        } else if (state.isIn(ModTags.Blocks.MUSHROOM_BLOCKS)) {
            xp = 2;
        }

        return xp;
    }

    public static int getForagingXp(BlockState state) {
        if (!state.isIn(ModTags.Blocks.GIVES_FORAGING_XP)){
            return 0;
        } else if (state.isIn(BlockTags.FLOWERS)) {
            return 1;
        } else {
            return 6;
        }
    }
}
