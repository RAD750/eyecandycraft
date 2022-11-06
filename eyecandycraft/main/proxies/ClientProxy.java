package eyecandycraft.main.proxies;

import java.util.logging.Level;

import com.google.common.io.ByteArrayDataInput;
import com.google.common.io.ByteStreams;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.Player;
import eyecandycraft.main.blocks.Blocks;
import eyecandycraft.main.entities.*;
//import eyecandycraft.main.handlers.SoundHandler;
import eyecandycraft.main.network.EyeCandyPacket;
import eyecandycraft.main.network.INetworkMember;
import eyecandycraft.main.renderers.TileEntitySignCustomRenderer;
import eyecandycraft.main.solid.rendertables.*;
import eyecandycraft.main.utils.Game;
import net.minecraft.client.Minecraft;
import net.minecraft.client.audio.SoundManager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.network.INetworkManager;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
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
		MinecraftForgeClient.preloadTexture("/eyecandycraft/textures/metaBlocks.png");
		MinecraftForgeClient.preloadTexture("/eyecandycraft/textures/metaPane.png");


		System.out.println("[Eyecandycraft] Preloading texture completato");



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
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntitySirena.class, new RenderTableSirena());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityLightningRod.class, new RenderTableLightningRod());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntitySignCustom.class, new TileEntitySignCustomRenderer());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityAntenna80GHz.class, new RenderTableAntenna80GHz());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityARLO.class, new RenderTableARLO());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityMiniARLO.class, new RenderTableMiniARLO());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityAntennaFMDipolo.class, new RenderTableAntennaFMDipolo());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityAntennaESM.class, new RenderTableAntennaESM());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityAntennaPannello.class, new RenderTableAntennaPannello());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityAntennaSettoreLTE.class, new RenderTableAntennaSettoreLTE());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityAntennaSettoreLTEMIMO.class, new RenderTableAntennaSettoreLTEMIMO());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityEstensioneBTS.class, new RenderTableEstensioneBTS());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityEstensioneSingolaBTS.class, new RenderTableEstensioneSingolaBTS());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityROE.class, new RenderTableROE());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityTraliccioBraccettoParabola.class, new RenderTableTraliccioBraccettoParabola());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityPaloGrosso.class, new RenderTablePaloGrosso());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityPaloCimaSingolo.class, new RenderTablePaloCimaSingolo());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityPaloCimaDoppio.class, new RenderTablePaloCimaDoppio());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityPadellone.class, new RenderTablePadellone());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFountain.class, new RenderTableFountain());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityAntennaVDipole.class, new RenderTableAntennaVDipole());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityCavo.class, new RenderTableCavo());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityDoccia.class, new RenderTableDoccia());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityDocciaMiscelatore.class, new RenderTableDocciaMiscelatore());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityPersiane.class, new RenderTablePersiane());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityPersianeMezza.class, new RenderTablePersianeMezza());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBarbedWire.class, new RenderTableBarbedWire());

	}

	@Mod.PostInit
	public void postInit(FMLPostInitializationEvent event) {
		super.postInit(event);
	}
	
    @Override
    public void onPacketReceived(INetworkManager manager, EyeCandyPacket packet, Player player) {
        super.onPacketReceived(manager, packet, player);

        if (!(player instanceof EntityPlayerMP)) {
            World world = FMLClientHandler.instance().getClient().theWorld;

            TileEntity tileEntity = world.getBlockTileEntity(packet.x, packet.y, packet.z);
            if (tileEntity != null && tileEntity instanceof INetworkMember)
                ((INetworkMember) tileEntity).onClientPacketReceived(packet, (EntityPlayer) player);
            else
                Game.log(Level.WARNING, String.format("Received a client packet ID for a non network member!"));
        }
    }
}