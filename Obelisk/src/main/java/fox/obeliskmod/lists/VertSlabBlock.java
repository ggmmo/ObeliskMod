package fox.obeliskmod.lists;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalBlock;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.StateContainer;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorldReader;

public class VertSlabBlock extends HorizontalBlock
{
	protected static final VoxelShape North_Vert_Slab = Block.makeCuboidShape(0, 0, 0, 16, 16, 8);
	protected static final VoxelShape East_Vert_Slab = Block.makeCuboidShape(16, 0, 0, 8, 16, 16);
	protected static final VoxelShape South_Vert_Slab = Block.makeCuboidShape(16, 0, 16, 0, 16, 8);
	protected static final VoxelShape West_Vert_Slab = Block.makeCuboidShape(0, 0, 16, 8, 16, 0);

	public VertSlabBlock(Block.Properties properties) {
	      super(properties);
	      this.setDefaultState(this.stateContainer.getBaseState().with(HORIZONTAL_FACING, Direction.NORTH));
	   }
	
	 public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
	      switch((Direction)state.get(HORIZONTAL_FACING)) {
	      case SOUTH:
	         return South_Vert_Slab;
	      case NORTH:
	      default:
	        return North_Vert_Slab;
	      case WEST:
	         return West_Vert_Slab;
	      case EAST:
	         return East_Vert_Slab;
	      }
	   }

	 public BlockState getStateForPlacement(BlockItemUseContext context) {
	      BlockState blockstate = this.getDefaultState();
	      IWorldReader iworldreader = context.getWorld();
	      BlockPos blockpos = context.getPos();

	      for(Direction direction : context.getNearestLookingDirections()) {
	         if (direction.getAxis().isHorizontal()) {
	            blockstate = blockstate.with(HORIZONTAL_FACING, direction);
	            if (blockstate.isValidPosition(iworldreader, blockpos)) {
	               return blockstate;
	            }
	         }
	      }

	      return null;
	   }
	 
	 public BlockRenderLayer getRenderLayer() {
	      return BlockRenderLayer.CUTOUT;
	   }

	 protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
	      builder.add(HORIZONTAL_FACING);
	   }
}
