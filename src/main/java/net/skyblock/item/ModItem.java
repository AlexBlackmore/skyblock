package net.skyblock.item;

import net.minecraft.block.BlockState;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.LoreComponent;
import net.minecraft.component.type.TooltipDisplayComponent;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.skyblock.Skyblock;
import net.skyblock.ability.Ability;
import net.skyblock.component.ModDataComponentTypes;
import net.skyblock.util.ExpandedRarity;
import org.jetbrains.annotations.Nullable;

import java.util.function.Consumer;

public class ModItem extends Item implements ExpandedRarity {
    public Ability[] abilities = {};

    public ModItem(Settings settings, ModRarity rarity) {
        super(settings.rarity(ExpandedRarity.getRarity(rarity)).component(ModDataComponentTypes.MOD_RARITY, rarity.getIndex()));
    }

    public ModItem(String name, ModRarity rarity, int loreLines) {
        super(new Item.Settings()
                .rarity(ExpandedRarity.getRarity(rarity)).component(ModDataComponentTypes.MOD_RARITY, rarity.getIndex())
                .component(DataComponentTypes.LORE, new LoreComponent(ModItems.getLoreList(name,loreLines)))
                .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Skyblock.MOD_ID,name))));
    }

    public ModItem(Settings settings, ModRarity rarity, Ability[] abilities) {
        super(settings.rarity(ExpandedRarity.getRarity(rarity)).component(ModDataComponentTypes.MOD_RARITY, rarity.getIndex()));
        this.abilities = abilities;
    }

//    @Override
//    public ItemStack getDefaultStack() {
//        ItemStack stack = super.getDefaultStack();
//        stack.set(ModDataComponentTypes.MOD_RARITY, this.modRarity.getIndex());
//        return stack;
//    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        ActionResult a = ActionResult.PASS;
        ActionResult b;
        for (Ability ability : this.abilities) {
            b = ability.useOnBlock(context);
            if (a != b) {
                a = b;
            }
        }
        return a;
    }

    @Override
    public boolean postMine(ItemStack stack, World world, BlockState state, BlockPos pos, LivingEntity miner) {
        for (Ability ability : this.abilities) {
            ability.postMine(stack, world, state, pos, miner);
        }
        return super.postMine(stack, world, state, pos, miner);
    }

    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, TooltipDisplayComponent displayComponent, Consumer<Text> textConsumer, TooltipType type) {
        for (Ability ability : abilities) {
            ability.appendTooltip(stack, textConsumer);
        }
        if (abilities.length > 0 && stack.hasEnchantments()) {
            textConsumer.accept(Text.literal(""));
        }
    }

    @Override
    public float getMiningSpeed(ItemStack stack, BlockState state) {
        float miningSpeed = super.getMiningSpeed(stack, state);
        for (Ability ability : abilities) {
            miningSpeed += ability.getMiningSpeed(stack, state);
        }
        return miningSpeed;
    }

    public static ModRarity getModRarity(ItemStack stack) {
        @Nullable Integer rarity = stack.get(ModDataComponentTypes.MOD_RARITY);

        if (rarity != null) {
            return ModRarity.values()[(rarity < 8 ? rarity : 8)];
        } else {
            return ModRarity.ADMIN;
        }
    }
}
