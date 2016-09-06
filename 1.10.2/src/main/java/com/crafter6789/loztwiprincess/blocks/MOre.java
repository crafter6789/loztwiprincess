package com.crafter6789.loztwiprincess.blocks;

import java.util.Random;

import com.crafter6789.loztwiprincess.item.MItems;
import com.crafter6789.loztwiprincess.world.ModOre;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class MOre extends MBlock {

	private Item drop;
	private int meta;
	private int least_quantity;
	private int most_quantity;
	




	public MOre(String unlocalizedName, Material material, Item drop, float hard, float resist, int HLVL) {
        this(unlocalizedName, material, drop, 1, 1, hard, resist, HLVL);
    }

	public MOre(String unlocalizedName, Material material, Item drop, int least_quantity, int most_quantity, float hard, float resist, int HLVL) {
        this(unlocalizedName, material, drop, 0, least_quantity, most_quantity, hard, resist, HLVL);
    }
	public MOre(String unlocalizedName, Material material, Item drop, int meta, int least_quantity, int most_quantity, float hard, float resist, int HLVL) {
		super(unlocalizedName, material, SoundType.STONE, hard, resist, unlocalizedName, HLVL);
		
		//this.setStepSound(soundTypeStone);
	    //this.setHardness(10.0f);
	    //this.setResistance(20.0f);
		
		this.drop = drop;
	    this.meta = meta;
	    this.least_quantity = least_quantity;
	    this.most_quantity = most_quantity;
		
	}
	@Override
	public Item getItemDropped(IBlockState meta, Random random, int fortune) {
	    return this.drop;
	}

	@Override
	public int damageDropped(IBlockState metadata) {
	    return this.meta;
	}

	@Override
	public int quantityDropped(Random random) {
	    if (this.least_quantity >= this.most_quantity)
	        return this.least_quantity;
	    return this.least_quantity + random.nextInt(this.most_quantity - this.least_quantity + 1);
	}

}
