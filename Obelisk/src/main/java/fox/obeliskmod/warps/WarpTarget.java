package fox.obeliskmod.warps;

import net.minecraft.util.math.BlockPos;

import java.io.Serializable;

// Serializable class used to save warps to an output file
public class WarpTarget implements Serializable {
    // Default serialVersion ID
    private static final long serialVersionUID = 1L;

    private String name;
    private WarpPosition location;

    public WarpTarget(String name, WarpPosition location) {
        setName(name);
        setPosition(location);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setPosition(WarpPosition location) {
        this.location = location;
    }

    public WarpPosition getPosition() {
        return location;
    }

    @Override
    public String toString() {
        return new StringBuffer(this.name).append(": ").append(getPosition().getX()).append(", ").append(getPosition().getY()).append(", ").append(getPosition().getZ()).toString();
    }
}
