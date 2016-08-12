package com.crafter6789.loztwiprincess.blocks;

import com.crafter6789.loztwiprincess.creativeTabs.MCreativeTabs;
import com.crafter6789.loztwiprincess.lib.RefStrings;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSapling;
import net.minecraft.block.material.Material;

public class MSapling extends BlockSapling {
	public MSapling(String name) {
		this.setBlockName(name);
		this.setCreativeTab(MCreativeTabs.tabBlock);
		this.setBlockTextureName(RefStrings.MODID + ":" + name);
	}
}
