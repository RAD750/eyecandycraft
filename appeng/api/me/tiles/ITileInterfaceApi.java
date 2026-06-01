// 
// Decompiled by Procyon v0.5.36
// 

package appeng.api.me.tiles;

import appeng.api.InterfaceCraftingRequest;
import appeng.api.me.util.IMEInventory;
import java.util.List;
import net.minecraft.item.ItemStack;

public interface ITileInterfaceApi
{
    int apiCurrentAvailableSpace(final ItemStack p0, final int p1);
    
    ItemStack apiExtractNetworkItem(final ItemStack p0, final boolean p1);
    
    ItemStack apiAddNetworkItem(final ItemStack p0, final boolean p1);
    
    List apiGetNetworkContents();
    
    IMEInventory getApiArray();
    
    List getCraftingOptions();
    
    InterfaceCraftingRequest requestCrafting(final ItemStack p0, final boolean p1);
}
