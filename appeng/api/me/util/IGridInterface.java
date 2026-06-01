// 
// Decompiled by Procyon v0.5.36
// 

package appeng.api.me.util;

import appeng.api.me.tiles.IPushable;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.entity.player.EntityPlayer;
import java.util.List;
import appeng.api.me.tiles.IGridTileEntity;
import net.minecraft.entity.player.EntityPlayerMP;
import appeng.api.exceptions.AppEngTileMissingException;
import net.minecraft.item.ItemStack;

public interface IGridInterface
{
    ICraftRequest craftingRequest(final ItemStack p0, final boolean p1) throws AppEngTileMissingException;
    
    ICraftRequest craftingRequest(final ItemStack p0) throws AppEngTileMissingException;
    
    void craftGui(final EntityPlayerMP p0, final IGridTileEntity p1, final ItemStack p2) throws AppEngTileMissingException;
    
    void requestUpdate(final IGridTileEntity p0);
    
    List getMachines();
    
    boolean useMEEnergy(final float p0, final String p1);
    
    int usePowerForAddition(final int p0);
    
    IMEInventoryHandler getCellArray();
    
    IMEInventoryHandler getFullCellArray();
    
    void onInventoryChange();
    
    void addViewingPlayer(final EntityPlayer p0);
    
    void rmvViewingPlayer(final EntityPlayer p0);
    
    void addCraftingPlayer(final EntityPlayer p0);
    
    void rmvCraftingPlayer(final EntityPlayer p0);
    
    ItemStack signalInput(final IMEInventory p0, final ItemStack p1);
    
    TileEntity getController();
    
    ICraftRequest waitingRequest(final ItemStack p0);
    
    ICraftRequest pushRequest(final ItemStack p0, final IPushable p1, final boolean p2);
    
    boolean isValid();
    
    void resetWaitingQueue();
    
    void OnCraftingChange();
    
    IMEInventoryHandler getCraftableArray();
    
    int getGridIndex();
    
    IAssemblerPattern getPatternFor(final ItemStack p0);
}
