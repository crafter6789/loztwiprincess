package com.crafter6789.loztwiprincess.blocks.ores;

import java.util.Random;

import com.crafter6789.loztwiprincess.blocks.MBlockBush;
import com.crafter6789.loztwiprincess.blocks.MBlocks;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class RPGrassUsed extends MBlockBush {
	
	static float f = 0.35F;
    protected static final AxisAlignedBB RPGrassUsed_AABB = new AxisAlignedBB(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, f * 0.8F, 0.5F + f);

	public RPGrassUsed(String name, Material material){
		super(name, material, material.getMaterialMapColor(), -1.0F, RPGrassUsed_AABB);
		this.setTickRandomly(true);
	}
	
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos)
    {
        return RPGrassUsed_AABB;
    }
	
	public void updateTick(World world, BlockPos pos, IBlockState state, Random random){
		int chance = world.rand.nextInt(8);
		if (chance == 0) {
			world.setBlockState(pos, MBlocks.RPGrass.getDefaultState());
		}
	}
	
	
}