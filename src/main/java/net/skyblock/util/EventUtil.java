package net.skyblock.util;
import net.fabricmc.fabric.api.event.player.AttackBlockCallback;
import net.minecraft.block.Blocks;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.util.ActionResult;
import net.skyblock.item.ModTools;

public class EventUtil {

    public static void registerEvents() {
        AttackBlockCallback.EVENT.register((player, world, hand, pos, direction) -> {
            if (!world.isClient()) { // Only run on the server
                if (world.getBlockState(pos).getBlock() == Blocks.CACTUS && player.getMainHandStack().getItem() == ModTools.CACTUS_KNIFE) {
//                    player.sendMessage(Text.literal("Attacking cactus with cactuc knife"), false);
                    world.breakBlock(pos, true, player);
                    player.getWeaponStack().damage(1, player, EquipmentSlot.MAINHAND);
                }
            }
            return ActionResult.PASS;
        });

    }
}
