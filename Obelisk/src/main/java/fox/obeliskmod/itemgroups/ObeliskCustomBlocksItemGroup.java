package fox.obeliskmod.itemgroups;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import fox.obeliskmod.lists.BlockList;

public class ObeliskCustomBlocksItemGroup extends ItemGroup
{

	public ObeliskCustomBlocksItemGroup() 
	{
		super("customBlocks");
		
	}

	@Override
	public ItemStack createIcon() 
	{
		return new ItemStack(Item.BLOCK_TO_ITEM.get(BlockList.earth_obelisk_block));
	
	}

}
