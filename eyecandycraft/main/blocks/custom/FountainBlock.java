package eyecandycraft.main.blocks.custom;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import eyecandycraft.main.CreativeTab;
import eyecandycraft.main.blocks.Blocks;
import eyecandycraft.main.entities.TileEntityFountain;
import eyecandycraft.main.handlers.ThirstModHandler;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class FountainBlock extends BlockContainer {
	public static final String name = "Fountain";

	public FountainBlock(int id, int texture) {
		super(id, Material.iron);
		setHardness(0.5F);
		setResistance(0.5F);
		setStepSound(Block.soundMetalFootstep);
		setCreativeTab(CreativeTab.tabEyecandyMobilio);
		setBlockName("Fountain");
		blockIndexInTexture = 76;
	}

	public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World, int par2, int par3, int par4) {
		return null;
	}

	public void setBlockBoundsBasedOnState(IBlockAccess blockAccess, int x, int y, int z) {
		setBlockBounds(0.4F, 0.0F, 0.4F, 0.6F, 1.0F, 0.6F);
	}

	public void onBlockPlacedBy(World world, int x, int y, int z, EntityLiving entity) {
		if ((entity instanceof EntityPlayer)) {
			int yaw = (int) entity.rotationYaw;

			if (yaw < 0)
				yaw += 360;
			yaw += 22;
			yaw %= 360;
			int facing = yaw / 45;

			world.setBlockAndMetadataWithNotify(x, y, z, Blocks.Fountain.blockID, facing / 2);
		}
	}

	public int getRenderType() {
		return -1;
	}

	public String getTextureFile() {
		return "/eyecandycraft/textures/items.png";
	}

	public boolean isOpaqueCube() {
		return false;
	}

	public boolean renderAsNormalBlock() {
		return false;
	}

	public int idDropped(int par1, int par2) {
		return blockID;
	}

	public int quantityDropped() {
		return 1;
	}

	public TileEntity createNewTileEntity(World world) {
		return null;
	}

	public TileEntity createTileEntity(World world, int meta) {
		return new TileEntityFountain();
	}

	//	@SideOnly(Side.CLIENT)
	//	public void randomDisplayTick(World par1World, int par2, int par3, int par4, Random par5Random)
	//    {
	//		par1World.spawnParticle("splash", par2+0.5, par3+0.2, par4+0.5, 0.0D, 0.0D, 0.0D);
	//    }

	public boolean onBlockActivated(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9)
	{
		if (par1World.isRemote)
		{
			return true;
		}
		else
		{
			ItemStack glassBottleItem = par5EntityPlayer.inventory.getCurrentItem();

			if (glassBottleItem == null)
			{
				return true;
			}
			else
			{
				Item freshWaterItem = ThirstModHandler.getThirstModItem("freshWater");
				if (freshWaterItem != null) {
					if (glassBottleItem.itemID == Item.glassBottle.itemID)
					{
						ItemStack freshWaterStack = new ItemStack(freshWaterItem, 1, 0);

						if (!par5EntityPlayer.inventory.addItemStackToInventory(freshWaterStack))
						{
							par1World.spawnEntityInWorld(new EntityItem(par1World, (double)par2 + 0.5D, (double)par3 + 1.5D, (double)par4 + 0.5D, freshWaterStack));
						}
						else if (par5EntityPlayer instanceof EntityPlayerMP)
						{
							((EntityPlayerMP)par5EntityPlayer).sendContainerToPlayer(par5EntityPlayer.inventoryContainer);
						}

						--glassBottleItem.stackSize;

						if (glassBottleItem.stackSize <= 0)
						{
							par5EntityPlayer.inventory.setInventorySlotContents(par5EntityPlayer.inventory.currentItem, (ItemStack)null);
						}
					}
				}
					return true;
			}
		}
	}
}
