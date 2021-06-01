package eyecandycraft.main.handlers;

import net.minecraft.item.ItemStack;

public class GregtechHandler {
	/**
	 * Gets an Item from my Addon. The Indizes are the same, as the ones at the items.png
	 * @param aIndex Index of my Item
	 * @param aAmount Amount of the Item in the returned Stack
	 * @return The ItemStack you ordered, if not then look at the Log.
	 */
	public static ItemStack getGregTechItem(int aIndex, int aAmount, int aMeta) {
			try {
				return (ItemStack)Class.forName("gregtechmod.GT_Mod").getMethod("getGregTechItem", int.class, int.class, int.class).invoke(null, aIndex, aAmount, aMeta);
			} catch (Exception e) {}
		return null;
	}
}
