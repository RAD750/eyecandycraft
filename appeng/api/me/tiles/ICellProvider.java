// 
// Decompiled by Procyon v0.5.36
// 

package appeng.api.me.tiles;

import net.minecraft.item.ItemStack;
import appeng.api.me.util.IMEInventory;
import appeng.api.me.util.IMEInventoryHandler;

public interface ICellProvider
{
    int usePowerForAddition(final int p0);
    
    IMEInventoryHandler provideCell();
    
    ItemStack signalInput(final IMEInventory p0, final ItemStack p1);
}
