package fox.obeliskmod.blocks;

import net.minecraft.block.LecternBlock;
import net.minecraft.util.Direction;

public class CustomLecternBlock extends LecternBlock
{
    public CustomLecternBlock(Properties properties)
    {
        super(properties);
        this.setDefaultState(this.stateContainer.getBaseState().with(FACING, Direction.NORTH).with(POWERED, Boolean.valueOf(false)).with(HAS_BOOK, Boolean.valueOf(false)));
    }
}
