package eyecandycraft.main.blocks;

import buildcraft.api.core.Position;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import eyecandycraft.main.CreativeTab;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeDirection;

public class BlockTappeto extends Block {

	protected BlockTappeto(int id) {
		super(id, Material.cloth);
		this.setCreativeTab(CreativeTab.tabEyecandyMobilio);
		setBlockName("tappeto");
		this.setHardness(0.5F);
	}

	@Override
	public int getBlockTextureFromSideAndMetadata(int side, int metadata) {
		if (metadata == 0) {
			return 64;
		} else {
			metadata = ~(metadata & 15);
			return 113 + ((metadata & 8) >> 3) + (metadata & 7) * 16;
		}
	}
	
	@Override
    public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World, int par2, int par3, int par4)
    {
        return null;
    }

	@Override
	public void setBlockBoundsBasedOnState(IBlockAccess world, int x, int y, int z) {
		this.setBlockBounds(0.00F, 0F, 0.00F, 1F, 0.070F, 1F);
	}

	@Override
	public boolean renderAsNormalBlock() {
		return false;
	}

	@Override
	public boolean isOpaqueCube() {
		return false;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public AxisAlignedBB getSelectedBoundingBoxFromPool(World world, int x, int y, int z) {
		this.setBlockBoundsBasedOnState(world, x, y , z);
		return super.getSelectedBoundingBoxFromPool(world, x, y, z);
	}

	@Override
	public MovingObjectPosition collisionRayTrace(World world, int x, int y, int z, Vec3 start, Vec3 end) {
		this.setBlockBoundsBasedOnState(world, x, y , z);
		return super.collisionRayTrace(world, x, y, z, start, end);
	}

	@Override
	public void setBlockBoundsForItemRender() {
		this.setBlockBounds(0.00F, 0F, 0.00F, 1F, 0.070F, 1F);
	}

	@Override
	public int damageDropped(int metadata) {
		return metadata;
	}

	@Override
	public void onNeighborBlockChange(World par1World, int par2, int par3, int par4, int par5) {
		super.onNeighborBlockChange(par1World, par2, par3, par4, par5);
		if (!this.canPlaceBlockAt(par1World, par2, par3, par4)) {
			int metadata = par1World.getBlockMetadata(par2, par3, par4);
			ItemStack dropBlock = new ItemStack(this.blockID, 1, par1World.getBlockMetadata(par2, par3, par4));
			par1World.setBlockWithNotify(par2, par3, par4, 0);
			if (dropBlock != null) {
				float f = 0.3f;
				double x2 = par1World.rand.nextFloat() * f + (1.0f - f) * 0.5;
				double y2 = par1World.rand.nextFloat() * f + (1.0f - f) * 0.5;
				double z2 = par1World.rand.nextFloat() * f + (1.0f - f) * 0.5;
				par1World.spawnEntityInWorld(new EntityItem(par1World, par2 + x2, par3 + y2, par4 + z2, dropBlock));
				super.breakBlock(par1World, par2, par3, par4, this.blockID, metadata);
			}
		}
	}

	@Override
	public boolean canPlaceBlockAt(World par1World, int par2, int par3, int par4) {
		int var5 = par1World.getBlockId(par2, par3, par4);
		return par1World.doesBlockHaveSolidTopSurface(par2, par3 - 1, par4);

	}
}
