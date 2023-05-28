package eyecandycraft.main.blocks.custom.meta;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import eyecandycraft.main.CreativeTab;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockRedstoneBlocks extends Block {
	public BlockRedstoneBlocks(int id) {
		super(id, Material.rock);
		this.setBlockName("redstoneBlock");
		this.setTextureFile("/eyecandycraft/textures/textures.png");
		this.setCreativeTab(CreativeTab.tabEyecandyMateriali);
		this.setHardness(1.0F);
		this.setResistance(2.0F);
		this.setRequiresSelfNotify();
	}
	
	@Override
	public int damageDropped(int metadata) {
		return metadata;
	}
	
	
	

	@Override
	@SideOnly(Side.CLIENT)
	public int getBlockTextureFromSideAndMetadata(int side, int metadata) {
		return 244 + metadata;
	}
	
	@Override
	public void onBlockAdded(World par1World, int par2, int par3, int par4) {
	    par1World.notifyBlocksOfNeighborChange(par2, par3 - 1, par4, this.blockID);
	    par1World.notifyBlocksOfNeighborChange(par2, par3 + 1, par4, this.blockID);
	    par1World.notifyBlocksOfNeighborChange(par2 - 1, par3, par4, this.blockID);
	    par1World.notifyBlocksOfNeighborChange(par2 + 1, par3, par4, this.blockID);
	    par1World.notifyBlocksOfNeighborChange(par2, par3, par4 - 1, this.blockID);
	    par1World.notifyBlocksOfNeighborChange(par2, par3, par4 + 1, this.blockID);
	    par1World.notifyBlocksOfNeighborChange(par2, par3, par4, this.blockID);
	}

	@Override
	public void breakBlock(World par1World, int par2, int par3, int par4, int par5, int par6){
	    par1World.notifyBlocksOfNeighborChange(par2, par3 - 1, par4, this.blockID);
	    par1World.notifyBlocksOfNeighborChange(par2, par3 + 1, par4, this.blockID);
	    par1World.notifyBlocksOfNeighborChange(par2 - 1, par3, par4, this.blockID);
	    par1World.notifyBlocksOfNeighborChange(par2 + 1, par3, par4, this.blockID);
	    par1World.notifyBlocksOfNeighborChange(par2, par3, par4 - 1, this.blockID);
	    par1World.notifyBlocksOfNeighborChange(par2, par3, par4 + 1, this.blockID);
	    par1World.notifyBlocksOfNeighborChange(par2, par3, par4, this.blockID);

	}
	
	@Override

	public boolean isBlockNormalCube(World world, int x, int y, int z)
    {
        return false;
    }
	
	@Override
    public boolean isProvidingWeakPower(IBlockAccess par1IBlockAccess, int par2, int par3, int par4, int par5)
    {
        return true;
    }

	@Override
    public boolean isProvidingStrongPower(IBlockAccess par1IBlockAccess, int par2, int par3, int par4, int par5)
    {
        return true;
    }

    @Override
    public boolean canProvidePower()
    {
        return true;
    }
}
