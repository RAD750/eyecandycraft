package eyecandycraft.main.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import eyecandycraft.main.CreativeTab;
import eyecandycraft.main.entities.TileEntityCartelloEndor;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class CartelloEndorBlock extends BlockContainer {
	public static final String name = "CartelloEndor";

	public CartelloEndorBlock(int id, int texture) {
		super(id, Material.iron);
		setHardness(0.5F);
		setResistance(0.5F);
		setStepSound(Block.soundMetalFootstep);
		setCreativeTab(CreativeTab.tabEyecandyMobilio);
		setBlockName("CartelloEndor");
		blockIndexInTexture = 41;
	}

	public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World, int par2, int par3, int par4) {
		return null;
	}

	@SideOnly(Side.CLIENT)
	public AxisAlignedBB getSelectedBoundingBoxFromPool(World par1World, int par2, int par3, int par4) {
		this.setBlockBoundsBasedOnState(par1World, par2, par3, par4);
		return super.getSelectedBoundingBoxFromPool(par1World, par2, par3, par4);
	}

	  public void setBlockBoundsBasedOnState(IBlockAccess blockAccess, int x, int y, int z)
	  {
	    if (blockAccess.getBlockMetadata(x, y, z) == 1)
	    {
	      setBlockBounds(0.1F, 0.0F, 0.0F, 0.0F, 1.0F, 1.0F);


	    }
	    else if (blockAccess.getBlockMetadata(x, y, z) == 2)
	    {
	      setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.1F);


	    }
	    else if (blockAccess.getBlockMetadata(x, y, z) == 3)
	    {
	      setBlockBounds(1.0F, 0.0F, 0.0F, 0.9F, 1.0F, 1.0F);
	    }
	    else
	    {
	      setBlockBounds(0.0F, 0.0F, 0.9F, 1.0F, 1.0F, 1.0F);
	    }
	  }

	public void onBlockPlacedBy(World world, int x, int y, int z, EntityLiving entity) {
		if ((entity instanceof EntityPlayer)) {
			int yaw = (int) entity.rotationYaw;

			if (yaw < 0)
				yaw += 360;
			yaw += 22;
			yaw %= 360;
			int facing = yaw / 45;

			world.setBlockAndMetadataWithNotify(x, y, z, Blocks.CartelloEndor.blockID, facing / 2);
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
		return new TileEntityCartelloEndor();
	}
}
