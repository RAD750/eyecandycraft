package eyecandycraft.main.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelAntennaSettore900MHz extends ModelBase {
	// fields
	ModelRenderer Palo;
	ModelRenderer SettA;
	ModelRenderer SuppA1;
	ModelRenderer SuppA2;
	ModelRenderer SuppB1;
	ModelRenderer SettB;
	ModelRenderer SuppB2;
	ModelRenderer SettC;
	ModelRenderer SuppC1;
	ModelRenderer SuppC2;
	ModelRenderer SettD;
	ModelRenderer SuppD1;
	ModelRenderer SuppD2;

	public ModelAntennaSettore900MHz() {
		textureWidth = 64;
		textureHeight = 32;

		Palo = new ModelRenderer(this, 0, 0);
		Palo.addBox(0F, 0F, 0F, 4, 16, 4);
		Palo.setRotationPoint(-2F, 8F, -2F);
		Palo.setTextureSize(64, 32);
		Palo.mirror = true;
		setRotation(Palo, 0F, 0F, 0F);
		SettA = new ModelRenderer(this, 30, 0);
		SettA.addBox(0F, 0F, 0F, 1, 22, 4);
		SettA.setRotationPoint(7F, 2F, -2F);
		SettA.setTextureSize(64, 32);
		SettA.mirror = true;
		setRotation(SettA, 0F, 0F, 0.1745329F);
		SuppA1 = new ModelRenderer(this, 0, 25);
		SuppA1.addBox(0F, 0F, 0F, 4, 1, 2);
		SuppA1.setRotationPoint(2F, 10F, -1F);
		SuppA1.setTextureSize(64, 32);
		SuppA1.mirror = true;
		setRotation(SuppA1, 0F, 0F, 0F);
		SuppA2 = new ModelRenderer(this, 12, 25);
		SuppA2.addBox(0F, 0F, 0F, 3, 1, 2);
		SuppA2.setRotationPoint(2F, 18F, -1F);
		SuppA2.setTextureSize(64, 32);
		SuppA2.mirror = true;
		setRotation(SuppA2, 0F, 0F, 0F);
		SuppB1 = new ModelRenderer(this, 0, 25);
		SuppB1.addBox(0F, 0F, 0F, 4, 1, 2);
		SuppB1.setRotationPoint(-1F, 10F, -2F);
		SuppB1.setTextureSize(64, 32);
		SuppB1.mirror = true;
		setRotation(SuppB1, 0F, 1.570796F, 0F);
		SettB = new ModelRenderer(this, 30, 0);
		SettB.addBox(0F, 0F, 0F, 4, 22, 1);
		SettB.setRotationPoint(-2F, 2F, -8F);
		SettB.setTextureSize(64, 32);
		SettB.mirror = true;
		setRotation(SettB, 0.1745329F, 0F, 0F);
		SuppB2 = new ModelRenderer(this, 12, 25);
		SuppB2.addBox(0F, 0F, 0F, 3, 1, 2);
		SuppB2.setRotationPoint(-1F, 18F, -2F);
		SuppB2.setTextureSize(64, 32);
		SuppB2.mirror = true;
		setRotation(SuppB2, 0F, 1.570796F, 0F);
		SettC = new ModelRenderer(this, 30, 0);
		SettC.addBox(0F, 0F, 0F, 1, 22, 4);
		SettC.setRotationPoint(-7F, 2F, 2F);
		SettC.setTextureSize(64, 32);
		SettC.mirror = true;
		setRotation(SettC, 0F, 3.141593F, -0.1745329F);
		SuppC1 = new ModelRenderer(this, 12, 25);
		SuppC1.addBox(0F, 0F, 0F, 3, 1, 2);
		SuppC1.setRotationPoint(-2F, 18F, 1F);
		SuppC1.setTextureSize(64, 32);
		SuppC1.mirror = true;
		setRotation(SuppC1, 0F, 3.141593F, 0F);
		SuppC2 = new ModelRenderer(this, 0, 25);
		SuppC2.addBox(0F, 0F, 0F, 4, 1, 2);
		SuppC2.setRotationPoint(-6F, 10F, -1F);
		SuppC2.setTextureSize(64, 32);
		SuppC2.mirror = true;
		setRotation(SuppC2, 0F, 0F, 0F);
		SettD = new ModelRenderer(this, 30, 0);
		SettD.addBox(0F, 0F, 0F, 4, 22, 1);
		SettD.setRotationPoint(2F, 2F, 7F);
		SettD.setTextureSize(64, 32);
		SettD.mirror = true;
		setRotation(SettD, 0.1F, 3.141593F, 0F);
		SuppD1 = new ModelRenderer(this, 0, 25);
		SuppD1.addBox(0F, 0F, 0F, 4, 1, 2);
		SuppD1.setRotationPoint(-1F, 10F, 6F);
		SuppD1.setTextureSize(64, 32);
		SuppD1.mirror = true;
		setRotation(SuppD1, 0F, 1.570796F, 0F);
		SuppD2 = new ModelRenderer(this, 12, 25);
		SuppD2.addBox(0F, 0F, 0F, 3, 1, 2);
		SuppD2.setRotationPoint(-1F, 18F, 5F);
		SuppD2.setTextureSize(64, 32);
		SuppD2.mirror = true;
		setRotation(SuppD2, 0F, 1.570796F, 0F);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		Palo.render(f5);
		SettA.render(f5);
		SuppA1.render(f5);
		SuppA2.render(f5);
		SuppB1.render(f5);
		SettB.render(f5);
		SuppB2.render(f5);
		SettC.render(f5);
		SuppC1.render(f5);
		SuppC2.render(f5);
		SettD.render(f5);
		SuppD1.render(f5);
		SuppD2.render(f5);
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