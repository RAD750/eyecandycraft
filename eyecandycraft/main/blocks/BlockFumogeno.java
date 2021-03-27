package eyecandycraft.main.blocks;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import eyecandycraft.main.CreativeTab;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.world.World;

public class BlockFumogeno extends Block {

	public BlockFumogeno(int par1) {
		super(par1, 1, Material.rock);
		this.setCreativeTab(CreativeTab.tabEyecandyAltro);
		this.setTickRandomly(true);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void randomDisplayTick(World world, int x, int y, int z, Random random) {
		//smoke, x, y, z, velocityXYZ, 
		for (int i = 0; i < 10; i++) // TODO
		    world.spawnParticle("largesmoke", x+0.5f, y + 1.1f,
		        z+0.5f, 0, 0.05f, 0);
	}
	
	@Override
	public int tickRate() {
		return 1;
	}
}
