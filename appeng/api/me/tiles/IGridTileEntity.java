// 
// Decompiled by Procyon v0.5.36
// 

package appeng.api.me.tiles;

import appeng.api.me.util.IGridInterface;
import appeng.api.WorldCoord;

public interface IGridTileEntity
{
    WorldCoord getLocation();
    
    boolean isValid();
    
    void setPowerStatus(final boolean p0);
    
    boolean isPowered();
    
    IGridInterface getGrid();
    
    void setGrid(final IGridInterface p0);
}
