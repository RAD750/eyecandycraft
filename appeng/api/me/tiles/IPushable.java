// 
// Decompiled by Procyon v0.5.36
// 

package appeng.api.me.tiles;

import net.minecraft.item.ItemStack;

public interface IPushable
{
    ItemStack pushItem(final ItemStack p0);
    
    boolean canPushItem(final ItemStack p0);
}
