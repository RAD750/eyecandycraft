package eyecandycraft.main.models;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;
import org.lwjgl.opengl.GL11;

public class RenderTableTraliccioBraccettoSat extends TileEntitySpecialRenderer {
	private ModelTraliccioBraccettoSat TraliccioBraccettoSat;

	public RenderTableTraliccioBraccettoSat() {
		TraliccioBraccettoSat = new ModelTraliccioBraccettoSat();
	}

	public void renderTileEntityAt(TileEntity var1, double x, double y, double z, float scale) {
		GL11.glPushMatrix();
		GL11.glTranslated(x + 0.5D, y + 1.5D, z + 0.5D);
		GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
		GL11.glRotatef(-90.0F, 0.0F, 1.0F, 0.0F);
		bindTextureByName("/eyecandycraft/textures/Traliccio.png");
		TraliccioBraccettoSat.render((Entity) null, 0.0F, -0.1F, 0.0F, 0.0F, 0.0F, 0.0625F);
		GL11.glPopMatrix();
	}
}