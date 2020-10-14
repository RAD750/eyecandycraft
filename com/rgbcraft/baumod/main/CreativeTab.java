package com.rgbcraft.baumod.main;

import com.rgbcraft.baumod.main.blocks.Blocks;
import com.rgbcraft.baumod.main.items.Items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class CreativeTab extends CreativeTabs {
	public static CreativeTabs CTBlocks = new CreativeTab(CreativeTabs.getNextID(), "EyecandyCraft - Blocchi");
	public static CreativeTabs CTDecorations = new CreativeTab(CreativeTabs.getNextID(), "EyecandyCraft - Decorazioni");
	public static CreativeTabs CTSigns = new CreativeTab(CreativeTabs.getNextID(), "EyecandyCraft - Cartelli");

	private String name;

	public CreativeTab(int par1, String par2Str) {
		super(par1, par2Str);
		this.name = par2Str;
	}

	@SideOnly(Side.CLIENT)
	public ItemStack getIconItemStack() {
		if (this.name == CTBlocks.getTabLabel()) {
			return new ItemStack(Blocks.hazardstripe.blockID, 1, 0);
		} else if (this.name == CTSigns.getTabLabel()) {
			return new ItemStack(Items.p_Infiammabile.itemID, 1, 0);
		} else if (this.name == CTDecorations.getTabLabel()) {
			return new ItemStack(Blocks.ParabolaSat.blockID, 1, 0);
		}

		return null;
	}

	public String getTranslatedTabLabel() {
		return this.name;
	}
}