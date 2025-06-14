package net.skyblock.util;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.registry.tag.EntityTypeTags;

import java.util.function.Predicate;

public class ModEntityPredicates {
    public static final Predicate<Entity> IS_UNDEAD = entity -> entity.getType().isIn(EntityTypeTags.UNDEAD);
}
