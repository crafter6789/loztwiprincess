package com.crafter6789.loztwiprincess.blocks;

import com.crafter6789.loztwiprincess.creativeTabs.MCreativeTabs;
import com.crafter6789.loztwiprincess.lib.RefStrings;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLeaves;
import net.minecraft.util.IIcon;

public class MLeaves extends BlockLeaves {
	public MLeaves(String name){

		this.setBlockName(name);
		this.setCreativeTab(MCreativeTabs.tabBlock);
		this.setBlockTextureName(RefStrings.MODID + ":" + name);
		}
	@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int p_149691_1_, int p_149691_2_) {
		return null;
	}
	@Override
	public String[] func_150125_e() {
		return null;
	}
}
