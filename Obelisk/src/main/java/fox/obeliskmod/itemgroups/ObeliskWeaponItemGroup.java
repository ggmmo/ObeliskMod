package fox.obeliskmod.itemgroups;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import fox.obeliskmod.lists.ItemList;

public class ObeliskWeaponItemGroup extends ItemGroup
{

    public ObeliskWeaponItemGroup()
    {
        super("weapon");

    }

    @Override
    public ItemStack createIcon()
    {
        return new ItemStack(ItemList.earth_sword);
    }

}
