// 
// Decompiled by Procyon v0.5.36
// 

package appeng.api;

import net.minecraft.world.World;
import appeng.api.exceptions.AppEngTileMissingException;
import net.minecraftforge.common.DimensionManager;
import net.minecraft.tileentity.TileEntity;

public class TileRef extends WorldCoord
{
    int dimension;
    
    public TileRef(final TileEntity gte) {
        super(gte.xCoord, gte.yCoord, gte.zCoord);
        final TileEntity te = gte;
        this.dimension = te.worldObj.provider.dimensionId;
    }
    
    public Object getTile() throws AppEngTileMissingException {
        final World w = (World)DimensionManager.getWorld(this.dimension);
        final TileEntity te = w.getBlockTileEntity(super.x, super.y, super.z);
        if (te instanceof TileEntity) {
            return te;
        }
        throw new AppEngTileMissingException(w, super.x, super.y, super.z);
    }
}
