package eyecandycraft.main.items;

import java.util.List;

import eyecandycraft.main.CreativeTab;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemMattonella extends Item {

	public ItemMattonella(int id, String itemName, int textureIndex) {
		super(id);
		this.setItemName(itemName);
		this.setTextureFile("/eyecandycraft/textures/textures.png");
		this.setIconIndex(textureIndex);
	}
}
