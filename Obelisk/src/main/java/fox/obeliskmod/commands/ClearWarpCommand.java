package fox.obeliskmod.commands;

import com.mojang.brigadier.CommandDispatcher;
import fox.obeliskmod.warps.WarpPosition;
import net.minecraft.command.CommandSource;
import net.minecraft.command.Commands;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;

import static com.mojang.brigadier.arguments.StringArgumentType.getString;
import static com.mojang.brigadier.arguments.StringArgumentType.string;
import static fox.obeliskmod.ObeliskMod.warpDestinations;

public final class ClearWarpCommand {

    private ClearWarpCommand() {}

    public static void register(CommandDispatcher<CommandSource> dispatcher) {
        dispatcher.register(Commands.literal("clearwarp")
                .then(Commands.argument("WaypointName", string())
                        .executes(context -> {
                            clearWarp(context.getSource(), getString(context, "WaypointName"));
                            return 1;
                        }))
        );
    }

    private static void clearWarp(CommandSource source, String waypointName) {
        if (!(warpDestinations.containsKey(waypointName))) {
            source.sendFeedback(new StringTextComponent("Warp does not exist: ").applyTextStyles(TextFormatting.DARK_GRAY, TextFormatting.ITALIC)
                            .appendSibling(new StringTextComponent(waypointName).applyTextStyles(TextFormatting.GOLD)),
                    false);
            return;
        }

        WarpPosition posRemoved = warpDestinations.remove(waypointName);

        source.sendFeedback(new StringTextComponent("Removed warp ").applyTextStyles(TextFormatting.DARK_RED, TextFormatting.ITALIC, TextFormatting.BOLD)
                .appendSibling(new StringTextComponent(waypointName).applyTextStyles(TextFormatting.GOLD))
                .appendSibling(new StringTextComponent(" at position: " + posRemoved.toString()).applyTextStyles(TextFormatting.DARK_RED, TextFormatting.ITALIC, TextFormatting.BOLD)),
                true);
    }
}
