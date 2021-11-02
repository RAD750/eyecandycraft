package eyecandycraft.main.blocks.custom;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import eyecandycraft.main.entities.TileEntitySignCustom;
import eyecandycraft.main.items.Items;
import eyecandycraft.main.utils.ChatColor;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSign;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraftforge.oredict.OreDictionary;
import eyecandycraft.main.utils.Game;

public class SignCustomBlock extends BlockSign {

	public final int itemID;
	public final BlockSign blockPost;
	public final String textureFile;
	
	public SignCustomBlock(int id, boolean isFreestanding, int itemID, Block blockPost, String textureFile) {
		super(id, null, isFreestanding);
		this.itemID = itemID+256;
		this.setHardness(1.0F).setRequiresSelfNotify();
		if(blockPost != null) {
			this.blockPost = (BlockSign) blockPost;
		} else {
			this.blockPost = this;
		}
		this.textureFile = textureFile;
	}
	
    /**
     * Returns a new instance of a block's tile entity class. Called on placing the block.
     */
	@Override
    public TileEntity createNewTileEntity(World par1World) {
        return new TileEntitySignCustom()
        		.setBlockPost(blockPost)
        		.setTextureFile(textureFile);
    }
	
	/**
     * Returns the ID of the items to drop on destruction.
     */
	@Override
    public int idDropped(int par1, Random par2Random, int par3) {
        return itemID;
    }
	
	@SideOnly(Side.CLIENT)
    /**
     * only called by clickMiddleMouseButton , and passed to inventory.setCurrentItem (along with isCreative)
     */
	@Override
    public int idPicked(World par1World, int par2, int par3, int par4) {
        return itemID;
    }
	
	/**
     * Called upon block activation (right click on the block.)
     */
	@Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float par6, float par7, float par8) {
		TileEntitySignCustom sign = (TileEntitySignCustom)world.getBlockTileEntity((int)x, (int)y, (int)z);
		ItemStack item = player.getHeldItem();
		ChatColor textColor = null;
		ChatColor textFormat = null;
		int signColor = -2;
		
		if(item != null && sign != null) {
			if(item.itemID == Item.bucketWater.itemID) {
				textColor = ChatColor.RESET;
				textFormat = ChatColor.RESET;
				signColor = -1;
			}
			
			int oreID = OreDictionary.getOreID(item);
			if(oreID < 0) {
				ItemStack tempItem = item.copy();
				tempItem.setItemDamage(0);
				oreID = OreDictionary.getOreID(tempItem);
			}
			
			String name = OreDictionary.getOreName(oreID);
			switch(name) {
				case "whitePainter":
					signColor = 0xF9FFFE;
					break;
				case "dyeWhite":
					textColor = ChatColor.WHITE;
					break;
				case "orangePainter":
					signColor = 0xF9801D;
					break;
				case "dyeOrange":
					textColor = ChatColor.GOLD;
					break;
				case "magentaPainter":
					signColor = 0xC74EBD;
					break;
				case "dyeMagenta":
					textColor = ChatColor.BLUE;
					break;
				case "cloudPainter":
					signColor = 0x3AB3DA;
					break;
				case "dyeLightBlue":
					textColor = ChatColor.AQUA;
					break;
				case "yellowPainter":
					signColor = 0xFED83D;
					break;
				case "dyeYellow":
					textColor = ChatColor.YELLOW;
					break;
				case "limePainter":
					signColor = 0x80C71F;
					break;
				case "dyeLime":
					textColor = ChatColor.GREEN;
					break;
				case "pinkPainter":
					signColor = 0xF38BAA;
					break;
				case "dyePink":
					textColor = ChatColor.LIGHT_PURPLE;
					break;
				case "darkGrayPainter":
					signColor = 0x474F52;
					break;
				case "dyeGray":
					textColor = ChatColor.DARK_GRAY;
					break;
				case "lightGrayPainter":
					signColor = 0x9D9D97;
					break;
				case "dyeLightGray":
					textColor = ChatColor.GRAY;
					break;
				case "cyanPainter":
					signColor = 0x169C9C;
					break;
				case "dyeCyan":
					textColor = ChatColor.DARK_AQUA;
					break;
				case "purplePainter":
					signColor = 0x8932B8;
					break;
				case "dyePurple":
					textColor = ChatColor.DARK_PURPLE;
					break;
				case "bluePainter":
					signColor = 0x3C44AA;
					break;
				case "dyeBlue":
					textColor = ChatColor.DARK_BLUE;
					break;
				case "brownPainter":
					signColor = 0x835432;
					break;
				case "dyeBrown":
					textColor = ChatColor.DARK_RED;
					break;
				case "greenPainter":
					signColor = 0x5E7C16;
					break;
				case "dyeGreen":
					textColor = ChatColor.DARK_GREEN;
					break;
				case "redPainter":
					signColor = 0xB02E26;
					break;
				case "dyeRed":
					textColor = ChatColor.RED;
					break;
				case "blackPainter":
					signColor = 0x1D1D21;
					break;
				case "dyeBlack":
					textColor = ChatColor.BLACK;
					break;
				default:
					break;
			}
			if(!player.capabilities.isCreativeMode) {
				if(item.itemID == Item.bucketWater.itemID) {
					player.inventory.setInventorySlotContents(player.inventory.currentItem, new ItemStack(Item.bucketEmpty));
				} else if(textColor != null) {
					item.stackSize = item.stackSize-1;
				} else if(signColor >= -1) {
					item.setItemDamage(item.getItemDamage()+1);
					if(item.getItemDamage() >= item.getMaxDamage()) {
						player.inventory.setInventorySlotContents(player.inventory.currentItem, ic2.api.Items.getItem("painter"));
					}
				}
			}
			if(textColor != null) {
				sign.setTextColor(textColor);
			}
			if(signColor >= -1) {
				sign.setSignColor(signColor);
			}
			if(textFormat != null) {
				sign.setTextFormat(textFormat);
			}
		}
        return true;
    }
}
