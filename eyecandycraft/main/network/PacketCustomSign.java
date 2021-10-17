package eyecandycraft.main.network;

import cpw.mods.fml.common.network.Player;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import eyecandycraft.main.entities.TileEntitySignCustom;
import eyecandycraft.main.utils.ChatColor;
import eyecandycraft.main.utils.Game;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.logging.Level;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.packet.NetHandler;
import net.minecraft.network.packet.Packet;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ChatAllowedCharacters;
import net.minecraft.world.World;

public class PacketCustomSign extends EyeCandyPacket {

    private TileEntitySignCustom sign;
    public String[] signText = new String[4];
    public int signColor;
    public char textColor;

    public PacketCustomSign() {
        super();
    }

    public PacketCustomSign(TileEntitySignCustom sign) {
        this.sign = sign;
//        System.out.println("Created Tile Packet: " + tile.getClass().getSimpleName());
    }

    @Override
    public Packet getPacket() {
        Packet pkt = super.getPacket();
        pkt.isChunkDataPacket = true;
        return pkt;
    }

    @Override
    public void writeData(DataOutputStream data) throws IOException {
        data.writeInt(sign.xCoord);
        data.writeInt(sign.yCoord);
        data.writeInt(sign.zCoord);
        
        for (int var2 = 0; var2 < 4; ++var2) {
            writeString(sign.signText[var2], data);
        }
        data.writeInt(sign.getSignColor());
        data.writeChar(sign.getTextColor().getChar());
    }

    @Override
    public void readData(DataInputStream data, Player player) throws IOException {
        
    	x = data.readInt();
        y = data.readInt();
        z = data.readInt();
        
        for (int i = 0; i < 4; ++i) {
        	signText[i] = readString(data, 64);
        }
        
        signColor = data.readInt();
        textColor = data.readChar();
    }
    
    @Override
    public int getID() {
        return PacketType.CUSTOM_SIGN.ordinal();
    }
}
