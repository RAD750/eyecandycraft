package eyecandycraft.main.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class TransparentBarrierBlock extends Block {

	public TransparentBarrierBlock(int par1, int par2, Material par3Material) {
		super(par1, par2, par3Material);
		this.setBlockName("transparentBarrier");
		this.setBlockUnbreakable();
		this.setResistance(6000000.0F);
		this.setTextureFile("/eyecandycraft/textures/textures.png");		
		blockIndexInTexture = 255;
	}

	public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World, int par2, int par3, int par4) {
		this.setBlockBoundsBasedOnState(par1World, par2, par3, par4);
		return super.getCollisionBoundingBoxFromPool(par1World, par2, par3, par4);
	}

	@SideOnly(Side.CLIENT)
	public AxisAlignedBB getSelectedBoundingBoxFromPool(World par1World, int par2, int par3, int par4) {
		this.setBlockBoundsBasedOnState(par1World, par2, par3, par4);
		return super.getSelectedBoundingBoxFromPool(par1World, par2, par3, par4);
	}

	public void setBlockBoundsBasedOnState(IBlockAccess blockAccess, int x, int y, int z) {
		setBlockBounds(0.1F, 0.0F, 0.1F, 0.9F, 1.25F, 0.9F);
		// setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.27F);
	}
	
	public boolean renderAsNormalBlock() {
		return false;
	}
	
	public boolean isOpaqueCube() {
		return false;
	}

}
