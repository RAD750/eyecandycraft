// 
// Decompiled by Procyon v0.5.36
// 

package appeng.api.me.util;

import appeng.api.Util;
import net.minecraft.tileentity.TileEntity;
import appeng.api.me.tiles.IGridTileEntity;
import net.minecraft.world.World;

public class Grid
{
    public static IGridInterface getGridInterface(final World w, final int x, final int y, final int z) {
        final IGridTileEntity te = getGridEntity(w, x, y, z);
        if (te != null) {
            return te.getGrid();
        }
        return null;
    }
    
    public static boolean isGridEntity(final World w, final int x, final int y, final int z) {
        return getGridEntity(w, x, y, z) != null;
    }
    
    public static IGridTileEntity getGridEntity(final World w, final int x, final int y, final int z) {
        final TileEntity te = w.getBlockTileEntity(x, y, z);
        if (te instanceof IGridTileEntity) {
            return (IGridTileEntity)te;
        }
        return null;
    }
    
    public static boolean isOnGrid(final World w, final int x, final int y, final int z) {
        final IGridTileEntity te = getGridEntity(w, x, y, z);
        return te != null && te.getGrid() != null;
    }
    
    public static void TriggerGridUpdate(final World w, final int x, final int y, final int z) {
        Util.updateGridAt(w, x, y, z);
    }
}
