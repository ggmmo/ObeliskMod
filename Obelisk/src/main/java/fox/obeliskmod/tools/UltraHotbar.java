package fox.obeliskmod.tools;

import fox.obeliskmod.gui.container.UltrahotbarContainer;
import net.minecraft.block.Block;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.INamedContainerProvider;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolItem;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraftforge.fml.network.NetworkHooks;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Set;

public class UltraHotbar extends ToolItem {
    public UltraHotbar(float attackDamageIn, float attackSpeedIn, IItemTier tier, Set<Block> effectiveBlocksIn, Properties builder) {
        super(attackDamageIn, attackSpeedIn, tier, effectiveBlocksIn, builder);
    }

    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        tooltip.add(new StringTextComponent("This item is a work in progress. Using this item before it is finished may result in unstable effects within the world.")
                .applyTextStyles(TextFormatting.DARK_RED, TextFormatting.ITALIC));
    }
}
