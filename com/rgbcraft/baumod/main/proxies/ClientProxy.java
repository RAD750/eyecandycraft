package com.rgbcraft.baumod.main.proxies;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import com.rgbcraft.baumod.main.entities.*;
import com.rgbcraft.baumod.main.models.*;
import net.minecraftforge.client.MinecraftForgeClient;

public class ClientProxy extends CommonProxy {
	public ClientProxy() {
	}

	@Mod.PreInit
	public void preInit(FMLPreInitializationEvent event) {
		super.preInit(event);
	}

	@Mod.Init
	public void init(FMLInitializationEvent event) {
		super.init(event);
		// Preloading texture per evitare bug
		MinecraftForgeClient.preloadTexture("/com/rgbcraft/baumod/textures/textures.png");
		MinecraftForgeClient.preloadTexture("/com/rgbcraft/baumod/textures/items.png");

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
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityNeonPiatto.class, new RenderTableNeonPiatto());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityLampadario.class, new RenderTableLampadario());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityLampioneGiardino.class, new RenderTableLampioneGiardino());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityLampioneMuro.class, new RenderTableLampioneMuro());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityLampadaScrivania.class, new RenderTableLampadaScrivania());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityAtariST.class, new RenderTableAtariST());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFaro.class, new RenderTableFaro());
	}

	@Mod.PostInit
	public void postInit(FMLPostInitializationEvent event) {
		super.postInit(event);
	}
}