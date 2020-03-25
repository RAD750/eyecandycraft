package com.rgbcraft.baumod.main.blocks;

import java.awt.List;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDoor;
import net.minecraft.block.BlockFenceGate;
import net.minecraft.block.BlockHalfSlab;
import net.minecraft.block.BlockStep;
import net.minecraft.block.BlockWoodSlab;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;

public class Blocks {
	// Tutto il resto
	public static Block unbreakableStone, ubLog, ubCobble, ubstonebricks, ubbirch, ubspruce, grassPath, hay, mortar,
			timberframe, timberframecrossbrace, thatch, plaster, hazardstripe, doorSpruce, black_tintedGlass;

	// Plasters
	public static Block orange_plaster, magenta_plaster, light_blue_plaster, yellow_plaster, lime_plaster, pink_plaster,
			gray_plaster, light_gray_plaster, cyan_plaster, blue_plaster, purple_plaster, green_plaster, brown_plaster,
			red_plaster, black_plaster;

	// Terracotta
	public static Block terracotta, white_terracotta, orange_terracotta, magenta_terracotta, light_blue_terracotta,
			yellow_terracotta, lime_terracotta, pink_terracotta, gray_terracotta, light_gray_terracotta,
			cyan_terracotta, blue_terracotta, purple_terracotta, green_terracotta, brown_terracotta, red_terracotta;

	// TODO Mattonella

	// Vetro colorato
	public static Block tintedGlass, white_tintedGlass, orange_tintedGlass, magenta_tintedGlass, light_blue_tintedGlass,
			yellow_tintedGlass, lime_tintedGlass, pink_tintedGlass, gray_tintedGlass, light_gray_tintedGlass,
			cyan_tintedGlass, blue_tintedGlass, purple_tintedGlass, green_tintedGlass, brown_tintedGlass,
			red_tintedGlass;
	public static Item molten_glass;

	// Items
	public static Item itemDC, straw;

	// Tutti i modelli Techne
	public static Block ParabolaSat, AntennaGroundPlane, AntennaSettore900MHz, AntennaSettore2100MHz, AntennaYagiVHF,
			AntennaYagiUHF, AntennaLogperiodica, Traliccio, TraliccioBraccettoSingolo, TraliccioBraccettoDoppio, TraliccioBraccettoSat;
	public static Block Microfono, Telecamera;
	public static Block LampadaOlceseRicci, NeonPiatto, Lampadario, LampadaScrivania, LampioneGiardino, LampioneMuro, Faro, LampionePaloModerno, LampionePaloVecchio;
	public static Block AtariST, Portatile;
	

