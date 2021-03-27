package eyecandycraft.main.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelRackRF extends ModelBase {
	//fields
    ModelRenderer RackCubo;
    ModelRenderer Mont1;
    ModelRenderer Mont2;
    ModelRenderer Mont3;
    ModelRenderer Mont4;
  
  public ModelRackRF()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      RackCubo = new ModelRenderer(this, 0, 0);
      RackCubo.addBox(0F, 0F, 0F, 16, 16, 14);
      RackCubo.setRotationPoint(-8F, 8F, -6F);
      RackCubo.setTextureSize(64, 32);
      RackCubo.mirror = true;
      setRotation(RackCubo, 0F, 0F, 0F);
      Mont1 = new ModelRenderer(this, 0, 30);
      Mont1.addBox(0F, 0F, 0F, 16, 1, 1);
      Mont1.setRotationPoint(-8F, 23F, -7F);
      Mont1.setTextureSize(64, 32);
      Mont1.mirror = true;
      setRotation(Mont1, 0F, 0F, 0F);
      Mont2 = new ModelRenderer(this, 0, 30);
      Mont2.addBox(0F, 0F, 0F, 16, 1, 1);
      Mont2.setRotationPoint(-8F, 8F, -7F);
      Mont2.setTextureSize(64, 32);
      Mont2.mirror = true;
      setRotation(Mont2, 0F, 0F, 0F);
      Mont3 = new ModelRenderer(this, 60, 0);
      Mont3.addBox(0F, 0F, 0F, 1, 14, 1);
      Mont3.setRotationPoint(-8F, 9F, -7F);
      Mont3.setTextureSize(64, 32);
      Mont3.mirror = true;
      setRotation(Mont3, 0F, 0F, 0F);
      Mont4 = new ModelRenderer(this, 60, 0);
      Mont4.addBox(0F, 0F, 0F, 1, 14, 1);
      Mont4.setRotationPoint(7F, 9F, -7F);
      Mont4.setTextureSize(64, 32);
      Mont4.mirror = true;
      setRotation(Mont4, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    RackCubo.render(f5);
    Mont1.render(f5);
    Mont2.render(f5);
    Mont3.render(f5);
    Mont4.render(f5);
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