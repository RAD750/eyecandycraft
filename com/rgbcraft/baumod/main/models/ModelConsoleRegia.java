package com.rgbcraft.baumod.main.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelConsoleRegia extends ModelBase {
	 //fields
    ModelRenderer ConsoleRegia;
    ModelRenderer Manopola1;
    ModelRenderer Manopola2;
    ModelRenderer Manopola3;
    ModelRenderer Manopola4;
  
  public ModelConsoleRegia()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      ConsoleRegia = new ModelRenderer(this, 0, 0);
      ConsoleRegia.addBox(0F, 0F, 0F, 14, 2, 10);
      ConsoleRegia.setRotationPoint(-7F, 22F, -5F);
      ConsoleRegia.setTextureSize(64, 32);
      ConsoleRegia.mirror = true;
      setRotation(ConsoleRegia, 0F, 0F, 0F);
      Manopola1 = new ModelRenderer(this, 53, 0);
      Manopola1.addBox(0F, 0F, 0F, 1, 1, 1);
      Manopola1.setRotationPoint(-6F, 21F, 3F);
      Manopola1.setTextureSize(64, 32);
      Manopola1.mirror = true;
      setRotation(Manopola1, 0F, 0F, 0F);
      Manopola2 = new ModelRenderer(this, 53, 0);
      Manopola2.addBox(0F, 0F, 0F, 1, 1, 1);
      Manopola2.setRotationPoint(-6F, 21F, 1F);
      Manopola2.setTextureSize(64, 32);
      Manopola2.mirror = true;
      setRotation(Manopola2, 0F, 0F, 0F);
      Manopola3 = new ModelRenderer(this, 53, 0);
      Manopola3.addBox(0F, 0F, 0F, 1, 1, 1);
      Manopola3.setRotationPoint(-6F, 21F, -1F);
      Manopola3.setTextureSize(64, 32);
      Manopola3.mirror = true;
      setRotation(Manopola3, 0F, 0F, 0F);
      Manopola4 = new ModelRenderer(this, 53, 0);
      Manopola4.addBox(0F, 0F, 0F, 1, 1, 1);
      Manopola4.setRotationPoint(-6F, 21F, -3F);
      Manopola4.setTextureSize(64, 32);
      Manopola4.mirror = true;
      setRotation(Manopola4, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    ConsoleRegia.render(f5);
    Manopola1.render(f5);
    Manopola2.render(f5);
    Manopola3.render(f5);
    Manopola4.render(f5);
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