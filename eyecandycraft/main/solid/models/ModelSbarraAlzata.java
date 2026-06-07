package eyecandycraft.main.solid.models;

import java.util.Random;

import eyecandycraft.main.entities.TileEntitySbarra;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelSbarraAlzata extends ModelBase {
	ModelRenderer cassa_1;
	ModelRenderer cassa_2;
	ModelRenderer perno;
	ModelRenderer sbarra;
	public static float sbarraAngle;


	public ModelSbarraAlzata() {
		
		this.sbarraAngle = 85.0F;
		super.textureWidth = 128;
		super.textureHeight = 128;
		
		(this.cassa_1 = new ModelRenderer((ModelBase)this, 0, 46)).addBox(-7.0F, -18.0F, -5.0F, 6, 18, 9, 0.0F);
		//(this.cassa_2 = new ModelRenderer((ModelBase)this, 31, 46)).addBox(-7.0F, -15.0F, 4.0F, 6, 15, 4, 0.0F);
		(this.perno = new ModelRenderer((ModelBase)this, 52, 46)).addBox(-1.0F, -17.0F, -1.0F, 1, 2, 2, 0.0F);
		(this.sbarra = new ModelRenderer((ModelBase)this, 0, 0)).addBox(0.0F, 0.0F, -2.0F, 1, 2, 43, 0.0F);
		this.sbarra.setRotationPoint(0.0F, -17.0F, -1.0F);
		
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {

		this.setRotationAngle(sbarra, (float)Math.toRadians(sbarraAngle), 0.0F, 0.0F);

		
		this.cassa_1.render(f5);
		//this.cassa_2.render(f5);
		this.perno.render(f5);
		this.sbarra.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}