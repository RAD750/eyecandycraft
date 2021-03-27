package eyecandycraft.main.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class Metro extends Item {

	boolean started = false;

	Integer sposX;
	Integer sposY;
	Integer sposZ;
	Integer eposX;
	Integer eposY;
	Integer eposZ;

	public Metro(int par1) {
		super(par1);

	}

	public boolean onItemUse(ItemStack itemStack, EntityPlayer player, World world, int x, int y, int z, int side,
			float px, float py, float pz) {
		int count = 0;
		if (world.isRemote) {
			if (player.isSneaking()) {
				player.sendChatToPlayer("\247aSelezione 2 - X: " + Integer.toString(x) + " Y: " + Integer.toString(y)
				+ " Z: " + Integer.toString(z));
				sposX = x;
				sposY = y;
				sposZ = z;

				if (eposX != null && eposY != null && eposZ != null) {
					int deltaX = Math.abs(sposX - eposX) + 1;
					int deltaY = Math.abs(sposY - eposY) + 1;
					int deltaZ = Math.abs(sposZ - eposZ) + 1;

					if (eposX.equals(sposX)) {
						count += 1;
					}
					if (eposY.equals(sposY)) {
						count += 1;
					}
					if (eposZ.equals(sposZ)) {
						count += 1;
					}

					if (deltaY == 0) {
						deltaY = 1;
					}
					if (deltaX == 0) {
						deltaX = 1;
					}
					if (deltaZ == 0) {
						deltaZ = 1;
					}

					float dist = (float) (deltaX * deltaY * deltaZ);
					switch (count) {
					case 0:
						player.sendChatToPlayer("\247eMisura: " + Float.toString(dist) + " m³");
						break;
					case 1:
						player.sendChatToPlayer("\247eMisura: " + Float.toString(dist) + " m²");
						break;
					case 2:
						player.sendChatToPlayer("\247eMisura: " + Float.toString(dist) + " m");
						break;
					default:
						break;
					}
				}

			} else {

				eposX = x;
				eposY = y;
				eposZ = z;
				player.sendChatToPlayer("\247aSelezione 1 - X: " + Integer.toString(x) + " Y: " + Integer.toString(y)
				+ " Z: " + Integer.toString(z));

				if (sposX != null && sposY != null && sposZ != null) {
					int deltaX = Math.abs(sposX - eposX) + 1;
					int deltaY = Math.abs(sposY - eposY) + 1;
					int deltaZ = Math.abs(sposZ - eposZ) + 1;

					if (eposX.equals(sposX)) {
						count += 1;
					}
					if (eposY.equals(sposY)) {
						count += 1;
					}
					if (eposZ.equals(sposZ)) {
						count += 1;
					}

					if (deltaY == 0) {
						deltaY = 1;
					}
					if (deltaX == 0) {
						deltaX = 1;
					}
					if (deltaZ == 0) {
						deltaZ = 1;
					}


					float dist = (float) (deltaX * deltaY * deltaZ);
					switch (count) {
					case 0:
						player.sendChatToPlayer("\247eMisura: " + Float.toString(dist) + " m³");
						break;
					case 1:
						player.sendChatToPlayer("\247eMisura: " + Float.toString(dist) + " m²");
						break;
					case 2:
						player.sendChatToPlayer("\247eMisura: " + Float.toString(dist) + " m");
						break;
					default:
						break;
					}
				}

			}
		}

		return false;
	}

}
