package fox.obeliskmod;

import fox.obeliskmod.itemgroups.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import fox.obeliskmod.client.render.ObeliskRenderRegistry;
import fox.obeliskmod.config.Config;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLPaths;

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
}