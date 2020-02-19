package fox.obeliskmod.itemgroups;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import fox.obeliskmod.lists.ItemList;

public class ObeliskMiscItemGroup extends ItemGroup
{

	public ObeliskMiscItemGroup() 
	{
		super("misc");
		
	}

	@Override
	public ItemStack createIcon() 
	{
		return new ItemStack(ItemList.gold_coin);
	}

}
