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
	
	//CARTELLI
	
	public static Item a_CentraleTermica, a_LocalePompe, a_LocaleCaldaie, a_LocaleApplied, a_LocaleLogistic, a_ProprietaPrivata, a_LocaleSerbatoi, a_CabinaElettrica, ab_DPI, ab_IndProtettivi, ab_RTFM, ab_ObbligoGenerico, a_IntElettricoGenerale;
	public static Item f_Estintore, f_AllarmeIncendio, f_Sirena;
	public static Item e_Doccia, e_ProntoSoccorso, e_UscitaEmergenza, e_Martelletto, e_RompereVetro, e_PuntoRitrovo;
	public static Item p_PericoloGenerico, p_Esplosivo, p_Laser, p_Radioattivo, p_Infiammabile, p_Freddo, p_Batterie, p_Corrente, p_Tossico, p_Biohaz, p_Asfissiante, p_Toro, p_EX, p_Corrente2, p_IAEA;
	public static Item d_Persona, d_Fiammifero, d_BereAcqua, d_Spegnere, d_IncendioAcqua, d_Ingresso, d_Parkour, d_Panino;
	public static Item o_Ingranaggio, o_Cestino, o_RTFM;
	
	
	public static void InizializzaItem() {

	
	molten_glass = new Item(24100).setTextureFile("/com/rgbcraft/baumod/textures/items.png").setIconIndex(1)
			.setCreativeTab(CreativeTabs.tabMaterials).setItemName("molten_glass").setMaxStackSize(8);
	
	straw = new Item(24000).setTextureFile("/com/rgbcraft/baumod/textures/items.png").setIconCoord(0, 0)
			.setCreativeTab(CreativeTabs.tabMaterials).setItemName("straw");
	
	metro = new Metro(24101).setTextureFile("/com/rgbcraft/baumod/textures/items.png").setIconIndex(40)
			.setCreativeTab(CreativeTabs.tabTools).setItemName("metro").setMaxStackSize(1);
	
	a_CentraleTermica = new Item(24301).setIconIndex(0).setItemName("a_CentraleTermica").setTextureFile("/com/rgbcraft/baumod/textures/cartelli.png").setCreativeTab(CreativeTabs.tabDecorations);
	a_LocalePompe = new Item(24302).setIconIndex(1).setItemName("a_LocalePompe").setTextureFile("/com/rgbcraft/baumod/textures/cartelli.png").setCreativeTab(CreativeTabs.tabDecorations);
	a_LocaleCaldaie = new Item(24303).setIconIndex(2).setItemName("a_LocaleCaldaie").setTextureFile("/com/rgbcraft/baumod/textures/cartelli.png").setCreativeTab(CreativeTabs.tabDecorations);
	a_LocaleApplied = new Item(24304).setIconIndex(3).setItemName("a_LocaleApplied").setTextureFile("/com/rgbcraft/baumod/textures/cartelli.png").setCreativeTab(CreativeTabs.tabDecorations);
	a_LocaleLogistic = new Item(24305).setIconIndex(4).setItemName("a_LocaleLogistic").setTextureFile("/com/rgbcraft/baumod/textures/cartelli.png").setCreativeTab(CreativeTabs.tabDecorations);
	a_ProprietaPrivata = new Item(24306).setIconIndex(5).setItemName("a_ProprietaPrivata").setTextureFile("/com/rgbcraft/baumod/textures/cartelli.png").setCreativeTab(CreativeTabs.tabDecorations);
	a_LocaleSerbatoi = new Item(24307).setIconIndex(6).setItemName("a_LocaleSerbatoi").setTextureFile("/com/rgbcraft/baumod/textures/cartelli.png").setCreativeTab(CreativeTabs.tabDecorations);
	a_CabinaElettrica = new Item(24308).setIconIndex(7).setItemName("a_CabinaElettrica").setTextureFile("/com/rgbcraft/baumod/textures/cartelli.png").setCreativeTab(CreativeTabs.tabDecorations);
	ab_DPI = new Item(24309).setIconIndex(8).setItemName("ab_DPI").setTextureFile("/com/rgbcraft/baumod/textures/cartelli.png").setCreativeTab(CreativeTabs.tabDecorations);
	ab_IndProtettivi = new Item(24310).setIconIndex(10).setItemName("ab_IndProtettivi").setTextureFile("/com/rgbcraft/baumod/textures/cartelli.png").setCreativeTab(CreativeTabs.tabDecorations);
	ab_RTFM = new Item(24311).setIconIndex(11).setItemName("ab_RTFM").setTextureFile("/com/rgbcraft/baumod/textures/cartelli.png").setCreativeTab(CreativeTabs.tabDecorations);
	ab_ObbligoGenerico = new Item(24312).setIconIndex(12).setItemName("ab_ObbligoGenerico").setTextureFile("/com/rgbcraft/baumod/textures/cartelli.png").setCreativeTab(CreativeTabs.tabDecorations);
	a_IntElettricoGenerale = new Item(24313).setIconIndex(13).setItemName("a_IntElettricoGenerale").setTextureFile("/com/rgbcraft/baumod/textures/cartelli.png").setCreativeTab(CreativeTabs.tabDecorations);
	
	f_Estintore = new Item(24314).setIconIndex(16).setItemName("f_Estintore").setTextureFile("/com/rgbcraft/baumod/textures/cartelli.png").setCreativeTab(CreativeTabs.tabDecorations);
	f_AllarmeIncendio = new Item(24315).setIconIndex(17).setItemName("f_AllarmeIncendio").setTextureFile("/com/rgbcraft/baumod/textures/cartelli.png").setCreativeTab(CreativeTabs.tabDecorations);
	f_Sirena = new Item(24316).setIconIndex(18).setItemName("f_Sirena").setTextureFile("/com/rgbcraft/baumod/textures/cartelli.png").setCreativeTab(CreativeTabs.tabDecorations);
	
	e_Doccia = new Item(24317).setIconIndex(32).setItemName("e_Doccia").setTextureFile("/com/rgbcraft/baumod/textures/cartelli.png").setCreativeTab(CreativeTabs.tabDecorations);
	e_ProntoSoccorso = new Item(24318).setIconIndex(33).setItemName("e_ProntoSoccorso").setTextureFile("/com/rgbcraft/baumod/textures/cartelli.png").setCreativeTab(CreativeTabs.tabDecorations);
	e_UscitaEmergenza = new Item(24319).setIconIndex(34).setItemName("e_UscitaEmergenza").setTextureFile("/com/rgbcraft/baumod/textures/cartelli.png").setCreativeTab(CreativeTabs.tabDecorations);
	e_Martelletto = new Item(24320).setIconIndex(35).setItemName("e_Martelletto").setTextureFile("/com/rgbcraft/baumod/textures/cartelli.png").setCreativeTab(CreativeTabs.tabDecorations);
	e_RompereVetro = new Item(24321).setIconIndex(36).setItemName("e_RompereVetro").setTextureFile("/com/rgbcraft/baumod/textures/cartelli.png").setCreativeTab(CreativeTabs.tabDecorations);
	e_PuntoRitrovo = new Item(24322).setIconIndex(37).setItemName("e_PuntoRitrovo").setTextureFile("/com/rgbcraft/baumod/textures/cartelli.png").setCreativeTab(CreativeTabs.tabDecorations);
	
	p_PericoloGenerico = new Item(24323).setIconIndex(48).setItemName("p_PericoloGenerico").setTextureFile("/com/rgbcraft/baumod/textures/cartelli.png").setCreativeTab(CreativeTabs.tabDecorations);
	p_Esplosivo = new Item(24324).setIconIndex(49).setItemName("p_Esplosivo").setTextureFile("/com/rgbcraft/baumod/textures/cartelli.png").setCreativeTab(CreativeTabs.tabDecorations);
	p_Laser = new Item(24325).setIconIndex(50).setItemName("p_Laser").setTextureFile("/com/rgbcraft/baumod/textures/cartelli.png").setCreativeTab(CreativeTabs.tabDecorations);
	p_Radioattivo = new Item(24326).setIconIndex(51).setItemName("p_Radioattivo").setTextureFile("/com/rgbcraft/baumod/textures/cartelli.png").setCreativeTab(CreativeTabs.tabDecorations);
	p_Infiammabile = new Item(24327).setIconIndex(52).setItemName("p_Infiammabile").setTextureFile("/com/rgbcraft/baumod/textures/cartelli.png").setCreativeTab(CreativeTabs.tabDecorations);
	p_Freddo = new Item(24328).setIconIndex(53).setItemName("p_Freddo").setTextureFile("/com/rgbcraft/baumod/textures/cartelli.png").setCreativeTab(CreativeTabs.tabDecorations);
	p_Batterie = new Item(24329).setIconIndex(54).setItemName("p_Batterie").setTextureFile("/com/rgbcraft/baumod/textures/cartelli.png").setCreativeTab(CreativeTabs.tabDecorations);
	p_Corrente = new Item(24330).setIconIndex(55).setItemName("p_Corrente").setTextureFile("/com/rgbcraft/baumod/textures/cartelli.png").setCreativeTab(CreativeTabs.tabDecorations);
	p_Tossico = new Item(24331).setIconIndex(56).setItemName("p_Tossico").setTextureFile("/com/rgbcraft/baumod/textures/cartelli.png").setCreativeTab(CreativeTabs.tabDecorations);
	p_Biohaz = new Item(24332).setIconIndex(57).setItemName("p_Biohaz").setTextureFile("/com/rgbcraft/baumod/textures/cartelli.png").setCreativeTab(CreativeTabs.tabDecorations);
	p_Asfissiante = new Item(24333).setIconIndex(58).setItemName("p_Asfissiante").setTextureFile("/com/rgbcraft/baumod/textures/cartelli.png").setCreativeTab(CreativeTabs.tabDecorations);
	p_Toro = new Item(24334).setIconIndex(59).setItemName("p_Toro").setTextureFile("/com/rgbcraft/baumod/textures/cartelli.png").setCreativeTab(CreativeTabs.tabDecorations);
	p_EX = new Item(24335).setIconIndex(60).setItemName("p_EX").setTextureFile("/com/rgbcraft/baumod/textures/cartelli.png").setCreativeTab(CreativeTabs.tabDecorations);
	p_Corrente2 = new Item(24336).setIconIndex(62).setItemName("p_Corrente2").setTextureFile("/com/rgbcraft/baumod/textures/cartelli.png").setCreativeTab(CreativeTabs.tabDecorations);
	p_IAEA = new Item(24337).setIconIndex(63).setItemName("p_IAEA").setTextureFile("/com/rgbcraft/baumod/textures/cartelli.png").setCreativeTab(CreativeTabs.tabDecorations);
	
	d_Persona = new Item(24338).setIconIndex(64).setItemName("p_Persona").setTextureFile("/com/rgbcraft/baumod/textures/cartelli.png").setCreativeTab(CreativeTabs.tabDecorations);
	d_Fiammifero = new Item(24339).setIconIndex(65).setItemName("p_Fiammifero").setTextureFile("/com/rgbcraft/baumod/textures/cartelli.png").setCreativeTab(CreativeTabs.tabDecorations);
	d_BereAcqua = new Item(24340).setIconIndex(66).setItemName("p_BereAcqua").setTextureFile("/com/rgbcraft/baumod/textures/cartelli.png").setCreativeTab(CreativeTabs.tabDecorations);
	d_Spegnere = new Item(24341).setIconIndex(67).setItemName("p_Spegnere").setTextureFile("/com/rgbcraft/baumod/textures/cartelli.png").setCreativeTab(CreativeTabs.tabDecorations);
	d_IncendioAcqua = new Item(24342).setIconIndex(68).setItemName("p_IncendioAcqua").setTextureFile("/com/rgbcraft/baumod/textures/cartelli.png").setCreativeTab(CreativeTabs.tabDecorations);
	d_Ingresso = new Item(24343).setIconIndex(69).setItemName("p_Ingresso").setTextureFile("/com/rgbcraft/baumod/textures/cartelli.png").setCreativeTab(CreativeTabs.tabDecorations);
	d_Parkour = new Item(24344).setIconIndex(70).setItemName("p_Parkour").setTextureFile("/com/rgbcraft/baumod/textures/cartelli.png").setCreativeTab(CreativeTabs.tabDecorations);
	d_Panino = new Item(24345).setIconIndex(71).setItemName("p_Panino").setTextureFile("/com/rgbcraft/baumod/textures/cartelli.png").setCreativeTab(CreativeTabs.tabDecorations);
	
	o_Ingranaggio = new Item(24346).setIconIndex(80).setItemName("o_Ingranaggio").setTextureFile("/com/rgbcraft/baumod/textures/cartelli.png").setCreativeTab(CreativeTabs.tabDecorations);
	o_Cestino = new Item(24347).setIconIndex(81).setItemName("o_Cestino").setTextureFile("/com/rgbcraft/baumod/textures/cartelli.png").setCreativeTab(CreativeTabs.tabDecorations);
	o_RTFM = new Item(24348).setIconIndex(82).setItemName("o_RTFM").setTextureFile("/com/rgbcraft/baumod/textures/cartelli.png").setCreativeTab(CreativeTabs.tabDecorations);
	
	
	
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
		LanguageRegistry.addName(ab_ObbligoGenerico, "Cartello Obbligo Cenerico");
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
	}
}

