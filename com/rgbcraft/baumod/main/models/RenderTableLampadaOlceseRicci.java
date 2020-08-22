package com.rgbcraft.baumod.main.models;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;
import org.lwjgl.opengl.GL11;

public class RenderTableLampadaOlceseRicci extends TileEntitySpecialRenderer {
	private ModelLampadaOlceseRicci LampadaOlceseRicci;

	public RenderTableLampadaOlceseRicci() {
		LampadaOlceseRicci = new ModelLampadaOlceseRicci();
	}

	public void renderTileEntityAt(TileEntity var1, double x, double y, double z, float scale) {
		GL11.glPushMatrix();
		GL11.glTranslated(x + 0.5D, y - 0.5D, z + 0.5D);
		bindTextureByName("/com/rgbcraft/baumod/textures/LampadaOlceseRicci.png");
		LampadaOlceseRicci.render((Entity) null, 0.0F, -0.1F, 0.0F, 0.0F, 0.0F, 0.0625F);
		GL11.glPopMatrix();
	}
}