// 
// Decompiled by Procyon v0.5.36
// 

package appeng.api;

import appeng.api.me.util.IMEInventoryHandler;
import net.minecraft.item.ItemStack;

public interface ICellRegistry
{
    void addCellHandler(final ICellHandler p0);
    
    boolean isCellHandled(final ItemStack p0);
    
    IMEInventoryHandler getHandlerForCell(final ItemStack p0);
}
