package fox.obeliskmod.events;

import fox.obeliskmod.ObeliskMod;
import fox.obeliskmod.config.ChatColorConfig;
import fox.obeliskmod.config.Config;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.management.PlayerList;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.event.ServerChatEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.server.ServerMain;

import java.util.List;

@Mod.EventBusSubscriber
public class ChatEvents {
    private static String colorPath = Config.CATEGORY_GENERAL + "." + ChatColorConfig.SUBCATEGORY_CHATCOLOR + ".";
    private static ForgeConfigSpec serverConfig = Config.server_config;

    @SubscribeEvent
    public static void handleServerChat(ServerChatEvent event) {

        TextFormatting userColor = ChatColorConfig.default_color.get();
        String username = event.getUsername().toLowerCase();

        if (serverConfig.contains(colorPath + username)) {
            if (username.equals("intrepid249"))
                userColor = ChatColorConfig.trepi_chat_color.get();
            if (username.equals("soundblast3r"))
                userColor = ChatColorConfig.callum_chat_color.get();
            if (username.equals("meibei"))
                userColor = ChatColorConfig.meibei_chat_color.get();
            if (username.equals("mucusinator"))
                userColor = ChatColorConfig.marcus_chat_color.get();
            if (username.equals("the_pale_one"))
                userColor = ChatColorConfig.pale_chat_color.get();
            if (username.equals("dishonored_fox"))
                userColor = ChatColorConfig.fox_chat_color.get();
            if (username.equals("branditicus"))
                userColor = ChatColorConfig.brand_chat_color.get();
            if (username.equals("dev")) {
                userColor = ChatColorConfig.test_user_color.get();
            }

        }

        // Send the original message with additional color formatting
//        event.getPlayer().sendMessage(new StringTextComponent("<" + event.getUsername() + "> " + event.getMessage())
//                .applyTextStyle(userColor));
        List<ServerPlayerEntity> players = event.getPlayer().getServer().getPlayerList().getPlayers();

        for (ServerPlayerEntity receiver : players) {
            receiver.sendMessage(new StringTextComponent("<" + event.getUsername() + "> " + event.getMessage())
                    .applyTextStyle(userColor));
        }

        // Don't send the original unformatted message
        event.setCanceled(true);
    }
}
