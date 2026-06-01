/*
 * This code is the property of CovertJaguar
 * and may only be used with explicit written
 * permission unless otherwise specified on the
 * license page at railcraft.wikispaces.com.
 */
package railcraft.common.api.signals;

import net.minecraft.world.World;

/**
 *
 * @author CovertJaguar <railcraft.wikispaces.com>
 */
public interface IReceiverTile {

    public World getWorld();

    public SignalReceiver getReceiver();

    public void onControllerAspectChange(SignalController con, SignalAspect aspect);
}
