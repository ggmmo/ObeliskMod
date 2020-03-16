package fox.obeliskmod;


import fox.obeliskmod.blocks.*;
import fox.obeliskmod.blocks.lighting.CandleWallmounted;
import fox.obeliskmod.blocks.merchantdeco.MerchantSign;
import fox.obeliskmod.blocks.tabledeco.EarthenwareMug;
import fox.obeliskmod.blocks.tabledeco.EarthenwarePlate;
import fox.obeliskmod.blocks.tabledeco.EarthenwareSet;
import fox.obeliskmod.gui.container.UltrahotbarContainer;
import fox.obeliskmod.lists.BlockList;
import fox.obeliskmod.lists.EntityList;
import fox.obeliskmod.lists.ItemList;
import fox.obeliskmod.tools.UltraHotbar;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityType;

import net.minecraft.inventory.container.ContainerType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemTier;
import net.minecraft.item.SwordItem;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.extensions.IForgeContainerType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ObeliskModRegistries {

    public static final String modid = "obeliskmod";
    private static final Logger logger = LogManager.getLogger(modid);

    public static final ItemGroup obelisk = ObeliskMod.obelisk;
    public static final ItemGroup misc = ObeliskMod.misc;
    public static final ItemGroup furniture = ObeliskMod.furniture;
    public static final ItemGroup customBlocks = ObeliskMod.customBlocks;
    public static final ItemGroup advancedTools = ObeliskMod.advancedTools;
    public static final ItemGroup weapon = ObeliskMod.weapon;

    @SubscribeEvent
    public static void registerItems(final RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll
                (
                        //region Trepi
                        //region Items
                        //region Advanced Tools
                        ItemList.ultrahotbar = new UltraHotbar(-4, -4, ItemTier.DIAMOND, null,
                                new Item.Properties().group(advancedTools)).setRegistryName(location("ultrahotbar")),
                        //endregion

                        //endregion

                        //region Blocks
                        //region Interior Deco
                        ItemList.earthenware_plate = new BlockItem(BlockList.earthenware_plate, new Item.Properties().group(misc))
                                .setRegistryName(BlockList.earthenware_plate.getRegistryName()),
                        ItemList.earthenware_mug = new BlockItem(BlockList.earthenware_mug, new Item.Properties().group(misc))
                                .setRegistryName(BlockList.earthenware_mug.getRegistryName()),
                        ItemList.earthenware_set = new BlockItem(BlockList.earthenware_set, new Item.Properties().group(misc))
                                .setRegistryName(BlockList.earthenware_set.getRegistryName()),
                        //endregion

                        //region Merchant Deco
                        ItemList.merchant_sign = new BlockItem(BlockList.merchant_sign, new Item.Properties().group(obelisk))
                                .setRegistryName(BlockList.merchant_sign.getRegistryName()),
                        //endregion

                        //region Lighting
                        ItemList.candle_wallmounted = new BlockItem(BlockList.candle_wallmounted, new Item.Properties().group(misc))
                                .setRegistryName(BlockList.candle_wallmounted.getRegistryName()),
                        //endregion

                        //endregion
                        //endregion


                        //region Coins
                        ItemList.copper_coin = new Item(new Item.Properties().group(misc)).setRegistryName(location("copper_coin")),
                        ItemList.silver_coin = new Item(new Item.Properties().group(misc)).setRegistryName(location("silver_coin")),
                        ItemList.gold_coin = new Item(new Item.Properties().group(misc)).setRegistryName(location("gold_coin")),
                        ItemList.earth_ingot = new Item(new Item.Properties().group(misc)).setRegistryName(location("earth_ingot")),
                        ItemList.fire_ingot = new Item(new Item.Properties().group(misc)).setRegistryName(location("fire_ingot")),
                        //endregion

                        //region Weapons
                        ItemList.stone_dagger = new SwordItem(ItemTier.STONE, 1, -1, new Item.Properties().group(misc)).setRegistryName(location("stone_dagger")),
                        ItemList.iron_dagger = new SwordItem(ItemTier.IRON, 1, -1, new Item.Properties().group(misc)).setRegistryName(location("iron_dagger")),
                        ItemList.long_sword = new SwordItem(ItemTier.IRON, 2, -1, new Item.Properties().group(misc)).setRegistryName(location("long_sword")),
                        ItemList.earth_sword = new SwordItem(ItemTier.IRON,2,-1, new Item.Properties().group(weapon)).setRegistryName(location("earth_sword")),
                        ItemList.earth_sword2 = new SwordItem(ItemTier.IRON,2,-1, new Item.Properties().group(weapon)).setRegistryName(location("earth_sword2")),
                        ItemList.fire_sword = new SwordItem(ItemTier.IRON,2, -1, new Item.Properties().group(weapon)).setRegistryName(location("fire_sword")),
                        //ItemList.sling = (BowItem) = new CustomBow(null),
                        //endregion


                        //region ItemBlocks

                        //region Fire Obelisk
                        ItemList.fire_obelisk_block = new BlockItem(BlockList.fire_obelisk_block, new Item.Properties().group(customBlocks))
                                .setRegistryName(BlockList.fire_obelisk_block.getRegistryName()),
                        ItemList.fire_obelisk_ore = new BlockItem(BlockList.fire_obelisk_ore, new Item.Properties().group(customBlocks))
                                .setRegistryName(BlockList.fire_obelisk_ore.getRegistryName()),
                        ItemList.fire_obelisk_stairs = new BlockItem(BlockList.fire_obelisk_stairs, new Item.Properties().group(customBlocks))
                                .setRegistryName(BlockList.fire_obelisk_stairs.getRegistryName()),
                        ItemList.fire_obelisk_slab = new BlockItem(BlockList.fire_obelisk_slab, new Item.Properties().group(customBlocks)).setRegistryName(BlockList.fire_obelisk_slab.getRegistryName()),
                        ItemList.fire_obelisk_wall = new BlockItem(BlockList.fire_obelisk_wall, new Item.Properties().group(customBlocks)).setRegistryName(BlockList.fire_obelisk_wall.getRegistryName()),
                        //endregion

                        //region Earth Obelisk
                        ItemList.earth_obelisk_block = new BlockItem(BlockList.earth_obelisk_block, new Item.Properties().group(customBlocks))
                                .setRegistryName(BlockList.earth_obelisk_block.getRegistryName()),
                        ItemList.earth_obelisk_ore = new BlockItem(BlockList.earth_obelisk_ore, new Item.Properties().group(customBlocks))
                                .setRegistryName(BlockList.earth_obelisk_ore.getRegistryName()),
                        ItemList.earth_obelisk_wall = new BlockItem(BlockList.earth_obelisk_wall, new Item.Properties().group(customBlocks))
                                .setRegistryName(BlockList.earth_obelisk_wall.getRegistryName()),
                        ItemList.earth_obelisk_slab = new BlockItem(BlockList.earth_obelisk_slab, new Item.Properties().group(customBlocks))
                                .setRegistryName(BlockList.earth_obelisk_slab.getRegistryName()),
                        ItemList.earth_obelisk_stairs = new BlockItem(BlockList.earth_obelisk_stairs, new Item.Properties().group(customBlocks))
                                .setRegistryName(BlockList.earth_obelisk_stairs.getRegistryName()),
                        ItemList.earth_obelisk_fence = new BlockItem(BlockList.earth_obelisk_fence, new Item.Properties().group(customBlocks))
                                .setRegistryName(BlockList.earth_obelisk_fence.getRegistryName()),
                        //endregion

                        //region Dirt
                        ItemList.grass_block_slab = new BlockItem(BlockList.grass_block_slab, new Item.Properties().group(obelisk)).setRegistryName(BlockList.grass_block_slab.getRegistryName()),
                        ItemList.dirt_slab = new BlockItem(BlockList.dirt_slab, new Item.Properties().group(obelisk)).setRegistryName(BlockList.dirt_slab.getRegistryName()),
                        ItemList.dirt_wall = new BlockItem(BlockList.dirt_wall, new Item.Properties().group(obelisk)).setRegistryName(BlockList.dirt_wall.getRegistryName()),
                        ItemList.dirt_stairs = new BlockItem(BlockList.dirt_stairs, new Item.Properties().group(obelisk)).setRegistryName(BlockList.dirt_stairs.getRegistryName()),
                        ItemList.coarse_dirt_wall = new BlockItem(BlockList.coarse_dirt_wall, new Item.Properties().group(obelisk)).setRegistryName(BlockList.coarse_dirt_wall.getRegistryName()),
                        ItemList.coarse_dirt_slab = new BlockItem(BlockList.coarse_dirt_slab, new Item.Properties().group(obelisk)).setRegistryName(BlockList.coarse_dirt_slab.getRegistryName()),
                        ItemList.coarse_dirt_stairs = new BlockItem(BlockList.coarse_dirt_stairs, new Item.Properties().group(obelisk)).setRegistryName(BlockList.coarse_dirt_stairs.getRegistryName()),
                        ItemList.dirt_fence = new BlockItem(BlockList.dirt_fence, new Item.Properties().group(obelisk)).setRegistryName(BlockList.dirt_fence.getRegistryName()),
                        ItemList.coarse_dirt_fence = new BlockItem(BlockList.coarse_dirt_fence, new Item.Properties().group(obelisk)).setRegistryName(BlockList.coarse_dirt_fence.getRegistryName()),
                        ItemList.dirt_snow = new BlockItem(BlockList.dirt_snow, new Item.Properties().group(obelisk)).setRegistryName(BlockList.dirt_snow.getRegistryName()),
                        ItemList.coarse_dirt_snow = new BlockItem(BlockList.coarse_dirt_snow, new Item.Properties().group(obelisk)).setRegistryName(BlockList.coarse_dirt_snow.getRegistryName()),
                        ItemList.dirt_vert_slab = new BlockItem(BlockList.dirt_vert_slab, new Item.Properties().group(obelisk)).setRegistryName(BlockList.dirt_vert_slab.getRegistryName()),
                        ItemList.coarse_dirt_vert_slab = new BlockItem(BlockList.coarse_dirt_vert_slab, new Item.Properties().group(obelisk))
                                .setRegistryName(BlockList.coarse_dirt_vert_slab.getRegistryName()),
                        //endregion

                        //region Sand
                        ItemList.sand_slab = new BlockItem(BlockList.sand_slab, new Item.Properties().group(obelisk)).setRegistryName(BlockList.sand_slab.getRegistryName()),
                        ItemList.sand_wall = new BlockItem(BlockList.sand_wall, new Item.Properties().group(obelisk)).setRegistryName(BlockList.sand_wall.getRegistryName()),
                        ItemList.sand_stairs = new BlockItem(BlockList.sand_stairs, new Item.Properties().group(obelisk)).setRegistryName(BlockList.sand_stairs.getRegistryName()),
                        ItemList.red_sand_stairs = new BlockItem(BlockList.red_sand_stairs, new Item.Properties().group(obelisk)).setRegistryName(BlockList.red_sand_stairs.getRegistryName()),
                        ItemList.red_sand_slab = new BlockItem(BlockList.red_sand_slab, new Item.Properties().group(obelisk)).setRegistryName(BlockList.red_sand_slab.getRegistryName()),
                        ItemList.red_sand_wall = new BlockItem(BlockList.red_sand_wall, new Item.Properties().group(obelisk)).setRegistryName(BlockList.red_sand_wall.getRegistryName()),
                        ItemList.sand_snow = new BlockItem(BlockList.sand_snow, new Item.Properties().group(obelisk)).setRegistryName(BlockList.sand_snow.getRegistryName()),
                        ItemList.red_sand_snow = new BlockItem(BlockList.red_sand_snow, new Item.Properties().group(obelisk)).setRegistryName(BlockList.red_sand_snow.getRegistryName()),
                        ItemList.sand_vert_slab = new BlockItem(BlockList.sand_vert_slab, new Item.Properties().group(obelisk)).setRegistryName(BlockList.sand_vert_slab.getRegistryName()),
                        ItemList.red_sand_vert_slab = new BlockItem(BlockList.red_sand_vert_slab, new Item.Properties().group(obelisk)).setRegistryName(BlockList.red_sand_vert_slab.getRegistryName()),
                        ItemList.sandstone_vert_slab = new BlockItem(BlockList.sandstone_vert_slab, new Item.Properties().group(obelisk))
                                .setRegistryName(BlockList.sandstone_vert_slab.getRegistryName()),
                        ItemList.chiseled_sandstone_vert_slab = new BlockItem(BlockList.chiseled_sandstone_vert_slab, new Item.Properties().group(obelisk))
                                .setRegistryName(BlockList.chiseled_sandstone_vert_slab.getRegistryName()),
                        ItemList.cut_sandstone_vert_slab = new BlockItem(BlockList.cut_sandstone_vert_slab, new Item.Properties().group(obelisk))
                                .setRegistryName(BlockList.cut_sandstone_vert_slab.getRegistryName()),
                        ItemList.smooth_red_sandstone_vert_slab = new BlockItem(BlockList.smooth_red_sandstone_vert_slab, new Item.Properties().group(obelisk))
                                .setRegistryName(BlockList.smooth_red_sandstone_vert_slab.getRegistryName()),
                        //endregion

                        //region Oak
                        ItemList.oak_wood_stairs = new BlockItem(BlockList.oak_wood_stairs, new Item.Properties().group(obelisk)).setRegistryName(BlockList.oak_wood_stairs.getRegistryName()),
                        ItemList.oak_wood_slab = new BlockItem(BlockList.oak_wood_slab, new Item.Properties().group(obelisk)).setRegistryName(BlockList.oak_wood_slab.getRegistryName()),
                        ItemList.oak_wood_wall = new BlockItem(BlockList.oak_wood_wall, new Item.Properties().group(obelisk)).setRegistryName(BlockList.oak_wood_wall.getRegistryName()),
                        ItemList.oak_log_stairs = new BlockItem(BlockList.oak_log_stairs, new Item.Properties().group(obelisk)).setRegistryName(BlockList.oak_log_stairs.getRegistryName()),
                        ItemList.oak_log_slab = new BlockItem(BlockList.oak_log_slab, new Item.Properties().group(obelisk)).setRegistryName(BlockList.oak_log_slab.getRegistryName()),
                        ItemList.oak_log_wall = new BlockItem(BlockList.oak_log_wall, new Item.Properties().group(obelisk)).setRegistryName(BlockList.oak_log_wall.getRegistryName()),
                        ItemList.oak_planks_wall = new BlockItem(BlockList.oak_planks_wall, new Item.Properties().group(obelisk)).setRegistryName(BlockList.oak_planks_wall.getRegistryName()),
                        ItemList.stripped_oak_wood_stairs = new BlockItem(BlockList.stripped_oak_wood_stairs, new Item.Properties().group(obelisk))
                                .setRegistryName(BlockList.stripped_oak_wood_stairs.getRegistryName()),
                        ItemList.stripped_oak_wood_slab = new BlockItem(BlockList.stripped_oak_wood_slab, new Item.Properties().group(obelisk))
                                .setRegistryName(BlockList.stripped_oak_wood_slab.getRegistryName()),
                        ItemList.stripped_oak_wood_wall = new BlockItem(BlockList.stripped_oak_wood_wall, new Item.Properties().group(obelisk))
                                .setRegistryName(BlockList.stripped_oak_wood_wall.getRegistryName()),
                        ItemList.oak_wood_fence = new BlockItem(BlockList.oak_wood_fence, new Item.Properties().group(obelisk)).setRegistryName(BlockList.oak_wood_fence.getRegistryName()),
                        ItemList.oak_wood_snow = new BlockItem(BlockList.oak_wood_snow, new Item.Properties().group(obelisk)).setRegistryName(BlockList.oak_wood_snow.getRegistryName()),
                        ItemList.oak_planks_snow = new BlockItem(BlockList.oak_planks_snow, new Item.Properties().group(obelisk)).setRegistryName(BlockList.oak_planks_snow.getRegistryName()),
                        ItemList.oak_wood_vert_slab = new BlockItem(BlockList.oak_wood_vert_slab, new Item.Properties().group(obelisk)).setRegistryName(BlockList.oak_wood_vert_slab.getRegistryName()),
                        ItemList.oak_log_vert_slab = new BlockItem(BlockList.oak_log_vert_slab, new Item.Properties().group(obelisk)).setRegistryName(BlockList.oak_log_vert_slab.getRegistryName()),
                        ItemList.oak_planks_vert_slab = new BlockItem(BlockList.oak_planks_vert_slab, new Item.Properties().group(obelisk))
                                .setRegistryName(BlockList.oak_planks_vert_slab.getRegistryName()),
                        ItemList.stripped_oak_vert_slab = new BlockItem(BlockList.stripped_oak_vert_slab, new Item.Properties().group(obelisk))
                                .setRegistryName(BlockList.stripped_oak_vert_slab.getRegistryName()),
                        ItemList.locked_oak_door = new BlockItem(BlockList.locked_oak_door, new Item.Properties().group(misc)).setRegistryName(BlockList.locked_oak_door.getRegistryName()),
                        //endregion

                        //region Spruce
                        ItemList.spruce_log_stairs = new BlockItem(BlockList.spruce_log_stairs, new Item.Properties().group(obelisk)).setRegistryName(BlockList.spruce_log_stairs.getRegistryName()),
                        ItemList.spruce_log_slab = new BlockItem(BlockList.spruce_log_slab, new Item.Properties().group(obelisk)).setRegistryName(BlockList.spruce_log_slab.getRegistryName()),
                        ItemList.spruce_log_wall = new BlockItem(BlockList.spruce_log_wall, new Item.Properties().group(obelisk)).setRegistryName(BlockList.spruce_log_wall.getRegistryName()),
                        ItemList.spruce_wood_stairs = new BlockItem(BlockList.spruce_wood_stairs, new Item.Properties().group(obelisk)).setRegistryName(BlockList.spruce_wood_stairs.getRegistryName()),
                        ItemList.spruce_wood_slab = new BlockItem(BlockList.spruce_wood_slab, new Item.Properties().group(obelisk)).setRegistryName(BlockList.spruce_wood_slab.getRegistryName()),
                        ItemList.spruce_wood_wall = new BlockItem(BlockList.spruce_wood_wall, new Item.Properties().group(obelisk)).setRegistryName(BlockList.spruce_wood_wall.getRegistryName()),
                        ItemList.spruce_planks_wall = new BlockItem(BlockList.spruce_planks_wall, new Item.Properties().group(obelisk)).setRegistryName(BlockList.spruce_planks_wall.getRegistryName()),
                        ItemList.stripped_spruce_wood_stairs = new BlockItem(BlockList.stripped_spruce_wood_stairs, new Item.Properties().group(obelisk))
                                .setRegistryName(BlockList.stripped_spruce_wood_stairs.getRegistryName()),
                        ItemList.stripped_spruce_wood_slab = new BlockItem(BlockList.stripped_spruce_wood_slab, new Item.Properties().group(obelisk))
                                .setRegistryName(BlockList.stripped_spruce_wood_slab.getRegistryName()),
                        ItemList.stripped_spruce_wood_wall = new BlockItem(BlockList.stripped_spruce_wood_wall, new Item.Properties().group(obelisk))
                                .setRegistryName(BlockList.stripped_spruce_wood_wall.getRegistryName()),
                        ItemList.spruce_wood_fence = new BlockItem(BlockList.spruce_wood_fence, new Item.Properties().group(obelisk)).setRegistryName(BlockList.spruce_wood_fence.getRegistryName()),
                        ItemList.spruce_wood_snow = new BlockItem(BlockList.spruce_wood_snow, new Item.Properties().group(obelisk)).setRegistryName(BlockList.spruce_wood_snow.getRegistryName()),
                        ItemList.spruce_planks_snow = new BlockItem(BlockList.spruce_planks_snow, new Item.Properties().group(obelisk)).setRegistryName(BlockList.spruce_planks_snow.getRegistryName()),
                        ItemList.spruce_wood_vert_slab = new BlockItem(BlockList.spruce_wood_vert_slab, new Item.Properties().group(obelisk))
                                .setRegistryName(BlockList.spruce_wood_vert_slab.getRegistryName()),
                        ItemList.spruce_log_vert_slab = new BlockItem(BlockList.spruce_log_vert_slab, new Item.Properties().group(obelisk))
                                .setRegistryName(BlockList.spruce_log_vert_slab.getRegistryName()),
                        ItemList.spruce_planks_vert_slab = new BlockItem(BlockList.spruce_planks_vert_slab, new Item.Properties().group(obelisk))
                                .setRegistryName(BlockList.spruce_planks_vert_slab.getRegistryName()),
                        ItemList.stripped_spruce_vert_slab = new BlockItem(BlockList.stripped_spruce_vert_slab, new Item.Properties().group(obelisk))
                                .setRegistryName(BlockList.stripped_spruce_vert_slab.getRegistryName()),
                        ItemList.locked_spruce_door = new BlockItem(BlockList.locked_spruce_door, new Item.Properties().group(misc)).setRegistryName(BlockList.locked_spruce_door.getRegistryName()),
                        //endregion

                        //region Dark Oak
                        ItemList.dark_oak_log_stairs = new BlockItem(BlockList.dark_oak_log_stairs, new Item.Properties().group(obelisk))
                                .setRegistryName(BlockList.dark_oak_log_stairs.getRegistryName()),
                        ItemList.dark_oak_log_slab = new BlockItem(BlockList.dark_oak_log_slab, new Item.Properties().group(obelisk)).setRegistryName(BlockList.dark_oak_log_slab.getRegistryName()),
                        ItemList.dark_oak_log_wall = new BlockItem(BlockList.dark_oak_log_wall, new Item.Properties().group(obelisk)).setRegistryName(BlockList.dark_oak_log_wall.getRegistryName()),
                        ItemList.dark_oak_wood_stairs = new BlockItem(BlockList.dark_oak_wood_stairs, new Item.Properties().group(obelisk))
                                .setRegistryName(BlockList.dark_oak_wood_stairs.getRegistryName()),
                        ItemList.dark_oak_wood_slab = new BlockItem(BlockList.dark_oak_wood_slab, new Item.Properties().group(obelisk)).setRegistryName(BlockList.dark_oak_wood_slab.getRegistryName()),
                        ItemList.dark_oak_wood_wall = new BlockItem(BlockList.dark_oak_wood_wall, new Item.Properties().group(obelisk)).setRegistryName(BlockList.dark_oak_wood_wall.getRegistryName()),
                        ItemList.dark_oak_planks_wall = new BlockItem(BlockList.dark_oak_planks_wall, new Item.Properties().group(obelisk))
                                .setRegistryName(BlockList.dark_oak_planks_wall.getRegistryName()),
                        ItemList.stripped_dark_oak_wood_stairs = new BlockItem(BlockList.stripped_dark_oak_wood_stairs, new Item.Properties().group(obelisk))
                                .setRegistryName(BlockList.stripped_dark_oak_wood_stairs.getRegistryName()),
                        ItemList.stripped_dark_oak_wood_slab = new BlockItem(BlockList.stripped_dark_oak_wood_slab, new Item.Properties().group(obelisk))
                                .setRegistryName(BlockList.stripped_dark_oak_wood_slab.getRegistryName()),
                        ItemList.stripped_dark_oak_wood_wall = new BlockItem(BlockList.stripped_dark_oak_wood_wall, new Item.Properties().group(obelisk))
                                .setRegistryName(BlockList.stripped_dark_oak_wood_wall.getRegistryName()),
                        ItemList.dark_oak_wood_fence = new BlockItem(BlockList.dark_oak_wood_fence, new Item.Properties().group(obelisk))
                                .setRegistryName(BlockList.dark_oak_wood_fence.getRegistryName()),
                        ItemList.dark_oak_wood_snow = new BlockItem(BlockList.dark_oak_wood_snow, new Item.Properties().group(obelisk)).setRegistryName(BlockList.dark_oak_wood_snow.getRegistryName()),
                        ItemList.dark_oak_planks_snow = new BlockItem(BlockList.dark_oak_planks_snow, new Item.Properties().group(obelisk))
                                .setRegistryName(BlockList.dark_oak_planks_snow.getRegistryName()),
                        ItemList.dark_oak_wood_vert_slab = new BlockItem(BlockList.dark_oak_wood_vert_slab, new Item.Properties().group(obelisk))
                                .setRegistryName(BlockList.dark_oak_wood_vert_slab.getRegistryName()),
                        ItemList.dark_oak_log_vert_slab = new BlockItem(BlockList.dark_oak_log_vert_slab, new Item.Properties().group(obelisk))
                                .setRegistryName(BlockList.dark_oak_log_vert_slab.getRegistryName()),
                        ItemList.dark_oak_planks_vert_slab = new BlockItem(BlockList.dark_oak_planks_vert_slab, new Item.Properties().group(obelisk))
                                .setRegistryName(BlockList.dark_oak_planks_vert_slab.getRegistryName()),
                        ItemList.stripped_dark_oak_vert_slab = new BlockItem(BlockList.stripped_dark_oak_vert_slab, new Item.Properties().group(obelisk))
                                .setRegistryName(BlockList.stripped_dark_oak_vert_slab.getRegistryName()),
                        ItemList.locked_dark_oak_door = new BlockItem(BlockList.locked_dark_oak_door, new Item.Properties().group(misc)).setRegistryName(BlockList.locked_dark_oak_door.getRegistryName()),
                        //endregion

                        //region Birch
                        ItemList.birch_log_stairs = new BlockItem(BlockList.birch_log_stairs, new Item.Properties().group(obelisk)).setRegistryName(BlockList.birch_log_stairs.getRegistryName()),
                        ItemList.birch_log_slab = new BlockItem(BlockList.birch_log_slab, new Item.Properties().group(obelisk)).setRegistryName(BlockList.birch_log_slab.getRegistryName()),
                        ItemList.birch_log_wall = new BlockItem(BlockList.birch_log_wall, new Item.Properties().group(obelisk)).setRegistryName(BlockList.birch_log_wall.getRegistryName()),
                        ItemList.birch_wood_stairs = new BlockItem(BlockList.birch_wood_stairs, new Item.Properties().group(obelisk)).setRegistryName(BlockList.birch_wood_stairs.getRegistryName()),
                        ItemList.birch_wood_slab = new BlockItem(BlockList.birch_wood_slab, new Item.Properties().group(obelisk)).setRegistryName(BlockList.birch_wood_slab.getRegistryName()),
                        ItemList.birch_wood_wall = new BlockItem(BlockList.birch_wood_wall, new Item.Properties().group(obelisk)).setRegistryName(BlockList.birch_wood_wall.getRegistryName()),
                        ItemList.birch_planks_wall = new BlockItem(BlockList.birch_planks_wall, new Item.Properties().group(obelisk)).setRegistryName(BlockList.birch_planks_wall.getRegistryName()),
                        ItemList.stripped_birch_wood_stairs = new BlockItem(BlockList.stripped_birch_wood_stairs, new Item.Properties().group(obelisk))
                                .setRegistryName(BlockList.stripped_birch_wood_stairs.getRegistryName()),
                        ItemList.stripped_birch_wood_slab = new BlockItem(BlockList.stripped_birch_wood_slab, new Item.Properties().group(obelisk))
                                .setRegistryName(BlockList.stripped_birch_wood_slab.getRegistryName()),
                        ItemList.stripped_birch_wood_wall = new BlockItem(BlockList.stripped_birch_wood_wall, new Item.Properties().group(obelisk))
                                .setRegistryName(BlockList.stripped_birch_wood_wall.getRegistryName()),
                        ItemList.birch_wood_fence = new BlockItem(BlockList.birch_wood_fence, new Item.Properties().group(obelisk)).setRegistryName(BlockList.birch_wood_fence.getRegistryName()),
                        ItemList.birch_wood_snow = new BlockItem(BlockList.birch_wood_snow, new Item.Properties().group(obelisk)).setRegistryName(BlockList.birch_wood_snow.getRegistryName()),
                        ItemList.birch_planks_snow = new BlockItem(BlockList.birch_planks_snow, new Item.Properties().group(obelisk)).setRegistryName(BlockList.birch_planks_snow.getRegistryName()),
                        ItemList.birch_wood_vert_slab = new BlockItem(BlockList.birch_wood_vert_slab, new Item.Properties().group(obelisk))
                                .setRegistryName(BlockList.birch_wood_vert_slab.getRegistryName()),
                        ItemList.birch_log_vert_slab = new BlockItem(BlockList.birch_log_vert_slab, new Item.Properties().group(obelisk))
                                .setRegistryName(BlockList.birch_log_vert_slab.getRegistryName()),
                        ItemList.birch_planks_vert_slab = new BlockItem(BlockList.birch_planks_vert_slab, new Item.Properties().group(obelisk))
                                .setRegistryName(BlockList.birch_planks_vert_slab.getRegistryName()),
                        ItemList.stripped_birch_vert_slab = new BlockItem(BlockList.stripped_birch_vert_slab, new Item.Properties().group(obelisk))
                                .setRegistryName(BlockList.stripped_birch_vert_slab.getRegistryName()),
                        ItemList.locked_birch_door = new BlockItem(BlockList.locked_birch_door, new Item.Properties().group(misc)).setRegistryName(BlockList.locked_birch_door.getRegistryName()),
                        //endregion

                        //region Acacia
                        ItemList.acacia_log_stairs = new BlockItem(BlockList.acacia_log_stairs, new Item.Properties().group(obelisk)).setRegistryName(BlockList.acacia_log_stairs.getRegistryName()),
                        ItemList.acacia_log_slab = new BlockItem(BlockList.acacia_log_slab, new Item.Properties().group(obelisk)).setRegistryName(BlockList.acacia_log_slab.getRegistryName()),
                        ItemList.acacia_log_wall = new BlockItem(BlockList.acacia_log_wall, new Item.Properties().group(obelisk)).setRegistryName(BlockList.acacia_log_wall.getRegistryName()),
                        ItemList.acacia_wood_stairs = new BlockItem(BlockList.acacia_wood_stairs, new Item.Properties().group(obelisk)).setRegistryName(BlockList.acacia_wood_stairs.getRegistryName()),
                        ItemList.acacia_wood_slab = new BlockItem(BlockList.acacia_wood_slab, new Item.Properties().group(obelisk)).setRegistryName(BlockList.acacia_wood_slab.getRegistryName()),
                        ItemList.acacia_wood_wall = new BlockItem(BlockList.acacia_wood_wall, new Item.Properties().group(obelisk)).setRegistryName(BlockList.acacia_wood_wall.getRegistryName()),
                        ItemList.acacia_planks_wall = new BlockItem(BlockList.acacia_planks_wall, new Item.Properties().group(obelisk)).setRegistryName(BlockList.acacia_planks_wall.getRegistryName()),
                        ItemList.stripped_acacia_wood_stairs = new BlockItem(BlockList.stripped_acacia_wood_stairs, new Item.Properties().group(obelisk))
                                .setRegistryName(BlockList.stripped_acacia_wood_stairs.getRegistryName()),
                        ItemList.stripped_acacia_wood_slab = new BlockItem(BlockList.stripped_acacia_wood_slab, new Item.Properties().group(obelisk))
                                .setRegistryName(BlockList.stripped_acacia_wood_slab.getRegistryName()),
                        ItemList.stripped_acacia_wood_wall = new BlockItem(BlockList.stripped_acacia_wood_wall, new Item.Properties().group(obelisk))
                                .setRegistryName(BlockList.stripped_acacia_wood_wall.getRegistryName()),
                        ItemList.acacia_wood_fence = new BlockItem(BlockList.acacia_wood_fence, new Item.Properties().group(obelisk)).setRegistryName(BlockList.acacia_wood_fence.getRegistryName()),
                        ItemList.acacia_wood_snow = new BlockItem(BlockList.acacia_wood_snow, new Item.Properties().group(obelisk)).setRegistryName(BlockList.acacia_wood_snow.getRegistryName()),
                        ItemList.acacia_planks_snow = new BlockItem(BlockList.acacia_planks_snow, new Item.Properties().group(obelisk)).setRegistryName(BlockList.acacia_planks_snow.getRegistryName()),
                        ItemList.acacia_log_vert_slab = new BlockItem(BlockList.acacia_log_vert_slab, new Item.Properties().group(obelisk))
                                .setRegistryName(BlockList.acacia_log_vert_slab.getRegistryName()),
                        ItemList.acacia_planks_vert_slab = new BlockItem(BlockList.acacia_planks_vert_slab, new Item.Properties().group(obelisk))
                                .setRegistryName(BlockList.acacia_planks_vert_slab.getRegistryName()),
                        ItemList.acacia_wood_vert_slab = new BlockItem(BlockList.acacia_wood_vert_slab, new Item.Properties().group(obelisk))
                                .setRegistryName(BlockList.acacia_wood_vert_slab.getRegistryName()),
                        ItemList.stripped_acacia_vert_slab = new BlockItem(BlockList.stripped_acacia_vert_slab, new Item.Properties().group(obelisk))
                                .setRegistryName(BlockList.stripped_acacia_vert_slab.getRegistryName()),
                        ItemList.locked_acacia_door = new BlockItem(BlockList.locked_acacia_door, new Item.Properties().group(misc)).setRegistryName(BlockList.locked_acacia_door.getRegistryName()),
                        //endregion

                        //region Jungle
                        ItemList.jungle_log_stairs = new BlockItem(BlockList.jungle_log_stairs, new Item.Properties().group(obelisk)).setRegistryName(BlockList.jungle_log_stairs.getRegistryName()),
                        ItemList.jungle_log_slab = new BlockItem(BlockList.jungle_log_slab, new Item.Properties().group(obelisk)).setRegistryName(BlockList.jungle_log_slab.getRegistryName()),
                        ItemList.jungle_log_wall = new BlockItem(BlockList.jungle_log_wall, new Item.Properties().group(obelisk)).setRegistryName(BlockList.jungle_log_wall.getRegistryName()),
                        ItemList.jungle_wood_stairs = new BlockItem(BlockList.jungle_wood_stairs, new Item.Properties().group(obelisk)).setRegistryName(BlockList.jungle_wood_stairs.getRegistryName()),
                        ItemList.jungle_wood_slab = new BlockItem(BlockList.jungle_wood_slab, new Item.Properties().group(obelisk)).setRegistryName(BlockList.jungle_wood_slab.getRegistryName()),
                        ItemList.jungle_wood_wall = new BlockItem(BlockList.jungle_wood_wall, new Item.Properties().group(obelisk)).setRegistryName(BlockList.jungle_wood_wall.getRegistryName()),
                        ItemList.jungle_planks_wall = new BlockItem(BlockList.jungle_planks_wall, new Item.Properties().group(obelisk)).setRegistryName(BlockList.jungle_planks_wall.getRegistryName()),
                        ItemList.stripped_jungle_wood_stairs = new BlockItem(BlockList.stripped_jungle_wood_stairs, new Item.Properties().group(obelisk))
                                .setRegistryName(BlockList.stripped_jungle_wood_stairs.getRegistryName()),
                        ItemList.stripped_jungle_wood_slab = new BlockItem(BlockList.stripped_jungle_wood_slab, new Item.Properties().group(obelisk))
                                .setRegistryName(BlockList.stripped_jungle_wood_slab.getRegistryName()),
                        ItemList.stripped_jungle_wood_wall = new BlockItem(BlockList.stripped_jungle_wood_wall, new Item.Properties().group(obelisk))
                                .setRegistryName(BlockList.stripped_jungle_wood_wall.getRegistryName()),
                        ItemList.jungle_wood_fence = new BlockItem(BlockList.jungle_wood_fence, new Item.Properties().group(obelisk)).setRegistryName(BlockList.jungle_wood_fence.getRegistryName()),
                        ItemList.jungle_wood_snow = new BlockItem(BlockList.jungle_wood_snow, new Item.Properties().group(obelisk)).setRegistryName(BlockList.jungle_wood_snow.getRegistryName()),
                        ItemList.jungle_planks_snow = new BlockItem(BlockList.jungle_planks_snow, new Item.Properties().group(obelisk)).setRegistryName(BlockList.jungle_planks_snow.getRegistryName()),
                        ItemList.jungle_wood_vert_slab = new BlockItem(BlockList.jungle_wood_vert_slab, new Item.Properties().group(obelisk))
                                .setRegistryName(BlockList.jungle_wood_vert_slab.getRegistryName()),
                        ItemList.jungle_log_vert_slab = new BlockItem(BlockList.jungle_log_vert_slab, new Item.Properties().group(obelisk))
                                .setRegistryName(BlockList.jungle_log_vert_slab.getRegistryName()),
                        ItemList.jungle_planks_vert_slab = new BlockItem(BlockList.jungle_planks_vert_slab, new Item.Properties().group(obelisk))
                                .setRegistryName(BlockList.jungle_planks_vert_slab.getRegistryName()),
                        ItemList.stripped_jungle_vert_slab = new BlockItem(BlockList.stripped_jungle_vertslab, new Item.Properties().group(obelisk))
                                .setRegistryName(BlockList.stripped_jungle_vertslab.getRegistryName()),
                        ItemList.locked_jungle_door = new BlockItem(BlockList.locked_jungle_door, new Item.Properties().group(misc)).setRegistryName(BlockList.locked_jungle_door.getRegistryName()),
                        //endregion

                        //region Stone
                        ItemList.stone_fence = new BlockItem(BlockList.stone_fence, new Item.Properties().group(obelisk)).setRegistryName(BlockList.stone_fence.getRegistryName()),
                        ItemList.cobblestone_fence = new BlockItem(BlockList.cobblestone_fence, new Item.Properties().group(obelisk)).setRegistryName(BlockList.cobblestone_fence.getRegistryName()),
                        ItemList.stone_brick_fence = new BlockItem(BlockList.stone_brick_fence, new Item.Properties().group(obelisk)).setRegistryName(BlockList.stone_brick_fence.getRegistryName()),
                        ItemList.mossy_stone_brick_fence = new BlockItem(BlockList.mossy_stone_brick_fence, new Item.Properties().group(obelisk))
                                .setRegistryName(BlockList.mossy_stone_brick_fence.getRegistryName()),
                        ItemList.stone_snow = new BlockItem(BlockList.stone_snow, new Item.Properties().group(obelisk)).setRegistryName(BlockList.stone_snow.getRegistryName()),
                        ItemList.cobblestone_snow = new BlockItem(BlockList.cobblestone_snow, new Item.Properties().group(obelisk)).setRegistryName(BlockList.cobblestone_snow.getRegistryName()),
                        ItemList.stone_brick_snow = new BlockItem(BlockList.stone_brick_snow, new Item.Properties().group(obelisk)).setRegistryName(BlockList.stone_brick_snow.getRegistryName()),
                        ItemList.mossy_stone_brick_snow = new BlockItem(BlockList.mossy_stone_brick_snow, new Item.Properties().group(obelisk))
                                .setRegistryName(BlockList.mossy_stone_brick_snow.getRegistryName()),
                        ItemList.stone_vert_slab = new BlockItem(BlockList.stone_vert_slab, new Item.Properties().group(obelisk)).setRegistryName(BlockList.stone_vert_slab.getRegistryName()),
                        ItemList.granite_vert_slab = new BlockItem(BlockList.granite_vert_slab, new Item.Properties().group(obelisk)).setRegistryName(BlockList.granite_vert_slab.getRegistryName()),
                        ItemList.polished_granite_vert_slab = new BlockItem(BlockList.polished_granite_vert_slab, new Item.Properties().group(obelisk))
                                .setRegistryName(BlockList.polished_granite_vert_slab.getRegistryName()),
                        ItemList.andesite_vert_slab = new BlockItem(BlockList.andesite_vert_slab, new Item.Properties().group(obelisk)).setRegistryName(BlockList.andesite_vert_slab.getRegistryName()),
                        ItemList.polished_andesite_vert_slab = new BlockItem(BlockList.polished_andesite_vert_slab, new Item.Properties().group(obelisk))
                                .setRegistryName(BlockList.polished_andesite_vert_slab.getRegistryName()),
                        ItemList.cobblestone_vert_slab = new BlockItem(BlockList.cobblestone_vert_slab, new Item.Properties().group(obelisk))
                                .setRegistryName(BlockList.cobblestone_vert_slab.getRegistryName()),
                        ItemList.smooth_stone_vert_slab = new BlockItem(BlockList.smooth_stone_vert_slab, new Item.Properties().group(obelisk))
                                .setRegistryName(BlockList.smooth_stone_vert_slab.getRegistryName()),
                        ItemList.quartz_vert_slab = new BlockItem(BlockList.quartz_vert_slab, new Item.Properties().group(obelisk)).setRegistryName(BlockList.quartz_vert_slab.getRegistryName()),
                        ItemList.smooth_quartz_vert_slab = new BlockItem(BlockList.smooth_quartz_vert_slab, new Item.Properties().group(obelisk))
                                .setRegistryName(BlockList.smooth_quartz_vert_slab.getRegistryName()),
                        ItemList.chiseled_quartz_vert_slab = new BlockItem(BlockList.chiseled_quartz_vert_slab, new Item.Properties().group(obelisk))
                                .setRegistryName(BlockList.chiseled_quartz_vert_slab.getRegistryName()),
                        ItemList.mossy_cobblestone_vert_slab = new BlockItem(BlockList.mossy_cobblestone_vert_slab, new Item.Properties().group(obelisk))
                                .setRegistryName(BlockList.mossy_cobblestone_vert_slab.getRegistryName()),
                        ItemList.mossy_stone_bricks_vert_slab = new BlockItem(BlockList.mossy_stone_bricks_vert_slab, new Item.Properties().group(obelisk))
                                .setRegistryName(BlockList.mossy_stone_bricks_vert_slab.getRegistryName()),
                        ItemList.stone_bricks_vert_slab = new BlockItem(BlockList.stone_bricks_vert_slab, new Item.Properties().group(obelisk))
                                .setRegistryName(BlockList.stone_bricks_vert_slab.getRegistryName()),
                        ItemList.cracked_stone_brick_stairs = new BlockItem(BlockList.cracked_stone_brick_stairs, new Item.Properties().group(obelisk))
                                .setRegistryName(BlockList.cracked_stone_brick_stairs.getRegistryName()),
                        ItemList.cracked_stone_brick_slab = new BlockItem(BlockList.cracked_stone_brick_slab, new Item.Properties().group(obelisk))
                                .setRegistryName(BlockList.cracked_stone_brick_slab.getRegistryName()),
                        ItemList.cracked_stone_brick_vert_slab = new BlockItem(BlockList.cracked_stone_brick_vert_slab, new Item.Properties().group(obelisk))
                                .setRegistryName(BlockList.cracked_stone_brick_vert_slab.getRegistryName()),
                        ItemList.cracked_stone_brick_snow = new BlockItem(BlockList.cracked_stone_brick_snow, new Item.Properties().group(obelisk))
                                .setRegistryName(BlockList.cracked_stone_brick_snow.getRegistryName()),
                        ItemList.chiseled_stone_bricks_vert_slab = new BlockItem(BlockList.chiseled_stone_bricks_vert_slab, new Item.Properties().group(obelisk))
                                .setRegistryName(BlockList.chiseled_stone_bricks_vert_slab.getRegistryName()),
                        ItemList.cracked_stone_brick_wall = new BlockItem(BlockList.cracked_stone_brick_wall, new Item.Properties().group(obelisk))
                                .setRegistryName(BlockList.cracked_stone_brick_wall.getRegistryName()),
                        ItemList.cracked_stone_brick_fence = new BlockItem(BlockList.cracked_stone_brick_fence, new Item.Properties().group(obelisk))
                                .setRegistryName(BlockList.cracked_stone_brick_fence.getRegistryName()),
                        //endregion

                        //region Gravel
                        ItemList.gravel_stairs = new BlockItem(BlockList.gravel_stairs, new Item.Properties().group(obelisk)).setRegistryName(BlockList.gravel_stairs.getRegistryName()),
                        ItemList.gravel_slab = new BlockItem(BlockList.gravel_slab, new Item.Properties().group(obelisk)).setRegistryName(BlockList.gravel_slab.getRegistryName()),
                        ItemList.gravel_wall = new BlockItem(BlockList.gravel_wall, new Item.Properties().group(obelisk)).setRegistryName(BlockList.gravel_wall.getRegistryName()),
                        ItemList.gravel_snow = new BlockItem(BlockList.gravel_snow, new Item.Properties().group(obelisk)).setRegistryName(BlockList.gravel_snow.getRegistryName()),
                        ItemList.gravel_vert_slab = new BlockItem(BlockList.gravel_vert_slab, new Item.Properties().group(obelisk)).setRegistryName(BlockList.gravel_vert_slab.getRegistryName()),
                        //endregion

                        //region Bookshelf
                        ItemList.bookshelf_stairs = new BlockItem(BlockList.bookshelf_stairs, new Item.Properties().group(obelisk)).setRegistryName(BlockList.bookshelf_stairs.getRegistryName()),
                        ItemList.bookshelf_slab = new BlockItem(BlockList.bookshelf_slab, new Item.Properties().group(obelisk)).setRegistryName(BlockList.bookshelf_slab.getRegistryName()),
                        ItemList.bookshelf_vert_slab = new BlockItem(BlockList.bookshelf_vert_slab, new Item.Properties().group(obelisk))
                                .setRegistryName(BlockList.bookshelf_vert_slab.getRegistryName()),
                        //endregion

                        //region Haybale
                        ItemList.haybale_stairs = new BlockItem(BlockList.haybale_stairs, new Item.Properties().group(obelisk)).setRegistryName(BlockList.haybale_stairs.getRegistryName()),
                        ItemList.haybale_slab = new BlockItem(BlockList.haybale_slab, new Item.Properties().group(obelisk)).setRegistryName(BlockList.haybale_slab.getRegistryName()),
                        ItemList.haybale_vert_slab = new BlockItem(BlockList.haybale_vert_slab, new Item.Properties().group(obelisk)).setRegistryName(BlockList.haybale_vert_slab.getRegistryName()),
                        ItemList.hayblae_snow = new BlockItem(BlockList.haybale_snow, new Item.Properties().group(obelisk)).setRegistryName(BlockList.haybale_snow.getRegistryName()),
                        //endregion

                        //region Wool
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
                        //endregion

                        //region Cauldrons
                        ItemList.spruce_cauldron = new BlockItem(BlockList.spruce_cauldron, new Item.Properties().group(misc)).setRegistryName(BlockList.spruce_cauldron.getRegistryName()),
                        //endregion

                        //region Tables
                        ItemList.oak_planks_table = new BlockItem(BlockList.oak_planks_table, new Item.Properties().group(furniture)).setRegistryName(BlockList.oak_planks_table.getRegistryName()),
                        ItemList.spruce_planks_table = new BlockItem(BlockList.spruce_planks_table, new Item.Properties().group(furniture)).setRegistryName(BlockList.spruce_planks_table.getRegistryName()),
                        ItemList.dark_oak_planks_table = new BlockItem(BlockList.dark_oak_planks_table, new Item.Properties().group(furniture)).setRegistryName(BlockList.dark_oak_planks_table.getRegistryName()),
                        ItemList.birch_planks_table = new BlockItem(BlockList.birch_planks_table, new Item.Properties().group(furniture)).setRegistryName(BlockList.birch_planks_table.getRegistryName()),
                        ItemList.jungle_planks_table = new BlockItem(BlockList.jungle_planks_table, new Item.Properties().group(furniture)).setRegistryName(BlockList.jungle_planks_table.getRegistryName()),
                        ItemList.acacia_planks_table = new BlockItem(BlockList.acacia_planks_table, new Item.Properties().group(furniture)).setRegistryName(BlockList.acacia_planks_table.getRegistryName()),
                        ItemList.oak_wood_table = new BlockItem(BlockList.oak_wood_table, new Item.Properties().group(furniture)).setRegistryName(BlockList.oak_wood_table.getRegistryName()),
                        ItemList.spruce_wood_table = new BlockItem(BlockList.spruce_wood_table, new Item.Properties().group(furniture)).setRegistryName(BlockList.spruce_wood_table.getRegistryName()),
                        ItemList.dark_oak_wood_table = new BlockItem(BlockList.dark_oak_wood_table, new Item.Properties().group(furniture)).setRegistryName(BlockList.dark_oak_wood_table.getRegistryName()),
                        ItemList.birch_wood_table = new BlockItem(BlockList.birch_wood_table, new Item.Properties().group(furniture)).setRegistryName(BlockList.birch_wood_table.getRegistryName()),
                        ItemList.jungle_wood_table = new BlockItem(BlockList.jungle_wood_table, new Item.Properties().group(furniture)).setRegistryName(BlockList.jungle_wood_table.getRegistryName()),
                        ItemList.acacia_wood_table = new BlockItem(BlockList.acacia_wood_table, new Item.Properties().group(furniture)).setRegistryName(BlockList.acacia_wood_table.getRegistryName()),
                        ItemList.cobblestone_table = new BlockItem(BlockList.cobblestone_table, new Item.Properties().group(furniture)).setRegistryName(BlockList.cobblestone_table.getRegistryName()),
                        ItemList.stone_table = new BlockItem(BlockList.stone_table, new Item.Properties().group(furniture)).setRegistryName(BlockList.stone_table.getRegistryName()),
                        ItemList.earth_obelisk_table = new BlockItem(BlockList.earth_obelisk_table, new Item.Properties().group(furniture)).setRegistryName(BlockList.earth_obelisk_table.getRegistryName()),
                        ItemList.cobblestone_oak_planks_table = new BlockItem(BlockList.cobblestone_oak_planks_table, new Item.Properties().group(furniture)).setRegistryName(BlockList.cobblestone_oak_planks_table.getRegistryName()),
                        ItemList.cobblestone_spruce_planks_table = new BlockItem(BlockList.cobblestone_spruce_planks_table, new Item.Properties().group(furniture)).setRegistryName(BlockList.cobblestone_spruce_planks_table.getRegistryName()),
                        ItemList.cobblestone_birch_planks_table = new BlockItem(BlockList.cobblestone_brich_planks_table, new Item.Properties().group(furniture)).setRegistryName(BlockList.cobblestone_brich_planks_table.getRegistryName()),
                        ItemList.cobblestone_jungle_planks_table = new BlockItem(BlockList.cobblestone_jungle_planks_table, new Item.Properties().group(furniture)).setRegistryName(BlockList.cobblestone_jungle_planks_table.getRegistryName()),
                        ItemList.cobblestone_acacia_planks_table = new BlockItem(BlockList.cobblestone_acacia_planks_table, new Item.Properties().group(furniture)).setRegistryName(BlockList.cobblestone_acacia_planks_table.getRegistryName()),
                        ItemList.cobblestone_dark_oak_planks_table = new BlockItem(BlockList.cobblestone_dark_oak_planks_table, new Item.Properties().group(furniture)).setRegistryName(BlockList.cobblestone_dark_oak_planks_table.getRegistryName()),
                        ItemList.stone_wall = new BlockItem(BlockList.stone_wall, new Item.Properties().group(obelisk)).setRegistryName(BlockList.stone_wall.getRegistryName()),
                        //endregion

                        //region Stools
                        ItemList.oak_planks_stool = new BlockItem(BlockList.oak_planks_stool, new Item.Properties().group(furniture)).setRegistryName(BlockList.oak_planks_stool.getRegistryName()),
                        ItemList.spruce_planks_stool = new BlockItem(BlockList.spruce_planks_stool, new Item.Properties().group(furniture)).setRegistryName(BlockList.spruce_planks_stool.getRegistryName()),
                        ItemList.birch_planks_stool = new BlockItem(BlockList.birch_planks_stool, new Item.Properties().group(furniture)).setRegistryName(BlockList.birch_planks_stool.getRegistryName()),
                        ItemList.jungle_planks_stool = new BlockItem(BlockList.jungle_planks_stool, new Item.Properties().group(furniture)).setRegistryName(BlockList.jungle_planks_stool.getRegistryName()),
                        ItemList.acacia_planks_stool = new BlockItem(BlockList.acacia_planks_stool, new Item.Properties().group(furniture)).setRegistryName(BlockList.acacia_planks_stool.getRegistryName()),
                        ItemList.dark_oak_planks_stool = new BlockItem(BlockList.dark_oak_planks_stool, new Item.Properties().group(furniture)).setRegistryName(BlockList.dark_oak_planks_stool.getRegistryName()),
                        ItemList.oak_wood_stool = new BlockItem(BlockList.oak_wood_stool, new Item.Properties().group(furniture)).setRegistryName(BlockList.oak_wood_stool.getRegistryName()),
                        ItemList.spruce_wood_stool = new BlockItem(BlockList.spruce_wood_stool, new Item.Properties().group(furniture)).setRegistryName(BlockList.spruce_wood_stool.getRegistryName()),
                        ItemList.birch_wood_stool = new BlockItem(BlockList.birch_wood_stool, new Item.Properties().group(furniture)).setRegistryName(BlockList.birch_wood_stool.getRegistryName()),
                        ItemList.jungle_wood_stool = new BlockItem(BlockList.jungle_wood_stool, new Item.Properties().group(furniture)).setRegistryName(BlockList.jungle_wood_stool.getRegistryName()),
                        ItemList.acacia_wood_stool = new BlockItem(BlockList.acacia_wood_stool, new Item.Properties().group(furniture)).setRegistryName(BlockList.acacia_wood_stool.getRegistryName()),
                        ItemList.dark_oak_wood_stool = new BlockItem(BlockList.dark_oak_wood_stool, new Item.Properties().group(furniture)).setRegistryName(BlockList.dark_oak_wood_stool.getRegistryName()),
                        ItemList.oak_log_stool = new BlockItem(BlockList.oak_log_stool, new Item.Properties().group(furniture)).setRegistryName(BlockList.oak_log_stool.getRegistryName()),
                        ItemList.spruce_log_stool = new BlockItem(BlockList.spruce_log_stool, new Item.Properties().group(furniture)).setRegistryName(BlockList.spruce_log_stool.getRegistryName()),
                        ItemList.birch_log_stool = new BlockItem(BlockList.birch_log_stool, new Item.Properties().group(furniture)).setRegistryName(BlockList.birch_log_stool.getRegistryName()),
                        ItemList.jungle_log_stool = new BlockItem(BlockList.jungle_log_stool, new Item.Properties().group(furniture)).setRegistryName(BlockList.jungle_log_stool.getRegistryName()),
                        ItemList.acacia_log_stool = new BlockItem(BlockList.acacia_log_stool, new Item.Properties().group(furniture)).setRegistryName(BlockList.acacia_log_stool.getRegistryName()),
                        ItemList.dark_oak_log_stool = new BlockItem(BlockList.dark_oak_log_stool, new Item.Properties().group(furniture)).setRegistryName(BlockList.dark_oak_log_stool.getRegistryName()),
                        ItemList.cobblestone_stool = new BlockItem(BlockList.cobblestone_stool, new Item.Properties().group(furniture)).setRegistryName(BlockList.cobblestone_stool.getRegistryName()),
                        ItemList.stone_stool = new BlockItem(BlockList.stone_stool, new Item.Properties().group(furniture)).setRegistryName(BlockList.stone_stool.getRegistryName()),
                        ItemList.stone_bricks_stool = new BlockItem(BlockList.stone_bricks_stool, new Item.Properties().group(furniture)).setRegistryName(BlockList.stone_bricks_stool.getRegistryName()),
                        ItemList.cracked_stone_bricks_stool = new BlockItem(BlockList.cracked_stone_bricks_stool, new Item.Properties().group(furniture))
                                .setRegistryName(BlockList.cracked_stone_bricks_stool.getRegistryName()),
                        //endregion

                        //region Benches
                        ItemList.bench = new BlockItem(BlockList.bench, new Item.Properties().group(furniture)).setRegistryName(BlockList.bench.getRegistryName()),
                        ItemList.spruce_wood_bench = new BlockItem(BlockList.spruce_wood_bench, new Item.Properties().group(furniture)).setRegistryName(BlockList.spruce_wood_bench.getRegistryName()),
                        ItemList.birch_wood_bench = new BlockItem(BlockList.birch_wood_bench, new Item.Properties().group(furniture)).setRegistryName(BlockList.birch_wood_bench.getRegistryName()),
                        ItemList.jungle_wood_bench = new BlockItem(BlockList.jungle_wood_bench, new Item.Properties().group(furniture)).setRegistryName(BlockList.jungle_wood_bench.getRegistryName()),
                        ItemList.acacia_wood_bench = new BlockItem(BlockList.acacia_wood_bench, new Item.Properties().group(furniture)).setRegistryName(BlockList.acacia_wood_bench.getRegistryName()),
                        ItemList.dark_oak_wood_bench = new BlockItem(BlockList.dark_oak_wood_bench, new Item.Properties().group(furniture)).setRegistryName(BlockList.dark_oak_wood_bench.getRegistryName()),
                        //endregion

                        //region Long Tables
                        ItemList.oak_wood_longtable = new BlockItem(BlockList.oak_wood_longtable, new Item.Properties().group(furniture)).setRegistryName(BlockList.oak_wood_longtable.getRegistryName()),
                        ItemList.spruce_wood_longtable = new BlockItem(BlockList.spruce_wood_longtable, new Item.Properties().group(furniture)).setRegistryName(BlockList.spruce_wood_longtable.getRegistryName()),
                        ItemList.birch_wood_longtable = new BlockItem(BlockList.birch_wood_longtable, new Item.Properties().group(furniture)).setRegistryName(BlockList.birch_wood_longtable.getRegistryName()),
                        ItemList.jungle_wood_longtable = new BlockItem(BlockList.jungle_wood_longtable, new Item.Properties().group(furniture)).setRegistryName(BlockList.jungle_wood_longtable.getRegistryName()),
                        ItemList.acacia_wood_longtable = new BlockItem(BlockList.acacia_wood_longtable, new Item.Properties().group(furniture)).setRegistryName(BlockList.acacia_wood_longtable.getRegistryName()),
                        ItemList.dark_oak_wood_longtable = new BlockItem(BlockList.dark_oak_wood_longtable, new Item.Properties().group(furniture))
                                .setRegistryName(BlockList.dark_oak_wood_longtable.getRegistryName()),
                        //endregion

                        //region Wagons
                        ItemList.oak_wagon = new BlockItem(BlockList.oak_wagon, new Item.Properties().group(furniture)).setRegistryName(BlockList.oak_wagon.getRegistryName()),
                        //endregion

                        //region Chairs
                        ItemList.spruce_chair = new BlockItem(BlockList.spruce_chair, new Item.Properties().group(furniture)).setRegistryName(BlockList.spruce_chair.getRegistryName()),
                        //endregion

                        //region Iron
                        ItemList.iron_wall = new BlockItem(BlockList.iron_wall, new Item.Properties().group(obelisk)).setRegistryName(BlockList.iron_wall.getRegistryName()),
                        ItemList.iron_snow = new BlockItem(BlockList.iron_snow, new Item.Properties().group(obelisk)).setRegistryName(BlockList.iron_snow.getRegistryName()),
                        ItemList.iron_slab = new BlockItem(BlockList.iron_slab, new Item.Properties().group(obelisk)).setRegistryName(BlockList.iron_slab.getRegistryName()),
                        ItemList.iron_stairs = new BlockItem(BlockList.iron_stairs, new Item.Properties().group(obelisk)).setRegistryName(BlockList.iron_stairs.getRegistryName()),
                        ItemList.iron_vert_slab = new BlockItem(BlockList.iron_vert_slab, new Item.Properties().group(obelisk)).setRegistryName(BlockList.iron_vert_slab.getRegistryName()),
                        //endregion

                        //region Lecterns
                        ItemList.oak_lectern = new BlockItem(BlockList.oak_lectern, new Item.Properties().group(misc)).setRegistryName(BlockList.oak_lectern.getRegistryName()),
                        ItemList.spruce_lectern = new BlockItem(BlockList.spruce_lectern, new Item.Properties().group(misc)).setRegistryName(BlockList.spruce_lectern.getRegistryName()),
                        ItemList.birch_lectern = new BlockItem(BlockList.birch_lectern, new Item.Properties().group(misc)).setRegistryName(BlockList.birch_lectern.getRegistryName()),
                        ItemList.dark_oak_lectern = new BlockItem(BlockList.dark_oak_lectern, new Item.Properties().group(misc)).setRegistryName(BlockList.dark_oak_lectern.getRegistryName()),
                        ItemList.acacia_lectern = new BlockItem(BlockList.acacia_lectern, new Item.Properties().group(misc)).setRegistryName(BlockList.acacia_lectern.getRegistryName()),
                        ItemList.jungle_lectern = new BlockItem(BlockList.jungle_lectern, new Item.Properties().group(misc)).setRegistryName(BlockList.jungle_lectern.getRegistryName())
                        //endregion
                        //endregion

                );

        EntityList.registerEntitySpawnEggs(event);


        logger.info("Items Registered");
    }

    @SubscribeEvent
    public static void registerBlock(final RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll
                (
                        //region Trepi
                        //region Interior Deco
                        BlockList.earthenware_plate = (EarthenwarePlate) new EarthenwarePlate(Block.Properties.create(Material.GLASS)
                                .hardnessAndResistance(0.15f, 1f).sound(SoundType.GLASS))
                                .setRegistryName(location("earthenware_plate")),
                        BlockList.earthenware_mug = (EarthenwareMug) new EarthenwareMug(Block.Properties.create(Material.GLASS)
                                .hardnessAndResistance(0.05f, 1f).sound(SoundType.GLASS))
                                .setRegistryName(location("earthenware_mug")),
                        BlockList.earthenware_set = (EarthenwareSet) new EarthenwareSet(Block.Properties.create(Material.GLASS)
                                .hardnessAndResistance(0.2f, 1f).sound(SoundType.GLASS))
                                .setRegistryName(location("earthenware_set")),
                        //endregion

                        //region Merchant Deco
                        BlockList.merchant_sign = (MerchantSign) new MerchantSign(Block.Properties.create(Material.WOOD)
                                .hardnessAndResistance(0.75f, 50f).sound(SoundType.WOOD))
                                .setRegistryName(location("merchant_sign")),
                        //endregion

                        //region Lighting
                        BlockList.candle_wallmounted = (CandleWallmounted) new CandleWallmounted(Block.Properties.create(Material.ROCK)
                                .hardnessAndResistance(0.15f, 1f).sound(SoundType.STONE))
                                .setRegistryName(location("candle_wallmounted")),
                        //endregion
                        //endregion

                        //region Earth Obelisk
                        BlockList.earth_obelisk_block = new Block(Block.Properties.create(Material.IRON)
                                .hardnessAndResistance(50f, 18000000.0f)
                                .lightValue(15).sound(SoundType.METAL)).setRegistryName(location("earth_obelisk_block")),
                        BlockList.earth_obelisk_ore = new Block(Block.Properties.create(Material.IRON)
                                .hardnessAndResistance(50f, 180f)
                                .lightValue(15).sound(SoundType.METAL)).setRegistryName(location("earth_obelisk_ore")),
                        BlockList.earth_obelisk_wall = (WallBlock) new WallBlock(Block.Properties.from(BlockList.earth_obelisk_block))
                                .setRegistryName(location("earth_obelisk_wall")),
                        BlockList.earth_obelisk_slab = (SlabBlock) new SlabBlock(Block.Properties.from(BlockList.earth_obelisk_block))
                                .setRegistryName(location("earth_obelisk_slab")),
                        BlockList.earth_obelisk_stairs = (StairsBlock) new CustomStairsBlock(BlockList.earth_obelisk_block.getDefaultState(),
                                Block.Properties.from(BlockList.earth_obelisk_block)).setRegistryName(location("earth_obelisk_stairs")),
                        BlockList.earth_obelisk_fence = (FenceBlock) new FenceBlock(Block.Properties.from(BlockList.earth_obelisk_block)).setRegistryName(location("earth_obelisk_fence")),
                        //endregion

                        //region Fire Obelisk
                        BlockList.fire_obelisk_block = new Block(Block.Properties.from(BlockList.earth_obelisk_block)).setRegistryName(location("fire_obelisk_block")),
                        BlockList.fire_obelisk_ore = new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(50f, 180f).lightValue(15).sound(SoundType.METAL)).setRegistryName(location("fire_obelisk_ore")),
                        BlockList.fire_obelisk_stairs = (StairsBlock) new CustomStairsBlock(BlockList.fire_obelisk_block.getDefaultState(),
                                Block.Properties.from(BlockList.fire_obelisk_block)).setRegistryName(location("fire_obelisk_stairs")),
                        BlockList.fire_obelisk_slab = (SlabBlock) new SlabBlock(Block.Properties.from(BlockList.fire_obelisk_block)).setRegistryName(location("fire_obelisk_slab")),
                        BlockList.fire_obelisk_wall = (WallBlock) new WallBlock(Block.Properties.from(BlockList.fire_obelisk_block)).setRegistryName(location("fire_obelisk_wall")),
                        //endregion

                        //region Dirt
                        BlockList.dirt_slab = (SlabBlock) new SlabBlock(Block.Properties.create(Material.EARTH)
                                .hardnessAndResistance(0.5f, 2.5f).sound(SoundType.GROUND)).setRegistryName(location("dirt_slab")),
                        BlockList.dirt_wall = (WallBlock) new WallBlock(Block.Properties.from(BlockList.dirt_slab)).setRegistryName(location("dirt_wall")),
                        BlockList.dirt_stairs = (StairsBlock) new CustomStairsBlock(BlockList.dirt_slab.getDefaultState(),
                                Block.Properties.from(BlockList.dirt_slab)).setRegistryName(location("dirt_stairs")),
                        BlockList.coarse_dirt_wall = (WallBlock) new WallBlock(Block.Properties.from(BlockList.dirt_slab)).setRegistryName(location("coarse_dirt_wall")),
                        BlockList.coarse_dirt_slab = (SlabBlock) new SlabBlock(Block.Properties.from(BlockList.dirt_slab)).setRegistryName(location("coarse_dirt_slab")),
                        BlockList.coarse_dirt_stairs = (StairsBlock) new CustomStairsBlock(BlockList.coarse_dirt_slab.getDefaultState(),
                                Block.Properties.from(BlockList.dirt_slab)).setRegistryName(location("coarse_dirt_stairs")),
                        BlockList.dirt_fence = (FenceBlock) new FenceBlock(Block.Properties.from(BlockList.dirt_slab)).setRegistryName(location("dirt_fence")),
                        BlockList.coarse_dirt_fence = (FenceBlock) new FenceBlock(Block.Properties.from(BlockList.coarse_dirt_slab)).setRegistryName(location("coarse_dirt_fence")),
                        BlockList.dirt_snow = (SnowBlock) new CustomSnowBlock(Block.Properties.create(Material.EARTH)
                                .hardnessAndResistance(0.1f, 0.5f).sound(SoundType.GROUND)).setRegistryName(location("dirt_snow")),
                        BlockList.coarse_dirt_snow = (SnowBlock) new CustomSnowBlock(Block.Properties.from(BlockList.coarse_dirt_slab)).setRegistryName(location("coarse_dirt_snow")),
                        BlockList.dirt_vert_slab = (VertSlabBlock) new VertSlabBlock(Block.Properties.from(BlockList.dirt_slab)).setRegistryName(location("dirt_vert_slab")),
                        BlockList.coarse_dirt_vert_slab = (VertSlabBlock) new VertSlabBlock(Block.Properties.from(BlockList.coarse_dirt_slab)).setRegistryName(location("coarse_dirt_vert_slab")),
                        //endregion hoi hoi hiuhuhuhuhuh

                        //region Grass
                        BlockList.grass_block_slab = (SlabBlock) new SlabBlock(Block.Properties.from(BlockList.dirt_slab)).setRegistryName(location("grass_block_slab")),
                        //endregion

                        //region Sand
                        BlockList.sand_slab = (SlabBlock) new SlabBlock(Block.Properties.create(Material.EARTH)
                                .hardnessAndResistance(0.5f, 2.5f).sound(SoundType.SAND)).setRegistryName(location("sand_slab")),
                        BlockList.sand_wall = (WallBlock) new WallBlock(Block.Properties.from(BlockList.sand_slab)).setRegistryName(location("sand_wall")),
                        BlockList.sand_stairs = (StairsBlock) new CustomStairsBlock(BlockList.sand_slab.getDefaultState(),
                                Block.Properties.from(BlockList.sand_slab)).setRegistryName(location("sand_stairs")),
                        BlockList.red_sand_stairs = (StairsBlock) new CustomStairsBlock(BlockList.sand_stairs.getDefaultState(),
                                Block.Properties.from(BlockList.sand_slab)).setRegistryName(location("red_sand_stairs")),
                        BlockList.red_sand_slab = (SlabBlock) new SlabBlock(Block.Properties.from(BlockList.sand_slab)).setRegistryName(location("red_sand_slab")),
                        BlockList.red_sand_wall = (WallBlock) new WallBlock(Block.Properties.from(BlockList.sand_wall)).setRegistryName(location("red_sand_wall")),
                        BlockList.sand_snow = (SnowBlock) new CustomSnowBlock(Block.Properties.from(BlockList.sand_slab)).setRegistryName(location("sand_snow")),
                        BlockList.red_sand_snow = (SnowBlock) new CustomSnowBlock(Block.Properties.from(BlockList.red_sand_slab)).setRegistryName(location("red_sand_snow")),
                        BlockList.sand_vert_slab = (VertSlabBlock) new VertSlabBlock(Block.Properties.from(BlockList.sand_slab)).setRegistryName(location("sand_vert_slab")),
                        BlockList.red_sand_vert_slab = (VertSlabBlock) new VertSlabBlock(Block.Properties.from(BlockList.red_sand_slab)).setRegistryName(location("red_sand_vert_slab")),
                        BlockList.sandstone_vert_slab = (VertSlabBlock) new VertSlabBlock(Block.Properties.create(Material.EARTH)
                                .hardnessAndResistance(2f, 15f).sound(SoundType.STONE)).setRegistryName(location("sandstone_vert_slab")),
                        BlockList.chiseled_sandstone_vert_slab = (VertSlabBlock) new VertSlabBlock(Block.Properties.from(BlockList.sandstone_vert_slab))
                                .setRegistryName(location("chiseled_sandstone_vert_slab")),
                        BlockList.cut_sandstone_vert_slab = (VertSlabBlock) new VertSlabBlock(Block.Properties.from(BlockList.sandstone_vert_slab))
                                .setRegistryName(location("cut_sandstone_vert_slab")),
                        BlockList.smooth_red_sandstone_vert_slab = (VertSlabBlock) new VertSlabBlock(Block.Properties.from(BlockList.sandstone_vert_slab))
                                .setRegistryName(location("smooth_red_sandstone_vert_slab")),
                        //endregion

                        //region Oak
                        BlockList.oak_wood_stairs = (StairsBlock) new CustomStairsBlock(BlockList.sand_slab.getDefaultState(),
                                Block.Properties.create(Material.WOOD).hardnessAndResistance(2f, 10f).sound(SoundType.WOOD)).setRegistryName(location("oak_wood_stairs")),
                        BlockList.oak_wood_slab = (SlabBlock) new SlabBlock(Block.Properties.from(BlockList.oak_wood_stairs)).setRegistryName(location("oak_wood_slab")),
                        BlockList.oak_wood_wall = (WallBlock) new WallBlock(Block.Properties.from(BlockList.oak_wood_stairs)).setRegistryName(location("oak_wood_wall")),
                        BlockList.oak_log_stairs = (StairsBlock) new CustomStairsBlock(BlockList.oak_wood_stairs.getDefaultState(),
                                Block.Properties.from(BlockList.oak_wood_stairs)).setRegistryName(location("oak_log_stairs")),
                        BlockList.oak_log_slab = (SlabBlock) new SlabBlock(Block.Properties.from(BlockList.oak_wood_stairs)).setRegistryName(location("oak_log_slab")),
                        BlockList.oak_log_wall = (WallBlock) new WallBlock(Block.Properties.from(BlockList.oak_wood_stairs)).setRegistryName(location("oak_log_wall")),
                        BlockList.oak_planks_wall = (WallBlock) new WallBlock(Block.Properties.from(BlockList.oak_wood_stairs)).setRegistryName(location("oak_planks_wall")),
                        BlockList.stripped_oak_wood_stairs = (StairsBlock) new CustomStairsBlock(BlockList.oak_wood_stairs.getDefaultState(),
                                Block.Properties.from(BlockList.oak_wood_stairs)).setRegistryName(location("stripped_oak_wood_stairs")),
                        BlockList.stripped_oak_wood_slab = (SlabBlock) new SlabBlock(Block.Properties.from(BlockList.oak_wood_stairs)).setRegistryName(location("stripped_oak_wood_slab")),
                        BlockList.stripped_oak_wood_wall = (WallBlock) new WallBlock(Block.Properties.from(BlockList.oak_wood_stairs)).setRegistryName(location("stripped_oak_wood_wall")),
                        BlockList.oak_wood_fence = (FenceBlock) new FenceBlock(Block.Properties.from(BlockList.oak_wood_stairs)).setRegistryName(location("oak_wood_fence")),
                        BlockList.oak_wood_snow = (SnowBlock) new CustomSnowBlock(Block.Properties.from(BlockList.oak_wood_slab)).setRegistryName(location("oak_wood_snow")),
                        BlockList.oak_planks_snow = (SnowBlock) new CustomSnowBlock(Block.Properties.from(BlockList.oak_planks_wall)).setRegistryName(location("oak_planks_snow")),
                        BlockList.oak_wood_vert_slab = (VertSlabBlock) new VertSlabBlock(Block.Properties.from(BlockList.oak_wood_slab)).setRegistryName(location("oak_wood_vert_slab")),
                        BlockList.oak_log_vert_slab = (VertSlabBlock) new VertSlabBlock(Block.Properties.from(BlockList.oak_log_slab)).setRegistryName(location("oak_log_vert_slab")),
                        BlockList.oak_planks_vert_slab = (VertSlabBlock) new VertSlabBlock(Block.Properties.from(BlockList.oak_planks_snow)).setRegistryName(location("oak_planks_vert_slab")),
                        BlockList.stripped_oak_vert_slab = (VertSlabBlock) new VertSlabBlock(Block.Properties.from(BlockList.stripped_oak_wood_slab))
                                .setRegistryName(location("stripped_oak_vert_slab")),
                        BlockList.locked_oak_door = (LockedDoor) new LockedDoor(Block.Properties.create(Material.IRON)).setRegistryName(location("locked_oak_door")),
                        //endregion

                        //region Spruce
                        BlockList.spruce_log_stairs = (StairsBlock) new CustomStairsBlock(BlockList.oak_wood_stairs.getDefaultState(),
                                Block.Properties.from(BlockList.oak_log_slab)).setRegistryName(location("spruce_log_stairs")),
                        BlockList.spruce_log_slab = (SlabBlock) new SlabBlock(Block.Properties.from(BlockList.spruce_log_stairs)).setRegistryName(location("spruce_log_slab")),
                        BlockList.spruce_log_wall = (WallBlock) new WallBlock(Block.Properties.from(BlockList.spruce_log_stairs)).setRegistryName(location("spruce_log_wall")),
                        BlockList.spruce_wood_stairs = (StairsBlock) new CustomStairsBlock(BlockList.spruce_log_stairs.getDefaultState(),
                                Block.Properties.from(BlockList.oak_log_slab)).setRegistryName(location("spruce_wood_stairs")),
                        BlockList.spruce_wood_slab = (SlabBlock) new SlabBlock(Block.Properties.from(BlockList.spruce_log_stairs)).setRegistryName(location("spruce_wood_slab")),
                        BlockList.spruce_wood_wall = (WallBlock) new WallBlock(Block.Properties.from(BlockList.spruce_log_stairs)).setRegistryName(location("spruce_wood_wall")),
                        BlockList.spruce_planks_wall = (WallBlock) new WallBlock(Block.Properties.from(BlockList.spruce_log_stairs)).setRegistryName(location("spruce_planks_wall")),
                        BlockList.stripped_spruce_wood_stairs = (StairsBlock) new CustomStairsBlock(BlockList.spruce_log_stairs.getDefaultState(),
                                Block.Properties.from(BlockList.spruce_log_stairs)).setRegistryName(location("stripped_spruce_wood_stairs")),
                        BlockList.stripped_spruce_wood_slab = (SlabBlock) new SlabBlock(Block.Properties.from(BlockList.spruce_log_stairs)).setRegistryName(location("stripped_spruce_wood_slab")),
                        BlockList.stripped_spruce_wood_wall = (WallBlock) new WallBlock(Block.Properties.from(BlockList.spruce_log_stairs)).setRegistryName(location("stripped_spruce_wood_wall")),
                        BlockList.spruce_wood_fence = (FenceBlock) new FenceBlock(Block.Properties.from(BlockList.spruce_log_stairs)).setRegistryName(location("spruce_wood_fence")),
                        BlockList.spruce_wood_snow = (SnowBlock) new CustomSnowBlock(Block.Properties.from(BlockList.spruce_log_stairs)).setRegistryName(location("spruce_wood_snow")),
                        BlockList.spruce_planks_snow = (SnowBlock) new CustomSnowBlock(Block.Properties.from(BlockList.spruce_log_stairs)).setRegistryName(location("spruce_planks_snow")),
                        BlockList.spruce_wood_vert_slab = (VertSlabBlock) new VertSlabBlock(Block.Properties.from(BlockList.spruce_log_stairs)).setRegistryName(location("spruce_wood_vert_slab")),
                        BlockList.spruce_log_vert_slab = (VertSlabBlock) new VertSlabBlock(Block.Properties.from(BlockList.spruce_log_stairs)).setRegistryName(location("spruce_log_vert_slab")),
                        BlockList.spruce_planks_vert_slab = (VertSlabBlock) new VertSlabBlock(Block.Properties.from(BlockList.spruce_log_stairs))
                                .setRegistryName(location("spruce_planks_vert_slab")),
                        BlockList.stripped_spruce_vert_slab = (VertSlabBlock) new VertSlabBlock(Block.Properties.from(BlockList.spruce_log_stairs))
                                .setRegistryName(location("stripped_spruce_vert_slab")),
                        BlockList.locked_spruce_door = (LockedDoor) new LockedDoor(Block.Properties.create(Material.IRON)).setRegistryName(location("locked_spruce_door")),
                        //endregion

                        //region Dark Oak
                        BlockList.dark_oak_log_stairs = (StairsBlock) new CustomStairsBlock(BlockList.oak_wood_stairs.getDefaultState(),
                                Block.Properties.from(BlockList.oak_log_slab)).setRegistryName(location("dark_oak_log_stairs")),
                        BlockList.dark_oak_log_slab = (SlabBlock) new SlabBlock(Block.Properties.from(BlockList.dark_oak_log_stairs)).setRegistryName(location("dark_oak_log_slab")),
                        BlockList.dark_oak_log_wall = (WallBlock) new WallBlock(Block.Properties.from(BlockList.dark_oak_log_stairs)).setRegistryName(location("dark_oak_log_wall")),
                        BlockList.dark_oak_wood_stairs = (StairsBlock) new CustomStairsBlock(BlockList.dark_oak_log_stairs.getDefaultState(),
                                Block.Properties.from(BlockList.dark_oak_log_stairs)).setRegistryName(location("dark_oak_wood_stairs")),
                        BlockList.dark_oak_wood_slab = (SlabBlock) new SlabBlock(Block.Properties.from(BlockList.dark_oak_log_stairs)).setRegistryName(location("dark_oak_wood_slab")),
                        BlockList.dark_oak_wood_wall = (WallBlock) new WallBlock(Block.Properties.from(BlockList.dark_oak_log_stairs)).setRegistryName(location("dark_oak_wood_wall")),
                        BlockList.dark_oak_planks_wall = (WallBlock) new WallBlock(Block.Properties.from(BlockList.dark_oak_log_stairs)).setRegistryName(location("dark_oak_planks_wall")),
                        BlockList.stripped_dark_oak_wood_stairs = (StairsBlock) new CustomStairsBlock(BlockList.dark_oak_log_stairs.getDefaultState(),
                                Block.Properties.from(BlockList.dark_oak_log_stairs)).setRegistryName(location("stripped_dark_oak_wood_stairs")),
                        BlockList.stripped_dark_oak_wood_slab = (SlabBlock) new SlabBlock(Block.Properties.from(BlockList.dark_oak_log_stairs))
                                .setRegistryName(location("stripped_dark_oak_wood_slab")),
                        BlockList.stripped_dark_oak_wood_wall = (WallBlock) new WallBlock(Block.Properties.from(BlockList.dark_oak_log_stairs))
                                .setRegistryName(location("stripped_dark_oak_wood_wall")),
                        BlockList.dark_oak_wood_fence = (FenceBlock) new FenceBlock(Block.Properties.from(BlockList.dark_oak_log_stairs)).setRegistryName(location("dark_oak_wood_fence")),
                        BlockList.dark_oak_wood_snow = (SnowBlock) new CustomSnowBlock(Block.Properties.from(BlockList.dark_oak_log_stairs)).setRegistryName(location("dark_oak_wood_snow")),
                        BlockList.dark_oak_planks_snow = (SnowBlock) new CustomSnowBlock(Block.Properties.from(BlockList.dark_oak_log_stairs)).setRegistryName(location("dark_oak_planks_snow")),
                        BlockList.dark_oak_wood_vert_slab = (VertSlabBlock) new VertSlabBlock(Block.Properties.from(BlockList.dark_oak_log_stairs))
                                .setRegistryName(location("dark_oak_wood_vert_slab")),
                        BlockList.dark_oak_log_vert_slab = (VertSlabBlock) new VertSlabBlock(Block.Properties.from(BlockList.dark_oak_log_stairs))
                                .setRegistryName(location("dark_oak_log_vert_slab")),
                        BlockList.dark_oak_planks_vert_slab = (VertSlabBlock) new VertSlabBlock(Block.Properties.from(BlockList.dark_oak_log_stairs))
                                .setRegistryName(location("dark_oak_planks_vert_slab")),
                        BlockList.stripped_dark_oak_vert_slab = (VertSlabBlock) new VertSlabBlock(Block.Properties.from(BlockList.dark_oak_log_stairs))
                                .setRegistryName(location("stripped_dark_oak_vert_slab")),
                        BlockList.locked_dark_oak_door = (LockedDoor) new LockedDoor(Block.Properties.create(Material.IRON)).setRegistryName(location("locked_dark_oak_door")),
                        //endregion

                        //region Birch
                        BlockList.birch_log_stairs = (StairsBlock) new CustomStairsBlock(BlockList.dark_oak_log_stairs.getDefaultState(),
                                Block.Properties.from(BlockList.dark_oak_log_slab)).setRegistryName(location("birch_log_stairs")),
                        BlockList.birch_log_slab = (SlabBlock) new SlabBlock(Block.Properties.from(BlockList.birch_log_stairs)).setRegistryName(location("birch_log_slab")),
                        BlockList.birch_log_wall = (WallBlock) new WallBlock(Block.Properties.from(BlockList.birch_log_stairs)).setRegistryName(location("birch_log_wall")),
                        BlockList.birch_wood_stairs = (StairsBlock) new CustomStairsBlock(BlockList.birch_log_stairs.getDefaultState(),
                                Block.Properties.from(BlockList.birch_log_stairs)).setRegistryName(location("birch_wood_stairs")),
                        BlockList.birch_wood_slab = (SlabBlock) new SlabBlock(Block.Properties.from(BlockList.birch_log_stairs)).setRegistryName(location("birch_wood_slab")),
                        BlockList.birch_wood_wall = (WallBlock) new WallBlock(Block.Properties.from(BlockList.birch_log_stairs)).setRegistryName(location("birch_wood_wall")),
                        BlockList.birch_planks_wall = (WallBlock) new WallBlock(Block.Properties.from(BlockList.birch_log_stairs)).setRegistryName(location("birch_planks_wall")),
                        BlockList.stripped_birch_wood_stairs = (StairsBlock) new CustomStairsBlock(BlockList.birch_log_stairs.getDefaultState(),
                                Block.Properties.from(BlockList.birch_log_stairs)).setRegistryName(location("stripped_birch_wood_stairs")),
                        BlockList.stripped_birch_wood_slab = (SlabBlock) new SlabBlock(Block.Properties.from(BlockList.birch_log_stairs)).setRegistryName(location("stripped_birch_wood_slab")),
                        BlockList.stripped_birch_wood_wall = (WallBlock) new WallBlock(Block.Properties.from(BlockList.birch_log_stairs)).setRegistryName(location("stripped_birch_wood_wall")),
                        BlockList.birch_wood_fence = (FenceBlock) new FenceBlock(Block.Properties.from(BlockList.birch_log_stairs)).setRegistryName(location("birch_wood_fence")),
                        BlockList.birch_wood_snow = (SnowBlock) new CustomSnowBlock(Block.Properties.from(BlockList.birch_log_stairs)).setRegistryName(location("birch_wood_snow")),
                        BlockList.birch_planks_snow = (SnowBlock) new CustomSnowBlock(Block.Properties.from(BlockList.birch_log_stairs)).setRegistryName(location("birch_planks_snow")),
                        BlockList.birch_wood_vert_slab = (VertSlabBlock) new VertSlabBlock(Block.Properties.from(BlockList.birch_log_stairs)).setRegistryName(location("birch_wood_vert_slab")),
                        BlockList.birch_log_vert_slab = (VertSlabBlock) new VertSlabBlock(Block.Properties.from(BlockList.birch_log_stairs)).setRegistryName(location("birch_log_vert_slab")),
                        BlockList.birch_planks_vert_slab = (VertSlabBlock) new VertSlabBlock(Block.Properties.from(BlockList.birch_log_stairs))
                                .setRegistryName(location("birch_planks_vert_slab")),
                        BlockList.stripped_birch_vert_slab = (VertSlabBlock) new VertSlabBlock(Block.Properties.from(BlockList.birch_log_stairs))
                                .setRegistryName(location("stripped_birch_vert_slab")),
                        BlockList.locked_birch_door = (LockedDoor) new LockedDoor(Block.Properties.create(Material.IRON)).setRegistryName(location("locked_birch_door")),
                        //endregion

                        //region Acacia
                        BlockList.acacia_log_stairs = (StairsBlock) new CustomStairsBlock(BlockList.dark_oak_log_stairs.getDefaultState(),
                                Block.Properties.from(BlockList.dark_oak_log_stairs)).setRegistryName(location("acacia_log_stairs")),
                        BlockList.acacia_log_slab = (SlabBlock) new SlabBlock(Block.Properties.from(BlockList.acacia_log_stairs)).setRegistryName(location("acacia_log_slab")),
                        BlockList.acacia_log_wall = (WallBlock) new WallBlock(Block.Properties.from(BlockList.acacia_log_stairs)).setRegistryName(location("acacia_log_wall")),
                        BlockList.acacia_wood_stairs = (StairsBlock) new CustomStairsBlock(BlockList.acacia_log_stairs.getDefaultState(),
                                Block.Properties.from(BlockList.acacia_log_stairs)).setRegistryName(location("acacia_wood_stairs")),
                        BlockList.acacia_wood_slab = (SlabBlock) new SlabBlock(Block.Properties.from(BlockList.acacia_log_stairs)).setRegistryName(location("acacia_wood_slab")),
                        BlockList.acacia_wood_wall = (WallBlock) new WallBlock(Block.Properties.from(BlockList.acacia_log_stairs)).setRegistryName(location("acacia_wood_wall")),
                        BlockList.acacia_planks_wall = (WallBlock) new WallBlock(Block.Properties.from(BlockList.acacia_log_stairs)).setRegistryName(location("acacia_planks_wall")),
                        BlockList.stripped_acacia_wood_stairs = (StairsBlock) new CustomStairsBlock(BlockList.acacia_log_stairs.getDefaultState(),
                                Block.Properties.from(BlockList.acacia_log_stairs)).setRegistryName(location("stripped_acacia_wood_stairs")),
                        BlockList.stripped_acacia_wood_slab = (SlabBlock) new SlabBlock(Block.Properties.from(BlockList.acacia_log_stairs)).setRegistryName(location("stripped_acacia_wood_slab")),
                        BlockList.stripped_acacia_wood_wall = (WallBlock) new WallBlock(Block.Properties.from(BlockList.acacia_log_stairs)).setRegistryName(location("stripped_acacia_wood_wall")),
                        BlockList.acacia_wood_fence = (FenceBlock) new FenceBlock(Block.Properties.from(BlockList.acacia_log_stairs)).setRegistryName(location("acacia_wood_fence")),
                        BlockList.acacia_wood_snow = (SnowBlock) new CustomSnowBlock(Block.Properties.from(BlockList.acacia_log_stairs)).setRegistryName(location("acacia_wood_snow")),
                        BlockList.acacia_planks_snow = (SnowBlock) new CustomSnowBlock(Block.Properties.from(BlockList.acacia_log_stairs)).setRegistryName(location("acacia_planks_snow")),
                        BlockList.acacia_log_vert_slab = (VertSlabBlock) new VertSlabBlock(Block.Properties.from(BlockList.acacia_log_stairs)).setRegistryName(location("acacia_log_vert_slab")),
                        BlockList.acacia_planks_vert_slab = (VertSlabBlock) new VertSlabBlock(Block.Properties.from(BlockList.acacia_log_stairs)).setRegistryName(location("acacia_planks_vert_slab")),
                        BlockList.acacia_wood_vert_slab = (VertSlabBlock) new VertSlabBlock(Block.Properties.from(BlockList.acacia_log_stairs)).setRegistryName(location("acacia_wood_vert_slab")),
                        BlockList.stripped_acacia_vert_slab = (VertSlabBlock) new VertSlabBlock(Block.Properties.from(BlockList.acacia_log_stairs))
                                .setRegistryName(location("stripped_acacia_vert_slab")),
                        BlockList.locked_acacia_door = (LockedDoor) new LockedDoor(Block.Properties.create(Material.IRON)).setRegistryName(location("locked_acacia_door")),
                        //endregion

                        //region Jungle
                        BlockList.jungle_log_stairs = (StairsBlock) new CustomStairsBlock(BlockList.acacia_log_stairs.getDefaultState(),
                                Block.Properties.from(BlockList.acacia_log_stairs)).setRegistryName(location("jungle_log_stairs")),
                        BlockList.jungle_log_slab = (SlabBlock) new SlabBlock(Block.Properties.from(BlockList.jungle_log_stairs)).setRegistryName(location("jungle_log_slab")),
                        BlockList.jungle_log_wall = (WallBlock) new WallBlock(Block.Properties.from(BlockList.jungle_log_stairs)).setRegistryName(location("jungle_log_wall")),
                        BlockList.jungle_wood_stairs = (StairsBlock) new CustomStairsBlock(BlockList.jungle_log_stairs.getDefaultState(),
                                Block.Properties.from(BlockList.jungle_log_stairs)).setRegistryName(location("jungle_wood_stairs")),
                        BlockList.jungle_wood_slab = (SlabBlock) new SlabBlock(Block.Properties.from(BlockList.jungle_log_stairs)).setRegistryName(location("jungle_wood_slab")),
                        BlockList.jungle_wood_wall = (WallBlock) new WallBlock(Block.Properties.from(BlockList.jungle_log_stairs)).setRegistryName(location("jungle_wood_wall")),
                        BlockList.jungle_planks_wall = (WallBlock) new WallBlock(Block.Properties.from(BlockList.jungle_log_stairs)).setRegistryName(location("jungle_planks_wall")),
                        BlockList.stripped_jungle_wood_stairs = (StairsBlock) new CustomStairsBlock(BlockList.jungle_log_stairs.getDefaultState(),
                                Block.Properties.from(BlockList.jungle_log_stairs)).setRegistryName(location("stripped_jungle_wood_stairs")),
                        BlockList.stripped_jungle_wood_slab = (SlabBlock) new SlabBlock(Block.Properties.from(BlockList.jungle_log_stairs)).setRegistryName(location("stripped_jungle_wood_slab")),
                        BlockList.stripped_jungle_wood_wall = (WallBlock) new WallBlock(Block.Properties.from(BlockList.jungle_log_stairs)).setRegistryName(location("stripped_jungle_wood_wall")),
                        BlockList.jungle_wood_fence = (FenceBlock) new FenceBlock(Block.Properties.from(BlockList.jungle_log_stairs)).setRegistryName(location("jungle_wood_fence")),
                        BlockList.jungle_wood_snow = (SnowBlock) new CustomSnowBlock(Block.Properties.from(BlockList.jungle_log_stairs)).setRegistryName(location("jungle_wood_snow")),
                        BlockList.jungle_planks_snow = (SnowBlock) new CustomSnowBlock(Block.Properties.from(BlockList.jungle_log_stairs)).setRegistryName(location("jungle_planks_snow")),
                        BlockList.jungle_wood_vert_slab = (VertSlabBlock) new VertSlabBlock(Block.Properties.from(BlockList.jungle_log_stairs)).setRegistryName(location("jungle_wood_vert_slab")),
                        BlockList.jungle_log_vert_slab = (VertSlabBlock) new VertSlabBlock(Block.Properties.from(BlockList.jungle_log_stairs)).setRegistryName(location("jungle_log_vert_slab")),
                        BlockList.jungle_planks_vert_slab = (VertSlabBlock) new VertSlabBlock(Block.Properties.from(BlockList.jungle_log_stairs))
                                .setRegistryName(location("jungle_planks_vert_slab")),
                        BlockList.stripped_jungle_vertslab = (VertSlabBlock) new VertSlabBlock(Block.Properties.from(BlockList.jungle_log_stairs))
                                .setRegistryName(location("stripped_jungle_vert_slab")),
                        BlockList.locked_jungle_door = (LockedDoor) new LockedDoor(Block.Properties.create(Material.IRON)).setRegistryName(location("locked_jungle_door")),
                        //endregion

                        //region Stone
                        BlockList.stone_fence = (FenceBlock) new FenceBlock(Block.Properties.create(Material.EARTH)
                                .hardnessAndResistance(2f, 15f).sound(SoundType.STONE)).setRegistryName(location("stone_fence")),
                        BlockList.cobblestone_fence = (FenceBlock) new FenceBlock(Block.Properties.from(BlockList.stone_fence)).setRegistryName(location("cobblestone_fence")),
                        BlockList.stone_brick_fence = (FenceBlock) new FenceBlock(Block.Properties.from(BlockList.stone_fence)).setRegistryName(location("stone_brick_fence")),
                        BlockList.mossy_stone_brick_fence = (FenceBlock) new FenceBlock(Block.Properties.from(BlockList.stone_fence)).setRegistryName(location("mossy_stone_brick_fence")),
                        BlockList.stone_snow = (SnowBlock) new CustomSnowBlock(Block.Properties.from(BlockList.stone_fence)).setRegistryName(location("stone_snow")),
                        BlockList.cobblestone_snow = (SnowBlock) new CustomSnowBlock(Block.Properties.from(BlockList.cobblestone_fence)).setRegistryName(location("cobblestone_snow")),
                        BlockList.stone_brick_snow = (SnowBlock) new CustomSnowBlock(Block.Properties.from(BlockList.stone_brick_fence)).setRegistryName(location("stone_brick_snow")),
                        BlockList.mossy_stone_brick_snow = (SnowBlock) new CustomSnowBlock(Block.Properties.from(BlockList.mossy_stone_brick_fence))
                                .setRegistryName(location("mossy_stone_brick_snow")),
                        BlockList.stone_vert_slab = (VertSlabBlock) new VertSlabBlock(Block.Properties.from(BlockList.cobblestone_fence)).setRegistryName(location("stone_vert_slab")),
                        BlockList.granite_vert_slab = (VertSlabBlock) new VertSlabBlock(Block.Properties.from(BlockList.cobblestone_fence)).setRegistryName(location("granite_vert_slab")),
                        BlockList.polished_granite_vert_slab = (VertSlabBlock) new VertSlabBlock(Block.Properties.from(BlockList.granite_vert_slab))
                                .setRegistryName(location("polished_granite_vert_slab")),
                        BlockList.andesite_vert_slab = (VertSlabBlock) new VertSlabBlock(Block.Properties.from(BlockList.granite_vert_slab)).setRegistryName(location("andesite_vert_slab")),
                        BlockList.polished_andesite_vert_slab = (VertSlabBlock) new VertSlabBlock(Block.Properties.from(BlockList.andesite_vert_slab))
                                .setRegistryName(location("polished_andesite_vert_slab")),
                        BlockList.cobblestone_vert_slab = (VertSlabBlock) new VertSlabBlock(Block.Properties.from(BlockList.cobblestone_fence)).setRegistryName(location("cobblestone_vert_slab")),
                        BlockList.quartz_vert_slab = (VertSlabBlock) new VertSlabBlock(Block.Properties.from(BlockList.stone_vert_slab)).setRegistryName(location("quartz_vert_slab")),
                        BlockList.smooth_quartz_vert_slab = (VertSlabBlock) new VertSlabBlock(Block.Properties.from(BlockList.quartz_vert_slab))
                                .setRegistryName(location("smooth_quartz_vert_slab")),
                        BlockList.chiseled_quartz_vert_slab = (VertSlabBlock) new VertSlabBlock(Block.Properties.from(BlockList.smooth_quartz_vert_slab))
                                .setRegistryName(location("chiseled_quartz_vert_slab")),
                        BlockList.mossy_cobblestone_vert_slab = (VertSlabBlock) new VertSlabBlock(Block.Properties.from(BlockList.cobblestone_fence))
                                .setRegistryName(location("mossy_cobblestone_vert_slab")),
                        BlockList.mossy_stone_bricks_vert_slab = (VertSlabBlock) new VertSlabBlock(Block.Properties.from(BlockList.mossy_stone_brick_fence))
                                .setRegistryName(location("mossy_stone_bricks_vert_slab")),
                        BlockList.stone_bricks_vert_slab = (VertSlabBlock) new VertSlabBlock(Block.Properties.from(BlockList.stone_brick_fence))
                                .setRegistryName(location("stone_bricks_vert_slab")),
                        BlockList.chiseled_stone_bricks_vert_slab = (VertSlabBlock) new VertSlabBlock(Block.Properties.from(BlockList.stone_bricks_vert_slab))
                                .setRegistryName(location("chiseled_stone_bricks_vert_slab")),
                        BlockList.cracked_stone_brick_stairs = (StairsBlock) new CustomStairsBlock(BlockList.cobblestone_snow.getDefaultState(),
                                Block.Properties.from(BlockList.stone_brick_snow)).setRegistryName(location("cracked_stone_brick_stairs")),
                        BlockList.cracked_stone_brick_slab = (SlabBlock) new SlabBlock(Block.Properties.from(BlockList.cracked_stone_brick_stairs))
                                .setRegistryName(location("cracked_stone_brick_slab")),
                        BlockList.cracked_stone_brick_vert_slab = (VertSlabBlock) new VertSlabBlock(Block.Properties.from(BlockList.cracked_stone_brick_slab))
                                .setRegistryName(location("cracked_stone_brick_vert_slab")),
                        BlockList.cracked_stone_brick_snow = (SnowBlock) new CustomSnowBlock(Block.Properties.from(BlockList.cracked_stone_brick_slab))
                                .setRegistryName(location("cracked_stone_brick_snow")),
                        BlockList.cracked_stone_brick_wall = (WallBlock) new WallBlock(Block.Properties.from(BlockList.cracked_stone_brick_slab))
                                .setRegistryName(location("cracked_stone_brick_wall")),
                        BlockList.cracked_stone_brick_fence = (FenceBlock) new FenceBlock(Block.Properties.from(BlockList.cracked_stone_brick_slab))
                                .setRegistryName(location("cracked_stone_brick_fence")),
                        BlockList.smooth_stone_vert_slab = (VertSlabBlock) new VertSlabBlock(Block.Properties.from(BlockList.cracked_stone_brick_fence))
                                .setRegistryName(location("smooth_stone_vert_slab")),
                        BlockList.stone_wall  = (WallBlock) new WallBlock(Block.Properties.from(BlockList.stone_vert_slab)).setRegistryName(location("stone_wall")),
                        //endregion

                        //region Gravel
                        BlockList.gravel_slab = (SlabBlock) new SlabBlock(Block.Properties.create(Material.EARTH)
                                .hardnessAndResistance(0.6f, 3).sound(SoundType.GROUND)).setRegistryName(location("gravel_slab")),
                        BlockList.gravel_stairs = (StairsBlock) new CustomStairsBlock(BlockList.gravel_slab.getDefaultState(), Block.Properties.from(BlockList.gravel_slab))
                                .setRegistryName(location("gravel_stairs")),
                        BlockList.gravel_wall = (WallBlock) new WallBlock(Block.Properties.from(BlockList.gravel_slab)).setRegistryName(location("gravel_wall")),
                        BlockList.gravel_snow = (SnowBlock) new CustomSnowBlock(Block.Properties.from(BlockList.gravel_slab)).setRegistryName(location("gravel_snow")),
                        BlockList.gravel_vert_slab = (VertSlabBlock) new VertSlabBlock(Block.Properties.from(BlockList.gravel_slab)).setRegistryName(location("gravel_vert_slab")),
                        //endregion

                        //region Bookshelves
                        BlockList.bookshelf_vert_slab = (VertSlabBlock) new VertSlabBlock(Block.Properties.from(BlockList.oak_wood_slab)).setRegistryName(location("bookshelf_vert_slab")),
                        BlockList.bookshelf_stairs = (StairsBlock) new CustomStairsBlock(BlockList.bookshelf_vert_slab.getDefaultState(),
                                Block.Properties.from(BlockList.bookshelf_vert_slab)).setRegistryName(location("bookshelf_stairs")),
                        BlockList.bookshelf_slab = (SlabBlock) new SlabBlock(Block.Properties.from(BlockList.bookshelf_vert_slab)).setRegistryName(location("bookshelf_slab")),
                        //endregion

                        //region Haybales
                        BlockList.haybale_stairs = (StairsBlock) new CustomStairsBlock(BlockList.coarse_dirt_slab.getDefaultState(), Block.Properties.create(Material.EARTH)
                                .hardnessAndResistance(0.5f, 2.5f).sound(SoundType.PLANT)).setRegistryName(location("haybale_stairs")),
                        BlockList.haybale_slab = (SlabBlock) new SlabBlock(Block.Properties.from(BlockList.haybale_stairs)).setRegistryName(location("haybale_slab")),
                        BlockList.haybale_vert_slab = (VertSlabBlock) new VertSlabBlock(Block.Properties.from(BlockList.haybale_slab)).setRegistryName(location("haybale_vert_slab")),
                        BlockList.haybale_snow = (SnowBlock) new CustomSnowBlock(Block.Properties.from(BlockList.haybale_slab)).setRegistryName(location("haybale_snow")),
                        //endregion

                        //region Wool
                        BlockList.white_wool_snow = (SnowBlock) new CustomSnowBlock(Block.Properties.create(Material.WOOL)
                                .hardnessAndResistance(0.6f, 3.0f).sound(SoundType.CLOTH)).setRegistryName(location("white_wool_snow")),
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
                        //endregion

                        //region Cauldrons
                        BlockList.spruce_cauldron = (CauldronBlock) new CauldronBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(2f, 10f).sound(SoundType.WOOD))
                                .setRegistryName(location("spruce_cauldron")),
                        //endregion

                        //region Tables
                        BlockList.oak_planks_table = (Table) new Table(Block.Properties.from(BlockList.dark_oak_planks_snow)).setRegistryName(location("oak_planks_table")),
                        BlockList.spruce_planks_table = (Table) new Table(Block.Properties.from(BlockList.dark_oak_planks_snow)).setRegistryName(location("spruce_planks_table")),
                        BlockList.dark_oak_planks_table = (Table) new Table(Block.Properties.from(BlockList.dark_oak_planks_snow)).setRegistryName(location("dark_oak_planks_table")),
                        BlockList.jungle_planks_table = (Table) new Table(Block.Properties.from(BlockList.dark_oak_planks_snow)).setRegistryName(location("birch_planks_table")),
                        BlockList.birch_planks_table = (Table) new Table(Block.Properties.from(BlockList.dark_oak_planks_snow)).setRegistryName(location("jungle_planks_table")),
                        BlockList.acacia_planks_table = (Table) new Table(Block.Properties.from(BlockList.dark_oak_planks_snow)).setRegistryName(location("acacia_planks_table")),
                        BlockList.oak_wood_table = (Table) new Table(Block.Properties.from(BlockList.oak_wood_slab)).setRegistryName(location("oak_wood_table")),
                        BlockList.spruce_wood_table = (Table) new Table(Block.Properties.from(BlockList.spruce_wood_slab)).setRegistryName(location("spruce_wood_table")),
                        BlockList.dark_oak_wood_table = (Table) new Table(Block.Properties.from(BlockList.dark_oak_wood_slab)).setRegistryName(location("dark_oak_wood_table")),
                        BlockList.birch_wood_table = (Table) new Table(Block.Properties.from(BlockList.birch_wood_vert_slab)).setRegistryName(location("birch_wood_table")),
                        BlockList.jungle_wood_table = (Table) new Table(Block.Properties.from(BlockList.jungle_wood_slab)).setRegistryName(location("jungle_wood_table")),
                        BlockList.acacia_wood_table = (Table) new Table(Block.Properties.from(BlockList.acacia_wood_slab)).setRegistryName(location("acacia_wood_table")),
                        BlockList.cobblestone_table = (Table) new Table(Block.Properties.from(BlockList.cobblestone_vert_slab)).setRegistryName(location("cobblestone_table")),
                        BlockList.stone_table = (Table) new Table(Block.Properties.from(BlockList.stone_vert_slab)).setRegistryName(location("stone_table")),
                        BlockList.earth_obelisk_table = (Table) new Table(Block.Properties.from(BlockList.earth_obelisk_block)).setRegistryName(location("earth_obelisk_table")),
                        BlockList.cobblestone_oak_planks_table = (Table) new Table(Block.Properties.from(BlockList.oak_planks_table)).setRegistryName(location("cobblestone_oak_planks_table")),
                        BlockList.cobblestone_spruce_planks_table = (Table) new Table(Block.Properties.from(BlockList.spruce_planks_table))
                                .setRegistryName(location("cobblestone_spruce_planks_table")),
                        BlockList.cobblestone_brich_planks_table = (Table) new Table(Block.Properties.from(BlockList.birch_planks_table))
                                .setRegistryName(location("cobblestone_birch_planks_table")),
                        BlockList.cobblestone_jungle_planks_table = (Table) new Table(Block.Properties.from(BlockList.jungle_planks_table))
                                .setRegistryName(location("cobblestone_jungle_planks_table")),
                        BlockList.cobblestone_acacia_planks_table = (Table) new Table(Block.Properties.from(BlockList.acacia_planks_table))
                                .setRegistryName(location("cobblestone_acacia_planks_table")),
                        BlockList.cobblestone_dark_oak_planks_table = (Table) new Table(Block.Properties.from(BlockList.dark_oak_planks_table))
                                .setRegistryName(location("cobblestone_dark_oak_planks_table")),
                        //endregion

                        //region Stools
                        BlockList.oak_planks_stool = (Stool) new Stool(Block.Properties.from(BlockList.oak_planks_table)).setRegistryName(location("oak_planks_stool")),
                        BlockList.spruce_planks_stool = (Stool) new Stool(Block.Properties.from(BlockList.spruce_planks_table)).setRegistryName(location("spruce_planks_stool")),
                        BlockList.birch_planks_stool = (Stool) new Stool(Block.Properties.from(BlockList.birch_planks_table)).setRegistryName(location("birch_planks_stool")),
                        BlockList.jungle_planks_stool = (Stool) new Stool(Block.Properties.from(BlockList.jungle_planks_table)).setRegistryName(location("jungle_planks_stool")),
                        BlockList.acacia_planks_stool = (Stool) new Stool(Block.Properties.from(BlockList.acacia_planks_table)).setRegistryName(location("acacia_planks_stool")),
                        BlockList.dark_oak_planks_stool = (Stool) new Stool(Block.Properties.from(BlockList.dark_oak_planks_table)).setRegistryName(location("dark_oak_planks_stool")),
                        BlockList.oak_wood_stool = (Stool) new Stool(Block.Properties.from(BlockList.oak_planks_stool)).setRegistryName(location("oak_wood_stool")),
                        BlockList.spruce_wood_stool = (Stool) new Stool(Block.Properties.from(BlockList.spruce_planks_stool)).setRegistryName(location("spruce_wood_stool")),
                        BlockList.birch_wood_stool = (Stool) new Stool(Block.Properties.from(BlockList.birch_planks_stool)).setRegistryName(location("birch_wood_stool")),
                        BlockList.jungle_wood_stool = (Stool) new Stool(Block.Properties.from(BlockList.jungle_planks_stool)).setRegistryName(location("jungle_wood_stool")),
                        BlockList.acacia_wood_stool = (Stool) new Stool(Block.Properties.from(BlockList.acacia_planks_stool)).setRegistryName(location("acacia_wood_stool")),
                        BlockList.dark_oak_wood_stool = (Stool) new Stool(Block.Properties.from(BlockList.dark_oak_planks_stool)).setRegistryName(location("dark_oak_wood_stool")),
                        BlockList.oak_log_stool = (Stool) new Stool(Block.Properties.from(BlockList.oak_log_slab)).setRegistryName(location("oak_log_stool")),
                        BlockList.spruce_log_stool = (Stool) new Stool(Block.Properties.from(BlockList.spruce_log_slab)).setRegistryName(location("spruce_log_stool")),
                        BlockList.birch_log_stool = (Stool) new Stool(Block.Properties.from(BlockList.birch_log_slab)).setRegistryName(location("birch_log_stool")),
                        BlockList.jungle_log_stool = (Stool) new Stool(Block.Properties.from(BlockList.jungle_log_slab)).setRegistryName(location("jungle_log_stool")),
                        BlockList.acacia_log_stool = (Stool) new Stool(Block.Properties.from(BlockList.acacia_log_slab)).setRegistryName(location("acacia_log_stool")),
                        BlockList.dark_oak_log_stool = (Stool) new Stool(Block.Properties.from(BlockList.dark_oak_log_slab)).setRegistryName(location("dark_oak_log_stool")),
                        BlockList.cobblestone_stool = (Stool) new Stool(Block.Properties.from(BlockList.cobblestone_table)).setRegistryName(location("cobblestone_stool")),
                        BlockList.stone_stool = (Stool) new Stool(Block.Properties.from(BlockList.stone_brick_fence)).setRegistryName(location("stone_stool")),
                        BlockList.stone_bricks_stool = (Stool) new Stool(Block.Properties.from(BlockList.stone_bricks_vert_slab)).setRegistryName(location("stone_bricks_stool")),
                        BlockList.cracked_stone_bricks_stool = (Stool) new Stool(Block.Properties.from(BlockList.cracked_stone_brick_fence))
                                .setRegistryName(location("cracked_stone_bricks_stool")),
                        //endregion

                        //region Benches
                        BlockList.bench = (Bench) new Bench(Block.Properties.from(BlockList.oak_planks_table)).setRegistryName(location("bench")),
                        BlockList.spruce_wood_bench = (Bench) new Bench(Block.Properties.from(BlockList.spruce_wood_stool)).setRegistryName(location("spruce_wood_bench")),
                        BlockList.birch_wood_bench = (Bench) new Bench(Block.Properties.from(BlockList.birch_wood_stool)).setRegistryName(location("birch_wood_bench")),
                        BlockList.jungle_wood_bench = (Bench) new Bench(Block.Properties.from(BlockList.jungle_wood_stool)).setRegistryName(location("jungle_wood_bench")),
                        BlockList.acacia_wood_bench = (Bench) new Bench(Block.Properties.from(BlockList.acacia_log_stool)).setRegistryName(location("acacia_wood_bench")),
                        BlockList.dark_oak_wood_bench = (Bench) new Bench(Block.Properties.from(BlockList.dark_oak_wood_stool)).setRegistryName(location("dark_oak_wood_bench")),
                        //endregion

                        //region Long Tables
                        BlockList.oak_wood_longtable = (LongTable) new LongTable(Block.Properties.from(BlockList.dark_oak_wood_bench)).setRegistryName(location("oak_wood_longtable")),
                        BlockList.spruce_wood_longtable = (LongTable) new LongTable(Block.Properties.from(BlockList.cobblestone_spruce_planks_table))
                                .setRegistryName(location("spruce_wood_longtable")),
                        BlockList.birch_wood_longtable = (LongTable) new LongTable(Block.Properties.from(BlockList.birch_wood_bench)).setRegistryName(location("birch_wood_longtable")),
                        BlockList.jungle_wood_longtable = (LongTable) new LongTable(Block.Properties.from(BlockList.jungle_log_slab)).setRegistryName(location("jungle_wood_longtable")),
                        BlockList.acacia_wood_longtable = (LongTable) new LongTable(Block.Properties.from(BlockList.acacia_wood_bench)).setRegistryName(location("acacia_wood_longtable")),
                        BlockList.dark_oak_wood_longtable = (LongTable) new LongTable(Block.Properties.from(BlockList.dark_oak_wood_bench)).setRegistryName(location("dark_oak_wood_longtable")),
                        //endregion

                        //region Wagons
                        BlockList.oak_wagon = (Wagon) new Wagon(Block.Properties.from(BlockList.oak_wood_fence)).setRegistryName(location("oak_wagon")),
                        //endregion

                        //region Chairs
                        BlockList.spruce_chair = (Chair) new Chair(Block.Properties.from(BlockList.spruce_cauldron)).setRegistryName(location("spruce_chair")),
                        //endregion

                        //region Iron
                        BlockList.iron_wall = (WallBlock) new WallBlock(Block.Properties.create(Material.IRON).hardnessAndResistance(0.5f, 0.5f).sound(SoundType.METAL)).setRegistryName(location("iron_wall")),
                        BlockList.iron_snow = (CustomSnowBlock) new CustomSnowBlock(Block.Properties.from(BlockList.iron_wall)).setRegistryName(location("iron_snow")),
                        BlockList.iron_slab = (SlabBlock) new SlabBlock(Block.Properties.from(BlockList.iron_wall)).setRegistryName(location("iron_slab")),
                        BlockList.iron_stairs = (CustomStairsBlock) new CustomStairsBlock(BlockList.iron_slab.getDefaultState(), Block.Properties.from(BlockList.iron_wall)).setRegistryName(location("iron_stairs")),
                        BlockList.iron_vert_slab = (VertSlabBlock) new VertSlabBlock(Block.Properties.from(BlockList.iron_wall)).setRegistryName(location("iron_vert_slab")),
                        //endregion

                        //region Lecterns
                        BlockList.oak_lectern = (CustomLecternBlock) new CustomLecternBlock(Block.Properties.from(BlockList.oak_log_slab)).setRegistryName(location("oak_lectern")),
                        BlockList.spruce_lectern = (CustomLecternBlock) new CustomLecternBlock(Block.Properties.from(BlockList.spruce_log_slab)).setRegistryName(location("spruce_lectern")),
                        BlockList.birch_lectern = (CustomLecternBlock) new CustomLecternBlock(Block.Properties.from(BlockList.birch_log_slab)).setRegistryName(location("birch_lectern")),
                        BlockList.dark_oak_lectern = (CustomLecternBlock) new CustomLecternBlock(Block.Properties.from(BlockList.dark_oak_log_slab)).setRegistryName(location("dark_oak_lectern")),
                        BlockList.acacia_lectern = (CustomLecternBlock) new CustomLecternBlock(Block.Properties.from(BlockList.acacia_log_slab)).setRegistryName(location("acacia_lectern")),
                        BlockList.jungle_lectern = (CustomLecternBlock) new CustomLecternBlock(Block.Properties.from(BlockList.jungle_log_slab)).setRegistryName(location("jungle_lectern"))
                        //endregion
                );


        logger.info("Blocks Registered");
    }

    @SubscribeEvent
    public static void registerEntities(final RegistryEvent.Register<EntityType<?>> event) {
        event.getRegistry().registerAll
                (
                        EntityList.TEST_ENTITY,
                        EntityList.CHAIR
                );

        EntityList.registerEntityWorldSpawn();
    }

    @SubscribeEvent
    public static void registerContainers(final RegistryEvent.Register<ContainerType<?>> event) {
        event.getRegistry().registerAll
                (
                        IForgeContainerType.create((windowId, inv, data) ->
                        {
                            return new UltrahotbarContainer(windowId, inv);
                        }).setRegistryName(location("ultrahotbar"))
                );
    }

    public static ResourceLocation location(String name) {
        return new ResourceLocation(modid, name);
    }
}
