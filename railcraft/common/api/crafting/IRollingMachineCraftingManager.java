package railcraft.common.api.crafting;

import java.util.List;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

/**
 *
 * @author CovertJaguar <railcraft.wikispaces.com>
 */
public interface IRollingMachineCraftingManager
{

    void addRecipe(ItemStack output, Object[] components);

    void addShapelessRecipe(ItemStack output, Object[] compenents);

    ItemStack findMatchingRecipe(InventoryCrafting inventorycrafting, World world);

    List<IRecipe> getRecipeList();

}
