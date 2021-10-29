package eyecandycraft.main.solid.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelClimaUE extends ModelBase {
	//fields
    ModelRenderer piedino1;
    ModelRenderer piedino2;
    ModelRenderer piedino3;
    ModelRenderer piedino4;
    ModelRenderer CORPO_PRINCIPALE;
    ModelRenderer COPRICAVO1;
    ModelRenderer COPRICAVO2;
  
  public ModelClimaUE()
  {
    textureWidth = 128;
    textureHeight = 64;
    
      piedino1 = new ModelRenderer(this, 0, 0);
      piedino1.addBox(0F, 0F, 0F, 1, 1, 3);
      piedino1.setRotationPoint(-2F, 23F, -3F);
      piedino1.setTextureSize(128, 64);
      piedino1.mirror = true;
      setRotation(piedino1, 0F, 1.570796F, 0F);
      piedino2 = new ModelRenderer(this, 0, 0);
      piedino2.addBox(0F, 0F, 0F, 1, 1, 3);
      piedino2.setRotationPoint(-2F, 23F, 7F);
      piedino2.setTextureSize(128, 64);
      piedino2.mirror = true;
      setRotation(piedino2, 0F, 1.570796F, 0F);
      piedino3 = new ModelRenderer(this, 0, 0);
      piedino3.addBox(0F, 0F, 0F, 1, 1, 3);
      piedino3.setRotationPoint(5F, 23F, 7F);
      piedino3.setTextureSize(128, 64);
      piedino3.mirror = true;
      setRotation(piedino3, 0F, 1.570796F, 0F);
      piedino4 = new ModelRenderer(this, 0, 0);
      piedino4.addBox(0F, 0F, 0F, 1, 1, 3);
      piedino4.setRotationPoint(5F, 23F, -3F);
      piedino4.setTextureSize(128, 64);
      piedino4.mirror = true;
      setRotation(piedino4, 0F, 1.570796F, 0F);
      CORPO_PRINCIPALE = new ModelRenderer(this, 0, 9);
      CORPO_PRINCIPALE.addBox(0F, 0F, 0F, 8, 9, 13);
      CORPO_PRINCIPALE.setRotationPoint(-1F, 14F, -5F);
      CORPO_PRINCIPALE.setTextureSize(128, 64);
      CORPO_PRINCIPALE.mirror = true;
      setRotation(CORPO_PRINCIPALE, 0F, 0F, 0F);
      COPRICAVO1 = new ModelRenderer(this, 43, 0);
      COPRICAVO1.addBox(0F, 0F, 0F, 3, 5, 1);
      COPRICAVO1.setRotationPoint(3F, 17F, -6F);
      COPRICAVO1.setTextureSize(128, 64);
      COPRICAVO1.mirror = true;
      setRotation(COPRICAVO1, 0F, 0F, 0F);
      COPRICAVO2 = new ModelRenderer(this, 21, 0);
      COPRICAVO2.addBox(0F, 0F, 0F, 3, 1, 2);
      COPRICAVO2.setRotationPoint(3F, 17F, -6F);
      COPRICAVO2.setTextureSize(128, 64);
      COPRICAVO2.mirror = true;
      setRotation(COPRICAVO2, 0.7853982F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    piedino1.render(f5);
    piedino2.render(f5);
    piedino3.render(f5);
    piedino4.render(f5);
    CORPO_PRINCIPALE.render(f5);
    COPRICAVO1.render(f5);
    COPRICAVO2.render(f5);
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