package eyecandycraft.main.blocks.custom;

import eyecandycraft.main.CreativeTab;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeDirection;

public class PetrolImpregnatedPlankBlock extends Block  {
	public static final String name = "RilevatoreFumo";
	public long lastWorldTime = 0;

	public PetrolImpregnatedPlankBlock(int id, int texture) {
		super(id, Material.wood);
		setHardness(0.5F);
		setResistance(0.5F);
		setStepSound(Block.soundMetalFootstep);
		setCreativeTab(CreativeTab.tabEyecandyMobilio);
		setBlockName("RilevatoreFumo");
		blockIndexInTexture = 87;
	}
	
	@Override
    public boolean isFlammable(IBlockAccess world, int x, int y, int z, int metadata, ForgeDirection face)
    {
        return true;
    }
	
	@Override
	public int getFlammability(IBlockAccess world, int x, int y, int z, int metadata, ForgeDirection face) {
		return 300;
	}
	
	@Override
    public int getFireSpreadSpeed(World world, int x, int y, int z, int metadata, ForgeDirection face)
    {
		return 300;
    }
}
