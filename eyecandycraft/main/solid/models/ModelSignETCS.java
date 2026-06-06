package eyecandycraft.main.solid.models;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;

@SideOnly(Side.CLIENT)
public class ModelSignETCS extends ModelBase
{
    /** The board on a sign that has the writing on it. */
    public ModelRenderer signBoard = new ModelRenderer(this, 0, 0);

    /** The stick a sign stands on. */
    public ModelRenderer signStick;

    public ModelSignETCS()
    {
        this.signBoard.addBox(-6.0F, -15.0F, -1.0F, 12, 13, 2, 0.0F);
        this.signStick = new ModelRenderer(this, 0, 14);
        this.signStick.addBox(-1.0F, -2.0F, -1.0F, 2, 14, 2, 0.0F);
    }

    /**
     * Renders the sign model through TileEntitySignRenderer
     */
    public void renderSign()
    {
        this.signBoard.render(0.0625F);
        this.signStick.render(0.0625F);
    }
}
