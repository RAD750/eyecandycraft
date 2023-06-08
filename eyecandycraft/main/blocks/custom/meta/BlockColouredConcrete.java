package eyecandycraft.main.blocks.custom.meta;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import eyecandycraft.main.CreativeTab;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockColouredConcrete extends Block {
	public BlockColouredConcrete(int id) {
		super(id, Material.iron);
		this.setBlockName("metaBlockColouredConcrete");
		this.setTextureFile("/eyecandycraft/textures/colouredConcrete.png");
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
		return 0 + metadata;
	}
}
