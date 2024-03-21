package net.skyblock.screen;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.slot.Slot;

public class MenuItemSlot extends Slot {
    public MenuItemSlot(Inventory inventory, int index, int x, int y, Item item) {
        super(inventory, index, x, y);
        inventory.setStack(index, item.getDefaultStack());
    }

    @Override
    public boolean canTakeItems(PlayerEntity playerEntity) {
        return false;
    }
    @Override
    public boolean canInsert(ItemStack stack) {
        return false;
    }
    @Override
    public boolean canBeHighlighted() {
        return false;
    }
}
