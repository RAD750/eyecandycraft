package com.rgbcraft.baumod.main.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import com.rgbcraft.baumod.main.entities.TileEntityTraliccioBraccettoCCTV;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class TraliccioBraccettoCCTVBlock extends BlockContainer {
	public static final String name = "TraliccioBraccettoCCTV";

	public TraliccioBraccettoCCTVBlock(int id, int texture) {
		super(id, Material.iron);
		setHardness(0.5F);
		setResistance(0.5F);
		setStepSound(Block.soundMetalFootstep);
		setCreativeTab(CreativeTabs.tabDecorations);
		setBlockName("TraliccioBraccettoCCTV");
		blockIndexInTexture = 31;
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
		setBlockBounds(0.2F, 0.0F, 0.2F, 0.8F, 1.0F, 0.8F);
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

			world.setBlockAndMetadataWithNotify(x, y, z, Blocks.TraliccioBraccettoCCTV.blockID, facing / 2);
		}
	}

	public int getRenderType() {
		return -1;
	}

	public String getTextureFile() {
		return "/com/rgbcraft/baumod/textures/items.png";
	}

	public boolean isOpaqueCube() {
		return false;
	}

	public boolean renderAsNormalBlock() {
		return false;
	}

	public int idDropped(int par1, int par2) {
		return blockID;
	}

	public int quantityDropped() {
		return 1;
	}

	public TileEntity createNewTileEntity(World world) {
		return null;
	}

	public TileEntity createTileEntity(World world, int meta) {
		return new TileEntityTraliccioBraccettoCCTV();
	}
}
