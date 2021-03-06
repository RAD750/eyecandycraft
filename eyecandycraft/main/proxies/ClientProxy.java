package eyecandycraft.main.proxies;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import eyecandycraft.main.entities.*;
//import eyecandycraft.main.handlers.SoundHandler;
import eyecandycraft.main.models.*;
import net.minecraft.client.Minecraft;
import net.minecraft.client.audio.SoundManager;
import net.minecraftforge.client.MinecraftForgeClient;
import net.minecraftforge.common.MinecraftForge;

public class ClientProxy extends CommonProxy {
	public ClientProxy() {
	}



	@PreInit
	public void preInit(FMLPreInitializationEvent event) {
		super.preInit(event);
		
	}

	@Init
	public void init(FMLInitializationEvent event) {
		super.init(event);
		//new SoundHandler();
		// Preloading texture per evitare bug
		MinecraftForgeClient.preloadTexture("/eyecandycraft/textures/textures.png");
		MinecraftForgeClient.preloadTexture("/eyecandycraft/textures/items.png");
		MinecraftForgeClient.preloadTexture("/eyecandycraft/textures/porte_block.png");
		MinecraftForgeClient.preloadTexture("/eyecandycraft/textures/porte_item.png");

		System.out.println("[Eyecandycraft] Preloading texture completato, fanculo a greg");



		// Registra le tile entities
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityParabolaSat.class, new RenderTableParabolaSat());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityAntennaGroundPlane.class,
				new RenderTableAntennaGroundPlane());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityAntennaYagiVHF.class, new RenderTableAntennaYagiVHF());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityAntennaYagiUHF.class, new RenderTableAntennaYagiUHF());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityAntennaLogperiodica.class,
				new RenderTableAntennaLogperiodica());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityAntennaSettore900MHz.class,
				new RenderTableAntennaSettore900MHz());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityTraliccio.class, new RenderTableTraliccio());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityTraliccioBraccettoSingolo.class, new RenderTableTraliccioBraccettoSingolo());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityTraliccioBraccettoSat.class, new RenderTableTraliccioBraccettoSat());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityTraliccioBraccettoCCTV.class, new RenderTableTraliccioBraccettoCCTV());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityNeonPiatto.class, new RenderTableNeonPiatto());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityNeon.class, new RenderTableNeon());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityLampadario.class, new RenderTableLampadario());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityLampioneGiardino.class, new RenderTableLampioneGiardino());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityLampioneMuro.class, new RenderTableLampioneMuro());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityLampadaScrivania.class, new RenderTableLampadaScrivania());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityAtariST.class, new RenderTableAtariST());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityPortatile.class, new RenderTablePortatile());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFaro.class, new RenderTableFaro());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityCroceSAndrea.class, new RenderTableCroceSAndrea());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFaroPavimento.class, new RenderTableFaroPavimento());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityMicrofono.class, new RenderTableMicrofono());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityTelecamera.class, new RenderTableTelecamera());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityConsoleRegia.class, new RenderTableConsoleRegia());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityRackRF.class, new RenderTableRackRF());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityTVLCD.class, new RenderTableTVLCD());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityTVOLED.class, new RenderTableTVOLED());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityCCTVCam.class, new RenderTableCCTVCam());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityCCTVCamPTZ.class, new RenderTableCCTVCamPTZ());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityEstintore.class, new RenderTableEstintore());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityPolycom.class, new RenderTablePolycom());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityClima.class, new RenderTableClima());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityClimaUE.class, new RenderTableClimaUE());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityScrivania.class, new RenderTableScrivania());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityTVOLEDVESA.class, new RenderTableTVOLEDVESA());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityModemSat.class, new RenderTableModemSat());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBocchettaAC.class, new RenderTableBocchettaAC());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityLampionePaloModerno.class, new RenderTableLampionePaloModerno());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityLampionePaloVecchio.class, new RenderTableLampionePaloVecchio());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityCartelloEndor.class, new RenderTableCartelloEndor());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBitta.class, new RenderTableBitta());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityOB.class, new RenderTableOB());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBombolaGas.class, new RenderTableBombolaGas());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityPanchinaCentro.class, new RenderTablePanchinaCentro());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityPanchinaSinistra.class, new RenderTablePanchinaSinistra());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityPanchinaDestra.class, new RenderTablePanchinaDestra());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityAntenna4G.class, new RenderTableAntenna4G());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityAntenna5G.class, new RenderTableAntenna5G());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityDecade.class, new RenderTableDecade());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityArmadioFTTC.class, new RenderTableArmadioFTTC());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityLanterna.class, new RenderTableLanterna());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityTransenna.class, new RenderTableTransenna());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityPaloScaletta.class, new RenderTablePaloScaletta());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityScalettaMuro.class, new RenderTableScalettaMuro());
	}

	@Mod.PostInit
	public void postInit(FMLPostInitializationEvent event) {
		super.postInit(event);
	}
}