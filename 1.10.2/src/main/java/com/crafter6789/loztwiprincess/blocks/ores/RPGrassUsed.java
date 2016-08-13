package com.crafter6789.loztwiprincess.blocks.ores;

import java.util.ArrayList;
import java.util.Random;

import com.crafter6789.loztwiprincess.blocks.MBlocksClass;
import com.crafter6789.loztwiprincess.creativeTabs.MCreativeTabs;
import com.crafter6789.loztwiprincess.item.MItems;

import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;

public class RPGrassUsed extends BlockBush {
	
	public RPGrassUsed(String name, Material material){
		super(material);
		float f = 0.35F;
        this
        .setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, f * 0.8F, 0.5F + f);
        this.setTickRandomly(true);
        this.setBlockUnbreakable();
        this.blockSoundType = SoundType.PLANT;
	}
	
	public void updateTick(World world, int x, int y, int z, Random random){
		int chance = world.rand.nextInt(7);
		if (chance == 0) {
			world.setBlock(BlockPos, MBlocksClass.RPGrass);
		}
	}
	
	
}