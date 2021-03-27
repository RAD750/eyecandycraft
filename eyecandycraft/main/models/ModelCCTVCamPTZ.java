package eyecandycraft.main.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelCCTVCamPTZ extends ModelBase {
	//fields
    ModelRenderer Braccetto1;
    ModelRenderer Braccetto2;
    ModelRenderer Lente;
    ModelRenderer Corpo1;
  
  public ModelCCTVCamPTZ()
  {
    textureWidth = 32;
    textureHeight = 32;
    
      Braccetto1 = new ModelRenderer(this, 0, 8);
      Braccetto1.addBox(0F, 0F, 0F, 8, 1, 1);
      Braccetto1.setRotationPoint(0F, 16F, -0.5F);
      Braccetto1.setTextureSize(64, 32);
      Braccetto1.mirror = true;
      setRotation(Braccetto1, 0F, 0F, 0F);
      Braccetto2 = new ModelRenderer(this, 0, 0);
      Braccetto2.addBox(0F, 0F, 0F, 1, 2, 1);
      Braccetto2.setRotationPoint(0F, 17F, -0.5F);
      Braccetto2.setTextureSize(64, 32);
      Braccetto2.mirror = true;
      setRotation(Braccetto2, 0F, 0F, 0F);
      Lente = new ModelRenderer(this, 20, 0);
      Lente.addBox(0F, 0F, 0F, 2, 2, 2);
      Lente.setRotationPoint(-0.5F, 21F, -1F);
      Lente.setTextureSize(64, 32);
      Lente.mirror = true;
      setRotation(Lente, 0F, 0F, 0F);
      Corpo1 = new ModelRenderer(this, 0, 14);
      Corpo1.addBox(0F, 0F, 0F, 3, 2, 3);
      Corpo1.setRotationPoint(-1F, 19F, -1.5F);
      Corpo1.setTextureSize(64, 32);
      Corpo1.mirror = true;
      setRotation(Corpo1, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Braccetto1.render(f5);
    Braccetto2.render(f5);
    Lente.render(f5);
    Corpo1.render(f5);
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