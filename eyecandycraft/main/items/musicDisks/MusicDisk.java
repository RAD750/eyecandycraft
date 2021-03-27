package eyecandycraft.main.items.musicDisks;

import eyecandycraft.main.CreativeTab;
import net.minecraft.item.ItemRecord;

public class MusicDisk extends ItemRecord {

	protected MusicDisk(int par1, String par2Str) {
		super(par1, par2Str);
		this.setTextureFile("/eyecandycraft/textures/dischi.png");
		setCreativeTab(CreativeTab.tabEyecandyAltro);
		maxStackSize = 1;
	}

}
