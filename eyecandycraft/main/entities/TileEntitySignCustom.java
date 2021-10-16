package eyecandycraft.main.entities;

import eyecandycraft.main.network.EyeCandyPacket;
import eyecandycraft.main.network.PacketCustomSign;
import eyecandycraft.main.utils.ChatColor;
import net.minecraft.block.Block;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.Packet130UpdateSign;
import net.minecraft.tileentity.TileEntitySign;

public class TileEntitySignCustom extends TileEntitySign {

	private Block blockPost;
	private String textureFile;
	
	private ChatColor textColor;
	private ChatColor textFormat;
	private int signColor = -1;
	
	public TileEntitySignCustom() {
		this.textColor = ChatColor.RESET;
		this.textFormat = ChatColor.RESET;
	}
	
	/**
     * Writes a tile entity to NBT.
     */
    @Override
    public void writeToNBT(NBTTagCompound par1NBTTagCompound) {
        super.writeToNBT(par1NBTTagCompound);
        par1NBTTagCompound.setByte("TextColor", (byte)textColor.getChar());
        par1NBTTagCompound.setInteger("SignColor", signColor);
        par1NBTTagCompound.setByte("TextFormat", (byte)textFormat.getChar());
    }

    /**
     * Reads a tile entity from NBT.
     */
    @Override
    public void readFromNBT(NBTTagCompound par1NBTTagCompound) {
        super.readFromNBT(par1NBTTagCompound);
        this.textColor = ChatColor.getByChar((char)par1NBTTagCompound.getByte("TextColor"));
        this.signColor = par1NBTTagCompound.getInteger("SignColor");
        this.textFormat = ChatColor.getByChar((char)par1NBTTagCompound.getByte("TextFormat"));
    }
    
    /**
     * Overriden in a sign to provide the text.
     */
    @Override
    public Packet getDescriptionPacket() {
    	EyeCandyPacket packet = new PacketCustomSign(this);
        return packet.getPacket();
    }
    
    public void clearTextColor() {
    	this.textColor = ChatColor.RESET;
    	for(int i = 0; i<this.signText.length; i++) {
    		this.signText[i] = ChatColor.stripColor(this.signText[i]);
		}
    }
    
	public Block getBlockPost() {
		return blockPost;
	};
	
	public String getTextureFile() {
		return textureFile;
	};
	
	public int getSignColor() {
		return this.signColor;
	}
	
	public ChatColor getTextColor() {
		return this.textColor;
	}
	
	public ChatColor getTextFormat() {
		return this.textFormat;
	}
	
	public TileEntitySignCustom setSignColor(int signColor) {
		this.signColor = signColor;
		return this;
	}
	
	public TileEntitySignCustom setTextColor(ChatColor textColor) {
		this.textColor = textColor;
		return this;
	}
	
	public TileEntitySignCustom setTextFormat(ChatColor textFormat) {
		this.textColor = textFormat;
		return this;
	}
	
	public TileEntitySignCustom setBlockPost(Block blockPost) {
		this.blockPost = blockPost;
		return this;
	}
	
	public TileEntitySignCustom setTextureFile(String textureFile) {
		this.textureFile = textureFile;
		return this;
	}
}
