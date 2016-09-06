package com.crafter6789.loztwiprincess.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class MBlocksStone extends Block{

	public MBlocksStone(Material material, float hard, float resist, String tool, int HLVL) {
		super(material);
		this.blockSoundType = SoundType.STONE;
		this.setHardness(hard);
		this.setResistance(resist);
		this.setHarvestLevel(tool, HLVL);
		//this.setUnlocalizedName(this.getRegistryName().toString());
	}

}
