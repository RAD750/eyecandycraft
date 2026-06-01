// 
// Decompiled by Procyon v0.5.36
// 

package appeng.api.me.tiles;

import java.util.List;

public interface IConfigureableTile
{
    String nextConfiguration(final String p0);
    
    List getConfigurations();
    
    List getConfiguationOptions(final String p0);
    
    String setConfiguration(final String p0, final String p1);
    
    String getConfiguration(final String p0);
}
