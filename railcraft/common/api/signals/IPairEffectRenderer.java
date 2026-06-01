/*
 * This code is the property of CovertJaguar
 * and may only be used with explicit written
 * permission unless otherwise specified on the
 * license page at railcraft.wikispaces.com.
 */
package railcraft.common.api.signals;

import net.minecraft.tileentity.TileEntity;

/**
 *
 * @author CovertJaguar <railcraft.wikispaces.com>
 */
public interface IPairEffectRenderer {

    public boolean isTuningAuraActive();

    public void tuningEffect(TileEntity start, TileEntity dest);
}
