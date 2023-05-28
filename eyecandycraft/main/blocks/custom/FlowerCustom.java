package eyecandycraft.main.blocks.custom;

import eyecandycraft.main.CreativeTab;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;

public class FlowerCustom extends Block {
	public FlowerCustom(int id, int textureIndex, Material material) {
		super(id, material);
        this.blockIndexInTexture = textureIndex;
        float var4 = 0.2F;
        this.setBlockBounds(0.5F - var4, 0.0F, 0.5F - var4, 0.5F + var4, var4 * 3.0F, 0.5F + var4);
        this.setCreativeTab(CreativeTab.tabEyecandyMateriali);
        this.setTextureFile("/eyecandycraft/textures/textures.png");
        this.setBlockName("Chain");
	}
	
    public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World, int par2, int par3, int par4)
    {
        return null;
    }
    
    public boolean isOpaqueCube()
    {
        return false;
    }
    
    public boolean renderAsNormalBlock()
    {
        return false;
    }
    
    public int getRenderType()
    {
        return 1;
    }
}
