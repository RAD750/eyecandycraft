package com.rgbcraft.baumod.main;

import com.rgbcraft.baumod.main.blocks.*;
import com.rgbcraft.baumod.main.proxies.CommonProxy;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;

import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.src.BaseMod;
/*import net.minecraft.block.Block;
import net.minecraft.block.BlockDoor;
import net.minecraft.block.BlockHalfSlab;
import net.minecraft.block.BlockStep;
import net.minecraft.block.BlockWoodSlab;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;*/

@Mod(name="Eyecandycraft", version="1.6", modid="baumod")
public class Main extends BaseMod{

	//proxy per padella
	  @SidedProxy(clientSide="com.rgbcraft.baumod.main.proxies.ClientProxy", serverSide="com.rgbcraft.baumod.main.proxies.ServerProxy")
	  public static CommonProxy proxy;
	
	@Override
	public String getVersion() {
		return "1.6";
	}

	@Override
	public void load() {

		
	}
	
	@PreInit
	public void preInit(FMLPreInitializationEvent event) {
		System.out.println("VIVA LA DMU MANLEY-MOREL");
	}
	
	@Init
	public void init(FMLInitializationEvent event) {
		
		//proxy per modelli techne
		proxy.init(event);
		Blocks.InizializzaBlocchi();
		Blocks.RegistraLingua();
		Blocks.AggiungiCrafting();
		Blocks.AggiungiAttributi();
	}
	
	
	@PostInit
	public void postInit(FMLPostInitializationEvent event) {
		//proxy per modelli techne
	    proxy.postInit(event);
	}
	
	
	
	
}
