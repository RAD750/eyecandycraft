package eyecandycraft.main.network;

import cpw.mods.fml.common.network.IPacketHandler;
import cpw.mods.fml.common.network.Player;
import eyecandycraft.main.Main;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.logging.Level;
import net.minecraft.network.INetworkManager;
import net.minecraft.network.packet.Packet250CustomPayload;

public class EyeCandyPacketHandler implements IPacketHandler {

    private static EyeCandyPacket.PacketType[] packetTypes = EyeCandyPacket.PacketType.values();

    @Override
    public void onPacketData(INetworkManager manager, Packet250CustomPayload packet, Player player) {
        DataInputStream data = new DataInputStream(new ByteArrayInputStream(packet.data));
        try {
            EyeCandyPacket pkt = null;

            byte packetID = data.readByte();

            if (packetID < 0) {
                return;
            }

//            System.out.println("Packet Received: " + packetID);

            EyeCandyPacket.PacketType type = packetTypes[packetID];
            switch (type) {
                case CUSTOM_SIGN:
                    pkt = new PacketCustomSign();
                    break;
                default:
                    return;
            }
            pkt.readData(data, player);
            Main.proxy.onPacketReceived(manager, pkt, player);
        } catch (IOException e) {
            //Game.log(Level.SEVERE, "Exception in PacketHandler.onPacketData {0}", e);
            e.printStackTrace();
        }
    }
}
