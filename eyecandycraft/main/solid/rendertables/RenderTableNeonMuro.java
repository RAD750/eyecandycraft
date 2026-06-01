package eyecandycraft.main.solid.rendertables;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;
import org.lwjgl.opengl.GL11;

import eyecandycraft.main.blocks.Blocks;
import eyecandycraft.main.blocks.custom.NeonBlock;
import eyecandycraft.main.solid.models.ModelNeon;

public class RenderTableNeonMuro extends TileEntitySpecialRenderer {
	private ModelNeon Neon;

	public RenderTableNeonMuro() {
		Neon = new ModelNeon();
	}

	public void renderTileEntityAt(TileEntity tileentity, double x, double y, double z, float scale) {
		int metadata = tileentity.getWorldObj().getBlockMetadata(tileentity.xCoord, tileentity.yCoord,
				tileentity.zCoord);

		int direction = 2;
		if (tileentity.getWorldObj().getBlockId(tileentity.xCoord, tileentity.yCoord,
				tileentity.zCoord) == Blocks.NeonMuro.blockID) {
			direction = tileentity.getWorldObj().getBlockMetadata(tileentity.xCoord, tileentity.yCoord,
					tileentity.zCoord) + 1;
			
			if (direction == 1) {
				direction = 2;
			} else if (direction == 3) {
				direction = 4;
			} else if (direction == 2) {
				direction = 3;
			} else if (direction == 4) {
				direction = 1;
			}
		}
		GL11.glPushMatrix();

		//GL11.glTranslated(x + 0.5D, y - 0.45D, z + 0.5D);
		GL11.glTranslated(x + 0.5D, y + 0.5D, z - 0.5D);
		
		if(direction == 2) {
			GL11.glTranslated(0, 0, 2.0D);
		}
		
		if(direction == 3) {
			GL11.glTranslated(-1.0D, 0, 1.0D);
		}
		
		if(direction == 1) {
			GL11.glTranslated(1.0D, 0, 1.0D);
		}
		
		
		GL11.glRotatef(90.0F, 1.0F, 0.0F, 0.0F);
		
		
		
		//GL11.glRotatef(190.0F, 0.0F, 0.0F, 1.0F);
		
		
		GL11.glRotatef(direction * 90, 0.0F, 0.0F, 1.0F);
	

		bindTextureByName("/eyecandycraft/textures/Neon.png");
		Neon.render((Entity) null, 0.0F, -0.1F, 0.0F, 0.0F, 0.0F, 0.0625F);

		GL11.glPopMatrix();
	}
}