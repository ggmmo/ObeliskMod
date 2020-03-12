package fox.obeliskmod.commands;

import com.mojang.brigadier.CommandDispatcher;
import fox.obeliskmod.ObeliskMod;
import net.minecraft.command.CommandSource;
import net.minecraft.command.Commands;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;

import static com.mojang.brigadier.arguments.StringArgumentType.getString;
import static com.mojang.brigadier.arguments.StringArgumentType.string;
import static fox.obeliskmod.ObeliskMod.warpDestinations;

public final class WarpCommand {
    private WarpCommand() {}

    public static void register(CommandDispatcher<CommandSource> dispatcher) {
        dispatcher.register(Commands.literal("warp")
                .then(Commands.argument("WaypointName", string())
                        .executes(context -> {
                            return warpToWaypoint(context.getSource(), getString(context, "WaypointName"), context.getSource().asPlayer());
                        })
                ));
    }

    private static int warpToWaypoint(CommandSource source, String waypointName, ServerPlayerEntity serverPlayerEntity) {
        if (!(warpDestinations.containsKey(waypointName))) {
            source.sendFeedback(new StringTextComponent("Warp does not exist: ").applyTextStyles(TextFormatting.DARK_GRAY, TextFormatting.ITALIC)
                            .appendSibling(new StringTextComponent(waypointName).applyTextStyles(TextFormatting.GOLD)),
                    false);
            return -1;
        }

        BlockPos targetPos = ObeliskMod.warpDestinations.get(waypointName).getBlockPos();
        serverPlayerEntity.teleport(serverPlayerEntity.getServerWorld(), targetPos.getX(), targetPos.getY(), targetPos.getZ(), serverPlayerEntity.rotationYaw, serverPlayerEntity.rotationPitch);

        source.sendFeedback(new StringTextComponent("[" + serverPlayerEntity.getDisplayName().getString() + "] Warped to location: " + waypointName)
                .applyTextStyles(TextFormatting.DARK_GREEN, TextFormatting.ITALIC), true);

        return 1;
    }
}
