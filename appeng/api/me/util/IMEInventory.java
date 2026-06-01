// 
// Decompiled by Procyon v0.5.36
// 

package appeng.api.me.util;

import java.util.List;
import net.minecraft.item.ItemStack;

public interface IMEInventory
{
    long storedItemTypes();
    
    long storedItemCount();
    
    long remainingItemCount();
    
    long remainingItemTypes();
    
    boolean containsItemType(final ItemStack p0);
    
    long getTotalItemTypes();
    
    long countOfItemType(final ItemStack p0);
    
    ItemStack addItems(final ItemStack p0);
    
    ItemStack extractItems(final ItemStack p0);
    
    List getAvailableItems(final List p0);
    
    ItemStack calculateItemAddition(final ItemStack p0);
    
    long getAvailableSpaceByItem(final ItemStack p0, final long p1);
}
