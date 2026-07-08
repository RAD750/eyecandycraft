package eyecandycraft.main.solid.rendertables;

import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;
import org.lwjgl.opengl.GL11;

import cpw.mods.fml.client.FMLClientHandler;
import eyecandycraft.main.blocks.Blocks;
import eyecandycraft.main.blocks.custom.AntennaYagiVHFBlock;
import eyecandycraft.main.entities.TileEntityWallClock;
import eyecandycraft.main.solid.models.ModelWallClock;

public class RenderTableWallClock extends TileEntitySpecialRenderer {
	private ModelWallClock WallClock;

	public RenderTableWallClock() {
		WallClock = new ModelWallClock();
	}

	public void renderTileEntityAt(TileEntity tileentity, double x, double y, double z, float scale) {
		int metadata = tileentity.getWorldObj().getBlockMetadata(tileentity.xCoord, tileentity.yCoord,
				tileentity.zCoord);

		int direction = 2;
		if (tileentity.getWorldObj().getBlockId(tileentity.xCoord, tileentity.yCoord,
				tileentity.zCoord) == Blocks.WallClock.blockID) {
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
		GL11.glRotatef(90.0F, 0.0F, 1.0F, 0.0F);

		GL11.glRotatef(direction * 90, 0.0F, 1.0F, 0.0F);

		bindTextureByName("/eyecandycraft/textures/WallClock.png");
		WallClock.render((Entity) null, 0.0F, -0.1F, 0.0F, 0.0F, 0.0F, 0.0625F);

		GL11.glDisable(GL11.GL_LIGHTING);
	    GL11.glDisable(GL11.GL_DEPTH_TEST);
	    
	    FontRenderer fr = this.getFontRenderer();

	    float scale2 = 0.01f; 
	    GL11.glScalef(scale2, scale2, scale2);
	    GL11.glTranslatef(0.0f, 0.0f, 42.0f);
	    
	    
	    int w3 = fr.getStringWidth("Er.r °C");
	    fr.drawString("Er.r °C", (-w3 / 2), 100, 0xFF1000);
	    
        final int time = (int)((FMLClientHandler.instance().getClient().theWorld.getWorldTime() - 18000L) % 24000L);
        final int hours = time / 1000;
        final int minutes = time % 1000 * 6 / 100;
	    String timeFmt = String.format("%02d:%02d", hours, minutes);

	    int w = fr.getStringWidth(timeFmt);
	    fr.drawString(timeFmt, (-w / 2), 80, 0xFF1000);
	    

	    

	    

	    GL11.glEnable(GL11.GL_DEPTH_TEST);
	    GL11.glEnable(GL11.GL_LIGHTING);


		
		GL11.glPopMatrix();
	}
}