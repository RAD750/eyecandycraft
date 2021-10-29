package eyecandycraft.main.solid.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelAntennaGroundPlane extends ModelBase {
	// fields
	ModelRenderer Base;
	ModelRenderer Palo;
	ModelRenderer Int;
	ModelRenderer Gp1;
	ModelRenderer Ant;
	ModelRenderer Gp2;
	ModelRenderer Gp3;
	ModelRenderer Gp4;

	public ModelAntennaGroundPlane() {
		textureWidth = 64;
		textureHeight = 32;

		Base = new ModelRenderer(this, 5, 3);
		Base.addBox(0F, 0F, 0F, 4, 1, 4);
		Base.setRotationPoint(-2F, 23F, -2F);
		Base.setTextureSize(64, 32);
		Base.mirror = true;
		setRotation(Base, 0F, 0F, 0F);
		Palo = new ModelRenderer(this, 0, 0);
		Palo.addBox(0F, 0F, 0F, 1, 14, 1);
		Palo.setRotationPoint(-0.5F, 9F, -0.5F);
		Palo.setTextureSize(64, 32);
		Palo.mirror = true;
		setRotation(Palo, 0F, 0F, 0F);
		Int = new ModelRenderer(this, 24, 4);
		Int.addBox(0F, 0F, 0F, 2, 1, 2);
		Int.setRotationPoint(-1F, 8F, -1F);
		Int.setTextureSize(64, 32);
		Int.mirror = true;
		setRotation(Int, 0F, 0F, 0F);
		Gp1 = new ModelRenderer(this, 24, 10);
		Gp1.addBox(0F, 0F, 0F, 10, 1, 1);
		Gp1.setRotationPoint(1F, 8F, -0.5F);
		Gp1.setTextureSize(64, 32);
		Gp1.mirror = true;
		setRotation(Gp1, 0F, 0F, 0.7853982F);
		Ant = new ModelRenderer(this, 50, 0);
		Ant.addBox(0F, 0F, 0F, 1, 10, 1);
		Ant.setRotationPoint(-0.5F, -2F, -0.5F);
		Ant.setTextureSize(64, 32);
		Ant.mirror = true;
		setRotation(Ant, 0F, 0F, 0F);
		Gp2 = new ModelRenderer(this, 24, 10);
		Gp2.addBox(0F, 0F, 0F, 1, 10, 1);
		Gp2.setRotationPoint(-1F, 8F, -0.5F);
		Gp2.setTextureSize(64, 32);
		Gp2.mirror = true;
		setRotation(Gp2, 0F, 0F, 0.7853982F);
		Gp3 = new ModelRenderer(this, 24, 10);
		Gp3.addBox(0F, 0F, 0F, 1, 1, 10);
		Gp3.setRotationPoint(-0.5F, 8F, 1F);
		Gp3.setTextureSize(64, 32);
		Gp3.mirror = true;
		setRotation(Gp3, -0.7853982F, 0F, 0F);
		Gp4 = new ModelRenderer(this, 24, 10);
		Gp4.addBox(0F, 0F, 0F, 1, 10, 1);
		Gp4.setRotationPoint(-0.5F, 8F, -1F);
		Gp4.setTextureSize(64, 32);
		Gp4.mirror = true;
		setRotation(Gp4, -0.7853982F, 0F, 0F);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		Base.render(f5);
		Palo.render(f5);
		Int.render(f5);
		Gp1.render(f5);
		Ant.render(f5);
		Gp2.render(f5);
		Gp3.render(f5);
		Gp4.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
	}

}