package eyecandycraft.main.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemHangingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemCustomHangingEntity extends ItemHangingEntity {

	public ItemCustomHangingEntity(int par1, Class par2Class, String name) {
		super(par1, par2Class);
		this.setItemName(name);
	}
	
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
