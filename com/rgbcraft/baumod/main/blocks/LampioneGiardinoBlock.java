package com.rgbcraft.baumod.main.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import com.rgbcraft.baumod.main.entities.TileEntityLampioneGiardino;
import com.rgbcraft.baumod.main.handlers.CreativeHandler;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class LampioneGiardinoBlock extends BlockContainer {
	public static final String name = "LampioneGiardino";

	public LampioneGiardinoBlock(int id, int texture) {
		super(id, Material.iron);
		setHardness(0.2F);
		setResistance(0.2F);
		setStepSound(Block.soundMetalFootstep);
		setCreativeTab(CreativeHandler.ECCDecorations);
		setBlockName("LampioneGiardino");
		blockIndexInTexture = 18;
		setLightValue(1.0F);
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
		
		setBlockBounds(0.4F, 0.1F, 0.4F, 0.6F, 1.0F, 0.6F);
		
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
		return new TileEntityLampioneGiardino();
	}
}
