package net.skyblock.screen;

import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.block.Blocks;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.skyblock.Skyblock;
import net.skyblock.util.FormattingUtil;

public class RunicPedestalScreen extends HandledScreen<RunicPedestalScreenHandler> {
    private static final Identifier TEXTURE = new Identifier(Skyblock.MOD_ID, "textures/gui/runic_pedestal_gui.png");
    public RunicPedestalScreen(RunicPedestalScreenHandler handler, PlayerInventory inventory, Text title) {
        super(handler, inventory, title);
        this.backgroundHeight = 114 + 6 * 18;
        this.playerInventoryTitleY = this.backgroundHeight - 94;
    }

    @Override
    protected void init() {
        super.init();
    }

    @Override
    protected void drawBackground(DrawContext context, float delta, int mouseX, int mouseY) {
        RenderSystem.setShader(GameRenderer::getPositionTexProgram);
        RenderSystem.setShaderColor(1f,1f,1f,1f);
        RenderSystem.setShaderTexture(0, TEXTURE);
        int x = (width - backgroundWidth) / 2;
        int y = (height - backgroundHeight) / 2;

//        context.drawTexture(TEXTURE, x, y, 0, 0, backgroundWidth, backgroundHeight);
        context.drawTexture(TEXTURE, x, y, 0, 0, this.backgroundWidth, 6 * 18 + 17);
        context.drawTexture(TEXTURE, x, y + 6 * 18 + 17, 0, 126, this.backgroundWidth, 96);

        renderProgressArrow(context, x, y);
    }

    private void renderProgressArrow(DrawContext context, int x, int y) {
        //TODO animation
        if (handler.isCrafting()) {
//            context.drawTexture(TEXTURE, x+85, y+30, 176, 0, 8, handler.getScaledProgress());
        } else {
            ItemStack stack = Blocks.PURPLE_STAINED_GLASS_PANE.asItem().getDefaultStack();
            if (this.handler.getSlot(0).getStack().isEmpty()) {
                stack = Blocks.WHITE_STAINED_GLASS_PANE.asItem().getDefaultStack();
            }

            context.drawItem(stack, x + FormattingUtil.getChestSlotX(1), y + FormattingUtil.getChestSlotY(1));
            context.drawItem(stack, x + FormattingUtil.getChestSlotX(2), y + FormattingUtil.getChestSlotY(1));
            context.drawItem(stack, x + FormattingUtil.getChestSlotX(3), y + FormattingUtil.getChestSlotY(1));

            if (this.handler.getSlot(1).getStack().isEmpty()) {
                stack = Blocks.WHITE_STAINED_GLASS_PANE.asItem().getDefaultStack();
            } else {
                stack = Blocks.PURPLE_STAINED_GLASS_PANE.asItem().getDefaultStack();
            }
            context.drawItem(stack, x + FormattingUtil.getChestSlotX(5), y + FormattingUtil.getChestSlotY(1));
            context.drawItem(stack, x + FormattingUtil.getChestSlotX(6), y + FormattingUtil.getChestSlotY(1));
            context.drawItem(stack, x + FormattingUtil.getChestSlotX(7), y + FormattingUtil.getChestSlotY(1));

            if (this.handler.getSlot(0).getStack().isEmpty() || this.handler.getSlot(1).getStack().isEmpty()) {
                stack = Blocks.WHITE_STAINED_GLASS_PANE.asItem().getDefaultStack();
            } else {
                stack = Blocks.PURPLE_STAINED_GLASS_PANE.asItem().getDefaultStack();
            }
            context.drawItem(stack, x + FormattingUtil.getChestSlotX(4), y + FormattingUtil.getChestSlotY(2));

            context.drawItem(stack, x + FormattingUtil.getChestSlotX(0), y + FormattingUtil.getChestSlotY(5));
            context.drawItem(stack, x + FormattingUtil.getChestSlotX(1), y + FormattingUtil.getChestSlotY(5));
            context.drawItem(stack, x + FormattingUtil.getChestSlotX(2), y + FormattingUtil.getChestSlotY(5));
            context.drawItem(stack, x + FormattingUtil.getChestSlotX(3), y + FormattingUtil.getChestSlotY(5));

            context.drawItem(stack, x + FormattingUtil.getChestSlotX(5), y + FormattingUtil.getChestSlotY(5));
            context.drawItem(stack, x + FormattingUtil.getChestSlotX(6), y + FormattingUtil.getChestSlotY(5));
            context.drawItem(stack, x + FormattingUtil.getChestSlotX(7), y + FormattingUtil.getChestSlotY(5));
            context.drawItem(stack, x + FormattingUtil.getChestSlotX(8), y + FormattingUtil.getChestSlotY(5));
        }
    }

    @Override
    public void render(DrawContext context, int mouseX, int mouseY, float delta) {
        renderBackground(context, mouseX, mouseY, delta);
        super.render(context, mouseX, mouseY, delta);
        drawMouseoverTooltip(context, mouseX, mouseY);
    }
}
