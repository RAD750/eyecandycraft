package eyecandycraft.main.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelTraliccioBraccettoSat extends ModelBase {
	  //fields
    ModelRenderer Palo1;
    ModelRenderer Palo2;
    ModelRenderer Palo3;
    ModelRenderer Palo4;
    ModelRenderer CB1C;
    ModelRenderer CB1D;
    ModelRenderer CB1A;
    ModelRenderer CB1B;
    ModelRenderer CB2B;
    ModelRenderer CB2D;
    ModelRenderer CB2A;
    ModelRenderer CB4B;
    ModelRenderer CB2C;
    ModelRenderer CB4A;
    ModelRenderer CB4C;
    ModelRenderer CB4D;
    ModelRenderer CB3C;
    ModelRenderer CB3B;
    ModelRenderer CB3A;
    ModelRenderer CB3D;
    ModelRenderer Braccetto;
    ModelRenderer SupportoA;
    ModelRenderer SupportoB;
  
  public ModelTraliccioBraccettoSat()
  {
    textureWidth = 32;
    textureHeight = 32;
    
      Palo1 = new ModelRenderer(this, 0, 0);
      Palo1.addBox(0F, 0F, 0F, 1, 16, 1);
      Palo1.setRotationPoint(-2F, 8F, 1F);
      Palo1.setTextureSize(64, 32);
      Palo1.mirror = true;
      setRotation(Palo1, 0F, 0F, 0F);
      Palo2 = new ModelRenderer(this, 0, 0);
      Palo2.addBox(0F, 0F, 0F, 1, 16, 1);
      Palo2.setRotationPoint(1F, 8F, 1F);
      Palo2.setTextureSize(64, 32);
      Palo2.mirror = true;
      setRotation(Palo2, 0F, 0F, 0F);
      Palo3 = new ModelRenderer(this, 0, 0);
      Palo3.addBox(0F, 0F, 0F, 1, 16, 1);
      Palo3.setRotationPoint(1F, 8F, -2F);
      Palo3.setTextureSize(64, 32);
      Palo3.mirror = true;
      setRotation(Palo3, 0F, 0F, 0F);
      Palo4 = new ModelRenderer(this, 0, 0);
      Palo4.addBox(0F, 0F, 0F, 1, 16, 1);
      Palo4.setRotationPoint(-2F, 8F, -2F);
      Palo4.setTextureSize(64, 32);
      Palo4.mirror = true;
      setRotation(Palo4, 0F, 0F, 0F);
      CB1C = new ModelRenderer(this, 15, 0);
      CB1C.addBox(0F, 0F, 0F, 1, 4, 1);
      CB1C.setRotationPoint(-2F, 17F, -1.7F);
      CB1C.setTextureSize(64, 32);
      CB1C.mirror = true;
      setRotation(CB1C, 0.7853982F, 0F, 0F);
      CB1D = new ModelRenderer(this, 15, 0);
      CB1D.addBox(0F, 0F, 0F, 1, 4, 1);
      CB1D.setRotationPoint(-2F, 20F, 1F);
      CB1D.setTextureSize(64, 32);
      CB1D.mirror = true;
      setRotation(CB1D, -0.7853982F, 0F, 0F);
      CB1A = new ModelRenderer(this, 15, 0);
      CB1A.addBox(0F, 0F, 0F, 1, 4, 1);
      CB1A.setRotationPoint(-2F, 9F, -1.7F);
      CB1A.setTextureSize(64, 32);
      CB1A.mirror = true;
      setRotation(CB1A, 0.7853982F, 0F, 0F);
      CB1B = new ModelRenderer(this, 15, 0);
      CB1B.addBox(0F, 0F, 0F, 1, 4, 1);
      CB1B.setRotationPoint(-2F, 12F, 1F);
      CB1B.setTextureSize(64, 32);
      CB1B.mirror = true;
      setRotation(CB1B, -0.7853982F, 0F, 0F);
      CB2B = new ModelRenderer(this, 7, 0);
      CB2B.addBox(0F, 0F, 0F, 1, 4, 1);
      CB2B.setRotationPoint(1F, 12F, 1F);
      CB2B.setTextureSize(64, 32);
      CB2B.mirror = true;
      setRotation(CB2B, -0.7853982F, 0F, 0F);
      CB2D = new ModelRenderer(this, 7, 0);
      CB2D.addBox(0F, 0F, 0F, 1, 4, 1);
      CB2D.setRotationPoint(1F, 20F, 1F);
      CB2D.setTextureSize(64, 32);
      CB2D.mirror = true;
      setRotation(CB2D, -0.7853982F, 0F, 0F);
      CB2A = new ModelRenderer(this, 7, 0);
      CB2A.addBox(0F, 0F, 0F, 1, 4, 1);
      CB2A.setRotationPoint(1F, 9F, -1.7F);
      CB2A.setTextureSize(64, 32);
      CB2A.mirror = true;
      setRotation(CB2A, 0.7853982F, 0F, 0F);
      CB4B = new ModelRenderer(this, 0, 18);
      CB4B.addBox(0F, 0F, 0F, 4, 1, 1);
      CB4B.setRotationPoint(-1F, 16.2F, 1F);
      CB4B.setTextureSize(64, 32);
      CB4B.mirror = true;
      setRotation(CB4B, 0F, 0F, 0.7853982F);
      CB2C = new ModelRenderer(this, 15, 0);
      CB2C.addBox(0F, 0F, 0F, 1, 4, 1);
      CB2C.setRotationPoint(1F, 17F, -1.7F);
      CB2C.setTextureSize(64, 32);
      CB2C.mirror = true;
      setRotation(CB2C, 0.7853982F, 0F, 0F);
      CB4A = new ModelRenderer(this, 0, 18);
      CB4A.addBox(0F, 0F, 0F, 4, 1, 1);
      CB4A.setRotationPoint(-1.7F, 23F, 1F);
      CB4A.setTextureSize(64, 32);
      CB4A.mirror = true;
      setRotation(CB4A, 0F, 0F, -0.7853982F);
      CB4C = new ModelRenderer(this, 0, 18);
      CB4C.addBox(0F, 0F, 0F, 4, 1, 1);
      CB4C.setRotationPoint(-1.7F, 15F, 1F);
      CB4C.setTextureSize(64, 32);
      CB4C.mirror = true;
      setRotation(CB4C, 0F, 0F, -0.7853982F);
      CB4D = new ModelRenderer(this, 0, 18);
      CB4D.addBox(0F, 0F, 0F, 4, 1, 1);
      CB4D.setRotationPoint(-1F, 8.2F, 1F);
      CB4D.setTextureSize(64, 32);
      CB4D.mirror = true;
      setRotation(CB4D, 0F, 0F, 0.7853982F);
      CB3C = new ModelRenderer(this, 0, 18);
      CB3C.addBox(0F, 0F, 0F, 4, 1, 1);
      CB3C.setRotationPoint(-1.7F, 15F, -2F);
      CB3C.setTextureSize(64, 32);
      CB3C.mirror = true;
      setRotation(CB3C, 0F, 0F, -0.7853982F);
      CB3B = new ModelRenderer(this, 0, 18);
      CB3B.addBox(0F, 0F, 0F, 4, 1, 1);
      CB3B.setRotationPoint(-1F, 16.2F, -2F);
      CB3B.setTextureSize(64, 32);
      CB3B.mirror = true;
      setRotation(CB3B, 0F, 0F, 0.7853982F);
      CB3A = new ModelRenderer(this, 0, 18);
      CB3A.addBox(0F, 0F, 0F, 4, 1, 1);
      CB3A.setRotationPoint(-1.7F, 23F, -2F);
      CB3A.setTextureSize(64, 32);
      CB3A.mirror = true;
      setRotation(CB3A, 0F, 0F, -0.7853982F);
      CB3D = new ModelRenderer(this, 0, 18);
      CB3D.addBox(0F, 0F, 0F, 4, 1, 1);
      CB3D.setRotationPoint(-1F, 8.2F, -2F);
      CB3D.setTextureSize(64, 32);
      CB3D.mirror = true;
      setRotation(CB3D, 0F, 0F, 0.7853982F);
      Braccetto = new ModelRenderer(this, 0, 21);
      Braccetto.addBox(0F, 0F, 0F, 5, 1, 1);
      Braccetto.setRotationPoint(3F, 21F, -0.5F);
      Braccetto.setTextureSize(64, 32);
      Braccetto.mirror = true;
      setRotation(Braccetto, 0F, 0F, 0F);
      SupportoA = new ModelRenderer(this, 0, 24);
      SupportoA.addBox(0F, 0F, 0F, 1, 3, 3);
      SupportoA.setRotationPoint(2F, 20F, -1.5F);
      SupportoA.setTextureSize(64, 32);
      SupportoA.mirror = true;
      setRotation(SupportoA, 0F, 0F, 0F);
      SupportoB = new ModelRenderer(this, 0, 24);
      SupportoB.addBox(0F, 0F, 0F, 1, 3, 3);
      SupportoB.setRotationPoint(7F, 20F, -1.5F);
      SupportoB.setTextureSize(64, 32);
      SupportoB.mirror = true;
      setRotation(SupportoB, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Palo1.render(f5);
    Palo2.render(f5);
    Palo3.render(f5);
    Palo4.render(f5);
    CB1C.render(f5);
    CB1D.render(f5);
    CB1A.render(f5);
    CB1B.render(f5);
    CB2B.render(f5);
    CB2D.render(f5);
    CB2A.render(f5);
    CB4B.render(f5);
    CB2C.render(f5);
    CB4A.render(f5);
    CB4C.render(f5);
    CB4D.render(f5);
    CB3C.render(f5);
    CB3B.render(f5);
    CB3A.render(f5);
    CB3D.render(f5);
    Braccetto.render(f5);
    SupportoA.render(f5);
    SupportoB.render(f5);
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