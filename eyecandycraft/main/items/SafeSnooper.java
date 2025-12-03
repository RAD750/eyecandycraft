
package eyecandycraft.main.items;


import java.util.Iterator;

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

	public SafeSnooper(int par1) {
		super(par1);

	}
	
	@SideOnly(Side.CLIENT)
	public boolean onItemUse(ItemStack itemStack, EntityPlayer player, World world, int x, int y, int z, int side,
			float px, float py, float pz) {
			/*
			if (world.isRemote) {
				player.sendChatToPlayer("\247aOggetto - ID: " + Integer.toString(world.getBlockId(x, y, z)) + ":" + world.getBlockMetadata(x, y, z));
			}
			return false;
			*/
		final int EXTINGUISHER_RANGE = 3;
		
		for (int ix = x-EXTINGUISHER_RANGE; ix < x+EXTINGUISHER_RANGE; ix++) {
			for (int iy = y-EXTINGUISHER_RANGE; iy < y+EXTINGUISHER_RANGE; iy++) {
				for (int iz  = z-EXTINGUISHER_RANGE; iz < z+EXTINGUISHER_RANGE; iz++) {
					world.extinguishFire(player, ix, iy, iz, 1);
				}
			}	  
		}
		
		itemStack.damageItem(50, player);
		
		return true;
	}

}
