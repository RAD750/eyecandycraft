/*
 * This code is the property of CovertJaguar
 * and may only be used with explicit written
 * permission unless otherwise specified on the
 * license page at railcraft.wikispaces.com.
 */
package railcraft.common.api.carts;

/**
 * Used by the renderer to renders blocks in carts. This interface uses a
 * slightly different method of rendering than ICartRenderInterface.
 *
 * @author CovertJaguar <railcraft.wikispaces.com>
 */
public interface ICartTextureInterface extends ICartRenderInterface{

    public int getBlockTextureOnSide(int side);
}
