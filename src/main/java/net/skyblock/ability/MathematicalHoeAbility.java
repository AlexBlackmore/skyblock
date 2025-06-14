package net.skyblock.ability;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.server.command.CommandManager;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Rarity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.skyblock.component.ModDataComponentTypes;
import net.skyblock.item.ModItem;
import net.skyblock.util.FormattingUtil;
import org.jetbrains.annotations.Nullable;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;

public class MathematicalHoeAbility extends Ability {
    private final Block block;
    private final int[] upgradeThresholds = new int[]{100000, 10000000};
    private final Set<String> VALID_IDS = new HashSet<>(Arrays.asList("wheat", "carrot", "potato", "sugar_cane", "nether_wart"));
    private String item_id = "";
    private float logarithmic_counter_reward = 0.0f;
    private float collection_analysis_reward = 0.0f;
    private Item collection = Items.BEDROCK;

    public MathematicalHoeAbility(Block block) {
        super("mathematical_hoe", 3);
        this.block = block;
        setShowName(false);
    }

    public MathematicalHoeAbility(Block block, String id) {
        super("mathematical_hoe", 6);
        this.block = block;
        setShowName(false);

        if (this.VALID_IDS.contains(id)) {
            this.item_id = id;
            this.logarithmic_counter_reward = 0.16f;
        }
    }

    public MathematicalHoeAbility(Block block, String id, Item collection) {
        super("mathematical_hoe", 11);
        this.block = block;
        setShowName(false);

        if (this.VALID_IDS.contains(id)) {
            this.item_id = id;
            this.logarithmic_counter_reward = 0.16f;
            this.collection = collection;
            this.collection_analysis_reward = 0.08f;
        }

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

                if (miner instanceof PlayerEntity player && world instanceof ServerWorld server) {
                    @Nullable CommandManager commandManager = server.getServer().getCommandManager();
                    if (commandManager != null) {
                        if ((blocksBroken/Math.pow(10, Math.floor(Math.log10(blocksBroken))))==1) {
                            //Logarithmic Counter ability
                            if (this.logarithmic_counter_reward != 0) {
                                commandManager.executeWithPrefix(player.getCommandSource(server).withLevel(4),
                                        "scoreboard players set @s dummy " + (int)(Math.log10(blocksBroken)));
                                commandManager.executeWithPrefix(player.getCommandSource(server).withLevel(4),
                                        "item modify entity @s weapon.mainhand skyblock:logarithmic_counter/" + this.item_id);
                            }
                        }
                        //Collection Analysis ability
                        if (this.collection_analysis_reward != 0) {
                            commandManager.executeWithPrefix(player.getCommandSource(server).withLevel(4),
                                    "function skyblock:ability/collection_analysis/" + this.item_id);
                        }
                    }
                }

            }
        }

        return super.postMine(stack, world, state, pos, miner);
    }

    @Override
    public Object[] getTooltipArguments(int i, ItemStack stack) {
        @Nullable Integer blocksBroken = stack.get(ModDataComponentTypes.MATHEMATICAL_HOE);
        if (blocksBroken != null) {
            switch(i) {
                case 0 -> {
                    return new Object[]{"§e" + FormattingUtil.commaSeparateInt(blocksBroken), this.block.getName().formatted(Formatting.YELLOW)};
                }
                case 2 -> {
                    int upgradeThreshold = 0;
                    for (int t : this.upgradeThresholds) {
                        if (blocksBroken < t) {
                            upgradeThreshold = t;
                            break;
                        }
                    }
                    if (upgradeThreshold != 0) {
                        return new Object[]{"§8" + FormattingUtil.commaSeparateInt(upgradeThreshold)};
                    }
                }
                case 5, 9 -> {
                    return new Object[]{"§9+" + FormattingUtil.commaSeparateInt((int)((i==3 ? this.logarithmic_counter_reward : this.collection_analysis_reward)*100)) + "%", Text.translatable("attribute.name.fortune." + this.item_id).formatted(Formatting.BLUE)};
                }
                case 10 -> {
                    return new Object[]{this.collection.getName()};
                }
                default -> {
                    return new Object[]{};
                }
            }
        }
        return new Object[]{};
    }
}
