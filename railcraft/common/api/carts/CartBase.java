package railcraft.common.api.carts;

import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.minecart.MinecartInteractEvent;

/**
 * Generally minecarts should extend this class or there will be oddities if a
 * user links two carts with different max speeds.
 *
 * It also contains some generic code that most carts will find useful.
 *
 * @author CovertJaguar <railcraft.wikispaces.com>
 */
public abstract class CartBase extends EntityMinecart implements IMinecart {

    private float trainSpeed = 1.2f;

    public CartBase(World world) {
        super(world);
        CartTools.setCartOwner(this, "[Railcraft]");
    }

    public World getWorld() {
        return worldObj;
    }

    @Override
    public final float getMaxSpeedRail() {
        return Math.min(getCartMaxSpeed(), trainSpeed);
    }

    @Override
    public float getCartMaxSpeed() {
        return 1.2f;
    }

    @Override
    public final void setTrainSpeed(float speed) {
        this.trainSpeed = speed;
    }

    @Override
    public final boolean interact(EntityPlayer player) {
        if (MinecraftForge.EVENT_BUS.post(new MinecartInteractEvent(this, player))) {
            return true;
        }
        if (CartTools.getCartOwner(this).equals("[Railcraft]")) {
            CartTools.setCartOwner(this, player);
        }
        return doInteract(player);
    }

    public boolean doInteract(EntityPlayer player) {
        return super.interact(player);
    }

    @Override
    public boolean doesCartMatchFilter(ItemStack stack, EntityMinecart cart) {
        if (stack == null || cart == null) {
            return false;
        }
        ItemStack cartItem = cart.getCartItem();
        return cartItem != null && stack.isItemEqual(cartItem);
    }

    @Override
    public void setDead() {
        if (this.field_82345_h) {
            for (int slot = 0; slot < this.getSizeInventory(); ++slot) {
                ItemStack stack = this.getStackInSlot(slot);
                this.setInventorySlotContents(slot, null);

                if (stack != null && !worldObj.isRemote) {
                    float velX = this.rand.nextFloat() * 0.8F + 0.1F;
                    float velY = this.rand.nextFloat() * 0.8F + 0.1F;
                    float velZ = this.rand.nextFloat() * 0.8F + 0.1F;

                    while (stack.stackSize > 0) {
                        int stacksize = this.rand.nextInt(21) + 10;

                        if (stacksize > stack.stackSize) {
                            stacksize = stack.stackSize;
                        }

                        stack.stackSize -= stacksize;
                        EntityItem entityItem = new EntityItem(this.worldObj, this.posX + (double) velX, this.posY + (double) velY, this.posZ + (double) velZ, new ItemStack(stack.itemID, stacksize, stack.getItemDamage()));

                        if (stack.hasTagCompound()) {
                            entityItem.getEntityItem().setTagCompound((NBTTagCompound) stack.getTagCompound().copy());
                        }

                        float modifier = 0.05F;
                        entityItem.motionX = (double) ((float) this.rand.nextGaussian() * modifier);
                        entityItem.motionY = (double) ((float) this.rand.nextGaussian() * modifier + 0.2F);
                        entityItem.motionZ = (double) ((float) this.rand.nextGaussian() * modifier);
                        this.worldObj.spawnEntityInWorld(entityItem);
                    }
                }
            }
        }

        super.setDead();
    }
}
