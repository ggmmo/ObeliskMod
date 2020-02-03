package fox.obeliskmod;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import fox.obeliskmod.blocks.CustomSnowBlock;
import fox.obeliskmod.blocks.CustomStairsBlock;
import fox.obeliskmod.blocks.VertSlabBlock;
import fox.obeliskmod.lists.BlockList;
import fox.obeliskmod.lists.EntitiesList;
import fox.obeliskmod.lists.ItemList;
import net.minecraft.block.Block;
import net.minecraft.block.CauldronBlock;
import net.minecraft.block.FenceBlock;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.SnowBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.WallBlock;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemTier;
import net.minecraft.item.SwordItem;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
public class ObeliskModRegistries
{

	public static final String modid = "obeliskmod";
	private static final Logger logger = LogManager.getLogger(modid);
	public static final ItemGroup obelisk = ObeliskMod.obelisk;
	public static final ItemGroup misc = ObeliskMod.misc;
	
	@SubscribeEvent
	public static void registerItems(final RegistryEvent.Register<Item> event) 
	{
		event.getRegistry().registerAll
		(
					
		//Items
		ItemList.copper_coin = new Item(new Item.Properties().group(misc)).setRegistryName(location("copper_coin")),
		ItemList.silver_coin = new Item(new Item.Properties().group(misc)).setRegistryName(location("silver_coin")),
		ItemList.gold_coin = new Item(new Item.Properties().group(misc)).setRegistryName(location("gold_coin")),
			
		//Weapons
		ItemList.stone_dagger = new SwordItem(ItemTier.STONE, 1, -1, new Item.Properties().group(misc)).setRegistryName(location("stone_dagger")),
		ItemList.iron_dagger = new SwordItem(ItemTier.IRON, 1, -1, new Item.Properties().group(misc)).setRegistryName(location("iron_dagger")),
		ItemList.long_sword = new SwordItem(ItemTier.IRON, 2, -1, new Item.Properties().group(misc)).setRegistryName(location("long_sword")),
		//ItemList.sling = (BowItem) = new CustomBow(null),
		
		
			
		//Blocks
		ItemList.earth_obelisk_block = new BlockItem(BlockList.earth_obelisk_block, new Item.Properties().group(obelisk)).setRegistryName(BlockList.earth_obelisk_block.getRegistryName()),
		ItemList.earth_obelisk_wall = new BlockItem(BlockList.earth_obelisk_wall, new Item.Properties().group(obelisk)).setRegistryName(BlockList.earth_obelisk_wall.getRegistryName()),
		ItemList.earth_obelisk_slab = new BlockItem(BlockList.earth_obelisk_slab, new Item.Properties().group(obelisk)).setRegistryName(BlockList.earth_obelisk_slab.getRegistryName()),
		ItemList.earth_obelisk_stairs = new BlockItem(BlockList.earth_obelisk_stairs, new Item.Properties().group(obelisk)).setRegistryName(BlockList.earth_obelisk_stairs.getRegistryName()),
		ItemList.dirt_slab = new BlockItem(BlockList.dirt_slab, new Item.Properties().group(obelisk)).setRegistryName(BlockList.dirt_slab.getRegistryName()),
		ItemList.dirt_wall = new BlockItem(BlockList.dirt_wall, new Item.Properties().group(obelisk)).setRegistryName(BlockList.dirt_wall.getRegistryName()),
		ItemList.dirt_stairs = new BlockItem(BlockList.dirt_stairs, new Item.Properties().group(obelisk)).setRegistryName(BlockList.dirt_stairs.getRegistryName()),
		ItemList.coarse_dirt_wall = new BlockItem(BlockList.coarse_dirt_wall, new Item.Properties().group(obelisk)).setRegistryName(BlockList.coarse_dirt_wall.getRegistryName()),
		ItemList.coarse_dirt_slab = new BlockItem(BlockList.coarse_dirt_slab, new Item.Properties().group(obelisk)).setRegistryName(BlockList.coarse_dirt_slab.getRegistryName()),
		ItemList.coarse_dirt_stairs = new BlockItem(BlockList.coarse_dirt_stairs, new Item.Properties().group(obelisk)).setRegistryName(BlockList.coarse_dirt_stairs.getRegistryName()),
		ItemList.sand_slab = new BlockItem(BlockList.sand_slab, new Item.Properties().group(obelisk)).setRegistryName(BlockList.sand_slab.getRegistryName()),
		ItemList.sand_wall = new BlockItem(BlockList.sand_wall, new Item.Properties().group(obelisk)).setRegistryName(BlockList.sand_wall.getRegistryName()),
		ItemList.sand_stairs = new BlockItem(BlockList.sand_stairs, new Item.Properties().group(obelisk)).setRegistryName(BlockList.sand_stairs.getRegistryName()),
		ItemList.oak_wood_stairs = new BlockItem(BlockList.oak_wood_stairs, new Item.Properties().group(obelisk)).setRegistryName(BlockList.oak_wood_stairs.getRegistryName()),
		ItemList.oak_wood_slab = new BlockItem(BlockList.oak_wood_slab, new Item.Properties().group(obelisk)).setRegistryName(BlockList.oak_wood_slab.getRegistryName()),
		ItemList.oak_wood_wall = new BlockItem(BlockList.oak_wood_wall, new Item.Properties().group(obelisk)).setRegistryName(BlockList.oak_wood_wall.getRegistryName()),
		ItemList.oak_log_stairs = new BlockItem(BlockList.oak_log_stairs, new Item.Properties().group(obelisk)).setRegistryName(BlockList.oak_log_stairs.getRegistryName()),
		ItemList.oak_log_slab = new BlockItem(BlockList.oak_log_slab, new Item.Properties().group(obelisk)).setRegistryName(BlockList.oak_log_slab.getRegistryName()),
		ItemList.oak_log_wall = new BlockItem(BlockList.oak_log_wall, new Item.Properties().group(obelisk)).setRegistryName(BlockList.oak_log_wall.getRegistryName()),
		ItemList.spruce_log_stairs = new BlockItem(BlockList.spruce_log_stairs, new Item.Properties().group(obelisk)).setRegistryName(BlockList.spruce_log_stairs.getRegistryName()),
		ItemList.spruce_log_slab = new BlockItem(BlockList.spruce_log_slab, new Item.Properties().group(obelisk)).setRegistryName(BlockList.spruce_log_slab.getRegistryName()),
		ItemList.spruce_log_wall = new BlockItem(BlockList.spruce_log_wall, new Item.Properties().group(obelisk)).setRegistryName(BlockList.spruce_log_wall.getRegistryName()),
		ItemList.spruce_wood_stairs = new BlockItem(BlockList.spruce_wood_stairs, new Item.Properties().group(obelisk)).setRegistryName(BlockList.spruce_wood_stairs.getRegistryName()),
		ItemList.spruce_wood_slab = new BlockItem(BlockList.spruce_wood_slab, new Item.Properties().group(obelisk)).setRegistryName(BlockList.spruce_wood_slab.getRegistryName()),
		ItemList.spruce_wood_wall = new BlockItem(BlockList.spruce_wood_wall, new Item.Properties().group(obelisk)).setRegistryName(BlockList.spruce_wood_wall.getRegistryName()),
		ItemList.dark_oak_log_stairs = new BlockItem(BlockList.dark_oak_log_stairs, new Item.Properties().group(obelisk)).setRegistryName(BlockList.dark_oak_log_stairs.getRegistryName()),
		ItemList.dark_oak_log_slab = new BlockItem(BlockList.dark_oak_log_slab, new Item.Properties().group(obelisk)).setRegistryName(BlockList.dark_oak_log_slab.getRegistryName()),
		ItemList.dark_oak_log_wall = new BlockItem(BlockList.dark_oak_log_wall, new Item.Properties().group(obelisk)).setRegistryName(BlockList.dark_oak_log_wall.getRegistryName()),
		ItemList.dark_oak_wood_stairs = new BlockItem(BlockList.dark_oak_wood_stairs, new Item.Properties().group(obelisk)).setRegistryName(BlockList.dark_oak_wood_stairs.getRegistryName()),
		ItemList.dark_oak_wood_slab = new BlockItem(BlockList.dark_oak_wood_slab, new Item.Properties().group(obelisk)).setRegistryName(BlockList.dark_oak_wood_slab.getRegistryName()),
		ItemList.dark_oak_wood_wall = new BlockItem(BlockList.dark_oak_wood_wall, new Item.Properties().group(obelisk)).setRegistryName(BlockList.dark_oak_wood_wall.getRegistryName()),
		ItemList.birch_log_stairs = new BlockItem(BlockList.birch_log_stairs, new Item.Properties().group(obelisk)).setRegistryName(BlockList.birch_log_stairs.getRegistryName()),
		ItemList.birch_log_slab = new BlockItem(BlockList.birch_log_slab, new Item.Properties().group(obelisk)).setRegistryName(BlockList.birch_log_slab.getRegistryName()),
		ItemList.birch_log_wall = new BlockItem(BlockList.birch_log_wall, new Item.Properties().group(obelisk)).setRegistryName(BlockList.birch_log_wall.getRegistryName()),
		ItemList.birch_wood_stairs = new BlockItem(BlockList.birch_wood_stairs, new Item.Properties().group(obelisk)).setRegistryName(BlockList.birch_wood_stairs.getRegistryName()),
		ItemList.birch_wood_slab = new BlockItem(BlockList.birch_wood_slab, new Item.Properties().group(obelisk)).setRegistryName(BlockList.birch_wood_slab.getRegistryName()),
		ItemList.birch_wood_wall = new BlockItem(BlockList.birch_wood_wall, new Item.Properties().group(obelisk)).setRegistryName(BlockList.birch_wood_wall.getRegistryName()),
		ItemList.acacia_log_stairs = new BlockItem(BlockList.acacia_log_stairs, new Item.Properties().group(obelisk)).setRegistryName(BlockList.acacia_log_stairs.getRegistryName()),
		ItemList.acacia_log_slab = new BlockItem(BlockList.acacia_log_slab, new Item.Properties().group(obelisk)).setRegistryName(BlockList.acacia_log_slab.getRegistryName()),
		ItemList.acacia_log_wall = new BlockItem(BlockList.acacia_log_wall, new Item.Properties().group(obelisk)).setRegistryName(BlockList.acacia_log_wall.getRegistryName()),
		ItemList.acacia_wood_stairs = new BlockItem(BlockList.acacia_wood_stairs, new Item.Properties().group(obelisk)).setRegistryName(BlockList.acacia_wood_stairs.getRegistryName()),
		ItemList.acacia_wood_slab = new BlockItem(BlockList.acacia_wood_slab, new Item.Properties().group(obelisk)).setRegistryName(BlockList.acacia_wood_slab.getRegistryName()),
		ItemList.acacia_wood_wall = new BlockItem(BlockList.acacia_wood_wall, new Item.Properties().group(obelisk)).setRegistryName(BlockList.acacia_wood_wall.getRegistryName()),
		ItemList.jungle_log_stairs = new BlockItem(BlockList.jungle_log_stairs, new Item.Properties().group(obelisk)).setRegistryName(BlockList.jungle_log_stairs.getRegistryName()),
		ItemList.jungle_log_slab = new BlockItem(BlockList.jungle_log_slab, new Item.Properties().group(obelisk)).setRegistryName(BlockList.jungle_log_slab.getRegistryName()),
		ItemList.jungle_log_wall = new BlockItem(BlockList.jungle_log_wall, new Item.Properties().group(obelisk)).setRegistryName(BlockList.jungle_log_wall.getRegistryName()),
		ItemList.jungle_wood_stairs = new BlockItem(BlockList.jungle_wood_stairs, new Item.Properties().group(obelisk)).setRegistryName(BlockList.jungle_wood_stairs.getRegistryName()),
		ItemList.jungle_wood_slab = new BlockItem(BlockList.jungle_wood_slab, new Item.Properties().group(obelisk)).setRegistryName(BlockList.jungle_wood_slab.getRegistryName()),
		ItemList.jungle_wood_wall = new BlockItem(BlockList.jungle_wood_wall, new Item.Properties().group(obelisk)).setRegistryName(BlockList.jungle_wood_wall.getRegistryName()),
		ItemList.oak_planks_wall = new BlockItem(BlockList.oak_planks_wall, new Item.Properties().group(obelisk)).setRegistryName(BlockList.oak_planks_wall.getRegistryName()),
		ItemList.spruce_planks_wall = new BlockItem(BlockList.spruce_planks_wall, new Item.Properties().group(obelisk)).setRegistryName(BlockList.spruce_planks_wall.getRegistryName()),
		ItemList.dark_oak_planks_wall = new BlockItem(BlockList.dark_oak_planks_wall, new Item.Properties().group(obelisk)).setRegistryName(BlockList.dark_oak_planks_wall.getRegistryName()),
		ItemList.birch_planks_wall = new BlockItem(BlockList.birch_planks_wall, new Item.Properties().group(obelisk)).setRegistryName(BlockList.birch_planks_wall.getRegistryName()),
		ItemList.acacia_planks_wall = new BlockItem(BlockList.acacia_planks_wall, new Item.Properties().group(obelisk)).setRegistryName(BlockList.acacia_planks_wall.getRegistryName()),
		ItemList.jungle_planks_wall = new BlockItem(BlockList.jungle_planks_wall, new Item.Properties().group(obelisk)).setRegistryName(BlockList.jungle_planks_wall.getRegistryName()),
		ItemList.stripped_oak_wood_stairs = new BlockItem(BlockList.stripped_oak_wood_stairs, new Item.Properties().group(obelisk)).setRegistryName(BlockList.stripped_oak_wood_stairs.getRegistryName()),
		ItemList.stripped_oak_wood_slab = new BlockItem(BlockList.stripped_oak_wood_slab, new Item.Properties().group(obelisk)).setRegistryName(BlockList.stripped_oak_wood_slab.getRegistryName()),
		ItemList.stripped_oak_wood_wall = new BlockItem(BlockList.stripped_oak_wood_wall, new Item.Properties().group(obelisk)).setRegistryName(BlockList.stripped_oak_wood_wall.getRegistryName()),
		ItemList.stripped_spruce_wood_stairs = new BlockItem(BlockList.stripped_spruce_wood_stairs, new Item.Properties().group(obelisk)).setRegistryName(BlockList.stripped_spruce_wood_stairs.getRegistryName()),
		ItemList.stripped_spruce_wood_slab = new BlockItem(BlockList.stripped_spruce_wood_slab, new Item.Properties().group(obelisk)).setRegistryName(BlockList.stripped_spruce_wood_slab.getRegistryName()),
		ItemList.stripped_spruce_wood_wall = new BlockItem(BlockList.stripped_spruce_wood_wall, new Item.Properties().group(obelisk)).setRegistryName(BlockList.stripped_spruce_wood_wall.getRegistryName()),
		ItemList.stripped_dark_oak_wood_stairs = new BlockItem(BlockList.stripped_dark_oak_wood_stairs, new Item.Properties().group(obelisk)).setRegistryName(BlockList.stripped_dark_oak_wood_stairs.getRegistryName()),
		ItemList.stripped_dark_oak_wood_slab = new BlockItem(BlockList.stripped_dark_oak_wood_slab, new Item.Properties().group(obelisk)).setRegistryName(BlockList.stripped_dark_oak_wood_slab.getRegistryName()),
		ItemList.stripped_dark_oak_wood_wall = new BlockItem(BlockList.stripped_dark_oak_wood_wall, new Item.Properties().group(obelisk)).setRegistryName(BlockList.stripped_dark_oak_wood_wall.getRegistryName()),
		ItemList.stripped_birch_wood_stairs = new BlockItem(BlockList.stripped_birch_wood_stairs, new Item.Properties().group(obelisk)).setRegistryName(BlockList.stripped_birch_wood_stairs.getRegistryName()),
		ItemList.stripped_birch_wood_slab = new BlockItem(BlockList.stripped_birch_wood_slab, new Item.Properties().group(obelisk)).setRegistryName(BlockList.stripped_birch_wood_slab.getRegistryName()),
		ItemList.stripped_birch_wood_wall = new BlockItem(BlockList.stripped_birch_wood_wall, new Item.Properties().group(obelisk)).setRegistryName(BlockList.stripped_birch_wood_wall.getRegistryName()),
		ItemList.stripped_acacia_wood_stairs = new BlockItem(BlockList.stripped_acacia_wood_stairs, new Item.Properties().group(obelisk)).setRegistryName(BlockList.stripped_acacia_wood_stairs.getRegistryName()),
		ItemList.stripped_acacia_wood_slab = new BlockItem(BlockList.stripped_acacia_wood_slab, new Item.Properties().group(obelisk)).setRegistryName(BlockList.stripped_acacia_wood_slab.getRegistryName()),
		ItemList.stripped_acacia_wood_wall = new BlockItem(BlockList.stripped_acacia_wood_wall, new Item.Properties().group(obelisk)).setRegistryName(BlockList.stripped_acacia_wood_wall.getRegistryName()),
		ItemList.stripped_jungle_wood_stairs = new BlockItem(BlockList.stripped_jungle_wood_stairs, new Item.Properties().group(obelisk)).setRegistryName(BlockList.stripped_jungle_wood_stairs.getRegistryName()),
		ItemList.stripped_jungle_wood_slab = new BlockItem(BlockList.stripped_jungle_wood_slab, new Item.Properties().group(obelisk)).setRegistryName(BlockList.stripped_jungle_wood_slab.getRegistryName()),
		ItemList.stripped_jungle_wood_wall = new BlockItem(BlockList.stripped_jungle_wood_wall, new Item.Properties().group(obelisk)).setRegistryName(BlockList.stripped_jungle_wood_wall.getRegistryName()),
		ItemList.oak_wood_fence = new BlockItem(BlockList.oak_wood_fence, new Item.Properties().group(obelisk)).setRegistryName(BlockList.oak_wood_fence.getRegistryName()),
		ItemList.spruce_wood_fence = new BlockItem(BlockList.spruce_wood_fence, new Item.Properties().group(obelisk)).setRegistryName(BlockList.spruce_wood_fence.getRegistryName()),
		ItemList.dark_oak_wood_fence = new BlockItem(BlockList.dark_oak_wood_fence, new Item.Properties().group(obelisk)).setRegistryName(BlockList.dark_oak_wood_fence.getRegistryName()),
		ItemList.birch_wood_fence = new BlockItem(BlockList.birch_wood_fence, new Item.Properties().group(obelisk)).setRegistryName(BlockList.birch_wood_fence.getRegistryName()),
		ItemList.acacia_wood_fence = new BlockItem(BlockList.acacia_wood_fence, new Item.Properties().group(obelisk)).setRegistryName(BlockList.acacia_wood_fence.getRegistryName()),
		ItemList.jungle_wood_fence = new BlockItem(BlockList.jungle_wood_fence, new Item.Properties().group(obelisk)).setRegistryName(BlockList.jungle_wood_fence.getRegistryName()),
		ItemList.dirt_fence = new BlockItem(BlockList.dirt_fence, new Item.Properties().group(obelisk)).setRegistryName(BlockList.dirt_fence.getRegistryName()),
		ItemList.coarse_dirt_fence = new BlockItem(BlockList.coarse_dirt_fence, new Item.Properties().group(obelisk)).setRegistryName(BlockList.coarse_dirt_fence.getRegistryName()),
		ItemList.stone_fence = new BlockItem(BlockList.stone_fence, new Item.Properties().group(obelisk)).setRegistryName(BlockList.stone_fence.getRegistryName()),
		ItemList.cobblestone_fence = new BlockItem(BlockList.cobblestone_fence, new Item.Properties().group(obelisk)).setRegistryName(BlockList.cobblestone_fence.getRegistryName()),
		ItemList.stone_brick_fence = new BlockItem(BlockList.stone_brick_fence, new Item.Properties().group(obelisk)).setRegistryName(BlockList.stone_brick_fence.getRegistryName()),
		ItemList.mossy_stone_brick_fence = new BlockItem(BlockList.mossy_stone_brick_fence, new Item.Properties().group(obelisk)).setRegistryName(BlockList.mossy_stone_brick_fence.getRegistryName()),
		ItemList.earth_obelisk_fence = new BlockItem(BlockList.earth_obelisk_fence, new Item.Properties().group(obelisk)).setRegistryName(BlockList.earth_obelisk_fence.getRegistryName()),
		ItemList.red_sand_stairs = new BlockItem(BlockList.red_sand_stairs, new Item.Properties().group(obelisk)).setRegistryName(BlockList.red_sand_stairs.getRegistryName()),
		ItemList.red_sand_slab = new BlockItem(BlockList.red_sand_slab, new Item.Properties().group(obelisk)).setRegistryName(BlockList.red_sand_slab.getRegistryName()),
		ItemList.red_sand_wall = new BlockItem(BlockList.red_sand_wall, new Item.Properties().group(obelisk)).setRegistryName(BlockList.red_sand_wall.getRegistryName()),
		ItemList.dirt_snow = new BlockItem(BlockList.dirt_snow, new Item.Properties().group(obelisk)).setRegistryName(BlockList.dirt_snow.getRegistryName()),
		ItemList.coarse_dirt_snow = new BlockItem(BlockList.coarse_dirt_snow, new Item.Properties().group(obelisk)).setRegistryName(BlockList.coarse_dirt_snow.getRegistryName()),
		ItemList.oak_wood_snow = new BlockItem(BlockList.oak_wood_snow, new Item.Properties().group(obelisk)).setRegistryName(BlockList.oak_wood_snow.getRegistryName()),
		ItemList.spruce_wood_snow = new BlockItem(BlockList.spruce_wood_snow, new Item.Properties().group(obelisk)).setRegistryName(BlockList.spruce_wood_snow.getRegistryName()),
		ItemList.dark_oak_wood_snow = new BlockItem(BlockList.dark_oak_wood_snow, new Item.Properties().group(obelisk)).setRegistryName(BlockList.dark_oak_wood_snow.getRegistryName()),
		ItemList.birch_wood_snow = new BlockItem(BlockList.birch_wood_snow, new Item.Properties().group(obelisk)).setRegistryName(BlockList.birch_wood_snow.getRegistryName()),
		ItemList.acacia_wood_snow = new BlockItem(BlockList.acacia_wood_snow, new Item.Properties().group(obelisk)).setRegistryName(BlockList.acacia_wood_snow.getRegistryName()),
		ItemList.jungle_wood_snow = new BlockItem(BlockList.jungle_wood_snow, new Item.Properties().group(obelisk)).setRegistryName(BlockList.jungle_wood_snow.getRegistryName()),
		ItemList.sand_snow = new BlockItem(BlockList.sand_snow, new Item.Properties().group(obelisk)).setRegistryName(BlockList.sand_snow.getRegistryName()),
		ItemList.red_sand_snow = new BlockItem(BlockList.red_sand_snow, new Item.Properties().group(obelisk)).setRegistryName(BlockList.red_sand_snow.getRegistryName()),
		ItemList.stone_snow = new BlockItem(BlockList.stone_snow, new Item.Properties().group(obelisk)).setRegistryName(BlockList.stone_snow.getRegistryName()),
		ItemList.cobblestone_snow = new BlockItem(BlockList.cobblestone_snow, new Item.Properties().group(obelisk)).setRegistryName(BlockList.cobblestone_snow.getRegistryName()),
		ItemList.oak_planks_snow = new BlockItem(BlockList.oak_planks_snow, new Item.Properties().group(obelisk)).setRegistryName(BlockList.oak_planks_snow.getRegistryName()),
		ItemList.spruce_planks_snow = new BlockItem(BlockList.spruce_planks_snow, new Item.Properties().group(obelisk)).setRegistryName(BlockList.spruce_planks_snow.getRegistryName()),
		ItemList.dark_oak_planks_snow = new BlockItem(BlockList.dark_oak_planks_snow, new Item.Properties().group(obelisk)).setRegistryName(BlockList.dark_oak_planks_snow.getRegistryName()),
		ItemList.birch_planks_snow = new BlockItem(BlockList.birch_planks_snow, new Item.Properties().group(obelisk)).setRegistryName(BlockList.birch_planks_snow.getRegistryName()),
		ItemList.acacia_planks_snow = new BlockItem(BlockList.acacia_planks_snow, new Item.Properties().group(obelisk)).setRegistryName(BlockList.acacia_planks_snow.getRegistryName()),
		ItemList.jungle_planks_snow = new BlockItem(BlockList.jungle_planks_snow, new Item.Properties().group(obelisk)).setRegistryName(BlockList.jungle_planks_snow.getRegistryName()),
		ItemList.gravel_stairs = new BlockItem(BlockList.gravel_stairs, new Item.Properties().group(obelisk)).setRegistryName(BlockList.gravel_stairs.getRegistryName()),
		ItemList.gravel_slab = new BlockItem(BlockList.gravel_slab, new Item.Properties().group(obelisk)).setRegistryName(BlockList.gravel_slab.getRegistryName()),
		ItemList.gravel_wall = new BlockItem(BlockList.gravel_wall, new Item.Properties().group(obelisk)).setRegistryName(BlockList.gravel_wall.getRegistryName()),
		ItemList.gravel_snow = new BlockItem(BlockList.gravel_snow, new Item.Properties().group(obelisk)).setRegistryName(BlockList.gravel_snow.getRegistryName()),
		ItemList.stone_brick_snow = new BlockItem(BlockList.stone_brick_snow, new Item.Properties().group(obelisk)).setRegistryName(BlockList.stone_brick_snow.getRegistryName()),
		ItemList.mossy_stone_brick_snow = new BlockItem(BlockList.mossy_stone_brick_snow, new Item.Properties().group(obelisk)).setRegistryName(BlockList.mossy_stone_brick_snow.getRegistryName()),
		ItemList.fire_obelisk_block = new BlockItem(BlockList.fire_obelisk_block, new Item.Properties().group(obelisk)).setRegistryName(BlockList.fire_obelisk_block.getRegistryName()),
		ItemList.fire_obelisk_stairs = new BlockItem(BlockList.fire_obelisk_stairs, new Item.Properties().group(obelisk)).setRegistryName(BlockList.fire_obelisk_stairs.getRegistryName()),
		ItemList.dirt_vert_slab = new BlockItem(BlockList.dirt_vert_slab, new Item.Properties().group(obelisk)).setRegistryName(BlockList.dirt_vert_slab.getRegistryName()),
		ItemList.fire_obelisk_slab = new BlockItem(BlockList.fire_obelisk_slab, new Item.Properties().group(obelisk)).setRegistryName(BlockList.fire_obelisk_slab.getRegistryName()),
		ItemList.fire_obelisk_wall = new BlockItem(BlockList.fire_obelisk_wall, new Item.Properties().group(obelisk)).setRegistryName(BlockList.fire_obelisk_wall.getRegistryName()),
		ItemList.coarse_dirt_vert_slab = new BlockItem(BlockList.coarse_dirt_vert_slab, new Item.Properties().group(obelisk)).setRegistryName(BlockList.coarse_dirt_vert_slab.getRegistryName()),
		ItemList.acacia_log_vert_slab = new BlockItem(BlockList.acacia_log_vert_slab, new Item.Properties().group(obelisk)).setRegistryName(BlockList.acacia_log_vert_slab.getRegistryName()),
		ItemList.acacia_planks_vert_slab = new BlockItem(BlockList.acacia_planks_vert_slab, new Item.Properties().group(obelisk)).setRegistryName(BlockList.acacia_planks_vert_slab.getRegistryName()),
		ItemList.acacia_wood_vert_slab = new BlockItem(BlockList.acacia_wood_vert_slab, new Item.Properties().group(obelisk)).setRegistryName(BlockList.acacia_wood_vert_slab.getRegistryName()),
		ItemList.oak_wood_vert_slab = new BlockItem(BlockList.oak_wood_vert_slab, new Item.Properties().group(obelisk)).setRegistryName(BlockList.oak_wood_vert_slab.getRegistryName()),
		ItemList.oak_log_vert_slab = new BlockItem(BlockList.oak_log_vert_slab, new Item.Properties().group(obelisk)).setRegistryName(BlockList.oak_log_vert_slab.getRegistryName()),
		ItemList.oak_planks_vert_slab = new BlockItem(BlockList.oak_planks_vert_slab, new Item.Properties().group(obelisk)).setRegistryName(BlockList.oak_planks_vert_slab.getRegistryName()),
		ItemList.spruce_wood_vert_slab = new BlockItem(BlockList.spruce_wood_vert_slab, new Item.Properties().group(obelisk)).setRegistryName(BlockList.spruce_wood_vert_slab.getRegistryName()),
		ItemList.spruce_log_vert_slab = new BlockItem(BlockList.spruce_log_vert_slab, new Item.Properties().group(obelisk)).setRegistryName(BlockList.spruce_log_vert_slab.getRegistryName()),
		ItemList.spruce_planks_vert_slab = new BlockItem(BlockList.spruce_planks_vert_slab, new Item.Properties().group(obelisk)).setRegistryName(BlockList.spruce_planks_vert_slab.getRegistryName()),
		ItemList.birch_wood_vert_slab = new BlockItem(BlockList.birch_wood_vert_slab, new Item.Properties().group(obelisk)).setRegistryName(BlockList.birch_wood_vert_slab.getRegistryName()),
		ItemList.birch_log_vert_slab = new BlockItem(BlockList.birch_log_vert_slab, new Item.Properties().group(obelisk)).setRegistryName(BlockList.birch_log_vert_slab.getRegistryName()),
		ItemList.birch_planks_vert_slab = new BlockItem(BlockList.birch_planks_vert_slab, new Item.Properties().group(obelisk)).setRegistryName(BlockList.birch_planks_vert_slab.getRegistryName()),
		ItemList.dark_oak_wood_vert_slab = new BlockItem(BlockList.dark_oak_wood_vert_slab, new Item.Properties().group(obelisk)).setRegistryName(BlockList.dark_oak_wood_vert_slab.getRegistryName()),
		ItemList.dark_oak_log_vert_slab = new BlockItem(BlockList.dark_oak_log_vert_slab, new Item.Properties().group(obelisk)).setRegistryName(BlockList.dark_oak_log_vert_slab.getRegistryName()),
		ItemList.dark_oak_planks_vert_slab = new BlockItem(BlockList.dark_oak_planks_vert_slab, new Item.Properties().group(obelisk)).setRegistryName(BlockList.dark_oak_planks_vert_slab.getRegistryName()),
		ItemList.jungle_wood_vert_slab = new BlockItem(BlockList.jungle_wood_vert_slab, new Item.Properties().group(obelisk)).setRegistryName(BlockList.jungle_wood_vert_slab.getRegistryName()),
		ItemList.jungle_log_vert_slab = new BlockItem(BlockList.jungle_log_vert_slab, new Item.Properties().group(obelisk)).setRegistryName(BlockList.jungle_log_vert_slab.getRegistryName()),
		ItemList.jungle_planks_vert_slab = new BlockItem(BlockList.jungle_planks_vert_slab, new Item.Properties().group(obelisk)).setRegistryName(BlockList.jungle_planks_vert_slab.getRegistryName()),
		ItemList.stripped_oak_vert_slab = new BlockItem(BlockList.stripped_oak_vert_slab, new Item.Properties().group(obelisk)).setRegistryName(BlockList.stripped_oak_vert_slab.getRegistryName()),
		ItemList.stripped_spruce_vert_slab = new BlockItem(BlockList.stripped_spruce_vert_slab, new Item.Properties().group(obelisk)).setRegistryName(BlockList.stripped_spruce_vert_slab.getRegistryName()),
		ItemList.stripped_birch_vert_slab = new BlockItem(BlockList.stripped_birch_vert_slab, new Item.Properties().group(obelisk)).setRegistryName(BlockList.stripped_birch_vert_slab.getRegistryName()),
		ItemList.stripped_dark_oak_vert_slab = new BlockItem(BlockList.stripped_dark_oak_vert_slab, new Item.Properties().group(obelisk)).setRegistryName(BlockList.stripped_dark_oak_vert_slab.getRegistryName()),
		ItemList.stripped_acacia_vert_slab = new BlockItem(BlockList.stripped_acacia_vert_slab, new Item.Properties().group(obelisk)).setRegistryName(BlockList.stripped_acacia_vert_slab.getRegistryName()),
		ItemList.stripped_jungle_vert_slab = new BlockItem(BlockList.stripped_jungle_vertslab, new Item.Properties().group(obelisk)).setRegistryName(BlockList.stripped_jungle_vertslab.getRegistryName()),
		ItemList.stone_vert_slab = new BlockItem(BlockList.stone_vert_slab, new Item.Properties().group(obelisk)).setRegistryName(BlockList.stone_vert_slab.getRegistryName()),
		ItemList.granite_vert_slab = new BlockItem(BlockList.granite_vert_slab, new Item.Properties().group(obelisk)).setRegistryName(BlockList.granite_vert_slab.getRegistryName()),
		ItemList.polished_granite_vert_slab = new BlockItem(BlockList.polished_granite_vert_slab, new Item.Properties().group(obelisk)).setRegistryName(BlockList.polished_granite_vert_slab.getRegistryName()),
		ItemList.andesite_vert_slab = new BlockItem(BlockList.andesite_vert_slab, new Item.Properties().group(obelisk)).setRegistryName(BlockList.andesite_vert_slab.getRegistryName()),
		ItemList.polished_andesite_vert_slab = new BlockItem(BlockList.polished_andesite_vert_slab, new Item.Properties().group(obelisk)).setRegistryName(BlockList.polished_andesite_vert_slab.getRegistryName()),
		ItemList.cobblestone_vert_slab = new BlockItem(BlockList.cobblestone_vert_slab, new Item.Properties().group(obelisk)).setRegistryName(BlockList.cobblestone_vert_slab.getRegistryName()),
		ItemList.sand_vert_slab = new BlockItem(BlockList.sand_vert_slab, new Item.Properties().group(obelisk)).setRegistryName(BlockList.sand_vert_slab.getRegistryName()),
		ItemList.red_sand_vert_slab = new BlockItem(BlockList.red_sand_vert_slab, new Item.Properties().group(obelisk)).setRegistryName(BlockList.red_sand_vert_slab.getRegistryName()),
		ItemList.sandstone_vert_slab = new BlockItem(BlockList.sandstone_vert_slab, new Item.Properties().group(obelisk)).setRegistryName(BlockList.sandstone_vert_slab.getRegistryName()),
		ItemList.gravel_vert_slab = new BlockItem(BlockList.gravel_vert_slab, new Item.Properties().group(obelisk)).setRegistryName(BlockList.gravel_vert_slab.getRegistryName()),
		ItemList.chiseled_sandstone_vert_slab = new BlockItem(BlockList.chiseled_sandstone_vert_slab, new Item.Properties().group(obelisk)).setRegistryName(BlockList.chiseled_sandstone_vert_slab.getRegistryName()),
		ItemList.cut_sandstone_vert_slab = new BlockItem(BlockList.cut_sandstone_vert_slab, new Item.Properties().group(obelisk)).setRegistryName(BlockList.cut_sandstone_vert_slab.getRegistryName()),
		ItemList.smooth_stone_vert_slab = new BlockItem(BlockList.smooth_stone_vert_slab, new Item.Properties().group(obelisk)).setRegistryName(BlockList.smooth_stone_vert_slab.getRegistryName()),
		ItemList.quartz_vert_slab = new BlockItem(BlockList.quartz_vert_slab, new Item.Properties().group(obelisk)).setRegistryName(BlockList.quartz_vert_slab.getRegistryName()),
		ItemList.smooth_quartz_vert_slab = new BlockItem(BlockList.smooth_quartz_vert_slab, new Item.Properties().group(obelisk)).setRegistryName(BlockList.smooth_quartz_vert_slab.getRegistryName()),
		ItemList.chiseled_quartz_vert_slab = new BlockItem(BlockList.chiseled_quartz_vert_slab, new Item.Properties().group(obelisk)).setRegistryName(BlockList.chiseled_quartz_vert_slab.getRegistryName()),
		ItemList.mossy_cobblestone_vert_slab = new BlockItem(BlockList.mossy_cobblestone_vert_slab, new Item.Properties().group(obelisk)).setRegistryName(BlockList.mossy_cobblestone_vert_slab.getRegistryName()),
		ItemList.mossy_stone_bricks_vert_slab = new BlockItem(BlockList.mossy_stone_bricks_vert_slab, new Item.Properties().group(obelisk)).setRegistryName(BlockList.mossy_stone_bricks_vert_slab.getRegistryName()),
		ItemList.stone_bricks_vert_slab = new BlockItem(BlockList.stone_bricks_vert_slab, new Item.Properties().group(obelisk)).setRegistryName(BlockList.stone_bricks_vert_slab.getRegistryName()),
		ItemList.bookshelf_vert_slab = new BlockItem(BlockList.bookshelf_vert_slab, new Item.Properties().group(obelisk)).setRegistryName(BlockList.bookshelf_vert_slab.getRegistryName()),
		ItemList.smooth_red_sandstone_vert_slab = new BlockItem(BlockList.smooth_red_sandstone_vert_slab, new Item.Properties().group(obelisk)).setRegistryName(BlockList.smooth_red_sandstone_vert_slab.getRegistryName()),
		ItemList.chiseled_stone_bricks_vert_slab = new BlockItem(BlockList.chiseled_stone_bricks_vert_slab, new Item.Properties().group(obelisk)).setRegistryName(BlockList.chiseled_stone_bricks_vert_slab.getRegistryName()),
		ItemList.bookshelf_stairs = new BlockItem(BlockList.bookshelf_stairs, new Item.Properties().group(obelisk)).setRegistryName(BlockList.bookshelf_stairs.getRegistryName()),
		ItemList.bookshelf_slab = new BlockItem(BlockList.bookshelf_slab, new Item.Properties().group(obelisk)).setRegistryName(BlockList.bookshelf_slab.getRegistryName()),
		ItemList.cracked_stone_brick_stairs = new BlockItem(BlockList.cracked_stone_brick_stairs, new Item.Properties().group(obelisk)).setRegistryName(BlockList.cracked_stone_brick_stairs.getRegistryName()),
		ItemList.cracked_stone_brick_slab = new BlockItem(BlockList.cracked_stone_brick_slab, new Item.Properties().group(obelisk)).setRegistryName(BlockList.cracked_stone_brick_slab.getRegistryName()),
		ItemList.cracked_stone_brick_vert_slab = new BlockItem(BlockList.cracked_stone_brick_vert_slab, new Item.Properties().group(obelisk)).setRegistryName(BlockList.cracked_stone_brick_vert_slab.getRegistryName()),
		ItemList.cracked_stone_brick_snow = new BlockItem(BlockList.cracked_stone_brick_snow, new Item.Properties().group(obelisk)).setRegistryName(BlockList.cracked_stone_brick_snow.getRegistryName()),
		ItemList.haybale_stairs = new BlockItem(BlockList.haybale_stairs, new Item.Properties().group(obelisk)).setRegistryName(BlockList.haybale_stairs.getRegistryName()),
		ItemList.haybale_slab = new BlockItem(BlockList.haybale_slab, new Item.Properties().group(obelisk)).setRegistryName(BlockList.haybale_slab.getRegistryName()),
		ItemList.haybale_vert_slab = new BlockItem(BlockList.haybale_vert_slab, new Item.Properties().group(obelisk)).setRegistryName(BlockList.haybale_vert_slab.getRegistryName()),
		ItemList.hayblae_snow = new BlockItem(BlockList.haybale_snow, new Item.Properties().group(obelisk)).setRegistryName(BlockList.haybale_snow.getRegistryName()),
		ItemList.cracked_stone_brick_wall = new BlockItem(BlockList.cracked_stone_brick_wall, new Item.Properties().group(obelisk)).setRegistryName(BlockList.cracked_stone_brick_wall.getRegistryName()),
		ItemList.cracked_stone_brick_fence = new BlockItem(BlockList.cracked_stone_brick_fence, new Item.Properties().group(obelisk)).setRegistryName(BlockList.cracked_stone_brick_fence.getRegistryName()),
		ItemList.white_wool_snow = new BlockItem(BlockList.white_wool_snow, new Item.Properties().group(obelisk)).setRegistryName(BlockList.white_wool_snow.getRegistryName()),
		ItemList.orange_wool_snow = new BlockItem(BlockList.orange_wool_snow, new Item.Properties().group(obelisk)).setRegistryName(BlockList.orange_wool_snow.getRegistryName()),
		ItemList.magenta_wool_snow = new BlockItem(BlockList.magenta_wool_snow, new Item.Properties().group(obelisk)).setRegistryName(BlockList.magenta_wool_snow.getRegistryName()),
		ItemList.light_blue_wool_snow = new BlockItem(BlockList.light_blue_wool_snow, new Item.Properties().group(obelisk)).setRegistryName(BlockList.light_blue_wool_snow.getRegistryName()),
		ItemList.yellow_wool_snow = new BlockItem(BlockList.yellow_wool_snow, new Item.Properties().group(obelisk)).setRegistryName(BlockList.yellow_wool_snow.getRegistryName()),
		ItemList.lime_wool_snow = new BlockItem(BlockList.lime_wool_snow, new Item.Properties().group(obelisk)).setRegistryName(BlockList.lime_wool_snow.getRegistryName()),
		ItemList.pink_wool_snow = new BlockItem(BlockList.pink_wool_snow, new Item.Properties().group(obelisk)).setRegistryName(BlockList.pink_wool_snow.getRegistryName()),
		ItemList.gray_wool_snow = new BlockItem(BlockList.gray_wool_snow, new Item.Properties().group(obelisk)).setRegistryName(BlockList.gray_wool_snow.getRegistryName()),
		ItemList.light_gray_wool_snow = new BlockItem(BlockList.light_gray_wool_snow, new Item.Properties().group(obelisk)).setRegistryName(BlockList.light_gray_wool_snow.getRegistryName()),
		ItemList.cyan_wool_snow = new BlockItem(BlockList.cyan_wool_snow, new Item.Properties().group(obelisk)).setRegistryName(BlockList.cyan_wool_snow.getRegistryName()),
		ItemList.purple_wool_snow = new BlockItem(BlockList.purple_wool_snow, new Item.Properties().group(obelisk)).setRegistryName(BlockList.purple_wool_snow.getRegistryName()),
		ItemList.blue_wool_snow = new BlockItem(BlockList.blue_wool_snow, new Item.Properties().group(obelisk)).setRegistryName(BlockList.blue_wool_snow.getRegistryName()),
		ItemList.brown_wool_snow = new BlockItem(BlockList.brown_wool_snow, new Item.Properties().group(obelisk)).setRegistryName(BlockList.brown_wool_snow.getRegistryName()),
		ItemList.green_wool_snow = new BlockItem(BlockList.green_wool_snow, new Item.Properties().group(obelisk)).setRegistryName(BlockList.green_wool_snow.getRegistryName()),
		ItemList.red_wool_snow = new BlockItem(BlockList.red_wool_snow, new Item.Properties().group(obelisk)).setRegistryName(BlockList.red_wool_snow.getRegistryName()),
		ItemList.spruce_cauldron = new BlockItem(BlockList.spruce_cauldron, new Item.Properties().group(misc)).setRegistryName(BlockList.spruce_cauldron.getRegistryName())
		);
			
		EntitiesList.registerEntitySpawnEggs(event);
			
			
			
		logger.info("Items Registered");
	}
		
