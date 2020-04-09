package com.rgbcraft.baumod.main.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelCCTVCam extends ModelBase {
	//fields
    ModelRenderer Supporto1;
    ModelRenderer Supporto2;
    ModelRenderer CorpoTelecamera;
    ModelRenderer Obiettivo;
  
  public ModelCCTVCam()
  {
    textureWidth = 32;
    textureHeight = 32;
    
      Supporto1 = new ModelRenderer(this, 0, 0);
      Supporto1.addBox(0F, 0F, 0F, 1, 5, 1);
      Supporto1.setRotationPoint(4F, 19F, -0.5F);
      Supporto1.setTextureSize(32, 32);
      Supporto1.mirror = true;
      setRotation(Supporto1, 0F, 0F, 0F);
      Supporto2 = new ModelRenderer(this, 5, 0);
      Supporto2.addBox(0F, 0F, 0F, 3, 1, 1);
      Supporto2.setRotationPoint(5F, 23F, -0.5F);
      Supporto2.setTextureSize(32, 32);
      Supporto2.mirror = true;
      setRotation(Supporto2, 0F, 0F, 0F);
      CorpoTelecamera = new ModelRenderer(this, 0, 7);
      CorpoTelecamera.addBox(0F, 0F, 0F, 2, 2, 5);
      CorpoTelecamera.setRotationPoint(3.5F, 18F, -3F);
      CorpoTelecamera.setTextureSize(32, 32);
      CorpoTelecamera.mirror = true;
      setRotation(CorpoTelecamera, 0.2617994F, 0F, 0F);
      Obiettivo = new ModelRenderer(this, 5, 3);
      Obiettivo.addBox(0F, 0F, 0F, 1, 1, 1);
      Obiettivo.setRotationPoint(4F, 18.7F, -3.5F);
      Obiettivo.setTextureSize(32, 32);
      Obiettivo.mirror = true;
      setRotation(Obiettivo, 0.2617994F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Supporto1.render(f5);
    Supporto2.render(f5);
    CorpoTelecamera.render(f5);
    Obiettivo.render(f5);
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