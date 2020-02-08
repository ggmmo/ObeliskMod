package fox.obeliskmod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;

public class Table extends Block
{
	public static final VoxelShape Default_Table = Block.makeCuboidShape(0, 0, 0, 2, 14, 2);

	public Table(Block.Properties properties) 
		{
	      super(properties);
		}
	
	 public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) 	
	 	{
	     	return Default_Table;
	 	}

	 
	 public BlockRenderLayer getRenderLayer() {
	      return BlockRenderLayer.CUTOUT;
	   }

}
