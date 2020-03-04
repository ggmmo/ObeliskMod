package fox.obeliskmod.blocks.tabledeco;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;

public class EarthenwarePlate extends HorizontalBlock {
    public static final VoxelShape colliderBox = Block.makeCuboidShape(2, 0, 2, 14, 2, 14);

    public EarthenwarePlate(Properties properties) {
        super(properties);
    }

    @Override
    @Deprecated
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context)
    {
        return colliderBox;
    }


}
