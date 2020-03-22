package com.rgbcraft.baumod.main.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelParabolaSat extends ModelBase {
	ModelRenderer BraccettoA;
	ModelRenderer BraccettoB;
	ModelRenderer Piatto;
	ModelRenderer BraccettoLNB;
	ModelRenderer PortaLNB;
	ModelRenderer LNB;

	public ModelParabolaSat() {
		textureWidth = 64;
		textureHeight = 32;

		BraccettoA = new ModelRenderer(this, 0, 0);
		BraccettoA.addBox(0F, 0F, 0F, 4, 1, 1);
		BraccettoA.setRotationPoint(-8F, 21F, 0F);
		BraccettoA.setTextureSize(64, 32);
		BraccettoA.mirror = true;
		setRotation(BraccettoA, 0F, 0F, 0F);
		BraccettoB = new ModelRenderer(this, 10, 0);
		BraccettoB.addBox(0F, 0F, 0F, 1, 7, 1);
		BraccettoB.setRotationPoint(-4F, 15F, 0F);
		BraccettoB.setTextureSize(64, 32);
		BraccettoB.mirror = true;
		setRotation(BraccettoB, 0F, 0F, 0F);
		Piatto = new ModelRenderer(this, 14, 0);
		Piatto.addBox(0F, 0F, 0F, 1, 9, 9);
		Piatto.setRotationPoint(-6F, 9F, 0.5F);
		Piatto.setTextureSize(64, 32);
		Piatto.mirror = true;
		setRotation(Piatto, -0.7853982F, 0F, -0.4363323F);
		BraccettoLNB = new ModelRenderer(this, 13, 19);
		BraccettoLNB.addBox(0F, 0F, 0F, 9, 1, 1);
		BraccettoLNB.setRotationPoint(-1F, 20F, 0F);
		BraccettoLNB.setTextureSize(64, 32);
		BraccettoLNB.mirror = true;
		setRotation(BraccettoLNB, 0F, 0F, -0.6283185F);
		PortaLNB = new ModelRenderer(this, 0, 10);
		PortaLNB.addBox(0F, 0F, 0F, 1, 3, 1);
		PortaLNB.setRotationPoint(6F, 13F, 0F);
		PortaLNB.setTextureSize(64, 32);
		PortaLNB.mirror = true;
		setRotation(PortaLNB, 0F, 0F, 0F);
		LNB = new ModelRenderer(this, 0, 24);
		LNB.addBox(0F, 0F, 0F, 1, 1, 1);
		LNB.setRotationPoint(5F, 13F, 0F);
		LNB.setTextureSize(64, 32);
		LNB.mirror = true;
		setRotation(LNB, 0F, 0F, 0F);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		BraccettoA.render(f5);
		BraccettoB.render(f5);
		Piatto.render(f5);
		BraccettoLNB.render(f5);
		PortaLNB.render(f5);
		LNB.render(f5);
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
