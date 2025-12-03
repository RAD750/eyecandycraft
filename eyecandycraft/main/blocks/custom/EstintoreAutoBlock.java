package eyecandycraft.main.blocks.custom;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import eyecandycraft.main.CreativeTab;
import eyecandycraft.main.blocks.Blocks;
import eyecandycraft.main.entities.TileEntityEstintoreAuto;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.Explosion;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeDirection;

public class EstintoreAutoBlock extends BlockContainer {
	public static final String name = "EstintoreAuto";

	public EstintoreAutoBlock(int id, int texture) {
		super(id, Material.iron);
		setHardness(0.5F);
		setResistance(0.5F);
		setStepSound(Block.soundMetalFootstep);
		setCreativeTab(CreativeTab.tabEyecandyMobilio);
		setBlockName("EstintoreAuto");
		blockIndexInTexture = 87;
	}

	public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World, int par2, int par3, int par4) {
		this.setBlockBoundsBasedOnState(par1World, par2, par3, par4);
		return super.getCollisionBoundingBoxFromPool(par1World, par2, par3, par4);
	}

	@SideOnly(Side.CLIENT)
	public AxisAlignedBB getSelectedBoundingBoxFromPool(World par1World, int par2, int par3, int par4) {
		this.setBlockBoundsBasedOnState(par1World, par2, par3, par4);
		return super.getSelectedBoundingBoxFromPool(par1World, par2, par3, par4);
	}

	public void setBlockBoundsBasedOnState(IBlockAccess blockAccess, int x, int y, int z) {
	      setBlockBounds(0.2F, 0.2F, 0.2F, 0.8F, 0.8F, 0.8F);
	}

	public void onBlockPlacedBy(World world, int x, int y, int z, EntityLiving entity) {
		if ((entity instanceof EntityPlayer)) {
			int yaw = (int) entity.rotationYaw;

			if (yaw < 0)
				yaw += 360;
			yaw += 22;
			yaw %= 360;
			int facing = yaw / 45;
			
			world.setBlockAndMetadataWithNotify(x, y, z, Blocks.EstintoreAuto.blockID, facing / 2);
		}
	}

	public int getRenderType() {
		return -1;
	}

	public String getTextureFile() {
		return "/eyecandycraft/textures/items.png";
	}

	public boolean isOpaqueCube() {
		return false;
	}

	public boolean renderAsNormalBlock() {
		return false;
	}

	public int idDropped(int par1, int par2) {
		return 0;
	}

	public int quantityDropped() {
		return 0;
	}

	public TileEntity createNewTileEntity(World world) {
		return null;
	}

	public TileEntity createTileEntity(World world, int meta) {
		return new TileEntityEstintoreAuto();
	}
    
	@Override
    public boolean isFlammable(IBlockAccess world, int x, int y, int z, int metadata, ForgeDirection face)
    {
        return true;
    }
	
	@Override
	public int getFlammability(IBlockAccess world, int x, int y, int z, int metadata, ForgeDirection face) {
		return 300;
	}
	
	@Override
    public int getFireSpreadSpeed(World world, int x, int y, int z, int metadata, ForgeDirection face)
    {
		final int EXTINGUISHER_RANGE = 5;
		EntityPlayer player = world.getClosestPlayer(x, y, z, -1);
		world.playSoundEffect(x, y, z, "random.fizz", 1.0F, 0.2F);
		
		for (int ix = x-EXTINGUISHER_RANGE; ix < x+EXTINGUISHER_RANGE; ix++) {
			for (int iy = y-EXTINGUISHER_RANGE*2; iy < y; iy++) { //il range va dalla y dell'estintore in giù, quindi sono 10m
				for (int iz  = z-EXTINGUISHER_RANGE; iz < z+EXTINGUISHER_RANGE; iz++) {
					world.extinguishFire(player, ix, iy, iz, 1);
					
					
				}
			}	  
		}
		
		world.setBlockAndMetadataWithNotify(x, y, z, Blocks.EstintoreAutoVuoto.blockID, metadata);
		
        return 1;
    }
	
    //estintore sciopa se lo picchi
	public void onBlockDestroyedByPlayer(World world, int x, int y, int z, int metadata)
	{
		EntityPlayer player = world.getClosestPlayer(x, y, z, 5);
		world.createExplosion(player, x, y, z, 0.5F, blockConstructorCalled);
	}
	
    public boolean canDropFromExplosion(Explosion par1Explosion)
    {
        return false;
    }
	

	
}
