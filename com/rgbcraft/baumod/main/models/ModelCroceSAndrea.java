package com.rgbcraft.baumod.main.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelCroceSAndrea extends ModelBase {
	//fields
    ModelRenderer Palo;
    ModelRenderer CroceA;
    ModelRenderer CroceB;
  
  public ModelCroceSAndrea()
  {
    textureWidth = 32;
    textureHeight = 32;
    
      Palo = new ModelRenderer(this, 0, 5);
      Palo.addBox(0F, 0F, 0F, 1, 16, 1);
      Palo.setRotationPoint(-0.5F, 11F, -0.5F);
      Palo.setTextureSize(32, 32);
      Palo.mirror = true;
      setRotation(Palo, 0F, 0F, 0F);
      CroceA = new ModelRenderer(this, 0, 0);
      CroceA.addBox(0F, 0F, 0F, 11, 2, 1);
      CroceA.setRotationPoint(-4.5F, 12F, 0F);
      CroceA.setTextureSize(32, 32);
      CroceA.mirror = true;
      setRotation(CroceA, 0F, 0F, 0.5235988F);
      CroceB = new ModelRenderer(this, 0, 0);
      CroceB.addBox(0F, 0F, 0F, 11, 2, 1);
      CroceB.setRotationPoint(-5.5F, 17.5F, 0F);
      CroceB.setTextureSize(32, 32);
      CroceB.mirror = true;
      setRotation(CroceB, 0F, 0F, -0.5235988F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Palo.render(f5);
    CroceA.render(f5);
    CroceB.render(f5);
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