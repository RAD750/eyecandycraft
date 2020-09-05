package com.rgbcraft.baumod.main.blocks;

import net.minecraft.block.Block;
import java.util.Random;

import com.rgbcraft.baumod.main.items.Items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.block.BlockDoor;

public class BlockPorta extends BlockDoor
{
    public int spriteIndexTop;
    public int spriteIndexBottom;
    public int itemDropped;
    
    public BlockPorta(final int id, final int topsprite, final Material mat) {
    	super(id, mat);
        ((Block)this).blockIndexInTexture = topsprite;
        this.disableStats();
        this.setRequiresSelfNotify();    
    }
    
    
    public BlockPorta setItemDropped(final int itemid) {
        this.itemDropped = itemid;
        return this;
    }
    
    public int getBlockTextureFromSideAndMetadata(final int side, final int meta) {
        if ((meta & 0x8) == 0x8) {
            return this.spriteIndexTop;
        }
        return this.spriteIndexBottom;
    }
    
    @SideOnly(Side.CLIENT)

    /**
     * Retrieves the block texture to use based on the display side. Args: iBlockAccess, x, y, z, side
     */
    public int getBlockTexture(IBlockAccess par1IBlockAccess, int par2, int par3, int par4, int par5)
    {
        if (par5 != 0 && par5 != 1)
        {
            int var6 = this.getFullMetadata(par1IBlockAccess, par2, par3, par4);
            int var7 = this.blockIndexInTexture;

            if ((var6 & 8) != 0)
            {
                var7 -= 16;
            }

            int var8 = var6 & 3;
            boolean var9 = (var6 & 4) != 0;

            if (var9)
            {
                if (var8 == 0 && par5 == 2)
                {
                    var7 = -var7;
                }
                else if (var8 == 1 && par5 == 5)
                {
                    var7 = -var7;
                }
                else if (var8 == 2 && par5 == 3)
                {
                    var7 = -var7;
                }
                else if (var8 == 3 && par5 == 4)
                {
                    var7 = -var7;
                }
            }
            else
            {
                if (var8 == 0 && par5 == 5)
                {
                    var7 = -var7;
                }
                else if (var8 == 1 && par5 == 3)
                {
                    var7 = -var7;
                }
                else if (var8 == 2 && par5 == 4)
                {
                    var7 = -var7;
                }
                else if (var8 == 3 && par5 == 2)
                {
                    var7 = -var7;
                }

                if ((var6 & 16) != 0)
                {
                    var7 = -var7;
                }
            }

            return var7;
        }
        else
        {
            return this.blockIndexInTexture;
        }
    }
    
    public int idDropped(final int meta, final Random random, final int j) {
        if ((meta & 0x8) == 0x8) {
            return 0;
        }
        return this.itemDropped;
    }
    
    public String getTextureFile() {
        return "/com/rgbcraft/baumod/textures/textures.png";
    }
    
}
