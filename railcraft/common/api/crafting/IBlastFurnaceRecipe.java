package railcraft.common.api.crafting;

import net.minecraft.item.ItemStack;

/**
 *
 * @author CovertJaguar <railcraft.wikispaces.com>
 */
public interface IBlastFurnaceRecipe
{

    public int getCookTime();

    public ItemStack getInput();

    public ItemStack getOutput();

    int getOutputStackSize();

    boolean isRoomForOutput(ItemStack out);
}
