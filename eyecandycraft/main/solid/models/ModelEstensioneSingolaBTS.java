package eyecandycraft.main.solid.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelEstensioneSingolaBTS extends ModelBase {
	 //fields
    ModelRenderer Shape2;
    ModelRenderer MERD668;
    ModelRenderer Shape3;
    ModelRenderer WILCHICCO;
  
  public ModelEstensioneSingolaBTS()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      Shape2 = new ModelRenderer(this, 27, 8);
      Shape2.addBox(0F, 0F, 0F, 1, 1, 16);
      Shape2.setRotationPoint(-5F, 20F, -8F);
      Shape2.setTextureSize(64, 32);
      Shape2.mirror = true;
      setRotation(Shape2, 0F, 0F, 0F);
      MERD668 = new ModelRenderer(this, 27, 8);
      MERD668.addBox(0F, 0F, 0F, 1, 1, 16);
      MERD668.setRotationPoint(-5F, 15F, -8F);
      MERD668.setTextureSize(64, 32);
      MERD668.mirror = true;
      setRotation(MERD668, 0F, 0F, 0F);
      Shape3 = new ModelRenderer(this, 0, 24);
      Shape3.addBox(0F, 0F, 0F, 1, 4, 1);
      Shape3.setRotationPoint(-5F, 16F, -6F);
      Shape3.setTextureSize(64, 32);
      Shape3.mirror = true;
      setRotation(Shape3, 0F, 0F, 0F);
      WILCHICCO = new ModelRenderer(this, 0, 24);
      WILCHICCO.addBox(0F, 0F, 0F, 1, 4, 1);
      WILCHICCO.setRotationPoint(-5F, 16F, 5F);
      WILCHICCO.setTextureSize(64, 32);
      WILCHICCO.mirror = true;
      setRotation(WILCHICCO, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Shape2.render(f5);
    MERD668.render(f5);
    Shape3.render(f5);
    WILCHICCO.render(f5);
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