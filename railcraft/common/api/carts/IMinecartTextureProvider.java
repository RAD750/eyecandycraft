/*
 * This code is the property of CovertJaguar
 * and may only be used with explicit written
 * permission unless otherwise specified on the
 * license page at railcraft.wikispaces.com.
 */
package railcraft.common.api.carts;

/**
 * Used to render a cart with a custom texture using Railcraft's cart renderer.
 * You could always write your own renderer of course.
 *
 * @author CovertJaguar <railcraft.wikispaces.com>
 */
public interface IMinecartTextureProvider {

    /**
     * The texture to give the cart. If you return null, the default is used.
     *
     * @return the texture file
     */
    public String getTextureFile();
}
