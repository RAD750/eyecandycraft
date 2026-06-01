package railcraft.common.api.tracks;

import net.minecraft.entity.item.EntityMinecart;

/**
 * Any rail tile entity that can completely halt
 * all cart movement should implement this interface.
 * (Used in collision handling)
 *
 * @author CovertJaguar <railcraft.wikispaces.com>
 */
public interface ITrackLockdown extends ITrackInstance
{

    public boolean isCartLockedDown(EntityMinecart cart);

    public void releaseCart();
}
