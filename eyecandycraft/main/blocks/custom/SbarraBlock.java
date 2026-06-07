package eyecandycraft.main.blocks.custom;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import eyecandycraft.main.CreativeTab;
import eyecandycraft.main.blocks.Blocks;
import eyecandycraft.main.entities.TileEntitySbarra;
import eyecandycraft.main.handlers.Sounds;
import eyecandycraft.main.solid.models.ModelSbarra;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class SbarraBlock extends BlockContainer {
	public static final String name = "Sbarra";
	boolean powered;

	public SbarraBlock(int id, int texture, boolean powered) {
		super(id, Material.iron);
		setHardness(0.5F);
		setResistance(0.5F);
		setStepSound(Block.soundMetalFootstep);
		setCreativeTab(CreativeTab.tabEyecandyMobilio);
		setBlockName("Sbarra");
		blockIndexInTexture = 92;
	}

	public AxisAlignedBB getCollisionBoundingBoxFromPool(World world, int x, int y, int z)
	{
		return null;
	}

	@SideOnly(Side.CLIENT)
	public AxisAlignedBB getSelectedBoundingBoxFromPool(World world, int x, int y, int z) {
		this.setBlockBoundsBasedOnState(world, x, y, z);
		return super.getSelectedBoundingBoxFromPool(world, x, y, z);
	}

	public void setBlockBoundsBasedOnState(IBlockAccess blockAccess, int x, int y, int z) {
		setBlockBounds(0.1F, 0.0F, 0.1F, 0.9F, 0.8F, 0.9F);
		// setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.27F);
	}

	public void onBlockPlacedBy(World world, int x, int y, int z, EntityLiving entity) {
		if ((entity instanceof EntityPlayer)) {
			int yaw = (int) entity.rotationYaw;

			if (yaw < 0)
				yaw += 360;
			yaw += 22;
			yaw %= 360;
			int facing = yaw / 45;

			world.setBlockAndMetadataWithNotify(x, y, z, Blocks.Sbarra.blockID, facing / 2);
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

	public int idDropped(int par1, int x) {
		return blockID;
	}

	public int quantityDropped() {
		return 1;
	}

	public TileEntity createNewTileEntity(World world) {
		return null;
	}

	public TileEntity createTileEntity(World world, int meta) {
		return new TileEntitySbarra();
	}


	public void onBlockAdded(World world, int x, int y, int z)
	{
		if (!world.isRemote) {
			if (this.powered && !world.isBlockIndirectlyGettingPowered(x, y, z)) {
				world.scheduleBlockUpdate(x, y, z, this.blockID, 4);
			}
			else if (!this.powered && world.isBlockIndirectlyGettingPowered(x, y, z)) {
				world.setBlockAndMetadataWithNotify(x, y, z, Blocks.SbarraAlzata.blockID, world.getBlockMetadata(x, y, z));
				switch(world.getBlockMetadata(x, y, z)) {
				case 0:
					world.setBlockWithNotify(x+1, y, z, 0);
					world.setBlockWithNotify(x+2, y, z, 0);
					break;
				case 1:
					world.setBlockWithNotify(x, y, z+1, 0);
					world.setBlockWithNotify(x, y, z+2, 0);
					break;
				case 2:
					world.setBlockWithNotify(x-1, y, z, 0);
					world.setBlockWithNotify(x-2, y, z, 0);
					break;
				case 3:
					world.setBlockWithNotify(x, y, z-1, 0);
					world.setBlockWithNotify(x, y, z-2, 0);
					break;
				}
			}
		}
	}

	public void onNeighborBlockChange(World world, int x, int y, int z, int par5)
	{
		if (!world.isRemote)
		{
			if (this.powered && !world.isBlockIndirectlyGettingPowered(x, y, z))
			{
				world.scheduleBlockUpdate(x, y, z, this.blockID, 4);
			}
			else if (!this.powered && world.isBlockIndirectlyGettingPowered(x, y, z))
			{
				world.setBlockAndMetadataWithNotify(x, y, z, Blocks.SbarraAlzata.blockID, world.getBlockMetadata(x, y, z));
				switch(world.getBlockMetadata(x, y, z)) {
				case 0:
					world.setBlockWithNotify(x+1, y, z, 0);
					world.setBlockWithNotify(x+2, y, z, 0);
					break;
				case 1:
					world.setBlockWithNotify(x, y, z+1, 0);
					world.setBlockWithNotify(x, y, z+2, 0);
					break;
				case 2:
					world.setBlockWithNotify(x-1, y, z, 0);
					world.setBlockWithNotify(x-2, y, z, 0);
					break;
				case 3:
					world.setBlockWithNotify(x, y, z-1, 0);
					world.setBlockWithNotify(x, y, z-2, 0);
					break;
				}
			}
		}
	}

	public void updateTick(World world, int x, int y, int z, Random par5Random)
	{
		if (!world.isRemote && this.powered && !world.isBlockIndirectlyGettingPowered(x, y, z)) {
			world.setBlockAndMetadataWithNotify(x, y, z, Blocks.SbarraAlzata.blockID, world.getBlockMetadata(x, y, z));
			switch(world.getBlockMetadata(x, y, z)) { //imposta i blocchi dal lato sbarra in base al metadata
			case 0:
				world.setBlockWithNotify(x+1, y, z, 0);
				world.setBlockWithNotify(x+2, y, z, 0);
				break;
			case 1:
				world.setBlockWithNotify(x, y, z+1, 0);
				world.setBlockWithNotify(x, y, z+2, 0);
				break;
			case 2:
				world.setBlockWithNotify(x-1, y, z, 0);
				world.setBlockWithNotify(x-2, y, z, 0);
				break;
			case 3:
				world.setBlockWithNotify(x, y, z-1, 0);
				world.setBlockWithNotify(x, y, z-2, 0);
				break;
			}
		}
	}

	public void onBlockDestroyedByPlayer(World world, int x, int y, int z, int metadata)
	{
		switch(world.getBlockMetadata(x, y, z)) { //imposta i blocchi dal lato sbarra in base al metadata
		case 0:
			world.setBlockWithNotify(x+1, y, z, 0);
			world.setBlockWithNotify(x+2, y, z, 0);
			break;
		case 1:
			world.setBlockWithNotify(x, y, z+1, 0);
			world.setBlockWithNotify(x, y, z+2, 0);
			break;
		case 2:
			world.setBlockWithNotify(x-1, y, z, 0);
			world.setBlockWithNotify(x-2, y, z, 0);
			break;
		case 3:
			world.setBlockWithNotify(x, y, z-1, 0);
			world.setBlockWithNotify(x, y, z-2, 0);
			break;
		}
	}

	@Override
	public int onBlockPlaced(World world, int x, int y, int z, int par5, float par6, float par7, float par8, int par9)
	{
		switch(world.getBlockMetadata(x, y, z)) { //imposta i blocchi dal lato sbarra in base al metadata
		case 0:
			world.setBlockWithNotify(x+1, y, z, 0);
			world.setBlockWithNotify(x+2, y, z, 0);
			break;
		case 1:
			world.setBlockWithNotify(x, y, z+1, 0);
			world.setBlockWithNotify(x, y, z+2, 0);
			break;
		case 2:
			world.setBlockWithNotify(x-1, y, z, 0);
			world.setBlockWithNotify(x-2, y, z, 0);
			break;
		case 3:
			world.setBlockWithNotify(x, y, z-1, 0);
			world.setBlockWithNotify(x, y, z-2, 0);
			break;
		}
		return par9;
	}
}
