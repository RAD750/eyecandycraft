package eyecandycraft.main.solid.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelNeon extends ModelBase {
	//fields
    ModelRenderer Base;
    ModelRenderer NeonB;
    ModelRenderer Supp1B;
    ModelRenderer Supp2B;
    ModelRenderer Supp1A;
    ModelRenderer NeonA;
    ModelRenderer Supp2A;
  
  public ModelNeon()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      Base = new ModelRenderer(this, 0, 4);
      Base.addBox(0F, 0F, 0F, 16, 1, 3);
      Base.setRotationPoint(-8F, 8F, -1.5F);
      Base.setTextureSize(64, 32);
      Base.mirror = true;
      setRotation(Base, 0F, 0F, 0F);
      NeonB = new ModelRenderer(this, 0, 0);
      NeonB.addBox(0F, 0F, 0F, 14, 1, 1);
      NeonB.setRotationPoint(-7F, 10F, 0.5F);
      NeonB.setTextureSize(64, 32);
      NeonB.mirror = true;
      setRotation(NeonB, 0F, 0F, 0F);
      Supp1B = new ModelRenderer(this, 35, 10);
      Supp1B.addBox(0F, 0F, 0F, 1, 2, 1);
      Supp1B.setRotationPoint(7F, 9F, 0.5F);
      Supp1B.setTextureSize(64, 32);
      Supp1B.mirror = true;
      setRotation(Supp1B, 0F, 0F, 0F);
      Supp2B = new ModelRenderer(this, 35, 10);
      Supp2B.addBox(0F, 0F, 0F, 1, 2, 1);
      Supp2B.setRotationPoint(-8F, 9F, 0.5F);
      Supp2B.setTextureSize(64, 32);
      Supp2B.mirror = true;
      setRotation(Supp2B, 0F, 0F, 0F);
      Supp1A = new ModelRenderer(this, 35, 10);
      Supp1A.addBox(0F, 0F, 0F, 1, 2, 1);
      Supp1A.setRotationPoint(7F, 9F, -1.5F);
      Supp1A.setTextureSize(64, 32);
      Supp1A.mirror = true;
      setRotation(Supp1A, 0F, 0F, 0F);
      NeonA = new ModelRenderer(this, 0, 0);
      NeonA.addBox(0F, 0F, 0F, 14, 1, 1);
      NeonA.setRotationPoint(-7F, 10F, -1.5F);
      NeonA.setTextureSize(64, 32);
      NeonA.mirror = true;
      setRotation(NeonA, 0F, 0F, 0F);
      Supp2A = new ModelRenderer(this, 35, 10);
      Supp2A.addBox(0F, 0F, 0F, 1, 2, 1);
      Supp2A.setRotationPoint(-8F, 9F, -1.5F);
      Supp2A.setTextureSize(64, 32);
      Supp2A.mirror = true;
      setRotation(Supp2A, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Base.render(f5);
    NeonB.render(f5);
    Supp1B.render(f5);
    Supp2B.render(f5);
    Supp1A.render(f5);
    NeonA.render(f5);
    Supp2A.render(f5);
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