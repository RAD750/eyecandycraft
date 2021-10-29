package eyecandycraft.main.blocks.custom;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.world.IBlockAccess;

public class HayBlock extends Block{

	public HayBlock(int par1, int par2, Material par3Material) {
		super(par1, par2, par3Material);

	}
	
	@SideOnly(Side.CLIENT)
	public int getBlockTexture(IBlockAccess par1IBlockAccess, int par2, int par3, int par4, int par5)
    {
        if (par5 == 1)
        {
            return 12;
        }
        else if (par5 == 0)
        {
            return 12;
        }else {
        	return 11;
        }
        
    }
	
	public boolean isOpaqueCube()
    {
        return false;
    }

    public int getRenderBlockPass()
    {
            return 1;
    }
}

