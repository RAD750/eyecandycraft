package com.rgbcraft.baumod.main.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.world.IBlockAccess;

public class TimberFrame extends Block {

	int type;

	public TimberFrame(int par1, int par2, Material par3Material, int type) {
		super(par1, par2, par3Material);
		this.type = type;
	}

	@SideOnly(Side.CLIENT)
	public int getBlockTexture(IBlockAccess par1IBlockAccess, int par2, int par3, int par4, int par5) {
		if (type == 1) {
			if (par5 == 1) {
				return 13;
			} else if (par5 == 0) {
				return 13;
			} else if (par5 == 6) {
				return 13;
			} else {
				return 14;
			}
		} else if (type == 2) {
			if (par5 == 1) {
				return 14;
			} else if (par5 == 0) {
				return 13;
			} else if (par5 == 6) {
				return 14;
			} else {
				return 13;
			}
		} else {
			return 0;
		}

	}

}
