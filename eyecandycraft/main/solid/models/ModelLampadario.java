package eyecandycraft.main.solid.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelLampadario extends ModelBase {
	// fields
	ModelRenderer Sospensione;
	ModelRenderer Paralume1;
	ModelRenderer Paralume2A;
	ModelRenderer Paralume2B;
	ModelRenderer Paralume2C;
	ModelRenderer Paralume2D;
	ModelRenderer Lampadina;

	public ModelLampadario() {
		textureWidth = 32;
		textureHeight = 32;

		Sospensione = new ModelRenderer(this, 18, 0);
		Sospensione.addBox(0F, 0F, 0F, 1, 10, 1);
		Sospensione.setRotationPoint(-0.5F, 8F, -0.5F);
		Sospensione.setTextureSize(32, 32);
		Sospensione.mirror = true;
		setRotation(Sospensione, 0F, 0F, 0F);
		Paralume1 = new ModelRenderer(this, 0, 0);
		Paralume1.addBox(0F, 0F, 0F, 4, 1, 4);
		Paralume1.setRotationPoint(-2F, 18F, -2F);
		Paralume1.setTextureSize(32, 32);
		Paralume1.mirror = true;
		setRotation(Paralume1, 0F, 0F, 0F);
		Paralume2A = new ModelRenderer(this, 15, 23);
		Paralume2A.addBox(0F, 0F, 0F, 6, 1, 1);
		Paralume2A.setRotationPoint(-3F, 19F, -3F);
		Paralume2A.setTextureSize(32, 32);
		Paralume2A.mirror = true;
		setRotation(Paralume2A, 0F, 0F, 0F);
		Paralume2B = new ModelRenderer(this, 15, 23);
		Paralume2B.addBox(0F, 0F, 0F, 6, 1, 1);
		Paralume2B.setRotationPoint(-3F, 19F, 2F);
		Paralume2B.setTextureSize(32, 32);
		Paralume2B.mirror = true;
		setRotation(Paralume2B, 0F, 0F, 0F);
		Paralume2C = new ModelRenderer(this, 0, 21);
		Paralume2C.addBox(0F, 0F, 0F, 1, 1, 4);
		Paralume2C.setRotationPoint(-3F, 19F, -2F);
		Paralume2C.setTextureSize(32, 32);
		Paralume2C.mirror = true;
		setRotation(Paralume2C, 0F, 0F, 0F);
		Paralume2D = new ModelRenderer(this, 0, 21);
		Paralume2D.addBox(0F, 0F, 0F, 1, 1, 4);
		Paralume2D.setRotationPoint(2F, 19F, -2F);
		Paralume2D.setTextureSize(32, 32);
		Paralume2D.mirror = true;
		setRotation(Paralume2D, 0F, 0F, 0F);
		Lampadina = new ModelRenderer(this, 0, 7);
		Lampadina.addBox(0F, 0F, 0F, 2, 2, 2);
		Lampadina.setRotationPoint(-1F, 19F, -1F);
		Lampadina.setTextureSize(32, 32);
		Lampadina.mirror = true;
		setRotation(Lampadina, 0F, 0F, 0F);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		Sospensione.render(f5);
		Paralume1.render(f5);
		Paralume2A.render(f5);
		Paralume2B.render(f5);
		Paralume2C.render(f5);
		Paralume2D.render(f5);
		Lampadina.render(f5);
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