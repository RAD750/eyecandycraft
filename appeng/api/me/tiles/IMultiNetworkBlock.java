// 
// Decompiled by Procyon v0.5.36
// 

package appeng.api.me.tiles;

import net.minecraftforge.common.ForgeDirection;
import appeng.api.me.util.IGridInterface;

public interface IMultiNetworkBlock
{
    void setGrid(final IGridInterface p0, final ForgeDirection p1);
    
    IGridInterface getGrid(final ForgeDirection p0);
    
    boolean Propogates(final ForgeDirection p0);
}
