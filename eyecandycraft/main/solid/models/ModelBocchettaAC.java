package eyecandycraft.main.solid.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelBocchettaAC extends ModelBase {

	  //fields
	    ModelRenderer esterno;
	    ModelRenderer esterno1;
	    ModelRenderer esterno2;
	    ModelRenderer Al1;
	    ModelRenderer Al2;
	    ModelRenderer Al3;
	    ModelRenderer Al4;
	    ModelRenderer Al5;
	    ModelRenderer Al6;
	    ModelRenderer Al7;
	    ModelRenderer Al8;
	    ModelRenderer Al9;
	    ModelRenderer Al10;
	    ModelRenderer Al11;
	    ModelRenderer Al12;
	    ModelRenderer Al13;
	  
	  public ModelBocchettaAC()
	  {
	    textureWidth = 32;
	    textureHeight = 32;
	    
	      esterno = new ModelRenderer(this, 0, 0);
	      esterno.addBox(0F, 0F, 0F, 15, 1, 1);
	      esterno.setRotationPoint(-7F, 8F, 7F);
	      esterno.setTextureSize(32, 32);
	      esterno.mirror = true;
	      setRotation(esterno, 0F, 0F, 0F);
	      esterno1 = new ModelRenderer(this, 0, 0);
	      esterno1.addBox(0F, 0F, 0F, 15, 1, 1);
	      esterno1.setRotationPoint(-7F, 8F, 8F);
	      esterno1.setTextureSize(32, 32);
	      esterno1.mirror = true;
	      setRotation(esterno1, 0F, 1.58825F, 0F);
	      esterno2 = new ModelRenderer(this, 0, 0);
	      esterno2.addBox(0F, 0F, 0F, 15, 1, 1);
	      esterno2.setRotationPoint(-7F, 8F, -7F);
	      esterno2.setTextureSize(32, 32);
	      esterno2.mirror = true;
	      setRotation(esterno2, 0F, 0F, 0F);
	      Al1 = new ModelRenderer(this, 0, 0);
	      Al1.addBox(0F, 0F, 0F, 15, 1, 1);
	      Al1.setRotationPoint(7F, 8F, 8F);
	      Al1.setTextureSize(32, 32);
	      Al1.mirror = true;
	      setRotation(Al1, 0F, 1.570796F, 0F);
	      Al2 = new ModelRenderer(this, 0, 10);
	      Al2.addBox(0.5F, 0F, 0F, 1, 0, 13);
	      Al2.setRotationPoint(6F, 8F, -6F);
	      Al2.setTextureSize(32, 32);
	      Al2.mirror = true;
	      setRotation(Al2, 0F, 0F, 0.7853982F);
	      Al3 = new ModelRenderer(this, 0, 10);
	      Al3.addBox(0F, 0F, 0F, 13, 0, 1);
	      Al3.setRotationPoint(-6F, 9F, -6F);
	      Al3.setTextureSize(32, 32);
	      Al3.mirror = true;
	      setRotation(Al3, 0.7853982F, 0F, 0F);
	      Al4 = new ModelRenderer(this, 0, 10);
	      Al4.addBox(0F, 0F, 0F, 1, 0, 13);
	      Al4.setRotationPoint(-6F, 9F, -6F);
	      Al4.setTextureSize(32, 32);
	      Al4.mirror = true;
	      setRotation(Al4, 0F, 0F, -0.7853982F);
	      Al5 = new ModelRenderer(this, 0, 10);
	      Al5.addBox(0F, -0.7F, -0.2F, 13, 0, 1);
	      Al5.setRotationPoint(-6F, 9F, 6F);
	      Al5.setTextureSize(32, 32);
	      Al5.mirror = true;
	      setRotation(Al5, -0.7853982F, 0F, 0F);
	      Al6 = new ModelRenderer(this, 0, 10);
	      Al6.addBox(0F, 0F, 0F, 1, 0, 9);
	      Al6.setRotationPoint(4F, 8F, -4F);
	      Al6.setTextureSize(32, 32);
	      Al6.mirror = true;
	      setRotation(Al6, 0F, 0F, 0.7853982F);
	      Al7 = new ModelRenderer(this, 0, 10);
	      Al7.addBox(0F, 0F, 0F, 1, 0, 9);
	      Al7.setRotationPoint(-4F, 9F, -4F);
	      Al7.setTextureSize(32, 32);
	      Al7.mirror = true;
	      setRotation(Al7, 0F, 0F, -0.7853982F);
	      Al8 = new ModelRenderer(this, 0, 10);
	      Al8.addBox(0F, 0F, 0F, 9, 0, 1);
	      Al8.setRotationPoint(-4F, 9F, -4F);
	      Al8.setTextureSize(32, 32);
	      Al8.mirror = true;
	      setRotation(Al8, 0.7853982F, 0F, 0F);
	      Al9 = new ModelRenderer(this, 0, 10);
	      Al9.addBox(0F, 0F, 0F, 9, 0, 1);
	      Al9.setRotationPoint(-4F, 8F, 4F);
	      Al9.setTextureSize(32, 32);
	      Al9.mirror = true;
	      setRotation(Al9, -0.7853982F, 0F, 0F);
	      Al10 = new ModelRenderer(this, 0, 10);
	      Al10.addBox(0F, 0F, 0F, 1, 0, 5);
	      Al10.setRotationPoint(-2F, 9F, -2F);
	      Al10.setTextureSize(32, 32);
	      Al10.mirror = true;
	      setRotation(Al10, 0F, 0F, -0.7853982F);
	      Al11 = new ModelRenderer(this, 0, 24);
	      Al11.addBox(0F, 0F, 0F, 1, 0, 5);
	      Al11.setRotationPoint(2F, 8F, -2F);
	      Al11.setTextureSize(32, 32);
	      Al11.mirror = true;
	      setRotation(Al11, 0F, 0F, 0.7853982F);
	      Al12 = new ModelRenderer(this, 0, 10);
	      Al12.addBox(0F, 0F, 0F, 5, 0, 1);
	      Al12.setRotationPoint(-2F, 8F, 2F);
	      Al12.setTextureSize(32, 32);
	      Al12.mirror = true;
	      setRotation(Al12, -0.7853982F, 0F, 0F);
	      Al13 = new ModelRenderer(this, 0, 24);
	      Al13.addBox(0F, 0F, 0F, 5, 0, 1);
	      Al13.setRotationPoint(-2F, 9F, -2F);
	      Al13.setTextureSize(32, 32);
	      Al13.mirror = true;
	      setRotation(Al13, 0.7853982F, 0F, 0F);
	  }
	  
	  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	  {
	    super.render(entity, f, f1, f2, f3, f4, f5);
	    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
	    esterno.render(f5);
	    esterno1.render(f5);
	    esterno2.render(f5);
	    Al1.render(f5);
	    Al2.render(f5);
	    Al3.render(f5);
	    Al4.render(f5);
	    Al5.render(f5);
	    Al6.render(f5);
	    Al7.render(f5);
	    Al8.render(f5);
	    Al9.render(f5);
	    Al10.render(f5);
	    Al11.render(f5);
	    Al12.render(f5);
	    Al13.render(f5);
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
