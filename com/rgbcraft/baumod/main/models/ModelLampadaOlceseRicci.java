package com.rgbcraft.baumod.main.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelLampadaOlceseRicci extends ModelBase {
	//fields
    ModelRenderer Lampada;
    ModelRenderer OttoneA;
    ModelRenderer OttoneB;
    ModelRenderer OttoneC;
    ModelRenderer OttoneD;
    ModelRenderer OttoneE;
    ModelRenderer OttoneF;
    ModelRenderer OttoneG;
    ModelRenderer OttoneH;
    ModelRenderer OttoneI;
    ModelRenderer OttoneJ;
    ModelRenderer OttoneK;
    ModelRenderer OttoneL;
    ModelRenderer OttoneM;
  
  public ModelLampadaOlceseRicci()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      Lampada = new ModelRenderer(this, 0, 0);
      Lampada.addBox(0F, 0F, 0F, 6, 1, 3);
      Lampada.setRotationPoint(-3F, 22F, -1.5F);
      Lampada.setTextureSize(64, 32);
      Lampada.mirror = true;
      setRotation(Lampada, 0F, 0F, 0F);
      OttoneA = new ModelRenderer(this, 0, 7);
      OttoneA.addBox(0F, 0F, 0F, 8, 1, 1);
      OttoneA.setRotationPoint(-4F, 23F, -2.5F);
      OttoneA.setTextureSize(64, 32);
      OttoneA.mirror = true;
      setRotation(OttoneA, 0F, 0F, 0F);
      OttoneB = new ModelRenderer(this, 0, 7);
      OttoneB.addBox(0F, 0F, 0F, 8, 1, 1);
      OttoneB.setRotationPoint(-4F, 23F, 1.5F);
      OttoneB.setTextureSize(64, 32);
      OttoneB.mirror = true;
      setRotation(OttoneB, 0F, 0F, 0F);
      OttoneC = new ModelRenderer(this, 22, 0);
      OttoneC.addBox(0F, 0F, 0F, 1, 1, 3);
      OttoneC.setRotationPoint(-4F, 23F, -1.5F);
      OttoneC.setTextureSize(64, 32);
      OttoneC.mirror = true;
      setRotation(OttoneC, 0F, 0F, 0F);
      OttoneD = new ModelRenderer(this, 22, 0);
      OttoneD.addBox(0F, 0F, 0F, 1, 1, 3);
      OttoneD.setRotationPoint(3F, 23F, -1.5F);
      OttoneD.setTextureSize(64, 32);
      OttoneD.mirror = true;
      setRotation(OttoneD, 0F, 0F, 0F);
      OttoneE = new ModelRenderer(this, 0, 12);
      OttoneE.addBox(0F, 0F, 0F, 1, 1, 4);
      OttoneE.setRotationPoint(-2F, 21F, -2F);
      OttoneE.setTextureSize(64, 32);
      OttoneE.mirror = true;
      setRotation(OttoneE, 0F, 0F, 0F);
      OttoneF = new ModelRenderer(this, 0, 12);
      OttoneF.addBox(0F, 0F, 0F, 1, 1, 4);
      OttoneF.setRotationPoint(1F, 21F, -2F);
      OttoneF.setTextureSize(64, 32);
      OttoneF.mirror = true;
      setRotation(OttoneF, 0F, 0F, 0F);
      OttoneG = new ModelRenderer(this, 0, 21);
      OttoneG.addBox(0F, 0F, 0F, 7, 1, 1);
      OttoneG.setRotationPoint(-3.5F, 21F, -0.5F);
      OttoneG.setTextureSize(64, 32);
      OttoneG.mirror = true;
      setRotation(OttoneG, 0F, 0F, 0F);
      OttoneH = new ModelRenderer(this, 0, 26);
      OttoneH.addBox(0F, 0F, 0F, 1, 1, 1);
      OttoneH.setRotationPoint(-2F, 22F, -2.3F);
      OttoneH.setTextureSize(64, 32);
      OttoneH.mirror = true;
      setRotation(OttoneH, 0F, 0F, 0F);
      OttoneI = new ModelRenderer(this, 0, 26);
      OttoneI.addBox(0F, 0F, 0F, 1, 1, 1);
      OttoneI.setRotationPoint(-2F, 22F, 1.266667F);
      OttoneI.setTextureSize(64, 32);
      OttoneI.mirror = true;
      setRotation(OttoneI, 0F, 0F, 0F);
      OttoneJ = new ModelRenderer(this, 0, 26);
      OttoneJ.addBox(0F, 0F, 0F, 1, 1, 1);
      OttoneJ.setRotationPoint(1F, 22F, -2.3F);
      OttoneJ.setTextureSize(64, 32);
      OttoneJ.mirror = true;
      setRotation(OttoneJ, 0F, 0F, 0F);
      OttoneK = new ModelRenderer(this, 0, 26);
      OttoneK.addBox(0F, 0F, 0F, 1, 1, 1);
      OttoneK.setRotationPoint(1F, 22F, 1.266667F);
      OttoneK.setTextureSize(64, 32);
      OttoneK.mirror = true;
      setRotation(OttoneK, 0F, 0F, 0F);
      OttoneL = new ModelRenderer(this, 0, 26);
      OttoneL.addBox(0F, 0F, 0F, 1, 1, 1);
      OttoneL.setRotationPoint(-3.7F, 22F, -0.5F);
      OttoneL.setTextureSize(64, 32);
      OttoneL.mirror = true;
      setRotation(OttoneL, 0F, 0F, 0F);
      OttoneM = new ModelRenderer(this, 0, 26);
      OttoneM.addBox(0F, 0F, 0F, 1, 1, 1);
      OttoneM.setRotationPoint(2.7F, 22F, -0.5F);
      OttoneM.setTextureSize(64, 32);
      OttoneM.mirror = true;
      setRotation(OttoneM, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Lampada.render(f5);
    OttoneA.render(f5);
    OttoneB.render(f5);
    OttoneC.render(f5);
    OttoneD.render(f5);
    OttoneE.render(f5);
    OttoneF.render(f5);
    OttoneG.render(f5);
    OttoneH.render(f5);
    OttoneI.render(f5);
    OttoneJ.render(f5);
    OttoneK.render(f5);
    OttoneL.render(f5);
    OttoneM.render(f5);
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