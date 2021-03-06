package fox.obeliskmod.lists;


import fox.obeliskmod.blocks.*;
import fox.obeliskmod.blocks.lighting.CandleWallmounted;
import fox.obeliskmod.blocks.merchantdeco.MerchantSign;
import fox.obeliskmod.blocks.tabledeco.EarthenwareMug;
import fox.obeliskmod.blocks.tabledeco.EarthenwarePlate;
import fox.obeliskmod.blocks.tabledeco.EarthenwareSet;
import fox.obeliskmod.tileentities.Dialogue.DialogueTestBlock;
import fox.obeliskmod.tileentities.Dialogue.DialogueTestContainer;
import fox.obeliskmod.tileentities.Dialogue.DialogueTestTile;
import net.minecraft.block.*;
import net.minecraft.entity.ai.brain.task.SleepAtHomeTask;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.registries.ObjectHolder;

public class BlockList 
{
	//region Trepi
	//region Tile Entities
	public static DialogueTestBlock dialogue_test;
	@ObjectHolder("obeliskmod:dialogue_test")
	public static TileEntityType<DialogueTestTile> dialogue_test_tile;
	@ObjectHolder("obeliskmod:dialogue_test")
	public static ContainerType<DialogueTestContainer> dialogue_test_container;
	//endregion

	//region Interior Deco
	public static EarthenwarePlate earthenware_plate;
	public static EarthenwareMug earthenware_mug;
	public static EarthenwareSet earthenware_set;
	//endregion

	//region Merchant Deco
	public static MerchantSign merchant_sign;
	//endregion

	//region Lighting
	public static CandleWallmounted candle_wallmounted;
	//endregion

	//endregion

	//region Earth Obelisk Blocks
	public static Block earth_obelisk_block;
	public static Block earth_obelisk_ore;
	public static WallBlock earth_obelisk_wall;
	public static SlabBlock earth_obelisk_slab;
	public static StairsBlock earth_obelisk_stairs;
	public static FenceBlock earth_obelisk_fence;
	//endregion

	//region Dirt Blocks
	public static SlabBlock grass_block_slab;
	public static WallBlock dirt_wall;
	public static SlabBlock dirt_slab;
	public static VertSlabBlock dirt_vert_slab;
	public static StairsBlock dirt_stairs;
	public static FenceBlock dirt_fence;
	public static SnowBlock dirt_snow;
	public static WallBlock coarse_dirt_wall;
	public static SlabBlock coarse_dirt_slab;
	public static VertSlabBlock coarse_dirt_vert_slab;
	public static StairsBlock coarse_dirt_stairs;
	public static FenceBlock coarse_dirt_fence;
	public static SnowBlock coarse_dirt_snow;
	//endregion

	//region Sand Blocks
	public static SlabBlock sand_slab;
	public static WallBlock sand_wall;
	public static StairsBlock sand_stairs;
	public static SnowBlock sand_snow;
	public static VertSlabBlock sand_vert_slab;
	public static VertSlabBlock sandstone_vert_slab;
	public static VertSlabBlock chiseled_sandstone_vert_slab;
	public static VertSlabBlock cut_sandstone_vert_slab;
	public static StairsBlock red_sand_stairs;
	public static SlabBlock red_sand_slab;
	public static WallBlock red_sand_wall;
	public static SnowBlock red_sand_snow;
	public static VertSlabBlock red_sand_vert_slab;
	public static VertSlabBlock smooth_red_sandstone_vert_slab;
	//endregion

	//region Gravel Blocks
	public static WallBlock gravel_wall;
	public static SlabBlock gravel_slab;
	public static VertSlabBlock gravel_vert_slab;
	public static StairsBlock gravel_stairs;
	public static SnowBlock gravel_snow;
	//endregion

	//region Oak Blocks
	public static StairsBlock oak_log_stairs;
	public static WallBlock oak_log_wall;
	public static SlabBlock oak_log_slab;
	public static VertSlabBlock oak_log_vert_slab;
	public static StairsBlock oak_wood_stairs;
	public static SlabBlock oak_wood_slab;
	public static VertSlabBlock oak_wood_vert_slab;
	public static WallBlock oak_wood_wall;
	public static FenceBlock oak_wood_fence;
	public static SnowBlock oak_wood_snow;
	public static WallBlock oak_planks_wall;
	public static VertSlabBlock oak_planks_vert_slab;
	public static SnowBlock oak_planks_snow;
	public static WallBlock stripped_oak_wood_wall;
	public static SlabBlock stripped_oak_wood_slab;
	public static VertSlabBlock stripped_oak_vert_slab;
	public static StairsBlock stripped_oak_wood_stairs;
	public static PaneBlock oak_wood_bars;
	//endregion

