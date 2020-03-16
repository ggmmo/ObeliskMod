package fox.obeliskmod.blockstateproperties;

import fox.obeliskmod.blockstateproperties.enumproperties.CandleSize;
import net.minecraft.state.EnumProperty;

public class ObeliskBlockStateProperties {
    public static final EnumProperty<CandleSize> CANDLE_SIZE = EnumProperty.create("size", CandleSize.class);
}
