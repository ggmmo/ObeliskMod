package fox.obeliskmod.blocks.fluids;

import fox.obeliskmod.ObeliskModRegistries;
import fox.obeliskmod.lists.BlockList;
import fox.obeliskmod.lists.FluidList;
import fox.obeliskmod.lists.ItemList;
import net.minecraft.block.BlockState;
import net.minecraft.block.FlowingFluidBlock;
import net.minecraft.fluid.FlowingFluid;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.IFluidState;
import net.minecraft.item.Item;
import net.minecraft.state.StateContainer;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldReader;
import net.minecraftforge.fluids.FluidAttributes;

public abstract class MoltenEarthObeliskFluid extends FlowingFluid {
    @Override
    public Fluid getFlowingFluid() {
        return FluidList.flowing_molten1;
    }

    @Override
    public Fluid getStillFluid() {
        return FluidList.molten1;
    }

    @Override
    protected boolean canSourcesMultiply() {
        return true;
    }

    @Override
    protected void beforeReplacingBlock(IWorld worldIn, BlockPos pos, BlockState state) {

    }

    @Override
    protected int getSlopeFindDistance(IWorldReader worldIn) {
        return 5;
    }

    @Override
    protected int getLevelDecreasePerBlock(IWorldReader worldIn) {
        return 5;
    }

    @Override
    public BlockRenderLayer getRenderLayer() {
        return BlockRenderLayer.SOLID;
    }

    @Override
    public Item getFilledBucket() {
        return ItemList.molten1_bucket;
    }

    @Override
    protected boolean func_215665_a(IFluidState state, IBlockReader world, BlockPos pos, Fluid fluid, Direction direction) {
        return direction == Direction.DOWN && !fluid.isIn(FluidList.Tags.molten1);
    }

    @Override
    public int getTickRate(IWorldReader p_205569_1_) {
        return 40;
    }

    @Override
    protected float getExplosionResistance() {
        return 100.0f;
    }

    @Override
    protected BlockState getBlockState(IFluidState state) {
        return BlockList.molten1.getDefaultState().with(FlowingFluidBlock.LEVEL, Integer.valueOf(getLevelFromState(state)));
    }

    @Override
    public boolean isEquivalentTo(Fluid fluidIn) {
        return fluidIn == FluidList.molten1 || fluidIn == FluidList.flowing_molten1;
    }

    @Override
    protected FluidAttributes createAttributes() {
        return FluidAttributes.builder(ObeliskModRegistries.location("blocks/molten1_still"), ObeliskModRegistries.location("blocks/molten1_flow"))
                .translationKey("block.obeliskmod.molten1")
                .build(this);
    }

    public static class Flowing extends MoltenEarthObeliskFluid
    {

        @Override
        protected void fillStateContainer(StateContainer.Builder<Fluid, IFluidState> builder) {
            super.fillStateContainer(builder);
            builder.add(LEVEL_1_8);
        }

        @Override
        public boolean isSource(IFluidState state) {
            return false;
        }

        @Override
        public int getLevel(IFluidState state) {
            return state.get(MoltenEarthObeliskFluid.LEVEL_1_8);
        }
    }

    public static class Source extends MoltenEarthObeliskFluid
    {

        @Override
        public boolean isSource(IFluidState state) {
            return true;
        }

        @Override
        public int getLevel(IFluidState state) {
            return 8;
        }
    }
}



