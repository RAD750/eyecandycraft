package eyecandycraft.main.blocks.custom.meta;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import eyecandycraft.main.CreativeTab;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class BlockOrnamental6 extends Block {
	public BlockOrnamental6(int id) {
		super(id, Material.rock);
		this.setBlockName("metaBlockOrnamental6");
		this.setTextureFile("/eyecandycraft/textures/ornamentalBlocks.png");
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
		return 80 + metadata;
	}
	
}
