// 
// Decompiled by Procyon v0.5.36
// 

package appeng.api;

import net.minecraft.item.ItemStack;
import java.util.List;

public interface IGrinderRecipeManager
{
    List getRecipes();
    
    void addRecipe(final ItemStack p0, final ItemStack p1, final int p2);
    
    IAppEngGrinderRecipe getRecipeForInput(final ItemStack p0);
}
