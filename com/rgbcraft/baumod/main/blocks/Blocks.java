package com.rgbcraft.baumod.main.blocks;

import java.awt.List;

import com.rgbcraft.baumod.main.CreativeTab;
import com.rgbcraft.baumod.main.disks.*;
import com.rgbcraft.baumod.main.items.Items;
import com.rgbcraft.baumod.main.items.ItemPorta;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSign;
import net.minecraft.tileentity.TileEntitySign;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDoor;
import net.minecraft.block.BlockFence;
import net.minecraft.block.BlockFenceGate;
import net.minecraft.block.BlockGlass;
import net.minecraft.block.BlockHalfSlab;
import net.minecraft.block.BlockLog;
import net.minecraft.block.BlockPane;
import net.minecraft.block.BlockSign;
import net.minecraft.block.BlockStep;
import net.minecraft.block.BlockTrapDoor;
import net.minecraft.block.BlockWoodSlab;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.MinecraftForge;


public class Blocks {
	

	
	// Tutto il resto
	public static Block unbreakableStone, ubLog, ubCobble, ubstonebricks, ubbirch, ubspruce, grassPath, hay, mortar, ubglass,
			timberframe, timberframecrossbrace, thatch, plaster, litplaster, hazardstripe, black_tintedGlass, fakeSolarPanel, permaDirt;

	// Plasters
	public static Block orange_plaster, magenta_plaster, light_blue_plaster, yellow_plaster, lime_plaster, pink_plaster,
			gray_plaster, light_gray_plaster, cyan_plaster, blue_plaster, purple_plaster, green_plaster, brown_plaster,
			red_plaster, black_plaster;

	// porte, trapdoor e cancelletti
	
	public static Block spruceGate, birchGate, jungleGate, spruceDoor, birchDoor, jungleDoor, spruceTrapdoor, birchTrapdoor, jungleTrapdoor, apartmentDoor, jungleDoor2, glassDoor;
	
	public static Block door0, door1, door2, door3, door4, door5, door6, door7, door8, door9, door10, door11, door12, door13, door14, door15;
	
	
	//blocco scortecciato
	public static Block strippedSpruceLog, strippedOakLog, strippedBirchLog, strippedJungleLog;
	
	//tronco
	public static Block spruceLog, oakLog, birchLog, jungleLog;
	
	// Terracotta
	public static Block terracotta, white_terracotta, orange_terracotta, magenta_terracotta, light_blue_terracotta,
			yellow_terracotta, lime_terracotta, pink_terracotta, gray_terracotta, light_gray_terracotta,
			cyan_terracotta, blue_terracotta, purple_terracotta, green_terracotta, brown_terracotta, red_terracotta;

	// Mattonella
	
	public static Block black_tile, white_tile, orange_tile, magenta_tile, light_blue_tile,
	yellow_tile, lime_tile, pink_tile, gray_tile, light_gray_tile,
	cyan_tile, blue_tile, purple_tile, green_tile, brown_tile, red_tile;
	
	public static Block black_diag_tile, white_diag_tile, orange_diag_tile, magenta_diag_tile, light_blue_diag_tile,
	yellow_diag_tile, lime_diag_tile, pink_diag_tile, gray_diag_tile, light_gray_diag_tile,
	cyan_diag_tile, blue_diag_tile, purple_diag_tile, green_diag_tile, brown_diag_tile, red_diag_tile;
	
	public static Block black_small_tile, white_small_tile, orange_small_tile, magenta_small_tile, light_blue_small_tile,
	yellow_small_tile, lime_small_tile, pink_small_tile, gray_small_tile, light_gray_small_tile,
	cyan_small_tile, blue_small_tile, purple_small_tile, green_small_tile, brown_small_tile, red_small_tile;
	
	// Vetro colorato
	public static Block tintedGlass, white_tintedGlass, orange_tintedGlass, magenta_tintedGlass, light_blue_tintedGlass,
			yellow_tintedGlass, lime_tintedGlass, pink_tintedGlass, gray_tintedGlass, light_gray_tintedGlass,
			cyan_tintedGlass, blue_tintedGlass, purple_tintedGlass, green_tintedGlass, brown_tintedGlass,
			red_tintedGlass;

	// Tutti i modelli Techne
	public static Block ParabolaSat, ParabolaSatTest2, AntennaGroundPlane, AntennaSettore900MHz, AntennaSettore2100MHz, AntennaYagiVHF,
			AntennaYagiUHF, AntennaLogperiodica, Traliccio, TraliccioBraccettoSingolo, TraliccioBraccettoDoppio, TraliccioBraccettoSat, TraliccioBraccettoCCTV;
	public static Block Microfono, Telecamera, ConsoleRegia, TVLCD, TVOLED, TVOLEDVESA, CCTVCam, CCTVCamPTZ;
	public static Block LampadaOlceseRicci, Neon, NeonPiatto, Lampadario, LampadaScrivania, LampioneGiardino, LampioneMuro, Faro, FaroPavimento, LampionePaloModerno, LampionePaloVecchio;
	public static Block AtariST, AtariST2, Portatile, RadioScanner, Estintore, ModemSat, Clima, ClimaUE, Scrivania, Polycom, BocchettaAC;
	public static Block RackRF, RackIT, RackNet, CartelloEndor, CroceSAndrea, OB, Bitta;
	
	//rotaia
    public static Block LungaRotaiaSaldata;
    
    //TEST NON RIMUOVERE
    
    public static Item TestItem;
    public static Block TestBlock;
   
    public static String ComputerTexture;

