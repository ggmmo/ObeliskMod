package fox.obeliskmod.blocks.lighting;

import fox.obeliskmod.blockstateproperties.ObeliskBlockStateProperties;
import fox.obeliskmod.blockstateproperties.enumproperties.CandleSize;
import fox.obeliskmod.utility.VoxelShapeHelper;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalBlock;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;

import javax.annotation.Nullable;

public class CandleWallmounted extends HorizontalBlock {
    public CandleWallmounted(Properties builder) {
        super(builder);
    }

    @Override
    public int getLightValue(BlockState state) {
        return 12;
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        return VoxelShapeHelper.createRotatedShape(state.get(BlockStateProperties.HORIZONTAL_FACING), 5, 2, 0, 11, 16, 9);
    }

    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockItemUseContext context) {
        BlockState blockstate = super.getStateForPlacement(context);

        if (blockstate != null) {
            blockstate = blockstate
                    .with(BlockStateProperties.HORIZONTAL_FACING, context.getPlacementHorizontalFacing())
                    .with(ObeliskBlockStateProperties.CANDLE_SIZE, CandleSize.TALL);
        }
        return blockstate;
    }

    @Override
    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> container) {
        container.add(BlockStateProperties.HORIZONTAL_FACING);
        container.add(ObeliskBlockStateProperties.CANDLE_SIZE);
    }
}
