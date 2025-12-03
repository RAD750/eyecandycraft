package eyecandycraft.main.items;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemEstintore extends Item {

	public ItemEstintore(int par1) {
		super(par1);
		this.canRepair = false;
		this.setTextureFile("/eyecandycraft/textures/items.png");
		this.setIconIndex(32);
		this.setMaxDamage(100);
		this.setItemName("ItemEstintore");
		this.setMaxStackSize(1);
		this.setContainerItem(this);
	}

	public boolean onItemUse(ItemStack itemStack, EntityPlayer player, World world, int x, int y, int z, int side,
			float px, float py, float pz) {
		if (itemStack.getItemDamage() <= 97) {
			world.playSoundAtEntity(player, "random.fizz", 1.0F, 0.2F);

			final int EXTINGUISHER_RANGE = 3;

			for (int ix = x - EXTINGUISHER_RANGE; ix < x + EXTINGUISHER_RANGE; ix++) {
				for (int iy = y - EXTINGUISHER_RANGE; iy < y + EXTINGUISHER_RANGE; iy++) {
					for (int iz = z - EXTINGUISHER_RANGE; iz < z + EXTINGUISHER_RANGE; iz++) {
						world.extinguishFire(player, ix, iy, iz, 1);
					}
				}
			}
			itemStack.damageItem(49, player);
		}
		return true;

	}

	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
		super.addInformation(par1ItemStack, par2EntityPlayer, par3List, par4);
		if (par1ItemStack.getItemDamage() <= 97) {
			par3List.add("\247cRight click while wielding to discharge!");
		} else {
			par3List.add("\247c\247lEmpty! \247r\247cNeeds to be recharged!");
		}
	}
	

	@Override
	public int getIconFromDamage(int dmg) {
		if (dmg > 97) {
			return 89;
		}
		return 32;
	}
}
