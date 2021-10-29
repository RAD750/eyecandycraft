package eyecandycraft.main.solid.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelAtariST extends ModelBase {
	// fields
	ModelRenderer base;
	ModelRenderer piedino;
	ModelRenderer schermo;
	ModelRenderer tastiera;
	ModelRenderer mouse;

	public ModelAtariST() {
		textureWidth = 64;
		textureHeight = 32;

		base = new ModelRenderer(this, 0, 15);
		base.addBox(0F, 0F, 0F, 8, 1, 5);
		base.setRotationPoint(-4F, 23F, -7F);
		base.setTextureSize(64, 32);
		base.mirror = true;
		setRotation(base, 0F, 0F, 0F);
		piedino = new ModelRenderer(this, 0, 12);
		piedino.addBox(0F, 0F, 0F, 2, 2, 1);
		piedino.setRotationPoint(-1F, 21F, -5F);
		piedino.setTextureSize(64, 32);
		piedino.mirror = true;
		setRotation(piedino, 0F, 0F, 0F);
		schermo = new ModelRenderer(this, 0, 21);
		schermo.addBox(0F, 0F, 0F, 14, 10, 1);
		schermo.setRotationPoint(-7F, 11F, -5F);
		schermo.setTextureSize(64, 32);
		schermo.mirror = true;
		setRotation(schermo, 0F, 0F, 0F);
		tastiera = new ModelRenderer(this, 0, 5);
		tastiera.addBox(0F, 0F, 0F, 11, 1, 5);
		tastiera.setRotationPoint(-4F, 23F, 0F);
		tastiera.setTextureSize(64, 32);
		tastiera.mirror = true;
		setRotation(tastiera, 0F, 0F, 0F);
		mouse = new ModelRenderer(this, 0, 0);
		mouse.addBox(0F, 0F, 0F, 2, 1, 3);
		mouse.setRotationPoint(-7F, 23F, 1F);
		mouse.setTextureSize(64, 32);
		mouse.mirror = true;
		setRotation(mouse, 0F, 0F, 0F);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		base.render(f5);
		piedino.render(f5);
		schermo.render(f5);
		tastiera.render(f5);
		mouse.render(f5);
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