package eyecandycraft.main.solid.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelAntennaVDipole extends ModelBase {
	//fields
    ModelRenderer Base;
    ModelRenderer Palo;
    ModelRenderer Dipole2;
    ModelRenderer Ampli;
    ModelRenderer Dipole1;
  
  public ModelAntennaVDipole()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      Base = new ModelRenderer(this, 0, 0);
      Base.addBox(0F, 0F, 0F, 4, 1, 4);
      Base.setRotationPoint(-2F, 23F, -2F);
      Base.setTextureSize(64, 32);
      Base.mirror = true;
      setRotation(Base, 0F, 0F, 0F);
      Palo = new ModelRenderer(this, 17, 0);
      Palo.addBox(0F, 0F, 0F, 1, 16, 1);
      Palo.setRotationPoint(-0.5F, 7F, -0.5F);
      Palo.setTextureSize(64, 32);
      Palo.mirror = true;
      setRotation(Palo, 0F, 0F, 0F);
      Dipole2 = new ModelRenderer(this, 0, 22);
      Dipole2.addBox(0F, 0F, 0F, 9, 1, 1);
      Dipole2.setRotationPoint(-1F, 5F, 0F);
      Dipole2.setTextureSize(64, 32);
      Dipole2.mirror = true;
      setRotation(Dipole2, 0F, 1.047198F, 0F);
      Ampli = new ModelRenderer(this, 54, 27);
      Ampli.addBox(0F, 0F, 0F, 1, 3, 2);
      Ampli.setRotationPoint(-1.533333F, 5F, -1F);
      Ampli.setTextureSize(64, 32);
      Ampli.mirror = true;
      setRotation(Ampli, 0F, 0F, 0F);
      Dipole1 = new ModelRenderer(this, 0, 22);
      Dipole1.addBox(0F, 0F, 0F, 9, 1, 1);
      Dipole1.setRotationPoint(0F, 5F, 0F);
      Dipole1.setTextureSize(64, 32);
      Dipole1.mirror = true;
      setRotation(Dipole1, 0F, -1.047198F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Base.render(f5);
    Palo.render(f5);
    Dipole2.render(f5);
    Ampli.render(f5);
    Dipole1.render(f5);
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