	public static void InizializzaBlocchi() {
		// dichiara i blocchi
		
		//mattonella
		
		white_diag_tile = new Block(3310, 160, Material.rock).setTextureFile("/com/rgbcraft/baumod/textures/textures.png")
				.setBlockName("white_diag_tile").setCreativeTab(CreativeTab.CTBlocks).setHardness(1.0f);
		light_gray_diag_tile = new Block(3311, 161, Material.rock)
				.setTextureFile("/com/rgbcraft/baumod/textures/textures.png").setBlockName("light_gray_diag_tile")
				.setCreativeTab(CreativeTab.CTBlocks).setHardness(1.0f);
		gray_diag_tile = new Block(3312, 162, Material.rock).setTextureFile("/com/rgbcraft/baumod/textures/textures.png")
				.setBlockName("gray_diag_tile").setCreativeTab(CreativeTab.CTBlocks).setHardness(1.0f);
		black_diag_tile = new Block(3313, 163, Material.rock).setTextureFile("/com/rgbcraft/baumod/textures/textures.png")
				.setBlockName("black_diag_tile").setCreativeTab(CreativeTab.CTBlocks).setHardness(1.0f);
		brown_diag_tile = new Block(3314, 164, Material.rock).setTextureFile("/com/rgbcraft/baumod/textures/textures.png")
				.setBlockName("brown_diag_tile").setCreativeTab(CreativeTab.CTBlocks).setHardness(1.0f);
		red_diag_tile = new Block(3315, 165, Material.rock).setTextureFile("/com/rgbcraft/baumod/textures/textures.png")
				.setBlockName("red_diag_tile").setCreativeTab(CreativeTab.CTBlocks).setHardness(1.0f);
		orange_diag_tile = new Block(3316, 166, Material.rock).setTextureFile("/com/rgbcraft/baumod/textures/textures.png")
				.setBlockName("orange_diag_tile").setCreativeTab(CreativeTab.CTBlocks).setHardness(1.0f);
		yellow_diag_tile = new Block(3317, 167, Material.rock).setTextureFile("/com/rgbcraft/baumod/textures/textures.png")
				.setBlockName("yellow_diag_tile").setCreativeTab(CreativeTab.CTBlocks).setHardness(1.0f);
		lime_diag_tile = new Block(3318, 168, Material.rock).setTextureFile("/com/rgbcraft/baumod/textures/textures.png")
				.setBlockName("lime_diag_tile").setCreativeTab(CreativeTab.CTBlocks).setHardness(1.0f);
		green_diag_tile = new Block(3319, 169, Material.rock).setTextureFile("/com/rgbcraft/baumod/textures/textures.png")
				.setBlockName("green_diag_tile").setCreativeTab(CreativeTab.CTBlocks).setHardness(1.0f);
		light_blue_diag_tile = new Block(3320, 170, Material.rock)
				.setTextureFile("/com/rgbcraft/baumod/textures/textures.png").setBlockName("light_blue_diag_tile")
				.setCreativeTab(CreativeTab.CTBlocks).setHardness(1.0f);
		cyan_diag_tile = new Block(3321, 171, Material.rock).setTextureFile("/com/rgbcraft/baumod/textures/textures.png")
				.setBlockName("cyan_diag_tile").setCreativeTab(CreativeTab.CTBlocks).setHardness(1.0f);
		blue_diag_tile = new Block(3322, 172, Material.rock).setTextureFile("/com/rgbcraft/baumod/textures/textures.png")
				.setBlockName("blue_diag_tile").setCreativeTab(CreativeTab.CTBlocks).setHardness(1.0f);
		purple_diag_tile = new Block(3323, 173, Material.rock).setTextureFile("/com/rgbcraft/baumod/textures/textures.png")
				.setBlockName("purple_diag_tile").setCreativeTab(CreativeTab.CTBlocks).setHardness(1.0f);
		magenta_diag_tile = new Block(3324, 174, Material.rock).setTextureFile("/com/rgbcraft/baumod/textures/textures.png")
				.setBlockName("magenta_diag_tile").setCreativeTab(CreativeTab.CTBlocks).setHardness(1.0f);
		pink_diag_tile = new Block(3325, 175, Material.rock).setTextureFile("/com/rgbcraft/baumod/textures/textures.png")
				.setBlockName("pink_diag_tile").setCreativeTab(CreativeTab.CTBlocks).setHardness(1.0f);
		
		white_tile = new Block(3330, 176, Material.rock).setTextureFile("/com/rgbcraft/baumod/textures/textures.png")
				.setBlockName("white_tile").setCreativeTab(CreativeTab.CTBlocks).setHardness(1.0f);
		light_gray_tile = new Block(3331, 177, Material.rock)
				.setTextureFile("/com/rgbcraft/baumod/textures/textures.png").setBlockName("light_gray_tile")
				.setCreativeTab(CreativeTab.CTBlocks).setHardness(1.0f);
		gray_tile = new Block(3332, 178, Material.rock).setTextureFile("/com/rgbcraft/baumod/textures/textures.png")
				.setBlockName("gray_tile").setCreativeTab(CreativeTab.CTBlocks).setHardness(1.0f);
		black_tile = new Block(3333, 179, Material.rock).setTextureFile("/com/rgbcraft/baumod/textures/textures.png")
				.setBlockName("black_tile").setCreativeTab(CreativeTab.CTBlocks).setHardness(1.0f);
		brown_tile = new Block(3334, 180, Material.rock).setTextureFile("/com/rgbcraft/baumod/textures/textures.png")
				.setBlockName("brown_tile").setCreativeTab(CreativeTab.CTBlocks).setHardness(1.0f);
		red_tile = new Block(3335, 181, Material.rock).setTextureFile("/com/rgbcraft/baumod/textures/textures.png")
				.setBlockName("red_tile").setCreativeTab(CreativeTab.CTBlocks).setHardness(1.0f);
		orange_tile = new Block(3336, 182, Material.rock).setTextureFile("/com/rgbcraft/baumod/textures/textures.png")
				.setBlockName("orange_tile").setCreativeTab(CreativeTab.CTBlocks).setHardness(1.0f);
		yellow_tile = new Block(3337, 183, Material.rock).setTextureFile("/com/rgbcraft/baumod/textures/textures.png")
				.setBlockName("yellow_tile").setCreativeTab(CreativeTab.CTBlocks).setHardness(1.0f);
		lime_tile = new Block(3338, 184, Material.rock).setTextureFile("/com/rgbcraft/baumod/textures/textures.png")
				.setBlockName("lime_tile").setCreativeTab(CreativeTab.CTBlocks).setHardness(1.0f);
		green_tile = new Block(3339, 185, Material.rock).setTextureFile("/com/rgbcraft/baumod/textures/textures.png")
				.setBlockName("green_tile").setCreativeTab(CreativeTab.CTBlocks).setHardness(1.0f);
		light_blue_tile = new Block(3340, 186, Material.rock)
				.setTextureFile("/com/rgbcraft/baumod/textures/textures.png").setBlockName("light_blue_tile")
				.setCreativeTab(CreativeTab.CTBlocks).setHardness(1.0f);
		cyan_tile = new Block(3341, 187, Material.rock).setTextureFile("/com/rgbcraft/baumod/textures/textures.png")
				.setBlockName("cyan_tile").setCreativeTab(CreativeTab.CTBlocks).setHardness(1.0f);
		blue_tile = new Block(3342, 188, Material.rock).setTextureFile("/com/rgbcraft/baumod/textures/textures.png")
				.setBlockName("blue_tile").setCreativeTab(CreativeTab.CTBlocks).setHardness(1.0f);
		purple_tile = new Block(3343, 189, Material.rock).setTextureFile("/com/rgbcraft/baumod/textures/textures.png")
				.setBlockName("purple_tile").setCreativeTab(CreativeTab.CTBlocks).setHardness(1.0f);
		magenta_tile = new Block(3344, 190, Material.rock).setTextureFile("/com/rgbcraft/baumod/textures/textures.png")
				.setBlockName("magenta_tile").setCreativeTab(CreativeTab.CTBlocks).setHardness(1.0f);
		pink_tile = new Block(3345, 191, Material.rock).setTextureFile("/com/rgbcraft/baumod/textures/textures.png")
				.setBlockName("pink_tile").setCreativeTab(CreativeTab.CTBlocks).setHardness(1.0f);
		
		white_small_tile = new Block(3350, 192, Material.rock).setTextureFile("/com/rgbcraft/baumod/textures/textures.png")
				.setBlockName("white_small_tile").setCreativeTab(CreativeTab.CTBlocks).setHardness(1.0f);
		light_gray_small_tile = new Block(3351, 193, Material.rock)
				.setTextureFile("/com/rgbcraft/baumod/textures/textures.png").setBlockName("light_gray_small_tile")
				.setCreativeTab(CreativeTab.CTBlocks).setHardness(1.0f);
		gray_small_tile = new Block(3352, 194, Material.rock).setTextureFile("/com/rgbcraft/baumod/textures/textures.png")
				.setBlockName("gray_small_tile").setCreativeTab(CreativeTab.CTBlocks).setHardness(1.0f);
		black_small_tile = new Block(3353, 195, Material.rock).setTextureFile("/com/rgbcraft/baumod/textures/textures.png")
				.setBlockName("black_small_tile").setCreativeTab(CreativeTab.CTBlocks).setHardness(1.0f);
		brown_small_tile = new Block(3354, 196, Material.rock).setTextureFile("/com/rgbcraft/baumod/textures/textures.png")
				.setBlockName("brown_small_tile").setCreativeTab(CreativeTab.CTBlocks).setHardness(1.0f);
		red_small_tile = new Block(3355, 197, Material.rock).setTextureFile("/com/rgbcraft/baumod/textures/textures.png")
				.setBlockName("red_small_tile").setCreativeTab(CreativeTab.CTBlocks).setHardness(1.0f);
		orange_small_tile = new Block(3356, 198, Material.rock).setTextureFile("/com/rgbcraft/baumod/textures/textures.png")
				.setBlockName("orange_small_tile").setCreativeTab(CreativeTab.CTBlocks).setHardness(1.0f);
		yellow_small_tile = new Block(3357, 199, Material.rock).setTextureFile("/com/rgbcraft/baumod/textures/textures.png")
				.setBlockName("yellow_small_tile").setCreativeTab(CreativeTab.CTBlocks).setHardness(1.0f);
		lime_small_tile = new Block(3358, 200, Material.rock).setTextureFile("/com/rgbcraft/baumod/textures/textures.png")
				.setBlockName("lime_small_tile").setCreativeTab(CreativeTab.CTBlocks).setHardness(1.0f);
		green_small_tile = new Block(3359, 201, Material.rock).setTextureFile("/com/rgbcraft/baumod/textures/textures.png")
				.setBlockName("green_small_tile").setCreativeTab(CreativeTab.CTBlocks).setHardness(1.0f);
		light_blue_small_tile = new Block(3360, 202, Material.rock)
				.setTextureFile("/com/rgbcraft/baumod/textures/textures.png").setBlockName("light_blue_small_tile")
				.setCreativeTab(CreativeTab.CTBlocks).setHardness(1.0f);
		cyan_small_tile = new Block(3361, 203, Material.rock).setTextureFile("/com/rgbcraft/baumod/textures/textures.png")
				.setBlockName("cyan_small_tile").setCreativeTab(CreativeTab.CTBlocks).setHardness(1.0f);
		blue_small_tile = new Block(3362, 204, Material.rock).setTextureFile("/com/rgbcraft/baumod/textures/textures.png")
				.setBlockName("blue_small_tile").setCreativeTab(CreativeTab.CTBlocks).setHardness(1.0f);
		purple_small_tile = new Block(3363, 205, Material.rock).setTextureFile("/com/rgbcraft/baumod/textures/textures.png")
				.setBlockName("purple_small_tile").setCreativeTab(CreativeTab.CTBlocks).setHardness(1.0f);
		magenta_small_tile = new Block(3364, 206, Material.rock).setTextureFile("/com/rgbcraft/baumod/textures/textures.png")
				.setBlockName("magenta_small_tile").setCreativeTab(CreativeTab.CTBlocks).setHardness(1.0f);
		pink_small_tile = new Block(3365, 207, Material.rock).setTextureFile("/com/rgbcraft/baumod/textures/textures.png")
				.setBlockName("pink_small_tile").setCreativeTab(CreativeTab.CTBlocks).setHardness(1.0f);
		
		
		
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
		TraliccioBraccettoCCTV = new TraliccioBraccettoCCTVBlock(855, 0);

		// atari ST
		

		AtariST = new AtariSTBlock(890, 0);
		Portatile = new PortatileBlock(891, 0);
		AtariST2 = new AtariSTBlock(892, 0);
		ModemSat = new ModemSatBlock(893, 0);
		Polycom = new PolycomBlock(894, 0);
		

		// lampade
		NeonPiatto = new NeonPiattoBlock(880, 0);
		Lampadario = new LampadarioBlock(881, 0);
		LampadaScrivania = new LampadaScrivaniaBlock(882, 0);
		LampioneGiardino = new LampioneGiardinoBlock(883, 0);
		LampioneMuro = new LampioneMuroBlock(884,0);
		Faro = new FaroBlock(885,0);
		LampionePaloModerno = new LampionePaloModernoBlock(886, 0);
		LampionePaloVecchio = new LampionePaloVecchioBlock(887, 0);
		Neon = new NeonBlock(888, 0);
		FaroPavimento = new FaroPavimentoBlock(941,0);
		
		//roba studio TV/radio
		
		Microfono = new MicrofonoBlock(910, 0);
		Telecamera = new TelecameraBlock(911, 0);
		ConsoleRegia = new ConsoleRegiaBlock(912, 0);
		RackRF = new RackRFBlock(913, 0);
		TVLCD = new TVLCDBlock(914, 0);
		TVOLED = new TVOLEDBlock(915, 0);
		CCTVCam = new CCTVCamBlock(916, 0);
		CCTVCamPTZ = new CCTVCamPTZBlock(917, 0);
		Estintore = new EstintoreBlock(918, 0);		
		Clima = new ClimaBlock(919, 0);
		ClimaUE = new ClimaUEBlock(920, 0);
		TVOLEDVESA = new TVOLEDVESABlock(921, 0);
		Scrivania = new ScrivaniaBlock(922, 0);
		BocchettaAC = new BocchettaACBlock(923, 0);
		CartelloEndor = new CartelloEndorBlock(924, 0);
		CroceSAndrea = new CroceSAndreaBlock(925,0);
		Bitta = new BittaBlock(927,0);
		OB = new OBBlock(928,0);
		
		//cancelletto
		
		spruceGate = new BlockFenceGate(1500, 198).setHardness(2.0F).setResistance(5.0F).setStepSound(Block.soundWoodFootstep).setBlockName("spruceGate").setRequiresSelfNotify();
		birchGate = new BlockFenceGate(1501, 214).setHardness(2.0F).setResistance(5.0F).setStepSound(Block.soundWoodFootstep).setBlockName("birchGate").setRequiresSelfNotify();
		jungleGate = new BlockFenceGate(1502, 199).setHardness(2.0F).setResistance(5.0F).setStepSound(Block.soundWoodFootstep).setBlockName("jungleGate").setRequiresSelfNotify();
		
		
		
		//TODO porta
		//spruceTrapdoor = new Porte(1503, Material.wood).setHardness(3.0F).setStepSound(Block.soundWoodFootstep).setBlockName("doorWood").setRequiresSelfNotify();
		
		spruceDoor = new BlockPorta(1503, 32, Material.wood).setStepSound(Block.soundWoodFootstep).setHardness(3.0F).setStepSound(Block.soundWoodFootstep).setBlockName("spruceDoor").setRequiresSelfNotify();
		birchDoor = new BlockPorta(1504, 33, Material.wood).setStepSound(Block.soundWoodFootstep).setHardness(3.0F).setStepSound(Block.soundWoodFootstep).setBlockName("birchDoor").setRequiresSelfNotify();
		jungleDoor = new BlockPorta(1505, 35, Material.wood).setStepSound(Block.soundWoodFootstep).setHardness(3.0F).setStepSound(Block.soundWoodFootstep).setBlockName("jungleDoor").setRequiresSelfNotify();
		apartmentDoor = new BlockPorta(1506, 36, Material.wood).setStepSound(Block.soundWoodFootstep).setHardness(3.0F).setStepSound(Block.soundWoodFootstep).setBlockName("apartmentDoor").setRequiresSelfNotify();
		jungleDoor2 = new BlockPorta(1507, 34, Material.wood).setStepSound(Block.soundWoodFootstep).setHardness(3.0F).setStepSound(Block.soundWoodFootstep).setBlockName("jungleDoor2").setRequiresSelfNotify();
		glassDoor = new BlockPorta(1508, 37, Material.wood).setStepSound(Block.soundWoodFootstep).setHardness(3.0F).setStepSound(Block.soundWoodFootstep).setBlockName("glassDoor").setRequiresSelfNotify();
		
		door0 = new BlockPorta(1530, 144, Material.wood).setStepSound(Block.soundWoodFootstep).setHardness(3.0F).setStepSound(Block.soundWoodFootstep).setBlockName("door0").setRequiresSelfNotify();
		door1 = new BlockPorta(1531, 145, Material.wood).setStepSound(Block.soundWoodFootstep).setHardness(3.0F).setStepSound(Block.soundWoodFootstep).setBlockName("door1").setRequiresSelfNotify();
		door2 = new BlockPorta(1532, 146, Material.wood).setStepSound(Block.soundWoodFootstep).setHardness(3.0F).setStepSound(Block.soundWoodFootstep).setBlockName("door2").setRequiresSelfNotify();
		door3 = new BlockPorta(1533, 147, Material.wood).setStepSound(Block.soundWoodFootstep).setHardness(3.0F).setStepSound(Block.soundWoodFootstep).setBlockName("door3").setRequiresSelfNotify();
		door4 = new BlockPorta(1534, 148, Material.wood).setStepSound(Block.soundWoodFootstep).setHardness(3.0F).setStepSound(Block.soundWoodFootstep).setBlockName("door4").setRequiresSelfNotify();
		door5 = new BlockPorta(1535, 149, Material.wood).setStepSound(Block.soundWoodFootstep).setHardness(3.0F).setStepSound(Block.soundWoodFootstep).setBlockName("door5").setRequiresSelfNotify();
		door6 = new BlockPorta(1536, 150, Material.wood).setStepSound(Block.soundWoodFootstep).setHardness(3.0F).setStepSound(Block.soundWoodFootstep).setBlockName("door6").setRequiresSelfNotify();
		door7 = new BlockPorta(1537, 151, Material.wood).setStepSound(Block.soundWoodFootstep).setHardness(3.0F).setStepSound(Block.soundWoodFootstep).setBlockName("door7").setRequiresSelfNotify();
		door8 = new BlockPorta(1538, 152, Material.wood).setStepSound(Block.soundWoodFootstep).setHardness(3.0F).setStepSound(Block.soundWoodFootstep).setBlockName("door8").setRequiresSelfNotify();
		door9 = new BlockPorta(1539, 153, Material.wood).setStepSound(Block.soundWoodFootstep).setHardness(3.0F).setStepSound(Block.soundWoodFootstep).setBlockName("door9").setRequiresSelfNotify();
		door10 = new BlockPorta(1540, 154, Material.wood).setStepSound(Block.soundWoodFootstep).setHardness(3.0F).setStepSound(Block.soundWoodFootstep).setBlockName("door10").setRequiresSelfNotify();
		door11 = new BlockPorta(1541, 155, Material.wood).setStepSound(Block.soundWoodFootstep).setHardness(3.0F).setStepSound(Block.soundWoodFootstep).setBlockName("door11").setRequiresSelfNotify();
		door12 = new BlockPorta(1542, 156, Material.wood).setStepSound(Block.soundWoodFootstep).setHardness(3.0F).setStepSound(Block.soundWoodFootstep).setBlockName("door12").setRequiresSelfNotify();
		door13 = new BlockPorta(1543, 157, Material.wood).setStepSound(Block.soundWoodFootstep).setHardness(3.0F).setStepSound(Block.soundWoodFootstep).setBlockName("door13").setRequiresSelfNotify();
		door14 = new BlockPorta(1544, 158, Material.wood).setStepSound(Block.soundWoodFootstep).setHardness(3.0F).setStepSound(Block.soundWoodFootstep).setBlockName("door14").setRequiresSelfNotify();
		door15 = new BlockPorta(1545, 159, Material.wood).setStepSound(Block.soundWoodFootstep).setHardness(3.0F).setStepSound(Block.soundWoodFootstep).setBlockName("door15").setRequiresSelfNotify();
		
		//((BlockPorta) Blocks.spruceDoor).setItemDropped(Items.spruceDoor.itemID);
		
		
		
		//Blocchi scortecciati
		strippedOakLog = new StrippedOakLog(1490, 114, Material.wood).setCreativeTab(CreativeTab.CTBlocks).setHardness(2.0F).setStepSound(Block.soundWoodFootstep).setBlockName("strippedOakLog").setTextureFile("/com/rgbcraft/baumod/textures/textures.png");
		strippedSpruceLog = new StrippedSpruceLog(1491, 116, Material.wood).setCreativeTab(CreativeTab.CTBlocks).setHardness(2.0F).setStepSound(Block.soundWoodFootstep).setBlockName("strippedSpruceLog").setTextureFile("/com/rgbcraft/baumod/textures/textures.png");
		strippedBirchLog = new StrippedBirchLog(1492, 118, Material.wood).setCreativeTab(CreativeTab.CTBlocks).setHardness(2.0F).setStepSound(Block.soundWoodFootstep).setBlockName("strippedBirchLog").setTextureFile("/com/rgbcraft/baumod/textures/textures.png");
		strippedJungleLog = new StrippedJungleLog(1493, 120, Material.wood).setCreativeTab(CreativeTab.CTBlocks).setHardness(2.0F).setStepSound(Block.soundWoodFootstep).setBlockName("strippedJungleLog").setTextureFile("/com/rgbcraft/baumod/textures/textures.png");
		
		oakLog = new Block(1494, 20, Material.wood).setCreativeTab(CreativeTab.CTBlocks).setHardness(2.0F).setStepSound(Block.soundWoodFootstep).setBlockName("oakLog");
		spruceLog = new Block(1495, 116, Material.wood).setCreativeTab(CreativeTab.CTBlocks).setHardness(2.0F).setStepSound(Block.soundWoodFootstep).setBlockName("spruceLog");
		birchLog = new Block(1496, 117, Material.wood).setCreativeTab(CreativeTab.CTBlocks).setHardness(2.0F).setStepSound(Block.soundWoodFootstep).setBlockName("birchLog");
		jungleLog = new Block(1498, 153, Material.wood).setCreativeTab(CreativeTab.CTBlocks).setHardness(2.0F).setStepSound(Block.soundWoodFootstep).setBlockName("jungleLog");
		
		
		// altri
	
		fakeSolarPanel = new FakeSolarPanelBlock(190, 112, Material.iron).setCreativeTab(CreativeTab.CTBlocks)
				.setBlockName("fakeSolarPanel").setHardness(0.5f).setTextureFile("/com/rgbcraft/baumod/textures/textures.png");
		
		permaDirt = new Block(870, 63, Material.ground).setCreativeTab(CreativeTab.CTBlocks).setBlockName("permaDirt").setHardness(0.3f).setStepSound(Block.soundGravelFootstep).setTextureFile("/com/rgbcraft/baumod/textures/textures.png");
		
		litplaster = new Block(940, 67, Material.glass).setCreativeTab(CreativeTab.CTBlocks).setBlockName("litplaster").setHardness(0.2f).setLightValue(1.0F)
				.setTextureFile("/com/rgbcraft/baumod/textures/textures.png").setStepSound(Block.soundGlassFootstep);
		
		ubglass = new BlockGlass(871, 49, Material.glass, false).setCreativeTab(CreativeTab.CTBlocks).setBlockUnbreakable().setResistance(6000000.0F)
				.setBlockName("ubglass");
		unbreakableStone = new Block(173, 1, Material.rock).setCreativeTab(CreativeTab.CTBlocks)
				.setBlockName("ubstone").setBlockUnbreakable().setResistance(6000000.0F);
		ubLog = new Block(174, 4, Material.wood).setBlockUnbreakable().setResistance(6000000.0F).setCreativeTab(CreativeTab.CTBlocks)
				.setBlockName("ubLog");
		ubCobble = new Block(175, 16, Material.rock).setBlockUnbreakable().setResistance(6000000.0F).setCreativeTab(CreativeTab.CTBlocks)
				.setBlockName("ubCobble");
		ubstonebricks = new Block(176, 54, Material.rock).setBlockUnbreakable().setResistance(6000000.0F).setCreativeTab(CreativeTab.CTBlocks)
				.setBlockName("ubSBrick");
		ubspruce = new Block(177, 198, Material.wood).setBlockUnbreakable().setResistance(6000000.0F).setCreativeTab(CreativeTab.CTBlocks)
				.setBlockName("ubspruce");
		ubbirch = new Block(178, 214, Material.wood).setBlockUnbreakable().setResistance(6000000.0F).setCreativeTab(CreativeTab.CTBlocks)
				.setBlockName("ubbirch");
		grassPath = new GrassPath(179, Material.grass).setCreativeTab(CreativeTab.CTBlocks).setBlockName("grassPath")
				.setTextureFile("/com/rgbcraft/baumod/textures/textures.png").setHardness(0.3f)
				.setStepSound(Block.soundGrassFootstep);
		hay = new HayBlock(180, 12, Material.leaves).setTextureFile("/com/rgbcraft/baumod/textures/textures.png")
				.setBlockName("hay").setCreativeTab(CreativeTab.CTBlocks).setHardness(0.2f);
		mortar = new Block(183, 48, Material.rock).setTextureFile("/com/rgbcraft/baumod/textures/textures.png")
				.setCreativeTab(CreativeTab.CTBlocks).setBlockName("mortar").setHardness(1.2f);
		timberframe = new TimberFrame(184, 14, Material.rock, 1)
				.setTextureFile("/com/rgbcraft/baumod/textures/textures.png").setCreativeTab(CreativeTab.CTBlocks)
				.setBlockName("timberframe").setHardness(1.7f);
		timberframecrossbrace = new TimberFrame(185, 13, Material.rock, 2)
				.setTextureFile("/com/rgbcraft/baumod/textures/textures.png").setCreativeTab(CreativeTab.CTBlocks)
				.setBlockName("timberframecrossbrace").setHardness(1.8f);
		thatch = new Block(186, 15, Material.leaves).setTextureFile("/com/rgbcraft/baumod/textures/textures.png")
				.setCreativeTab(CreativeTab.CTBlocks).setBlockName("thatch").setHardness(0.5f);
		plaster = new Block(187, 67, Material.rock).setTextureFile("/com/rgbcraft/baumod/textures/textures.png")
				.setBlockName("plaster").setCreativeTab(CreativeTab.CTBlocks).setHardness(1.0f);
		hazardstripe = new Block(195, 51, Material.rock).setTextureFile("/com/rgbcraft/baumod/textures/textures.png")
				.setBlockName("hzstripe").setCreativeTab(CreativeTab.CTBlocks).setHardness(1.0f);

		// Plaster colorati

		black_plaster = new Block(800, 64, Material.rock).setTextureFile("/com/rgbcraft/baumod/textures/textures.png")
				.setBlockName("black_plaster").setCreativeTab(CreativeTab.CTBlocks).setHardness(1.0f);
		gray_plaster = new Block(801, 65, Material.rock).setTextureFile("/com/rgbcraft/baumod/textures/textures.png")
				.setBlockName("gray_plaster").setCreativeTab(CreativeTab.CTBlocks).setHardness(1.0f);
		light_gray_plaster = new Block(802, 66, Material.rock)
				.setTextureFile("/com/rgbcraft/baumod/textures/textures.png").setBlockName("light_gray_plaster")
				.setCreativeTab(CreativeTab.CTBlocks).setHardness(1.0f);
		red_plaster = new Block(803, 68, Material.rock).setTextureFile("/com/rgbcraft/baumod/textures/textures.png")
				.setBlockName("red_plaster").setCreativeTab(CreativeTab.CTBlocks).setHardness(1.0f);
		orange_plaster = new Block(804, 69, Material.rock).setTextureFile("/com/rgbcraft/baumod/textures/textures.png")
				.setBlockName("orange_plaster").setCreativeTab(CreativeTab.CTBlocks).setHardness(1.0f);
		yellow_plaster = new Block(805, 70, Material.rock).setTextureFile("/com/rgbcraft/baumod/textures/textures.png")
				.setBlockName("yellow_plaster").setCreativeTab(CreativeTab.CTBlocks).setHardness(1.0f);
		lime_plaster = new Block(806, 71, Material.rock).setTextureFile("/com/rgbcraft/baumod/textures/textures.png")
				.setBlockName("lime_plaster").setCreativeTab(CreativeTab.CTBlocks).setHardness(1.0f);
		green_plaster = new Block(807, 72, Material.rock).setTextureFile("/com/rgbcraft/baumod/textures/textures.png")
				.setBlockName("green_plaster").setCreativeTab(CreativeTab.CTBlocks).setHardness(1.0f);
		cyan_plaster = new Block(808, 73, Material.rock).setTextureFile("/com/rgbcraft/baumod/textures/textures.png")
				.setBlockName("cyan_plaster").setCreativeTab(CreativeTab.CTBlocks).setHardness(1.0f);
		light_blue_plaster = new Block(809, 74, Material.rock)
				.setTextureFile("/com/rgbcraft/baumod/textures/textures.png").setBlockName("light_blue_plaster")
				.setCreativeTab(CreativeTab.CTBlocks).setHardness(1.0f);
		blue_plaster = new Block(810, 75, Material.rock).setTextureFile("/com/rgbcraft/baumod/textures/textures.png")
				.setBlockName("blue_plaster").setCreativeTab(CreativeTab.CTBlocks).setHardness(1.0f);
		purple_plaster = new Block(811, 76, Material.rock).setTextureFile("/com/rgbcraft/baumod/textures/textures.png")
				.setBlockName("purple_plaster").setCreativeTab(CreativeTab.CTBlocks).setHardness(1.0f);
		magenta_plaster = new Block(812, 77, Material.rock).setTextureFile("/com/rgbcraft/baumod/textures/textures.png")
				.setBlockName("magenta_plaster").setCreativeTab(CreativeTab.CTBlocks).setHardness(1.0f);
		pink_plaster = new Block(813, 78, Material.rock).setTextureFile("/com/rgbcraft/baumod/textures/textures.png")
				.setBlockName("pink_plaster").setCreativeTab(CreativeTab.CTBlocks).setHardness(1.0f);
		brown_plaster = new Block(814, 79, Material.rock).setTextureFile("/com/rgbcraft/baumod/textures/textures.png")
				.setBlockName("brown_plaster").setCreativeTab(CreativeTab.CTBlocks).setHardness(1.0f);

		// Terracotta

		terracotta = new Block(815, 80, Material.rock).setTextureFile("/com/rgbcraft/baumod/textures/textures.png")
				.setBlockName("terracotta").setCreativeTab(CreativeTab.CTBlocks).setHardness(0.7f);
		gray_terracotta = new Block(816, 81, Material.rock).setTextureFile("/com/rgbcraft/baumod/textures/textures.png")
				.setBlockName("gray_terracotta").setCreativeTab(CreativeTab.CTBlocks).setHardness(0.7f);
		light_gray_terracotta = new Block(817, 82, Material.rock)
				.setTextureFile("/com/rgbcraft/baumod/textures/textures.png").setBlockName("light_gray_terracotta")
				.setCreativeTab(CreativeTab.CTBlocks).setHardness(0.7f);
		white_terracotta = new Block(818, 83, Material.rock)
				.setTextureFile("/com/rgbcraft/baumod/textures/textures.png").setBlockName("white_terracotta")
				.setCreativeTab(CreativeTab.CTBlocks).setHardness(0.7f);
		red_terracotta = new Block(819, 84, Material.rock).setTextureFile("/com/rgbcraft/baumod/textures/textures.png")
				.setBlockName("red_terracotta").setCreativeTab(CreativeTab.CTBlocks).setHardness(0.7f);
		orange_terracotta = new Block(820, 85, Material.rock)
				.setTextureFile("/com/rgbcraft/baumod/textures/textures.png").setBlockName("orange_terracotta")
				.setCreativeTab(CreativeTab.CTBlocks).setHardness(0.7f);
		yellow_terracotta = new Block(821, 86, Material.rock)
				.setTextureFile("/com/rgbcraft/baumod/textures/textures.png").setBlockName("yellow_terracotta")
				.setCreativeTab(CreativeTab.CTBlocks).setHardness(0.7f);
		lime_terracotta = new Block(822, 87, Material.rock).setTextureFile("/com/rgbcraft/baumod/textures/textures.png")
				.setBlockName("lime_terracotta").setCreativeTab(CreativeTab.CTBlocks).setHardness(0.7f);
		green_terracotta = new Block(823, 88, Material.rock)
				.setTextureFile("/com/rgbcraft/baumod/textures/textures.png").setBlockName("green_terracotta")
				.setCreativeTab(CreativeTab.CTBlocks).setHardness(0.7f);
		cyan_terracotta = new Block(824, 89, Material.rock).setTextureFile("/com/rgbcraft/baumod/textures/textures.png")
				.setBlockName("cyan_terracotta").setCreativeTab(CreativeTab.CTBlocks).setHardness(0.7f);
		light_blue_terracotta = new Block(825, 90, Material.rock)
				.setTextureFile("/com/rgbcraft/baumod/textures/textures.png").setBlockName("light_blue_terracotta")
				.setCreativeTab(CreativeTab.CTBlocks).setHardness(0.7f);
		blue_terracotta = new Block(826, 91, Material.rock).setTextureFile("/com/rgbcraft/baumod/textures/textures.png")
				.setBlockName("blue_terracotta").setCreativeTab(CreativeTab.CTBlocks).setHardness(0.7f);
		purple_terracotta = new Block(827, 92, Material.rock)
				.setTextureFile("/com/rgbcraft/baumod/textures/textures.png").setBlockName("purple_terracotta")
				.setCreativeTab(CreativeTab.CTBlocks).setHardness(0.7f);
		magenta_terracotta = new Block(828, 93, Material.rock)
				.setTextureFile("/com/rgbcraft/baumod/textures/textures.png").setBlockName("magenta_terracotta")
				.setCreativeTab(CreativeTab.CTBlocks).setHardness(0.7f);
		pink_terracotta = new Block(829, 94, Material.rock).setTextureFile("/com/rgbcraft/baumod/textures/textures.png")
				.setBlockName("pink_terracotta").setCreativeTab(CreativeTab.CTBlocks).setHardness(0.7f);
		brown_terracotta = new Block(830, 95, Material.rock)
				.setTextureFile("/com/rgbcraft/baumod/textures/textures.png").setBlockName("brown_terracotta")
				.setCreativeTab(CreativeTab.CTBlocks).setHardness(0.7f);

		// Vetri colorati

		// I vetri veri e propri
		black_tintedGlass = new TintedGlass(196, 96, Material.glass).setCreativeTab(CreativeTab.CTBlocks)
				.setBlockName("black_tintedGlass").setTextureFile("/com/rgbcraft/baumod/textures/textures.png")
				.setHardness(0.2f).setStepSound(Block.soundGlassFootstep);
		gray_tintedGlass = new TintedGlass(197, 97, Material.glass).setCreativeTab(CreativeTab.CTBlocks)
				.setBlockName("gray_tintedGlass").setTextureFile("/com/rgbcraft/baumod/textures/textures.png")
				.setHardness(0.2f).setStepSound(Block.soundGlassFootstep);
		light_gray_tintedGlass = new TintedGlass(832, 98, Material.glass).setCreativeTab(CreativeTab.CTBlocks)
				.setBlockName("light_gray_tintedGlass").setTextureFile("/com/rgbcraft/baumod/textures/textures.png")
				.setHardness(0.2f).setStepSound(Block.soundGlassFootstep);
		white_tintedGlass = new TintedGlass(198, 99, Material.glass).setCreativeTab(CreativeTab.CTBlocks)
				.setBlockName("white_tintedGlass").setTextureFile("/com/rgbcraft/baumod/textures/textures.png")
				.setHardness(0.2f).setStepSound(Block.soundGlassFootstep);
		red_tintedGlass = new TintedGlass(834, 100, Material.glass).setCreativeTab(CreativeTab.CTBlocks)
				.setBlockName("red_tintedGlass").setTextureFile("/com/rgbcraft/baumod/textures/textures.png")
				.setHardness(0.2f).setStepSound(Block.soundGlassFootstep);
		orange_tintedGlass = new TintedGlass(835, 101, Material.glass).setCreativeTab(CreativeTab.CTBlocks)
				.setBlockName("orange_tintedGlass").setTextureFile("/com/rgbcraft/baumod/textures/textures.png")
				.setHardness(0.2f).setStepSound(Block.soundGlassFootstep);
		yellow_tintedGlass = new TintedGlass(836, 102, Material.glass).setCreativeTab(CreativeTab.CTBlocks)
				.setBlockName("yellow_tintedGlass").setTextureFile("/com/rgbcraft/baumod/textures/textures.png")
				.setHardness(0.2f).setStepSound(Block.soundGlassFootstep);
		lime_tintedGlass = new TintedGlass(837, 103, Material.glass).setCreativeTab(CreativeTab.CTBlocks)
				.setBlockName("lime_tintedGlass").setTextureFile("/com/rgbcraft/baumod/textures/textures.png")
				.setHardness(0.2f).setStepSound(Block.soundGlassFootstep);
		green_tintedGlass = new TintedGlass(838, 104, Material.glass).setCreativeTab(CreativeTab.CTBlocks)
				.setBlockName("green_tintedGlass").setTextureFile("/com/rgbcraft/baumod/textures/textures.png")
				.setHardness(0.2f).setStepSound(Block.soundGlassFootstep);
		cyan_tintedGlass = new TintedGlass(839, 105, Material.glass).setCreativeTab(CreativeTab.CTBlocks)
				.setBlockName("cyan_tintedGlass").setTextureFile("/com/rgbcraft/baumod/textures/textures.png")
				.setHardness(0.2f).setStepSound(Block.soundGlassFootstep);
		light_blue_tintedGlass = new TintedGlass(199, 106, Material.glass).setCreativeTab(CreativeTab.CTBlocks)
				.setBlockName("light_blue_tintedGlass").setTextureFile("/com/rgbcraft/baumod/textures/textures.png")
				.setHardness(0.2f).setStepSound(Block.soundGlassFootstep);
		blue_tintedGlass = new TintedGlass(841, 107, Material.glass).setCreativeTab(CreativeTab.CTBlocks)
				.setBlockName("blue_tintedGlass").setTextureFile("/com/rgbcraft/baumod/textures/textures.png")
				.setHardness(0.2f).setStepSound(Block.soundGlassFootstep);
		purple_tintedGlass = new TintedGlass(842, 108, Material.glass).setCreativeTab(CreativeTab.CTBlocks)
				.setBlockName("purple_tintedGlass").setTextureFile("/com/rgbcraft/baumod/textures/textures.png")
				.setHardness(0.2f).setStepSound(Block.soundGlassFootstep);
		magenta_tintedGlass = new TintedGlass(843, 109, Material.glass).setCreativeTab(CreativeTab.CTBlocks)
				.setBlockName("magenta_tintedGlass").setTextureFile("/com/rgbcraft/baumod/textures/textures.png")
				.setHardness(0.2f).setStepSound(Block.soundGlassFootstep);
		pink_tintedGlass = new TintedGlass(844, 110, Material.glass).setCreativeTab(CreativeTab.CTBlocks)
				.setBlockName("pink_tintedGlass").setTextureFile("/com/rgbcraft/baumod/textures/textures.png")
				.setHardness(0.2f).setStepSound(Block.soundGlassFootstep);
		brown_tintedGlass = new TintedGlass(845, 111, Material.glass).setCreativeTab(CreativeTab.CTBlocks)
				.setBlockName("brown_tintedGlass").setTextureFile("/com/rgbcraft/baumod/textures/textures.png")
				.setHardness(0.2f).setStepSound(Block.soundGlassFootstep);

		
		//
		// REGISTRA TUTTI I BLOCCHI
		//
		
		//mattonella
		
		GameRegistry.registerBlock(white_tile, "white_tile");
		GameRegistry.registerBlock(black_tile, "black_tile");
		GameRegistry.registerBlock(gray_tile, "gray_tile");
		GameRegistry.registerBlock(light_gray_tile, "light_gray_tile");
		GameRegistry.registerBlock(red_tile, "red_tile");
		GameRegistry.registerBlock(orange_tile, "orange_tile");
		GameRegistry.registerBlock(yellow_tile, "yellow_tile");
		GameRegistry.registerBlock(lime_tile, "lime_tile");
		GameRegistry.registerBlock(green_tile, "green_tile");
		GameRegistry.registerBlock(cyan_tile, "cyan_tile");
		GameRegistry.registerBlock(light_blue_tile, "light_blue_tile");
		GameRegistry.registerBlock(blue_tile, "blue_tile");
		GameRegistry.registerBlock(purple_tile, "purple_tile");
		GameRegistry.registerBlock(magenta_tile, "magenta_tile");
		GameRegistry.registerBlock(pink_tile, "pink_tile");
		GameRegistry.registerBlock(brown_tile, "brown_tile");
		
		GameRegistry.registerBlock(white_diag_tile, "white_diag_tile");
		GameRegistry.registerBlock(black_diag_tile, "black_diag_tile");
		GameRegistry.registerBlock(gray_diag_tile, "gray_diag_tile");
		GameRegistry.registerBlock(light_gray_diag_tile, "light_gray_diag_tile");
		GameRegistry.registerBlock(red_diag_tile, "red_diag_tile");
		GameRegistry.registerBlock(orange_diag_tile, "orange_diag_tile");
		GameRegistry.registerBlock(yellow_diag_tile, "yellow_diag_tile");
		GameRegistry.registerBlock(lime_diag_tile, "lime_diag_tile");
		GameRegistry.registerBlock(green_diag_tile, "green_diag_tile");
		GameRegistry.registerBlock(cyan_diag_tile, "cyan_diag_tile");
		GameRegistry.registerBlock(light_blue_diag_tile, "light_blue_diag_tile");
		GameRegistry.registerBlock(blue_diag_tile, "blue_diag_tile");
		GameRegistry.registerBlock(purple_diag_tile, "purple_diag_tile");
		GameRegistry.registerBlock(magenta_diag_tile, "magenta_diag_tile");
		GameRegistry.registerBlock(pink_diag_tile, "pink_diag_tile");
		GameRegistry.registerBlock(brown_diag_tile, "brown_diag_tile");
		
		GameRegistry.registerBlock(white_small_tile, "white_small_tile");
		GameRegistry.registerBlock(black_small_tile, "black_small_tile");
		GameRegistry.registerBlock(gray_small_tile, "gray_small_tile");
		GameRegistry.registerBlock(light_gray_small_tile, "light_gray_small_tile");
		GameRegistry.registerBlock(red_small_tile, "red_small_tile");
		GameRegistry.registerBlock(orange_small_tile, "orange_small_tile");
		GameRegistry.registerBlock(yellow_small_tile, "yellow_small_tile");
		GameRegistry.registerBlock(lime_small_tile, "lime_small_tile");
		GameRegistry.registerBlock(green_small_tile, "green_small_tile");
		GameRegistry.registerBlock(cyan_small_tile, "cyan_small_tile");
		GameRegistry.registerBlock(light_blue_small_tile, "light_blue_small_tile");
		GameRegistry.registerBlock(blue_small_tile, "blue_small_tile");
		GameRegistry.registerBlock(purple_small_tile, "purple_small_tile");
		GameRegistry.registerBlock(magenta_small_tile, "magenta_small_tile");
		GameRegistry.registerBlock(pink_small_tile, "pink_small_tile");
		GameRegistry.registerBlock(brown_small_tile, "brown_small_tile");
		
		

		//cancelletti
		
		GameRegistry.registerBlock(spruceGate, "spruceGate");
		GameRegistry.registerBlock(birchGate, "birchGate");
		GameRegistry.registerBlock(jungleGate, "jungleGate");
		
		//TODO porta
		
		
		//Blocchi scortecciati 
		GameRegistry.registerBlock(strippedOakLog, "strippedOakLog");
		GameRegistry.registerBlock(strippedSpruceLog, "strippedSpruce Log");
		GameRegistry.registerBlock(strippedBirchLog, "strippedBirch Log");
		GameRegistry.registerBlock(strippedJungleLog, "strippedJungle Log");
		
		GameRegistry.registerBlock(oakLog, "oakLog");
		GameRegistry.registerBlock(spruceLog, "spruceLog");
		GameRegistry.registerBlock(birchLog, "birchLog");
		GameRegistry.registerBlock(jungleLog, "jungleLog");
		
		
		GameRegistry.registerBlock(fakeSolarPanel, "fakeSolarPanel");
		GameRegistry.registerBlock(litplaster, "litplaster");
 		GameRegistry.registerBlock(permaDirt, "permaDirt");
		GameRegistry.registerBlock(unbreakableStone, "ubstone");
		GameRegistry.registerBlock(ubCobble, "ubcobble");
		GameRegistry.registerBlock(ubLog, "ubLog");
		GameRegistry.registerBlock(ubstonebricks, "ubSBrick");
		GameRegistry.registerBlock(ubspruce, "ubspruce");
		GameRegistry.registerBlock(ubbirch, "ubbirch");
		GameRegistry.registerBlock(ubglass, "ubglass");
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
		GameRegistry.registerBlock(CartelloEndor, "CartelloEndor");
		GameRegistry.registerTileEntity(com.rgbcraft.baumod.main.entities.TileEntityCartelloEndor.class,
				"CartelloEndorTileEntity");
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
		GameRegistry.registerBlock(TraliccioBraccettoCCTV, "TraliccioBraccettoCCTV");
		GameRegistry.registerTileEntity(com.rgbcraft.baumod.main.entities.TileEntityTraliccioBraccettoCCTV.class,
				"TraliccioBraccettoCCTVTileEntity");
		GameRegistry.registerBlock(CroceSAndrea, "CroceSAndrea");
		GameRegistry.registerTileEntity(com.rgbcraft.baumod.main.entities.TileEntityCroceSAndrea.class,
				"CroceSAndrea");
		GameRegistry.registerBlock(OB, "OB");
		GameRegistry.registerTileEntity(com.rgbcraft.baumod.main.entities.TileEntityOB.class,
				"OB");
		// Atari ST
		
		ComputerTexture = "/com/rgbcraft/baumod/textures/AtariST.png";
		GameRegistry.registerBlock(AtariST, "Atari ST");
		GameRegistry.registerTileEntity(com.rgbcraft.baumod.main.entities.TileEntityAtariST.class, "AtariSTTileEntity");

		
		GameRegistry.registerBlock(Portatile, "Portatile");
		GameRegistry.registerTileEntity(com.rgbcraft.baumod.main.entities.TileEntityPortatile.class, "PortatileTileEntity");
		GameRegistry.registerBlock(ModemSat, "ModemSat");
		GameRegistry.registerTileEntity(com.rgbcraft.baumod.main.entities.TileEntityModemSat.class, "ModemSat");

		// Lampade

		GameRegistry.registerBlock(NeonPiatto, "NeonPiatto");
		GameRegistry.registerTileEntity(com.rgbcraft.baumod.main.entities.TileEntityNeonPiatto.class, "NeonPiatto");
		GameRegistry.registerBlock(Neon, "Neon");
		GameRegistry.registerTileEntity(com.rgbcraft.baumod.main.entities.TileEntityNeon.class, "Neon");
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
		GameRegistry.registerBlock(FaroPavimento, "FaroPavimento");
		GameRegistry.registerTileEntity(com.rgbcraft.baumod.main.entities.TileEntityFaroPavimento.class, "FaroPavimento");
		GameRegistry.registerBlock(LampionePaloVecchio, "LampionePaloVecchio");
		GameRegistry.registerTileEntity(com.rgbcraft.baumod.main.entities.TileEntityLampionePaloVecchio.class, "LampionePaloVecchio");
		GameRegistry.registerBlock(LampionePaloModerno, "LampionePaloModerno");
		GameRegistry.registerTileEntity(com.rgbcraft.baumod.main.entities.TileEntityLampionePaloModerno.class, "LampionePaloModerno");
	
		//studio TV/radio
		
		GameRegistry.registerBlock(Microfono, "Microfono");
		GameRegistry.registerTileEntity(com.rgbcraft.baumod.main.entities.TileEntityMicrofono.class, "Microfono");
		GameRegistry.registerBlock(Telecamera, "Telecamera");
		GameRegistry.registerTileEntity(com.rgbcraft.baumod.main.entities.TileEntityTelecamera.class, "Telecamera");
		GameRegistry.registerBlock(ConsoleRegia, "ConsoleRegia");
		GameRegistry.registerTileEntity(com.rgbcraft.baumod.main.entities.TileEntityConsoleRegia.class, "ConsoleRegia");
		GameRegistry.registerBlock(RackRF, "RackRF");
		GameRegistry.registerTileEntity(com.rgbcraft.baumod.main.entities.TileEntityRackRF.class, "RackRF");
		GameRegistry.registerBlock(TVLCD, "TVLCD");
		GameRegistry.registerTileEntity(com.rgbcraft.baumod.main.entities.TileEntityTVLCD.class, "TVLCD");
		GameRegistry.registerBlock(TVOLED, "TVOLED");
		GameRegistry.registerTileEntity(com.rgbcraft.baumod.main.entities.TileEntityTVOLED.class, "TVOLED");
		GameRegistry.registerBlock(TVOLEDVESA, "TVOLEDVESA");
		GameRegistry.registerTileEntity(com.rgbcraft.baumod.main.entities.TileEntityTVOLEDVESA.class, "TVOLEDVESA");
		GameRegistry.registerBlock(CCTVCam, "CCTVCam");
		GameRegistry.registerTileEntity(com.rgbcraft.baumod.main.entities.TileEntityCCTVCam.class, "CCTVCam");
		GameRegistry.registerBlock(CCTVCamPTZ, "CCTVCamPTZ");
		GameRegistry.registerTileEntity(com.rgbcraft.baumod.main.entities.TileEntityCCTVCamPTZ.class, "CCTVCamPTZ");
		GameRegistry.registerBlock(Estintore, "Estintore");
		GameRegistry.registerTileEntity(com.rgbcraft.baumod.main.entities.TileEntityEstintore.class, "Estintore");
		GameRegistry.registerBlock(Clima, "Clima");
		GameRegistry.registerTileEntity(com.rgbcraft.baumod.main.entities.TileEntityClima.class, "Clima");
		GameRegistry.registerBlock(ClimaUE, "ClimaUE");
		GameRegistry.registerTileEntity(com.rgbcraft.baumod.main.entities.TileEntityClimaUE.class, "ClimaUE");
		GameRegistry.registerBlock(Polycom, "Polycom");
		GameRegistry.registerTileEntity(com.rgbcraft.baumod.main.entities.TileEntityPolycom.class, "Polycom");
		GameRegistry.registerBlock(Scrivania, "Scrivania");
		GameRegistry.registerTileEntity(com.rgbcraft.baumod.main.entities.TileEntityScrivania.class, "Scrivania");
		GameRegistry.registerBlock(BocchettaAC, "BocchettaAC");
		GameRegistry.registerTileEntity(com.rgbcraft.baumod.main.entities.TileEntityBocchettaAC.class, "BocchettaAC");
		GameRegistry.registerBlock(Bitta, "Bitta");
		GameRegistry.registerTileEntity(com.rgbcraft.baumod.main.entities.TileEntityBitta.class, "Bitta");
		
	}

