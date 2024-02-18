package net.skyblock.mixin;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(MobEntity.class)
public abstract class MobEntityMixin extends LivingEntity {

    protected MobEntityMixin(EntityType<? extends LivingEntity> entityType, World world) {
        super(entityType, world);
    }

    @Override
    public Text getName() {
        Text name = this.getCustomName();
        if (name == null) {
            name = this.getDefaultName();
        }

        Text health = Text.of(" ");
        health = health.copy().append(String.valueOf((int)this.getHealth())).append(Text.of("❤")).formatted(Formatting.RED);
        name = name.copy().append(health);

        return name;
    }
}
