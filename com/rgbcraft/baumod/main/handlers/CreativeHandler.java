package com.rgbcraft.baumod.main.handlers;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;


public class CreativeHandler extends CreativeTabs {
	public static CreativeTabs ECCBlocks = new CreativeTab(CreativeTabs.getNextID(), "EyeCandyCraft Blocks");
	public static CreativeTabs ECCDecorations = new CreativeTab(CreativeTabs.getNextID(), "EyeCandyCraft Decorations");
	public static CreativeTabs ECCSigns = new CreativeTab(CreativeTabs.getNextID(), "EyeCandyCraft Signs");

	private String name;

	public CreativeTab(int par1, String par2Str) {
		super(par1, par2Str);
		this.name = par2Str;
	}

	@SideOnly(Side.CLIENT)
	public ItemStack getIconItemStack() {
		if (this.name == ECCBlocks.getTabLabel()) {
			return new ItemStack(Blocks.blockOsmoGen.blockID, 1, 0);
		} else if (this.name == ECCDecorations.getTabLabel()) {
			return new ItemStack(LiquidUtils.items.get(LiquidUtils.items.size() - 1).itemID, 1, 0);
		} else if (this.name == ECCSigns.getTabLabel()) {
			

		return null;
	}

	public String getTranslatedTabLabel() {
		return this.name;
	}
}
