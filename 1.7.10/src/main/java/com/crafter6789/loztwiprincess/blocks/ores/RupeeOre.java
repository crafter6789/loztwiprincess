package com.crafter6789.loztwiprincess.blocks.ores;

import java.util.ArrayList;
import com.crafter6789.loztwiprincess.item.MItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class RupeeOre extends Block {

    public RupeeOre(String unlocalizedName, Material material) {
        super(material);

		this.setStepSound(soundTypeStone);
		this.setHardness(5.0f);
		this.setResistance(4.0f);
		this.setHarvestLevel("pickaxe", 2);
    }
	@Override
    public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune) {
        ArrayList<ItemStack> drops = new ArrayList<ItemStack>();
        drops.add(new ItemStack(MItems.Rupee, world.rand.nextInt(4) + 3, 0));
        drops.add(new ItemStack(MItems.Rupee, world.rand.nextInt(4) + 2, 1));
        drops.add(new ItemStack(MItems.Rupee, world.rand.nextInt(3) + 1, 2));

        if (world.rand.nextFloat() < 0.02F)
        	{
            drops.add(new ItemStack(MItems.Rupee, world.rand.nextInt(2), 3));
            }
        if (world.rand.nextFloat() < 0.02F)
            {
        	drops.add(new ItemStack(MItems.Rupee, world.rand.nextInt(3), 4));
            }
        	
        return drops;
    }
}
