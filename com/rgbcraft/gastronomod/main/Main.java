package com.rgbcraft.gastronomod.main;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;

import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDoor;
import net.minecraft.block.BlockHalfSlab;
import net.minecraft.block.BlockStep;
import net.minecraft.block.BlockWoodSlab;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.src.BaseMod;
import net.minecraftforge.common.MinecraftForge;

@Mod(name="Gastronomod", version="1.0", modid="gastronomod")
public class Main extends BaseMod{

	
	public static Item molten_glass2;
	
	//Items
	public static Item itemDC, straw;
	
	@Override
	public String getVersion() {
		return "1.0";
	}

	@Override
	public void load() {

		
	}
	
	@PreInit
	public void preInit(FMLPreInitializationEvent event) {
		System.out.println("VIVA L'ALN668.1400");
	}
	
	@Init
	public void init(FMLInitializationEvent event) {

		//MoltenGlass (per craftare gli altri)
		molten_glass2 = new Item(24500).setTextureFile("/com/rgbcraft/gastronomod/textures/items.png").setIconIndex(1).setCreativeTab(CreativeTabs.tabMaterials).setItemName("molten_glass2").setMaxStackSize(8);
		//
		// REGISTRA TUTTI I BLOCCHI
		//
		

		//
		// COME ROMPIAMO IL BLOCCO?!
		//
		
		
		//
		//RECIPE CRAFTING
		//
		
		//GameRegistry.addShapelessRecipe(new ItemStack(grassPath, 1), new Object[]{Block.dirt});
		//GameRegistry.addShapelessRecipe(new ItemStack(Item.wheat, 9), new Object[]{hay});
		//GameRegistry.addShapelessRecipe(new ItemStack(hay, 1), new Object[]{Item.wheat, Item.wheat, Item.wheat, Item.wheat, Item.wheat, Item.wheat, Item.wheat, Item.wheat, Item.wheat});
		//GameRegistry.addSmelting(296, new ItemStack(straw, 1), 0.15f);
		//GameRegistry.addShapelessRecipe(new ItemStack(mortar, 16), new Object[]{Item.clay, Item.clay, Item.clay, Item.clay, Item.bucketWater});
		//GameRegistry.addRecipe(new ItemStack(timberframecrossbrace, 16), new Object[]{"LCL", "CLC", "LCL", 'L', Block.wood, 'C', Item.clay});
		//GameRegistry.addRecipe(new ItemStack(timberframe, 16), new Object[]{"LCL", "LCL", "LCL", 'L', Block.wood, 'C', Item.clay});
		//GameRegistry.addRecipe(new ItemStack(thatch, 16), new Object[]{"   ", "SS ", "SS ", 'S', straw});
		//GameRegistry.addRecipe(new ItemStack(plaster, 16), new Object[]{"   ", " T ", "MCW", 'T', straw, 'M', new ItemStack(Item.dyePowder, 1, 15),'C', Item.clay, 'W', Item.bucketWater});
		//GameRegistry.addRecipe(new ItemStack(hazardstripe, 16), new Object[]{"YBY", "BMB", "YBY", 'Y', new ItemStack(Item.dyePowder, 1, 11), 'B', new ItemStack(Item.dyePowder, 1, 0), 'M', mortar});
		
		//
		// LINGUA
		//
		
		LanguageRegistry.addName(molten_glass2, "Molten Glass 2");

	}
	
	
	@PostInit
	public void postInit(FMLPostInitializationEvent event) {
		
	}
	
	
	
	
}