	public static void InizializzaBlocchi() {
		// dichiara i blocchi
		
		// padella
		ParabolaSat = new ParabolaBlock(846, 0);
		AntennaGroundPlane = new AntennaGroundPlaneBlock(847, 0);
		// AntennaSettori2100MHz = new AntennaSettori2100MHzBlock(848, 0);
		AntennaSettore900MHz = new AntennaSettore900MHzBlock(849, 0);
		AntennaYagiVHF = new AntennaYagiVHFBlock(850, 0);
		AntennaYagiUHF = new AntennaYagiUHFBlock(851, 0);
		AntennaLogperiodica = new AntennaLogperiodicaBlock(852, 0);
		Traliccio = new TraliccioBlock(859, 0);
		TraliccioBraccettoSingolo = new TraliccioBraccettoSingoloBlock(858, 0);
		//TraliccioBraccettoDoppio = new TraliccioBraccettoDoppioBlock(857, 0);
		TraliccioBraccettoSat = new TraliccioBraccettoSatBlock(856, 0);

		// atari ST

		AtariST = new AtariSTBlock(890, 0);
		Portatile = new PortatileBlock(891, 0);

		// lampade
		NeonPiatto = new NeonPiattoBlock(880, 0);
		Lampadario = new LampadarioBlock(881, 0);
		LampadaScrivania = new LampadaScrivaniaBlock(882, 0);
		LampioneGiardino = new LampioneGiardinoBlock(883, 0);
		LampioneMuro = new LampioneMuroBlock(884,0);
		Faro = new FaroBlock(885,0);
		LampionePaloModerno = new LampionePaloModernoBlock(886, 0);
		LampionePaloVecchio = new LampionePaloVecchioBlock(887, 0);
		
		//roba studio TV/radio
		
		Microfono = new MicrofonoBlock(910, 0);
		Telecamera = new TelecameraBlock(911, 0);

		// altri
		unbreakableStone = new Block(173, 1, Material.rock).setCreativeTab(CreativeTabs.tabBlock)
				.setBlockName("ubstone").setHardness(-1);
		ubLog = new Block(174, 4, Material.wood).setHardness(-1).setCreativeTab(CreativeTabs.tabBlock)
				.setBlockName("ubLog");
		ubCobble = new Block(175, 16, Material.rock).setHardness(-1).setCreativeTab(CreativeTabs.tabBlock)
				.setBlockName("ubCobble");
		ubstonebricks = new Block(176, 54, Material.rock).setHardness(-1).setCreativeTab(CreativeTabs.tabBlock)
				.setBlockName("ubSBrick");
		ubspruce = new Block(177, 198, Material.wood).setHardness(-1).setCreativeTab(CreativeTabs.tabBlock)
				.setBlockName("ubspruce");
		ubbirch = new Block(178, 214, Material.wood).setHardness(-1).setCreativeTab(CreativeTabs.tabBlock)
				.setBlockName("ubbirch");
		grassPath = new GrassPath(179, Material.grass).setCreativeTab(CreativeTabs.tabBlock).setBlockName("grassPath")
				.setTextureFile("/com/rgbcraft/baumod/textures/textures.png").setHardness(0.2f)
				.setStepSound(Block.soundGrassFootstep);
		hay = new HayBlock(180, 12, Material.leaves).setTextureFile("/com/rgbcraft/baumod/textures/textures.png")
				.setBlockName("hay").setCreativeTab(CreativeTabs.tabDecorations).setHardness(0.2f);
		straw = new Item(24000).setTextureFile("/com/rgbcraft/baumod/textures/items.png").setIconCoord(0, 0)
				.setCreativeTab(CreativeTabs.tabMaterials).setItemName("straw");
		mortar = new Block(183, 48, Material.rock).setTextureFile("/com/rgbcraft/baumod/textures/textures.png")
				.setCreativeTab(CreativeTabs.tabBlock).setBlockName("mortar").setHardness(1.2f);
		timberframe = new TimberFrame(184, 14, Material.rock, 1)
				.setTextureFile("/com/rgbcraft/baumod/textures/textures.png").setCreativeTab(CreativeTabs.tabBlock)
				.setBlockName("timberframe").setHardness(1.7f);
		timberframecrossbrace = new TimberFrame(185, 13, Material.rock, 2)
				.setTextureFile("/com/rgbcraft/baumod/textures/textures.png").setCreativeTab(CreativeTabs.tabBlock)
				.setBlockName("timberframecrossbrace").setHardness(1.8f);
		thatch = new Block(186, 15, Material.leaves).setTextureFile("/com/rgbcraft/baumod/textures/textures.png")
				.setCreativeTab(CreativeTabs.tabBlock).setBlockName("thatch").setHardness(0.5f);
		plaster = new Block(187, 67, Material.rock).setTextureFile("/com/rgbcraft/baumod/textures/textures.png")
				.setBlockName("plaster").setCreativeTab(CreativeTabs.tabBlock).setHardness(1.0f);
		hazardstripe = new Block(195, 51, Material.rock).setTextureFile("/com/rgbcraft/baumod/textures/textures.png")
				.setBlockName("hzstripe").setCreativeTab(CreativeTabs.tabBlock).setHardness(1.0f);

		// Plaster colorati

		black_plaster = new Block(800, 64, Material.rock).setTextureFile("/com/rgbcraft/baumod/textures/textures.png")
				.setBlockName("black_plaster").setCreativeTab(CreativeTabs.tabBlock).setHardness(1.0f);
		gray_plaster = new Block(801, 65, Material.rock).setTextureFile("/com/rgbcraft/baumod/textures/textures.png")
				.setBlockName("gray_plaster").setCreativeTab(CreativeTabs.tabBlock).setHardness(1.0f);
		light_gray_plaster = new Block(802, 66, Material.rock)
				.setTextureFile("/com/rgbcraft/baumod/textures/textures.png").setBlockName("light_gray_plaster")
				.setCreativeTab(CreativeTabs.tabBlock).setHardness(1.0f);
		red_plaster = new Block(803, 68, Material.rock).setTextureFile("/com/rgbcraft/baumod/textures/textures.png")
				.setBlockName("red_plaster").setCreativeTab(CreativeTabs.tabBlock).setHardness(1.0f);
		orange_plaster = new Block(804, 69, Material.rock).setTextureFile("/com/rgbcraft/baumod/textures/textures.png")
				.setBlockName("orange_plaster").setCreativeTab(CreativeTabs.tabBlock).setHardness(1.0f);
		yellow_plaster = new Block(805, 70, Material.rock).setTextureFile("/com/rgbcraft/baumod/textures/textures.png")
				.setBlockName("yellow_plaster").setCreativeTab(CreativeTabs.tabBlock).setHardness(1.0f);
		lime_plaster = new Block(806, 71, Material.rock).setTextureFile("/com/rgbcraft/baumod/textures/textures.png")
				.setBlockName("lime_plaster").setCreativeTab(CreativeTabs.tabBlock).setHardness(1.0f);
		green_plaster = new Block(807, 72, Material.rock).setTextureFile("/com/rgbcraft/baumod/textures/textures.png")
				.setBlockName("green_plaster").setCreativeTab(CreativeTabs.tabBlock).setHardness(1.0f);
		cyan_plaster = new Block(808, 73, Material.rock).setTextureFile("/com/rgbcraft/baumod/textures/textures.png")
				.setBlockName("cyan_plaster").setCreativeTab(CreativeTabs.tabBlock).setHardness(1.0f);
		light_blue_plaster = new Block(809, 74, Material.rock)
				.setTextureFile("/com/rgbcraft/baumod/textures/textures.png").setBlockName("light_blue_plaster")
				.setCreativeTab(CreativeTabs.tabBlock).setHardness(1.0f);
		blue_plaster = new Block(810, 75, Material.rock).setTextureFile("/com/rgbcraft/baumod/textures/textures.png")
				.setBlockName("blue_plaster").setCreativeTab(CreativeTabs.tabBlock).setHardness(1.0f);
		purple_plaster = new Block(811, 76, Material.rock).setTextureFile("/com/rgbcraft/baumod/textures/textures.png")
				.setBlockName("purple_plaster").setCreativeTab(CreativeTabs.tabBlock).setHardness(1.0f);
		magenta_plaster = new Block(812, 77, Material.rock).setTextureFile("/com/rgbcraft/baumod/textures/textures.png")
				.setBlockName("magenta_plaster").setCreativeTab(CreativeTabs.tabBlock).setHardness(1.0f);
		pink_plaster = new Block(813, 78, Material.rock).setTextureFile("/com/rgbcraft/baumod/textures/textures.png")
				.setBlockName("pink_plaster").setCreativeTab(CreativeTabs.tabBlock).setHardness(1.0f);
		brown_plaster = new Block(814, 79, Material.rock).setTextureFile("/com/rgbcraft/baumod/textures/textures.png")
				.setBlockName("brown_plaster").setCreativeTab(CreativeTabs.tabBlock).setHardness(1.0f);

		// Terracotta

		terracotta = new Block(815, 80, Material.rock).setTextureFile("/com/rgbcraft/baumod/textures/textures.png")
				.setBlockName("terracotta").setCreativeTab(CreativeTabs.tabBlock).setHardness(0.7f);
		gray_terracotta = new Block(816, 81, Material.rock).setTextureFile("/com/rgbcraft/baumod/textures/textures.png")
				.setBlockName("gray_terracotta").setCreativeTab(CreativeTabs.tabBlock).setHardness(0.7f);
		light_gray_terracotta = new Block(817, 82, Material.rock)
				.setTextureFile("/com/rgbcraft/baumod/textures/textures.png").setBlockName("light_gray_terracotta")
				.setCreativeTab(CreativeTabs.tabBlock).setHardness(0.7f);
		white_terracotta = new Block(818, 83, Material.rock)
				.setTextureFile("/com/rgbcraft/baumod/textures/textures.png").setBlockName("white_terracotta")
				.setCreativeTab(CreativeTabs.tabBlock).setHardness(0.7f);
		red_terracotta = new Block(819, 84, Material.rock).setTextureFile("/com/rgbcraft/baumod/textures/textures.png")
				.setBlockName("red_terracotta").setCreativeTab(CreativeTabs.tabBlock).setHardness(0.7f);
		orange_terracotta = new Block(820, 85, Material.rock)
				.setTextureFile("/com/rgbcraft/baumod/textures/textures.png").setBlockName("orange_terracotta")
				.setCreativeTab(CreativeTabs.tabBlock).setHardness(0.7f);
		yellow_terracotta = new Block(821, 86, Material.rock)
				.setTextureFile("/com/rgbcraft/baumod/textures/textures.png").setBlockName("yellow_terracotta")
				.setCreativeTab(CreativeTabs.tabBlock).setHardness(0.7f);
		lime_terracotta = new Block(822, 87, Material.rock).setTextureFile("/com/rgbcraft/baumod/textures/textures.png")
				.setBlockName("lime_terracotta").setCreativeTab(CreativeTabs.tabBlock).setHardness(0.7f);
		green_terracotta = new Block(823, 88, Material.rock)
				.setTextureFile("/com/rgbcraft/baumod/textures/textures.png").setBlockName("green_terracotta")
				.setCreativeTab(CreativeTabs.tabBlock).setHardness(0.7f);
		cyan_terracotta = new Block(824, 89, Material.rock).setTextureFile("/com/rgbcraft/baumod/textures/textures.png")
				.setBlockName("cyan_terracotta").setCreativeTab(CreativeTabs.tabBlock).setHardness(0.7f);
		light_blue_terracotta = new Block(825, 90, Material.rock)
				.setTextureFile("/com/rgbcraft/baumod/textures/textures.png").setBlockName("light_blue_terracotta")
				.setCreativeTab(CreativeTabs.tabBlock).setHardness(0.7f);
		blue_terracotta = new Block(826, 91, Material.rock).setTextureFile("/com/rgbcraft/baumod/textures/textures.png")
				.setBlockName("blue_terracotta").setCreativeTab(CreativeTabs.tabBlock).setHardness(0.7f);
		purple_terracotta = new Block(827, 92, Material.rock)
				.setTextureFile("/com/rgbcraft/baumod/textures/textures.png").setBlockName("purple_terracotta")
				.setCreativeTab(CreativeTabs.tabBlock).setHardness(0.7f);
		magenta_terracotta = new Block(828, 93, Material.rock)
				.setTextureFile("/com/rgbcraft/baumod/textures/textures.png").setBlockName("magenta_terracotta")
				.setCreativeTab(CreativeTabs.tabBlock).setHardness(0.7f);
		pink_terracotta = new Block(829, 94, Material.rock).setTextureFile("/com/rgbcraft/baumod/textures/textures.png")
				.setBlockName("pink_terracotta").setCreativeTab(CreativeTabs.tabBlock).setHardness(0.7f);
		brown_terracotta = new Block(830, 95, Material.rock)
				.setTextureFile("/com/rgbcraft/baumod/textures/textures.png").setBlockName("brown_terracotta")
				.setCreativeTab(CreativeTabs.tabBlock).setHardness(0.7f);

		// Vetri colorati

		// MoltenGlass (per craftare gli altri)
		molten_glass = new Item(24100).setTextureFile("/com/rgbcraft/baumod/textures/items.png").setIconIndex(1)
				.setCreativeTab(CreativeTabs.tabMaterials).setItemName("molten_glass").setMaxStackSize(8);
		// I vetri veri e propri
		black_tintedGlass = new TintedGlass(196, 96, Material.glass).setCreativeTab(CreativeTabs.tabDecorations)
				.setBlockName("black_tintedGlass").setTextureFile("/com/rgbcraft/baumod/textures/textures.png")
				.setHardness(0.2f).setStepSound(Block.soundGlassFootstep);
		gray_tintedGlass = new TintedGlass(197, 97, Material.glass).setCreativeTab(CreativeTabs.tabDecorations)
				.setBlockName("gray_tintedGlass").setTextureFile("/com/rgbcraft/baumod/textures/textures.png")
				.setHardness(0.2f).setStepSound(Block.soundGlassFootstep);
		light_gray_tintedGlass = new TintedGlass(832, 98, Material.glass).setCreativeTab(CreativeTabs.tabDecorations)
				.setBlockName("light_gray_tintedGlass").setTextureFile("/com/rgbcraft/baumod/textures/textures.png")
				.setHardness(0.2f).setStepSound(Block.soundGlassFootstep);
		white_tintedGlass = new TintedGlass(198, 99, Material.glass).setCreativeTab(CreativeTabs.tabDecorations)
				.setBlockName("white_tintedGlass").setTextureFile("/com/rgbcraft/baumod/textures/textures.png")
				.setHardness(0.2f).setStepSound(Block.soundGlassFootstep);
		red_tintedGlass = new TintedGlass(834, 100, Material.glass).setCreativeTab(CreativeTabs.tabDecorations)
				.setBlockName("red_tintedGlass").setTextureFile("/com/rgbcraft/baumod/textures/textures.png")
				.setHardness(0.2f).setStepSound(Block.soundGlassFootstep);
		orange_tintedGlass = new TintedGlass(835, 101, Material.glass).setCreativeTab(CreativeTabs.tabDecorations)
				.setBlockName("orange_tintedGlass").setTextureFile("/com/rgbcraft/baumod/textures/textures.png")
				.setHardness(0.2f).setStepSound(Block.soundGlassFootstep);
		yellow_tintedGlass = new TintedGlass(836, 102, Material.glass).setCreativeTab(CreativeTabs.tabDecorations)
				.setBlockName("yellow_tintedGlass").setTextureFile("/com/rgbcraft/baumod/textures/textures.png")
				.setHardness(0.2f).setStepSound(Block.soundGlassFootstep);
		lime_tintedGlass = new TintedGlass(837, 103, Material.glass).setCreativeTab(CreativeTabs.tabDecorations)
				.setBlockName("lime_tintedGlass").setTextureFile("/com/rgbcraft/baumod/textures/textures.png")
				.setHardness(0.2f).setStepSound(Block.soundGlassFootstep);
		green_tintedGlass = new TintedGlass(838, 104, Material.glass).setCreativeTab(CreativeTabs.tabDecorations)
				.setBlockName("green_tintedGlass").setTextureFile("/com/rgbcraft/baumod/textures/textures.png")
				.setHardness(0.2f).setStepSound(Block.soundGlassFootstep);
		cyan_tintedGlass = new TintedGlass(839, 105, Material.glass).setCreativeTab(CreativeTabs.tabDecorations)
				.setBlockName("cyan_tintedGlass").setTextureFile("/com/rgbcraft/baumod/textures/textures.png")
				.setHardness(0.2f).setStepSound(Block.soundGlassFootstep);
		light_blue_tintedGlass = new TintedGlass(199, 106, Material.glass).setCreativeTab(CreativeTabs.tabDecorations)
				.setBlockName("light_blue_tintedGlass").setTextureFile("/com/rgbcraft/baumod/textures/textures.png")
				.setHardness(0.2f).setStepSound(Block.soundGlassFootstep);
		blue_tintedGlass = new TintedGlass(841, 107, Material.glass).setCreativeTab(CreativeTabs.tabDecorations)
				.setBlockName("blue_tintedGlass").setTextureFile("/com/rgbcraft/baumod/textures/textures.png")
				.setHardness(0.2f).setStepSound(Block.soundGlassFootstep);
		purple_tintedGlass = new TintedGlass(842, 108, Material.glass).setCreativeTab(CreativeTabs.tabDecorations)
				.setBlockName("purple_tintedGlass").setTextureFile("/com/rgbcraft/baumod/textures/textures.png")
				.setHardness(0.2f).setStepSound(Block.soundGlassFootstep);
		magenta_tintedGlass = new TintedGlass(843, 109, Material.glass).setCreativeTab(CreativeTabs.tabDecorations)
				.setBlockName("magenta_tintedGlass").setTextureFile("/com/rgbcraft/baumod/textures/textures.png")
				.setHardness(0.2f).setStepSound(Block.soundGlassFootstep);
		pink_tintedGlass = new TintedGlass(844, 110, Material.glass).setCreativeTab(CreativeTabs.tabDecorations)
				.setBlockName("pink_tintedGlass").setTextureFile("/com/rgbcraft/baumod/textures/textures.png")
				.setHardness(0.2f).setStepSound(Block.soundGlassFootstep);
		brown_tintedGlass = new TintedGlass(845, 111, Material.glass).setCreativeTab(CreativeTabs.tabDecorations)
				.setBlockName("brown_tintedGlass").setTextureFile("/com/rgbcraft/baumod/textures/textures.png")
				.setHardness(0.2f).setStepSound(Block.soundGlassFootstep);

		//
		// REGISTRA TUTTI I BLOCCHI
		//

		GameRegistry.registerBlock(unbreakableStone, "ubstone");
		GameRegistry.registerBlock(ubCobble, "ubcobble");
		GameRegistry.registerBlock(ubLog, "ubLog");
		GameRegistry.registerBlock(ubstonebricks, "ubSBrick");
		GameRegistry.registerBlock(ubspruce, "ubspruce");
		GameRegistry.registerBlock(ubbirch, "ubbirch");
		GameRegistry.registerBlock(grassPath, "grassPath");
		GameRegistry.registerBlock(hay, "hay");
		GameRegistry.registerBlock(mortar, "mortar");
		GameRegistry.registerBlock(timberframe, "timberframe");
		GameRegistry.registerBlock(timberframecrossbrace, "timberframecrossbrace");
		GameRegistry.registerBlock(thatch, "thatch");
		GameRegistry.registerBlock(plaster, "plaster");
		GameRegistry.registerBlock(hazardstripe, "hzstripe");

		// Plaster colorati
		GameRegistry.registerBlock(black_plaster, "black_plaster");
		GameRegistry.registerBlock(gray_plaster, "gray_plaster");
		GameRegistry.registerBlock(light_gray_plaster, "light_gray_plaster");
		GameRegistry.registerBlock(red_plaster, "red_plaster");
		GameRegistry.registerBlock(orange_plaster, "orange_plaster");
		GameRegistry.registerBlock(yellow_plaster, "yellow_plaster");
		GameRegistry.registerBlock(lime_plaster, "lime_plaster");
		GameRegistry.registerBlock(green_plaster, "green_plaster");
		GameRegistry.registerBlock(cyan_plaster, "cyan_plaster");
		GameRegistry.registerBlock(light_blue_plaster, "light_blue_plaster");
		GameRegistry.registerBlock(blue_plaster, "blue_plaster");
		GameRegistry.registerBlock(purple_plaster, "purple_plaster");
		GameRegistry.registerBlock(magenta_plaster, "magenta_plaster");
		GameRegistry.registerBlock(pink_plaster, "pink_plaster");
		GameRegistry.registerBlock(brown_plaster, "brown_plaster");

		// Terracotta
		GameRegistry.registerBlock(terracotta, "black_terracotta");
		GameRegistry.registerBlock(gray_terracotta, "gray_terracotta");
		GameRegistry.registerBlock(light_gray_terracotta, "light_gray_terracotta");
		GameRegistry.registerBlock(white_terracotta, "white_terracotta");
		GameRegistry.registerBlock(red_terracotta, "red_terracotta");
		GameRegistry.registerBlock(orange_terracotta, "orange_terracotta");
		GameRegistry.registerBlock(yellow_terracotta, "yellow_terracotta");
		GameRegistry.registerBlock(lime_terracotta, "lime_terracotta");
		GameRegistry.registerBlock(green_terracotta, "green_terracotta");
		GameRegistry.registerBlock(cyan_terracotta, "cyan_terracotta");
		GameRegistry.registerBlock(light_blue_terracotta, "light_blue_terracotta");
		GameRegistry.registerBlock(blue_terracotta, "blue_terracotta");
		GameRegistry.registerBlock(purple_terracotta, "purple_terracotta");
		GameRegistry.registerBlock(magenta_terracotta, "magenta_terracotta");
		GameRegistry.registerBlock(pink_terracotta, "pink_terracotta");
		GameRegistry.registerBlock(brown_terracotta, "brown_terracotta");

		// TODO Mattonella

		// TintedGlass
		GameRegistry.registerBlock(black_tintedGlass, "black_tintedGlass");
		GameRegistry.registerBlock(gray_tintedGlass, "gray_tintedGlass");
		GameRegistry.registerBlock(light_gray_tintedGlass, "light_gray_tintedGlass");
		GameRegistry.registerBlock(white_tintedGlass, "white_tintedGlass");
		GameRegistry.registerBlock(red_tintedGlass, "red_tintedGlass");
		GameRegistry.registerBlock(orange_tintedGlass, "orange_tintedGlass");
		GameRegistry.registerBlock(yellow_tintedGlass, "yellow_tintedGlass");
		GameRegistry.registerBlock(lime_tintedGlass, "lime_tintedGlass");
		GameRegistry.registerBlock(green_tintedGlass, "green_tintedGlass");
		GameRegistry.registerBlock(cyan_tintedGlass, "cyan_tintedGlass");
		GameRegistry.registerBlock(light_blue_tintedGlass, "light_blue_tintedGlass");
		GameRegistry.registerBlock(blue_tintedGlass, "blue_tintedGlass");
		GameRegistry.registerBlock(purple_tintedGlass, "purple_tintedGlass");
		GameRegistry.registerBlock(magenta_tintedGlass, "magenta_tintedGlass");
		GameRegistry.registerBlock(pink_tintedGlass, "pink_tintedGlass");
		GameRegistry.registerBlock(brown_tintedGlass, "brown_tintedGlass");

		// Padella Satellitare
		GameRegistry.registerBlock(ParabolaSat, "ParabolaSat");
		GameRegistry.registerTileEntity(com.rgbcraft.baumod.main.entities.TileEntityParabolaSat.class,
				"ParabolaSatTileEntity");
		GameRegistry.registerBlock(AntennaGroundPlane, "AntennaGroundPlane");
		GameRegistry.registerTileEntity(com.rgbcraft.baumod.main.entities.TileEntityAntennaGroundPlane.class,
				"AntennaGroundPlaneTileEntity");
		GameRegistry.registerBlock(AntennaYagiVHF, "AntennaYagiVHF");
		GameRegistry.registerTileEntity(com.rgbcraft.baumod.main.entities.TileEntityAntennaYagiVHF.class,
				"AntennaYagiVHFTileEntity");
		GameRegistry.registerBlock(AntennaSettore900MHz, "AntennaSettore900MHz");
		GameRegistry.registerTileEntity(com.rgbcraft.baumod.main.entities.TileEntityAntennaSettore900MHz.class,
				"AntennaSettore900MHzTileEntity");
		GameRegistry.registerBlock(AntennaYagiUHF, "AntennaYagiUHF");
		GameRegistry.registerTileEntity(com.rgbcraft.baumod.main.entities.TileEntityAntennaYagiUHF.class,
				"AntennaYagiUHFTileEntity");
		GameRegistry.registerBlock(AntennaLogperiodica, "AntennaLogperiodica");
		GameRegistry.registerTileEntity(com.rgbcraft.baumod.main.entities.TileEntityAntennaLogperiodica.class,
				"AntennaLogperiodicaTileEntity");
		GameRegistry.registerBlock(Traliccio, "Traliccio");
		GameRegistry.registerTileEntity(com.rgbcraft.baumod.main.entities.TileEntityTraliccio.class,
				"TraliccioTileEntity");
		GameRegistry.registerBlock(TraliccioBraccettoSingolo, "TraliccioBraccettoSingolo");
		GameRegistry.registerTileEntity(com.rgbcraft.baumod.main.entities.TileEntityTraliccioBraccettoSingolo.class,
				"TraliccioBraccettoSingoloTileEntity");
		GameRegistry.registerBlock(TraliccioBraccettoSat, "TraliccioBraccettoSat");
		GameRegistry.registerTileEntity(com.rgbcraft.baumod.main.entities.TileEntityTraliccioBraccettoSat.class,
				"TraliccioBraccettoSatTileEntity");
		
		// Atari ST
	
		GameRegistry.registerBlock(AtariST, "Atari ST");
		GameRegistry.registerTileEntity(com.rgbcraft.baumod.main.entities.TileEntityAtariST.class, "AtariSTTileEntity");
		
		GameRegistry.registerBlock(Portatile, "Portatile");
		GameRegistry.registerTileEntity(com.rgbcraft.baumod.main.entities.TileEntityPortatile.class, "PortatileTileEntity");

		// Lampade

		GameRegistry.registerBlock(NeonPiatto, "NeonPiatto");
		GameRegistry.registerTileEntity(com.rgbcraft.baumod.main.entities.TileEntityNeonPiatto.class, "NeonPiatto");
		GameRegistry.registerBlock(Lampadario, "Lampadario");
		GameRegistry.registerTileEntity(com.rgbcraft.baumod.main.entities.TileEntityLampadario.class, "Lampadario");
		GameRegistry.registerBlock(LampadaScrivania, "LampadaScrivania");
		GameRegistry.registerTileEntity(com.rgbcraft.baumod.main.entities.TileEntityLampadaScrivania.class, "LampadaScrivania");
		GameRegistry.registerBlock(LampioneGiardino, "LampioneGiardino");
		GameRegistry.registerTileEntity(com.rgbcraft.baumod.main.entities.TileEntityLampioneGiardino.class, "LampioneGiardino");
		GameRegistry.registerBlock(LampioneMuro, "LampioneMuro");
		GameRegistry.registerTileEntity(com.rgbcraft.baumod.main.entities.TileEntityLampioneMuro.class, "LampioneMuro");
		GameRegistry.registerBlock(Faro, "Faro");
		GameRegistry.registerTileEntity(com.rgbcraft.baumod.main.entities.TileEntityFaro.class, "Faro");
		GameRegistry.registerBlock(LampionePaloVecchio, "LampionePaloVecchio");
		GameRegistry.registerTileEntity(com.rgbcraft.baumod.main.entities.TileEntityLampionePaloVecchio.class, "LampionePaloVecchio");
		GameRegistry.registerBlock(LampionePaloModerno, "LampionePaloModerno");
		GameRegistry.registerTileEntity(com.rgbcraft.baumod.main.entities.TileEntityLampionePaloModerno.class, "LampionePaloModerno");
	
		//studio TV/radio
		
		GameRegistry.registerBlock(Microfono, "Microfono");
		GameRegistry.registerTileEntity(com.rgbcraft.baumod.main.entities.TileEntityMicrofono.class, "Microfono");
		GameRegistry.registerBlock(Telecamera, "Telecamera");
		GameRegistry.registerTileEntity(com.rgbcraft.baumod.main.entities.TileEntityTelecamera.class, "Telecamera");
		
	}

