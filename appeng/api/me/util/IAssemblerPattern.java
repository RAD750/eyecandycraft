// 
// Decompiled by Procyon v0.5.36
// 

package appeng.api.me.util;

import net.minecraft.tileentity.TileEntity;
import net.minecraft.inventory.InventoryCrafting;
import java.util.List;
import net.minecraft.world.World;
import net.minecraft.item.ItemStack;

public interface IAssemblerPattern
{
    IAssemblerCluster getCluster();
    
    ItemStack[] getCraftingMatrix();
    
    InventoryCrafting getCraftingInv(final World p0, final IMEInventory p1, final List p2, final List p3);
    
    ItemStack getOutput();
    
    boolean isEncoded();
    
    void encodePattern(final ItemStack[] p0, final ItemStack p1);
    
    boolean isCraftable(final World p0);
    
    List condensedRequirements();
    
    TileEntity getInterface();
    
    void setInterface(final TileEntity p0);
}
