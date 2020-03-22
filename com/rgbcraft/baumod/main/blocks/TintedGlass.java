package com.rgbcraft.baumod.main.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.world.IBlockAccess;
import java.util.Random;

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
