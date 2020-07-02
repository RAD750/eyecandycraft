package com.rgbcraft.baumod.main.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelScrivania extends ModelBase {

	  //fields
	    ModelRenderer GAMBA2;
	    ModelRenderer GAMBA1;
	    ModelRenderer GAMBA3;
	    ModelRenderer GAMBA4;
	    ModelRenderer top;
	    ModelRenderer Shape1;
	  
	  public ModelScrivania()
	  {
	    textureWidth = 128;
	    textureHeight = 32;
	    
	      GAMBA2 = new ModelRenderer(this, 0, 0);
	      GAMBA2.addBox(0F, 0F, 0F, 2, 15, 2);
	      GAMBA2.setRotationPoint(7F, 9F, 7F);
	      GAMBA2.setTextureSize(64, 32);
	      GAMBA2.mirror = true;
	      setRotation(GAMBA2, 0F, 0F, 0F);
	      GAMBA1 = new ModelRenderer(this, 0, 0);
	      GAMBA1.addBox(0F, 0F, 0F, 2, 15, 2);
	      GAMBA1.setRotationPoint(-9F, 9F, -9F);
	      GAMBA1.setTextureSize(64, 32);
	      GAMBA1.mirror = true;
	      setRotation(GAMBA1, 0F, 0F, 0F);
	      GAMBA3 = new ModelRenderer(this, 0, 0);
	      GAMBA3.addBox(0F, 0F, 0F, 2, 15, 2);
	      GAMBA3.setRotationPoint(7F, 9F, -9F);
	      GAMBA3.setTextureSize(64, 32);
	      GAMBA3.mirror = true;
	      setRotation(GAMBA3, 0F, 0F, 0F);
	      GAMBA4 = new ModelRenderer(this, 0, 0);
	      GAMBA4.addBox(0F, 0F, 0F, 2, 15, 2);
	      GAMBA4.setRotationPoint(-9F, 9F, 7F);
	      GAMBA4.setTextureSize(64, 32);
	      GAMBA4.mirror = true;
	      setRotation(GAMBA4, 0F, 0F, 0F);
	      top = new ModelRenderer(this, 17, 10);
	      top.addBox(0F, 0F, 0F, 20, 1, 20);
	      top.setRotationPoint(-10F, 8F, -10F);
	      top.setTextureSize(64, 32);
	      top.mirror = true;
	      setRotation(top, 0F, 0F, 0F);
	      Shape1 = new ModelRenderer(this, 28, 0);
	      Shape1.addBox(0F, 0F, 0F, 14, 8, 1);
	      Shape1.setRotationPoint(-7F, 9F, -9F);
	      Shape1.setTextureSize(64, 32);
	      Shape1.mirror = true;
	      setRotation(Shape1, 0F, 0F, 0F);
	  }
	  
	  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	  {
	    super.render(entity, f, f1, f2, f3, f4, f5);
	    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
	    GAMBA2.render(f5);
	    GAMBA1.render(f5);
	    GAMBA3.render(f5);
	    GAMBA4.render(f5);
	    top.render(f5);
	    Shape1.render(f5);
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
