// 
// Decompiled by Procyon v0.5.36
// 

package appeng.api.me.util;

import java.util.List;
import net.minecraft.tileentity.TileEntity;

public interface IMEInventoryHandler extends IMEInventory
{
    int getPriority();
    
    void setPriority(final int p0);
    
    long totalBytes();
    
    long freeBytes();
    
    long usedBytes();
    
    long unusedItemCount();
    
    boolean canHoldNewItem();
    
    void setUpdateTarget(final TileEntity p0);
    
    List getPreformattedItems();
    
    void setPreformattedItems(final List p0);
    
    boolean isPreformatted();
    
    void setName(final String p0);
    
    String getName();
    
    void setGrid(final IGridInterface p0);
    
    IGridInterface getGrid();
    
    void setParent(final IMEInventoryHandler p0);
    
    IMEInventoryHandler getParent();
    
    void removeGrid(final IGridInterface p0, final IMEInventoryHandler p1, final List p2);
    
    void validate(final List p0);
}
