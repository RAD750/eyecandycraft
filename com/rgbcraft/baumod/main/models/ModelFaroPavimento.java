package com.rgbcraft.baumod.main.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelFaroPavimento extends ModelBase {
	 //fields
    ModelRenderer Bracc2;
    ModelRenderer Faro2;
    ModelRenderer Faro1;
    ModelRenderer Bracc1;
  
  public ModelFaroPavimento()
  {
    textureWidth = 32;
    textureHeight = 32;
    
      Bracc2 = new ModelRenderer(this, 0, 0);
      Bracc2.addBox(0F, 0F, 0F, 1, 7, 1);
      Bracc2.setRotationPoint(1.5F, 17F, 4F);
      Bracc2.setTextureSize(32, 32);
      Bracc2.mirror = true;
      setRotation(Bracc2, 0F, 0F, 0F);
      Faro2 = new ModelRenderer(this, 0, 20);
      Faro2.addBox(0F, 0F, 0F, 4, 3, 3);
      Faro2.setRotationPoint(-2F, 14.9F, 4F);
      Faro2.setTextureSize(32, 32);
      Faro2.mirror = true;
      setRotation(Faro2, -0.7853982F, 0F, 0F);
      Faro1 = new ModelRenderer(this, 0, 13);
      Faro1.addBox(0F, 0F, 0F, 6, 1, 5);
      Faro1.setRotationPoint(-3F, 13.5F, 4F);
      Faro1.setTextureSize(32, 32);
      Faro1.mirror = true;
      setRotation(Faro1, -0.7853982F, 0F, 0F);
      Bracc1 = new ModelRenderer(this, 0, 0);
      Bracc1.addBox(0F, 0F, 0F, 1, 7, 1);
      Bracc1.setRotationPoint(-2.5F, 17F, 4F);
      Bracc1.setTextureSize(32, 32);
      Bracc1.mirror = true;
      setRotation(Bracc1, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Bracc2.render(f5);
    Faro2.render(f5);
    Faro1.render(f5);
    Bracc1.render(f5);
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