package eyecandycraft.main.items;

import java.util.List;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemBlockTappeto extends ItemBlock {

	public ItemBlockTappeto(int par1) {
		super(par1);
		setHasSubtypes(true);
	}
	
	@Override
	public String getItemNameIS(ItemStack itemStack) {
		return "carpet." + itemStack.getItemDamage();
	}

	@Override
	public int getMetadata(int damage) {
		return damage;
	}
	
	@Override
	public void getSubItems(int id, CreativeTabs creativeTab, List subBlocks) {
		for (int i = 0; i<=15; i++) {
			subBlocks.add(new ItemStack(id, 1, i));
		}
	}
}