	//region Spruce Blocks
	public static StairsBlock spruce_log_stairs;
	public static WallBlock spruce_log_wall;
	public static SlabBlock spruce_log_slab;
	public static VertSlabBlock spruce_log_vert_slab;
	public static StairsBlock spruce_wood_stairs;
	public static WallBlock spruce_wood_wall;
	public static SlabBlock spruce_wood_slab;
	public static VertSlabBlock spruce_wood_vert_slab;
	public static FenceBlock spruce_wood_fence;
	public static SnowBlock spruce_wood_snow;
	public static WallBlock spruce_planks_wall;
	public static VertSlabBlock spruce_planks_vert_slab;
	public static SnowBlock spruce_planks_snow;
	public static WallBlock stripped_spruce_wood_wall;
	public static SlabBlock stripped_spruce_wood_slab;
	public static VertSlabBlock stripped_spruce_vert_slab;
	public static StairsBlock stripped_spruce_wood_stairs;
	public static Block spruce_crate;
	//endregion

	//region Dark Oak Blocks
	public static StairsBlock dark_oak_log_stairs;
	public static WallBlock dark_oak_log_wall;
	public static SlabBlock dark_oak_log_slab;
	public static VertSlabBlock dark_oak_log_vert_slab;
	public static StairsBlock dark_oak_wood_stairs;
	public static WallBlock dark_oak_wood_wall;
	public static SlabBlock dark_oak_wood_slab;
	public static VertSlabBlock dark_oak_wood_vert_slab;
	public static FenceBlock dark_oak_wood_fence;
	public static SnowBlock dark_oak_wood_snow;
	public static WallBlock dark_oak_planks_wall;
	public static VertSlabBlock dark_oak_planks_vert_slab;
	public static SnowBlock dark_oak_planks_snow;
	public static WallBlock stripped_dark_oak_wood_wall;
	public static SlabBlock stripped_dark_oak_wood_slab;
	public static VertSlabBlock stripped_dark_oak_vert_slab;
	public static StairsBlock stripped_dark_oak_wood_stairs;
	//endregion

	//region Birch Blocks
	public static StairsBlock birch_log_stairs;
	public static WallBlock birch_log_wall;
	public static SlabBlock birch_log_slab;
	public static VertSlabBlock birch_log_vert_slab;
	public static StairsBlock birch_wood_stairs;
	public static WallBlock birch_wood_wall;
	public static SlabBlock birch_wood_slab;
	public static VertSlabBlock birch_wood_vert_slab;
	public static FenceBlock birch_wood_fence;
	public static SnowBlock birch_wood_snow;
	public static WallBlock birch_planks_wall;
	public static VertSlabBlock birch_planks_vert_slab;
	public static SnowBlock birch_planks_snow;
	public static WallBlock stripped_birch_wood_wall;
	public static SlabBlock stripped_birch_wood_slab;
	public static VertSlabBlock stripped_birch_vert_slab;
	public static StairsBlock stripped_birch_wood_stairs;
	//endregion

	//region Acacia Blocks
	public static StairsBlock acacia_log_stairs;
	public static WallBlock acacia_log_wall;
	public static SlabBlock acacia_log_slab;
	public static VertSlabBlock acacia_log_vert_slab;
	public static StairsBlock acacia_wood_stairs;
	public static SlabBlock acacia_wood_slab;
	public static WallBlock acacia_wood_wall;
	public static FenceBlock acacia_wood_fence;
	public static SnowBlock acacia_wood_snow;
	public static WallBlock acacia_planks_wall;
	public static VertSlabBlock acacia_planks_vert_slab;
	public static SnowBlock acacia_planks_snow;
	public static StairsBlock stripped_acacia_wood_stairs;
	public static WallBlock stripped_acacia_wood_wall;
	public static SlabBlock stripped_acacia_wood_slab;
	public static VertSlabBlock stripped_acacia_vert_slab;
	public static VertSlabBlock acacia_wood_vert_slab;
	//endregion

