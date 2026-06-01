// 
// Decompiled by Procyon v0.5.36
// 

package appeng.api.me.util;

import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.world.World;
import net.minecraft.item.ItemStack;

public interface IMEInventoryUtil
{
    int getItemCountByType(final ItemStack p0);
    
    ItemStack extractItemsByRecipe(final World p0, final IRecipe p1, final InventoryCrafting p2, final ItemStack p3, final int p4);
}
