package fox.obeliskmod.blocks;

import fox.obeliskmod.entities.blocks.ChairEntity;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

public class Stool extends Block
{
	public static final VoxelShape Stool_Leg_1 = Block.makeCuboidShape(4,0,4, 6, 7, 6);
	public static final VoxelShape Stool_Leg_2 = Block.makeCuboidShape(4, 0, 10, 6, 7, 12);
	public static final VoxelShape Stool_Leg_3 = Block.makeCuboidShape(10, 0, 4, 12, 7, 6);
	public static final VoxelShape Stool_Leg_4 = Block.makeCuboidShape(10, 0, 10, 12, 7, 12);
	public static final VoxelShape Stool_Top = Block.makeCuboidShape(3, 7, 3, 13, 9, 13);

	public Stool(Block.Properties properties) 
		{
	      super(properties);
		}
	
	 public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) 	
	 	{
	     	return VoxelShapes.or(Stool_Leg_1, Stool_Leg_2, Stool_Leg_3, Stool_Leg_4, Stool_Top);
	 	}
	 
	 public boolean onBlockActivated(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockRayTraceResult rayTrace) {
	        return ChairEntity.createSeat(world, pos, 0.3, player);
	    }

	 
	 public BlockRenderLayer getRenderLayer() {
	      return BlockRenderLayer.CUTOUT;
	   }

}
