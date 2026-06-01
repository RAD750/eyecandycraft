// 
// Decompiled by Procyon v0.5.36
// 

package appeng.api.events;

import net.minecraft.world.World;
import appeng.api.WorldCoord;
import net.minecraftforge.event.world.WorldEvent;

public class GridTileUnloadEvent extends WorldEvent
{
    public WorldCoord coord;
    
    public GridTileUnloadEvent(final World world, final WorldCoord wc) {
        super(world);
        this.coord = wc;
    }
}
