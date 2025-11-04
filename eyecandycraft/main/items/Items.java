package eyecandycraft.main.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.item.EntityItemFrame;
import net.minecraft.item.Item;
import net.minecraft.item.ItemHangingEntity;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import eyecandycraft.main.CreativeTab;
import eyecandycraft.main.blocks.Blocks;
import eyecandycraft.main.items.Metro;
public class Items {
	
	//ITEMS
	public static Item molten_glass, straw, metro, pacco;
	
	//CARTELLI
	public static Item black_tile_raw, white_tile_raw, orange_tile_raw, magenta_tile_raw, light_blue_tile_raw,
	yellow_tile_raw, lime_tile_raw, pink_tile_raw, gray_tile_raw, light_gray_tile_raw,
	cyan_tile_raw, blue_tile_raw, purple_tile_raw, green_tile_raw, brown_tile_raw, red_tile_raw;
	
	public static Item black_diag_tile_raw, white_diag_tile_raw, orange_diag_tile_raw, magenta_diag_tile_raw, light_blue_diag_tile_raw,
	yellow_diag_tile_raw, lime_diag_tile_raw, pink_diag_tile_raw, gray_diag_tile_raw, light_gray_diag_tile_raw,
	cyan_diag_tile_raw, blue_diag_tile_raw, purple_diag_tile_raw, green_diag_tile_raw, brown_diag_tile_raw, red_diag_tile_raw;
	
	public static Item black_small_tile_raw, white_small_tile_raw, orange_small_tile_raw, magenta_small_tile_raw, light_blue_small_tile_raw,
	yellow_small_tile_raw, lime_small_tile_raw, pink_small_tile_raw, gray_small_tile_raw, light_gray_small_tile_raw,
	cyan_small_tile_raw, blue_small_tile_raw, purple_small_tile_raw, green_small_tile_raw, brown_small_tile_raw, red_small_tile_raw;
	
	public static Item black_med_tile_raw, white_med_tile_raw, orange_med_tile_raw, magenta_med_tile_raw, light_blue_med_tile_raw,
	yellow_med_tile_raw, lime_med_tile_raw, pink_med_tile_raw, gray_med_tile_raw, light_gray_med_tile_raw,
	cyan_med_tile_raw, blue_med_tile_raw, purple_med_tile_raw, green_med_tile_raw, brown_med_tile_raw, red_med_tile_raw;
	
	public static Item a_CentraleTermica, a_LocalePompe, a_LocaleCaldaie, a_LocaleApplied, a_LocaleLogistic, a_ProprietaPrivata, a_LocaleSerbatoi, a_CabinaElettrica, ab_DPI, ab_IndProtettivi, ab_RTFM, ab_ObbligoGenerico, a_IntElettricoGenerale;
	public static Item f_Estintore, f_AllarmeIncendio, f_Sirena;
	public static Item e_Doccia, e_ProntoSoccorso, e_UscitaEmergenza, e_Martelletto, e_RompereVetro, e_PuntoRitrovo;
	public static Item p_PericoloGenerico, p_Esplosivo, p_Laser, p_Radioattivo, p_Infiammabile, p_Freddo, p_Batterie, p_Corrente, p_Tossico, p_Biohaz, p_Asfissiante, p_Toro, p_EX, p_Corrente2, p_IAEA;
	public static Item d_Persona, d_Fiammifero, d_BereAcqua, d_Spegnere, d_IncendioAcqua, d_Ingresso, d_Parkour, d_Panino;
	public static Item o_Ingranaggio, o_Cestino, o_RTFM, o_LGBT;
	
	
	public static Item spruceDoor, birchDoor, jungleDoor, apartmentDoor, jungleDoor2, glassDoor;
	
	public static Item door0, door1, door2, door3, door4, door5, door6, door7, door8, door9, door10, door11, door12, door13, door14, door15, portaCostosa, door16, door17, doorMetal, doorFireProof;
	
