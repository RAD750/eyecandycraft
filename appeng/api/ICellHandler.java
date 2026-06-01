// 
// Decompiled by Procyon v0.5.36
// 

package appeng.api;

import appeng.api.me.util.IMEInventoryHandler;
import net.minecraft.item.ItemStack;

public interface ICellHandler
{
    boolean isCell(final ItemStack p0);
    
    IMEInventoryHandler getCellHandler(final ItemStack p0);
}
