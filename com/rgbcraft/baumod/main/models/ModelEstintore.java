package com.rgbcraft.baumod.main.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelEstintore extends ModelBase {
	  //fields
    ModelRenderer Serbatoioo;
    ModelRenderer Valvola;
    ModelRenderer Supporto;
    ModelRenderer Base;
    ModelRenderer Testa;
    ModelRenderer Cima;
    ModelRenderer Maniglia;
  
  public ModelEstintore()
  {
    textureWidth = 32;
    textureHeight = 32;
    
      Serbatoioo = new ModelRenderer(this, 0, 0);
      Serbatoioo.addBox(0F, 0F, 0F, 4, 9, 4);
      Serbatoioo.setRotationPoint(-2F, 13F, 3F);
      Serbatoioo.setTextureSize(64, 32);
      Serbatoioo.mirror = true;
      setRotation(Serbatoioo, 0F, 0F, 0F);
      Valvola = new ModelRenderer(this, 0, 19);
      Valvola.addBox(0F, 0F, 0F, 3, 1, 1);
      Valvola.setRotationPoint(-0.5F, 10F, 4.5F);
      Valvola.setTextureSize(64, 32);
      Valvola.mirror = true;
      setRotation(Valvola, 0F, 0F, -0.6981317F);
      Supporto = new ModelRenderer(this, 11, 19);
      Supporto.addBox(0F, 0F, 0F, 1, 1, 1);
      Supporto.setRotationPoint(-0.5F, 13F, 7F);
      Supporto.setTextureSize(64, 32);
      Supporto.mirror = true;
      setRotation(Supporto, 0F, 0F, 0F);
      Base = new ModelRenderer(this, 0, 23);
      Base.addBox(0F, 0F, 0F, 3, 1, 3);
      Base.setRotationPoint(-1.5F, 22F, 3.5F);
      Base.setTextureSize(64, 32);
      Base.mirror = true;
      setRotation(Base, 0F, 0F, 0F);
      Testa = new ModelRenderer(this, 11, 15);
      Testa.addBox(0F, 0F, 0F, 1, 1, 1);
      Testa.setRotationPoint(-0.5F, 11F, 4.5F);
      Testa.setTextureSize(64, 32);
      Testa.mirror = true;
      setRotation(Testa, 0F, 0F, 0F);
      Cima = new ModelRenderer(this, 0, 23);
      Cima.addBox(0F, 0F, 0F, 3, 1, 3);
      Cima.setRotationPoint(-1.5F, 12F, 3.5F);
      Cima.setTextureSize(64, 32);
      Cima.mirror = true;
      setRotation(Cima, 0F, 0F, 0F);
      Maniglia = new ModelRenderer(this, 0, 15);
      Maniglia.addBox(0F, 0F, 0F, 4, 1, 1);
      Maniglia.setRotationPoint(-1.5F, 10F, 4.5F);
      Maniglia.setTextureSize(64, 32);
      Maniglia.mirror = true;
      setRotation(Maniglia, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Serbatoioo.render(f5);
    Valvola.render(f5);
    Supporto.render(f5);
    Base.render(f5);
    Testa.render(f5);
    Cima.render(f5);
    Maniglia.render(f5);
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