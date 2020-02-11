package fox.obeliskmod.itemgroups;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import fox.obeliskmod.lists.BlockList;

public class ObeliskFurnitureItemGroup extends ItemGroup
{

	public ObeliskFurnitureItemGroup() 
	{
		super("furniture");
		
	}

	@Override
	public ItemStack createIcon() 
	{
		return new ItemStack(Item.BLOCK_TO_ITEM.get(BlockList.dark_oak_planks_table));
	
	}

}
