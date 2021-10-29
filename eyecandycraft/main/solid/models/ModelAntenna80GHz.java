package eyecandycraft.main.solid.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelAntenna80GHz extends ModelBase
{
	 //fields
    ModelRenderer Shape1;
    ModelRenderer Shape2A;
    ModelRenderer Shape2B;
    ModelRenderer disco;
    ModelRenderer Disco2;
    ModelRenderer Disco3;
    ModelRenderer Disco4;
    ModelRenderer Shape3;
    ModelRenderer Disco5;
  
  public ModelAntenna80GHz()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      Shape1 = new ModelRenderer(this, 0, 13);
      Shape1.addBox(0F, 0F, 0F, 6, 6, 1);
      Shape1.setRotationPoint(-3F, 12F, 7F);
      Shape1.setTextureSize(64, 32);
      Shape1.mirror = true;
      setRotation(Shape1, 0F, 0F, 0F);
      Shape2A = new ModelRenderer(this, 16, 0);
      Shape2A.addBox(0F, 0F, 0F, 2, 10, 1);
      Shape2A.setRotationPoint(-1F, 10F, 6F);
      Shape2A.setTextureSize(64, 32);
      Shape2A.mirror = true;
      setRotation(Shape2A, 0F, 0F, 0F);
      Shape2B = new ModelRenderer(this, 16, 0);
      Shape2B.addBox(0F, 0F, 0F, 10, 2, 1);
      Shape2B.setRotationPoint(-5F, 14F, 6F);
      Shape2B.setTextureSize(64, 32);
      Shape2B.mirror = true;
      setRotation(Shape2B, 0F, 0F, 0F);
      disco = new ModelRenderer(this, 0, 0);
      disco.addBox(0F, 0F, 0F, 2, 1, 1);
      disco.setRotationPoint(-1F, 11F, 5F);
      disco.setTextureSize(64, 32);
      disco.mirror = true;
      setRotation(disco, 0F, 0F, 0F);
      Disco2 = new ModelRenderer(this, 0, 0);
      Disco2.addBox(0F, 0F, 0F, 1, 2, 1);
      Disco2.setRotationPoint(-4F, 14F, 5F);
      Disco2.setTextureSize(64, 32);
      Disco2.mirror = true;
      setRotation(Disco2, 0F, 0F, 0F);
      Disco3 = new ModelRenderer(this, 0, 0);
      Disco3.addBox(0F, 0F, 0F, 1, 2, 1);
      Disco3.setRotationPoint(3F, 14F, 5F);
      Disco3.setTextureSize(64, 32);
      Disco3.mirror = true;
      setRotation(Disco3, 0F, 0F, 0F);
      Disco4 = new ModelRenderer(this, 0, 0);
      Disco4.addBox(0F, 0F, 0F, 2, 1, 1);
      Disco4.setRotationPoint(-1F, 18F, 5F);
      Disco4.setTextureSize(64, 32);
      Disco4.mirror = true;
      setRotation(Disco4, 0F, 0F, 0F);
      Shape3 = new ModelRenderer(this, 0, 0);
      Shape3.addBox(0F, 0F, 0F, 4, 6, 1);
      Shape3.setRotationPoint(-2F, 12F, 5F);
      Shape3.setTextureSize(64, 32);
      Shape3.mirror = true;
      setRotation(Shape3, 0F, 0F, 0F);
      Disco5 = new ModelRenderer(this, 0, 0);
      Disco5.addBox(0F, 0F, 0F, 6, 4, 1);
      Disco5.setRotationPoint(-3F, 13F, 5F);
      Disco5.setTextureSize(64, 32);
      Disco5.mirror = true;
      setRotation(Disco5, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Shape1.render(f5);
    Shape2A.render(f5);
    Shape2B.render(f5);
    disco.render(f5);
    Disco2.render(f5);
    Disco3.render(f5);
    Disco4.render(f5);
    Shape3.render(f5);
    Disco5.render(f5);
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