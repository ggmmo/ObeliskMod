package fox.obeliskmod.gui.container;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;

import static fox.obeliskmod.lists.ItemList.ultrahotbar_container;

public class UltrahotbarContainer extends Container {
    private PlayerInventory playerInventory;

    public UltrahotbarContainer(int windowId, PlayerInventory playerInventory) {
        super(ultrahotbar_container, windowId);
        this.playerInventory = playerInventory;
    }

    @Override
    public boolean canInteractWith(PlayerEntity playerIn) {
        return false;
    }
}
