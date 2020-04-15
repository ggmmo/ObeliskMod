package fox.obeliskmod.config;

import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.common.ForgeConfigSpec;

public class ChatColorConfig {
    public static final String SUBCATEGORY_CHATCOLOR = "chatcolor";

    public static ForgeConfigSpec.EnumValue<TextFormatting> fox_chat_color;
    public static ForgeConfigSpec.EnumValue<TextFormatting> pale_chat_color;
    public static ForgeConfigSpec.EnumValue<TextFormatting> trepi_chat_color;
    public static ForgeConfigSpec.EnumValue<TextFormatting> callum_chat_color;
    public static ForgeConfigSpec.EnumValue<TextFormatting> brand_chat_color;
    public static ForgeConfigSpec.EnumValue<TextFormatting> marcus_chat_color;
    public static ForgeConfigSpec.EnumValue<TextFormatting> meibei_chat_color;

    public static ForgeConfigSpec.EnumValue<TextFormatting> test_user_color;
    public static ForgeConfigSpec.EnumValue<TextFormatting> default_color;

    public static void init(ForgeConfigSpec.Builder server,ForgeConfigSpec.Builder client) {
        server.comment("General Settings").push(Config.CATEGORY_GENERAL);

        server.comment("Chat Color Settings").push(SUBCATEGORY_CHATCOLOR);
        fox_chat_color = server
                .defineEnum("dishonored_fox", TextFormatting.BLUE, TextFormatting.values());

        pale_chat_color = server
                .defineEnum("the_pale_one", TextFormatting.DARK_GREEN, TextFormatting.values());

        trepi_chat_color = server
                .defineEnum("intrepid249", TextFormatting.LIGHT_PURPLE, TextFormatting.values());

        callum_chat_color = server
                .defineEnum("soundblast3r", TextFormatting.DARK_RED, TextFormatting.values());

        brand_chat_color = server
                .defineEnum("branditicus", TextFormatting.AQUA, TextFormatting.values());

        marcus_chat_color = server
                .defineEnum("mucusinator", TextFormatting.GREEN, TextFormatting.values());

        meibei_chat_color = server
                .defineEnum("meibei", TextFormatting.DARK_AQUA, TextFormatting.values());

        test_user_color = server
                .defineEnum("dev", TextFormatting.GOLD, TextFormatting.values());

        default_color = server
                .defineEnum("default", TextFormatting.RESET, TextFormatting.values());
        server.pop();

        server.pop();
    }
}
