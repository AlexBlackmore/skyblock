package net.skyblock.mixin;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.decoration.DisplayEntity;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.stat.Stats;
import net.minecraft.world.World;
import net.minecraft.world.event.GameEvent;
import net.skyblock.util.DamageUtil;
import org.apache.logging.log4j.core.jmx.Server;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(LivingEntity.class)
public abstract class LivingEntityMixin extends Entity {

    public LivingEntityMixin(EntityType<?> type, World world) {
        super(type, world);
    }

    @Inject(method = "applyDamage", at = @At("HEAD"))
    protected void applyDamage(DamageSource source, float amount, CallbackInfo ci) {
        if (this.getWorld() instanceof ServerWorld server) {
            if (this.isInvulnerableTo(source)) {
                return;
            }
            amount = this.applyArmorToDamage(source, amount);
            float f = amount = this.modifyAppliedDamage(source, amount);

            DamageUtil.spawnDamageIndicator(server, this.getPos().add(0, this.getHeight(), 0), source, amount);
        }
    }
    @Shadow
    protected abstract float modifyAppliedDamage(DamageSource source, float amount);
    @Shadow
    protected abstract float applyArmorToDamage(DamageSource source, float amount);

}
