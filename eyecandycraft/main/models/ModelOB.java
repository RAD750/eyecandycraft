package eyecandycraft.main.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelOB extends ModelBase {
	//fields
    ModelRenderer Macchinetta;
    ModelRenderer Fessura;
  
  public ModelOB()
  {
    textureWidth = 32;
    textureHeight = 32;
    
      Macchinetta = new ModelRenderer(this, 0, 0);
      Macchinetta.addBox(0F, 0F, 0F, 5, 10, 3);
      Macchinetta.setRotationPoint(-2.5F, 14F, 5F);
      Macchinetta.setTextureSize(32, 32);
      Macchinetta.mirror = true;
      setRotation(Macchinetta, 0F, 0F, 0F);
      Fessura = new ModelRenderer(this, 17, 0);
      Fessura.addBox(0F, 0F, 0F, 5, 1, 1);
      Fessura.setRotationPoint(-2.8F, 21F, 4.9F);
      Fessura.setTextureSize(32, 32);
      Fessura.mirror = true;
      setRotation(Fessura, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Macchinetta.render(f5);
    Fessura.render(f5);
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