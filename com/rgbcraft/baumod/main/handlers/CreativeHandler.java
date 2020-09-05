package com.rgbcraft.baumod.main.handlers;

import com.rgbcraft.baumod.blocks.Blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;


public class CreativeHandler extends CreativeTabs {
	public static CreativeTabs ECCBlocks = new CreativeTab(CreativeTabs.getNextID(), "EyeCandyCraft > Blocks");
	public static CreativeTabs ECCDecorations = new CreativeTab(CreativeTabs.getNextID(), "EyeCandyCraft > Decorations");
	public static CreativeTabs ECCSigns = new CreativeTab(CreativeTabs.getNextID(), "EyeCandyCraft > Signs");

	private String name;

	public CreativeTab(int par1, String par2Str) {
		super(par1, par2Str);
		this.name = par2Str;
	}

	@SideOnly(Side.CLIENT)
	public ItemStack getIconItemStack() {
		if (this.name == ECCBlocks.getTabLabel()) {
			return new ItemStack(Blocks.timberframe.blockID, 1, 0);
		} else if (this.name == ECCDecorations.getTabLabel()) {
			return new ItemStack(Blocks.ParabolaSat.blockID, 1, 0);
		} else if (this.name == ECCSigns.getTabLabel()) {
			return new ItemStack(Items.d_Parkour.itemID, 1, 0);
		}	
			

		return null;
	}

	public String getTranslatedTabLabel() {
		return this.name;
	}
}
