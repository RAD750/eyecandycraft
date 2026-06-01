package railcraft.common.api.crafting;

import java.util.List;
import net.minecraft.item.ItemStack;

/**
 *
 * @author CovertJaguar <railcraft.wikispaces.com>
 */
public interface IBlastFurnaceCraftingManager {

    void addRecipe(int inputId, int inputDamage, int cookTime, ItemStack output);

    void addRecipe(int inputId, int cookTime, ItemStack output);

    /**
     * Adds a new Blast Furnace Recipe.
     *
     * @param input the input, if null the function will silently abort
     * @param strictMatching if true, it will compare item damage, if false,
     * just the item ID
     * @param cookTime the time it takes to cook the recipe
     * @param output the output
     */
    void addRecipe(ItemStack input, boolean strictMatching, int cookTime, ItemStack output);

    List<ItemStack> getFuels();

    IBlastFurnaceRecipe getRecipe(int inputId, int inputDamage);

    IBlastFurnaceRecipe getRecipe(ItemStack stack);

    List<IBlastFurnaceRecipe> getRecipes();
}
