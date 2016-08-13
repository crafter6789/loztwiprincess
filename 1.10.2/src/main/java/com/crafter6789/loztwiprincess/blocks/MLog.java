package com.crafter6789.loztwiprincess.blocks;

import com.crafter6789.loztwiprincess.creativeTabs.MCreativeTabs;
import com.crafter6789.loztwiprincess.lib.RefStrings;

import net.minecraft.block.Block;
import net.minecraft.block.BlockLog;

public class MLog extends BlockLog {
	public MLog(String name){
		//this.setBlockName(name);
		this.setCreativeTab(MCreativeTabs.tabBlock);
		//this.setBlockTextureName(RefStrings.MODID + ":" + name);
		}
}
