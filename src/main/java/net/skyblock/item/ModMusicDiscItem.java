package net.skyblock.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.*;
import net.minecraft.sound.SoundEvent;
import net.minecraft.text.Text;
import net.minecraft.world.World;
import net.skyblock.util.LoreUtil;
import net.skyblock.util.ModItemInterface;
import net.skyblock.util.ModRarity;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ModMusicDiscItem extends MusicDiscItem implements ModItemInterface {
    private ModRarity rarity;
    private String loreKey;
    public ModMusicDiscItem(int comparatorOutput, SoundEvent sound, int lengthInSeconds) {
        super(comparatorOutput, sound, new FabricItemSettings().maxCount(1), lengthInSeconds);
        this.rarity = ModRarity.convertRarity(this);
    }
    public ModMusicDiscItem(String name, int comparatorOutput, SoundEvent sound, int lengthInSeconds, ModRarity rarity) {
        super(comparatorOutput, sound, new FabricItemSettings().maxCount(1), lengthInSeconds);
        this.rarity = rarity;
        this.loreKey = "lore.skyblock." + name;
    }

    @Override
    public Text getName() {
        return Text.translatable(this.getTranslationKey()).formatted(this.rarity.formatting);
    }
    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        LoreUtil.appendLore(stack, tooltip, this);
        super.appendTooltip(stack, world, tooltip, context);
    }
    public String getLoreKey() {
        return this.loreKey;
    }

    public ModRarity getModRarity() {return this.rarity;}
    public void setModRarity(ModRarity rarity) {this.rarity = rarity;}

}
