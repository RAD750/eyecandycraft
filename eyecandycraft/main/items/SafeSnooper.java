/*
package eyecandycraft.main.items;


import cpw.mods.fml.common.WorldAccessContainer;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSign;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class SafeSnooper extends Item {

	boolean started = false;

	Integer sposX;
	Integer sposY;
	Integer sposZ;
	Integer eposX;
	Integer eposY;
	Integer eposZ;

	public SafeSnooper(int par1) {
		super(par1);

	}
	

	public boolean onItemUse(ItemStack itemStack, EntityPlayer player, World world, int x, int y, int z, int side,
			float px, float py, float pz) {
				TileEntity te = world.getBlockTileEntity(x, y, z);
				player.sendChatToPlayer("AO");
				System.out.println(te.blockType.blockID);
				return started;
				
	}

}
*/