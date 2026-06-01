// 
// Decompiled by Procyon v0.5.36
// 

package appeng.api.me.tiles;

import appeng.api.me.util.IAssemblerCluster;
import appeng.api.WorldCoord;

public interface IAssemblerMB
{
    WorldCoord getLocation();
    
    IAssemblerCluster getCluster();
    
    void updateStatus(final IAssemblerCluster p0);
    
    boolean isComplete();
}
