package eyecandycraft.main.solid.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 5.0.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class ModelEstintoreAuto extends ModelBase {
	ModelRenderer bb_main;

	public ModelEstintoreAuto() {
		textureWidth = 64;
		textureHeight = 64;

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.cubeList.add(new ModelBox(bb_main, 16, 42, -1.0F, 2.0F, -1.0F, 2, 1, 2, 0.0F));
		bb_main.cubeList.add(new ModelBox(bb_main, 32, 42, -0.5F, 0.0F, -0.5F, 1, 2, 1, 0.0F));
		bb_main.cubeList.add(new ModelBox(bb_main, 40, 43, -1.5F, 0.5F, -0.5F, 1, 1, 1, 0.0F));
		bb_main.cubeList.add(new ModelBox(bb_main, 24, 42, -1.0F, -1.0F, -1.0F, 2, 1, 2, 0.0F));
		bb_main.cubeList.add(new ModelBox(bb_main, 40, 38, -2.0F, -2.0F, -2.0F, 4, 1, 4, 0.0F));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -6.0F, -12.0F, -6.0F, 12, 8, 12, 0.0F));
		bb_main.cubeList.add(new ModelBox(bb_main, 27, 51, -4.0F, -3.0F, -4.0F, 8, 1, 8, 0.0F));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 20, -5.0F, -4.0F, -5.0F, 10, 1, 10, 0.0F));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 42, -2.0F, -15.0F, -2.0F, 4, 1, 4, 0.0F));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 47, -4.0F, -14.0F, -4.0F, 8, 1, 8, 0.0F));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 31, -5.0F, -13.0F, -5.0F, 10, 1, 10, 0.0F));
		bb_main.cubeList.add(new ModelBox(bb_main, 36, 42, -0.5F, -17.0F, -0.5F, 1, 2, 1, 0.0F));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		bb_main.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
