package fox.obeliskmod.itemgroups;

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
		return new ItemStack(Item.BLOCK_TO_ITEM.get(BlockList.oak_planks_vert_slab));
		
	}

}
