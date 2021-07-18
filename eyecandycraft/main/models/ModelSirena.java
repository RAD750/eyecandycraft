package eyecandycraft.main.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelSirena extends ModelBase
{
  //fields
    ModelRenderer Shape1;
    ModelRenderer Shape2;
    ModelRenderer Shape3;
    ModelRenderer Shape4;
    ModelRenderer Shape5;
    ModelRenderer Shape6;
    ModelRenderer Shape7;
    ModelRenderer Shape2a;
    ModelRenderer Shape7a;
    ModelRenderer Shape7b;
  
  public ModelSirena()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      Shape1 = new ModelRenderer(this, 0, 0);
      Shape1.addBox(0F, 0F, 0F, 4, 1, 4);
      Shape1.setRotationPoint(-2F, 23F, -2F);
      Shape1.setTextureSize(64, 32);
      Shape1.mirror = true;
      setRotation(Shape1, 0F, 0F, 0F);
      Shape2 = new ModelRenderer(this, 0, 0);
      Shape2.addBox(0F, 0F, 0F, 1, 3, 1);
      Shape2.setRotationPoint(-0.5F, 20F, -0.5F);
      Shape2.setTextureSize(64, 32);
      Shape2.mirror = true;
      setRotation(Shape2, 0F, 0F, 0F);
      Shape3 = new ModelRenderer(this, 0, 6);
      Shape3.addBox(0F, 0F, 0F, 2, 3, 2);
      Shape3.setRotationPoint(-1F, 17F, -1F);
      Shape3.setTextureSize(64, 32);
      Shape3.mirror = true;
      setRotation(Shape3, 0F, 0F, 0F);
      Shape4 = new ModelRenderer(this, 18, 0);
      Shape4.addBox(0F, 0F, 0F, 2, 1, 1);
      Shape4.setRotationPoint(-3F, 18F, -0.5F);
      Shape4.setTextureSize(64, 32);
      Shape4.mirror = true;
      setRotation(Shape4, 0F, 0F, 0F);
      Shape5 = new ModelRenderer(this, 18, 0);
      Shape5.addBox(0F, 0F, 0F, 2, 2, 2);
      Shape5.setRotationPoint(-5F, 17.5F, -1F);
      Shape5.setTextureSize(64, 32);
      Shape5.mirror = true;
      setRotation(Shape5, 0F, 0F, 0F);
      Shape6 = new ModelRenderer(this, 18, 0);
      Shape6.addBox(0F, 0F, 0F, 2, 3, 3);
      Shape6.setRotationPoint(-7F, 17F, -1.5F);
      Shape6.setTextureSize(64, 32);
      Shape6.mirror = true;
      setRotation(Shape6, 0F, 0F, 0F);
      Shape7 = new ModelRenderer(this, 18, 0);
      Shape7.addBox(0F, 0F, 0F, 1, 1, 5);
      Shape7.setRotationPoint(-8F, 19F, -2.5F);
      Shape7.setTextureSize(64, 32);
      Shape7.mirror = true;
      setRotation(Shape7, 0F, 0F, 0F);
      Shape2a = new ModelRenderer(this, 18, 0);
      Shape2a.addBox(0F, 0F, 0F, 1, 1, 5);
      Shape2a.setRotationPoint(-8F, 16F, -2.5F);
      Shape2a.setTextureSize(64, 32);
      Shape2a.mirror = true;
      setRotation(Shape2a, 0F, 0F, 0F);
      Shape7a = new ModelRenderer(this, 18, 0);
      Shape7a.addBox(0F, 0F, 0F, 1, 2, 1);
      Shape7a.setRotationPoint(-8F, 17F, -2.5F);
      Shape7a.setTextureSize(64, 32);
      Shape7a.mirror = true;
      setRotation(Shape7a, 0F, 0F, 0F);
      Shape7b = new ModelRenderer(this, 18, 0);
      Shape7b.addBox(0F, 0F, 0F, 1, 2, 1);
      Shape7b.setRotationPoint(-8F, 17F, 1.5F);
      Shape7b.setTextureSize(64, 32);
      Shape7b.mirror = true;
      setRotation(Shape7b, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Shape1.render(f5);
    Shape2.render(f5);
    Shape3.render(f5);
    Shape4.render(f5);
    Shape5.render(f5);
    Shape6.render(f5);
    Shape7.render(f5);
    Shape2a.render(f5);
    Shape7a.render(f5);
    Shape7b.render(f5);
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
