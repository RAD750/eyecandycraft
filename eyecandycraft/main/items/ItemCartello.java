package eyecandycraft.main.items;

import eyecandycraft.main.CreativeTab;
import net.minecraft.item.Item;

public class ItemCartello extends Item {

	public ItemCartello(int id, String itemName, int textureIndex) {
		super(id);
		this.setItemName(itemName);
		this.setTextureFile("/eyecandycraft/textures/cartelli.png");
		this.setIconIndex(textureIndex);
		this.setCreativeTab(CreativeTab.tabEyecandyCartelli);
	}

}
