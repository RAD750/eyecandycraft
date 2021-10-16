package eyecandycraft.main.entities;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.tileentity.TileEntity;

public class RenderFarTileEntity extends TileEntity {
    @SideOnly(Side.CLIENT)
    @Override
    public double func_82115_m() {
        return 65536.0D;
    }
}
