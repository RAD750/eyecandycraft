package eyecandycraft.main.solid.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelPaloScaletta extends ModelBase {
	//fields
    ModelRenderer Palo;
    ModelRenderer Grad1;
    ModelRenderer Grad2;
    ModelRenderer Grad3;
    ModelRenderer Grad4;
    ModelRenderer Grad5;
    ModelRenderer Grad6;
    ModelRenderer Grad7;
  
  public ModelPaloScaletta()
  {
    textureWidth = 32;
    textureHeight = 32;
    
      Palo = new ModelRenderer(this, 0, 0);
      Palo.addBox(0F, 0F, 0F, 4, 16, 4);
      Palo.setRotationPoint(-2F, 8F, -2F);
      Palo.setTextureSize(32, 32);
      Palo.mirror = true;
      setRotation(Palo, 0F, 0F, 0F);
      Grad1 = new ModelRenderer(this, 17, 0);
      Grad1.addBox(0F, 0F, 0F, 1, 16, 1);
      Grad1.setRotationPoint(-4F, 8F, -0.5F);
      Grad1.setTextureSize(32, 32);
      Grad1.mirror = true;
      setRotation(Grad1, 0F, 0F, 0F);
      Grad2 = new ModelRenderer(this, 0, 21);
      Grad2.addBox(0F, 0F, 0F, 1, 1, 3);
      Grad2.setRotationPoint(-4F, 13F, -3.5F);
      Grad2.setTextureSize(32, 32);
      Grad2.mirror = true;
      setRotation(Grad2, 0F, 0F, 0F);
      Grad3 = new ModelRenderer(this, 0, 21);
      Grad3.addBox(0F, 0F, 0F, 1, 1, 3);
      Grad3.setRotationPoint(-4F, 17F, 0.5F);
      Grad3.setTextureSize(32, 32);
      Grad3.mirror = true;
      setRotation(Grad3, 0F, 0F, 0F);
      Grad4 = new ModelRenderer(this, 0, 21);
      Grad4.addBox(0F, 0F, 0F, 1, 1, 3);
      Grad4.setRotationPoint(-4F, 9F, 0.5F);
      Grad4.setTextureSize(32, 32);
      Grad4.mirror = true;
      setRotation(Grad4, 0F, 0F, 0F);
      Grad5 = new ModelRenderer(this, 0, 21);
      Grad5.addBox(0F, 0F, 0F, 1, 1, 3);
      Grad5.setRotationPoint(-4F, 21F, -3.5F);
      Grad5.setTextureSize(32, 32);
      Grad5.mirror = true;
      setRotation(Grad5, 0F, 0F, 0F);
      Grad6 = new ModelRenderer(this, 12, 22);
      Grad6.addBox(0F, 0F, 0F, 1, 1, 1);
      Grad6.setRotationPoint(-3F, 21F, -0.5F);
      Grad6.setTextureSize(32, 32);
      Grad6.mirror = true;
      setRotation(Grad6, 0F, 0F, 0F);
      Grad7 = new ModelRenderer(this, 12, 22);
      Grad7.addBox(0F, 0F, 0F, 1, 1, 1);
      Grad7.setRotationPoint(-3F, 10F, -0.5F);
      Grad7.setTextureSize(32, 32);
      Grad7.mirror = true;
      setRotation(Grad7, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Palo.render(f5);
    Grad1.render(f5);
    Grad2.render(f5);
    Grad3.render(f5);
    Grad4.render(f5);
    Grad5.render(f5);
    Grad6.render(f5);
    Grad7.render(f5);
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
