package eyecandycraft.main.solid.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelFountain extends ModelBase {
	  //fields
    ModelRenderer Base;
    ModelRenderer Shape1a;
    ModelRenderer Shape2a;
    ModelRenderer Shape3a;
    ModelRenderer Shape1;
    ModelRenderer Shape5;
    ModelRenderer Shape3;
    ModelRenderer Shape4;
    ModelRenderer Shape2;
    ModelRenderer Shape6;
    ModelRenderer Shape7;
    ModelRenderer Shape8;
  
  public ModelFountain()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      Base = new ModelRenderer(this, 0, 0);
      Base.addBox(0F, 0F, 0F, 7, 1, 7);
      Base.setRotationPoint(-3.5F, 23F, -4.5F);
      Base.setTextureSize(64, 32);
      Base.mirror = true;
      setRotation(Base, 0F, 0F, 0F);
      Shape1a = new ModelRenderer(this, 0, 20);
      Shape1a.addBox(0F, 0F, 0F, 1, 2, 5);
      Shape1a.setRotationPoint(2F, 21F, -3F);
      Shape1a.setTextureSize(64, 32);
      Shape1a.mirror = true;
      setRotation(Shape1a, 0F, 0F, 0F);
      Shape2a = new ModelRenderer(this, 0, 20);
      Shape2a.addBox(0F, 0F, 0F, 1, 2, 5);
      Shape2a.setRotationPoint(-3F, 21F, -3F);
      Shape2a.setTextureSize(64, 32);
      Shape2a.mirror = true;
      setRotation(Shape2a, 0F, 0F, 0F);
      Shape3a = new ModelRenderer(this, 0, 28);
      Shape3a.addBox(0F, 0F, 0F, 6, 2, 1);
      Shape3a.setRotationPoint(-3F, 21F, -4F);
      Shape3a.setTextureSize(64, 32);
      Shape3a.mirror = true;
      setRotation(Shape3a, 0F, 0F, 0F);
      Shape1 = new ModelRenderer(this, 29, 0);
      Shape1.addBox(0F, 0F, 0F, 4, 15, 4);
      Shape1.setRotationPoint(-2F, 4F, 2F);
      Shape1.setTextureSize(64, 32);
      Shape1.mirror = true;
      setRotation(Shape1, 0F, 0F, 0F);
      Shape5 = new ModelRenderer(this, 35, 20);
      Shape5.addBox(0F, 0F, 0F, 3, 1, 3);
      Shape5.setRotationPoint(-1.5F, 2F, 2.5F);
      Shape5.setTextureSize(64, 32);
      Shape5.mirror = true;
      setRotation(Shape5, 0F, 0F, 0F);
      Shape3 = new ModelRenderer(this, 0, 9);
      Shape3.addBox(0F, 0F, 0F, 6, 4, 6);
      Shape3.setRotationPoint(-3F, 20F, 1F);
      Shape3.setTextureSize(64, 32);
      Shape3.mirror = true;
      setRotation(Shape3, 0F, 0F, 0F);
      Shape4 = new ModelRenderer(this, 13, 20);
      Shape4.addBox(0F, 0F, 0F, 5, 1, 5);
      Shape4.setRotationPoint(-2.5F, 19F, 1.5F);
      Shape4.setTextureSize(64, 32);
      Shape4.mirror = true;
      setRotation(Shape4, 0F, 0F, 0F);
      Shape2 = new ModelRenderer(this, 13, 20);
      Shape2.addBox(0F, 0F, 0F, 5, 1, 5);
      Shape2.setRotationPoint(-2.5F, 3F, 1.5F);
      Shape2.setTextureSize(64, 32);
      Shape2.mirror = true;
      setRotation(Shape2, 0F, 0F, 0F);
      Shape6 = new ModelRenderer(this, 16, 28);
      Shape6.addBox(0F, 0F, 0F, 1, 2, 1);
      Shape6.setRotationPoint(-0.5F, 0F, 3.5F);
      Shape6.setTextureSize(64, 32);
      Shape6.mirror = true;
      setRotation(Shape6, 0F, 0F, 0F);
      Shape7 = new ModelRenderer(this, 22, 27);
      Shape7.addBox(0F, 0F, 0F, 1, 1, 3);
      Shape7.setRotationPoint(-0.5F, 5F, -1F);
      Shape7.setTextureSize(64, 32);
      Shape7.mirror = true;
      setRotation(Shape7, 0F, 0F, 0F);
      Shape8 = new ModelRenderer(this, 32, 28);
      Shape8.addBox(0F, 0F, 0F, 1, 1, 1);
      Shape8.setRotationPoint(-0.5F, 6F, -0.5F);
      Shape8.setTextureSize(64, 32);
      Shape8.mirror = true;
      setRotation(Shape8, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Base.render(f5);
    Shape1a.render(f5);
    Shape2a.render(f5);
    Shape3a.render(f5);
    Shape1.render(f5);
    Shape5.render(f5);
    Shape3.render(f5);
    Shape4.render(f5);
    Shape2.render(f5);
    Shape6.render(f5);
    Shape7.render(f5);
    Shape8.render(f5);
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