package eyecandycraft.main.items;

import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.block.material.Material;
import eyecandycraft.main.CreativeTab;
import net.minecraft.block.Block;
import net.minecraft.item.ItemDoor;

public class ItemPorta extends ItemDoor
{
    public Block block;
    
    public ItemPorta(final int id, final int index, final Block doorblock) {
        super(id, Material.iron);
        this.setIconIndex(index);
        this.block = doorblock;
        this.setCreativeTab(CreativeTab.tabEyecandyMobilio);
    }
    
    public String getTextureFile() {
        return "/eyecandycraft/textures/porte_item.png";
    }
    
    public boolean onItemUse(final ItemStack par1ItemStack, final EntityPlayer par2EntityPlayer, final World par3World, final int par4, int par5, final int par6, final int par7, final float a, final float b, final float c) {
        if (par7 != 1) {
            return false;
        }
        ++par5;
        if (!par2EntityPlayer.canCurrentToolHarvestBlock(par4, par5, par6) || !par2EntityPlayer.canCurrentToolHarvestBlock(par4, par5 + 1, par6)) {
            return false;
        }
        if (!this.block.canPlaceBlockAt(par3World, par4, par5, par6)) {
            return false;
        }
        final int var9 = MathHelper.floor_double((((Entity)par2EntityPlayer).rotationYaw + 180.0f) * 4.0f / 360.0f - 0.5) & 0x3;
        placeDoorBlock(par3World, par4, par5, par6, var9, this.block);
        --par1ItemStack.stackSize;
        return true;
    }
}
