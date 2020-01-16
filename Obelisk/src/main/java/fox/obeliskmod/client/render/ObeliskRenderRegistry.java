package fox.obeliskmod.client.render;

import fox.obeliskmod.entities.TestEntity;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

@OnlyIn(Dist.CLIENT)
public class ObeliskRenderRegistry 
{
	public static void registryEntityRender() 
	{
		RenderingRegistry.registerEntityRenderingHandler(TestEntity.class, new TestEntityRender.RenderFactory());
	}
	
	
}
