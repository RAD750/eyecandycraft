package eyecandycraft.main.solid.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelAntenna5G extends ModelBase {
	//fields
    ModelRenderer Base;
    ModelRenderer Palo;
    ModelRenderer Corpo_principale;
    ModelRenderer gancio;
    ModelRenderer Shape1;
    ModelRenderer Shape2;
  
  public ModelAntenna5G()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      Base = new ModelRenderer(this, 0, 0);
      Base.addBox(0F, 0F, 0F, 4, 1, 4);
      Base.setRotationPoint(-2F, 23F, -2F);
      Base.setTextureSize(64, 32);
      Base.mirror = true;
      setRotation(Base, 0F, 0F, 0F);
      Palo = new ModelRenderer(this, 17, 0);
      Palo.addBox(0F, 0F, 0F, 1, 18, 1);
      Palo.setRotationPoint(-0.5F, 5F, -0.5F);
      Palo.setTextureSize(64, 32);
      Palo.mirror = true;
      setRotation(Palo, 0F, 0F, 0F);
      Corpo_principale = new ModelRenderer(this, 25, 0);
      Corpo_principale.addBox(0F, 0F, 0F, 1, 8, 8);
      Corpo_principale.setRotationPoint(-3F, 8.5F, -4.5F);
      Corpo_principale.setTextureSize(64, 32);
      Corpo_principale.mirror = true;
      setRotation(Corpo_principale, 0.7853982F, 0.7853982F, 0F);
      gancio = new ModelRenderer(this, 25, 21);
      gancio.addBox(0F, 0F, 0F, 2, 1, 3);
      gancio.setRotationPoint(-1.5F, 8.5F, -0.5F);
      gancio.setTextureSize(64, 32);
      gancio.mirror = true;
      setRotation(gancio, 0F, 0.7853982F, 0F);
      Shape1 = new ModelRenderer(this, 0, 7);
      Shape1.addBox(0F, 0F, 0F, 1, 1, 1);
      Shape1.setRotationPoint(1F, 8.5F, -1.5F);
      Shape1.setTextureSize(64, 32);
      Shape1.mirror = true;
      setRotation(Shape1, 0F, 0.7853982F, 0F);
      Shape2 = new ModelRenderer(this, 0, 7);
      Shape2.addBox(0F, 0F, 0F, 0, 3, 3);
      Shape2.setRotationPoint(1.5F, 7.5F, -2.5F);
      Shape2.setTextureSize(64, 32);
      Shape2.mirror = true;
      setRotation(Shape2, 0F, 0.7853982F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Base.render(f5);
    Palo.render(f5);
    Corpo_principale.render(f5);
    gancio.render(f5);
    Shape1.render(f5);
    Shape1.render(f5);
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