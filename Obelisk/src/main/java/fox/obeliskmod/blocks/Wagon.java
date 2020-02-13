package fox.obeliskmod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;

public class Wagon extends Block

{
	public static final VoxelShape WagonBody = Block.makeCuboidShape(-0, 0, 0, 28, 9, 30);
	
	public Wagon(Block.Properties properties) 
	{
      super(properties);
	}
	
	 public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) 	
	 	{
	     	return VoxelShapes.or(WagonBody);
	 	}
	 
	 public BlockRenderLayer getRenderLayer() {
	      return BlockRenderLayer.CUTOUT;
	   }
}
