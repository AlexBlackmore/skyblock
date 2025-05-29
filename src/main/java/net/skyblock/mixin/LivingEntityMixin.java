package net.skyblock.mixin;

import net.minecraft.entity.Attackable;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.damage.DamageTypes;
import net.minecraft.entity.decoration.DisplayEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import net.skyblock.attribute.ModEntityAttributes;
import net.skyblock.util.FormattingUtil;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.Random;

@Mixin(LivingEntity.class)
public abstract class LivingEntityMixin extends Entity implements Attackable {

    protected LivingEntityMixin(EntityType<?> type, World world) {
        super(type, world);
    }

    @ModifyArg(method = "damage(Lnet/minecraft/server/world/ServerWorld;Lnet/minecraft/entity/damage/DamageSource;F)Z", at = @At(value = "INVOKE", target = "Lnet/minecraft/entity/LivingEntity;applyDamage(Lnet/minecraft/server/world/ServerWorld;Lnet/minecraft/entity/damage/DamageSource;F)V"), index = 2)
    private float injected(ServerWorld world, DamageSource source, float amount) {
        if (source.getAttacker() instanceof PlayerEntity player) {
            if (Math.random() < player.getAttributeValue(ModEntityAttributes.CRIT_CHANCE)) {
                player.addCommandTag("CRIT");
                return  amount * (float)(1.0f + player.getAttributeValue(ModEntityAttributes.CRIT_DAMAGE));
            }
        }
        return amount;
    }


    @Inject(method = "applyDamage(Lnet/minecraft/server/world/ServerWorld;Lnet/minecraft/entity/damage/DamageSource;F)V", at = @At("HEAD"))
    protected void inject(ServerWorld world, DamageSource source, float amount, CallbackInfo info){
        LivingEntity livingEntity = (LivingEntity)(Object)this;
        Text damage = Text.literal(FormattingUtil.commaSeparateInt((int)amount)).formatted(getFormatting(source));
        if (source.getAttacker() instanceof PlayerEntity player) {
            if (player.getCommandTags().contains("CRIT")) {
                damage = Text.literal("✧").formatted(getRandomCritFormatting());
                for (char c : FormattingUtil.commaSeparateInt((int)amount).toCharArray()) {
                     damage = damage.copy().append(Text.literal(String.valueOf(c)).formatted(getRandomCritFormatting()));
                }
                damage = damage.copy().append(Text.literal("✧").formatted(getRandomCritFormatting()));
                player.addCritParticles(this);
                player.removeCommandTag("CRIT");
            }
        }

        DisplayEntity.TextDisplayEntity text = new DisplayEntity.TextDisplayEntity(EntityType.TEXT_DISPLAY,world);
        text.setText(damage);
        text.setBackground(0);
        text.setBillboardMode(DisplayEntity.BillboardMode.CENTER);
        text.setPosition(livingEntity.getX() + (Math.random() - 0.5),livingEntity.getY() + livingEntity.getHeight() + (Math.random()- 0.5), livingEntity.getZ() + (Math.random() - 0.5));
        text.addCommandTag("DamageIndicator20");
        world.spawnEntity(text);
    }

