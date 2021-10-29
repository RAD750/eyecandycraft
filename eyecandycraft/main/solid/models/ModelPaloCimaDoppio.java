package eyecandycraft.main.solid.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelPaloCimaDoppio extends ModelBase {
	  //fields
    ModelRenderer Shape1;
    ModelRenderer Shape2;
    ModelRenderer Shape2a;
    ModelRenderer Shape2b;
    ModelRenderer Shape2c;
    ModelRenderer Shape3;
    ModelRenderer Shape3a;
    ModelRenderer Shape4;
    ModelRenderer Shape5;
    ModelRenderer Shape2d;
    ModelRenderer Shape2e;
    ModelRenderer Shape3b;
    ModelRenderer Shape3h;
    ModelRenderer Shape2f;
    ModelRenderer Shape2g;
  
  public ModelPaloCimaDoppio()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      Shape1 = new ModelRenderer(this, 0, 0);
      Shape1.addBox(0F, 0F, 0F, 6, 16, 6);
      Shape1.setRotationPoint(-3F, 8F, -3F);
      Shape1.setTextureSize(64, 32);
      Shape1.mirror = true;
      setRotation(Shape1, 0F, 0F, 0F);
      Shape2 = new ModelRenderer(this, 28, 0);
      Shape2.addBox(0F, 0F, 0F, 1, 1, 2);
      Shape2.setRotationPoint(-4F, 20F, -1F);
      Shape2.setTextureSize(64, 32);
      Shape2.mirror = true;
      setRotation(Shape2, 0F, 0F, 0F);
      Shape2a = new ModelRenderer(this, 27, 8);
      Shape2a.addBox(0F, 0F, 0F, 1, 1, 16);
      Shape2a.setRotationPoint(-5F, 20F, -8F);
      Shape2a.setTextureSize(64, 32);
      Shape2a.mirror = true;
      setRotation(Shape2a, 0F, 0F, 0F);
      Shape2b = new ModelRenderer(this, 27, 8);
      Shape2b.addBox(0F, 0F, 0F, 1, 1, 16);
      Shape2b.setRotationPoint(-5F, 15F, -8F);
      Shape2b.setTextureSize(64, 32);
      Shape2b.mirror = true;
      setRotation(Shape2b, 0F, 0F, 0F);
      Shape2c = new ModelRenderer(this, 28, 0);
      Shape2c.addBox(0F, 0F, 0F, 1, 1, 2);
      Shape2c.setRotationPoint(-4F, 15F, -1F);
      Shape2c.setTextureSize(64, 32);
      Shape2c.mirror = true;
      setRotation(Shape2c, 0F, 0F, 0F);
      Shape3 = new ModelRenderer(this, 0, 24);
      Shape3.addBox(0F, 0F, 0F, 1, 4, 1);
      Shape3.setRotationPoint(-5F, 16F, -6F);
      Shape3.setTextureSize(64, 32);
      Shape3.mirror = true;
      setRotation(Shape3, 0F, 0F, 0F);
      Shape3a = new ModelRenderer(this, 0, 24);
      Shape3a.addBox(0F, 0F, 0F, 1, 4, 1);
      Shape3a.setRotationPoint(-5F, 16F, 5F);
      Shape3a.setTextureSize(64, 32);
      Shape3a.mirror = true;
      setRotation(Shape3a, 0F, 0F, 0F);
      Shape4 = new ModelRenderer(this, 10, 22);
      Shape4.addBox(0F, 0F, 0F, 2, 8, 1);
      Shape4.setRotationPoint(-1F, 16F, 3F);
      Shape4.setTextureSize(64, 32);
      Shape4.mirror = true;
      setRotation(Shape4, 0F, 0F, 0F);
      Shape5 = new ModelRenderer(this, 17, 28);
      Shape5.addBox(0F, 0F, 0F, 6, 2, 1);
      Shape5.setRotationPoint(-3F, 16F, 3F);
      Shape5.setTextureSize(64, 32);
      Shape5.mirror = true;
      setRotation(Shape5, 0F, 0F, 0F);
      Shape2d = new ModelRenderer(this, 27, 8);
      Shape2d.addBox(0F, 0F, 0F, 1, 1, 16);
      Shape2d.setRotationPoint(4F, 15F, -8F);
      Shape2d.setTextureSize(64, 32);
      Shape2d.mirror = true;
      setRotation(Shape2d, 0F, 0F, 0F);
      Shape2e = new ModelRenderer(this, 27, 8);
      Shape2e.addBox(0F, 0F, 0F, 1, 1, 16);
      Shape2e.setRotationPoint(4F, 20F, -8F);
      Shape2e.setTextureSize(64, 32);
      Shape2e.mirror = true;
      setRotation(Shape2e, 0F, 0F, 0F);
      Shape3b = new ModelRenderer(this, 0, 24);
      Shape3b.addBox(0F, 0F, 0F, 1, 4, 1);
      Shape3b.setRotationPoint(4F, 16F, 5F);
      Shape3b.setTextureSize(64, 32);
      Shape3b.mirror = true;
      setRotation(Shape3b, 0F, 0F, 0F);
      Shape3h = new ModelRenderer(this, 0, 24);
      Shape3h.addBox(0F, 0F, 0F, 1, 4, 1);
      Shape3h.setRotationPoint(4F, 16F, -6F);
      Shape3h.setTextureSize(64, 32);
      Shape3h.mirror = true;
      setRotation(Shape3h, 0F, 0F, 0F);
      Shape2f = new ModelRenderer(this, 28, 0);
      Shape2f.addBox(0F, 0F, 0F, 1, 1, 2);
      Shape2f.setRotationPoint(3F, 15F, -1F);
      Shape2f.setTextureSize(64, 32);
      Shape2f.mirror = true;
      setRotation(Shape2f, 0F, 0F, 0F);
      Shape2g = new ModelRenderer(this, 28, 0);
      Shape2g.addBox(0F, 0F, 0F, 1, 1, 2);
      Shape2g.setRotationPoint(3F, 20F, -1F);
      Shape2g.setTextureSize(64, 32);
      Shape2g.mirror = true;
      setRotation(Shape2g, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Shape1.render(f5);
    Shape2.render(f5);
    Shape2a.render(f5);
    Shape2b.render(f5);
    Shape2c.render(f5);
    Shape3.render(f5);
    Shape3a.render(f5);
    Shape4.render(f5);
    Shape5.render(f5);
    Shape2d.render(f5);
    Shape2e.render(f5);
    Shape3b.render(f5);
    Shape3a.render(f5);
    Shape2f.render(f5);
    Shape2g.render(f5);
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