package fox.obeliskmod.tileentities;

import fox.obeliskmod.ObeliskMod;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;

import static fox.obeliskmod.lists.BlockList.dialogue_test_tile;

public class DialogueTestTile extends TileEntity implements ITickableTileEntity {
    public DialogueTestTile() {
        super(dialogue_test_tile);
    }

    @Override
    public void tick() {
        if (world.isRemote) {

        }
    }
}
