package eyecandycraft.main.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelMicrofono extends ModelBase {
	 //fields
    ModelRenderer Base;
    ModelRenderer Stelo;
    ModelRenderer ForcellaA;
    ModelRenderer ForcellaB;
    ModelRenderer ForcellaC;
    ModelRenderer Mic;
  
  public ModelMicrofono()
  {
    textureWidth = 32;
    textureHeight = 32;
    
      Base = new ModelRenderer(this, 0, 0);
      Base.addBox(0F, 0F, 0F, 3, 1, 3);
      Base.setRotationPoint(-1.5F, 23F, -1.5F);
      Base.setTextureSize(32, 32);
      Base.mirror = true;
      setRotation(Base, 0F, 0F, 0F);
      Stelo = new ModelRenderer(this, 0, 6);
      Stelo.addBox(0F, 0F, 0F, 1, 5, 1);
      Stelo.setRotationPoint(-0.5F, 19F, -0.5F);
      Stelo.setTextureSize(32, 32);
      Stelo.mirror = true;
      setRotation(Stelo, 0F, 0F, 0F);
      ForcellaA = new ModelRenderer(this, 15, 0);
      ForcellaA.addBox(0F, 0F, 0F, 1, 1, 4);
      ForcellaA.setRotationPoint(-0.5F, 18F, -2F);
      ForcellaA.setTextureSize(32, 32);
      ForcellaA.mirror = true;
      setRotation(ForcellaA, 0F, 0F, 0F);
      ForcellaB = new ModelRenderer(this, 28, 0);
      ForcellaB.addBox(0F, 0F, 0F, 1, 3, 1);
      ForcellaB.setRotationPoint(-0.5F, 15F, -2F);
      ForcellaB.setTextureSize(32, 32);
      ForcellaB.mirror = true;
      setRotation(ForcellaB, 0F, 0F, 0F);
      ForcellaC = new ModelRenderer(this, 28, 0);
      ForcellaC.addBox(0F, 0F, 0F, 1, 3, 1);
      ForcellaC.setRotationPoint(-0.5F, 15F, 1F);
      ForcellaC.setTextureSize(32, 32);
      ForcellaC.mirror = true;
      setRotation(ForcellaC, 0F, 0F, 0F);
      Mic = new ModelRenderer(this, 15, 8);
      Mic.addBox(0F, 0F, 0F, 2, 3, 2);
      Mic.setRotationPoint(-1F, 14F, -1F);
      Mic.setTextureSize(32, 32);
      Mic.mirror = true;
      setRotation(Mic, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Base.render(f5);
    Stelo.render(f5);
    ForcellaA.render(f5);
    ForcellaB.render(f5);
    ForcellaC.render(f5);
    Mic.render(f5);
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

