package fox.obeliskmod.commands;

import com.mojang.brigadier.CommandDispatcher;
import fox.obeliskmod.ObeliskMod;
import net.minecraft.command.CommandSource;
import net.minecraft.command.Commands;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;

public class ListWarpsCommand {
    public static void register(CommandDispatcher<CommandSource> dispatcher) {
        dispatcher.register(Commands.literal("warps")
                .executes(context -> {
                    listWarps(context.getSource());
                    return 1;
                })
        );
    }

    private static void listWarps(CommandSource source) {
        Object[] warpNames = ObeliskMod.warpDestinations.keySet().toArray();
        StringBuffer outputText = new StringBuffer();
        for (int i = 0; i < warpNames.length; i++) {
            outputText.append(warpNames[i]);
            if (i != warpNames.length - 1) {
                outputText.append(", ");
            }
        }

        if (warpNames.length <= 0)
            source.sendFeedback(new StringTextComponent("No warps to display!").applyTextStyles(TextFormatting.DARK_GRAY, TextFormatting.ITALIC), false);
        else
            source.sendFeedback(new StringTextComponent("Warps: ").applyTextStyle(TextFormatting.YELLOW)
                    .appendSibling(new StringTextComponent(outputText.toString()).applyTextStyle(TextFormatting.GOLD)), false);
    }
}
