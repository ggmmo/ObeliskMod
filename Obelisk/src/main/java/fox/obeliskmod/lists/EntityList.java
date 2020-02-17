package fox.obeliskmod.lists;

import fox.obeliskmod.ObeliskMod;
import fox.obeliskmod.ObeliskModRegistries;
import fox.obeliskmod.entities.TestEntity;
import fox.obeliskmod.entities.blocks.ChairEntity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.item.Item;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biome.SpawnListEntry;
import net.minecraft.world.biome.Biomes;
import net.minecraftforge.event.RegistryEvent;

public class EntityList 
{
	public static EntityType<?> TEST_ENTITY = EntityType.Builder.create(TestEntity::new, EntityClassification.CREATURE).build(ObeliskModRegistries.modid + ":test_entity").setRegistryName(ObeliskModRegistries.location("test_entity"));
	
	public static void registerEntitySpawnEggs(final RegistryEvent.Register<Item> event) 
	{
		event.getRegistry().registerAll
		(
				ItemList.test_entity_egg = registerEntitySpawnEgg(TEST_ENTITY, 0x118a31, 0x0ddb44, "test_entity_egg")
		);
	}
	
	public static void registerEntityWorldSpawn() 
	{
		registerEntityWorldSpawn(TEST_ENTITY, Biomes.PLAINS);
	}
	
	public static Item registerEntitySpawnEgg(EntityType<?> type, int color1, int color2, String name) 
	{
		SpawnEggItem item = new SpawnEggItem(type, color1, color2, new Item.Properties().group(ObeliskModRegistries.misc));
		item.setRegistryName(ObeliskModRegistries.location(name));
		return item;
	}
	
	public static void registerEntityWorldSpawn(EntityType<?> entity, Biome... biomes) 
	{
		for(Biome biome : biomes) 
		{
			if(biome != null) 
			{
				biome.getSpawns(entity.getClassification()).add(new SpawnListEntry(entity, 10, 1, 10));
			}
		}
	}
	
	public static EntityType<?> CHAIR = EntityType.Builder.<ChairEntity>create((type, world) -> new ChairEntity(world), EntityClassification.MISC)
            .size(.0f, .0f)
            .setCustomClientFactory((spawnEntity, world) -> new ChairEntity(world))
            .build(ObeliskMod.modid)
            .setRegistryName(ObeliskMod.modid, "chair_entity");
	
}
