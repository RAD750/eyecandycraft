package com.rgbcraft.baumod.main.items;

import net.minecraft.creativetab.CreativeTabs;
import com.rgbcraft.baumod.main.items.Metro;
import net.minecraft.item.Item;
import com.rgbcraft.baumod.main.disks.*;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class Items {
	
	//ITEMS
	public static Item molten_glass, straw, metro;
	
	//DISCHI
	
	public static Item ArrakisDisk, SavaraDisk, DaggerfallDisk, TimeForwardDisk, TakeTheATrainDisk, ChattanoogaChooChooDisk, BeyondTheSeaDisk, SolidAsARockDisk, SixteenTonsDisk;
	
	public static void InizializzaItem() {

	
	molten_glass = new Item(24100).setTextureFile("/com/rgbcraft/baumod/textures/items.png").setIconIndex(1)
			.setCreativeTab(CreativeTabs.tabMaterials).setItemName("molten_glass").setMaxStackSize(8);
	
	straw = new Item(24000).setTextureFile("/com/rgbcraft/baumod/textures/items.png").setIconCoord(0, 0)
			.setCreativeTab(CreativeTabs.tabMaterials).setItemName("straw");
	
	metro = new Metro(24101).setTextureFile("/com/rgbcraft/baumod/textures/items.png").setIconIndex(40)
			.setCreativeTab(CreativeTabs.tabMaterials).setItemName("metro").setMaxStackSize(1);
	
	
	//DISCHI
	
	ArrakisDisk = new ArrakisDisk(24200);
	GameRegistry.registerItem(ArrakisDisk, "ArrakisDisk");
	SavaraDisk = new SavaraDisk(24201);
	GameRegistry.registerItem(SavaraDisk, "SavaraDisk");
	DaggerfallDisk = new DaggerfallDisk(24202);
	GameRegistry.registerItem(DaggerfallDisk, "DaggerfallDisk");
	TimeForwardDisk= new TimeForwardDisk(24203);
	GameRegistry.registerItem(TimeForwardDisk, "TimeForwardDisk");
	TakeTheATrainDisk= new TakeTheATrainDisk(24204);
	GameRegistry.registerItem(TakeTheATrainDisk, "TakeTheATrainDisk");
	ChattanoogaChooChooDisk= new ChattanoogaChooChooDisk(24205);
	GameRegistry.registerItem(ChattanoogaChooChooDisk, "ChattanoogaChooChooDisk");
	BeyondTheSeaDisk= new BeyondTheSeaDisk(24206);
	GameRegistry.registerItem(BeyondTheSeaDisk, "BeyondTheSeaDisk");
	SolidAsARockDisk= new SolidAsARockDisk(24207);
	GameRegistry.registerItem(SolidAsARockDisk, "SolidAsARockDisk");
	SixteenTonsDisk= new SixteenTonsDisk(24208);
	GameRegistry.registerItem(SixteenTonsDisk, "SixteenTonsDisk");
	}
	
	public static void RegistraLingua() {
		LanguageRegistry.addName(straw, "Straw");
		LanguageRegistry.addName(metro, "Tape Measure");
		LanguageRegistry.addName(molten_glass, "Molten Glass");
		LanguageRegistry.addName(DaggerfallDisk, "Music Disc");
		LanguageRegistry.addName(ArrakisDisk, "Music Disc");
		LanguageRegistry.addName(SavaraDisk, "Music Disc");
		LanguageRegistry.addName(TimeForwardDisk, "Music Disc");
	}
}
