package eyecandycraft.main.solid.rendertables;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import org.lwjgl.opengl.GL11;

import eyecandycraft.main.blocks.Blocks;
import eyecandycraft.main.solid.models.ModelAntennaYagiVHF;
import eyecandycraft.main.utils.Game;

public class RenderTableAntennaYagiVHF extends TileEntitySpecialRenderer {
    private final ModelAntennaYagiVHF AntennaYagiVHF;

    public RenderTableAntennaYagiVHF() {
        AntennaYagiVHF = new ModelAntennaYagiVHF();
    }

    public void renderTileEntityAt(TileEntity tileentity, double x, double y, double z, float scale) {
        int direction = Game.getDirection(tileentity);

        GL11.glPushMatrix();

        // GL11.glTranslated(x + 0.5D, y - 0.45D, z + 0.5D);
        GL11.glTranslated(x + 0.5D, y + 1.5D, z + 0.5D);

        GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);

        GL11.glRotatef(direction * 90, 0.0F, 1.0F, 0.0F);

        bindTextureByName("/eyecandycraft/textures/AntennaYagiVHF.png");
        AntennaYagiVHF.render(null, 0.0F, -0.1F, 0.0F, 0.0F, 0.0F, 0.0625F);

        GL11.glPopMatrix();
    }
}