package fox.obeliskmod.tileentities;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.ItemStack;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class DialogueTestBlock extends Block {
    public DialogueTestBlock() {
        super(Block.Properties.create(Material.ANVIL)
            .sound(SoundType.METAL)
            .hardnessAndResistance(0.5f));
    }

    @Override
    public void addInformation(ItemStack stack, @Nullable IBlockReader worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        tooltip.add(new StringTextComponent("This item is a work in progress. Using this item before it is finished may result in unstable effects within the world." +
                " DO NOT PLACE IN THE WORLD - This item performs operations during and between tick-cycles")
                .applyTextStyles(TextFormatting.DARK_RED, TextFormatting.ITALIC));
    }

    @Override
    public boolean hasTileEntity(BlockState state) {
        return true;
    }

    @Nullable
    @Override
    public TileEntity createTileEntity(BlockState state, IBlockReader world) {
        return new DialogueTestTile();
    }

    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockItemUseContext context) {
        BlockState blockstate = super.getStateForPlacement(context);

        if (blockstate != null) {
            blockstate = blockstate
                    .with(BlockStateProperties.HORIZONTAL_FACING, context.getPlacementHorizontalFacing().getOpposite());
        }
        return blockstate;
    }

    @Override
    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(BlockStateProperties.HORIZONTAL_FACING);
    }
}
