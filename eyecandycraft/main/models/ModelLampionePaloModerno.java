package eyecandycraft.main.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelLampionePaloModerno extends ModelBase {
	 //fields
    ModelRenderer Lampadina;
    ModelRenderer Portalampada;
    ModelRenderer Rosone;
    ModelRenderer Braccio;
  
  public ModelLampionePaloModerno()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      Lampadina = new ModelRenderer(this, 0, 7);
      Lampadina.addBox(0F, 0F, 0F, 2, 1, 4);
      Lampadina.setRotationPoint(-1F, 19F, -2F);
      Lampadina.setTextureSize(64, 32);
      Lampadina.mirror = true;
      setRotation(Lampadina, 0F, 0F, 0F);
      Portalampada = new ModelRenderer(this, 34, 4);
      Portalampada.addBox(0F, 0F, 0F, 1, 1, 12);
      Portalampada.setRotationPoint(-0.5F, 18F, 3F);
      Portalampada.setTextureSize(64, 32);
      Portalampada.mirror = true;
      setRotation(Portalampada, 0F, 0F, 0F);
      Rosone = new ModelRenderer(this, 24, 0);
      Rosone.addBox(0F, 0F, 0F, 2, 2, 1);
      Rosone.setRotationPoint(-1F, 17.5F, 13F);
      Rosone.setTextureSize(64, 32);
      Rosone.mirror = true;
      setRotation(Rosone, 0F, 0F, 0F);
      Braccio = new ModelRenderer(this, 13, 9);
      Braccio.addBox(0F, 0F, 0F, 3, 1, 6);
      Braccio.setRotationPoint(-1.5F, 18F, -3F);
      Braccio.setTextureSize(64, 32);
      Braccio.mirror = true;
      setRotation(Braccio, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Lampadina.render(f5);
    Portalampada.render(f5);
    Rosone.render(f5);
    Braccio.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
  }

}