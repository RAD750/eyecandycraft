package eyecandycraft.main.blocks.custom.meta;

import eyecandycraft.main.CreativeTab;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPane;
import net.minecraft.block.StepSound;
import net.minecraft.block.material.Material;
import net.minecraft.world.World;

public class BlockMetaPane extends BlockPane {

	public BlockMetaPane(int id, int textureID, int sideTextureID, Material material, boolean canDrop, float hardness, float resistance) {
		super(id, textureID, sideTextureID, material, canDrop);
		this.setBlockName("metaPane");
		this.setStepSound(soundMetalFootstep);
		this.setCreativeTab(CreativeTab.tabEyecandyMateriali);
		this.setTextureFile("/eyecandycraft/textures/metaPane.png");
		this.setHardness(hardness);
		this.setResistance(resistance);
	}
	
	@Override
    public boolean canBeReplacedByLeaves(World world, int x, int y, int z)
    {
        return false;
    }
}
	
