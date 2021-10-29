package eyecandycraft.main.solid.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelClima extends ModelBase {
	//fields
    ModelRenderer CORPO1;
    ModelRenderer ARIA;
    ModelRenderer CORPO2;
    ModelRenderer Deflettore;
  
  public ModelClima()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      CORPO1 = new ModelRenderer(this, 0, 9);
      CORPO1.addBox(0F, 0F, -0.5F, 14, 4, 8);
      CORPO1.setRotationPoint(-7F, 16F, 0F);
      CORPO1.setTextureSize(64, 32);
      CORPO1.mirror = true;
      setRotation(CORPO1, 0F, 0F, 0F);
      ARIA = new ModelRenderer(this, 0, 25);
      ARIA.addBox(0F, -0.3F, -0.5F, 14, 2, 3);
      ARIA.setRotationPoint(-7F, 19F, 1F);
      ARIA.setTextureSize(64, 32);
      ARIA.mirror = true;
      setRotation(ARIA, -0.6632251F, 0F, 0F);
      CORPO2 = new ModelRenderer(this, 0, 0);
      CORPO2.addBox(0F, 0F, -0.5F, 14, 2, 6);
      CORPO2.setRotationPoint(-7F, 20F, 2F);
      CORPO2.setTextureSize(64, 32);
      CORPO2.mirror = true;
      setRotation(CORPO2, 0F, 0F, 0F);
      Deflettore = new ModelRenderer(this, 0, 22);
      Deflettore.addBox(0F, 0F, -1F, 14, 0, 1);
      Deflettore.setRotationPoint(-7F, 21F, 1F);
      Deflettore.setTextureSize(64, 32);
      Deflettore.mirror = true;
      setRotation(Deflettore, 0.3141593F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    CORPO1.render(f5);
    ARIA.render(f5);
    CORPO2.render(f5);
    Deflettore.render(f5);
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
