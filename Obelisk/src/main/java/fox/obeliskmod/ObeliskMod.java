package fox.obeliskmod;

import fox.obeliskmod.client.render.ObeliskRenderRegistry;
import fox.obeliskmod.commands.ClearWarpCommand;
import fox.obeliskmod.commands.ListWarpsCommand;
import fox.obeliskmod.commands.SetWarpCommand;
import fox.obeliskmod.commands.WarpCommand;
import fox.obeliskmod.config.Config;
import fox.obeliskmod.itemgroups.*;
import fox.obeliskmod.warps.WarpPosition;

import fox.obeliskmod.warps.WarpUtils;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.event.server.FMLServerStoppingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLPaths;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;
import java.util.Map;

@Mod("obeliskmod")
public class ObeliskMod 
{
	public static ObeliskMod instance;
	public static final String modid = "obeliskmod";
	public static final Logger logger = LogManager.getLogger(modid);
	
	public static final ItemGroup obelisk = new ObeliskItemGroup();
	public static final ItemGroup misc = new ObeliskMiscItemGroup();
	public static final ItemGroup furniture = new ObeliskFurnitureItemGroup();
	public static final ItemGroup customBlocks = new ObeliskCustomBlocksItemGroup();
	public static final ItemGroup advancedTools = new ObeliskAdvancedToolsGroup();
	public static final ItemGroup weapon = new ObeliskWeaponItemGroup();

	public static final String warpDataFile = "Config\\WarpCommands\\WarpList.rbf";
	public static Map<String, WarpPosition> warpDestinations = new HashMap<String, WarpPosition>();
	
	public ObeliskMod() 
	{
		instance = this;
		
		ModLoadingContext.get().registerConfig(ModConfig.Type.SERVER, Config.server_config);
		ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, Config.client_config);
		
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientRegistries);
		
		Config.loadConfig(Config.client_config, FMLPaths.CONFIGDIR.get().resolve("obeliskmod-client.toml").toString());
		Config.loadConfig(Config.server_config, FMLPaths.CONFIGDIR.get().resolve("obeliskmod-server.toml").toString());


		
		MinecraftForge.EVENT_BUS.register(this);
	}
	
	private void setup(final FMLCommonSetupEvent event) 
	{
		logger.info("Setup method registered");
	}
	
	private void clientRegistries(final FMLClientSetupEvent event) 
	{
		ObeliskRenderRegistry.registryEntityRender();

		logger.info("clientRegistries method registered");
	}

	@SubscribeEvent
	public void onServerStarting(FMLServerStartingEvent event) {
		// do something when the server starts
		ObeliskMod.logger.info("Starting up server functions...");

		// Check to see if there are any saved warps upon startup
		WarpUtils.loadWarpData();

		// Register commands
		WarpCommand.register(event.getCommandDispatcher());
		SetWarpCommand.register(event.getCommandDispatcher());
		ClearWarpCommand.register(event.getCommandDispatcher());
		ListWarpsCommand.register(event.getCommandDispatcher());
	}

	@SubscribeEvent
	public void onServerStopping(FMLServerStoppingEvent event) {
		// Save any existing warps to a datafile upon closing the server connection
		WarpUtils.saveWarpData();
	}
}