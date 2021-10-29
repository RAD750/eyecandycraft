package eyecandycraft.main.solid.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelAntennaYagiUHF extends ModelBase {
	// fields
	ModelRenderer Base;
	ModelRenderer Palo;
	ModelRenderer Boom;
	ModelRenderer PortaRiflettore;
	ModelRenderer Riflettore1;
	ModelRenderer Riflettore2;
	ModelRenderer Riflettore3;
	ModelRenderer Direttore2;
	ModelRenderer Direttore1;
	ModelRenderer Direttore3;
	ModelRenderer Direttore4;
	ModelRenderer Direttore5;
	ModelRenderer Direttore6;
	ModelRenderer Dipolo;
	ModelRenderer Shape1;

	public ModelAntennaYagiUHF() {
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
		PortaRiflettore = new ModelRenderer(this, 23, 3);
		PortaRiflettore.addBox(0F, 0F, 0F, 1, 5, 1);
		PortaRiflettore.setRotationPoint(1F, 5F, -0.5F);
		PortaRiflettore.setTextureSize(64, 32);
		PortaRiflettore.mirror = true;
		setRotation(PortaRiflettore, 0F, 0F, 0F);
		Riflettore1 = new ModelRenderer(this, 0, 11);
		Riflettore1.addBox(0F, 0F, 0F, 1, 1, 6);
		Riflettore1.setRotationPoint(1F, 10F, -3F);
		Riflettore1.setTextureSize(64, 32);
		Riflettore1.mirror = true;
		setRotation(Riflettore1, 0F, 0F, 0F);
		Riflettore2 = new ModelRenderer(this, 0, 11);
		Riflettore2.addBox(0F, 0F, 0F, 1, 1, 6);
		Riflettore2.setRotationPoint(1F, 4F, -3F);
		Riflettore2.setTextureSize(64, 32);
		Riflettore2.mirror = true;
		setRotation(Riflettore2, 0F, 0F, 0F);
		Riflettore3 = new ModelRenderer(this, 0, 11);
		Riflettore3.addBox(0F, 0F, 0F, 1, 1, 6);
		Riflettore3.setRotationPoint(1F, 7F, -3F);
		Riflettore3.setTextureSize(64, 32);
		Riflettore3.mirror = true;
		setRotation(Riflettore3, 0F, 0F, 0F);
		Direttore2 = new ModelRenderer(this, 30, 0);
		Direttore2.addBox(0F, 0F, 0F, 1, 1, 3);
		Direttore2.setRotationPoint(16F, 7F, -1.5F);
		Direttore2.setTextureSize(64, 32);
		Direttore2.mirror = true;
		setRotation(Direttore2, 0F, 0F, 0F);
		Direttore1 = new ModelRenderer(this, 30, 0);
		Direttore1.addBox(0F, 0F, 0F, 1, 1, 3);
		Direttore1.setRotationPoint(14F, 7F, -1.5F);
		Direttore1.setTextureSize(64, 32);
		Direttore1.mirror = true;
		setRotation(Direttore1, 0F, 0F, 0F);
		Direttore3 = new ModelRenderer(this, 30, 0);
		Direttore3.addBox(0F, 0F, 0F, 1, 1, 3);
		Direttore3.setRotationPoint(10F, 7F, -1.5F);
		Direttore3.setTextureSize(64, 32);
		Direttore3.mirror = true;
		setRotation(Direttore3, 0F, 0F, 0F);
		Direttore4 = new ModelRenderer(this, 30, 0);
		Direttore4.addBox(0F, 0F, 0F, 1, 1, 3);
		Direttore4.setRotationPoint(12F, 7F, -1.5F);
		Direttore4.setTextureSize(64, 32);
		Direttore4.mirror = true;
		setRotation(Direttore4, 0F, 0F, 0F);
		Direttore5 = new ModelRenderer(this, 30, 0);
		Direttore5.addBox(0F, 0F, 0F, 1, 1, 3);
		Direttore5.setRotationPoint(8F, 7F, -1.5F);
		Direttore5.setTextureSize(64, 32);
		Direttore5.mirror = true;
		setRotation(Direttore5, 0F, 0F, 0F);
		Direttore6 = new ModelRenderer(this, 30, 0);
		Direttore6.addBox(0F, 0F, 0F, 1, 1, 3);
		Direttore6.setRotationPoint(6F, 7F, -1.5F);
		Direttore6.setTextureSize(64, 32);
		Direttore6.mirror = true;
		setRotation(Direttore6, 0F, 0F, 0F);
		Dipolo = new ModelRenderer(this, 42, 0);
		Dipolo.addBox(0F, 0F, 0F, 1, 2, 3);
		Dipolo.setRotationPoint(3F, 6F, -1.5F);
		Dipolo.setTextureSize(64, 32);
		Dipolo.mirror = true;
		setRotation(Dipolo, 0F, 0F, 0F);
		Shape1 = new ModelRenderer(this, 54, 0);
		Shape1.addBox(0F, 0F, 0F, 2, 3, 1);
		Shape1.setRotationPoint(-1F, 13F, 0.5F);
		Shape1.setTextureSize(64, 32);
		Shape1.mirror = true;
		setRotation(Shape1, 0F, 0F, 0F);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		Base.render(f5);
		Palo.render(f5);
		Boom.render(f5);
		PortaRiflettore.render(f5);
		Riflettore1.render(f5);
		Riflettore2.render(f5);
		Riflettore3.render(f5);
		Direttore2.render(f5);
		Direttore1.render(f5);
		Direttore3.render(f5);
		Direttore4.render(f5);
		Direttore5.render(f5);
		Direttore6.render(f5);
		Dipolo.render(f5);
		Shape1.render(f5);
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