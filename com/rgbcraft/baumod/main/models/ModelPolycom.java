package com.rgbcraft.baumod.main.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelPolycom extends ModelBase {
	//fields
    ModelRenderer Telefono;
    ModelRenderer CornettaB;
    ModelRenderer CornettaA;
    ModelRenderer CornettaC;
    ModelRenderer Supporto;
  
  public ModelPolycom()
  {
    textureWidth = 32;
    textureHeight = 32;
    
      Telefono = new ModelRenderer(this, 0, 21);
      Telefono.addBox(0F, 0F, 0F, 7, 2, 9);
      Telefono.setRotationPoint(-3.5F, 22F, -4F);
      Telefono.setTextureSize(32, 32);
      Telefono.mirror = true;
      setRotation(Telefono, 0.5235988F, 0F, 0F);
      CornettaB = new ModelRenderer(this, 0, 0);
      CornettaB.addBox(0F, 0F, 0F, 2, 1, 2);
      CornettaB.setRotationPoint(-3F, 21F, -4F);
      CornettaB.setTextureSize(32, 32);
      CornettaB.mirror = true;
      setRotation(CornettaB, 0.5235988F, 0F, 0F);
      CornettaA = new ModelRenderer(this, 0, 12);
      CornettaA.addBox(0F, 0F, 0F, 2, 1, 7);
      CornettaA.setRotationPoint(-3F, 20F, -4F);
      CornettaA.setTextureSize(32, 32);
      CornettaA.mirror = true;
      setRotation(CornettaA, 0.5235988F, 0F, 0F);
      CornettaC = new ModelRenderer(this, 0, 0);
      CornettaC.addBox(0F, 0F, 0F, 2, 1, 2);
      CornettaC.setRotationPoint(-3F, 18F, 1F);
      CornettaC.setTextureSize(32, 32);
      CornettaC.mirror = true;
      setRotation(CornettaC, 0.5235988F, 0F, 0F);
      Supporto = new ModelRenderer(this, 0, 5);
      Supporto.addBox(0F, 0F, 0F, 4, 4, 1);
      Supporto.setRotationPoint(-2F, 21F, 1F);
      Supporto.setTextureSize(32, 32);
      Supporto.mirror = true;
      setRotation(Supporto, 0.5235988F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Telefono.render(f5);
    CornettaB.render(f5);
    CornettaA.render(f5);
    CornettaC.render(f5);
    Supporto.render(f5);
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
