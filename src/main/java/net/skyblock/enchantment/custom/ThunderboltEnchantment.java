package net.skyblock.enchantment.custom;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.*;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.skyblock.enchantment.ModEnchantment;

public class ThunderboltEnchantment extends ModEnchantment {
    public ThunderboltEnchantment(Rarity weight, EnchantmentTarget type, EquipmentSlot... slotTypes) {
        super(weight, type, slotTypes);
    }

    @Override
    public void onTargetDamaged(LivingEntity user, Entity target, int level) {
        if(!user.getWorld().isClient()) {
            ServerWorld world = (ServerWorld) user.getWorld();
            BlockPos position = target.getBlockPos();

            if (level==1) {
                EntityType.LIGHTNING_BOLT.spawn(world, null, null, position, SpawnReason.TRIGGERED, true, true);
            }
        }
    }

    @Override
    public int getTrueMaxLevel() {
        return 6;
    }
}
