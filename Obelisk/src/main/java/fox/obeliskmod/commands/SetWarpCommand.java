package fox.obeliskmod.commands;

import com.mojang.brigadier.CommandDispatcher;
import fox.obeliskmod.warps.WarpPosition;
import fox.obeliskmod.warps.WarpTarget;
import net.minecraft.command.CommandSource;
import net.minecraft.command.Commands;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;

import static com.mojang.brigadier.arguments.StringArgumentType.getString;
import static com.mojang.brigadier.arguments.StringArgumentType.string;
import static fox.obeliskmod.ObeliskMod.warpDestinations;

public final class SetWarpCommand {

    private SetWarpCommand() {
    }

    public static void register(CommandDispatcher<CommandSource> dispatcher) {
        dispatcher.register(Commands.literal("setwarp")
                .then(Commands.argument("WaypointName", string())
                        .executes(context -> {
                            createNewWarp(context.getSource(), getString(context, "WaypointName"), context.getSource().asPlayer().getPosition());
                            return 1;
                        })
                ));
    }

    private static void createNewWarp(CommandSource source, String waypointName, BlockPos waypointLocation) {
        WarpTarget warpTarget = new WarpTarget(waypointName, new WarpPosition(waypointLocation.getX(), waypointLocation.getY(), waypointLocation.getZ()));

        warpDestinations.put(warpTarget.getName(), warpTarget.getPosition());
        source.sendFeedback(new StringTextComponent("Successfully created warp: " + warpTarget.toString()).applyTextStyles(TextFormatting.DARK_GRAY, TextFormatting.ITALIC), true);
    }
}
