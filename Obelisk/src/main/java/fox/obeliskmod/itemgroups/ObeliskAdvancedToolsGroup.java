package fox.obeliskmod.itemgroups;

import fox.obeliskmod.lists.ItemList;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ObeliskAdvancedToolsGroup extends ItemGroup {


    public ObeliskAdvancedToolsGroup() {
        super("advancedTools");
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(ItemList.ultrahotbar);
    }
}
