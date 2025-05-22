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
import net.skyblock.util.ExpandedRarity;

import java.util.function.Consumer;

public class ModItem extends Item implements ExpandedRarity {
    public ModRarity modRarity;
    public Ability[] abilities = {};

    public ModItem(Settings settings) {
        super(settings);
         this.modRarity = ExpandedRarity.convertRarity(this.getDefaultStack().getRarity());
    }

    public ModItem(String name, ModRarity rarity, int loreLines) {
        super(new Item.Settings()
                .rarity(ExpandedRarity.getRarity(rarity))
                .component(DataComponentTypes.LORE, new LoreComponent(ModItems.getLoreList(name,loreLines)))
                .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Skyblock.MOD_ID,name))));
        this.modRarity = rarity;
    }

    public ModItem(Settings settings, ModRarity rarity, Ability[] abilities) {
        super(settings.rarity(ExpandedRarity.getRarity(rarity)));
        this.modRarity = rarity;
        this.abilities = abilities;
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        for (Ability ability : this.abilities) {
            ability.useOnBlock(context);
        }
        return super.useOnBlock(context);
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

    @Override
    public ModRarity getModRarity() {
        return this.modRarity;
    }
}