	public static void RegistraLingua() {
		//
		// LINGUA
		//

		// Parabola e antenne

		LanguageRegistry.addName(ParabolaSat, "Satellite Dish");
		LanguageRegistry.addName(AntennaGroundPlane, "Ground plane antenna");
		LanguageRegistry.addName(AntennaSettore900MHz, "900 MHz Sector antenna");
		LanguageRegistry.addName(AntennaYagiVHF, "VHF Yagi-Uda antenna");
		LanguageRegistry.addName(AntennaYagiUHF, "UHF Yagi-Uda antenna");
		LanguageRegistry.addName(AntennaLogperiodica, "Log-periodic antenna");
		
		LanguageRegistry.addName(Traliccio, "Lattice Post");
		LanguageRegistry.addName(TraliccioBraccettoSingolo, "Single Bracket");
		LanguageRegistry.addName(TraliccioBraccettoSat, "Satellite Dish Bracket");

		// Lampade
		LanguageRegistry.addName(NeonPiatto, "Fluorescent Fixture");
		LanguageRegistry.addName(Lampadario, "Pendant Fixture");
		LanguageRegistry.addName(LampadaScrivania, "Desk Lamp");
		LanguageRegistry.addName(LampioneGiardino, "Garden Light");
		LanguageRegistry.addName(LampioneMuro, "Old Street Light (wall-mount)");
		LanguageRegistry.addName(LampionePaloVecchio, "Old Street Light (pole-mount)");
		LanguageRegistry.addName(LampionePaloModerno, "Modern Street Light (pole-mount)");
		LanguageRegistry.addName(Faro, "Floodlight");

		//roba tv/studio radio
		
		LanguageRegistry.addName(Microfono, "Studio Microphone");
		LanguageRegistry.addName(Telecamera, "TV Camera");
		
		// altro
		LanguageRegistry.addName(AtariST, "Personal Computer");
		LanguageRegistry.addName(Portatile, "Laptop Computer");

		LanguageRegistry.addName(unbreakableStone, "Unbreakable Stone");
		LanguageRegistry.addName(ubstonebricks, "Unbreakable Stone Bricks");
		LanguageRegistry.addName(ubCobble, "Unbreakable Cobblestone");
		LanguageRegistry.addName(ubLog, "Unbreakable Oak Planks");
		LanguageRegistry.addName(ubspruce, "Unbreakable Spruce Planks");
		LanguageRegistry.addName(ubbirch, "Unbreakable Birch Planks");
		LanguageRegistry.addName(grassPath, "Grass Path");
		LanguageRegistry.addName(hay, "Hay Block");
		LanguageRegistry.addName(straw, "Straw");
		LanguageRegistry.addName(mortar, "Mortar Wall");
		LanguageRegistry.addName(timberframe, "Timberframe");
		LanguageRegistry.addName(timberframecrossbrace, "Timberframe Cross-Brace");
		LanguageRegistry.addName(thatch, "Thatch");
		LanguageRegistry.addName(hazardstripe, "Hazard Stripes");

		// Plaster colorati
		LanguageRegistry.addName(black_plaster, "Black Plaster");
		LanguageRegistry.addName(gray_plaster, "Gray Plaster");
		LanguageRegistry.addName(light_gray_plaster, "Light Gray Plaster");
		LanguageRegistry.addName(plaster, " White Plaster");
		LanguageRegistry.addName(red_plaster, "Red Plaster");
		LanguageRegistry.addName(orange_plaster, "Orange Plaster");
		LanguageRegistry.addName(yellow_plaster, "Yellow Plaster");
		LanguageRegistry.addName(lime_plaster, "Lime Plaster");
		LanguageRegistry.addName(green_plaster, "Green Plaster");
		LanguageRegistry.addName(cyan_plaster, "Cyan Plaster");
		LanguageRegistry.addName(light_blue_plaster, "Light Blue Plaster");
		LanguageRegistry.addName(blue_plaster, "Blue Plaster");
		LanguageRegistry.addName(purple_plaster, "Purple Plaster");
		LanguageRegistry.addName(magenta_plaster, "Magenta Plaster");
		LanguageRegistry.addName(pink_plaster, "Pink Plaster");
		LanguageRegistry.addName(brown_plaster, "Brown Plaster");

		// Terracotta
		LanguageRegistry.addName(terracotta, "Terracotta");
		LanguageRegistry.addName(gray_terracotta, "Gray Terracotta");
		LanguageRegistry.addName(light_gray_terracotta, "Light Gray Terracotta");
		LanguageRegistry.addName(white_terracotta, "White Terracotta");
		LanguageRegistry.addName(red_terracotta, "Red Terracotta");
		LanguageRegistry.addName(orange_terracotta, "Orange Terracotta");
		LanguageRegistry.addName(yellow_terracotta, "Yellow Terracotta");
		LanguageRegistry.addName(lime_terracotta, "Lime Terracotta");
		LanguageRegistry.addName(green_terracotta, "Green Terracotta");
		LanguageRegistry.addName(cyan_terracotta, "Cyan Terracotta");
		LanguageRegistry.addName(light_blue_terracotta, "Light Blue Terracotta");
		LanguageRegistry.addName(blue_terracotta, "Blue Terracotta");
		LanguageRegistry.addName(purple_terracotta, "Purple Terracotta");
		LanguageRegistry.addName(magenta_terracotta, "Magenta Terracotta");
		LanguageRegistry.addName(pink_terracotta, "Pink Terracotta");
		LanguageRegistry.addName(brown_terracotta, "Brown Terracotta");

		// TODO Mattonella

		// TintedGlass
		LanguageRegistry.addName(molten_glass, "Molten Glass");
		LanguageRegistry.addName(black_tintedGlass, "Black Tinted Glass");
		LanguageRegistry.addName(gray_tintedGlass, "Gray Tinted Glass");
		LanguageRegistry.addName(light_gray_tintedGlass, "Light Gray Tinted Glass");
		LanguageRegistry.addName(white_tintedGlass, "White Tinted Glass");
		LanguageRegistry.addName(red_tintedGlass, "Red Tinted Glass");
		LanguageRegistry.addName(orange_tintedGlass, "Orange Tinted Glass");
		LanguageRegistry.addName(yellow_tintedGlass, "Yellow Tinted Glass");
		LanguageRegistry.addName(lime_tintedGlass, "Lime Tinted Glass");
		LanguageRegistry.addName(green_tintedGlass, "Green Tinted Glass");
		LanguageRegistry.addName(cyan_tintedGlass, "Cyan Tinted Glass");
		LanguageRegistry.addName(light_blue_tintedGlass, "Light Blue Tinted Glass");
		LanguageRegistry.addName(blue_tintedGlass, "Blue Tinted Glass");
		LanguageRegistry.addName(purple_tintedGlass, "Purple Tinted Glass");
		LanguageRegistry.addName(magenta_tintedGlass, "Magenta Tinted Glass");
		LanguageRegistry.addName(pink_tintedGlass, "Pink Tinted Glass");
		LanguageRegistry.addName(brown_tintedGlass, "Brown Tinted Glass");
	}