    @Unique
    private Formatting getFormatting (DamageSource source) {
        if (source.isOf(DamageTypes.OUT_OF_WORLD) || source.isOf(DamageTypes.CRAMMING) || source.isOf(DamageTypes.IN_WALL) || source.isOf(DamageTypes.OUTSIDE_BORDER)) return Formatting.BLACK;
        else if (source.isOf(DamageTypes.FREEZE) ) return Formatting.DARK_BLUE;
        else if (source.isOf(DamageTypes.CACTUS) || source.isOf(DamageTypes.THORNS) || source.isOf(DamageTypes.SWEET_BERRY_BUSH) || source.isOf(DamageTypes.STING)) return Formatting.DARK_GREEN;
        else if (source.isOf(DamageTypes.ENDER_PEARL) || source.isOf(DamageTypes.SONIC_BOOM)) return Formatting.DARK_AQUA;
        else if (source.isOf(DamageTypes.LAVA) || source.isOf(DamageTypes.INDIRECT_MAGIC)) return Formatting.DARK_RED;
        else if (source.isOf(DamageTypes.WITHER) || source.isOf(DamageTypes.WITHER_SKULL)) return Formatting.DARK_PURPLE;
        else if (source.isOf(DamageTypes.ON_FIRE) || source.isOf(DamageTypes.HOT_FLOOR) || source.isOf(DamageTypes.DRY_OUT) || source.isOf(DamageTypes.FIREBALL) || source.isOf(DamageTypes.UNATTRIBUTED_FIREBALL)) return Formatting.GOLD;
        else if (source.isOf(DamageTypes.FALL) || source.isOf(DamageTypes.FALLING_ANVIL) || source.isOf(DamageTypes.FALLING_BLOCK) || source.isOf(DamageTypes.FALLING_STALACTITE) || source.isOf(DamageTypes.FLY_INTO_WALL) || source.isOf(DamageTypes.MACE_SMASH) || source.isOf(DamageTypes.STALAGMITE)) return Formatting.DARK_GRAY;
        else if (source.isOf(DamageTypes.ARROW) || source.isOf(DamageTypes.MOB_PROJECTILE) || source.isOf(DamageTypes.SPIT) || source.isOf(DamageTypes.THROWN) || source.isOf(DamageTypes.TRIDENT)) return Formatting.GRAY;
        else if (source.isOf(DamageTypes.DROWN)) return Formatting.BLUE;
        else if (source.isOf(DamageTypes.STARVE)) return Formatting.GREEN;
        else if (source.isOf(DamageTypes.MAGIC)) return Formatting.AQUA;
        else if (source.isOf(DamageTypes.IN_FIRE) || source.isOf(DamageTypes.CAMPFIRE)) return Formatting.RED;
        else if (source.isOf(DamageTypes.DRAGON_BREATH)) return Formatting.LIGHT_PURPLE;
        else if (source.isOf(DamageTypes.LIGHTNING_BOLT) || source.isOf(DamageTypes.FIREWORKS) || source.isOf(DamageTypes.EXPLOSION) || source.isOf(DamageTypes.BAD_RESPAWN_POINT)) return Formatting.YELLOW;
        else if (source.isOf(DamageTypes.WIND_CHARGE)) return Formatting.ITALIC;
            //source.isOf(DamageTypes.MOB_ATTACK_NO_AGRO)
            // source.isOf(DamageTypes.MOB_ATTACK)
            // source.isOf(DamageTypes.PLAYER_ATTACK)
            // source.isOf(DamageTypes.PLAYER_EXPLOSION)
            //source.isOf(DamageTypes.GENERIC_KILL)
            //source.isOf(DamageTypes.GENERIC)
        else return Formatting.WHITE;
    }

    @Unique
    private Formatting getRandomCritFormatting() {
        switch(new Random().nextInt(4)) {
            case 0 -> {
                return Formatting.RED;
            }
            case 1 -> {
                return Formatting.YELLOW;
            }
            case 2 -> {
                return Formatting.GOLD;
            }
            default -> {
                return Formatting.WHITE;
            }
        }
    }

//    @Override
//    protected void initDataTracker(DataTracker.Builder builder) {
//
//    }
//
//    @Override
//    public boolean damage(ServerWorld world, DamageSource source, float amount) {
//        return false;
//    }
//
//    @Override
//    protected void readCustomDataFromNbt(NbtCompound nbt) {
//
//    }
//
//    @Override
//    protected void writeCustomDataToNbt(NbtCompound nbt) {
//
//    }
//
//    @Nullable
//    @Override
//    public LivingEntity getLastAttacker() {
//        return null;
//    }
}
