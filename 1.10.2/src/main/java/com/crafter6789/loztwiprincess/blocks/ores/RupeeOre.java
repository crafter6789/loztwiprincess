package com.crafter6789.loztwiprincess.blocks.ores;

import java.util.ArrayList;
import java.util.List;

import com.crafter6789.loztwiprincess.item.MItems;
import com.crafter6789.loztwiprincess.lib.RefStrings;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class RupeeOre extends Block {

    public RupeeOre(String unlocalizedName, Material material) {
        super(material);

		this.blockSoundType = SoundType.STONE;
		this.setHardness(5.0f);
		this.setResistance(4.0f);
		this.setHarvestLevel("pickaxe", 2);
		this.setRegistryName(RefStrings.MODID + ":oreRupee");
		this.setUnlocalizedName(this.getRegistryName().toString());
    }
    public List<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune) {
        List<ItemStack> drops = new ArrayList<ItemStack>();
        drops.add(new ItemStack(MItems.ITEMS.get("Rupee"), world.rand.nextInt(4) + 3, 0));
        drops.add(new ItemStack(MItems.ITEMS.get("Rupee"), world.rand.nextInt(4) + 2, 1));
        drops.add(new ItemStack(MItems.ITEMS.get("Rupee"), world.rand.nextInt(3) + 1, 2));

        if (world.rand.nextFloat() < 0.02F)
        	{
            drops.add(new ItemStack(MItems.ITEMS.get("Rupee"), world.rand.nextInt(2), 3));
            }
        if (world.rand.nextFloat() < 0.02F)
            {
        	drops.add(new ItemStack(MItems.ITEMS.get("Rupee"), world.rand.nextInt(3), 4));
            }
        	
        return drops;
    }
}
