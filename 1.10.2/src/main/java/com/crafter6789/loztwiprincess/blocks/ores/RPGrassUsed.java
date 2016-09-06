package com.crafter6789.loztwiprincess.blocks.ores;

import java.util.ArrayList;
import java.util.Random;

import com.crafter6789.loztwiprincess.blocks.MBlocksClass;
import com.crafter6789.loztwiprincess.creativeTabs.MCreativeTabs;
import com.crafter6789.loztwiprincess.item.MItems;
import com.crafter6789.loztwiprincess.lib.RefStrings;

import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;

public class RPGrassUsed extends BlockBush {
	
    protected static final AxisAlignedBB RPGrassUsedBox = new AxisAlignedBB(0.30000001192092896D, 0.0D, 0.30000001192092896D, 0.699999988079071D, 0.6000000238418579D, 0.699999988079071D);

	public RPGrassUsed(String name, Material material){
		super(material);
		float f = 0.35F;
        //this.setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, f * 0.8F, 0.5F + f);
        this.setTickRandomly(true);
        this.setBlockUnbreakable();
        this.blockSoundType = SoundType.PLANT;
        this.setRegistryName(RefStrings.MODID + ":RPGrassUsed");
        this.setUnlocalizedName(this.getRegistryName().toString());
	}
	
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos)
    {
        return RPGrassUsedBox;
    }
	
	public void updateTick(World world, BlockPos pos, IBlockState state, Random random){
		int chance = world.rand.nextInt(7);
		if (chance == 0) {
			world.setBlockState(pos, MBlocksClass.RPGrass.getDefaultState());
		}
	}
	
	
}