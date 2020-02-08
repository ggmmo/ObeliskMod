package fox.obeliskmod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;

public class Table extends Block
{
	public static final VoxelShape Table_Leg_1 = Block.makeCuboidShape(0, 0, 0, 2, 14, 2);
	public static final VoxelShape Table_Leg_2 = Block.makeCuboidShape(16, 0, 0, 14, 14, 2);
	public static final VoxelShape Table_Leg_3 = Block.makeCuboidShape(0, 0, 16, 2, 14, 14);
	public static final VoxelShape Table_Leg_4 = Block.makeCuboidShape(16, 0, 16, 14, 14, 14);
	public static final VoxelShape Table_Top = Block.makeCuboidShape(0, 14, 0, 16, 16, 16);

	public Table(Block.Properties properties) 
		{
	      super(properties);
		}
	
	 public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) 	
	 	{
	     	return VoxelShapes.or(Table_Leg_1, Table_Leg_2, Table_Leg_3, Table_Leg_4, Table_Top);
	 	}

	 
	 public BlockRenderLayer getRenderLayer() {
	      return BlockRenderLayer.CUTOUT;
	   }

}
