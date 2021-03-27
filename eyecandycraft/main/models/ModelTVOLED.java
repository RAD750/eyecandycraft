package eyecandycraft.main.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelTVOLED extends ModelBase {
	 //fields
    ModelRenderer Schermo;
    ModelRenderer Shape1;
    ModelRenderer Shape2;
  
  public ModelTVOLED()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      Schermo = new ModelRenderer(this, 0, 0);
      Schermo.addBox(0F, 0F, 0F, 20, 11, 1);
      Schermo.setRotationPoint(-10F, 11F, 5F);
      Schermo.setTextureSize(64, 32);
      Schermo.mirror = true;
      setRotation(Schermo, 0F, 0F, 0F);
      Shape1 = new ModelRenderer(this, 0, 13);
      Shape1.addBox(0F, 0F, 0F, 4, 1, 1);
      Shape1.setRotationPoint(-2F, 22F, 5F);
      Shape1.setTextureSize(64, 32);
      Shape1.mirror = true;
      setRotation(Shape1, 0F, 0F, 0F);
      Shape2 = new ModelRenderer(this, 0, 19);
      Shape2.addBox(0F, 0F, 0F, 8, 1, 4);
      Shape2.setRotationPoint(-4F, 23F, 3.5F);
      Shape2.setTextureSize(64, 32);
      Shape2.mirror = true;
      setRotation(Shape2, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Schermo.render(f5);
    Shape1.render(f5);
    Shape2.render(f5);
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