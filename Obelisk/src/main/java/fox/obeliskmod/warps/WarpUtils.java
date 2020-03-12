package fox.obeliskmod.warps;

import fox.obeliskmod.ObeliskMod;
import org.apache.commons.io.FileUtils;

import java.io.*;
import java.util.HashMap;

import static fox.obeliskmod.ObeliskMod.warpDataFile;
import static fox.obeliskmod.ObeliskMod.warpDestinations;

public class WarpUtils {
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
