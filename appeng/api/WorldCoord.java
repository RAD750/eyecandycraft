// 
// Decompiled by Procyon v0.5.36
// 

package appeng.api;

import net.minecraftforge.common.ForgeDirection;

public class WorldCoord
{
    public int x;
    public int y;
    public int z;
    
    @Override
    public String toString() {
        return "" + this.x + "," + this.y + "," + this.z;
    }
    
    public WorldCoord add(final ForgeDirection direction, final int length) {
        this.x += direction.offsetX * length;
        this.y += direction.offsetY * length;
        this.z += direction.offsetZ * length;
        return this;
    }
    
    public WorldCoord subtract(final ForgeDirection direction, final int length) {
        this.x -= direction.offsetX * length;
        this.y -= direction.offsetY * length;
        this.z -= direction.offsetZ * length;
        return this;
    }
    
    public WorldCoord add(final int _x, final int _y, final int _z) {
        this.x += _x;
        this.y += _y;
        this.z += _z;
        return this;
    }
    
    public WorldCoord subtract(final int _x, final int _y, final int _z) {
        this.x -= _x;
        this.y -= _y;
        this.z -= _z;
        return this;
    }
    
    public WorldCoord multiple(final int _x, final int _y, final int _z) {
        this.x *= _x;
        this.y *= _y;
        this.z *= _z;
        return this;
    }
    
    public WorldCoord divide(final int _x, final int _y, final int _z) {
        this.x /= _x;
        this.y /= _y;
        this.z /= _z;
        return this;
    }
    
    public WorldCoord(final int _x, final int _y, final int _z) {
        this.x = _x;
        this.y = _y;
        this.z = _z;
    }
    
    public ForgeDirection DirectionTo(final WorldCoord loc) {
        final int ox = this.x - loc.x;
        final int oy = this.y - loc.y;
        final int oz = this.z - loc.z;
        final int xlen = Math.abs(ox);
        final int ylen = Math.abs(oy);
        final int zlen = Math.abs(oz);
        if (loc.isEqual(this.copy().add(ForgeDirection.EAST, xlen))) {
            return ForgeDirection.EAST;
        }
        if (loc.isEqual(this.copy().add(ForgeDirection.WEST, xlen))) {
            return ForgeDirection.WEST;
        }
        if (loc.isEqual(this.copy().add(ForgeDirection.NORTH, zlen))) {
            return ForgeDirection.NORTH;
        }
        if (loc.isEqual(this.copy().add(ForgeDirection.SOUTH, zlen))) {
            return ForgeDirection.SOUTH;
        }
        if (loc.isEqual(this.copy().add(ForgeDirection.UP, ylen))) {
            return ForgeDirection.UP;
        }
        if (loc.isEqual(this.copy().add(ForgeDirection.DOWN, ylen))) {
            return ForgeDirection.DOWN;
        }
        return null;
    }
    
    public boolean isEqual(final WorldCoord c) {
        return this.x == c.x && this.y == c.y && this.z == c.z;
    }
    
    public WorldCoord copy() {
        return new WorldCoord(this.x, this.y, this.z);
    }
}
