// 
// Decompiled by Procyon v0.5.36
// 

package appeng.api;

import appeng.api.me.util.IMEInventory;
import net.minecraft.tileentity.TileEntity;

public interface IExternalStorageHandler
{
    boolean canHandle(final TileEntity p0);
    
    IMEInventory getInventory(final TileEntity p0);
}
