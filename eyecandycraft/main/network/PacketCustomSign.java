package eyecandycraft.main.network;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import eyecandycraft.main.entities.TileEntitySignCustom;
import eyecandycraft.main.utils.ChatColor;
import eyecandycraft.main.utils.Game;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import net.minecraft.block.Block;
import net.minecraft.network.packet.Packet;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class PacketCustomSign extends EyeCandyPacket {

    private TileEntitySignCustom sign;

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
    @SideOnly(Side.CLIENT)
    public void readData(DataInputStream data) throws IOException {
    	World world = Game.getWorld();
        if (world == null) {
            return;
        }
    	
    	int x = data.readInt();
        int y = data.readInt();
        int z = data.readInt();
    	
        if (y < 0 || !world.blockExists(x, y, z)) {
            return;
        }

        TileEntity te = world.getBlockTileEntity(x, y, z);

        if (te instanceof TileEntitySignCustom) {
        	sign = (TileEntitySignCustom) te;
        } else {
            return;
        }
        
        for (int var2 = 0; var2 < 4; ++var2) {
        	sign.signText[var2] = readString(data, 64);
        }
        
        sign.setSignColor(data.readInt());
        sign.setTextColor(ChatColor.getByChar(data.readChar()));
    }

    @Override
    public int getID() {
        return PacketType.TILE_ENTITY.ordinal();
    }
}