	//region Jungle Blocks
	public static StairsBlock jungle_log_stairs;
	public static WallBlock jungle_log_wall;
	public static SlabBlock jungle_log_slab;
	public static VertSlabBlock jungle_log_vert_slab;
	public static StairsBlock jungle_wood_stairs;
	public static WallBlock jungle_wood_wall;
	public static SlabBlock jungle_wood_slab;
	public static VertSlabBlock jungle_wood_vert_slab;
	public static FenceBlock jungle_wood_fence;
	public static SnowBlock jungle_wood_snow;
	public static WallBlock jungle_planks_wall;
	public static VertSlabBlock jungle_planks_vert_slab;
	public static SnowBlock jungle_planks_snow;
	public static SlabBlock stripped_jungle_wood_slab;
	public static WallBlock stripped_jungle_wood_wall;
	public static VertSlabBlock stripped_jungle_vertslab;
	public static StairsBlock stripped_jungle_wood_stairs;
	//endregion

	//region Stone Blocks
	public static FenceBlock stone_fence;
	public static SnowBlock stone_snow;
	public static VertSlabBlock stone_vert_slab;
	public static FenceBlock cobblestone_fence;
	public static SnowBlock cobblestone_snow;
	public static VertSlabBlock cobblestone_vert_slab;
	public static VertSlabBlock mossy_cobblestone_vert_slab;
	public static FenceBlock stone_brick_fence;
	public static SnowBlock stone_brick_snow;
	public static VertSlabBlock stone_bricks_vert_slab;
	public static FenceBlock mossy_stone_brick_fence;
	public static SnowBlock mossy_stone_brick_snow;
	public static VertSlabBlock mossy_stone_bricks_vert_slab;
	public static VertSlabBlock granite_vert_slab;
	public static VertSlabBlock polished_granite_vert_slab;
	public static VertSlabBlock andesite_vert_slab;
	public static VertSlabBlock polished_andesite_vert_slab;
	public static VertSlabBlock smooth_stone_vert_slab;
	public static VertSlabBlock quartz_vert_slab;
	public static VertSlabBlock smooth_quartz_vert_slab;
	public static VertSlabBlock chiseled_quartz_vert_slab;
	public static VertSlabBlock chiseled_stone_bricks_vert_slab;
	public static WallBlock cracked_stone_brick_wall;
	public static SlabBlock cracked_stone_brick_slab;
	public static VertSlabBlock cracked_stone_brick_vert_slab;
	public static StairsBlock cracked_stone_brick_stairs;
	public static FenceBlock cracked_stone_brick_fence;
	public static SnowBlock cracked_stone_brick_snow;
  public static WallBlock stone_wall;
	//endregion

	//region Fire Obelisk
	public static Block fire_obelisk_block;
	public static Block fire_obelisk_ore;
	public static WallBlock fire_obelisk_wall;
	public static SlabBlock fire_obelisk_slab;
	public static StairsBlock fire_obelisk_stairs;
	//endregion

	//region Bookshelf
	public static VertSlabBlock bookshelf_vert_slab;
	public static StairsBlock bookshelf_stairs;
	public static SlabBlock bookshelf_slab;
	//endregion

	//region Haybale
	public static StairsBlock haybale_stairs;
	public static SlabBlock haybale_slab;
	public static VertSlabBlock haybale_vert_slab;
	public static SnowBlock haybale_snow;
	//endregion

	//region Wool
	//region SnowBlocks
	public static SnowBlock white_wool_snow;
	public static SnowBlock orange_wool_snow;
	public static SnowBlock magenta_wool_snow;
	public static SnowBlock light_blue_wool_snow;
	public static SnowBlock yellow_wool_snow;
	public static SnowBlock lime_wool_snow;
	public static SnowBlock pink_wool_snow;
	public static SnowBlock gray_wool_snow;
	public static SnowBlock light_gray_wool_snow;
	public static SnowBlock cyan_wool_snow;
	public static SnowBlock purple_wool_snow;
	public static SnowBlock blue_wool_snow;
	public static SnowBlock brown_wool_snow;
	public static SnowBlock green_wool_snow;
	public static SnowBlock red_wool_snow;
	public static SnowBlock black_wool_snow;
	//endregion
	public static SlabBlock white_wool_slab;
	public static SlabBlock orange_wool_slab;
	public static SlabBlock magenta_wool_slab;
	public static SlabBlock light_blue_wool_slab;
	public static SlabBlock yellow_wool_slab;
	public static SlabBlock lime_wool_slab;
	public static SlabBlock pink_wool_slab;
	public static SlabBlock gray_wool_slab;
	public static SlabBlock light_gray_wool_slab;
	public static SlabBlock cyan_wool_slab;
	public static SlabBlock purple_wool_slab;
	public static SlabBlock blue_wool_slab;
	public static SlabBlock brown_wool_slab;
	public static SlabBlock green_wool_slab;
	public static SlabBlock red_wool_slab;
	public static SlabBlock black_wool_slab;
	//endregion

	//region Cauldrons
	public static CauldronBlock spruce_cauldron;
	//endregion

