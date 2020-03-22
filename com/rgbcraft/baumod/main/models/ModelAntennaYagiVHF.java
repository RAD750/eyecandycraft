package com.rgbcraft.baumod.main.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelAntennaYagiVHF extends ModelBase {
	// fields
	ModelRenderer Base;
	ModelRenderer Palo;
	ModelRenderer Boom;
	ModelRenderer Direttore1;
	ModelRenderer Direttore2;
	ModelRenderer Riflettore;
	ModelRenderer DipoloA;
	ModelRenderer Dpl1;
	ModelRenderer Dpl2;
	ModelRenderer DipoloB;
	ModelRenderer Ampli;

	public ModelAntennaYagiVHF() {
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
		Boom = new ModelRenderer(this, 5, 0);
		Boom.addBox(0F, 0F, 0F, 14, 1, 1);
		Boom.setRotationPoint(-7F, 8F, -0.5F);
		Boom.setTextureSize(64, 32);
		Boom.mirror = true;
		setRotation(Boom, 0F, 0F, 0F);
		Direttore1 = new ModelRenderer(this, 0, 17);
		Direttore1.addBox(0F, 0F, 0F, 1, 1, 14);
		Direttore1.setRotationPoint(-8F, 8F, -7F);
		Direttore1.setTextureSize(64, 32);
		Direttore1.mirror = true;
		setRotation(Direttore1, 0F, 0F, 0F);
		Direttore2 = new ModelRenderer(this, 0, 17);
		Direttore2.addBox(0F, 0F, 0F, 1, 1, 14);
		Direttore2.setRotationPoint(-3F, 8F, -7F);
		Direttore2.setTextureSize(64, 32);
		Direttore2.mirror = true;
		setRotation(Direttore2, 0F, 0F, 0F);
		Riflettore = new ModelRenderer(this, 0, 17);
		Riflettore.addBox(0F, 0F, 0F, 1, 1, 14);
		Riflettore.setRotationPoint(7F, 8F, -7F);
		Riflettore.setTextureSize(64, 32);
		Riflettore.mirror = true;
		setRotation(Riflettore, 0F, 0F, 0F);
		DipoloA = new ModelRenderer(this, 0, 17);
		DipoloA.addBox(0F, 0F, 0F, 1, 1, 14);
		DipoloA.setRotationPoint(2F, 7F, -7F);
		DipoloA.setTextureSize(64, 32);
		DipoloA.mirror = true;
		setRotation(DipoloA, 0F, 0F, 0F);
		Dpl1 = new ModelRenderer(this, 40, 0);
		Dpl1.addBox(0F, 0F, 0F, 1, 1, 1);
		Dpl1.setRotationPoint(2F, 8F, -7F);
		Dpl1.setTextureSize(64, 32);
		Dpl1.mirror = true;
		setRotation(Dpl1, 0F, 0F, 0F);
		Dpl2 = new ModelRenderer(this, 40, 0);
		Dpl2.addBox(0F, 0F, 0F, 1, 1, 1);
		Dpl2.setRotationPoint(2F, 8F, 6F);
		Dpl2.setTextureSize(64, 32);
		Dpl2.mirror = true;
		setRotation(Dpl2, 0F, 0F, 0F);
		DipoloB = new ModelRenderer(this, 0, 17);
		DipoloB.addBox(0F, 0F, 0F, 1, 1, 14);
		DipoloB.setRotationPoint(2F, 9F, -7F);
		DipoloB.setTextureSize(64, 32);
		DipoloB.mirror = true;
		setRotation(DipoloB, 0F, 0F, 0F);
		Ampli = new ModelRenderer(this, 58, 0);
		Ampli.addBox(0F, 0F, 0F, 2, 3, 1);
		Ampli.setRotationPoint(-1F, 13F, 0.5F);
		Ampli.setTextureSize(64, 32);
		Ampli.mirror = true;
		setRotation(Ampli, 0F, 0F, 0F);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		Base.render(f5);
		Palo.render(f5);
		Boom.render(f5);
		Direttore1.render(f5);
		Direttore2.render(f5);
		Riflettore.render(f5);
		DipoloA.render(f5);
		Dpl1.render(f5);
		Dpl2.render(f5);
		DipoloB.render(f5);
		Ampli.render(f5);
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