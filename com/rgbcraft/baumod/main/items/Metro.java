package com.rgbcraft.baumod.main.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class Metro extends Item {

	
	boolean started = false;
	int sposX;
	int sposY;
	int sposZ;
	int eposX;
	int eposY;
	int eposZ;
	
	public Metro(int par1) {
		super(par1);
		
	}
	 
	 public boolean onItemUse(ItemStack itemStack, EntityPlayer player, World world, int x, int y, int z, int side, float px, float py, float pz)
	   {
	        if(world.isRemote) {
			 	if (world.getBlockId(x, y, z) != 0) {
			 		if(!started) {
			 			sposX = x;
			 			sposY = y;
			 			sposZ = z;
			 			player.sendChatToPlayer("\247aSelezione 1 - X: " + Integer.toString(x) + " Y: " + Integer.toString(y) + " Z: " + Integer.toString(z));
			 			started = true;
			 		} else if(started) {
			 			eposX = x;
			 			eposY = y;
			 			eposZ = z;
			 			player.sendChatToPlayer("\247aSelezione 2 - X: " + Integer.toString(x) + " Y: " + Integer.toString(y) + " Z: " + Integer.toString(z));
			 			int deltaX = Math.abs(sposX - eposX) +1;
			 			int deltaY = Math.abs(sposY - eposY) +1;
			 			int deltaZ = Math.abs(sposZ - eposZ) +1;
			 			if(deltaY == 0) {
			 				deltaY = 1;
			 			}
			 			if(deltaX == 0) {
			 				deltaX = 1;
			 			}
			 			if(deltaZ == 0) {
			 				deltaZ = 1;
			 			}
			 			float dist = (float) (deltaX * deltaY * deltaZ);
			 			player.sendChatToPlayer("\247eMisura: " + Float.toString(dist) + " m³");
			 			started = false;
			 		}
			 		 		
			 		return true;
			 	}
	        }
		 
	        return false;
	   }

}
