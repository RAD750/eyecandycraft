/*
 * This code is the property of CovertJaguar
 * and may only be used with explicit written
 * permission unless otherwise specified on the
 * license page at railcraft.wikispaces.com.
 */
package railcraft.common.api.signals;

/**
 *
 * @author CovertJaguar <railcraft.wikispaces.com>
 */
public interface ISignalPacketBuilder {
    public void sendPairPacketUpdate(AbstractPair pairing);
    public void sendPairPacketRequest(AbstractPair pairing);
}
