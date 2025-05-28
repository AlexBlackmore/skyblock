package net.skyblock.ability;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Rarity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.skyblock.component.ModDataComponentTypes;
import net.skyblock.item.ModItem;
import net.skyblock.util.FormattingUtil;
import org.jetbrains.annotations.Nullable;

import java.util.function.Consumer;

public class MathematicalHoeAbility extends Ability {
    private final Block block;
    private final int[] upgradeThresholds = new int[]{100000, 10000000};
    private float logarithmic_counter_reward = 0.0f;
    private float collection_analysis_reward = 0.0f;
    private Item collection = Items.BEDROCK;

    public MathematicalHoeAbility(Block block) {
        super("mathematical_hoe", 2);
        this.block = block;
    }

    public MathematicalHoeAbility(Block block, boolean logarithmicCounter) {
        super("mathematical_hoe", 2 + (logarithmicCounter ? 3 : 0));
        this.block = block;

        if (logarithmicCounter) {
            this.logarithmic_counter_reward = 0.16f;
        }
    }

    public MathematicalHoeAbility(Block block, boolean logarithmicCounter, Item collection) {
        super("mathematical_hoe", 2 + (logarithmicCounter ? 3 : 0) + 4);
        this.block = block;

        if (logarithmicCounter) {
            this.logarithmic_counter_reward = 0.16f;
        }

        this.collection = collection;
        this.collection_analysis_reward = 0.08f;
    }

    @Override
    public boolean postMine(ItemStack stack, World world, BlockState state, BlockPos pos, LivingEntity miner) {
        if (state.getBlock() == this.block) {
            @Nullable Integer blocksBroken = stack.get(ModDataComponentTypes.MATHEMATICAL_HOE);
            if (blocksBroken != null) {
                blocksBroken++;
                stack.set(ModDataComponentTypes.MATHEMATICAL_HOE, blocksBroken);

                //Default ability
                if (stack.getItem() instanceof ModItem) {
                    for (int upgradeThreshold : this.upgradeThresholds) {
                        if (upgradeThreshold == blocksBroken) {
                            Rarity vanilla = stack.get(DataComponentTypes.RARITY);
                            @Nullable Integer rarity = stack.get(ModDataComponentTypes.MOD_RARITY);

                            if (rarity != null && vanilla != null) {
                                stack.set(ModDataComponentTypes.MOD_RARITY, (rarity < 8 ? rarity+1 : 8));
                                stack.set(DataComponentTypes.RARITY, (vanilla == Rarity.EPIC ? vanilla : Rarity.values()[vanilla.ordinal()+1]));
//                                if (miner instanceof PlayerEntity player) {
//                                    player.sendMessage(Text.literal("Upgraded rarity to " + (rarity+1)), false);
//                                }
                            }
                            break;
                        } else if (upgradeThreshold > blocksBroken) {
                            break;
                        }
                    }
                }

                //Logarithmic Counter ability


                //Collection Analysis ability
            }
        }

        return super.postMine(stack, world, state, pos, miner);
    }

    @Override
    public void appendTooltip(ItemStack stack, Consumer<Text> textConsumer) {
        @Nullable Integer blocksBroken = stack.get(ModDataComponentTypes.MATHEMATICAL_HOE);
        if (blocksBroken != null) {
            for (int i=0 ; i<this.loreLines ; i++) {
                if (i==0) {
                    textConsumer.accept(Text.translatable("ability.skyblock." + this.name + "." + i, "§e" + FormattingUtil.commaSeparateInt(blocksBroken), this.block.getName().formatted(Formatting.YELLOW)));
                } else if (i==1) {
                    int upgradeThreshold = 0;
                    for (int t : this.upgradeThresholds) {
                        if (blocksBroken < t) {
                            upgradeThreshold = t;
                            break;
                        }
                    }
                    if (upgradeThreshold != 0) {
                        textConsumer.accept(Text.translatable("ability.skyblock." + this.name + "." + i, "§8" + FormattingUtil.commaSeparateInt(upgradeThreshold)));
                    }
                } else if (i==2 || i==5) {
                    textConsumer.accept(Text.literal(""));
                    textConsumer.accept(Text.translatable("lore.skyblock.ability", Text.translatable("ability.skyblock." + this.name + "." + i).formatted(Formatting.GOLD), ""));
                } else if (i==3 || i==6) {
                    textConsumer.accept(Text.translatable("ability.skyblock." + this.name + "." + i, "§9+" + FormattingUtil.commaSeparateInt((int)((i==3 ? this.logarithmic_counter_reward : this.collection_analysis_reward)*100)) + "%", Text.translatable("attribute.name.fortune.wheat").formatted(Formatting.BLUE)));
                } else if (i==7) {
                    textConsumer.accept(Text.translatable("ability.skyblock." + this.name + "." + i, this.collection.getName()));
                } else {
                    textConsumer.accept(Text.translatable("ability.skyblock." + this.name + "." + i));
                }
            }
        }
    }
}
