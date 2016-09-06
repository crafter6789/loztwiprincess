package com.crafter6789.loztwiprincess.blocks.ores;

import java.util.ArrayList;
import java.util.List;

import com.crafter6789.loztwiprincess.blocks.MBlockBush;
import com.crafter6789.loztwiprincess.blocks.MBlocksClass;
import com.crafter6789.loztwiprincess.item.MItems;
import com.crafter6789.loztwiprincess.lib.RefStrings;

import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class RPGrass extends MBlockBush {
	
    static float f = 0.4F;
    protected static final AxisAlignedBB RPGrass_AABB = new AxisAlignedBB(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, f * 2.0F, 0.5F + f);

    public RPGrass(String name, Material material) {
        super(name, material, material.getMaterialMapColor(), 0, RPGrass_AABB);
        //this.setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, f * 2.0F, 0.5F + f);

    }
    
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos)
    {
        return RPGrass_AABB;
    }
    
    public void onBlockDestroyedByPlayer(World world,/*, int x, int y, int z*/BlockPos position, int m) {
    	if (world.getClosestPlayer(position.getX(), position.getY(), position.getZ(), 10, false).inventory.getCurrentItem() == null){
    		world.setBlockState(position, MBlocksClass.RPGrass.getDefaultState());
    	}else if (world.getClosestPlayer(position.getX(), position.getY(), position.getZ(), 10, false).inventory.getCurrentItem().getItem() instanceof ItemSword){
    		world.setBlockState(position, MBlocksClass.RPGrassUsed.getDefaultState());
    	}else{
    		world.setBlockState(position, MBlocksClass.RPGrass.getDefaultState());
    	}
    }
    
    public List<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune) {
        List<ItemStack> drops = new ArrayList<ItemStack>();
        
        if (world.getClosestPlayer(x, y, z, 10, false).inventory.getCurrentItem() == null){
        	return drops;
        }else if (world.getClosestPlayer(x, y, z, 10, false).inventory.getCurrentItem().getItem() instanceof ItemSword){
        	if (world.rand.nextFloat() < 0.5F){
        		drops.add(new ItemStack(MItems.ITEMS.get("Rupee"), world.rand.nextInt(1) + 1, 0));
        	}else{
        		if (world.rand.nextFloat() < 0.7F){
        			drops.add(new ItemStack(MItems.ITEMS.get("Rupee"), 1, 1));
        		}else{
        			drops.add(new ItemStack(MItems.ITEMS.get("Rupee"), 1, 2));
        		}
        	}
        	if (world.getClosestPlayer(x, y, z, 10, false).inventory.hasItemStack(new ItemStack(Item.getItemFromBlock(Blocks.TNT)))) {
        		drops.add(new ItemStack(Item.getItemFromBlock(Blocks.TNT), world.rand.nextInt(1)));
        	}
        	return drops;//TODO add specialized drops for unlockable items
        }else{
        	return drops;
        }
        
    }
}
