package eyecandycraft.main.items;

import eyecandycraft.main.CreativeTab;
import eyecandycraft.main.blocks.Blocks;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import java.util.Random;

public class ItemChisel extends Item {

	public ItemChisel(int par1) {
		super(par1);
		this.canRepair = false;
		this.setTextureFile("/eyecandycraft/textures/items.png");
		this.setIconIndex(86);
		this.setMaxDamage(100);
		this.setItemName("chisel");
		this.setMaxStackSize(1);
		this.setContainerItem(Items.chisel);		
		this.setCreativeTab(CreativeTab.tabEyecandyAltro);
	}
	
	@Override
	public boolean doesContainerItemLeaveCraftingGrid(ItemStack par1ItemStack) {
		return false;
	}
	
	public boolean onItemUse(ItemStack itemStack, EntityPlayer player, World world, int x, int y, int z, int side,
			float hitX, float hitY, float hitZ) {
		if (!world.isRemote) {
			if (world.getBlockId(x, y, z) == Block.brick.blockID) {
		        Random r= new Random();
		        int meta = r.nextInt(3) + 10;
				world.setBlockAndMetadata(x, y, z, Blocks.blockOrnamental2.blockID, meta);
				itemStack.damageItem(1, player);
			}
			
		}
	return false;
	}
}	
