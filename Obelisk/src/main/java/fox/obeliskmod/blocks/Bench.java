package fox.obeliskmod.blocks;

import fox.obeliskmod.entities.blocks.ChairEntity;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.StateContainer;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;

public class Bench extends HorizontalBlock
{
	public static final VoxelShape Stool_Leg_South = Block.makeCuboidShape(0, 0, 6, 16, 7, 12);
	public static final VoxelShape Stool_Top_South = Block.makeCuboidShape(0, 7, 0, 16, 9, 15);
	
	public static final VoxelShape Stool_Leg_North = Block.makeCuboidShape(0, 0, 4, 16, 7, 10);
	public static final VoxelShape Stool_Top_North = Block.makeCuboidShape(0, 7, 1, 16, 9, 16);
	
	public static final VoxelShape Stool_Leg_West = Block.makeCuboidShape(4, 0, 0, 10, 7, 16);
	public static final VoxelShape Stool_Top_West = Block.makeCuboidShape(1, 7, 0, 16, 9, 16);
	
	public static final VoxelShape Stool_Leg_East = Block.makeCuboidShape(6, 0, 0, 12, 7, 16);
	public static final VoxelShape Stool_Top_East = Block.makeCuboidShape(0, 7, 0, 16, 9, 16);

	public Bench(Block.Properties properties) 
		{
	      super(properties);
	      this.setDefaultState(this.stateContainer.getBaseState().with(HORIZONTAL_FACING, Direction.NORTH));
		}
	
	 public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) 	
	 	{
	     	switch((Direction)state.get(HORIZONTAL_FACING)) {
		      case SOUTH:
		         return VoxelShapes.or(Stool_Leg_South, Stool_Top_South);
		      case NORTH:
		      default:
		        return VoxelShapes.or(Stool_Leg_North, Stool_Top_North);
		      case WEST:
		         return VoxelShapes.or(Stool_Leg_West, Stool_Top_West);
		      case EAST:
		         return VoxelShapes.or(Stool_Leg_East, Stool_Top_East);
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
	 
	 
	 
	 
	 public boolean onBlockActivated(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockRayTraceResult rayTrace) {
	        return ChairEntity.createSeat(world, pos, 0.3, player);
	    }

	 
	 public BlockRenderLayer getRenderLayer() {
	      return BlockRenderLayer.CUTOUT;
	   }

	 protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
	      builder.add(HORIZONTAL_FACING);
	   }

}