	public static void AggiungiAttributi() {
		//
		// COME ROMPIAMO IL BLOCCO?!
		//

		MinecraftForge.setBlockHarvestLevel(grassPath, "shovel", 0);
		MinecraftForge.setBlockHarvestLevel(hay, "axe", 0);
		MinecraftForge.setBlockHarvestLevel(mortar, "pickaxe", 0);
		MinecraftForge.setBlockHarvestLevel(timberframe, "pickaxe", 0);
		MinecraftForge.setBlockHarvestLevel(timberframecrossbrace, "pickaxe", 0);
		MinecraftForge.setBlockHarvestLevel(thatch, "axe", 0);
		MinecraftForge.setBlockHarvestLevel(plaster, "pickaxe", 0);
		MinecraftForge.setBlockHarvestLevel(hazardstripe, "pickaxe", 0);

		// Plaster colorati
		MinecraftForge.setBlockHarvestLevel(black_plaster, "pickaxe", 0);
		MinecraftForge.setBlockHarvestLevel(gray_plaster, "pickaxe", 0);
		MinecraftForge.setBlockHarvestLevel(light_gray_plaster, "pickaxe", 0);
		MinecraftForge.setBlockHarvestLevel(red_plaster, "pickaxe", 0);
		MinecraftForge.setBlockHarvestLevel(orange_plaster, "pickaxe", 0);
		MinecraftForge.setBlockHarvestLevel(yellow_plaster, "pickaxe", 0);
		MinecraftForge.setBlockHarvestLevel(lime_plaster, "pickaxe", 0);
		MinecraftForge.setBlockHarvestLevel(green_plaster, "pickaxe", 0);
		MinecraftForge.setBlockHarvestLevel(cyan_plaster, "pickaxe", 0);
		MinecraftForge.setBlockHarvestLevel(light_blue_plaster, "pickaxe", 0);
		MinecraftForge.setBlockHarvestLevel(blue_plaster, "pickaxe", 0);
		MinecraftForge.setBlockHarvestLevel(purple_plaster, "pickaxe", 0);
		MinecraftForge.setBlockHarvestLevel(magenta_plaster, "pickaxe", 0);
		MinecraftForge.setBlockHarvestLevel(pink_plaster, "pickaxe", 0);
		MinecraftForge.setBlockHarvestLevel(brown_plaster, "pickaxe", 0);

		// Terracotta
		MinecraftForge.setBlockHarvestLevel(terracotta, "pickaxe", 0);
		MinecraftForge.setBlockHarvestLevel(gray_terracotta, "pickaxe", 0);
		MinecraftForge.setBlockHarvestLevel(light_gray_terracotta, "pickaxe", 0);
		MinecraftForge.setBlockHarvestLevel(white_terracotta, "pickaxe", 0);
		MinecraftForge.setBlockHarvestLevel(red_terracotta, "pickaxe", 0);
		MinecraftForge.setBlockHarvestLevel(orange_terracotta, "pickaxe", 0);
		MinecraftForge.setBlockHarvestLevel(yellow_terracotta, "pickaxe", 0);
		MinecraftForge.setBlockHarvestLevel(lime_terracotta, "pickaxe", 0);
		MinecraftForge.setBlockHarvestLevel(green_terracotta, "pickaxe", 0);
		MinecraftForge.setBlockHarvestLevel(cyan_terracotta, "pickaxe", 0);
		MinecraftForge.setBlockHarvestLevel(light_blue_terracotta, "pickaxe", 0);
		MinecraftForge.setBlockHarvestLevel(blue_terracotta, "pickaxe", 0);
		MinecraftForge.setBlockHarvestLevel(purple_terracotta, "pickaxe", 0);
		MinecraftForge.setBlockHarvestLevel(magenta_terracotta, "pickaxe", 0);
		MinecraftForge.setBlockHarvestLevel(pink_terracotta, "pickaxe", 0);
		MinecraftForge.setBlockHarvestLevel(brown_terracotta, "pickaxe", 0);

	}

