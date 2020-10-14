package com.rgbcraft.baumod.main.items;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import com.rgbcraft.baumod.main.items.Metro;
import net.minecraft.item.Item;

import com.rgbcraft.baumod.main.CreativeTab;
import com.rgbcraft.baumod.main.blocks.Blocks;
import com.rgbcraft.baumod.main.disks.*;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class Items {
	
	//mattonelle
	
	public static Item black_tile_raw, white_tile_raw, orange_tile_raw, magenta_tile_raw, light_blue_tile_raw,
	yellow_tile_raw, lime_tile_raw, pink_tile_raw, gray_tile_raw, light_gray_tile_raw,
	cyan_tile_raw, blue_tile_raw, purple_tile_raw, green_tile_raw, brown_tile_raw, red_tile_raw;
	
	public static Item black_diag_tile_raw, white_diag_tile_raw, orange_diag_tile_raw, magenta_diag_tile_raw, light_blue_diag_tile_raw,
	yellow_diag_tile_raw, lime_diag_tile_raw, pink_diag_tile_raw, gray_diag_tile_raw, light_gray_diag_tile_raw,
	cyan_diag_tile_raw, blue_diag_tile_raw, purple_diag_tile_raw, green_diag_tile_raw, brown_diag_tile_raw, red_diag_tile_raw;
	
	public static Item black_small_tile_raw, white_small_tile_raw, orange_small_tile_raw, magenta_small_tile_raw, light_blue_small_tile_raw,
	yellow_small_tile_raw, lime_small_tile_raw, pink_small_tile_raw, gray_small_tile_raw, light_gray_small_tile_raw,
	cyan_small_tile_raw, blue_small_tile_raw, purple_small_tile_raw, green_small_tile_raw, brown_small_tile_raw, red_small_tile_raw;
	
	//ITEMS
	public static Item molten_glass, straw, metro;
	
	//DISCHI
	
	public static Item ArrakisDisk, SavaraDisk, DaggerfallDisk, TimeForwardDisk, TakeTheATrainDisk, ChattanoogaChooChooDisk, BeyondTheSeaDisk, SolidAsARockDisk, SixteenTonsDisk;
	
	//CARTELLI
	
	public static Item a_CentraleTermica, a_LocalePompe, a_LocaleCaldaie, a_LocaleApplied, a_LocaleLogistic, a_ProprietaPrivata, a_LocaleSerbatoi, a_CabinaElettrica, ab_DPI, ab_IndProtettivi, ab_RTFM, ab_ObbligoGenerico, a_IntElettricoGenerale;
	public static Item f_Estintore, f_AllarmeIncendio, f_Sirena;
	public static Item e_Doccia, e_ProntoSoccorso, e_UscitaEmergenza, e_Martelletto, e_RompereVetro, e_PuntoRitrovo;
	public static Item p_PericoloGenerico, p_Esplosivo, p_Laser, p_Radioattivo, p_Infiammabile, p_Freddo, p_Batterie, p_Corrente, p_Tossico, p_Biohaz, p_Asfissiante, p_Toro, p_EX, p_Corrente2, p_IAEA;
	public static Item d_Persona, d_Fiammifero, d_BereAcqua, d_Spegnere, d_IncendioAcqua, d_Ingresso, d_Parkour, d_Panino;
	public static Item o_Ingranaggio, o_Cestino, o_RTFM;
	
	
	public static Item spruceDoor, birchDoor, jungleDoor, apartmentDoor, jungleDoor2, glassDoor;
	
	public static Item door0, door1, door2, door3, door4, door5, door6, door7, door8, door9, door10, door11, door12, door13, door14, door15;
	
	public static void InizializzaItem() {

	
	molten_glass = new Item(24100).setTextureFile("/com/rgbcraft/baumod/textures/items.png").setIconIndex(1)
			.setCreativeTab(CreativeTabs.tabMaterials).setItemName("molten_glass").setMaxStackSize(8);
	
	straw = new Item(24000).setTextureFile("/com/rgbcraft/baumod/textures/items.png").setIconCoord(0, 0)
			.setCreativeTab(CreativeTabs.tabMaterials).setItemName("straw");
	
	metro = new Metro(24101).setTextureFile("/com/rgbcraft/baumod/textures/items.png").setIconIndex(40)
			.setCreativeTab(CreativeTabs.tabTools).setItemName("metro").setMaxStackSize(1);
	
	white_diag_tile_raw = new Item(24010).setTextureFile("/com/rgbcraft/baumod/textures/textures.png").setIconIndex(160).setItemName("white_diag_tile_raw");
	light_gray_diag_tile_raw = new Item(24011).setTextureFile("/com/rgbcraft/baumod/textures/textures.png").setIconIndex(161).setItemName("light_gray_diag_tile_raw");
	gray_diag_tile_raw = new Item(24012).setTextureFile("/com/rgbcraft/baumod/textures/textures.png").setIconIndex(162).setItemName("gray_diag_tile_raw");
	black_diag_tile_raw = new Item(24013).setTextureFile("/com/rgbcraft/baumod/textures/textures.png").setIconIndex(163).setItemName("black_diag_tile_raw");
	brown_diag_tile_raw = new Item(24014).setTextureFile("/com/rgbcraft/baumod/textures/textures.png").setIconIndex(164).setItemName("brown_diag_tile_raw");
	red_diag_tile_raw = new Item(24015).setTextureFile("/com/rgbcraft/baumod/textures/textures.png").setIconIndex(165).setItemName("red_diag_tile_raw");
	orange_diag_tile_raw = new Item(24016).setTextureFile("/com/rgbcraft/baumod/textures/textures.png").setIconIndex(166).setItemName("orange_diag_tile_raw");
	yellow_diag_tile_raw = new Item(24017).setTextureFile("/com/rgbcraft/baumod/textures/textures.png").setIconIndex(167).setItemName("yellow_diag_tile_raw");
	lime_diag_tile_raw = new Item(24018).setTextureFile("/com/rgbcraft/baumod/textures/textures.png").setIconIndex(168).setItemName("lime_diag_tile_raw");
	green_diag_tile_raw = new Item(24019).setTextureFile("/com/rgbcraft/baumod/textures/textures.png").setIconIndex(169).setItemName("green_diag_tile_raw");
	light_blue_diag_tile_raw = new Item(24020).setTextureFile("/com/rgbcraft/baumod/textures/textures.png").setIconIndex(170).setItemName("light_blue_diag_tile_raw");
	cyan_diag_tile_raw = new Item(24021).setTextureFile("/com/rgbcraft/baumod/textures/textures.png").setIconIndex(171).setItemName("cyan_diag_tile_raw");
	blue_diag_tile_raw = new Item(24022).setTextureFile("/com/rgbcraft/baumod/textures/textures.png").setIconIndex(172).setItemName("blue_diag_tile_raw");
	purple_diag_tile_raw = new Item(24023).setTextureFile("/com/rgbcraft/baumod/textures/textures.png").setIconIndex(173).setItemName("purple_diag_tile_raw");
	magenta_diag_tile_raw = new Item(24024).setTextureFile("/com/rgbcraft/baumod/textures/textures.png").setIconIndex(174).setItemName("magenta_diag_tile_raw");
	
	white_tile_raw = new Item(24030).setTextureFile("/com/rgbcraft/baumod/textures/textures.png").setIconIndex(176).setItemName("white_tile_raw");
	light_gray_tile_raw = new Item(24031).setTextureFile("/com/rgbcraft/baumod/textures/textures.png").setIconIndex(177).setItemName("light_gray_tile_raw");
	gray_tile_raw = new Item(24032).setTextureFile("/com/rgbcraft/baumod/textures/textures.png").setIconIndex(178).setItemName("gray_tile_raw");
	black_tile_raw = new Item(24033).setTextureFile("/com/rgbcraft/baumod/textures/textures.png").setIconIndex(179).setItemName("black_tile_raw");
	brown_tile_raw = new Item(24034).setTextureFile("/com/rgbcraft/baumod/textures/textures.png").setIconIndex(180).setItemName("brown_tile_raw");
	red_tile_raw = new Item(24035).setTextureFile("/com/rgbcraft/baumod/textures/textures.png").setIconIndex(181).setItemName("red_tile_raw");
	orange_tile_raw = new Item(24036).setTextureFile("/com/rgbcraft/baumod/textures/textures.png").setIconIndex(182).setItemName("orange_tile_raw");
	yellow_tile_raw = new Item(24037).setTextureFile("/com/rgbcraft/baumod/textures/textures.png").setIconIndex(183).setItemName("yellow_tile_raw");
	lime_tile_raw = new Item(24038).setTextureFile("/com/rgbcraft/baumod/textures/textures.png").setIconIndex(184).setItemName("lime_tile_raw");
	green_tile_raw = new Item(24039).setTextureFile("/com/rgbcraft/baumod/textures/textures.png").setIconIndex(185).setItemName("green_tile_raw");
	light_blue_tile_raw = new Item(24040).setTextureFile("/com/rgbcraft/baumod/textures/textures.png").setIconIndex(186).setItemName("light_blue_tile_raw");
	cyan_tile_raw = new Item(24041).setTextureFile("/com/rgbcraft/baumod/textures/textures.png").setIconIndex(187).setItemName("cyan_tile_raw");
	blue_tile_raw = new Item(24042).setTextureFile("/com/rgbcraft/baumod/textures/textures.png").setIconIndex(188).setItemName("blue_tile_raw");
	purple_tile_raw = new Item(24043).setTextureFile("/com/rgbcraft/baumod/textures/textures.png").setIconIndex(189).setItemName("purple_tile_raw");
	magenta_tile_raw = new Item(24044).setTextureFile("/com/rgbcraft/baumod/textures/textures.png").setIconIndex(190).setItemName("magenta_tile_raw");
	
	white_small_tile_raw = new Item(24050).setTextureFile("/com/rgbcraft/baumod/textures/textures.png").setIconIndex(192).setItemName("white_small_tile_raw");
	light_gray_small_tile_raw = new Item(24051).setTextureFile("/com/rgbcraft/baumod/textures/textures.png").setIconIndex(193).setItemName("light_gray_small_tile_raw");
	gray_small_tile_raw = new Item(24052).setTextureFile("/com/rgbcraft/baumod/textures/textures.png").setIconIndex(194).setItemName("gray_small_tile_raw");
	black_small_tile_raw = new Item(24053).setTextureFile("/com/rgbcraft/baumod/textures/textures.png").setIconIndex(195).setItemName("black_small_tile_raw");
	brown_small_tile_raw = new Item(24054).setTextureFile("/com/rgbcraft/baumod/textures/textures.png").setIconIndex(196).setItemName("brown_small_tile_raw");
	red_small_tile_raw = new Item(24055).setTextureFile("/com/rgbcraft/baumod/textures/textures.png").setIconIndex(197).setItemName("red_small_tile_raw");
	orange_small_tile_raw = new Item(24056).setTextureFile("/com/rgbcraft/baumod/textures/textures.png").setIconIndex(198).setItemName("orange_small_tile_raw");
	yellow_small_tile_raw = new Item(24057).setTextureFile("/com/rgbcraft/baumod/textures/textures.png").setIconIndex(199).setItemName("yellow_small_tile_raw");
	lime_small_tile_raw = new Item(24058).setTextureFile("/com/rgbcraft/baumod/textures/textures.png").setIconIndex(200).setItemName("lime_small_tile_raw");
	green_small_tile_raw = new Item(24059).setTextureFile("/com/rgbcraft/baumod/textures/textures.png").setIconIndex(201).setItemName("green_small_tile_raw");
	light_blue_small_tile_raw = new Item(24060).setTextureFile("/com/rgbcraft/baumod/textures/textures.png").setIconIndex(202).setItemName("light_blue_small_tile_raw");
	cyan_small_tile_raw = new Item(24061).setTextureFile("/com/rgbcraft/baumod/textures/textures.png").setIconIndex(203).setItemName("cyan_small_tile_raw");
	blue_small_tile_raw = new Item(24062).setTextureFile("/com/rgbcraft/baumod/textures/textures.png").setIconIndex(204).setItemName("blue_small_tile_raw");
	purple_small_tile_raw = new Item(24063).setTextureFile("/com/rgbcraft/baumod/textures/textures.png").setIconIndex(205).setItemName("purple_small_tile_raw");
	magenta_small_tile_raw = new Item(24064).setTextureFile("/com/rgbcraft/baumod/textures/textures.png").setIconIndex(206).setItemName("magenta_small_tile_raw");
	
	
	a_CentraleTermica = new Item(24301).setIconIndex(0).setItemName("a_CentraleTermica").setTextureFile("/com/rgbcraft/baumod/textures/cartelli.png").setCreativeTab(CreativeTab.CTSigns);
	a_LocalePompe = new Item(24302).setIconIndex(1).setItemName("a_LocalePompe").setTextureFile("/com/rgbcraft/baumod/textures/cartelli.png").setCreativeTab(CreativeTab.CTSigns);
	a_LocaleCaldaie = new Item(24303).setIconIndex(2).setItemName("a_LocaleCaldaie").setTextureFile("/com/rgbcraft/baumod/textures/cartelli.png").setCreativeTab(CreativeTab.CTSigns);
	a_LocaleApplied = new Item(24304).setIconIndex(3).setItemName("a_LocaleApplied").setTextureFile("/com/rgbcraft/baumod/textures/cartelli.png").setCreativeTab(CreativeTab.CTSigns);
	a_LocaleLogistic = new Item(24305).setIconIndex(4).setItemName("a_LocaleLogistic").setTextureFile("/com/rgbcraft/baumod/textures/cartelli.png").setCreativeTab(CreativeTab.CTSigns);
	a_ProprietaPrivata = new Item(24306).setIconIndex(5).setItemName("a_ProprietaPrivata").setTextureFile("/com/rgbcraft/baumod/textures/cartelli.png").setCreativeTab(CreativeTab.CTSigns);
	a_LocaleSerbatoi = new Item(24307).setIconIndex(6).setItemName("a_LocaleSerbatoi").setTextureFile("/com/rgbcraft/baumod/textures/cartelli.png").setCreativeTab(CreativeTab.CTSigns);
	a_CabinaElettrica = new Item(24308).setIconIndex(7).setItemName("a_CabinaElettrica").setTextureFile("/com/rgbcraft/baumod/textures/cartelli.png").setCreativeTab(CreativeTab.CTSigns);
	ab_DPI = new Item(24309).setIconIndex(8).setItemName("ab_DPI").setTextureFile("/com/rgbcraft/baumod/textures/cartelli.png").setCreativeTab(CreativeTab.CTSigns);
	ab_IndProtettivi = new Item(24310).setIconIndex(10).setItemName("ab_IndProtettivi").setTextureFile("/com/rgbcraft/baumod/textures/cartelli.png").setCreativeTab(CreativeTab.CTSigns);
	ab_RTFM = new Item(24311).setIconIndex(11).setItemName("ab_RTFM").setTextureFile("/com/rgbcraft/baumod/textures/cartelli.png").setCreativeTab(CreativeTab.CTSigns);
	ab_ObbligoGenerico = new Item(24312).setIconIndex(12).setItemName("ab_ObbligoGenerico").setTextureFile("/com/rgbcraft/baumod/textures/cartelli.png").setCreativeTab(CreativeTab.CTSigns);
	a_IntElettricoGenerale = new Item(24313).setIconIndex(13).setItemName("a_IntElettricoGenerale").setTextureFile("/com/rgbcraft/baumod/textures/cartelli.png").setCreativeTab(CreativeTab.CTSigns);
	
	f_Estintore = new Item(24314).setIconIndex(16).setItemName("f_Estintore").setTextureFile("/com/rgbcraft/baumod/textures/cartelli.png").setCreativeTab(CreativeTab.CTSigns);
	f_AllarmeIncendio = new Item(24315).setIconIndex(17).setItemName("f_AllarmeIncendio").setTextureFile("/com/rgbcraft/baumod/textures/cartelli.png").setCreativeTab(CreativeTab.CTSigns);
	f_Sirena = new Item(24316).setIconIndex(18).setItemName("f_Sirena").setTextureFile("/com/rgbcraft/baumod/textures/cartelli.png").setCreativeTab(CreativeTab.CTSigns);
	
	e_Doccia = new Item(24317).setIconIndex(32).setItemName("e_Doccia").setTextureFile("/com/rgbcraft/baumod/textures/cartelli.png").setCreativeTab(CreativeTab.CTSigns);
	e_ProntoSoccorso = new Item(24318).setIconIndex(33).setItemName("e_ProntoSoccorso").setTextureFile("/com/rgbcraft/baumod/textures/cartelli.png").setCreativeTab(CreativeTab.CTSigns);
	e_UscitaEmergenza = new Item(24319).setIconIndex(34).setItemName("e_UscitaEmergenza").setTextureFile("/com/rgbcraft/baumod/textures/cartelli.png").setCreativeTab(CreativeTab.CTSigns);
	e_Martelletto = new Item(24320).setIconIndex(35).setItemName("e_Martelletto").setTextureFile("/com/rgbcraft/baumod/textures/cartelli.png").setCreativeTab(CreativeTab.CTSigns);
	e_RompereVetro = new Item(24321).setIconIndex(36).setItemName("e_RompereVetro").setTextureFile("/com/rgbcraft/baumod/textures/cartelli.png").setCreativeTab(CreativeTab.CTSigns);
	e_PuntoRitrovo = new Item(24322).setIconIndex(37).setItemName("e_PuntoRitrovo").setTextureFile("/com/rgbcraft/baumod/textures/cartelli.png").setCreativeTab(CreativeTab.CTSigns);
	
	p_PericoloGenerico = new Item(24323).setIconIndex(48).setItemName("p_PericoloGenerico").setTextureFile("/com/rgbcraft/baumod/textures/cartelli.png").setCreativeTab(CreativeTab.CTSigns);
	p_Esplosivo = new Item(24324).setIconIndex(49).setItemName("p_Esplosivo").setTextureFile("/com/rgbcraft/baumod/textures/cartelli.png").setCreativeTab(CreativeTab.CTSigns);
	p_Laser = new Item(24325).setIconIndex(50).setItemName("p_Laser").setTextureFile("/com/rgbcraft/baumod/textures/cartelli.png").setCreativeTab(CreativeTab.CTSigns);
	p_Radioattivo = new Item(24326).setIconIndex(51).setItemName("p_Radioattivo").setTextureFile("/com/rgbcraft/baumod/textures/cartelli.png").setCreativeTab(CreativeTab.CTSigns);
	p_Infiammabile = new Item(24327).setIconIndex(52).setItemName("p_Infiammabile").setTextureFile("/com/rgbcraft/baumod/textures/cartelli.png").setCreativeTab(CreativeTab.CTSigns);
	p_Freddo = new Item(24328).setIconIndex(53).setItemName("p_Freddo").setTextureFile("/com/rgbcraft/baumod/textures/cartelli.png").setCreativeTab(CreativeTab.CTSigns);
	p_Batterie = new Item(24329).setIconIndex(54).setItemName("p_Batterie").setTextureFile("/com/rgbcraft/baumod/textures/cartelli.png").setCreativeTab(CreativeTab.CTSigns);
	p_Corrente = new Item(24330).setIconIndex(55).setItemName("p_Corrente").setTextureFile("/com/rgbcraft/baumod/textures/cartelli.png").setCreativeTab(CreativeTab.CTSigns);
	p_Tossico = new Item(24331).setIconIndex(56).setItemName("p_Tossico").setTextureFile("/com/rgbcraft/baumod/textures/cartelli.png").setCreativeTab(CreativeTab.CTSigns);
	p_Biohaz = new Item(24332).setIconIndex(57).setItemName("p_Biohaz").setTextureFile("/com/rgbcraft/baumod/textures/cartelli.png").setCreativeTab(CreativeTab.CTSigns);
	p_Asfissiante = new Item(24333).setIconIndex(58).setItemName("p_Asfissiante").setTextureFile("/com/rgbcraft/baumod/textures/cartelli.png").setCreativeTab(CreativeTab.CTSigns);
	p_Toro = new Item(24334).setIconIndex(59).setItemName("p_Toro").setTextureFile("/com/rgbcraft/baumod/textures/cartelli.png").setCreativeTab(CreativeTab.CTSigns);
	p_EX = new Item(24335).setIconIndex(60).setItemName("p_EX").setTextureFile("/com/rgbcraft/baumod/textures/cartelli.png").setCreativeTab(CreativeTab.CTSigns);
	p_Corrente2 = new Item(24336).setIconIndex(62).setItemName("p_Corrente2").setTextureFile("/com/rgbcraft/baumod/textures/cartelli.png").setCreativeTab(CreativeTab.CTSigns);
	p_IAEA = new Item(24337).setIconIndex(63).setItemName("p_IAEA").setTextureFile("/com/rgbcraft/baumod/textures/cartelli.png").setCreativeTab(CreativeTab.CTSigns);
	
	d_Persona = new Item(24338).setIconIndex(64).setItemName("p_Persona").setTextureFile("/com/rgbcraft/baumod/textures/cartelli.png").setCreativeTab(CreativeTab.CTSigns);
	d_Fiammifero = new Item(24339).setIconIndex(65).setItemName("p_Fiammifero").setTextureFile("/com/rgbcraft/baumod/textures/cartelli.png").setCreativeTab(CreativeTab.CTSigns);
	d_BereAcqua = new Item(24340).setIconIndex(66).setItemName("p_BereAcqua").setTextureFile("/com/rgbcraft/baumod/textures/cartelli.png").setCreativeTab(CreativeTab.CTSigns);
	d_Spegnere = new Item(24341).setIconIndex(67).setItemName("p_Spegnere").setTextureFile("/com/rgbcraft/baumod/textures/cartelli.png").setCreativeTab(CreativeTab.CTSigns);
	d_IncendioAcqua = new Item(24342).setIconIndex(68).setItemName("p_IncendioAcqua").setTextureFile("/com/rgbcraft/baumod/textures/cartelli.png").setCreativeTab(CreativeTab.CTSigns);
	d_Ingresso = new Item(24343).setIconIndex(69).setItemName("p_Ingresso").setTextureFile("/com/rgbcraft/baumod/textures/cartelli.png").setCreativeTab(CreativeTab.CTSigns);
	d_Parkour = new Item(24344).setIconIndex(70).setItemName("p_Parkour").setTextureFile("/com/rgbcraft/baumod/textures/cartelli.png").setCreativeTab(CreativeTab.CTSigns);
	d_Panino = new Item(24345).setIconIndex(71).setItemName("p_Panino").setTextureFile("/com/rgbcraft/baumod/textures/cartelli.png").setCreativeTab(CreativeTab.CTSigns);
	
	o_Ingranaggio = new Item(24346).setIconIndex(80).setItemName("o_Ingranaggio").setTextureFile("/com/rgbcraft/baumod/textures/cartelli.png").setCreativeTab(CreativeTab.CTSigns);
	o_Cestino = new Item(24347).setIconIndex(81).setItemName("o_Cestino").setTextureFile("/com/rgbcraft/baumod/textures/cartelli.png").setCreativeTab(CreativeTab.CTSigns);
	o_RTFM = new Item(24348).setIconIndex(82).setItemName("o_RTFM").setTextureFile("/com/rgbcraft/baumod/textures/cartelli.png").setCreativeTab(CreativeTab.CTSigns);
	
	
	
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
	
	//PORTA
	
	spruceDoor = new ItemPorta(24400, 4, Blocks.spruceDoor).setItemName("itemSpruceDoor");
	birchDoor = new ItemPorta(24401, 1, Blocks.birchDoor).setItemName("itemBirchDoor");
	jungleDoor = new ItemPorta(24402, 0, Blocks.jungleDoor).setItemName("itemJungleDoor");
	jungleDoor2 = new ItemPorta(24403, 3, Blocks.jungleDoor2).setItemName("itemJungleDoor2");
	apartmentDoor = new ItemPorta(24404, 2, Blocks.apartmentDoor).setItemName("itemApartmentDoor");
	
	glassDoor = new ItemPorta(24405, 5, Blocks.glassDoor).setItemName("itemGlassDoor"); 
	
	door0 = new ItemPorta(24410, 16, Blocks.door0).setItemName("itemDoor0");
	door1 = new ItemPorta(24411, 17, Blocks.door1).setItemName("itemDoor1");
	door2 = new ItemPorta(24412, 18, Blocks.door2).setItemName("itemDoor2");
	door3 = new ItemPorta(24413, 19, Blocks.door3).setItemName("itemDoor3");
	door4 = new ItemPorta(24414, 20, Blocks.door4).setItemName("itemDoor4");
	door5 = new ItemPorta(24415, 21, Blocks.door5).setItemName("itemDoor5");
	door6 = new ItemPorta(24416, 22, Blocks.door6).setItemName("itemDoor6");
	door7 = new ItemPorta(24417, 23, Blocks.door7).setItemName("itemDoor7");
	door8 = new ItemPorta(24418, 24, Blocks.door8).setItemName("itemDoor8");
	door9 = new ItemPorta(24419, 25, Blocks.door9).setItemName("itemDoor9");
	door10 = new ItemPorta(24420, 26, Blocks.door10).setItemName("itemDoor10");
	door11 = new ItemPorta(24421, 27, Blocks.door11).setItemName("itemDoor11");
	door12 = new ItemPorta(24422, 28, Blocks.door12).setItemName("itemDoor12");
	door13 = new ItemPorta(24423, 29, Blocks.door13).setItemName("itemDoor13");
	door14 = new ItemPorta(24424, 30, Blocks.door14).setItemName("itemDoor14");
	door15 = new ItemPorta(24425, 31, Blocks.door15).setItemName("itemDoor15");
	
	
	}
	
	 
	
	
	public static void RegistraLingua() {
		LanguageRegistry.addName(straw, "Straw");
		LanguageRegistry.addName(metro, "Tape Measure");
		LanguageRegistry.addName(molten_glass, "Molten Glass");
		LanguageRegistry.addName(DaggerfallDisk, "Music Disc");
		LanguageRegistry.addName(ArrakisDisk, "Music Disc");
		LanguageRegistry.addName(SavaraDisk, "Music Disc");
		LanguageRegistry.addName(TimeForwardDisk, "Music Disc");
		
		LanguageRegistry.addName(a_CentraleTermica, "Cartello Centrale Termica");
		LanguageRegistry.addName(a_LocalePompe, "Cartello Locale Pompe");
		LanguageRegistry.addName(a_LocaleCaldaie, "Cartello Locale Caldaie");
		LanguageRegistry.addName(a_LocaleApplied, "Cartello Locale Applied");
		LanguageRegistry.addName(a_LocaleLogistic, "Cartello Locale Logistic");
		LanguageRegistry.addName(a_ProprietaPrivata, "Cartello Proprietà Privata");
		LanguageRegistry.addName(a_LocaleSerbatoi, "Cartello Locale Serbatoi");
		LanguageRegistry.addName(a_CabinaElettrica, "Cartello Cabina Elettrica");
		LanguageRegistry.addName(ab_DPI, "Cartello Obbligo DPI");
		LanguageRegistry.addName(ab_IndProtettivi, "Cartello Obbligo Ind. Protettivi");
		LanguageRegistry.addName(ab_RTFM, "Cartello Obbligo Lettura Istruzioni");
		LanguageRegistry.addName(ab_ObbligoGenerico, "Cartello Obbligo Generico");
		LanguageRegistry.addName(a_IntElettricoGenerale, "Cartello Interruttore Generale");
		
		LanguageRegistry.addName(f_Estintore, "Cartello Estintore");
		LanguageRegistry.addName(f_AllarmeIncendio, "Cartello Allarme Incendio");
		LanguageRegistry.addName(f_Sirena, "Cartello Sirena");
		
		LanguageRegistry.addName(e_Doccia, "Cartello Doccia Emergenza");
		LanguageRegistry.addName(e_ProntoSoccorso, "Cartello Pronto Soccorso");
		LanguageRegistry.addName(e_UscitaEmergenza, "Cartello Uscita di Emergenza");
		LanguageRegistry.addName(e_Martelletto, "Cartello Martelletto Frangivetro");
		LanguageRegistry.addName(e_RompereVetro, "Cartello Vetro Frangibile");
		LanguageRegistry.addName(e_PuntoRitrovo, "Cartello Punto di Ritrovo");
		
		LanguageRegistry.addName(p_PericoloGenerico, "Cartello Pericolo Generico");
		LanguageRegistry.addName(p_Esplosivo, "Cartello Pericolo Esplosivo");
		LanguageRegistry.addName(p_Laser, "Cartello Pericolo Laser");
		LanguageRegistry.addName(p_Radioattivo, "Cartello Pericolo Radioattivo");
		LanguageRegistry.addName(p_Infiammabile, "Cartello Pericolo Mat. Infiammabile");
		LanguageRegistry.addName(p_Freddo, "Cartello Pericolo Congelamento");
		LanguageRegistry.addName(p_Batterie, "Cartello Pericolo Batterie");
		LanguageRegistry.addName(p_Corrente, "Cartello Pericolo Corr. Elettrica");
		LanguageRegistry.addName(p_Tossico, "Cartello Pericolo Tossicità");
		LanguageRegistry.addName(p_Biohaz, "Cartello Pericolo Biologico");
		LanguageRegistry.addName(p_Toro, "Cartello Pericolo Toro Irritato");
		LanguageRegistry.addName(p_Asfissiante, "Cartello Pericolo Atm. Asfissiante");
		LanguageRegistry.addName(p_EX, "Cartello Pericolo ATEX");
		LanguageRegistry.addName(p_Corrente2, "Cartello Pericolo Folgoramento");
		LanguageRegistry.addName(p_IAEA, "Cartello Pericolo Radioattivo (IAEA)");
		
		LanguageRegistry.addName(d_Persona, "Cartello Divieto Umani");
		LanguageRegistry.addName(d_Fiammifero, "Cartello Divieto Fiamme Libere");
		LanguageRegistry.addName(d_BereAcqua, "Cartello Acqua non Potabile");
		LanguageRegistry.addName(d_Spegnere, "Cartello Divieto Spegnere");
		LanguageRegistry.addName(d_Ingresso, "Cartello Divieto Accesso");
		LanguageRegistry.addName(d_Parkour, "Cartello Divieto Parkour");
		LanguageRegistry.addName(d_Panino, "Cartello Divieto di Mangiare");
		
		LanguageRegistry.addName(o_Cestino, "Cartello Obbligo Buttare Rumenta nel Bidone");
		LanguageRegistry.addName(o_RTFM, "Cartello Obbligo RTFM");
		LanguageRegistry.addName(o_Ingranaggio, "Cartello Obbligo Uso Protezioni");
		
		//PORTA
		
		LanguageRegistry.addName(spruceDoor, "Spruce Door");
		LanguageRegistry.addName(birchDoor, "Birch Door");
		LanguageRegistry.addName(jungleDoor, "Jungle Door");
		LanguageRegistry.addName(jungleDoor2, "Jungle Door (Variant)");
		LanguageRegistry.addName(apartmentDoor, "Apartment Door");
		LanguageRegistry.addName(glassDoor, "Glass Door");
		
		LanguageRegistry.addName(door0, "Door, Type 1");
		LanguageRegistry.addName(door1, "Door, Type 2");
		LanguageRegistry.addName(door2, "Door, Type 3");
		LanguageRegistry.addName(door3, "Door, Type 4");
		LanguageRegistry.addName(door4, "Door, Type 5");
		LanguageRegistry.addName(door5, "Door, Type 6");
		LanguageRegistry.addName(door6, "Door, Type 7");
		LanguageRegistry.addName(door7, "Door, Type 8");
		LanguageRegistry.addName(door8, "Door, Type 9");
		LanguageRegistry.addName(door9, "Door, Type 10");
		LanguageRegistry.addName(door10, "Door, Type 11");
		LanguageRegistry.addName(door11, "Door, Type 12");
		LanguageRegistry.addName(door12, "Door, Type 13");
		LanguageRegistry.addName(door13, "Door, Type 14");
		LanguageRegistry.addName(door14, "Door, Type 15");
		LanguageRegistry.addName(door15, "Door, Type 16");
		
		LanguageRegistry.addName(white_small_tile_raw, "White Raw Small Tile");
		LanguageRegistry.addName(light_gray_small_tile_raw, "Light_gray Raw Small Tile");
		LanguageRegistry.addName(gray_small_tile_raw, "Gray Raw Small Tile");
		LanguageRegistry.addName(black_small_tile_raw, "Black Raw Small Tile");
		LanguageRegistry.addName(brown_small_tile_raw, "Brown Raw Small Tile");
		LanguageRegistry.addName(red_small_tile_raw, "Red Raw Small Tile");
		LanguageRegistry.addName(orange_small_tile_raw, "Orange Raw Small Tile");
		LanguageRegistry.addName(yellow_small_tile_raw, "Yellow Raw Small Tile");
		LanguageRegistry.addName(lime_small_tile_raw, "Lime Raw Small Tile");
		LanguageRegistry.addName(green_small_tile_raw, "Green Raw Small Tile");
		LanguageRegistry.addName(light_blue_small_tile_raw, "Light_blue Raw Small Tile");
		LanguageRegistry.addName(cyan_small_tile_raw, "Cyan Raw Small Tile");
		LanguageRegistry.addName(blue_small_tile_raw, "Blue Raw Small Tile");
		LanguageRegistry.addName(purple_small_tile_raw, "Purple Raw Small Tile");
		LanguageRegistry.addName(magenta_small_tile_raw, "Magenta Raw Small Tile");
		
		LanguageRegistry.addName(white_diag_tile_raw, "White Raw Diagonal Tile");
		LanguageRegistry.addName(light_gray_diag_tile_raw, "Light_gray Raw Diagonal Tile");
		LanguageRegistry.addName(gray_diag_tile_raw, "Gray Raw Diagonal Tile");
		LanguageRegistry.addName(black_diag_tile_raw, "Black Raw Diagonal Tile");
		LanguageRegistry.addName(brown_diag_tile_raw, "Brown Raw Diagonal Tile");
		LanguageRegistry.addName(red_diag_tile_raw, "Red Raw Diagonal Tile");
		LanguageRegistry.addName(orange_diag_tile_raw, "Orange Raw Diagonal Tile");
		LanguageRegistry.addName(yellow_diag_tile_raw, "Yellow Raw Diagonal Tile");
		LanguageRegistry.addName(lime_diag_tile_raw, "Lime Raw Diagonal Tile");
		LanguageRegistry.addName(green_diag_tile_raw, "Green Raw Diagonal Tile");
		LanguageRegistry.addName(light_blue_diag_tile_raw, "Light_blue Raw Diagonal Tile");
		LanguageRegistry.addName(cyan_diag_tile_raw, "Cyan Raw Diagonal Tile");
		LanguageRegistry.addName(blue_diag_tile_raw, "Blue Raw Diagonal Tile");
		LanguageRegistry.addName(purple_diag_tile_raw, "Purple Raw Diagonal Tile");
		LanguageRegistry.addName(magenta_diag_tile_raw, "Magenta Raw Diagonal Tile");
		
		LanguageRegistry.addName(white_tile_raw, "White Raw Tile");
		LanguageRegistry.addName(light_gray_tile_raw, "Light_gray Raw Tile");
		LanguageRegistry.addName(gray_tile_raw, "Gray Raw Tile");
		LanguageRegistry.addName(black_tile_raw, "Black Raw Tile");
		LanguageRegistry.addName(brown_tile_raw, "Brown Raw Tile");
		LanguageRegistry.addName(red_tile_raw, "Red Raw Tile");
		LanguageRegistry.addName(orange_tile_raw, "Orange Raw Tile");
		LanguageRegistry.addName(yellow_tile_raw, "Yellow Raw Tile");
		LanguageRegistry.addName(lime_tile_raw, "Lime Raw Tile");
		LanguageRegistry.addName(green_tile_raw, "Green Raw Tile");
		LanguageRegistry.addName(light_blue_tile_raw, "Light_blue Raw Tile");
		LanguageRegistry.addName(cyan_tile_raw, "Cyan Raw Tile");
		LanguageRegistry.addName(blue_tile_raw, "Blue Raw Tile");
		LanguageRegistry.addName(purple_tile_raw, "Purple Raw Tile");
		LanguageRegistry.addName(magenta_tile_raw, "Magenta Raw Tile");
		
	}
}


