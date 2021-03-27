package eyecandycraft.main.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class TintedGlass extends Block {

	public TintedGlass(int par1, int par2, Material par3Material) {
		super(par1, par2, par3Material);

	}

	public boolean isOpaqueCube() {
		return false;
	}

	public int getRenderBlockPass() {
		return 1;
	}

	public int idDropped(int par1, Random random, int zero) {
		return 0;
	}
}
