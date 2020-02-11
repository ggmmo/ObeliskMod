package fox.obeliskmod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;

public class LongTable extends Block
{
	public static final VoxelShape Table_Body = Block.makeCuboidShape(0, 14, 0, 16, 16, 32);
	

	public LongTable(Block.Properties properties) 
		{
	      super(properties);
		}
	
	 public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) 	
	 	{
	     	return VoxelShapes.or(Table_Body);
	 	}

	 
	 public BlockRenderLayer getRenderLayer() {
	      return BlockRenderLayer.CUTOUT;
	   }

}
