package eyecandycraft.main.solid.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelTrussBridge extends ModelBase {
	private final ModelRenderer bb_main;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;

	public ModelTrussBridge() {
		textureWidth = 128;
		textureHeight = 128;

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 64, -10.0F, -16.0F, -7.0F, 2, 3, 14, 0.0F));
		bb_main.cubeList.add(new ModelBox(bb_main, 20, 60, -6.0F, 0.0F, -8.0F, 2, 2, 16, 0.0F));
		bb_main.cubeList.add(new ModelBox(bb_main, 56, 62, 8.0F, -16.0F, -7.0F, 2, 3, 14, 0.0F));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 21, 8.0F, -16.0F, -8.0F, 2, 15, 1, 0.0F));
		bb_main.cubeList.add(new ModelBox(bb_main, 46, 44, 4.0F, 0.0F, -8.0F, 2, 2, 16, 0.0F));
		bb_main.cubeList.add(new ModelBox(bb_main, 23, 21, 5.0F, 1.0F, -8.0F, 3, 3, 16, 0.0F));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 44, -10.0F, -1.0F, -8.0F, 2, 4, 16, 0.0F));
		bb_main.cubeList.add(new ModelBox(bb_main, 26, 40, 8.0F, -1.0F, -8.0F, 2, 4, 16, 0.0F));
		bb_main.cubeList.add(new ModelBox(bb_main, 12, 0, -10.0F, -16.0F, -8.0F, 2, 15, 1, 0.0F));
		bb_main.cubeList.add(new ModelBox(bb_main, 23, 0, -8.0F, 1.0F, -8.0F, 3, 3, 16, 0.0F));
		bb_main.cubeList.add(new ModelBox(bb_main, 65, 0, -5.0F, 1.5F, 6.0F, 10, 2, 2, 0.0F));
		bb_main.cubeList.add(new ModelBox(bb_main, 40, 62, -5.0F, 1.5F, -8.0F, 10, 2, 2, 0.0F));
		bb_main.cubeList.add(new ModelBox(bb_main, 6, 0, 8.0F, -16.0F, 7.0F, 2, 15, 1, 0.0F));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -10.0F, -16.0F, 7.0F, 2, 15, 1, 0.0F));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(12.0F, -6.0F, 0.0F);
		bb_main.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.7854F, 1.5708F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -2.0F, 2.0F, -10.5F, 2, 2, 19, 0.0F));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		bb_main.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.7854F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 45, 3, -1.0F, 1.5F, -8.0F, 2, 2, 16, 0.0F));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-6.0F, -6.0F, 0.0F);
		bb_main.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.7854F, 1.5708F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 21, -1.75F, 2.0F, -10.5F, 2, 2, 19, 0.0F));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
		bb_main.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, -0.7854F, 0.0F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 46, 24, -1.0F, 1.5F, -8.0F, 2, 2, 16, 0.0F));
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