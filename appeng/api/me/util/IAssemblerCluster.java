// 
// Decompiled by Procyon v0.5.36
// 

package appeng.api.me.util;

import net.minecraft.tileentity.TileEntity;

public interface IAssemblerCluster
{
    void cycleCpus();
    
    void addCraft();
    
    boolean canCraft();
    
    TileEntity getAssembler(final int p0);
}
