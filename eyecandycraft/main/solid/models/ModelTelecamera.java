package eyecandycraft.main.solid.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelTelecamera extends ModelBase {
	 //fields
	//fields
    ModelRenderer Corpo;
    ModelRenderer Lente;
    ModelRenderer Obiettivo;
    ModelRenderer Mic;
    ModelRenderer SuppMic;
    ModelRenderer Viewf1;
    ModelRenderer Viewf2;
    ModelRenderer Puls;
    ModelRenderer Maniglia1;
    ModelRenderer Maniglia2;
    ModelRenderer Maniglia3;
  
  public ModelTelecamera()
  {
    textureWidth = 32;
    textureHeight = 32;
    
      Corpo = new ModelRenderer(this, 0, 0);
      Corpo.addBox(0F, 0F, 0F, 8, 5, 4);
      Corpo.setRotationPoint(-4F, 19F, -2F);
      Corpo.setTextureSize(32, 32);
      Corpo.mirror = true;
      setRotation(Corpo, 0F, 0F, 0F);
      Lente = new ModelRenderer(this, 24, 10);
      Lente.addBox(0F, 0F, 0F, 1, 3, 3);
      Lente.setRotationPoint(7F, 19.5F, -1.5F);
      Lente.setTextureSize(32, 32);
      Lente.mirror = true;
      setRotation(Lente, 0F, 0F, 0F);
      Obiettivo = new ModelRenderer(this, 0, 10);
      Obiettivo.addBox(0F, 0F, 0F, 3, 2, 2);
      Obiettivo.setRotationPoint(4F, 20F, -1F);
      Obiettivo.setTextureSize(32, 32);
      Obiettivo.mirror = true;
      setRotation(Obiettivo, 0F, 0F, 0F);
      Mic = new ModelRenderer(this, 0, 16);
      Mic.addBox(0F, 0F, 0F, 6, 1, 1);
      Mic.setRotationPoint(2F, 16F, -0.5F);
      Mic.setTextureSize(32, 32);
      Mic.mirror = true;
      setRotation(Mic, 0F, 0F, 0F);
      SuppMic = new ModelRenderer(this, 0, 19);
      SuppMic.addBox(0F, 0F, 0F, 1, 2, 1);
      SuppMic.setRotationPoint(3F, 17F, -0.5F);
      SuppMic.setTextureSize(32, 32);
      SuppMic.mirror = true;
      setRotation(SuppMic, 0F, 0F, 0F);
      Viewf1 = new ModelRenderer(this, 0, 23);
      Viewf1.addBox(0F, 0F, 0F, 1, 1, 3);
      Viewf1.setRotationPoint(3F, 18F, 1F);
      Viewf1.setTextureSize(32, 32);
      Viewf1.mirror = true;
      setRotation(Viewf1, 0F, 0F, 0F);
      Viewf2 = new ModelRenderer(this, 0, 28);
      Viewf2.addBox(0F, 0F, 0F, 1, 2, 2);
      Viewf2.setRotationPoint(2F, 17.5F, 2.5F);
      Viewf2.setTextureSize(32, 32);
      Viewf2.mirror = true;
      setRotation(Viewf2, 0F, 0F, 0F);
      Puls = new ModelRenderer(this, 26, 0);
      Puls.addBox(0F, 0F, 0F, 2, 1, 1);
      Puls.setRotationPoint(-4F, 23F, 2F);
      Puls.setTextureSize(32, 32);
      Puls.mirror = true;
      setRotation(Puls, 0F, 0F, 0F);
      Maniglia1 = new ModelRenderer(this, 17, 10);
      Maniglia1.addBox(0F, 0F, 0F, 1, 1, 1);
      Maniglia1.setRotationPoint(-1F, 18F, -0.5F);
      Maniglia1.setTextureSize(32, 32);
      Maniglia1.mirror = true;
      setRotation(Maniglia1, 0F, 0F, 0F);
      Maniglia2 = new ModelRenderer(this, 17, 10);
      Maniglia2.addBox(0F, 0F, 0F, 1, 1, 1);
      Maniglia2.setRotationPoint(-4F, 18F, -0.5F);
      Maniglia2.setTextureSize(32, 32);
      Maniglia2.mirror = true;
      setRotation(Maniglia2, 0F, 0F, 0F);
      Maniglia3 = new ModelRenderer(this, 14, 30);
      Maniglia3.addBox(0F, 0F, 0F, 4, 1, 1);
      Maniglia3.setRotationPoint(-4F, 17F, -0.5F);
      Maniglia3.setTextureSize(32, 32);
      Maniglia3.mirror = true;
      setRotation(Maniglia3, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Corpo.render(f5);
    Lente.render(f5);
    Obiettivo.render(f5);
    Mic.render(f5);
    SuppMic.render(f5);
    Viewf1.render(f5);
    Viewf2.render(f5);
    Puls.render(f5);
    Maniglia1.render(f5);
    Maniglia2.render(f5);
    Maniglia3.render(f5);
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

