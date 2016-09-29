package com.crafter6789.loztwiprincess.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class MBlock extends Block{

	public MBlock(String name, Material material, SoundType sound, float hard, float resist, String tool, int HLVL) {
		super(material);
		this.blockSoundType = sound;
		this.setHardness(hard);
		this.setResistance(resist);
		this.setHarvestLevel(tool, HLVL);
		this.setRegistryName(name.toLowerCase());
		this.setUnlocalizedName(name);
		MBlocks.BLOCKS.put(name, this);
	}
		
	public MBlock(String name, Material material, SoundType sound, float hard, float resist, float slip, float partGrav, String tool, int HLVL) {
        this(name, material, sound, hard, resist, tool, HLVL);
        this.blockParticleGravity = partGrav;
        this.slipperiness = slip;
	}

}
