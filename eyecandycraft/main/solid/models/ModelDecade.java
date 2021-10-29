package eyecandycraft.main.solid.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelDecade extends ModelBase {
	//fields
    ModelRenderer Corpo_principale;
    ModelRenderer Corpo_sec;
  
  public ModelDecade()
  {
    textureWidth = 64;
    textureHeight = 64;
    
      Corpo_principale = new ModelRenderer(this, 0, 0);
      Corpo_principale.addBox(0F, 0F, 0F, 10, 15, 7);
      Corpo_principale.setRotationPoint(-5F, 9F, 1F);
      Corpo_principale.setTextureSize(64, 64);
      Corpo_principale.mirror = true;
      setRotation(Corpo_principale, 0F, 0F, 0F);
      Corpo_sec = new ModelRenderer(this, 0, 31);
      Corpo_sec.addBox(0F, 0F, 0F, 10, 1, 7);
      Corpo_sec.setRotationPoint(-5F, 8F, 1F);
      Corpo_sec.setTextureSize(64, 64);
      Corpo_sec.mirror = true;
      setRotation(Corpo_sec, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Corpo_principale.render(f5);
    Corpo_principale.render(f5);
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