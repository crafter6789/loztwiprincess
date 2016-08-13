package com.crafter6789.loztwiprincess.blocks;

import java.util.List;

import com.crafter6789.loztwiprincess.creativeTabs.MCreativeTabs;
import com.crafter6789.loztwiprincess.lib.RefStrings;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.BlockPlanks.EnumType;
import net.minecraft.item.ItemStack;
//import net.minecraft.util.IIcon;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class MLeaves extends BlockLeaves {
	public MLeaves(String name){

		//this.setBlockName(name);
		this.setCreativeTab(MCreativeTabs.tabBlock);
		//this.setBlockTextureName(RefStrings.MODID + ":" + name);
		}
	/*@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int p_149691_1_, int p_149691_2_) {
		return null;
	}
	@Override
	public String[] func_150125_e() {
		return null;
	}*/
	@Override
	public List<ItemStack> onSheared(ItemStack item, IBlockAccess world, BlockPos pos, int fortune) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public EnumType getWoodType(int meta) {
		// TODO Auto-generated method stub
		return null;
	}
}
