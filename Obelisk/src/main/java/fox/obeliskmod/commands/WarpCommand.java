package fox.obeliskmod.commands;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.StringArgumentType;
import fox.obeliskmod.ObeliskMod;
import net.minecraft.command.CommandSource;
import net.minecraft.command.Commands;

import static com.mojang.brigadier.arguments.StringArgumentType.getString;
import static com.mojang.brigadier.arguments.StringArgumentType.string;

public final class WarpCommand {
    private WarpCommand() {}

    public static void register(CommandDispatcher<CommandSource> dispatcher) {
        dispatcher.register(Commands.literal("warp")
                .then(Commands.argument("WaypointName", string())
                        .executes(context -> {
                            warpToWaypoint(getString(context, "WaypointName"));
                            return 1;
                        })
                ));
    }

    private static int warpToWaypoint(String waypointName) {
        ObeliskMod.logger.debug("Warping to: " + waypointName);

        return 1;
    }
}
