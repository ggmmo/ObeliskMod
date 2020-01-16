package fox.obeliskmod.client.render;

import fox.obeliskmod.ObeliskModRegistries;
import fox.obeliskmod.client.models.ObeliskEntityModel;
import fox.obeliskmod.entities.TestEntity;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.LivingRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.client.registry.IRenderFactory;

@OnlyIn(Dist.CLIENT)
public class TestEntityRender extends LivingRenderer<TestEntity, ObeliskEntityModel>
{
	
	public TestEntityRender(EntityRendererManager manager) 
	{
		super(manager, new ObeliskEntityModel(), 0f);
	}

	@Override
	protected ResourceLocation getEntityTexture(TestEntity entity) 
	{
		
		return ObeliskModRegistries.location("textures/entity/test_entity.png");
	}
	
	public static class RenderFactory implements IRenderFactory<TestEntity>
	{

		@Override
		public EntityRenderer<? super TestEntity> createRenderFor(EntityRendererManager manager) 
		{
			
			return new TestEntityRender(manager);
		}
		
	}

}
