package eyecandycraft.main.solid.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelTrussBridgeAbutment extends ModelBase {
	private final ModelRenderer bb_main;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;

	public ModelTrussBridgeAbutment() {
		textureWidth = 128;
		textureHeight = 128;

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.cubeList.add(new ModelBox(bb_main, 56, 44, -6.0F, 0.0F, -2.0F, 2, 2, 10, 0.0F));
		bb_main.cubeList.add(new ModelBox(bb_main, 56, 37, -8.0F, 0.0F, -8.0F, 16, 1, 6, 0.0F));
		bb_main.cubeList.add(new ModelBox(bb_main, 24, 24, -8.0F, 1.0F, -8.0F, 3, 3, 16, 0.0F));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 60, -5.0F, 1.5F, 6.0F, 10, 2, 2, 0.0F));
		bb_main.cubeList.add(new ModelBox(bb_main, 22, 0, -5.0F, 1.5F, -8.0F, 10, 2, 2, 0.0F));
		bb_main.cubeList.add(new ModelBox(bb_main, 20, 43, 4.0F, 0.0F, -2.0F, 2, 2, 10, 0.0F));
		bb_main.cubeList.add(new ModelBox(bb_main, 24, 4, 5.0F, 1.0F, -8.0F, 3, 3, 16, 0.0F));
		bb_main.cubeList.add(new ModelBox(bb_main, 36, 43, -10.0F, -1.0F, -8.0F, 2, 4, 16, 0.0F));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 40, 8.0F, -1.0F, -8.0F, 2, 4, 16, 0.0F));
		bb_main.cubeList.add(new ModelBox(bb_main, 6, 0, -10.0F, -15.0F, 7.0F, 2, 14, 1, 0.0F));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 8.0F, -15.0F, 7.0F, 2, 14, 1, 0.0F));
		bb_main.cubeList.add(new ModelBox(bb_main, 12, 3, 8.0F, -15.0F, 6.0F, 2, 2, 1, 0.0F));
		bb_main.cubeList.add(new ModelBox(bb_main, 12, 0, -10.0F, -15.0F, 6.0F, 2, 2, 1, 0.0F));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(12.0F, -6.0F, 0.0F);
		bb_main.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, -0.7854F, 1.5708F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -1.0F, 2.0F, -8.0F, 2, 2, 18, 0.0F));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-6.0F, -6.0F, 0.0F);
		bb_main.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, -0.7854F, 1.5708F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 20, -1.0F, 2.0F, -8.0F, 2, 2, 18, 0.0F));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
		bb_main.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.7854F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 46, 0, -1.0F, 1.5F, -8.0F, 2, 2, 16, 0.0F));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
		bb_main.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, -0.7854F, 0.0F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 46, 18, -1.0F, 1.5F, -8.0F, 2, 2, 16, 0.0F));
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