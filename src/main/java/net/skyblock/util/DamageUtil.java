package net.skyblock.util;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.damage.DamageType;
import net.minecraft.entity.damage.DamageTypes;
import net.minecraft.entity.decoration.DisplayEntity;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.text.Text;
import net.minecraft.util.math.Vec3d;

public class DamageUtil {
    public static void spawnDamageIndicator(ServerWorld world, Vec3d pos, DamageSource source, float amount) {
        DisplayEntity.TextDisplayEntity display = new DisplayEntity.TextDisplayEntity(EntityType.TEXT_DISPLAY, world);
        display.setPos(pos.getX() + (Math.random()*2) - 1, pos.getY() + (Math.random()*2) - 1, pos.getZ() + (Math.random()*2) - 1);
        NbtCompound nbt = display.writeNbt(new NbtCompound());

        nbt.putBoolean("shadow", true);
        nbt.putInt("background", 0);
        nbt.putString("billboard", "center");
        nbt.putInt("PortalCooldown", 20);

        String json = FormattingUtil.formatNumber((int) amount);

        if (source.isOf(DamageTypes.OUT_OF_WORLD) || source.isOf(DamageTypes.OUTSIDE_BORDER)) { json = "§0" + json; } //black
        else if (source.isOf(DamageTypes.FREEZE)) { json = "§0" + json; } //dark_blue
//        else if (source.isOf(DamageTypes.GENERIC)) { json = "§0" + json; } //dark_green
        else if (source.isOf(DamageTypes.MAGIC) || source.isOf(DamageTypes.INDIRECT_MAGIC)) { json = "§0" + json; } //dark_aqua
        else if (source.isOf(DamageTypes.LAVA)) { json = "§0" + json; } //dark_red
        else if (source.isOf(DamageTypes.WITHER) || source.isOf(DamageTypes.WITHER_SKULL)) { json = "§0" + json; } //dark_purple
        else if (source.isOf(DamageTypes.ON_FIRE) || source.isOf(DamageTypes.IN_FIRE)) { json = "§6" + json; } //gold
        else if (source.isOf(DamageTypes.MOB_PROJECTILE)) { json = "§7" + json; } //gray
        else if (source.isOf(DamageTypes.FALL)) { json = "§8" + json; } //dark_gray
//        else if (source.isOf(DamageTypes.GENERIC)) { json = "§0" + json; } //blue
        else if (source.isOf(DamageTypes.STARVE)) { json = "§0" + json; } //green
        else if (source.isOf(DamageTypes.DROWN)) { json = "§b" + json; } //aqua
        else if (source.isOf(DamageTypes.EXPLOSION)) { json = "§7" + json; } //red
        else if (source.isOf(DamageTypes.DRAGON_BREATH)) { json = "§7" + json; } //light_purple
        else if (source.isOf(DamageTypes.LIGHTNING_BOLT)) { json = "§7" + json; } //yellow
        else { json = "§f" + json; } //white

        json = "{\"text\":\"" + json + "\"}";
        nbt.putString("text", json);

        display.readNbt(nbt);
        world.spawnEntity(display);
    }
}