	@SubscribeEvent
	public static void registerBlock(final RegistryEvent.Register<Block> event) 
	{
		event.getRegistry().registerAll
		(
			
			BlockList.earth_obelisk_block = new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(50f, 18000000.0f).lightValue(15).sound(SoundType.METAL)).setRegistryName(location("earth_obelisk_block")),
			BlockList.earth_obelisk_wall = (WallBlock) new WallBlock(Block.Properties.from(BlockList.earth_obelisk_block)).setRegistryName(location("earth_obelisk_wall")),
			BlockList.earth_obelisk_slab = (SlabBlock) new SlabBlock(Block.Properties.from(BlockList.earth_obelisk_block)).setRegistryName(location("earth_obelisk_slab")),
			BlockList.earth_obelisk_stairs = (StairsBlock) new CustomStairsBlock(BlockList.earth_obelisk_block.getDefaultState(), Block.Properties.from(BlockList.earth_obelisk_block)).setRegistryName(location("earth_obelisk_stairs")),
			BlockList.dirt_slab = (SlabBlock) new SlabBlock(Block.Properties.create(Material.EARTH).hardnessAndResistance(0.5f, 2.5f).sound(SoundType.GROUND)).setRegistryName(location("dirt_slab")),
			BlockList.dirt_wall = (WallBlock) new WallBlock(Block.Properties.from(BlockList.dirt_slab)).setRegistryName(location("dirt_wall")),
			BlockList.dirt_stairs = (StairsBlock) new CustomStairsBlock(BlockList.dirt_slab.getDefaultState(), Block.Properties.from(BlockList.dirt_slab)).setRegistryName(location("dirt_stairs")),
			BlockList.coarse_dirt_wall = (WallBlock) new WallBlock(Block.Properties.from(BlockList.dirt_slab)).setRegistryName(location("coarse_dirt_wall")),
			BlockList.coarse_dirt_slab = (SlabBlock) new SlabBlock(Block.Properties.from(BlockList.dirt_slab)).setRegistryName(location("coarse_dirt_slab")),
			BlockList.coarse_dirt_stairs = (StairsBlock) new CustomStairsBlock(BlockList.coarse_dirt_slab.getDefaultState(), Block.Properties.from(BlockList.dirt_slab)).setRegistryName(location("coarse_dirt_stairs")),
			BlockList.sand_slab = (SlabBlock) new SlabBlock(Block.Properties.create(Material.EARTH).hardnessAndResistance(0.5f, 2.5f).sound(SoundType.SAND)).setRegistryName(location("sand_slab")),
			BlockList.sand_wall = (WallBlock) new WallBlock(Block.Properties.from(BlockList.sand_slab)).setRegistryName(location("sand_wall")),
			BlockList.sand_stairs = (StairsBlock) new CustomStairsBlock(BlockList.sand_slab.getDefaultState(), Block.Properties.from(BlockList.sand_slab)).setRegistryName(location("sand_stairs")),
			BlockList.oak_wood_stairs = (StairsBlock) new CustomStairsBlock(BlockList.sand_slab.getDefaultState(), Block.Properties.create(Material.WOOD).hardnessAndResistance(2f, 10f).sound(SoundType.WOOD)).setRegistryName(location("oak_wood_stairs")),	
			BlockList.oak_wood_slab = (SlabBlock) new SlabBlock(Block.Properties.from(BlockList.oak_wood_stairs)).setRegistryName(location("oak_wood_slab")),
			BlockList.oak_wood_wall = (WallBlock) new WallBlock(Block.Properties.from(BlockList.oak_wood_stairs)).setRegistryName(location("oak_wood_wall")),
			BlockList.oak_log_stairs = (StairsBlock) new CustomStairsBlock(BlockList.oak_wood_stairs.getDefaultState(), Block.Properties.from(BlockList.oak_wood_stairs)).setRegistryName(location("oak_log_stairs")),
			BlockList.oak_log_slab = (SlabBlock) new SlabBlock(Block.Properties.from(BlockList.oak_wood_stairs)).setRegistryName(location("oak_log_slab")),
			BlockList.oak_log_wall = (WallBlock) new WallBlock(Block.Properties.from(BlockList.oak_wood_stairs)).setRegistryName(location("oak_log_wall")),
			BlockList.spruce_log_stairs = (StairsBlock) new CustomStairsBlock(BlockList.oak_wood_stairs.getDefaultState(), Block.Properties.from(BlockList.oak_log_slab)).setRegistryName(location("spruce_log_stairs")),
			BlockList.spruce_log_slab = (SlabBlock) new SlabBlock(Block.Properties.from(BlockList.oak_log_slab)).setRegistryName(location("spruce_log_slab")),
			BlockList.spruce_log_wall = (WallBlock) new WallBlock(Block.Properties.from(BlockList.oak_log_slab)).setRegistryName(location("spruce_log_wall")),
			BlockList.spruce_wood_stairs = (StairsBlock) new CustomStairsBlock(BlockList.oak_wood_stairs.getDefaultState(), Block.Properties.from(BlockList.oak_log_slab)).setRegistryName(location("spruce_wood_stairs")),
			BlockList.spruce_wood_slab = (SlabBlock) new SlabBlock(Block.Properties.from(BlockList.oak_log_slab)).setRegistryName(location("spruce_wood_slab")),
			BlockList.spruce_wood_wall = (WallBlock) new WallBlock(Block.Properties.from(BlockList.oak_log_slab)).setRegistryName(location("spruce_wood_wall")),
			BlockList.dark_oak_log_stairs = (StairsBlock) new CustomStairsBlock(BlockList.oak_wood_stairs.getDefaultState(), Block.Properties.from(BlockList.oak_log_slab)).setRegistryName(location("dark_oak_log_stairs")),
			BlockList.dark_oak_log_slab = (SlabBlock) new SlabBlock(Block.Properties.from(BlockList.oak_log_slab)).setRegistryName(location("dark_oak_log_slab")),
			BlockList.dark_oak_log_wall = (WallBlock) new WallBlock(Block.Properties.from(BlockList.oak_log_slab)).setRegistryName(location("dark_oak_log_wall")),
			BlockList.dark_oak_wood_stairs = (StairsBlock) new CustomStairsBlock(BlockList.oak_log_stairs.getDefaultState(), Block.Properties.from(BlockList.oak_log_slab)).setRegistryName(location("dark_oak_wood_stairs")),
			BlockList.dark_oak_wood_slab = (SlabBlock) new SlabBlock(Block.Properties.from(BlockList.oak_log_slab)).setRegistryName(location("dark_oak_wood_slab")),
			BlockList.dark_oak_wood_wall = (WallBlock) new WallBlock(Block.Properties.from(BlockList.oak_log_slab)).setRegistryName(location("dark_oak_wood_wall")),
			BlockList.birch_log_stairs = (StairsBlock) new CustomStairsBlock(BlockList.dark_oak_log_stairs.getDefaultState(), Block.Properties.from(BlockList.dark_oak_log_slab)).setRegistryName(location("birch_log_stairs")),
			BlockList.birch_log_slab = (SlabBlock) new SlabBlock(Block.Properties.from(BlockList.dark_oak_log_slab)).setRegistryName(location("birch_log_slab")),
			BlockList.birch_log_wall = (WallBlock) new WallBlock(Block.Properties.from(BlockList.dark_oak_log_slab)).setRegistryName(location("birch_log_wall")),
			BlockList.birch_wood_stairs = (StairsBlock) new CustomStairsBlock(BlockList.dark_oak_log_stairs.getDefaultState(), Block.Properties.from(BlockList.dark_oak_log_slab)).setRegistryName(location("birch_wood_stairs")),
			BlockList.birch_wood_slab = (SlabBlock) new SlabBlock(Block.Properties.from(BlockList.dark_oak_log_slab)).setRegistryName(location("birch_wood_slab")),
			BlockList.birch_wood_wall = (WallBlock) new WallBlock(Block.Properties.from(BlockList.dark_oak_log_slab)).setRegistryName(location("birch_wood_wall")),
			BlockList.acacia_log_stairs = (StairsBlock) new CustomStairsBlock(BlockList.dark_oak_log_stairs.getDefaultState(), Block.Properties.from(BlockList.dark_oak_log_stairs)).setRegistryName(location("acacia_log_stairs")),
			BlockList.acacia_log_slab = (SlabBlock) new SlabBlock(Block.Properties.from(BlockList.dark_oak_log_slab)).setRegistryName(location("acacia_log_slab")),
			BlockList.acacia_log_wall = (WallBlock) new WallBlock(Block.Properties.from(BlockList.dark_oak_log_slab)).setRegistryName(location("acacia_log_wall")),
			BlockList.acacia_wood_stairs = (StairsBlock) new CustomStairsBlock(BlockList.dark_oak_log_stairs.getDefaultState(), Block.Properties.from(BlockList.dark_oak_log_slab)).setRegistryName(location("acacia_wood_stairs")),
			BlockList.acacia_wood_slab = (SlabBlock) new SlabBlock(Block.Properties.from(BlockList.dark_oak_log_slab)).setRegistryName(location("acacia_wood_slab")),
			BlockList.acacia_wood_wall = (WallBlock) new WallBlock(Block.Properties.from(BlockList.dark_oak_log_slab)).setRegistryName(location("acacia_wood_wall")),
			BlockList.jungle_log_stairs = (StairsBlock) new CustomStairsBlock(BlockList.acacia_log_stairs.getDefaultState(), Block.Properties.from(BlockList.acacia_log_stairs)).setRegistryName(location("jungle_log_stairs")),
			BlockList.jungle_log_slab = (SlabBlock) new SlabBlock(Block.Properties.from(BlockList.acacia_log_slab)).setRegistryName(location("jungle_log_slab")),
			BlockList.jungle_log_wall = (WallBlock) new WallBlock(Block.Properties.from(BlockList.acacia_log_slab)).setRegistryName(location("jungle_log_wall")),
			BlockList.jungle_wood_stairs = (StairsBlock) new CustomStairsBlock(BlockList.acacia_log_stairs.getDefaultState(), Block.Properties.from(BlockList.acacia_log_slab)).setRegistryName(location("jungle_wood_stairs")),
			BlockList.jungle_wood_slab = (SlabBlock) new SlabBlock(Block.Properties.from(BlockList.acacia_log_slab)).setRegistryName(location("jungle_wood_slab")),
			BlockList.jungle_wood_wall = (WallBlock) new WallBlock(Block.Properties.from(BlockList.acacia_log_slab)).setRegistryName(location("jungle_wood_wall")),
			BlockList.oak_planks_wall = (WallBlock) new WallBlock(Block.Properties.from(BlockList.acacia_log_slab)).setRegistryName(location("oak_planks_wall")),
			BlockList.spruce_planks_wall = (WallBlock) new WallBlock(Block.Properties.from(BlockList.acacia_log_slab)).setRegistryName(location("spruce_planks_wall")),
			BlockList.dark_oak_planks_wall = (WallBlock) new WallBlock(Block.Properties.from(BlockList.acacia_log_slab)).setRegistryName(location("dark_oak_planks_wall")),
			BlockList.birch_planks_wall = (WallBlock) new WallBlock(Block.Properties.from(BlockList.acacia_log_slab)).setRegistryName(location("birch_planks_wall")),
			BlockList.acacia_planks_wall = (WallBlock) new WallBlock(Block.Properties.from(BlockList.acacia_log_slab)).setRegistryName(location("acacia_planks_wall")),
			BlockList.jungle_planks_wall = (WallBlock) new WallBlock(Block.Properties.from(BlockList.acacia_log_slab)).setRegistryName(location("jungle_planks_wall")),
			BlockList.stripped_oak_wood_stairs = (StairsBlock) new CustomStairsBlock(BlockList.acacia_log_stairs.getDefaultState(), Block.Properties.from(BlockList.acacia_log_slab)).setRegistryName(location("stripped_oak_wood_stairs")),
			BlockList.stripped_oak_wood_slab = (SlabBlock) new SlabBlock(Block.Properties.from(BlockList.acacia_log_slab)).setRegistryName(location("stripped_oak_wood_slab")),
			BlockList.stripped_oak_wood_wall = (WallBlock) new WallBlock(Block.Properties.from(BlockList.acacia_log_slab)).setRegistryName(location("stripped_oak_wood_wall")),
			BlockList.stripped_spruce_wood_stairs = (StairsBlock) new CustomStairsBlock(BlockList.acacia_log_stairs.getDefaultState(), Block.Properties.from(BlockList.acacia_log_slab)).setRegistryName(location("stripped_spruce_wood_stairs")),
			BlockList.stripped_spruce_wood_slab = (SlabBlock) new SlabBlock(Block.Properties.from(BlockList.acacia_log_slab)).setRegistryName(location("stripped_spruce_wood_slab")),
			BlockList.stripped_spruce_wood_wall = (WallBlock) new WallBlock(Block.Properties.from(BlockList.acacia_log_slab)).setRegistryName(location("stripped_spruce_wood_wall")),
			BlockList.stripped_dark_oak_wood_stairs = (StairsBlock) new CustomStairsBlock(BlockList.acacia_log_stairs.getDefaultState(), Block.Properties.from(BlockList.acacia_log_slab)).setRegistryName(location("stripped_dark_oak_wood_stairs")),
			BlockList.stripped_dark_oak_wood_slab = (SlabBlock) new SlabBlock(Block.Properties.from(BlockList.acacia_log_slab)).setRegistryName(location("stripped_dark_oak_wood_slab")),
			BlockList.stripped_dark_oak_wood_wall = (WallBlock) new WallBlock(Block.Properties.from(BlockList.acacia_log_slab)).setRegistryName(location("stripped_dark_oak_wood_wall")),
			BlockList.stripped_birch_wood_stairs = (StairsBlock) new CustomStairsBlock(BlockList.acacia_log_stairs.getDefaultState(), Block.Properties.from(BlockList.acacia_log_slab)).setRegistryName(location("stripped_birch_wood_stairs")),
			BlockList.stripped_birch_wood_slab = (SlabBlock) new SlabBlock(Block.Properties.from(BlockList.acacia_log_slab)).setRegistryName(location("stripped_birch_wood_slab")),
			BlockList.stripped_birch_wood_wall = (WallBlock) new WallBlock(Block.Properties.from(BlockList.acacia_log_slab)).setRegistryName(location("stripped_birch_wood_wall")),
			BlockList.stripped_acacia_wood_stairs = (StairsBlock) new CustomStairsBlock(BlockList.acacia_log_stairs.getDefaultState(), Block.Properties.from(BlockList.acacia_log_slab)).setRegistryName(location("stripped_acacia_wood_stairs")),
			BlockList.stripped_acacia_wood_slab = (SlabBlock) new SlabBlock(Block.Properties.from(BlockList.acacia_log_slab)).setRegistryName(location("stripped_acacia_wood_slab")),
			BlockList.stripped_acacia_wood_wall = (WallBlock) new WallBlock(Block.Properties.from(BlockList.acacia_log_slab)).setRegistryName(location("stripped_acacia_wood_wall")),
			BlockList.stripped_jungle_wood_stairs = (StairsBlock) new CustomStairsBlock(BlockList.acacia_log_stairs.getDefaultState(), Block.Properties.from(BlockList.acacia_log_slab)).setRegistryName(location("stripped_jungle_wood_stairs")),
			BlockList.stripped_jungle_wood_slab = (SlabBlock) new SlabBlock(Block.Properties.from(BlockList.acacia_log_slab)).setRegistryName(location("stripped_jungle_wood_slab")),
			BlockList.stripped_jungle_wood_wall = (WallBlock) new WallBlock(Block.Properties.from(BlockList.acacia_log_slab)).setRegistryName(location("stripped_jungle_wood_wall")),
			BlockList.oak_wood_fence = (FenceBlock) new FenceBlock(Block.Properties.from(BlockList.acacia_log_slab)).setRegistryName(location("oak_wood_fence")),
			BlockList.spruce_wood_fence = (FenceBlock) new FenceBlock(Block.Properties.from(BlockList.acacia_log_slab)).setRegistryName(location("spruce_wood_fence")),
			BlockList.dark_oak_wood_fence = (FenceBlock) new FenceBlock(Block.Properties.from(BlockList.acacia_log_slab)).setRegistryName(location("dark_oak_wood_fence")),
			BlockList.birch_wood_fence = (FenceBlock) new FenceBlock(Block.Properties.from(BlockList.acacia_log_slab)).setRegistryName(location("birch_wood_fence")),
			BlockList.acacia_wood_fence = (FenceBlock) new FenceBlock(Block.Properties.from(BlockList.acacia_log_slab)).setRegistryName(location("acacia_wood_fence")),
			BlockList.jungle_wood_fence = (FenceBlock) new FenceBlock(Block.Properties.from(BlockList.acacia_log_slab)).setRegistryName(location("jungle_wood_fence")),
			BlockList.dirt_fence = (FenceBlock) new FenceBlock(Block.Properties.from(BlockList.dirt_slab)).setRegistryName(location("dirt_fence")),
			BlockList.coarse_dirt_fence = (FenceBlock) new FenceBlock(Block.Properties.from(BlockList.coarse_dirt_slab)).setRegistryName(location("coarse_dirt_fence")),
			BlockList.stone_fence = (FenceBlock) new FenceBlock(Block.Properties.create(Material.EARTH).hardnessAndResistance(2f, 15f).sound(SoundType.STONE)).setRegistryName(location("stone_fence")),
			BlockList.cobblestone_fence = (FenceBlock) new FenceBlock(Block.Properties.from(BlockList.stone_fence)).setRegistryName(location("cobblestone_fence")),
			BlockList.stone_brick_fence = (FenceBlock) new FenceBlock(Block.Properties.from(BlockList.stone_fence)).setRegistryName(location("stone_brick_fence")),
			BlockList.mossy_stone_brick_fence = (FenceBlock) new FenceBlock(Block.Properties.from(BlockList.stone_fence)).setRegistryName(location("mossy_stone_brick_fence")),
			BlockList.earth_obelisk_fence = (FenceBlock) new FenceBlock(Block.Properties.from(BlockList.stone_fence)).setRegistryName(location("earth_obelisk_fence")),
			BlockList.red_sand_stairs = (StairsBlock) new CustomStairsBlock(BlockList.sand_stairs.getDefaultState(), Block.Properties.from(BlockList.sand_slab)).setRegistryName(location("red_sand_stairs")),
			BlockList.red_sand_slab = (SlabBlock) new SlabBlock(Block.Properties.from(BlockList.sand_slab)).setRegistryName(location("red_sand_slab")),
			BlockList.red_sand_wall = (WallBlock) new WallBlock(Block.Properties.from(BlockList.sand_wall)).setRegistryName(location("red_sand_wall")),
			BlockList.dirt_snow = (SnowBlock) new CustomSnowBlock(Block.Properties.create(Material.EARTH).hardnessAndResistance(0.1f, 0.5f).sound(SoundType.GROUND)).setRegistryName(location("dirt_snow")),
			BlockList.coarse_dirt_snow = (SnowBlock) new CustomSnowBlock(Block.Properties.from(BlockList.coarse_dirt_slab)).setRegistryName(location("coarse_dirt_snow")),
			BlockList.oak_wood_snow = (SnowBlock) new CustomSnowBlock(Block.Properties.from(BlockList.oak_wood_slab)).setRegistryName(location("oak_wood_snow")),
			BlockList.spruce_wood_snow = (SnowBlock) new CustomSnowBlock(Block.Properties.from(BlockList.spruce_wood_slab)).setRegistryName(location("spruce_wood_snow")),
			BlockList.dark_oak_wood_snow = (SnowBlock) new CustomSnowBlock(Block.Properties.from(BlockList.dark_oak_wood_slab)).setRegistryName(location("dark_oak_wood_snow")),
			BlockList.birch_wood_snow = (SnowBlock) new CustomSnowBlock(Block.Properties.from(BlockList.birch_wood_slab)).setRegistryName(location("birch_wood_snow")),
			BlockList.acacia_wood_snow = (SnowBlock) new CustomSnowBlock(Block.Properties.from(BlockList.acacia_wood_slab)).setRegistryName(location("acacia_wood_snow")),
			BlockList.jungle_wood_snow = (SnowBlock) new CustomSnowBlock(Block.Properties.from(BlockList.jungle_wood_slab)).setRegistryName(location("jungle_wood_snow")),
			BlockList.sand_snow = (SnowBlock) new CustomSnowBlock(Block.Properties.from(BlockList.sand_slab)).setRegistryName(location("sand_snow")),
			BlockList.red_sand_snow = (SnowBlock) new CustomSnowBlock(Block.Properties.from(BlockList.red_sand_slab)).setRegistryName(location("red_sand_snow")),
			BlockList.stone_snow = (SnowBlock) new CustomSnowBlock(Block.Properties.from(BlockList.stone_fence)).setRegistryName(location("stone_snow")),
			BlockList.cobblestone_snow = (SnowBlock) new CustomSnowBlock(Block.Properties.from(BlockList.cobblestone_fence)).setRegistryName(location("cobblestone_snow")),
			BlockList.oak_planks_snow = (SnowBlock) new CustomSnowBlock(Block.Properties.from(BlockList.oak_planks_wall)).setRegistryName(location("oak_planks_snow")),
			BlockList.spruce_planks_snow = (SnowBlock) new CustomSnowBlock(Block.Properties.from(BlockList.oak_planks_wall)).setRegistryName(location("spruce_planks_snow")),
			BlockList.dark_oak_planks_snow = (SnowBlock) new CustomSnowBlock(Block.Properties.from(BlockList.oak_planks_wall)).setRegistryName(location("dark_oak_planks_snow")),
			BlockList.birch_planks_snow = (SnowBlock) new CustomSnowBlock(Block.Properties.from(BlockList.oak_planks_wall)).setRegistryName(location("birch_planks_snow")),
			BlockList.acacia_planks_snow = (SnowBlock) new CustomSnowBlock(Block.Properties.from(BlockList.oak_planks_wall)).setRegistryName(location("acacia_planks_snow")),
			BlockList.jungle_planks_snow = (SnowBlock) new CustomSnowBlock(Block.Properties.from(BlockList.oak_planks_wall)).setRegistryName(location("jungle_planks_snow")),
			BlockList.gravel_slab = (SlabBlock) new SlabBlock(Block.Properties.create(Material.EARTH).hardnessAndResistance(0.6f, 3).sound(SoundType.GROUND)).setRegistryName(location("gravel_slab")),
			BlockList.gravel_stairs = (StairsBlock) new CustomStairsBlock(BlockList.gravel_slab.getDefaultState(), Block.Properties.from(BlockList.gravel_slab)).setRegistryName(location("gravel_stairs")),
			BlockList.gravel_wall = (WallBlock) new WallBlock(Block.Properties.from(BlockList.gravel_slab)).setRegistryName(location("gravel_wall")),
			BlockList.gravel_snow = (SnowBlock) new CustomSnowBlock(Block.Properties.from(BlockList.gravel_slab)).setRegistryName(location("gravel_snow")),
			BlockList.stone_brick_snow = (SnowBlock) new CustomSnowBlock(Block.Properties.from(BlockList.stone_brick_fence)).setRegistryName(location("stone_brick_snow")),
			BlockList.mossy_stone_brick_snow = (SnowBlock) new CustomSnowBlock(Block.Properties.from(BlockList.mossy_stone_brick_fence)).setRegistryName(location("mossy_stone_brick_snow")),
			BlockList.fire_obelisk_block = new Block(Block.Properties.from(BlockList.earth_obelisk_block)).setRegistryName(location("fire_obelisk_block")),
			BlockList.fire_obelisk_stairs = (StairsBlock) new CustomStairsBlock(BlockList.fire_obelisk_block.getDefaultState(), Block.Properties.from(BlockList.fire_obelisk_block)).setRegistryName(location("fire_obelisk_stairs")),
			BlockList.dirt_vert_slab = (VertSlabBlock) new VertSlabBlock(Block.Properties.from(BlockList.dirt_slab)).setRegistryName(location("dirt_vert_slab")),
			BlockList.fire_obelisk_slab = (SlabBlock) new SlabBlock(Block.Properties.from(BlockList.fire_obelisk_block)).setRegistryName(location("fire_obelisk_slab")),
			BlockList.fire_obelisk_wall = (WallBlock) new WallBlock(Block.Properties.from(BlockList.fire_obelisk_block)).setRegistryName(location("fire_obelisk_wall")),
			BlockList.coarse_dirt_vert_slab = (VertSlabBlock) new VertSlabBlock(Block.Properties.from(BlockList.coarse_dirt_slab)).setRegistryName(location("coarse_dirt_vert_slab")),
			BlockList.acacia_log_vert_slab = (VertSlabBlock) new VertSlabBlock(Block.Properties.from(BlockList.acacia_log_slab)).setRegistryName(location("acacia_log_vert_slab")),
			BlockList.acacia_planks_vert_slab = (VertSlabBlock) new VertSlabBlock(Block.Properties.from(BlockList.acacia_log_slab)).setRegistryName(location("acacia_planks_vert_slab")),
			BlockList.acacia_wood_vert_slab = (VertSlabBlock) new VertSlabBlock(Block.Properties.from(BlockList.acacia_log_slab)).setRegistryName(location("acacia_wood_vert_slab")),
			BlockList.oak_wood_vert_slab = (VertSlabBlock) new VertSlabBlock(Block.Properties.from(BlockList.oak_wood_slab)).setRegistryName(location("oak_wood_vert_slab")),
			BlockList.oak_log_vert_slab = (VertSlabBlock) new VertSlabBlock(Block.Properties.from(BlockList.oak_log_slab)).setRegistryName(location("oak_log_vert_slab")),
			BlockList.oak_planks_vert_slab = (VertSlabBlock) new VertSlabBlock(Block.Properties.from(BlockList.oak_planks_snow)).setRegistryName(location("oak_planks_vert_slab")),
			BlockList.spruce_wood_vert_slab = (VertSlabBlock) new VertSlabBlock(Block.Properties.from(BlockList.spruce_wood_slab)).setRegistryName(location("spruce_wood_vert_slab")),
			BlockList.spruce_log_vert_slab = (VertSlabBlock) new VertSlabBlock(Block.Properties.from(BlockList.spruce_log_slab)).setRegistryName(location("spruce_log_vert_slab")),
			BlockList.spruce_planks_vert_slab = (VertSlabBlock) new VertSlabBlock(Block.Properties.from(BlockList.spruce_log_slab)).setRegistryName(location("spruce_planks_vert_slab")),
			BlockList.birch_wood_vert_slab = (VertSlabBlock) new VertSlabBlock(Block.Properties.from(BlockList.birch_wood_slab)).setRegistryName(location("birch_wood_vert_slab")),
			BlockList.birch_log_vert_slab = (VertSlabBlock) new VertSlabBlock(Block.Properties.from(BlockList.birch_log_slab)).setRegistryName(location("birch_log_vert_slab")),
			BlockList.birch_planks_vert_slab = (VertSlabBlock) new VertSlabBlock(Block.Properties.from(BlockList.birch_planks_snow)).setRegistryName(location("birch_planks_vert_slab")),
			BlockList.dark_oak_wood_vert_slab = (VertSlabBlock) new VertSlabBlock(Block.Properties.from(BlockList.dark_oak_log_slab)).setRegistryName(location("dark_oak_wood_vert_slab")),
			BlockList.dark_oak_log_vert_slab = (VertSlabBlock) new VertSlabBlock(Block.Properties.from(BlockList.dark_oak_log_slab)).setRegistryName(location("dark_oak_log_vert_slab")),
			BlockList.dark_oak_planks_vert_slab = (VertSlabBlock) new VertSlabBlock(Block.Properties.from(BlockList.dark_oak_log_slab)).setRegistryName(location("dark_oak_planks_vert_slab")),
			BlockList.jungle_wood_vert_slab = (VertSlabBlock) new VertSlabBlock(Block.Properties.from(BlockList.jungle_wood_slab)).setRegistryName(location("jungle_wood_vert_slab")),
			BlockList.jungle_log_vert_slab = (VertSlabBlock) new VertSlabBlock(Block.Properties.from(BlockList.jungle_log_slab)).setRegistryName(location("jungle_log_vert_slab")),
			BlockList.jungle_planks_vert_slab = (VertSlabBlock) new VertSlabBlock(Block.Properties.from(BlockList.jungle_log_slab)).setRegistryName(location("jungle_planks_vert_slab")),
			BlockList.stripped_oak_vert_slab = (VertSlabBlock) new VertSlabBlock(Block.Properties.from(BlockList.stripped_oak_wood_slab)).setRegistryName(location("stripped_oak_vert_slab")),
			BlockList.stripped_spruce_vert_slab = (VertSlabBlock) new VertSlabBlock(Block.Properties.from(BlockList.stripped_spruce_wood_slab)).setRegistryName(location("stripped_spruce_vert_slab")),
			BlockList.stripped_birch_vert_slab = (VertSlabBlock) new VertSlabBlock(Block.Properties.from(BlockList.stripped_birch_wood_slab)).setRegistryName(location("stripped_birch_vert_slab")),
			BlockList.stripped_dark_oak_vert_slab = (VertSlabBlock) new VertSlabBlock(Block.Properties.from(BlockList.stripped_dark_oak_wood_slab)).setRegistryName(location("stripped_dark_oak_vert_slab")),
			BlockList.stripped_acacia_vert_slab = (VertSlabBlock) new VertSlabBlock(Block.Properties.from(BlockList.stripped_acacia_wood_slab)).setRegistryName(location("stripped_acacia_vert_slab")),
			BlockList.stripped_jungle_vertslab = (VertSlabBlock) new VertSlabBlock(Block.Properties.from(BlockList.stripped_jungle_wood_slab)).setRegistryName(location("stripped_jungle_vert_slab")),
			BlockList.stone_vert_slab = (VertSlabBlock) new VertSlabBlock(Block.Properties.from(BlockList.cobblestone_fence)).setRegistryName(location("stone_vert_slab")),
			BlockList.granite_vert_slab = (VertSlabBlock) new VertSlabBlock(Block.Properties.from(BlockList.cobblestone_fence)).setRegistryName(location("granite_vert_slab")),
			BlockList.polished_granite_vert_slab = (VertSlabBlock) new VertSlabBlock(Block.Properties.from(BlockList.granite_vert_slab)).setRegistryName(location("polished_granite_vert_slab")),
			BlockList.andesite_vert_slab = (VertSlabBlock) new VertSlabBlock(Block.Properties.from(BlockList.granite_vert_slab)).setRegistryName(location("andesite_vert_slab")),
			BlockList.polished_andesite_vert_slab = (VertSlabBlock) new VertSlabBlock(Block.Properties.from(BlockList.andesite_vert_slab)).setRegistryName(location("polished_andesite_vert_slab")),
			BlockList.cobblestone_vert_slab = (VertSlabBlock) new VertSlabBlock(Block.Properties.from(BlockList.cobblestone_fence)).setRegistryName(location("cobblestone_vert_slab")),
			BlockList.sand_vert_slab = (VertSlabBlock) new VertSlabBlock(Block.Properties.from(BlockList.sand_slab)).setRegistryName(location("sand_vert_slab")),
			BlockList.red_sand_vert_slab = (VertSlabBlock) new VertSlabBlock(Block.Properties.from(BlockList.red_sand_slab)).setRegistryName(location("red_sand_vert_slab")),
			BlockList.sandstone_vert_slab = (VertSlabBlock) new VertSlabBlock(Block.Properties.from(BlockList.cobblestone_vert_slab)).setRegistryName(location("sandstone_vert_slab")),
			BlockList.gravel_vert_slab = (VertSlabBlock) new VertSlabBlock(Block.Properties.from(BlockList.gravel_slab)).setRegistryName(location("gravel_vert_slab")),
			BlockList.chiseled_sandstone_vert_slab = (VertSlabBlock) new VertSlabBlock(Block.Properties.from(BlockList.sandstone_vert_slab)).setRegistryName(location("chiseled_sandstone_vert_slab")),
			BlockList.cut_sandstone_vert_slab = (VertSlabBlock) new VertSlabBlock(Block.Properties.from(BlockList.chiseled_sandstone_vert_slab)).setRegistryName(location("cut_sandstone_vert_slab")),
			BlockList.smooth_stone_vert_slab = (VertSlabBlock) new VertSlabBlock(Block.Properties.from(BlockList.stone_vert_slab)).setRegistryName(location("smooth_stone_vert_slab")),
			BlockList.quartz_vert_slab = (VertSlabBlock) new VertSlabBlock(Block.Properties.from(BlockList.stone_vert_slab)).setRegistryName(location("quartz_vert_slab")),
			BlockList.smooth_quartz_vert_slab = (VertSlabBlock) new VertSlabBlock(Block.Properties.from(BlockList.quartz_vert_slab)).setRegistryName(location("smooth_quartz_vert_slab")),
			BlockList.chiseled_quartz_vert_slab = (VertSlabBlock) new VertSlabBlock(Block.Properties.from(BlockList.smooth_quartz_vert_slab)).setRegistryName(location("chiseled_quartz_vert_slab")),
			BlockList.mossy_cobblestone_vert_slab = (VertSlabBlock) new VertSlabBlock(Block.Properties.from(BlockList.cobblestone_fence)).setRegistryName(location("mossy_cobblestone_vert_slab")),
			BlockList.mossy_stone_bricks_vert_slab = (VertSlabBlock) new VertSlabBlock(Block.Properties.from(BlockList.mossy_stone_brick_fence)).setRegistryName(location("mossy_stone_bricks_vert_slab")),
			BlockList.stone_bricks_vert_slab = (VertSlabBlock) new VertSlabBlock(Block.Properties.from(BlockList.stone_brick_fence)).setRegistryName(location("stone_bricks_vert_slab")),
			BlockList.bookshelf_vert_slab = (VertSlabBlock) new VertSlabBlock(Block.Properties.from(BlockList.oak_wood_slab)).setRegistryName(location("bookshelf_vert_slab")),
			BlockList.smooth_red_sandstone_vert_slab = (VertSlabBlock) new VertSlabBlock(Block.Properties.from(BlockList.cut_sandstone_vert_slab)).setRegistryName(location("smooth_red_sandstone_vert_slab")),
			BlockList.chiseled_stone_bricks_vert_slab = (VertSlabBlock) new VertSlabBlock(Block.Properties.from(BlockList.chiseled_sandstone_vert_slab)).setRegistryName(location("chiseled_stone_bricks_vert_slab")),
			BlockList.bookshelf_stairs = (StairsBlock) new CustomStairsBlock(BlockList.bookshelf_vert_slab.getDefaultState(), Block.Properties.from(BlockList.bookshelf_vert_slab)).setRegistryName(location("bookshelf_stairs")),
			BlockList.bookshelf_slab = (SlabBlock) new SlabBlock(Block.Properties.from(BlockList.bookshelf_vert_slab)).setRegistryName(location("bookshelf_slab")),
			BlockList.cracked_stone_brick_stairs = (StairsBlock) new CustomStairsBlock(BlockList.cobblestone_snow.getDefaultState(), Block.Properties.from(BlockList.stone_brick_snow)).setRegistryName(location("cracked_stone_brick_stairs")),
			BlockList.cracked_stone_brick_slab = (SlabBlock) new SlabBlock(Block.Properties.from(BlockList.cracked_stone_brick_stairs)).setRegistryName(location("cracked_stone_brick_slab")),
			BlockList.cracked_stone_brick_vert_slab = (VertSlabBlock) new VertSlabBlock(Block.Properties.from(BlockList.cracked_stone_brick_slab)).setRegistryName(location("cracked_stone_brick_vert_slab")),
			BlockList.cracked_stone_brick_snow = (SnowBlock) new CustomSnowBlock(Block.Properties.from(BlockList.cracked_stone_brick_slab)).setRegistryName(location("cracked_stone_brick_snow")),
			BlockList.haybale_stairs = (StairsBlock) new CustomStairsBlock(BlockList.coarse_dirt_slab.getDefaultState(), Block.Properties.create(Material.EARTH).hardnessAndResistance(0.5f, 2.5f).sound(SoundType.PLANT)).setRegistryName(location("haybale_stairs")),
			BlockList.haybale_slab = (SlabBlock) new SlabBlock(Block.Properties.from(BlockList.haybale_stairs)).setRegistryName(location("haybale_slab")),
			BlockList.haybale_vert_slab = (VertSlabBlock) new VertSlabBlock(Block.Properties.from(BlockList.haybale_slab)).setRegistryName(location("haybale_vert_slab")),
			BlockList.haybale_snow = (SnowBlock) new CustomSnowBlock(Block.Properties.from(BlockList.haybale_slab)).setRegistryName(location("haybale_snow")),
			BlockList.cracked_stone_brick_wall = (WallBlock) new WallBlock(Block.Properties.from(BlockList.cracked_stone_brick_slab)).setRegistryName(location("cracked_stone_brick_wall")),
			BlockList.cracked_stone_brick_fence = (FenceBlock) new FenceBlock(Block.Properties.from(BlockList.cracked_stone_brick_slab)).setRegistryName(location("cracked_stone_brick_fence")),
			BlockList.white_wool_snow = (SnowBlock) new CustomSnowBlock(Block.Properties.create(Material.WOOL).hardnessAndResistance(0.6f, 3.0f).sound(SoundType.CLOTH)).setRegistryName(location("white_wool_snow")),
			BlockList.orange_wool_snow = (SnowBlock) new CustomSnowBlock(Block.Properties.from(BlockList.white_wool_snow)).setRegistryName(location("orange_wool_snow")),
			BlockList.magenta_wool_snow = (SnowBlock) new CustomSnowBlock(Block.Properties.from(BlockList.white_wool_snow)).setRegistryName(location("magenta_wool_snow")),
			BlockList.light_blue_wool_snow = (SnowBlock) new CustomSnowBlock(Block.Properties.from(BlockList.white_wool_snow)).setRegistryName(location("light_blue_wool_snow")),
			BlockList.yellow_wool_snow = (SnowBlock) new CustomSnowBlock(Block.Properties.from(BlockList.white_wool_snow)).setRegistryName(location("yellow_wool_snow")),
			BlockList.lime_wool_snow = (SnowBlock) new CustomSnowBlock(Block.Properties.from(BlockList.white_wool_snow)).setRegistryName(location("lime_wool_snow")),
			BlockList.pink_wool_snow = (SnowBlock) new CustomSnowBlock(Block.Properties.from(BlockList.white_wool_snow)).setRegistryName(location("pink_wool_snow")),
			BlockList.gray_wool_snow = (SnowBlock) new CustomSnowBlock(Block.Properties.from(BlockList.white_wool_snow)).setRegistryName(location("gray_wool_snow")),
			BlockList.light_gray_wool_snow = (SnowBlock) new CustomSnowBlock(Block.Properties.from(BlockList.white_wool_snow)).setRegistryName(location("light_gray_wool_snow")),
			BlockList.cyan_wool_snow = (SnowBlock) new CustomSnowBlock(Block.Properties.from(BlockList.white_wool_snow)).setRegistryName(location("cyan_wool_snow")),
			BlockList.purple_wool_snow = (SnowBlock) new CustomSnowBlock(Block.Properties.from(BlockList.white_wool_snow)).setRegistryName(location("purple_wool_snow")),
			BlockList.blue_wool_snow = (SnowBlock) new CustomSnowBlock(Block.Properties.from(BlockList.white_wool_snow)).setRegistryName(location("blue_wool_snow")),
			BlockList.brown_wool_snow = (SnowBlock) new CustomSnowBlock(Block.Properties.from(BlockList.white_wool_snow)).setRegistryName(location("brown_wool_snow")),
			BlockList.green_wool_snow = (SnowBlock) new CustomSnowBlock(Block.Properties.from(BlockList.white_wool_snow)).setRegistryName(location("green_wool_snow")),
			BlockList.red_wool_snow = (SnowBlock) new CustomSnowBlock(Block.Properties.from(BlockList.white_wool_snow)).setRegistryName(location("red_wool_snow")),
			BlockList.spruce_cauldron = (CauldronBlock) new CauldronBlock(Block.Properties.from(BlockList.stone_bricks_vert_slab)).setRegistryName(location("spruce_cauldron"))
			);
			
			
			
		logger.info("Blocks Registered");
	}
		
	@SubscribeEvent
	public static void registerEntities(final RegistryEvent.Register<EntityType<?>> event) 
	{
		event.getRegistry().registerAll
		(
					
			EntitiesList.TEST_ENTITY
		);
			
		EntitiesList.registerEntityWorldSpawn();
	}
	
	
	
		

	
	public static ResourceLocation location(String name) 
	{
		return new ResourceLocation(modid, name);
	}
}
