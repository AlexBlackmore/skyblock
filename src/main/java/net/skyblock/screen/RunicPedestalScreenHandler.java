package net.skyblock.screen;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.screen.ArrayPropertyDelegate;
import net.minecraft.screen.PropertyDelegate;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.slot.FurnaceOutputSlot;
import net.minecraft.screen.slot.Slot;
import net.minecraft.util.Identifier;
import net.skyblock.Skyblock;
import net.skyblock.block.entity.RunicPedestalBlockEntity;
import net.skyblock.item.ModItem;
import net.skyblock.util.FormattingUtil;

public class RunicPedestalScreenHandler extends ScreenHandler {
    private static final Item APPLY_A_RUNE = registerItem("a");
    private static final Item RUNE_REMOVAL = registerItem("r");
    private final Inventory inventory;
    private final PropertyDelegate propertyDelegate;
    public final RunicPedestalBlockEntity blockEntity;

    public RunicPedestalScreenHandler(int syncId, PlayerInventory inventory, PacketByteBuf buf) {
        this(syncId, inventory, inventory.player.getWorld().getBlockEntity(buf.readBlockPos()),
                new ArrayPropertyDelegate(5));
    }
    private static Item registerItem(String name) {
        return Registry.register(Registries.ITEM, new Identifier(Skyblock.MOD_ID, "runic_pedestal-" + name), new ModItem(new FabricItemSettings()).setLoreKey("runic_pedestal-" + name));
    }
    public static void registerItems() {}

    public RunicPedestalScreenHandler(int syncId, PlayerInventory playerInventory, BlockEntity blockEntity, PropertyDelegate arrayPropertyDelegate) {
        super(ModScreenHandlers.RUNIC_PEDESTAL_SCREEN_HANDLER, syncId);
        checkSize(((Inventory) blockEntity), 5);
        this.inventory = ((Inventory) blockEntity);
        inventory.onOpen(playerInventory.player);
        this.propertyDelegate = arrayPropertyDelegate;
        this.blockEntity = ((RunicPedestalBlockEntity) blockEntity);

        this.addSlot(new Slot(inventory, 0, FormattingUtil.getChestSlotX(1), FormattingUtil.getChestSlotY(2)));
        this.addSlot(new Slot(inventory, 1, FormattingUtil.getChestSlotX(7), FormattingUtil.getChestSlotY(2)));
        this.addSlot(new FurnaceOutputSlot(playerInventory.player, inventory, 2, FormattingUtil.getChestSlotX(4), FormattingUtil.getChestSlotY(3)));
        this.addSlot(new MenuItemSlot(inventory, 3, FormattingUtil.getChestSlotX(4), FormattingUtil.getChestSlotY(1), APPLY_A_RUNE));
        this.addSlot(new MenuItemSlot(inventory, 4, FormattingUtil.getChestSlotX(8), FormattingUtil.getChestSlotY(4), RUNE_REMOVAL));

        addPlayerInventory(playerInventory);
        addPlayerHotbar(playerInventory);
        addProperties(arrayPropertyDelegate);
    }

    public boolean isCrafting() {
        return propertyDelegate.get(0) > 0;
    }
    public int getScaledProgress() {
        int progress = this.propertyDelegate.get(0);
        int maxProgress = this.propertyDelegate.get(1);  // Max Progress
        int progressArrowSize = 26; // This is the width in pixels of your arrow

        return maxProgress != 0 && progress != 0 ? progress * progressArrowSize / maxProgress : 0;
    }

    @Override
    public ItemStack quickMove(PlayerEntity player, int invSlot) {
        ItemStack newStack = ItemStack.EMPTY;
        Slot slot = this.slots.get(invSlot);
        if (slot != null && slot.hasStack()) {
            ItemStack originalStack = slot.getStack();
            newStack = originalStack.copy();
            if (invSlot < this.inventory.size()) {
                if (!this.insertItem(originalStack, this.inventory.size(), this.slots.size(), true)) {
                    return ItemStack.EMPTY;
                }
            } else if (!this.insertItem(originalStack, 0, this.inventory.size(), false)) {
                return ItemStack.EMPTY;
            }

            if (originalStack.isEmpty()) {
                slot.setStack(ItemStack.EMPTY);
            } else {
                slot.markDirty();
            }
        }

        return newStack;
    }

    @Override
    public boolean canUse(PlayerEntity player) {
        return this.inventory.canPlayerUse(player);
    }

    private void addPlayerInventory(PlayerInventory playerInventory) {
        int i = (6 - 4) * 18;
        for (int j = 0; j < 3; ++j) {
            for (int k = 0; k < 9; ++k) {
                this.addSlot(new Slot(playerInventory, k + j * 9 + 9, 8 + k * 18, 103 + j * 18 + i));
            }
        }
    }
    private void addPlayerHotbar(PlayerInventory playerInventory) {
        int i = (6 - 4) * 18;
        for (int j = 0; j < 9; ++j) {
            this.addSlot(new Slot(playerInventory, j, 8 + j * 18, 161 + i));
        }
    }
}
