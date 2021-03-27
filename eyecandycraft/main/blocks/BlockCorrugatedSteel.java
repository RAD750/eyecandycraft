package eyecandycraft.main.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import eyecandycraft.main.CreativeTab;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockCorrugatedSteel extends Block {
	public BlockCorrugatedSteel(int id) {
		super(id, Material.iron);
		this.setBlockName("corrugatedSteel");
		this.setTextureFile("/eyecandycraft/textures/textures.png");
		this.setCreativeTab(CreativeTab.tabEyecandyMateriali);
		this.setHardness(1.0F);
		this.setResistance(7.0F);
	}
	
	@Override
	public int damageDropped(int metadata) {
		return metadata;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public int getBlockTextureFromSideAndMetadata(int side, int metadata) {
		return 224 + metadata;
	}
}
