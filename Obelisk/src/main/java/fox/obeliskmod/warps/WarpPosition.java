package fox.obeliskmod.warps;

import net.minecraft.util.math.BlockPos;

import java.io.Serializable;

public class WarpPosition implements Serializable {
    private double x, y, z;

    public WarpPosition() {}

    public WarpPosition(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public BlockPos getBlockPos() {
        return new BlockPos(x, y, z);
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public double getZ() {
        return this.z;
    }
}
