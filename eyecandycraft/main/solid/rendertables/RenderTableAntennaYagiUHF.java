package eyecandycraft.main.solid.rendertables;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;
import org.lwjgl.opengl.GL11;

import eyecandycraft.main.blocks.Blocks;
import eyecandycraft.main.solid.models.ModelAntennaYagiUHF;

public class RenderTableAntennaYagiUHF extends TileEntitySpecialRenderer {
	private ModelAntennaYagiUHF AntennaYagiUHF;

	public RenderTableAntennaYagiUHF() {
		AntennaYagiUHF = new ModelAntennaYagiUHF();
	}

	public void renderTileEntityAt(TileEntity tileentity, double x, double y, double z, float scale) {
		int metadata = tileentity.getWorldObj().getBlockMetadata(tileentity.xCoord, tileentity.yCoord,
				tileentity.zCoord);

		int direction = 2;
		if (tileentity.getWorldObj().getBlockId(tileentity.xCoord, tileentity.yCoord,
				tileentity.zCoord) == Blocks.AntennaYagiUHF.blockID) {
			direction = tileentity.getWorldObj().getBlockMetadata(tileentity.xCoord, tileentity.yCoord,
					tileentity.zCoord) + 1;
			if (direction == 1) {
				direction = 3;
			} else if (direction == 3) {
				direction = 1;
			} else if (direction == 2) {
				direction = 4;
			} else if (direction == 4) {
				direction = 2;
			}
		}
		GL11.glPushMatrix();

		// GL11.glTranslated(x + 0.5D, y - 0.45D, z + 0.5D);
		GL11.glTranslated(x + 0.5D, y + 1.5D, z + 0.5D);

		GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);

		GL11.glRotatef(direction * 90, 0.0F, 1.0F, 0.0F);

		bindTextureByName("/eyecandycraft/textures/AntennaYagiUHF.png");
		AntennaYagiUHF.render((Entity) null, 0.0F, -0.1F, 0.0F, 0.0F, 0.0F, 0.0625F);

		GL11.glPopMatrix();
	}
}