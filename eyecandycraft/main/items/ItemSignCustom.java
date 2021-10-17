package eyecandycraft.main.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import eyecandycraft.main.CreativeTab;
import eyecandycraft.main.blocks.Blocks;
import eyecandycraft.main.entities.TileEntitySignCustom;
import eyecandycraft.main.gui.GuiEditSignCustom;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSign;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class ItemSignCustom extends ItemSign {

	public final Block signPost;
	public final Block signWall;
	
	public ItemSignCustom(int id, Block signPost, Block signWall) {
		super(id);
		this.signPost = signPost;
		this.signWall = signWall;
		//this.setTextureFile("/eyecandycraft/textures/cartelli.png");
		this.setCreativeTab(CreativeTab.tabEyecandyAltro);
	}
	@SideOnly(Side.CLIENT)
	public void callGui(TileEntitySignCustom var12) {
		Minecraft.getMinecraft().displayGuiScreen(new GuiEditSignCustom(var12));
	}
	
	@Override
	public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10)
    {
        if (par7 == 0) {
            return false;
        }
        else if (!par3World.getBlockMaterial(par4, par5, par6).isSolid()) {
            return false;
        }
        else {
            if (par7 == 1) {
                ++par5;
            }

            if (par7 == 2) {
                --par6;
            }

            if (par7 == 3) {
                ++par6;
            }

            if (par7 == 4) {
                --par4;
            }

            if (par7 == 5) {
                ++par4;
            }

            if (!par2EntityPlayer.canPlayerEdit(par4, par5, par6, par7, par1ItemStack)) {
                return false;
            }
            else if (!signPost.canPlaceBlockAt(par3World, par4, par5, par6)) {
                return false;
            }
            else {
                if (par7 == 1) {
                    int var11 = MathHelper.floor_double((double)((par2EntityPlayer.rotationYaw + 180.0F) * 16.0F / 360.0F) + 0.5D) & 15;
                    par3World.setBlockAndMetadataWithNotify(par4, par5, par6, signPost.blockID, var11);
                }
                else {
                    par3World.setBlockAndMetadataWithNotify(par4, par5, par6, signWall.blockID, par7);
                }

                --par1ItemStack.stackSize;
                TileEntitySignCustom var12 = (TileEntitySignCustom)par3World.getBlockTileEntity(par4, par5, par6);

                if (var12 != null && par3World.isRemote) {
                	callGui(var12);
                    //par2EntityPlayer.displayGUIEditSign(var12);
                }

                return true;
            }
        }
    }
	
}
