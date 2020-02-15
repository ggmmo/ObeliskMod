package fox.obeliskmod.blocks;

import javax.annotation.Nullable;

import fox.obeliskmod.entities.blocks.ChairEntity;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

public class Chair extends HorizontalBlock
{
	public static final VoxelShape frontRightLeg = Block.makeCuboidShape(1, 0, 1, 3, 8, 3);
	public static final VoxelShape backRightLeg = Block.makeCuboidShape(1, 0, 13, 3, 8, 15);
	public static final VoxelShape frontLeftLeg = Block.makeCuboidShape(13, 0, 1, 15, 8, 3);
	public static final VoxelShape backLeftLeg = Block.makeCuboidShape(13, 0, 13, 15, 8, 15);
	public static final VoxelShape seat = Block.makeCuboidShape(0, 8, 0, 16, 9, 16);
	public static final VoxelShape backrest = Block.makeCuboidShape(1, 9, 14, 15, 25, 15);
	public static final VoxelShape armPoleRight = Block.makeCuboidShape(1, 9, 1, 2, 13, 2);
	public static final VoxelShape armPoleLeft = Block.makeCuboidShape(14, 9, 1, 15, 13, 2);
	public static final VoxelShape armRestRight = Block.makeCuboidShape(0, 13, 0, 2, 14, 16);
	public static final VoxelShape armRestLeft = Block.makeCuboidShape(14, 13, 0, 16, 14, 16);
	
	
	public Chair(Properties properties) 
	{
        super(properties);
    }

    @Override
    @Deprecated
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) 
    {
        
        return VoxelShapes.or(frontRightLeg, backRightLeg, frontLeftLeg, backLeftLeg, seat, backrest, armPoleRight, armPoleLeft, armRestRight, armRestLeft);
    }

    @Override
    public boolean onBlockActivated(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockRayTraceResult rayTrace) {
        return ChairEntity.createSeat(world, pos, 0.4, player);
    }

    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockItemUseContext context) {
        BlockState blockstate = super.getStateForPlacement(context);

        if (blockstate != null) {
            blockstate = blockstate.with(BlockStateProperties.HORIZONTAL_FACING, context.getPlacementHorizontalFacing().getOpposite());
        }
        return blockstate;
    }

    @Override
    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> container) {
        container.add(BlockStateProperties.HORIZONTAL_FACING);
    }
}
