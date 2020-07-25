package fox.obeliskmod.blocks;

import fox.obeliskmod.utility.VoxelShapeHelper;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;

import javax.annotation.Nullable;

public class Wagon extends Block

{





	
	public Wagon(Block.Properties properties) 
	{
      super(properties);
	}
	
	 public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) 	
	 	{
			VoxelShape Wheels = VoxelShapeHelper.createRotatedShape(state.get(BlockStateProperties.HORIZONTAL_FACING),4, 0, 0, 14, 9, 16);
			VoxelShape Ramp1 = VoxelShapeHelper.createRotatedShape(state.get(BlockStateProperties.HORIZONTAL_FACING),0,0,2,30,3,14);
			VoxelShape Ramp2 = VoxelShapeHelper.createRotatedShape(state.get(BlockStateProperties.HORIZONTAL_FACING),0,3,2,23,6,14);
			VoxelShape Ramp3 = VoxelShapeHelper.createRotatedShape(state.get(BlockStateProperties.HORIZONTAL_FACING),0,6,2,16,9,14);
			VoxelShape Ramp4 = VoxelShapeHelper.createRotatedShape(state.get(BlockStateProperties.HORIZONTAL_FACING),0,9,2,9,12,14);

	     	return VoxelShapes.or(Wheels, Ramp1, Ramp2, Ramp3, Ramp4);
	 	}
	 
	 public BlockRenderLayer getRenderLayer() {
	      return BlockRenderLayer.CUTOUT;
	   }

	@Override
	protected void fillStateContainer(StateContainer.Builder<Block, BlockState> container) {
		container.add(BlockStateProperties.HORIZONTAL_FACING);
	}

	@Nullable
	@Override
	public BlockState getStateForPlacement(BlockItemUseContext context) {
		BlockState blockState = super.getStateForPlacement(context);

		if(blockState != null){
			blockState = blockState
					.with(BlockStateProperties.HORIZONTAL_FACING,context.getPlacementHorizontalFacing().getOpposite());
		}
		return blockState;
	}
}
