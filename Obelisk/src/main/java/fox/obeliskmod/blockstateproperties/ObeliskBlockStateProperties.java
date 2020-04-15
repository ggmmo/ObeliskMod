package fox.obeliskmod.blockstateproperties;

import fox.obeliskmod.blockstateproperties.enumproperties.CandleSize;
import fox.obeliskmod.blockstateproperties.enumproperties.CandleType;
import net.minecraft.state.EnumProperty;

public class ObeliskBlockStateProperties {
    public static final EnumProperty<CandleSize> CANDLE_SIZE = EnumProperty.create("size", CandleSize.class);
    public static final EnumProperty<CandleType> CANDLE_TYPE = EnumProperty.create("type", CandleType.class);
}
