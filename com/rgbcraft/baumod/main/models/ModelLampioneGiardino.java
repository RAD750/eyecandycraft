package com.rgbcraft.baumod.main.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelLampioneGiardino extends ModelBase {
	//fields
    ModelRenderer Lampione;
    ModelRenderer Tappo;
    ModelRenderer Stelo;
  
  public ModelLampioneGiardino()
  {
    textureWidth = 32;
    textureHeight = 32;
    
      Lampione = new ModelRenderer(this, 0, 0);
      Lampione.addBox(0F, 0F, 0F, 2, 3, 2);
      Lampione.setRotationPoint(-1F, 10F, -1F);
      Lampione.setTextureSize(32, 32);
      Lampione.mirror = true;
      setRotation(Lampione, 0F, 0F, 0F);
      Tappo = new ModelRenderer(this, 10, 0);
      Tappo.addBox(0F, 0F, 0F, 3, 1, 3);
      Tappo.setRotationPoint(-1.5F, 9F, -1.5F);
      Tappo.setTextureSize(32, 32);
      Tappo.mirror = true;
      setRotation(Tappo, 0F, 0F, 0F);
      Stelo = new ModelRenderer(this, 25, 0);
      Stelo.addBox(0F, 0F, 0F, 1, 11, 1);
      Stelo.setRotationPoint(-0.5F, 13F, -0.5F);
      Stelo.setTextureSize(32, 32);
      Stelo.mirror = true;
      setRotation(Stelo, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Lampione.render(f5);
    Tappo.render(f5);
    Stelo.render(f5);
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