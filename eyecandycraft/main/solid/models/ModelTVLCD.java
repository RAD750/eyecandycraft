package eyecandycraft.main.solid.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelTVLCD extends ModelBase {
	//fields
    ModelRenderer Schermo;
    ModelRenderer Base;
    ModelRenderer Shape1;
  
  public ModelTVLCD()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      Schermo = new ModelRenderer(this, 0, 0);
      Schermo.addBox(0F, 0F, 0F, 12, 9, 1);
      Schermo.setRotationPoint(-6F, 13F, 5F);
      Schermo.setTextureSize(64, 32);
      Schermo.mirror = true;
      setRotation(Schermo, 0F, 0F, 0F);
      Base = new ModelRenderer(this, 28, 0);
      Base.addBox(0F, 0F, 0F, 4, 1, 3);
      Base.setRotationPoint(-2F, 23F, 4F);
      Base.setTextureSize(64, 32);
      Base.mirror = true;
      setRotation(Base, 0F, 0F, 0F);
      Shape1 = new ModelRenderer(this, 0, 12);
      Shape1.addBox(0F, 0F, 0F, 2, 1, 1);
      Shape1.setRotationPoint(-1F, 22F, 5F);
      Shape1.setTextureSize(64, 32);
      Shape1.mirror = true;
      setRotation(Shape1, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Schermo.render(f5);
    Base.render(f5);
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