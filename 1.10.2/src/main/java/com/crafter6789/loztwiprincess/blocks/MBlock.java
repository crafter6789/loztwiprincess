package com.crafter6789.loztwiprincess.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

public class MBlock extends Block{

	public MBlock(String name, Material material, SoundType sound, float hard, float resist, String tool, int HLVL) {
		super(material);
		this.blockSoundType = sound;
		this.setHardness(hard);
		this.setResistance(resist);
		this.setHarvestLevel(tool, HLVL);
		this.setRegistryName(name);
		this.setUnlocalizedName(name);
	}

}
