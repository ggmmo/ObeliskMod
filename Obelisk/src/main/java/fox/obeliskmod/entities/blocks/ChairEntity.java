package fox.obeliskmod.entities.blocks;

import java.util.List;

import fox.obeliskmod.lists.EntityList;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.IPacket;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.network.NetworkHooks;

public class ChairEntity extends Entity {
    private BlockPos source;

    public ChairEntity(World world) {
        super(EntityList.CHAIR, world);
        noClip = true;
    }

    private ChairEntity(World world, BlockPos source, double yOffset) {
        this(world);
        this.source = source;
        // Add 0.5 to horizontal coordinates to offset the seated position to the center of the chair
        setPosition(source.getX() + 0.5, source.getY() + yOffset, source.getZ() + 0.5);
    }

    @Override
    protected void registerData() {

    }

    @Override
    protected void readAdditional(CompoundNBT compound) {

    }

    @Override
    protected void writeAdditional(CompoundNBT compound) {

    }

    @Override
    public void tick() {
        super.tick();
        if (source == null) {
            source = getPosition();
        }
        if (!world.isRemote) {
            if (getPassengers().isEmpty() || world.isAirBlock(source)) {
                remove();
                world.updateComparatorOutputLevel(getPosition(), world.getBlockState(getPosition()).getBlock());
            }
        }
    }

    @Override
    protected boolean canBeRidden(Entity entity) {
        return true;
    }

    @Override
    public IPacket<?> createSpawnPacket() {
        return NetworkHooks.getEntitySpawningPacket(this);
    }

    public static boolean createSeat(World world, BlockPos pos, double yOffset, PlayerEntity player) {
        if (!world.isRemote) {
            // Get a list of chair entities within a 1-block bounding box of the position
            List<ChairEntity> chairs = world.getEntitiesWithinAABB(ChairEntity.class, new AxisAlignedBB(pos.getX(), pos.getY(), pos.getZ(),
                    pos.getX() + 1d, pos.getY() + 1d, pos.getZ() + 1d));

            // If there are no entities in that space, then we can create one and start "riding" the chair (to sit down)
            if (chairs.isEmpty()) {
                ChairEntity chair = new ChairEntity(world, pos, yOffset);
                world.addEntity(chair);
                player.startRiding(chair, true);
            }
        }
        return true;
    }
}
