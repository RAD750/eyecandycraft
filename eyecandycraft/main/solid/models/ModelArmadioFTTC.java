package eyecandycraft.main.solid.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelArmadioFTTC extends ModelBase {
	//fields
    ModelRenderer coso_che_non_avro_mai;
    ModelRenderer corpo_principale;
  
  public ModelArmadioFTTC()
  {
    textureWidth = 64;
    textureHeight = 64;
    
      coso_che_non_avro_mai = new ModelRenderer(this, 0, 0);
      coso_che_non_avro_mai.addBox(0F, 0F, 0F, 16, 32, 8);
      coso_che_non_avro_mai.setRotationPoint(-8F, -8F, 0F);
      coso_che_non_avro_mai.setTextureSize(64, 64);
      coso_che_non_avro_mai.mirror = true;
      setRotation(coso_che_non_avro_mai, 0F, 0F, 0F);
      corpo_principale = new ModelRenderer(this, 0, 43);
      corpo_principale.addBox(0F, 0F, 0F, 16, 8, 9);
      corpo_principale.setRotationPoint(-8F, -16F, -1F);
      corpo_principale.setTextureSize(64, 64);
      corpo_principale.mirror = true;
      setRotation(corpo_principale, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    coso_che_non_avro_mai.render(f5);
    corpo_principale.render(f5);
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