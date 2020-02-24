package fox.obeliskmod.commands;

import com.mojang.brigadier.CommandDispatcher;
import fox.obeliskmod.ObeliskMod;
import fox.obeliskmod.warps.WarpPosition;
import fox.obeliskmod.warps.WarpTarget;
import net.minecraft.command.CommandSource;
import net.minecraft.command.Commands;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import org.apache.commons.io.FileUtils;

import java.io.*;
import java.util.HashMap;

import static com.mojang.brigadier.arguments.StringArgumentType.getString;
import static com.mojang.brigadier.arguments.StringArgumentType.string;
import static fox.obeliskmod.ObeliskMod.warpDataFile;
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

    /**
     * This function is used to de-serialize the database of warps for de-serialization upon re-establishing the server connection
     * (i.e. server restarts)
     */
    public static void loadWarpData() {
        try {
            File file = new File(warpDataFile);
            FileInputStream fileIn = FileUtils.openInputStream(file);
            BufferedInputStream buffIn = new BufferedInputStream(fileIn);
            ObjectInputStream objIn = new ObjectInputStream(buffIn);
            warpDestinations = (HashMap)objIn.readObject();
            objIn.close();
            fileIn.close();
        } catch (Exception ex) {
            ObeliskMod.logger.error(ex);
        }

        StringBuffer debugString = new StringBuffer();
        for (String warpName : warpDestinations.keySet()) {
            debugString.append(warpName + ", ");
        }
        ObeliskMod.logger.debug("Deserialized warps: " + debugString.toString());
    }

    /**
     * This function is used to serialize the database of warps for de-serialization upon re-establishing the server connection
     * (i.e. server restarts)
     */
    public static void saveWarpData() {
        try {
            File file = new File(warpDataFile);
            FileOutputStream fileOut = FileUtils.openOutputStream(file, false);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(warpDestinations);
            objectOut.close();
            fileOut.close();

            ObeliskMod.logger.info("Successfully saved warp database to file: " + warpDataFile);
        } catch (Exception ex) {
            ObeliskMod.logger.error(ex);
        }
    }
}