	public static void AggiungiCrafting() {

		//
		// RECIPE CRAFTING
		//

		// Antenne
		GameRegistry.addRecipe(new ItemStack(ParabolaSat, 1),
				new Object[] { "II ", "II ", "  R", 'I', Item.ingotIron, 'R', Item.redstone });
		GameRegistry.addRecipe(new ItemStack(AntennaGroundPlane, 1),
				new Object[] { " I ", " R ", "I I", 'I', Item.ingotIron, 'R', Item.redstone });
		GameRegistry.addRecipe(new ItemStack(AntennaLogperiodica, 1),
				new Object[] { "II ", "RII", "II ", 'I', Item.ingotIron, 'R', Item.redstone });
		GameRegistry.addRecipe(new ItemStack(AntennaYagiVHF, 1),
				new Object[] { "I I", "III", "IRI", 'I', Item.ingotIron, 'R', Item.redstone });
		GameRegistry.addRecipe(new ItemStack(AntennaYagiUHF, 1),
				new Object[] { "I  ", "RII", "I  ", 'I', Item.ingotIron, 'R', Item.redstone });
		GameRegistry.addRecipe(new ItemStack(AntennaSettore900MHz, 1),
				new Object[] { " I ", "RRR", " I ", 'I', Item.ingotIron, 'R', Item.redstone });
		GameRegistry.addRecipe(new ItemStack(Traliccio, 4),
				new Object[] { "I I", "III", "I I", 'I', Item.ingotIron});
		GameRegistry.addRecipe(new ItemStack(TraliccioBraccettoSat, 1),
				new Object[] { "   ", " TI", "   ", 'I', Item.ingotIron, 'T', Traliccio});
		GameRegistry.addRecipe(new ItemStack(TraliccioBraccettoSingolo, 1),
				new Object[] { "   ", "TII", "   ", 'I', Item.ingotIron, 'T', Traliccio});

		// Lampade
		GameRegistry.addRecipe(new ItemStack(NeonPiatto, 1), new Object[] { "IGI", "GLG", "IGI", 'I', Item.ingotIron,
				'G', Block.thinGlass, 'L', Item.lightStoneDust });
		GameRegistry.addRecipe(new ItemStack(Lampadario, 1), new Object[] { " I ", "III", " L ", 'I', Item.ingotIron,
				'L', Item.lightStoneDust });
		GameRegistry.addRecipe(new ItemStack(LampadaScrivania, 1), new Object[] { "III", "I L", "I  ", 'I', Item.ingotIron,
				'L', Item.lightStoneDust});
		GameRegistry.addRecipe(new ItemStack(LampioneMuro, 1), new Object[] { "III", "  L", "   ", 'I', Item.ingotIron,
				'L', Item.lightStoneDust});
		GameRegistry.addRecipe(new ItemStack(LampioneGiardino, 1), new Object[] { " R ", " L ", " I ", 'I', Item.ingotIron,
				'L', Item.lightStoneDust, 'R', Item.redstone});
		GameRegistry.addRecipe(new ItemStack(LampionePaloModerno, 1), new Object[] { "   ", "IIL", "   ", 'I', Item.ingotIron,
				'L', Item.lightStoneDust});
		GameRegistry.addRecipe(new ItemStack(LampionePaloVecchio, 1), new Object[] { "   ", "III", "  L", 'I', Item.ingotIron,
				'L', Item.lightStoneDust});
		GameRegistry.addRecipe(new ItemStack(Faro, 1), new Object[] { "ILI", "ILI", " I ", 'I', Item.ingotIron,
				'L', Item.lightStoneDust});
		

		//Confuser
		GameRegistry.addRecipe(new ItemStack(AtariST, 1), new Object[] { "IRI", "ILI", "IGI", 'I', Item.ingotIron,
				'R', Item.redstone, 'L', Item.lightStoneDust, 'G', Block.thinGlass });
		GameRegistry.addRecipe(new ItemStack(Portatile, 1), new Object[] { "ILI", "IGI", "IRI", 'I', Item.ingotIron,
				'R', Item.redstone, 'L', Item.lightStoneDust, 'G', Block.thinGlass });
		
		//Studio TV
		GameRegistry.addRecipe(new ItemStack(Microfono, 1), new Object[] { "IRI", "I I", " I ", 'I', Item.ingotIron,
				'R', Item.redstone});
		GameRegistry.addRecipe(new ItemStack(Telecamera, 1), new Object[] { "  I", "RII", " II", 'I', Item.ingotIron,
				'R', Item.redstone});
		
		GameRegistry.addShapelessRecipe(new ItemStack(grassPath, 1), new Object[] { Block.dirt });
		GameRegistry.addShapelessRecipe(new ItemStack(Item.wheat, 9), new Object[] { hay });
		GameRegistry.addShapelessRecipe(new ItemStack(hay, 1), new Object[] { Item.wheat, Item.wheat, Item.wheat,
				Item.wheat, Item.wheat, Item.wheat, Item.wheat, Item.wheat, Item.wheat });
		GameRegistry.addSmelting(296, new ItemStack(straw, 1), 0.15f);
		GameRegistry.addShapelessRecipe(new ItemStack(mortar, 16),
				new Object[] { Item.clay, Item.clay, Item.clay, Item.clay, Item.bucketWater });
		GameRegistry.addRecipe(new ItemStack(timberframecrossbrace, 16),
				new Object[] { "LCL", "CLC", "LCL", 'L', Block.wood, 'C', Item.clay });
		GameRegistry.addRecipe(new ItemStack(timberframe, 16),
				new Object[] { "LCL", "LCL", "LCL", 'L', Block.wood, 'C', Item.clay });
		GameRegistry.addRecipe(new ItemStack(thatch, 16), new Object[] { "   ", "SS ", "SS ", 'S', straw });
		GameRegistry.addRecipe(new ItemStack(plaster, 16), new Object[] { "   ", " T ", "MCW", 'T', straw, 'M',
				new ItemStack(Item.dyePowder, 1, 15), 'C', Item.clay, 'W', Item.bucketWater });
		GameRegistry.addRecipe(new ItemStack(hazardstripe, 16), new Object[] { "YBY", "BMB", "YBY", 'Y',
				new ItemStack(Item.dyePowder, 1, 11), 'B', new ItemStack(Item.dyePowder, 1, 0), 'M', mortar });

		// Plaster colorati
		GameRegistry.addShapelessRecipe(new ItemStack(black_plaster, 1),
				new Object[] { plaster, new ItemStack(Item.dyePowder, 1, 0) });
		GameRegistry.addShapelessRecipe(new ItemStack(red_plaster, 1),
				new Object[] { plaster, new ItemStack(Item.dyePowder, 1, 1) });
		GameRegistry.addShapelessRecipe(new ItemStack(green_plaster, 1),
				new Object[] { plaster, new ItemStack(Item.dyePowder, 1, 2) });
		GameRegistry.addShapelessRecipe(new ItemStack(brown_plaster, 1),
				new Object[] { plaster, new ItemStack(Item.dyePowder, 1, 3) });
		GameRegistry.addShapelessRecipe(new ItemStack(blue_plaster, 1),
				new Object[] { plaster, new ItemStack(Item.dyePowder, 1, 4) });
		GameRegistry.addShapelessRecipe(new ItemStack(purple_plaster, 1),
				new Object[] { plaster, new ItemStack(Item.dyePowder, 1, 5) });
		GameRegistry.addShapelessRecipe(new ItemStack(cyan_plaster, 1),
				new Object[] { plaster, new ItemStack(Item.dyePowder, 1, 6) });
		GameRegistry.addShapelessRecipe(new ItemStack(light_gray_plaster, 1),
				new Object[] { plaster, new ItemStack(Item.dyePowder, 1, 7) });
		GameRegistry.addShapelessRecipe(new ItemStack(gray_plaster, 1),
				new Object[] { plaster, new ItemStack(Item.dyePowder, 1, 8) });
		GameRegistry.addShapelessRecipe(new ItemStack(pink_plaster, 1),
				new Object[] { plaster, new ItemStack(Item.dyePowder, 1, 9) });
		GameRegistry.addShapelessRecipe(new ItemStack(lime_plaster, 1),
				new Object[] { plaster, new ItemStack(Item.dyePowder, 1, 10) });
		GameRegistry.addShapelessRecipe(new ItemStack(yellow_plaster, 1),
				new Object[] { plaster, new ItemStack(Item.dyePowder, 1, 11) });
		GameRegistry.addShapelessRecipe(new ItemStack(light_blue_plaster, 1),
				new Object[] { plaster, new ItemStack(Item.dyePowder, 1, 12) });
		GameRegistry.addShapelessRecipe(new ItemStack(magenta_plaster, 1),
				new Object[] { plaster, new ItemStack(Item.dyePowder, 1, 13) });
		GameRegistry.addShapelessRecipe(new ItemStack(orange_plaster, 1),
				new Object[] { plaster, new ItemStack(Item.dyePowder, 1, 14) });

		// Terracotta

		// Prima fase cuoci l'argilla
		GameRegistry.addSmelting(82, new ItemStack(terracotta), 0.15f);

		// Poi colora l'argilla
		GameRegistry.addShapelessRecipe(new ItemStack(red_terracotta, 1),
				new Object[] { terracotta, new ItemStack(Item.dyePowder, 1, 1) });
		GameRegistry.addShapelessRecipe(new ItemStack(green_terracotta, 1),
				new Object[] { terracotta, new ItemStack(Item.dyePowder, 1, 2) });
		GameRegistry.addShapelessRecipe(new ItemStack(brown_terracotta, 1),
				new Object[] { terracotta, new ItemStack(Item.dyePowder, 1, 3) });
		GameRegistry.addShapelessRecipe(new ItemStack(blue_terracotta, 1),
				new Object[] { terracotta, new ItemStack(Item.dyePowder, 1, 4) });
		GameRegistry.addShapelessRecipe(new ItemStack(purple_terracotta, 1),
				new Object[] { terracotta, new ItemStack(Item.dyePowder, 1, 5) });
		GameRegistry.addShapelessRecipe(new ItemStack(cyan_terracotta, 1),
				new Object[] { terracotta, new ItemStack(Item.dyePowder, 1, 6) });
		GameRegistry.addShapelessRecipe(new ItemStack(light_gray_terracotta, 1),
				new Object[] { terracotta, new ItemStack(Item.dyePowder, 1, 7) });
		GameRegistry.addShapelessRecipe(new ItemStack(gray_terracotta, 1),
				new Object[] { terracotta, new ItemStack(Item.dyePowder, 1, 8) });
		GameRegistry.addShapelessRecipe(new ItemStack(pink_terracotta, 1),
				new Object[] { terracotta, new ItemStack(Item.dyePowder, 1, 9) });
		GameRegistry.addShapelessRecipe(new ItemStack(lime_terracotta, 1),
				new Object[] { terracotta, new ItemStack(Item.dyePowder, 1, 10) });
		GameRegistry.addShapelessRecipe(new ItemStack(yellow_terracotta, 1),
				new Object[] { terracotta, new ItemStack(Item.dyePowder, 1, 11) });
		GameRegistry.addShapelessRecipe(new ItemStack(light_blue_terracotta, 1),
				new Object[] { terracotta, new ItemStack(Item.dyePowder, 1, 12) });
		GameRegistry.addShapelessRecipe(new ItemStack(magenta_terracotta, 1),
				new Object[] { terracotta, new ItemStack(Item.dyePowder, 1, 13) });
		GameRegistry.addShapelessRecipe(new ItemStack(orange_terracotta, 1),
				new Object[] { terracotta, new ItemStack(Item.dyePowder, 1, 14) });
		GameRegistry.addShapelessRecipe(new ItemStack(white_terracotta, 1),
				new Object[] { terracotta, new ItemStack(Item.dyePowder, 1, 15) });

		// Tintet glss

		// Prima cosa fondi il vetro
		GameRegistry.addSmelting(20, new ItemStack(molten_glass), 0.15f);

		// Poi colora il vetro
		GameRegistry.addShapelessRecipe(new ItemStack(black_tintedGlass, 1),
				new Object[] { molten_glass, new ItemStack(Item.dyePowder, 1, 0) });
		GameRegistry.addShapelessRecipe(new ItemStack(red_tintedGlass, 1),
				new Object[] { molten_glass, new ItemStack(Item.dyePowder, 1, 1) });
		GameRegistry.addShapelessRecipe(new ItemStack(green_tintedGlass, 1),
				new Object[] { molten_glass, new ItemStack(Item.dyePowder, 1, 2) });
		GameRegistry.addShapelessRecipe(new ItemStack(brown_tintedGlass, 1),
				new Object[] { molten_glass, new ItemStack(Item.dyePowder, 1, 3) });
		GameRegistry.addShapelessRecipe(new ItemStack(blue_tintedGlass, 1),
				new Object[] { molten_glass, new ItemStack(Item.dyePowder, 1, 4) });
		GameRegistry.addShapelessRecipe(new ItemStack(purple_tintedGlass, 1),
				new Object[] { molten_glass, new ItemStack(Item.dyePowder, 1, 5) });
		GameRegistry.addShapelessRecipe(new ItemStack(cyan_tintedGlass, 1),
				new Object[] { molten_glass, new ItemStack(Item.dyePowder, 1, 6) });
		GameRegistry.addShapelessRecipe(new ItemStack(light_gray_tintedGlass, 1),
				new Object[] { molten_glass, new ItemStack(Item.dyePowder, 1, 7) });
		GameRegistry.addShapelessRecipe(new ItemStack(gray_tintedGlass, 1),
				new Object[] { molten_glass, new ItemStack(Item.dyePowder, 1, 8) });
		GameRegistry.addShapelessRecipe(new ItemStack(pink_tintedGlass, 1),
				new Object[] { molten_glass, new ItemStack(Item.dyePowder, 1, 9) });
		GameRegistry.addShapelessRecipe(new ItemStack(lime_tintedGlass, 1),
				new Object[] { molten_glass, new ItemStack(Item.dyePowder, 1, 10) });
		GameRegistry.addShapelessRecipe(new ItemStack(yellow_tintedGlass, 1),
				new Object[] { molten_glass, new ItemStack(Item.dyePowder, 1, 11) });
		GameRegistry.addShapelessRecipe(new ItemStack(light_blue_tintedGlass, 1),
				new Object[] { molten_glass, new ItemStack(Item.dyePowder, 1, 12) });
		GameRegistry.addShapelessRecipe(new ItemStack(magenta_tintedGlass, 1),
				new Object[] { molten_glass, new ItemStack(Item.dyePowder, 1, 13) });
		GameRegistry.addShapelessRecipe(new ItemStack(orange_tintedGlass, 1),
				new Object[] { molten_glass, new ItemStack(Item.dyePowder, 1, 14) });
		GameRegistry.addShapelessRecipe(new ItemStack(white_tintedGlass, 1),
				new Object[] { molten_glass, new ItemStack(Item.dyePowder, 1, 15) });

	}

}
