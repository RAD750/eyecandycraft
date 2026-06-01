// 
// Decompiled by Procyon v0.5.36
// 

package appeng.api.events;

import net.minecraft.world.World;
import appeng.api.me.util.IGridInterface;
import appeng.api.WorldCoord;
import net.minecraftforge.event.world.WorldEvent;

public class GridPatternUpdateEvent extends WorldEvent
{
    public WorldCoord coord;
    public IGridInterface grid;
    
    public GridPatternUpdateEvent(final World world, final WorldCoord wc, final IGridInterface gi) {
        super(world);
        this.grid = gi;
        this.coord = wc;
    }
}