	//region Tables
	public static Table oak_planks_table;
	public static Table spruce_planks_table;
	public static Table dark_oak_planks_table;
	public static Table birch_planks_table;
	public static Table jungle_planks_table;
	public static Table acacia_planks_table;
	public static Table oak_wood_table;
	public static Table spruce_wood_table;
	public static Table dark_oak_wood_table;
	public static Table birch_wood_table;
	public static Table jungle_wood_table;
	public static Table acacia_wood_table;
	public static Table cobblestone_table;
	public static Table stone_table;
	public static Table earth_obelisk_table;
	public static Table cobblestone_oak_planks_table;
	public static Table cobblestone_spruce_planks_table;
	public static Table cobblestone_brich_planks_table;
	public static Table cobblestone_jungle_planks_table;
	public static Table cobblestone_acacia_planks_table;
	public static Table cobblestone_dark_oak_planks_table;
	//endregion

	//region Stools
	public static Stool oak_planks_stool;
	public static Stool spruce_planks_stool;
	public static Stool birch_planks_stool;
	public static Stool jungle_planks_stool;
	public static Stool acacia_planks_stool;
	public static Stool dark_oak_planks_stool;
	public static Stool oak_wood_stool;
	public static Stool spruce_wood_stool;
	public static Stool birch_wood_stool;
	public static Stool jungle_wood_stool;
	public static Stool acacia_wood_stool;
	public static Stool dark_oak_wood_stool;
	public static Stool oak_log_stool;
	public static Stool spruce_log_stool;
	public static Stool birch_log_stool;
	public static Stool jungle_log_stool;
	public static Stool acacia_log_stool;
	public static Stool dark_oak_log_stool;
	public static Stool cobblestone_stool;
	public static Stool stone_stool;
	public static Stool stone_bricks_stool;
	public static Stool cracked_stone_bricks_stool;
	//endregion

	//region Benches
	public static Bench bench;
	public static Bench spruce_wood_bench;
	public static Bench birch_wood_bench;
	public static Bench jungle_wood_bench;
	public static Bench acacia_wood_bench;
	public static Bench dark_oak_wood_bench;
	//endregion

	//region Long Tables
	public static LongTable oak_wood_longtable;
	public static LongTable spruce_wood_longtable;
	public static LongTable birch_wood_longtable;
	public static LongTable jungle_wood_longtable;
	public static LongTable acacia_wood_longtable;
	public static LongTable dark_oak_wood_longtable;
	//endregion

	//region Wagons
	public static Wagon oak_wagon;
	//endregion

	//region Chairs
	public static Chair spruce_chair;
	//endregion

	//region Iron
	public static WallBlock iron_wall;
	public static SnowBlock iron_snow;
	public static SlabBlock iron_slab;
	public static StairsBlock iron_stairs;
	public static VertSlabBlock iron_vert_slab;
	//endregion

	//region Lecterns
	public static LecternBlock oak_lectern;
	public static LecternBlock spruce_lectern;
	public static LecternBlock birch_lectern;
	public static LecternBlock dark_oak_lectern;
	public static LecternBlock acacia_lectern;
	public static LecternBlock jungle_lectern;
	//endregion

	//region Locked Blocks
	//region Doors
	public static LockedDoor locked_oak_door;
	public static LockedDoor locked_spruce_door;
	public static LockedDoor locked_birch_door;
	public static LockedDoor locked_dark_oak_door;
	public static LockedDoor locked_acacia_door;
	public static LockedDoor locked_jungle_door;
	public static LockedDoor locked_braced_door;
	//endregion

	//region Trap Doors
	public static LockedTrapDoor locked_oak_trapdoor;
	public static LockedTrapDoor locked_spruce_trapdoor;
	public static LockedTrapDoor locked_birch_trapdoor;
	public static LockedTrapDoor locked_dark_oak_trapdoor;
	public static LockedTrapDoor locked_acacia_trapdoor;
	public static LockedTrapDoor locked_jungle_trapdoor;
	public static LockedTrapDoor locked_braced_trapdoor;
	//endregion

	//region Fence Gates
	//endregion
	//endregion

	//region Not A Pickle
	public static NotAPickle bottles;
	//endregion
  
  //region Leaves
	public static SnowBlock oak_leaves_snow;
	public static SnowBlock spruce_leaves_snow;
	public static SnowBlock birch_leaves_snow;
	public static SnowBlock dark_oak_leaves_snow;
	public static SnowBlock acacia_leaves_snow;
	public static SnowBlock jungle_leaves_snow;
	//endregion


}