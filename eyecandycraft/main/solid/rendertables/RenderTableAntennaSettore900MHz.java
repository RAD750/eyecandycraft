package eyecandycraft.main.solid.rendertables;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import org.lwjgl.opengl.GL11;

import eyecandycraft.main.solid.models.ModelAntennaSettore900MHz;

public class RenderTableAntennaSettore900MHz extends TileEntitySpecialRenderer {
    private final ModelAntennaSettore900MHz AntennaSettore900MHz;

    public RenderTableAntennaSettore900MHz() {
        AntennaSettore900MHz = new ModelAntennaSettore900MHz();
    }

    public void renderTileEntityAt(TileEntity var1, double x, double y, double z, float scale) {
        GL11.glPushMatrix();
        GL11.glTranslated(x + 0.5D, y + 1.5D, z + 0.5D);
        GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
        bindTextureByName("/eyecandycraft/textures/AntennaSettore900MHz.png");
        AntennaSettore900MHz.render(null, 0.0F, -0.1F, 0.0F, 0.0F, 0.0F, 0.0625F);
        GL11.glPopMatrix();
    }
}