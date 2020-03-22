package com.rgbcraft.baumod.main.models;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;
import org.lwjgl.opengl.GL11;

import com.rgbcraft.baumod.main.blocks.AntennaSettore900MHzBlock;

public class RenderTableAntennaSettore900MHz extends TileEntitySpecialRenderer {
	private ModelAntennaSettore900MHz AntennaSettore900MHz;

	public RenderTableAntennaSettore900MHz() {
		AntennaSettore900MHz = new ModelAntennaSettore900MHz();
	}

	public void renderTileEntityAt(TileEntity var1, double x, double y, double z, float scale) {
		GL11.glPushMatrix();
		GL11.glTranslated(x + 0.5D, y + 1.5D, z + 0.5D);
		GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
		bindTextureByName("/com/rgbcraft/baumod/textures/AntennaSettore900MHz.png");
		AntennaSettore900MHz.render((Entity) null, 0.0F, -0.1F, 0.0F, 0.0F, 0.0F, 0.0625F);
		GL11.glPopMatrix();
	}
}