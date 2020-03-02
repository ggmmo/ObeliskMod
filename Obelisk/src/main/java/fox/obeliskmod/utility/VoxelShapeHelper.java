package fox.obeliskmod.utility;

import net.minecraft.block.Block;
import net.minecraft.util.Direction;
import net.minecraft.util.math.shapes.VoxelShape;

public class VoxelShapeHelper {
    public static VoxelShape createRotatedShape(Direction direction, double x1, double y1, double z1, double x2, double y2, double z2) {
        switch (direction) {
            case NORTH:
            default:
                return Block.makeCuboidShape(x1, y1, z1, x2, y2, z2);
            case WEST:
                return Block.makeCuboidShape(z1, y1, 16d - x2, z2, y2, 16d - x1);
            case SOUTH:
                return Block.makeCuboidShape(16d - x2, y1, 16d - z2, 16d - x1, y2, 16d - z1);
            case EAST:
                return Block.makeCuboidShape(16d - z2, y1, x1, 16d - z1, y2, x2);
            case DOWN:
                return Block.makeCuboidShape(16d - x2, z1, 16d - y2, 16d - x1, z2, 16d - y1);
            case UP:
                return Block.makeCuboidShape(x1, 16d - z2, y1, x2, 16d - z1, y2);
        }
    }
}
