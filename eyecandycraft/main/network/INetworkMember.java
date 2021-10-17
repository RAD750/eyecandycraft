package eyecandycraft.main.network;

import com.google.common.io.ByteArrayDataInput;

import net.minecraft.entity.player.EntityPlayer;

public interface INetworkMember {

    void onClientPacketReceived(EyeCandyPacket packet, EntityPlayer entityPlayer);

    void onServerPacketReceived(EyeCandyPacket packet, EntityPlayer entityPlayer);

}
