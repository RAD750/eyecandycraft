package eyecandycraft.main.solid.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelPanchinaSinistra extends ModelBase {
	 //fields
    ModelRenderer Shape1;
    ModelRenderer Shape3;
    ModelRenderer Shape4;
    ModelRenderer Shape2;
    ModelRenderer Shape5a;
    ModelRenderer Shape3a;
    ModelRenderer Shape3b;
    ModelRenderer Shape3c;
    ModelRenderer Shape3e;
    ModelRenderer Bracket2;
    ModelRenderer Bracket4;
    ModelRenderer Foot1;
    ModelRenderer Foot3;
  
  public ModelPanchinaSinistra()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      Shape1 = new ModelRenderer(this, 0, 0);
      Shape1.addBox(0F, 0F, 0F, 16, 1, 1);
      Shape1.setRotationPoint(-8F, 18F, 0F);
      Shape1.setTextureSize(64, 32);
      Shape1.mirror = true;
      setRotation(Shape1, 0F, 0F, 0F);
      Shape3 = new ModelRenderer(this, 0, 0);
      Shape3.addBox(0F, 0F, 0F, 16, 1, 1);
      Shape3.setRotationPoint(-8F, 18F, 2F);
      Shape3.setTextureSize(64, 32);
      Shape3.mirror = true;
      setRotation(Shape3, 0F, 0F, 0F);
      Shape4 = new ModelRenderer(this, 0, 0);
      Shape4.addBox(0F, 0F, 0F, 16, 1, 1);
      Shape4.setRotationPoint(-8F, 18F, -2F);
      Shape4.setTextureSize(64, 32);
      Shape4.mirror = true;
      setRotation(Shape4, 0F, 0F, 0F);
      Shape2 = new ModelRenderer(this, 0, 0);
      Shape2.addBox(0F, 0F, 0F, 16, 1, 1);
      Shape2.setRotationPoint(-8F, 18F, -4F);
      Shape2.setTextureSize(64, 32);
      Shape2.mirror = true;
      setRotation(Shape2, 0F, 0F, 0F);
      Shape5a = new ModelRenderer(this, 0, 0);
      Shape5a.addBox(0F, 0F, 0F, 16, 1, 1);
      Shape5a.setRotationPoint(-8F, 18F, -6F);
      Shape5a.setTextureSize(64, 32);
      Shape5a.mirror = true;
      setRotation(Shape5a, 0F, 0F, 0F);
      Shape3a = new ModelRenderer(this, 0, 0);
      Shape3a.addBox(0F, 0F, 0F, 16, 1, 1);
      Shape3a.setRotationPoint(-8F, 16F, 2.5F);
      Shape3a.setTextureSize(64, 32);
      Shape3a.mirror = true;
      setRotation(Shape3a, 0F, 0F, 0F);
      Shape3b = new ModelRenderer(this, 0, 0);
      Shape3b.addBox(0F, 0F, 0F, 16, 1, 1);
      Shape3b.setRotationPoint(-8F, 14F, 3F);
      Shape3b.setTextureSize(64, 32);
      Shape3b.mirror = true;
      setRotation(Shape3b, 0F, 0F, 0F);
      Shape3c = new ModelRenderer(this, 0, 0);
      Shape3c.addBox(0F, 0F, 0F, 16, 1, 1);
      Shape3c.setRotationPoint(-8F, 12F, 3.5F);
      Shape3c.setTextureSize(64, 32);
      Shape3c.mirror = true;
      setRotation(Shape3c, 0F, 0F, 0F);
      Shape3e = new ModelRenderer(this, 0, 0);
      Shape3e.addBox(0F, 0F, 0F, 16, 1, 1);
      Shape3e.setRotationPoint(-8F, 10F, 4F);
      Shape3e.setTextureSize(64, 32);
      Shape3e.mirror = true;
      setRotation(Shape3e, 0F, 0F, 0F);
      Bracket2 = new ModelRenderer(this, 0, 16);
      Bracket2.addBox(0F, 0F, 0F, 1, 1, 10);
      Bracket2.setRotationPoint(-7F, 19F, -6F);
      Bracket2.setTextureSize(64, 32);
      Bracket2.mirror = true;
      setRotation(Bracket2, 0F, 0F, 0F);
      Bracket4 = new ModelRenderer(this, 0, 16);
      Bracket4.addBox(0F, 0F, 0F, 1, 10, 1);
      Bracket4.setRotationPoint(-7F, 10F, 5F);
      Bracket4.setTextureSize(64, 32);
      Bracket4.mirror = true;
      setRotation(Bracket4, -0.2094395F, 0F, 0F);
      Foot1 = new ModelRenderer(this, 40, 0);
      Foot1.addBox(0F, 0F, 0F, 1, 4, 1);
      Foot1.setRotationPoint(-7F, 20F, -4F);
      Foot1.setTextureSize(64, 32);
      Foot1.mirror = true;
      setRotation(Foot1, 0F, 0F, 0F);
      Foot3 = new ModelRenderer(this, 40, 0);
      Foot3.addBox(0F, 0F, 0F, 1, 4, 1);
      Foot3.setRotationPoint(-7F, 20F, 2F);
      Foot3.setTextureSize(64, 32);
      Foot3.mirror = true;
      setRotation(Foot3, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Shape1.render(f5);
    Shape3.render(f5);
    Shape4.render(f5);
    Shape2.render(f5);
    Shape5a.render(f5);
    Shape3a.render(f5);
    Shape3b.render(f5);
    Shape3c.render(f5);
    Shape3e.render(f5);
    Bracket2.render(f5);
    Bracket4.render(f5);
    Foot1.render(f5);
    Foot3.render(f5);
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