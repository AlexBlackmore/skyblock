package net.skyblock.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;
import net.skyblock.item.*;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        offerBasicArmorRecipes(ModArmorItems.FARM_SUIT_HELMET, ModArmorItems.FARM_SUIT_CHESTPLATE, ModArmorItems.FARM_SUIT_LEGGINGS, ModArmorItems.FARM_SUIT_BOOTS, Blocks.HAY_BLOCK.asItem(), exporter);
        offerBasicArmorRecipes(ModArmorItems.FARM_ARMOR_HELMET, ModArmorItems.FARM_ARMOR_CHESTPLATE, ModArmorItems.FARM_ARMOR_LEGGINGS, ModArmorItems.FARM_ARMOR_BOOTS, EnchantedItems.HAY_BLOCK, exporter);
        offerBasicArmorRecipes(ModArmorItems.MUSHROOM_HELMET, ModArmorItems.MUSHROOM_CHESTPLATE, ModArmorItems.MUSHROOM_LEGGINGS, ModArmorItems.MUSHROOM_BOOTS, Items.RED_MUSHROOM, exporter);
        offerBasicArmorRecipes(ModArmorItems.MINERS_OUTFIT_HELMET, ModArmorItems.MINERS_OUTFIT_CHESTPLATE, ModArmorItems.MINERS_OUTFIT_LEGGINGS, ModArmorItems.MINERS_OUTFIT_BOOTS, EnchantedItems.COBBLESTONE, exporter);

        offerBasicAxeRecipe(ModToolItems.PROMISING_AXE, Items.IRON_BLOCK, Items.STICK, exporter);
        offerBasicPickaxeRecipe(ModToolItems.PROMISING_PICKAXE, Items.IRON_BLOCK, Items.STICK, exporter);
    }

    private void offerBasicArmorRecipes(Item helmet, Item chestplate, Item leggings, Item boots, Item material, RecipeExporter exporter) {
        offerBasicHelmetRecipe(helmet, material, exporter);
        offerBasicChestplateRecipe(chestplate, material, exporter);
        offerBasicLeggingsRecipe(leggings, material, exporter);
        offerBasicBootsRecipe(boots, material, exporter);
    }
    private void offerBasicHelmetRecipe (Item output, Item input, RecipeExporter exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, output, 1)
                .pattern("XXX")
                .pattern("X X")
                .input('X', input)
                .criterion(hasItem(input), conditionsFromItem(input))
                .offerTo(exporter, new Identifier(getRecipeName(output)));
    }
    private void offerBasicChestplateRecipe (Item output, Item input, RecipeExporter exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, output, 1)
                .pattern("X X")
                .pattern("XXX")
                .pattern("XXX")
                .input('X', input)
                .criterion(hasItem(input), conditionsFromItem(input))
                .offerTo(exporter, new Identifier(getRecipeName(output)));
    }
    private void offerBasicLeggingsRecipe (Item output, Item input, RecipeExporter exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, output, 1)
                .pattern("XXX")
                .pattern("X X")
                .pattern("X X")
                .input('X', input)
                .criterion(hasItem(input), conditionsFromItem(input))
                .offerTo(exporter, new Identifier(getRecipeName(output)));
    }
    private void offerBasicBootsRecipe (Item output, Item input, RecipeExporter exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, output, 1)
                .pattern("X X")
                .pattern("X X")
                .input('X', input)
                .criterion(hasItem(input), conditionsFromItem(input))
                .offerTo(exporter, new Identifier(getRecipeName(output)));
    }
    private void offerBasicPickaxeRecipe (Item output, Item head, Item handle, RecipeExporter exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, output, 1)
                .pattern("XXX")
                .pattern(" # ")
                .pattern(" # ")
                .input('X', head)
                .input('#', handle)
                .criterion(hasItem(head), conditionsFromItem(head))
                .criterion(hasItem(handle), conditionsFromItem(handle))
                .offerTo(exporter, new Identifier(getRecipeName(output)));
    }
    private void offerBasicAxeRecipe (Item output, Item head, Item handle, RecipeExporter exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, output, 1)
                .pattern("XX")
                .pattern("X#")
                .pattern(" #")
                .input('X', head)
                .input('#', handle)
                .criterion(hasItem(head), conditionsFromItem(head))
                .criterion(hasItem(handle), conditionsFromItem(handle))
                .offerTo(exporter, new Identifier(getRecipeName(output)));
    }
    private void offerBasicHoeRecipe (Item output, Item head, Item handle, RecipeExporter exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, output, 1)
                .pattern("XX")
                .pattern(" #")
                .pattern(" #")
                .input('X', head)
                .input('#', handle)
                .criterion(hasItem(head), conditionsFromItem(head))
                .criterion(hasItem(handle), conditionsFromItem(handle))
                .offerTo(exporter, new Identifier(getRecipeName(output)));
    }
    private void offerBasicShovelRecipe (Item output, Item head, Item handle, RecipeExporter exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, output, 1)
                .pattern("X")
                .pattern("#")
                .pattern("#")
                .input('X', head)
                .input('#', handle)
                .criterion(hasItem(head), conditionsFromItem(head))
                .criterion(hasItem(handle), conditionsFromItem(handle))
                .offerTo(exporter, new Identifier(getRecipeName(output)));
    }
    private void offerBasicSwordRecipe (Item output, Item head, Item handle, RecipeExporter exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, output, 1)
                .pattern("X")
                .pattern("X")
                .pattern("#")
                .input('X', head)
                .input('#', handle)
                .criterion(hasItem(head), conditionsFromItem(head))
                .criterion(hasItem(handle), conditionsFromItem(handle))
                .offerTo(exporter, new Identifier(getRecipeName(output)));
    }

}
