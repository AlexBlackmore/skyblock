package net.skyblock.item;

import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.entity.SkullBlockEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.PlayerHeadItem;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.nbt.NbtElement;
import net.minecraft.nbt.NbtHelper;
import net.minecraft.text.Text;
import net.minecraft.util.Util;
import net.skyblock.Skyblock;
import net.skyblock.util.ModItemInterface;
import net.skyblock.util.ModRarity;

import java.util.List;

public class ModPlayerHeadItem extends PlayerHeadItem implements ModItemInterface {
    private final String name = "basket_of_seeds";

    public ModPlayerHeadItem(Settings settings) {
        super(Blocks.PLAYER_HEAD, Blocks.PLAYER_WALL_HEAD, settings);
    }
    @Override
    public Text getName(ItemStack stack) {
        return Text.translatable(this.getTranslationKey(stack));
    }

    @Override
    public String getTranslationKey(ItemStack stack) {
        return "item." + Skyblock.MOD_ID + "." + name;
    }

    @Override
    public void postProcessNbt(NbtCompound nbt) {
        super.postProcessNbt(nbt);
    }
    @Override
    public List<Object> getLoreArgs(int i) {
        return ModItemInterface.super.getLoreArgs(i);
    }

    @Override
    public String getLoreKey() {
        return null;
    }

    @Override
    public ModRarity getModRarity() {
        return null;
    }

    @Override
    public void setModRarity(ModRarity rarity) {

    }
}
