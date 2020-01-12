package fox.obeliskmod;

import fox.obeliskmod.lists.BlockList;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ObeliskItemGroup extends ItemGroup
{

	public ObeliskItemGroup() 
	{
		super("obelisk");
		
	}

	@Override
	public ItemStack createIcon() 
	{
		return new ItemStack(Item.BLOCK_TO_ITEM.get(BlockList.earth_obelisk_block));
		
	}

}
