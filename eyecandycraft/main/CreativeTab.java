package eyecandycraft.main;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import eyecandycraft.main.blocks.Blocks;
import eyecandycraft.main.items.Items;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class CreativeTab extends CreativeTabs {

	private String name;
	public static CreativeTabs tabEyecandyMobilio = new CreativeTab(CreativeTabs.getNextID(), "Eyecandycraft - Furniture");
	public static CreativeTabs tabEyecandyMateriali = new CreativeTab(CreativeTabs.getNextID(), "Eyecandycraft - Materials");
	public static CreativeTabs tabEyecandyCartelli = new CreativeTab(CreativeTabs.getNextID(), "Eyecandycraft - Signs");
	public static CreativeTabs tabEyecandyAltro = new CreativeTab(CreativeTabs.getNextID(), "Eyecandycraft - Other");

	public CreativeTab(int par1, String par2Str) {
		super(par1, par2Str);
		this.name = par2Str;
	}
	
	@Override
	public String toString() {
		return super.getTabLabel();
	}
	
	@SideOnly(Side.CLIENT) 
	public ItemStack getIconItemStack() {
		if(this.name == tabEyecandyMobilio.getTabLabel()) {
			return new ItemStack(Blocks.Estintore);
		} else if (this.name == tabEyecandyMateriali.getTabLabel()) {
			return new ItemStack(Blocks.yellow_plaster);
		} else if (this.name == tabEyecandyAltro.getTabLabel()) {
			return new ItemStack(Items.metro);
		} else if (this.name == tabEyecandyCartelli.getTabLabel()) {
			return new ItemStack(Items.d_Parkour);
		}
		return null;
	}
	
	
	@Override
	public String getTranslatedTabLabel() {
		return this.name;
	}

}

