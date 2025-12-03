package eyecandycraft.main.blocks.custom.meta;

import java.util.List;
import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import eyecandycraft.main.CreativeTab;
import eyecandycraft.main.blocks.Blocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockHalfSlab;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class BlockCFSlabB extends  BlockHalfSlab {

	/** The type of tree this slab came from. */
    public static final String[] type = new String[] {"grayCF", "pinkCF", "limeCF", "yellowCF", "lightBlueCF", "magentaCF", "orangeCF", "whiteCF"};

    public BlockCFSlabB(int par1, boolean par2)
    {
        super(par1, par2, Material.rock);
        this.setTextureFile("/eyecandycraft/textures/colouredConcrete.png");
        this.setCreativeTab(CreativeTab.tabEyecandyMateriali);
        this.setHardness(1.0f);
		this.setLightOpacity(0);
    }

    /**
     * From the specified side and block metadata retrieves the blocks texture. Args: side, metadata
     */
    public int getBlockTextureFromSideAndMetadata(int par1, int par2)
    {
        
    	if (par2 < 8) {
    		return par2 + 16 + 8; //offset nel texture file + offset per lo slabB
    	}
    	else {
    		//return par2 + 16 + 7;
    		return par2 + 16; //per gli slab > 8, va sottratto 8 per ricominciare le texture da 16
    	}
    	
    }

    /**
     * Returns the block texture based on the side being looked at.  Args: side
     */
    public int getBlockTextureFromSide(int par1)
    {
        return this.getBlockTextureFromSideAndMetadata(par1, 0);
    }

    /**
     * Returns the ID of the items to drop on destruction.
     */
    public int idDropped(int par1, Random par2Random, int par3)
    {
        //return Block.woodSingleSlab.blockID;
   		return Blocks.cfSingleSlabB.blockID;
    }

    /**
     * Returns an item stack containing a single instance of the current block type. 'i' is the block's subtype/damage
     * and is ignored for blocks which do not support subtypes. Blocks which cannot be harvested should return null.
     */
    protected ItemStack createStackedBlock(int par1)
    {
        return new ItemStack(Blocks.cfSingleSlabB.blockID, 2, par1 & type.length);
    }

    /**
     * Returns the slab block name with step type.
     */
    public String getFullSlabName(int par1)
    {
        if (par1 < 0 || par1 >= type.length)
        {
            par1 = 0;
        }

        return super.getBlockName() + "." + type[par1];
    }

    @SideOnly(Side.CLIENT)

    /**
     * returns a list of blocks with the same ID, but different meta (eg: wood returns 4 blocks)
     */
    public void getSubBlocks(int par1, CreativeTabs par2CreativeTabs, List par3List)
    {
        if (par1 != Blocks.cfSlabB.blockID)
        {
            for (int var4 = 0; var4 < type.length; ++var4)
            {
                par3List.add(new ItemStack(par1, 1, var4));
            }
        }
    }
    
    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int par6, float par7, float par8, float par9)
    {
    	
    	try {
    		ItemStack is = player.getHeldItem();
    		//30154 è lo starting ID dei painter
        	final int PAINTER_ID = 30154;
        	
        	
        	if (is.itemID >= PAINTER_ID && is.itemID < (PAINTER_ID + 16)) {
        		//is.ItemID è ordinato al rovescio sui painter....
        		//gestione dello split a :8 in 2 Dato che siamo nel CFSlabB allora SOTTO meta=7 va TOLTO 2 al blockid e sottratto 8 al meta per passare all'A.
        		
        		int rawMeta = ((PAINTER_ID + 15) - is.itemID);
        		int blockID = rawMeta < 7 ? super.blockID - 2 : super.blockID;
        		int meta = rawMeta > 7 ? rawMeta - 8 : rawMeta;
        		
        		//System.out.println("B inputID: " + is.itemID + " rawMeta: " + rawMeta + " blockID: " + blockID + " meta: " + meta);
        		
        		world.setBlockAndMetadataWithNotify(x, y, z, blockID, meta);

        	}
        	return false;
    	} catch (Exception e) {
    		return false;
    	}
}
        
    @Override
    @SideOnly(Side.CLIENT)
    public int idPicked(World par1World, int par2, int par3, int par4)
    {
        return super.blockID;
    }
}