package fox.obeliskmod.lists;

import fox.obeliskmod.ObeliskModRegistries;
import fox.obeliskmod.blocks.fluids.MoltenEarthObeliskFluid;
import net.minecraft.fluid.Fluid;
import net.minecraft.tags.FluidTags;
import net.minecraft.tags.Tag;

public class FluidList
{
    public static MoltenEarthObeliskFluid.Source molten1 = null;
    public static MoltenEarthObeliskFluid.Flowing flowing_molten1 = null;



    public static class Tags{
        public static final Tag<Fluid> molten1 = new FluidTags.Wrapper(ObeliskModRegistries.location("molten1"));
    }

}