	public static void RegistraLingua() {
		//
		// LINGUA
		//
		
		//mattonelle
		LanguageRegistry.addName(black_tile, "Black Tile");
		LanguageRegistry.addName(gray_tile, "Gray Tile");
		LanguageRegistry.addName(light_gray_tile, "Light Gray Tile");
		LanguageRegistry.addName(white_tile, " White Tile");
		LanguageRegistry.addName(red_tile, "Red Tile");
		LanguageRegistry.addName(orange_tile, "Orange Tile");
		LanguageRegistry.addName(yellow_tile, "Yellow Tile");
		LanguageRegistry.addName(lime_tile, "Lime Tile");
		LanguageRegistry.addName(green_tile, "Green Tile");
		LanguageRegistry.addName(cyan_tile, "Cyan Tile");
		LanguageRegistry.addName(light_blue_tile, "Light Blue Tile");
		LanguageRegistry.addName(blue_tile, "Blue Tile");
		LanguageRegistry.addName(purple_tile, "Purple Tile");
		LanguageRegistry.addName(magenta_tile, "Magenta Tile");
		LanguageRegistry.addName(pink_tile, "Pink Tile");
		LanguageRegistry.addName(brown_tile, "Brown Tile");
		
		LanguageRegistry.addName(black_diag_tile, "Black Diagonal Tile");
		LanguageRegistry.addName(gray_diag_tile, "Gray Diagonal Tile");
		LanguageRegistry.addName(light_gray_diag_tile, "Light Gray Diagonal Tile");
		LanguageRegistry.addName(white_diag_tile, " White Diagonal Tile");
		LanguageRegistry.addName(red_diag_tile, "Red Diagonal Tile");
		LanguageRegistry.addName(orange_diag_tile, "Orange Diagonal Tile");
		LanguageRegistry.addName(yellow_diag_tile, "Yellow Diagonal Tile");
		LanguageRegistry.addName(lime_diag_tile, "Lime Diagonal Tile");
		LanguageRegistry.addName(green_diag_tile, "Green Diagonal Tile");
		LanguageRegistry.addName(cyan_diag_tile, "Cyan Diagonal Tile");
		LanguageRegistry.addName(light_blue_diag_tile, "Light Blue Diagonal Tile");
		LanguageRegistry.addName(blue_diag_tile, "Blue Diagonal Tile");
		LanguageRegistry.addName(purple_diag_tile, "Purple Diagonal Tile");
		LanguageRegistry.addName(magenta_diag_tile, "Magenta Diagonal Tile");
		LanguageRegistry.addName(pink_diag_tile, "Pink Diagonal Tile");
		LanguageRegistry.addName(brown_diag_tile, "Brown Diagonal Tile");
		
		LanguageRegistry.addName(black_small_tile, "Black Small Tile");
		LanguageRegistry.addName(gray_small_tile, "Gray Small Tile");
		LanguageRegistry.addName(light_gray_small_tile, "Light Gray Small Tile");
		LanguageRegistry.addName(white_small_tile, " White Small Tile");
		LanguageRegistry.addName(red_small_tile, "Red Small Tile");
		LanguageRegistry.addName(orange_small_tile, "Orange Small Tile");
		LanguageRegistry.addName(yellow_small_tile, "Yellow Small Tile");
		LanguageRegistry.addName(lime_small_tile, "Lime Small Tile");
		LanguageRegistry.addName(green_small_tile, "Green Small Tile");
		LanguageRegistry.addName(cyan_small_tile, "Cyan Small Tile");
		LanguageRegistry.addName(light_blue_small_tile, "Light Blue Small Tile");
		LanguageRegistry.addName(blue_small_tile, "Blue Small Tile");
		LanguageRegistry.addName(purple_small_tile, "Purple Small Tile");
		LanguageRegistry.addName(magenta_small_tile, "Magenta Small Tile");
		LanguageRegistry.addName(pink_small_tile, "Pink Small Tile");
		LanguageRegistry.addName(brown_small_tile, "Brown Small Tile");

		LanguageRegistry.addName(fakeSolarPanel, "Fake Solar Panel");
		LanguageRegistry.addName(litplaster, "Lit Plaster");
		LanguageRegistry.addName(Clima, "Air Conditioner");
		LanguageRegistry.addName(ClimaUE, "Air Conditioner - Outdoor Unit");
		LanguageRegistry.addName(Polycom, "Business Phone");
		LanguageRegistry.addName(Scrivania, "Desk");
		LanguageRegistry.addName(BocchettaAC, "HVAC Vent");
		LanguageRegistry.addName(CartelloEndor, "ENDOR Warning Sign");
		
		//cancelletti
		
		LanguageRegistry.addName(spruceGate, "Spruce Fence Gate");
		LanguageRegistry.addName(birchGate, "Birch Fence Gate");
		LanguageRegistry.addName(jungleGate, "Jungle Fence Gate");
		
		//TODO porta

		LanguageRegistry.addName(spruceDoor, "Spruce Door");
		
		//Blocchi scortecciati
		LanguageRegistry.addName(strippedOakLog, "Stripped Oak Log");
		LanguageRegistry.addName(strippedSpruceLog, "Stripped Spruce Log");
		LanguageRegistry.addName(strippedBirchLog, "Stripped Birch Log");
		LanguageRegistry.addName(strippedJungleLog, "Stripped Jungle Log");
		
		LanguageRegistry.addName(oakLog, "Oak Log");
		LanguageRegistry.addName(spruceLog, "Spruce Log");
		LanguageRegistry.addName(birchLog, "Birch Log");
		LanguageRegistry.addName(jungleLog, "Jungle Log");
		
		// Parabola e antenne

		LanguageRegistry.addName(ParabolaSat, "Satellite Dish");
		LanguageRegistry.addName(AntennaGroundPlane, "Ground plane antenna");
		LanguageRegistry.addName(AntennaSettore900MHz, "900 MHz Sector antenna");
		LanguageRegistry.addName(AntennaYagiVHF, "VHF Yagi-Uda antenna");
		LanguageRegistry.addName(AntennaYagiUHF, "UHF Yagi-Uda antenna");
		LanguageRegistry.addName(AntennaLogperiodica, "Log-periodic antenna");
		
		LanguageRegistry.addName(Traliccio, "Lattice Post");
		LanguageRegistry.addName(TraliccioBraccettoSingolo, "Lattice Bracket - Antenna");
		LanguageRegistry.addName(TraliccioBraccettoSat, "Lattice Bracket - Satellite Dish");
		LanguageRegistry.addName(TraliccioBraccettoCCTV, "Lattice Bracket - CCTV Camera");
		

		// Lampade
		LanguageRegistry.addName(NeonPiatto, "LED Panel Fixture");
		LanguageRegistry.addName(Neon, "Fluorescent Fixture");
		LanguageRegistry.addName(Lampadario, "Pendant Fixture");
		LanguageRegistry.addName(LampadaScrivania, "Desk Lamp");
		LanguageRegistry.addName(LampioneGiardino, "Garden Light");
		LanguageRegistry.addName(LampioneMuro, "Old Street Light (wall-mount)");
		LanguageRegistry.addName(LampionePaloVecchio, "Old Street Light (pole-mount)");
		LanguageRegistry.addName(LampionePaloModerno, "Modern Street Light (pole-mount)");
		LanguageRegistry.addName(Faro, "Floodlight");
		LanguageRegistry.addName(FaroPavimento, "Ground Floodlight");

		//roba tv/studio radio
		
		LanguageRegistry.addName(Microfono, "Studio Microphone");
		LanguageRegistry.addName(Telecamera, "TV Camera");
		LanguageRegistry.addName(ConsoleRegia, "Studio Editing Console");
		LanguageRegistry.addName(RackRF, "RF Equipment Rack");
		LanguageRegistry.addName(TVLCD, "LCD Television");
		LanguageRegistry.addName(TVOLED, "OLED Television");
		LanguageRegistry.addName(TVOLEDVESA, "OLED Television (wall mount)");
		LanguageRegistry.addName(CCTVCam, "CCTV Camera");
		LanguageRegistry.addName(CCTVCamPTZ, "CCTV Camera (with PTZ function)");
		LanguageRegistry.addName(Estintore, "Fire extinguisher");
		LanguageRegistry.addName(CroceSAndrea, "Level Crossing St.Andrews Cross");
		LanguageRegistry.addName(Bitta, "Bollard");
		LanguageRegistry.addName(OB, "Validating machine");
		
		
		// altro
		LanguageRegistry.addName(AtariST, "Personal Computer");
		LanguageRegistry.addName(Portatile, "Laptop Computer");
		LanguageRegistry.addName(ModemSat, "Satellite Modem");

		LanguageRegistry.addName(unbreakableStone, "Unbreakable Stone");
		LanguageRegistry.addName(ubstonebricks, "Unbreakable Stone Bricks");
		LanguageRegistry.addName(ubCobble, "Unbreakable Cobblestone");
		LanguageRegistry.addName(ubLog, "Unbreakable Oak Planks");
		LanguageRegistry.addName(ubspruce, "Unbreakable Spruce Planks");
		LanguageRegistry.addName(ubbirch, "Unbreakable Birch Planks");
		LanguageRegistry.addName(ubglass, "Unbreakable Glass");
		LanguageRegistry.addName(grassPath, "Grass Path");
		LanguageRegistry.addName(permaDirt, "Permanent Dirt");
		LanguageRegistry.addName(hay, "Hay Block");

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
		
		
		//ITEMS (VEDI SOPRA)
	
		
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
		MinecraftForge.setBlockHarvestLevel(mortar, "pickaxe", 0);

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

	
}
