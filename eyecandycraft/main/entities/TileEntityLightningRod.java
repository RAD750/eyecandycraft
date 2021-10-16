package eyecandycraft.main.entities;

import eyecandycraft.main.Main;
import eyecandycraft.main.handlers.LightningHandler;
import net.minecraft.tileentity.TileEntity;

public class TileEntityLightningRod extends RenderFarTileEntity {
	public TileEntityLightningRod() {
		LightningHandler.getInstance().registerLightningRod(this);
	}
	
	@Override
	public void onChunkUnload() {
		super.onChunkUnload();
        onRemove();
    }
	
    @Override
    public void invalidate() {
        super.invalidate();
        onRemove();
    }
    
    public void onRemove() {
		LightningHandler.getInstance().unregisterLightningRod(this);
    }
}
