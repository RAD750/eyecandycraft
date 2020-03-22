package com.rgbcraft.baumod.main.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelAntennaLogperiodica extends ModelBase {
	// fields
	ModelRenderer Base;
	ModelRenderer Palo;
	ModelRenderer Boom;
	ModelRenderer Direttore2;
	ModelRenderer Direttore1;
	ModelRenderer Direttore3;
	ModelRenderer Direttore4;
	ModelRenderer Direttore5;
	ModelRenderer Direttore6;
	ModelRenderer Ampli;
	ModelRenderer Direttore7;
	ModelRenderer Direttore8;

	public ModelAntennaLogperiodica() {
		textureWidth = 64;
		textureHeight = 32;

		Base = new ModelRenderer(this, 0, 0);
		Base.addBox(0F, 0F, 0F, 4, 1, 4);
		Base.setRotationPoint(-2F, 23F, -2F);
		Base.setTextureSize(64, 32);
		Base.mirror = true;
		setRotation(Base, 0F, 0F, 0F);
		Palo = new ModelRenderer(this, 17, 0);
		Palo.addBox(0F, 0F, 0F, 1, 18, 1);
		Palo.setRotationPoint(-0.5F, 5F, -0.5F);
		Palo.setTextureSize(64, 32);
		Palo.mirror = true;
		setRotation(Palo, 0F, 0F, 0F);
		Boom = new ModelRenderer(this, 0, 22);
		Boom.addBox(0F, 0F, 0F, 16, 1, 1);
		Boom.setRotationPoint(0.5F, 7F, -0.5F);
		Boom.setTextureSize(64, 32);
		Boom.mirror = true;
		setRotation(Boom, 0F, 0F, 0F);
		Direttore2 = new ModelRenderer(this, 30, 0);
		Direttore2.addBox(0F, 0F, 0F, 1, 1, 3);
		Direttore2.setRotationPoint(16F, 7F, -1.5F);
		Direttore2.setTextureSize(64, 32);
		Direttore2.mirror = true;
		setRotation(Direttore2, 0F, 0F, 0F);
		Direttore1 = new ModelRenderer(this, 30, 0);
		Direttore1.addBox(0F, 0F, 0F, 1, 1, 4);
		Direttore1.setRotationPoint(14F, 7F, -2F);
		Direttore1.setTextureSize(64, 32);
		Direttore1.mirror = true;
		setRotation(Direttore1, 0F, 0F, 0F);
		Direttore3 = new ModelRenderer(this, 30, 0);
		Direttore3.addBox(0F, 0F, 0F, 1, 1, 6);
		Direttore3.setRotationPoint(10F, 7F, -3F);
		Direttore3.setTextureSize(64, 32);
		Direttore3.mirror = true;
		setRotation(Direttore3, 0F, 0F, 0F);
		Direttore4 = new ModelRenderer(this, 30, 0);
		Direttore4.addBox(0F, 0F, 0F, 1, 1, 5);
		Direttore4.setRotationPoint(12F, 7F, -2.5F);
		Direttore4.setTextureSize(64, 32);
		Direttore4.mirror = true;
		setRotation(Direttore4, 0F, 0F, 0F);
		Direttore5 = new ModelRenderer(this, 30, 0);
		Direttore5.addBox(0F, 0F, 0F, 1, 1, 7);
		Direttore5.setRotationPoint(8F, 7F, -3.5F);
		Direttore5.setTextureSize(64, 32);
		Direttore5.mirror = true;
		setRotation(Direttore5, 0F, 0F, 0F);
		Direttore6 = new ModelRenderer(this, 30, 0);
		Direttore6.addBox(0F, 0F, 0F, 1, 1, 9);
		Direttore6.setRotationPoint(6F, 7F, -4.5F);
		Direttore6.setTextureSize(64, 32);
		Direttore6.mirror = true;
		setRotation(Direttore6, 0F, 0F, 0F);
		Ampli = new ModelRenderer(this, 54, 28);
		Ampli.addBox(0F, 0F, 0F, 2, 3, 1);
		Ampli.setRotationPoint(-1F, 13F, 0.5F);
		Ampli.setTextureSize(64, 32);
		Ampli.mirror = true;
		setRotation(Ampli, 0F, 0F, 0F);
		Direttore7 = new ModelRenderer(this, 30, 0);
		Direttore7.addBox(0F, 0F, 0F, 1, 1, 12);
		Direttore7.setRotationPoint(4F, 7F, -6F);
		Direttore7.setTextureSize(64, 32);
		Direttore7.mirror = true;
		setRotation(Direttore7, 0F, 0F, 0F);
		Direttore8 = new ModelRenderer(this, 30, 0);
		Direttore8.addBox(0F, 0F, 0F, 1, 1, 14);
		Direttore8.setRotationPoint(2F, 7F, -7F);
		Direttore8.setTextureSize(64, 32);
		Direttore8.mirror = true;
		setRotation(Direttore8, 0F, 0F, 0F);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		Base.render(f5);
		Palo.render(f5);
		Boom.render(f5);
		Direttore2.render(f5);
		Direttore1.render(f5);
		Direttore3.render(f5);
		Direttore4.render(f5);
		Direttore5.render(f5);
		Direttore6.render(f5);
		Ampli.render(f5);
		Direttore7.render(f5);
		Direttore8.render(f5);
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