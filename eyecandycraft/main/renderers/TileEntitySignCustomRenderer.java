package eyecandycraft.main.renderers;

import org.lwjgl.opengl.GL11;

import net.minecraft.block.Block;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.model.ModelSign;
import net.minecraft.client.renderer.tileentity.TileEntitySignRenderer;
import net.minecraft.tileentity.TileEntitySign;
import eyecandycraft.main.blocks.Blocks;
import eyecandycraft.main.entities.TileEntitySignCustom;
import eyecandycraft.main.utils.ChatColor;

public class TileEntitySignCustomRenderer extends TileEntitySignRenderer {

    private ModelSign modelSign = new ModelSign();
    private int updateCounter;
    
	@Override
	public void renderTileEntitySignAt(TileEntitySign signPar, double par2, double par4, double par6, float par8) {
		updateCounter++;
		TileEntitySignCustom sign = (TileEntitySignCustom) signPar;
        Block var9 = sign.getBlockType();
        GL11.glPushMatrix();
        float var10 = 0.6666667F;
        float var12;

        if (var9 != null && (sign.getBlockPost() == null || var9.blockID == sign.getBlockPost().blockID)) {
            GL11.glTranslatef((float)par2 + 0.5F, (float)par4 + 0.75F * var10, (float)par6 + 0.5F);
            float var11 = (float)(sign.getBlockMetadata() * 360) / 16.0F;
            GL11.glRotatef(-var11, 0.0F, 1.0F, 0.0F);
            this.modelSign.signStick.showModel = true;
        } else {
            int var16 = sign.getBlockMetadata();
            var12 = 0.0F;

            if (var16 == 2)
            {
                var12 = 180.0F;
            }

            if (var16 == 4)
            {
                var12 = 90.0F;
            }

            if (var16 == 5)
            {
                var12 = -90.0F;
            }

            GL11.glTranslatef((float)par2 + 0.5F, (float)par4 + 0.75F * var10, (float)par6 + 0.5F);
            GL11.glRotatef(-var12, 0.0F, 1.0F, 0.0F);
            GL11.glTranslatef(0.0F, -0.3125F, -0.4375F);
            this.modelSign.signStick.showModel = false;
        }

        //this.bindTextureByName("/item/sign.png");
        this.bindTextureByName(sign.getTextureFile());
        GL11.glPushMatrix();
        GL11.glScalef(var10, -var10, -var10);
        
        int color = sign.getSignColor();
        if(color >= 0) {
            float dim = 1.0F;
            float c1 = (float) (color >> 16 & 255) / 255.0F;
            float c2 = (float) (color >> 8 & 255) / 255.0F;
            float c3 = (float) (color & 255) / 255.0F;
            GL11.glColor4f(c1 * dim, c2 * dim, c3 * dim, 1);
        }
        
        this.modelSign.renderSign();
        GL11.glPopMatrix();
        FontRenderer var17 = this.getFontRenderer();
        var12 = 0.016666668F * var10;
        GL11.glTranslatef(0.0F, 0.5F * var10, 0.07F * var10);
        GL11.glScalef(var12, -var12, var12);
        GL11.glNormal3f(0.0F, 0.0F, -1.0F * var12);
        GL11.glDepthMask(false);
        byte var13 = 0;

        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        for (int var14 = 0; var14 < sign.signText.length; ++var14) {
        	String textFormat = sign.getTextFormat().equals(ChatColor.RESET) ? "" : sign.getTextFormat().toString();
        	String textColor = sign.getTextColor().equals(ChatColor.RESET) ? "" : sign.getTextColor().toString();
            String var15 = sign.signText[var14];
            var15 = ChatColor.translateAlternateColorCodes('&', var15);
            
            if (var14 == sign.lineBeingEdited) {
            	String editDisplay = ChatColor.visualizeColors(var15);
            	var15 = textColor + textFormat + editDisplay;
        		var15 = "> " + var15 + ChatColor.RESET + " <";
                var17.drawString(var15, -var17.getStringWidth(var15) / 2, var14 * 10 - sign.signText.length * 5, var13);
            } else {
            	var15 = textColor + textFormat + var15;
                var17.drawString(var15, -var17.getStringWidth(var15) / 2, var14 * 10 - sign.signText.length * 5, var13);
            }
        }

        GL11.glDepthMask(true);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glPopMatrix();
    }
}