	public static Item Sign_acacia;
	public static Item Sign_crimson;
	public static Item Sign_dark_oak;
	public static Item Sign_frame;
	public static Item Sign_jungle;
	public static Item Sign_metal;
	public static Item Sign_oak;
	public static Item Sign_spruce;
	public static Item Sign_warped;
	public static Item Sign_white;
	public static Item Sign_birch;
	
	public static Item SafeSnooper;
	public static Item invisibleItemFrame;
	public static Item chisel;
	

	
	public static void InizializzaItem() {
		
		

		Sign_acacia = new ItemSignCustom(22974, Blocks.Sign_acacia_Post, Blocks.Sign_acacia_Wall).setTextureFile("/eyecandycraft/textures/signs/icons/signs.png").setIconIndex(0).setItemName("Sign_acacia");
		Sign_crimson = new ItemSignCustom(22975, Blocks.Sign_crimson_Post, Blocks.Sign_crimson_Wall).setTextureFile("/eyecandycraft/textures/signs/icons/signs.png").setIconIndex(1).setItemName("Sign_crimson");
		Sign_dark_oak = new ItemSignCustom(22976, Blocks.Sign_dark_oak_Post, Blocks.Sign_dark_oak_Wall).setTextureFile("/eyecandycraft/textures/signs/icons/signs.png").setIconIndex(2).setItemName("Sign_dark_oak");
		Sign_frame = new ItemSignCustom(22977, Blocks.Sign_frame_Post, Blocks.Sign_frame_Wall).setTextureFile("/eyecandycraft/textures/signs/icons/signs.png").setIconIndex(3).setItemName("Sign_frame");
		Sign_jungle = new ItemSignCustom(22978, Blocks.Sign_jungle_Post, Blocks.Sign_jungle_Wall).setTextureFile("/eyecandycraft/textures/signs/icons/signs.png").setIconIndex(4).setItemName("Sign_jungle");
		Sign_metal = new ItemSignCustom(22979, Blocks.Sign_metal_Post, Blocks.Sign_metal_Wall).setTextureFile("/eyecandycraft/textures/signs/icons/signs.png").setIconIndex(5).setItemName("Sign_metal");
		Sign_oak = new ItemSignCustom(22980, Blocks.Sign_oak_Post, Blocks.Sign_oak_Wall).setTextureFile("/eyecandycraft/textures/signs/icons/signs.png").setIconIndex(6).setItemName("Sign_oak");
		Sign_spruce = new ItemSignCustom(22981, Blocks.Sign_spruce_Post, Blocks.Sign_spruce_Wall).setTextureFile("/eyecandycraft/textures/signs/icons/signs.png").setIconIndex(7).setItemName("Sign_spruce");
		Sign_warped = new ItemSignCustom(22982, Blocks.Sign_warped_Post, Blocks.Sign_warped_Wall).setTextureFile("/eyecandycraft/textures/signs/icons/signs.png").setIconIndex(8).setItemName("Sign_warped");
		Sign_white = new ItemSignCustom(22983, Blocks.Sign_white_Post, Blocks.Sign_white_Wall).setTextureFile("/eyecandycraft/textures/signs/icons/signs.png").setIconIndex(9).setItemName("Sign_white");
		Sign_birch = new ItemSignCustom(22984, Blocks.Sign_birch_Post, Blocks.Sign_birch_Wall).setTextureFile("/eyecandycraft/textures/signs/icons/signs.png").setIconIndex(10).setItemName("Sign_birch");

	
	molten_glass = new Item(24100).setTextureFile("/eyecandycraft/textures/items.png").setIconIndex(1)
			.setCreativeTab(CreativeTab.tabEyecandyAltro).setItemName("molten_glass").setMaxStackSize(8);
	
	straw = new Item(24000).setTextureFile("/eyecandycraft/textures/items.png").setIconCoord(0, 0)
			.setCreativeTab(CreativeTab.tabEyecandyAltro).setItemName("straw");
	
	metro = new Metro(24101).setTextureFile("/eyecandycraft/textures/items.png").setIconIndex(40)
			.setCreativeTab(CreativeTab.tabEyecandyAltro).setItemName("metro").setMaxStackSize(1);
	
	pacco = new Item(24102).setTextureFile("/eyecandycraft/textures/items.png").setIconIndex(47)
			.setCreativeTab(CreativeTab.tabEyecandyAltro).setItemName("pacco").setMaxStackSize(1);
	
	chisel = new ItemChisel(24103);
	
	/*SafeSnooper = new SafeSnooper(24103).setTextureFile("/eyecandycraft/textures/items.png").setIconIndex(40)
			.setCreativeTab(CreativeTab.tabEyecandyAltro).setItemName("safesnooper").setMaxStackSize(1);
	*/
	
	//invisibleItemFrame = new ItemCustomHangingEntity(24104, EntityCustomItemFrame.class, "invisibleItemFrame").setIconCoord(14, 12);

	
	a_CentraleTermica = new ItemCartello(24301, "a_CentraleTermica", 0);
	a_LocalePompe = new ItemCartello(24302, "a_LocalePompe", 1);
	a_LocaleCaldaie = new ItemCartello(24303, "a_LocaleCaldaie", 2);
	a_LocaleApplied = new ItemCartello(24304, "a_LocaleApplied", 3);
	a_LocaleLogistic = new ItemCartello(24305, "a_LocaleLogistic", 4);
	a_ProprietaPrivata = new ItemCartello(24306, "a_ProprietaPrivata", 5);
	a_LocaleSerbatoi = new ItemCartello(24307, "a_LocaleSerbatoi", 6);
	a_CabinaElettrica = new ItemCartello(24308, "a_CabinaElettrica", 7);
	ab_DPI = new ItemCartello(24309, "ab_DPI", 8);
	ab_IndProtettivi = new ItemCartello(24310, "ab_IndProtettivi", 10);
	ab_RTFM = new ItemCartello(24311, "ab_RTFM", 11);
	ab_ObbligoGenerico = new ItemCartello(24312, "ab_ObbligoGenerico", 12);
	a_IntElettricoGenerale = new ItemCartello(24313, "a_IntElettricoGenerale", 13);
	
	f_Estintore = new ItemCartello(24314, "f_Estintore", 16);
	f_AllarmeIncendio = new ItemCartello(24315, "f_AllarmeIncendio", 17);
	f_Sirena = new ItemCartello(24316, "f_Sirena", 18);
	
	e_Doccia = new ItemCartello(24317, "e_Doccia", 32);
	e_ProntoSoccorso = new ItemCartello(24318, "e_ProntoSoccorso", 33);
	e_UscitaEmergenza = new ItemCartello(24319, "e_UscitaEmergenza", 34);
	e_Martelletto = new ItemCartello(24320, "e_Martelletto", 35);
	e_RompereVetro = new ItemCartello(24321, "e_RompiVetro", 36);
	e_PuntoRitrovo = new ItemCartello(24322, "e_PuntoRitrovo", 37);
	
	p_PericoloGenerico = new ItemCartello(24323, "p_PericoloGenerico", 48);
	p_Esplosivo = new ItemCartello(24324, "p_Esplosivo", 49);
	p_Laser = new ItemCartello(24325, "p_Laser", 50);
	p_Radioattivo = new ItemCartello(24326, "p_Radioattivo", 51);
	p_Infiammabile = new ItemCartello(24327, "p_Infiammabile", 52);
	p_Freddo = new ItemCartello(24328, "p_Freddo", 53);
	p_Batterie = new ItemCartello(24329, "p_Batterie", 54);
	p_Corrente = new ItemCartello(24330, "p_Corrente", 55);
	p_Tossico = new ItemCartello(24331, "p_Tossico", 56);
	p_Biohaz = new ItemCartello(24332, "p_Biohaz", 57);
	p_Asfissiante = new ItemCartello(24333, "p_Asfissiante", 58);
	p_Toro = new ItemCartello(24334, "p_Toro", 59);
	p_EX = new ItemCartello(24335, "p_EX", 60);
	p_Corrente2 = new ItemCartello(24336, "p_Corrente2", 62);
	p_IAEA = new ItemCartello(24337, "p_IAEA", 63);
	
	d_Persona = new ItemCartello(24338, "d_Persona", 64);
	d_Fiammifero = new ItemCartello(24339, "d_Fiammifero", 65);
	d_BereAcqua = new ItemCartello(24340, "d_BereAcqua", 66);
	d_Spegnere = new ItemCartello(24341, "d_Spegnere", 67);
	d_IncendioAcqua = new ItemCartello(24342, "d_IncendioAcqua", 68);
	d_Ingresso = new ItemCartello(24343, "d_Ingresso", 69);
	d_Parkour = new ItemCartello(24344, "d_Parkour", 70);
	d_Panino = new ItemCartello(24345, "d_Panino", 71);
	
	o_Ingranaggio = new ItemCartello(24346, "o_Ingranaggio", 80);
	o_Cestino = new ItemCartello(24347, "o_Cestino", 81);
	o_RTFM = new ItemCartello(24348, "o_RTFM", 82);
	o_LGBT = new ItemCartello(24349, "o_LGBT", 83);
	
	

	white_diag_tile_raw = new ItemMattonella(24030, "white_diag_tile_raw", 160);
	light_gray_diag_tile_raw = new ItemMattonella(24031, "light_gray_diag_tile_raw", 161);
	gray_diag_tile_raw = new ItemMattonella(24032, "gray_diag_tile_raw", 162);
	black_diag_tile_raw = new ItemMattonella(24033, "black_diag_tile_raw", 163);
	brown_diag_tile_raw = new ItemMattonella(24034, "brown_diag_tile_raw", 164);
	red_diag_tile_raw = new ItemMattonella(24035, "red_diag_tile_raw", 165);
	orange_diag_tile_raw = new ItemMattonella(24036, "orange_diag_tile_raw", 166);
	yellow_diag_tile_raw = new ItemMattonella(24037, "yellow_diag_tile_raw", 167);
	lime_diag_tile_raw = new ItemMattonella(24038, "lime_diag_tile_raw", 168);
	green_diag_tile_raw = new ItemMattonella(24039, "green_diag_tile_raw", 169);
	light_blue_diag_tile_raw = new ItemMattonella(24040, "light_blue_diag_tile_raw", 170);
	cyan_diag_tile_raw = new ItemMattonella(24041, "cyan_diag_tile_raw", 171);
	blue_diag_tile_raw = new ItemMattonella(24042, "blue_diag_tile_raw", 172);
	purple_diag_tile_raw = new ItemMattonella(24043, "purple_diag_tile_raw", 173);
	magenta_diag_tile_raw = new ItemMattonella(24044, "magenta_diag_tile_raw", 174);
	pink_diag_tile_raw = new ItemMattonella(24045, "pink_diag_tile_raw", 175);
	
	
	white_tile_raw = new ItemMattonella(24046, "white_tile_raw", 176);
	light_gray_tile_raw = new ItemMattonella(24047, "light_gray_tile_raw", 177);
	gray_tile_raw = new ItemMattonella(24048, "gray_tile_raw", 178);
	black_tile_raw = new ItemMattonella(24049, "black_tile_raw", 179);
	brown_tile_raw = new ItemMattonella(24050, "brown_tile_raw", 180);
	red_tile_raw = new ItemMattonella(24051, "red_tile_raw", 181);
	orange_tile_raw = new ItemMattonella(24052, "orange_tile_raw", 182);
	yellow_tile_raw = new ItemMattonella(24053, "yellow_tile_raw", 183);
	lime_tile_raw = new ItemMattonella(24054, "lime_tile_raw", 184);
	green_tile_raw = new ItemMattonella(24055, "green_tile_raw", 185);
	light_blue_tile_raw = new ItemMattonella(24056, "light_blue_tile_raw", 186);
	cyan_tile_raw = new ItemMattonella(24057, "cyan_tile_raw", 187);
	blue_tile_raw = new ItemMattonella(24058, "blue_tile_raw", 188);
	purple_tile_raw = new ItemMattonella(24059, "purple_tile_raw", 189);
	magenta_tile_raw = new ItemMattonella(24060, "magenta_tile_raw", 190);
	pink_tile_raw = new ItemMattonella(24061, "pink_tile_raw", 191);
	
	white_med_tile_raw = new ItemMattonella(24062, "white_med_tile_raw", 192);
	light_gray_med_tile_raw = new ItemMattonella(24063, "light_gray_med_tile_raw", 193);
	gray_med_tile_raw = new ItemMattonella(24064, "gray_med_tile_raw", 194);
	black_med_tile_raw = new ItemMattonella(24065, "black_med_tile_raw", 195);
	brown_med_tile_raw = new ItemMattonella(24066, "brown_med_tile_raw", 196);
	red_med_tile_raw = new ItemMattonella(24067, "red_med_tile_raw", 197);
	orange_med_tile_raw = new ItemMattonella(24068, "orange_med_tile_raw", 198);
	yellow_med_tile_raw = new ItemMattonella(24069, "yellow_med_tile_raw", 199);
	lime_med_tile_raw = new ItemMattonella(24070, "lime_med_tile_raw", 200);
	green_med_tile_raw = new ItemMattonella(24071, "green_med_tile_raw", 201);
	light_blue_med_tile_raw = new ItemMattonella(24072, "light_blue_med_tile_raw", 202);
	cyan_med_tile_raw = new ItemMattonella(24073, "cyan_med_tile_raw", 203);
	blue_med_tile_raw = new ItemMattonella(24074, "blue_med_tile_raw", 204);
	purple_med_tile_raw = new ItemMattonella(24075, "purple_med_tile_raw", 205);
	magenta_med_tile_raw = new ItemMattonella(24076, "magenta_med_tile_raw", 206);
	pink_med_tile_raw = new ItemMattonella(24077, "pink_med_tile_raw", 207);
	
	white_small_tile_raw = new ItemMattonella(24078, "white_small_tile_raw", 208);
	light_gray_small_tile_raw = new ItemMattonella(24079, "light_gray_small_tile_raw", 209);
	gray_small_tile_raw = new ItemMattonella(24080, "gray_small_tile_raw", 210);
	black_small_tile_raw = new ItemMattonella(24081, "black_small_tile_raw", 211);
	brown_small_tile_raw = new ItemMattonella(24082, "brown_small_tile_raw", 212);
	red_small_tile_raw = new ItemMattonella(24083, "red_small_tile_raw", 213);
	orange_small_tile_raw = new ItemMattonella(24084, "orange_small_tile_raw", 214);
	yellow_small_tile_raw = new ItemMattonella(24085, "yellow_small_tile_raw", 215);
	lime_small_tile_raw = new ItemMattonella(24086, "lime_small_tile_raw", 216);
	green_small_tile_raw = new ItemMattonella(24087, "green_small_tile_raw", 217);
	light_blue_small_tile_raw = new ItemMattonella(24088, "light_blue_small_tile_raw", 218);
	cyan_small_tile_raw = new ItemMattonella(24089, "cyan_small_tile_raw", 219);
	blue_small_tile_raw = new ItemMattonella(24090, "blue_small_tile_raw", 220);
	purple_small_tile_raw = new ItemMattonella(24091, "purple_small_tile_raw", 221);
	magenta_small_tile_raw = new ItemMattonella(24092, "magenta_small_tile_raw", 222);
	pink_small_tile_raw = new ItemMattonella(24093, "pink_small_tile_raw", 223);

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
	portaCostosa = new ItemPorta(24426, 32, Blocks.portaCostosa).setItemName("itemPortaCostosa");
	door16 = new ItemPorta(24427, 33, Blocks.door16).setItemName("itemDoor16");
	door17 = new ItemPorta(24428, 34, Blocks.door17).setItemName("itemDoor17");
	doorMetal = new ItemPorta(24429, 35, Blocks.doorMetal).setItemName("itemDoorMetal");
	doorFireProof = new ItemPorta(24430, 36, Blocks.doorFireProof).setItemName("itemFireProof");
	
	}
	
	 
	
	
	public static void RegistraLingua() {
		
		
		LanguageRegistry.addName(Sign_acacia, "Acacia Sign");
		LanguageRegistry.addName(Sign_crimson, "Crimson Sign");
		LanguageRegistry.addName(Sign_dark_oak, "Dark Oak Sign");
		LanguageRegistry.addName(Sign_frame, "Framed Sign");
		LanguageRegistry.addName(Sign_jungle, "Jungle Sign");
		LanguageRegistry.addName(Sign_metal, "Metal Sign");
		LanguageRegistry.addName(Sign_oak, "Oak Sign");
		LanguageRegistry.addName(Sign_spruce, "Spruce Sign");
		LanguageRegistry.addName(Sign_warped, "Warped Sign");
		LanguageRegistry.addName(Sign_white, "White Sign");
		LanguageRegistry.addName(Sign_birch, "Birch Sign");
		
		LanguageRegistry.addName(straw, "Straw");
		LanguageRegistry.addName(metro, "Tape Measure");
		LanguageRegistry.addName(molten_glass, "Molten Glass");
		LanguageRegistry.addName(pacco, "Parcel");
		//LanguageRegistry.addName(SafeSnooper, "Safe Snooper");

		
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
		LanguageRegistry.addName(o_LGBT, "Bandiera Arcobaleno");
		
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
		LanguageRegistry.addName(door16, "Door, Type 17");
		LanguageRegistry.addName(door17, "Door, Type 18");
		LanguageRegistry.addName(doorMetal, "Door, Metal");
		LanguageRegistry.addName(doorFireProof, "Door, Fire Proof");
		LanguageRegistry.addName(portaCostosa, "Very Expensive Door (for stupidly rich people)");
		
		LanguageRegistry.addName(white_small_tile_raw, "White Small Raw Tile");
		LanguageRegistry.addName(light_gray_small_tile_raw, "Light Gray Small Raw Tile");
		LanguageRegistry.addName(gray_small_tile_raw, "Gray Small Raw Tile");
		LanguageRegistry.addName(black_small_tile_raw, "Black Small Raw Tile");
		LanguageRegistry.addName(brown_small_tile_raw, "Brown Small Raw Tile");
		LanguageRegistry.addName(red_small_tile_raw, "Red Small Raw Tile");
		LanguageRegistry.addName(orange_small_tile_raw, "Orange Small Raw Tile");
		LanguageRegistry.addName(yellow_small_tile_raw, "Yellow Small Raw Tile");
		LanguageRegistry.addName(lime_small_tile_raw, "Lime Small Raw Tile");
		LanguageRegistry.addName(green_small_tile_raw, "Green Small Raw Tile");
		LanguageRegistry.addName(light_blue_small_tile_raw, "Light Blue Small Raw Tile");
		LanguageRegistry.addName(cyan_small_tile_raw, "Cyan Small Raw Tile");
		LanguageRegistry.addName(blue_small_tile_raw, "Blue Small Raw Tile");
		LanguageRegistry.addName(purple_small_tile_raw, "Purple Small Raw Tile");
		LanguageRegistry.addName(magenta_small_tile_raw, "Magenta Small Raw Tile");
	
		LanguageRegistry.addName(white_diag_tile_raw, "White Diagonal Raw Tile");
		LanguageRegistry.addName(light_gray_diag_tile_raw, "Light Gray Diagonal Raw Tile");
		LanguageRegistry.addName(gray_diag_tile_raw, "Gray Diagonal Raw Tile");
		LanguageRegistry.addName(black_diag_tile_raw, "Black Diagonal Raw Tile");
		LanguageRegistry.addName(brown_diag_tile_raw, "Brown Diagonal Raw Tile");
		LanguageRegistry.addName(red_diag_tile_raw, "Red Diagonal Raw Tile");
		LanguageRegistry.addName(orange_diag_tile_raw, "Orange Diagonal Raw Tile");
		LanguageRegistry.addName(yellow_diag_tile_raw, "Yellow Diagonal Raw Tile");
		LanguageRegistry.addName(lime_diag_tile_raw, "Lime Diagonal Raw Tile");
		LanguageRegistry.addName(green_diag_tile_raw, "Green Diagonal Raw Tile");
		LanguageRegistry.addName(light_blue_diag_tile_raw, "Light Blue Diagonal Raw Tile");
		LanguageRegistry.addName(cyan_diag_tile_raw, "Cyan Diagonal Raw Tile");
		LanguageRegistry.addName(blue_diag_tile_raw, "Blue Diagonal Raw Tile");
		LanguageRegistry.addName(purple_diag_tile_raw, "Purple Diagonal Raw Tile");
		LanguageRegistry.addName(magenta_diag_tile_raw, "Magenta Diagonal Raw Tile");
		
		LanguageRegistry.addName(white_med_tile_raw, "White Medium Raw Tile");
		LanguageRegistry.addName(light_gray_med_tile_raw, "Light Gray Medium Raw Tile");
		LanguageRegistry.addName(gray_med_tile_raw, "Gray Medium Raw Tile");
		LanguageRegistry.addName(black_med_tile_raw, "Black Medium Raw Tile");
		LanguageRegistry.addName(brown_med_tile_raw, "Brown Medium Raw Tile");
		LanguageRegistry.addName(red_med_tile_raw, "Red Medium Raw Tile");
		LanguageRegistry.addName(orange_med_tile_raw, "Orange Medium Raw Tile");
		LanguageRegistry.addName(yellow_med_tile_raw, "Yellow Medium Raw Tile");
		LanguageRegistry.addName(lime_med_tile_raw, "Lime Medium Raw Tile");
		LanguageRegistry.addName(green_med_tile_raw, "Green Medium Raw Tile");
		LanguageRegistry.addName(light_blue_med_tile_raw, "Light Blue Medium Raw Tile");
		LanguageRegistry.addName(cyan_med_tile_raw, "Cyan Medium Raw Tile");
		LanguageRegistry.addName(blue_med_tile_raw, "Blue Medium Raw Tile");
		LanguageRegistry.addName(purple_med_tile_raw, "Purple Medium Raw Tile");
		LanguageRegistry.addName(magenta_med_tile_raw, "Magenta Medium Raw Tile");
		LanguageRegistry.addName(pink_med_tile_raw, "Pink Medium Raw Tile");
		
		LanguageRegistry.addName(white_tile_raw, "White Raw Tile");
		LanguageRegistry.addName(light_gray_tile_raw, "Light Gray Raw Tile");
		LanguageRegistry.addName(gray_tile_raw, "Gray Raw Tile");
		LanguageRegistry.addName(black_tile_raw, "Black Raw Tile");
		LanguageRegistry.addName(brown_tile_raw, "Brown Raw Tile");
		LanguageRegistry.addName(red_tile_raw, "Red Raw Tile");
		LanguageRegistry.addName(orange_tile_raw, "Orange Raw Tile");
		LanguageRegistry.addName(yellow_tile_raw, "Yellow Raw Tile");
		LanguageRegistry.addName(lime_tile_raw, "Lime Raw Tile");
		LanguageRegistry.addName(green_tile_raw, "Green Raw Tile");
		LanguageRegistry.addName(light_blue_tile_raw, "Light Blue Raw Tile");
		LanguageRegistry.addName(cyan_tile_raw, "Cyan Raw Tile");
		LanguageRegistry.addName(blue_tile_raw, "Blue Raw Tile");
		LanguageRegistry.addName(purple_tile_raw, "Purple Raw Tile");
		LanguageRegistry.addName(magenta_tile_raw, "Magenta Raw Tile");
		
		LanguageRegistry.addName(chisel, "Steel Chisel");
	}
}


