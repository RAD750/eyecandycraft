package eyecandycraft.main.proxies;

import java.util.logging.Level;

import com.google.common.io.ByteArrayDataInput;
import com.google.common.io.ByteStreams;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.Player;
import eyecandycraft.main.handlers.LightningHandler;
import eyecandycraft.main.network.EyeCandyPacket;
import eyecandycraft.main.network.INetworkMember;
import eyecandycraft.main.utils.Game;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.network.INetworkManager;
import net.minecraft.network.packet.Packet250CustomPayload;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.common.MinecraftForge;

public class ServerProxy extends CommonProxy {
	public ServerProxy() {
	}

	@Mod.PreInit
	public void preInit(FMLPreInitializationEvent event) {
		super.preInit(event);
		
	}

	@Mod.Init
	public void init(FMLInitializationEvent event) {
		super.init(event);
	}

	@Mod.PostInit
	public void postInit(FMLPostInitializationEvent event) {
		super.postInit(event);
	}

	@Override
	public void onPacketReceived(INetworkManager manager, EyeCandyPacket packet, Player player) {
        super.onPacketReceived(manager, packet, player);
        
		if (player instanceof EntityPlayerMP) {
            EntityPlayerMP entityPlayerMP = (EntityPlayerMP) player;

            TileEntity tileEntity = entityPlayerMP.worldObj.getBlockTileEntity(packet.x, packet.y, packet.z);
            if (tileEntity != null && tileEntity instanceof INetworkMember) {
                ((INetworkMember) tileEntity).onServerPacketReceived(packet, (EntityPlayer) player);
            } else {
                Game.log(Level.WARNING, String.format("Received a server packet ID for a non network member!"));
            }
        }
	}
}