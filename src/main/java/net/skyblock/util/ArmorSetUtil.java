package net.skyblock.util;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.skyblock.item.ModArmorMaterial;
import net.skyblock.effect.Ability;

import java.util.ArrayList;
import java.util.List;

public class ArmorSetUtil {
    public static void evaluateArmorEffects(PlayerEntity player) {
        List<ModArmorMaterial> materials = new ArrayList<>();

        for (ItemStack itemStack : player.getInventory().armor) {
            if (itemStack.getItem() instanceof ArmorItem armorItem) {
                ArmorMaterial material = armorItem.getMaterial();
                if (material instanceof ModArmorMaterial modMaterial) {
                    materials.add(modMaterial);
                }
            }
        }

        for (ModArmorMaterial material : materials) {
            boolean applyEffect = true;
            for (int i=0 ; i<4 ; i++) {
                if (material.requires(i)) {
                    Item item = player.getInventory().getArmorStack(i).getItem();
                    if (item instanceof ArmorItem armorItem) {
                        if (armorItem.getMaterial() != material) {
                            applyEffect = false;
                            break;
                        }
                    } else {
                        applyEffect = false;
                        break;
                    }
                }
            }
            if (applyEffect) {
                applyMaterialEffect(player, material);
            }
        }
    }

    private static void applyMaterialEffect(PlayerEntity player, ModArmorMaterial material) {
        for (Ability ability : material.getAbilities()) {
            ability.apply(player);
        }
    }
}
