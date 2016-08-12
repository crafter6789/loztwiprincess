package com.crafter6789.loztwiprincess.blocks.ores;

import java.util.ArrayList;
import java.util.List;

import com.crafter6789.loztwiprincess.blocks.MBlocksClass;
import com.crafter6789.loztwiprincess.item.MItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.world.World;

public class RPGrass extends BlockBush {

    public RPGrass(String unlocalizedName, Material material) {
        super(material);
        float f = 0.4F;
        this.setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, f * 2.0F, 0.5F + f);
        this.blockSoundType = SoundType.PLANT;
    }
    
    public void onBlockDestroyedByPlayer(World world, int x, int y, int z, int m) {
    	if (world.getClosestPlayer(x, y, z, 10, false).inventory.getCurrentItem() == null){
    		world.blocksetBlock(x, y, z, MBlocksClass.RPGrass);
    	}else if (world.getClosestPlayer(x, y, z, 10, false).inventory.getCurrentItem().getItem() instanceof ItemSword){
    		world.setBlock(x, y, z, MBlocksClass.RPGrassUsed);
    	}else{
    		world.setBlock(x, y, z, MBlocksClass.RPGrass);
    	}
    }
    
    public List<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune) {
        List<ItemStack> drops = new ArrayList<ItemStack>();
        
        if (world.getClosestPlayer(x, y, z, 10, false).inventory.getCurrentItem() == null){
        	return drops;
        }else if (world.getClosestPlayer(x, y, z, 10, false).inventory.getCurrentItem().getItem() instanceof ItemSword){
        	if (world.rand.nextFloat() < 0.5F){
        		drops.add(new ItemStack(MItems.Rupee, world.rand.nextInt(1) + 1, 0));
        	}else{
        		if (world.rand.nextFloat() < 0.7F){
        			drops.add(new ItemStack(MItems.Rupee, 1, 1));
        		}else{
        			drops.add(new ItemStack(MItems.Rupee, 1, 2));
        		}
        	}
        	if (world.getClosestPlayer(x, y, z, 10, false).inventory.hasItem(Item.getItemFromBlock(Blocks.TNT))) {
        		drops.add(new ItemStack(Item.getItemFromBlock(Blocks.TNT), world.rand.nextInt(1)));
        	}
        	return drops;//TODO add specialized drops for unlockable items
        }else{
        	return drops;
        }
        
    }
}
