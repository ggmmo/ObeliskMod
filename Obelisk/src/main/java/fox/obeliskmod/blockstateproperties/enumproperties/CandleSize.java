package fox.obeliskmod.blockstateproperties.enumproperties;

import net.minecraft.util.IStringSerializable;

public enum CandleSize implements IStringSerializable {
    SHORT("short"),
    MEDIUM("medium"),
    TALL("tall");

    private final String name;

    private CandleSize(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
