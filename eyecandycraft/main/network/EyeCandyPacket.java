package eyecandycraft.main.network;

import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import cpw.mods.fml.common.network.Player;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.Packet250CustomPayload;

public abstract class EyeCandyPacket {

    public final static String CHANNEL_NAME = "ECC";
    public int x;
    public int y;
    public int z;

    public enum PacketType {

        CUSTOM_SIGN,}

    public Packet getPacket() {

        ByteArrayOutputStream bytes = new ByteArrayOutputStream();
        DataOutputStream data = new DataOutputStream(bytes);
        try {
            data.writeByte(getID());
            writeData(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Packet250CustomPayload pkt = new Packet250CustomPayload();
        pkt.channel = CHANNEL_NAME;
        pkt.data = bytes.toByteArray();
        pkt.length = pkt.data.length;
        return pkt;
    }

    public abstract void writeData(DataOutputStream data) throws IOException;

    public abstract void readData(DataInputStream data, Player player) throws IOException;

    public abstract int getID();
    
    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
    
    public static void writeString(String par0Str, DataOutputStream par1DataOutputStream) throws IOException
    {
        if (par0Str.length() > 32767)
        {
            throw new IOException("String too big");
        }
        else
        {
            par1DataOutputStream.writeShort(par0Str.length());
            par1DataOutputStream.writeChars(par0Str);
        }
    }

    /**
     * Reads a string from a packet
     */
    public static String readString(DataInputStream par0DataInputStream, int par1) throws IOException
    {
        short var2 = par0DataInputStream.readShort();

        if (var2 > par1)
        {
            throw new IOException("Received string length longer than maximum allowed (" + var2 + " > " + par1 + ")");
        }
        else if (var2 < 0)
        {
            throw new IOException("Received string length is less than zero! Weird string!");
        }
        else
        {
            StringBuilder var3 = new StringBuilder();

            for (int var4 = 0; var4 < var2; ++var4)
            {
                var3.append(par0DataInputStream.readChar());
            }

            return var3.toString();
        }
    }
}
