package fox.obeliskmod.tileentities.Dialogue;

import fox.obeliskmod.lists.BlockList;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IWorldPosCallable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.items.CapabilityItemHandler;

import static fox.obeliskmod.lists.BlockList.dialogue_test_container;

public class DialogueTestContainer extends Container {
    private TileEntity tileEntity;
    private PlayerEntity player;

    public DialogueTestContainer(int id, World world, BlockPos pos, PlayerInventory playerInventory) {
        super(dialogue_test_container, id);
        tileEntity = world.getTileEntity(pos);
        tileEntity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY);
    }

    @Override
    public boolean canInteractWith(PlayerEntity playerIn) {
        return isWithinUsableDistance(IWorldPosCallable.of(tileEntity.getWorld(), tileEntity.getPos()), playerIn, BlockList.dialogue_test);
    }
}
