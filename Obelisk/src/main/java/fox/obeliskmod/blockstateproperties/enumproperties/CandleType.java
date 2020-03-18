package fox.obeliskmod.blockstateproperties.enumproperties;

import net.minecraft.util.IStringSerializable;

public enum CandleType implements IStringSerializable {
    METAL("metal"),
    STONE("stone");

    private final String name;

    private CandleType(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
