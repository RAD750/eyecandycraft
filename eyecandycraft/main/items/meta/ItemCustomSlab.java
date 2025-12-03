package eyecandycraft.main.items.meta;

import net.minecraft.block.BlockHalfSlab;
import net.minecraft.item.ItemSlab;

public class ItemCustomSlab extends ItemSlab {

    private final boolean isFullBlock;

    /** Instance of BlockHalfSlab. */
    private final BlockHalfSlab theHalfSlab;

    /** Instance of BlockHalfSlab. */
    private final BlockHalfSlab theHalfSlab2;
	
	public ItemCustomSlab(int par1, BlockHalfSlab par2BlockHalfSlab, BlockHalfSlab par3BlockHalfSlab, boolean par4) {
		super(par1, par2BlockHalfSlab, par3BlockHalfSlab, par4);
        this.theHalfSlab = par2BlockHalfSlab;
        this.theHalfSlab2 = par3BlockHalfSlab;
        this.isFullBlock = par4;
        this.setMaxDamage(0);
        this.setHasSubtypes(true);
	}

}