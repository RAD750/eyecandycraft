// 
// Decompiled by Procyon v0.5.36
// 

package appeng.api;

import net.minecraft.item.ItemStack;

public interface IAppEngGrinderRecipe
{
    ItemStack getInput();
    
    void setInput(final ItemStack p0);
    
    ItemStack getOutput();
    
    void setOutput(final ItemStack p0);
    
    int getEnergyCost();
    
    void setEnergyCost(final int p0);
}
