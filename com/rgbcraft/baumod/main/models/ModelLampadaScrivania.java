package com.rgbcraft.baumod.main.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelLampadaScrivania extends ModelBase {
	//fields
    ModelRenderer Base;
    ModelRenderer Braccio1;
    ModelRenderer Braccio2;
    ModelRenderer Lampadina;
    ModelRenderer Paralume2;
    ModelRenderer Paralume3A;
    ModelRenderer Paralume3C;
    ModelRenderer Paralume1;
    ModelRenderer Paralume3B;
    ModelRenderer Paralume3D;
  
  public ModelLampadaScrivania()
  {
    textureWidth = 32;
    textureHeight = 32;
    
      Base = new ModelRenderer(this, 0, 0);
      Base.addBox(0F, 0F, 0F, 3, 1, 3);
      Base.setRotationPoint(-5F, 23F, -1.5F);
      Base.setTextureSize(64, 32);
      Base.mirror = true;
      setRotation(Base, 0F, 0F, 0F);
      Braccio1 = new ModelRenderer(this, 13, 0);
      Braccio1.addBox(0F, 0F, 0F, 1, 11, 1);
      Braccio1.setRotationPoint(-5.5F, 13F, -0.5F);
      Braccio1.setTextureSize(64, 32);
      Braccio1.mirror = true;
      setRotation(Braccio1, 0F, 0F, -0.1396263F);
      Braccio2 = new ModelRenderer(this, 0, 29);
      Braccio2.addBox(0F, 0F, 0F, 10, 1, 1);
      Braccio2.setRotationPoint(-6F, 12.2F, -0.5F);
      Braccio2.setTextureSize(64, 32);
      Braccio2.mirror = true;
      setRotation(Braccio2, 0F, 0F, -0.2617994F);
      Lampadina = new ModelRenderer(this, 20, 0);
      Lampadina.addBox(0F, 0F, 0F, 1, 3, 1);
      Lampadina.setRotationPoint(3F, 12.6F, -0.5F);
      Lampadina.setTextureSize(64, 32);
      Lampadina.mirror = true;
      setRotation(Lampadina, 0F, 0F, 0F);
      Paralume2 = new ModelRenderer(this, 0, 25);
      Paralume2.addBox(0F, 0F, 0F, 2, 1, 2);
      Paralume2.setRotationPoint(2.5F, 12F, -1F);
      Paralume2.setTextureSize(64, 32);
      Paralume2.mirror = true;
      setRotation(Paralume2, 0F, 0F, 0F);
      Paralume3A = new ModelRenderer(this, 0, 19);
      Paralume3A.addBox(0F, 0F, 0F, 2, 2, 1);
      Paralume3A.setRotationPoint(2.5F, 13F, 1F);
      Paralume3A.setTextureSize(64, 32);
      Paralume3A.mirror = true;
      setRotation(Paralume3A, 0F, 0F, 0F);
      Paralume3C = new ModelRenderer(this, 0, 19);
      Paralume3C.addBox(0F, 0F, 0F, 2, 2, 1);
      Paralume3C.setRotationPoint(2.5F, 13F, -2F);
      Paralume3C.setTextureSize(64, 32);
      Paralume3C.mirror = true;
      setRotation(Paralume3C, 0F, 0F, 0F);
      Paralume1 = new ModelRenderer(this, 0, 5);
      Paralume1.addBox(0F, 0F, 0F, 1, 2, 1);
      Paralume1.setRotationPoint(3F, 10.6F, -0.5F);
      Paralume1.setTextureSize(64, 32);
      Paralume1.mirror = true;
      setRotation(Paralume1, 0F, 0F, 0F);
      Paralume3B = new ModelRenderer(this, 0, 9);
      Paralume3B.addBox(0F, 0F, 0F, 1, 2, 4);
      Paralume3B.setRotationPoint(1.5F, 13F, -2F);
      Paralume3B.setTextureSize(64, 32);
      Paralume3B.mirror = true;
      setRotation(Paralume3B, 0F, 0F, 0F);
      Paralume3D = new ModelRenderer(this, 0, 9);
      Paralume3D.addBox(0F, 0F, 0F, 1, 2, 4);
      Paralume3D.setRotationPoint(4.5F, 13F, -2F);
      Paralume3D.setTextureSize(64, 32);
      Paralume3D.mirror = true;
      setRotation(Paralume3D, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Base.render(f5);
    Braccio1.render(f5);
    Braccio2.render(f5);
    Lampadina.render(f5);
    Paralume2.render(f5);
    Paralume3A.render(f5);
    Paralume3C.render(f5);
    Paralume1.render(f5);
    Paralume3B.render(f5);
    Paralume3D.render(f5);
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