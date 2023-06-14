package eyecandycraft.main.blocks.custom;

import eyecandycraft.main.CreativeTab;
import net.minecraft.block.BlockTrapDoor;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class BlockTombino extends BlockTrapDoor {

	private boolean isClickable;

	public BlockTombino(int id, Material mat, String blockName, float hardness, int textureIndex, boolean isClickable) {
		super(id, mat);
        this.setCreativeTab(CreativeTab.tabEyecandyMateriali);
        this.setTextureFile("/eyecandycraft/textures/textures.png");
        this.blockIndexInTexture = textureIndex;
        this.isClickable = isClickable;
        this.setHardness(hardness);
        this.setBlockName(blockName);
        this.setRequiresSelfNotify();
	}

	@Override
    public boolean onBlockActivated(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9)
    {
		if (!this.isClickable && par5EntityPlayer.getCurrentEquippedItem() != null && par5EntityPlayer.getCurrentEquippedItem().itemID != railcraft.common.api.core.items.ItemRegistry.getItem("tool.crowbar", 1).itemID) {
			return true;
		} else if (!this.isClickable && par5EntityPlayer.getCurrentEquippedItem() == null) {
			return false;
		} else
        {
            int var10 = par1World.getBlockMetadata(par2, par3, par4);
            par1World.setBlockMetadataWithNotify(par2, par3, par4, var10 ^ 4);
            par1World.playAuxSFXAtEntity(par5EntityPlayer, 1003, par2, par3, par4, 0);
            return true;
        }
    }	
}
