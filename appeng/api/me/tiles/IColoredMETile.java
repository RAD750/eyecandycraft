// 
// Decompiled by Procyon v0.5.36
// 

package appeng.api.me.tiles;

public interface IColoredMETile
{
    public static final String[] Colors = { "Blue", "Black", "White", "Brown", "Red", "Yellow", "Green" };
    public static final int[] cableColorTexturesDark = { 127, 143, 159, 175, 191, 207, 223 };
    public static final int[] cableColorTexturesLit = { 20, 31, 47, 63, 79, 95, 111 };
    
    boolean isColored();
    
    void setColor(final int p0);
    
    int getColor();
}
