
package com.crafter6789.loztwiprincess.main;

import com.crafter6789.loztwiprincess.blocks.MBlocksClass;
import com.crafter6789.loztwiprincess.item.MItems;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.world.World;

public class CraftingManager {
	public static void mainRegistry(){
		addCraftingRec();
		addSmeltingRec();
	}
	public static void addCraftingRec(){
		
		//Tools
		GameRegistry.addRecipe(new ItemStack(MItems.HyrlPick, 1), new Object[]{"XXX"," Y "," Y ", 'X', MItems.HyrlIngot, 'Y', Items.STICK});
		GameRegistry.addRecipe(new ItemStack(MItems.HyrlAxe, 1), new Object[]{"XX","YX","Y ", 'X', MItems.HyrlIngot, 'Y', Items.STICK});
		GameRegistry.addRecipe(new ItemStack(MItems.HyrlAxe, 1), new Object[]{"XX","XY"," Y", 'X', MItems.HyrlIngot, 'Y', Items.STICK});
		GameRegistry.addRecipe(new ItemStack(MItems.HyrlSpade, 1), new Object[]{"X","Y","Y", 'X', MItems.HyrlIngot, 'Y', Items.STICK});
		GameRegistry.addRecipe(new ItemStack(MItems.HyrlHoe, 1), new Object[]{"XX","Y ","Y ", 'X', MItems.HyrlIngot, 'Y', Items.STICK});
		GameRegistry.addRecipe(new ItemStack(MItems.HyrlHoe, 1), new Object[]{"XX"," Y"," Y", 'X', MItems.HyrlIngot, 'Y', Items.STICK});
		GameRegistry.addRecipe(new ItemStack(MItems.HyrlSword, 1), new Object[]{"X","Y","Y", 'X', MItems.HyrlIngot, 'Y', Items.STICK});
		
		GameRegistry.addRecipe(new ItemStack(MItems.ShdwPick, 1), new Object[]{"XXX"," Y "," Y ", 'X', MItems.ShdwIngot, 'Y', Items.STICK});
		GameRegistry.addRecipe(new ItemStack(MItems.ShdwAxe, 1), new Object[]{"XX","YX","Y ", 'X', MItems.ShdwIngot, 'Y', Items.STICK});
		GameRegistry.addRecipe(new ItemStack(MItems.ShdwAxe, 1), new Object[]{"XX","XY"," Y", 'X', MItems.ShdwIngot, 'Y', Items.STICK});
		GameRegistry.addRecipe(new ItemStack(MItems.ShdwSpade, 1), new Object[]{"X","Y","Y", 'X', MItems.ShdwIngot, 'Y', Items.STICK});
		GameRegistry.addRecipe(new ItemStack(MItems.ShdwHoe, 1), new Object[]{"XX","Y ","Y ", 'X', MItems.ShdwIngot, 'Y', Items.STICK});
		GameRegistry.addRecipe(new ItemStack(MItems.ShdwHoe, 1), new Object[]{"XX"," Y"," Y", 'X', MItems.ShdwIngot, 'Y', Items.STICK});
		GameRegistry.addRecipe(new ItemStack(MItems.ShdwSword, 1), new Object[]{"X","X","Y", 'X', MItems.ShdwIngot, 'Y', Items.STICK});
		
		//Armor
		
		GameRegistry.addRecipe(new ItemStack(MItems.HyrlNormHelm, 1), new Object[]{"XXX","X X", 'X', MItems.HyrlIngot});
		GameRegistry.addRecipe(new ItemStack(MItems.HyrlNormChest, 1), new Object[]{"X X","XXX","XXX", 'X', MItems.HyrlIngot});
		GameRegistry.addRecipe(new ItemStack(MItems.HyrlNormLegs, 1), new Object[]{"XXX","X X","X X", 'X', MItems.HyrlIngot});
		GameRegistry.addRecipe(new ItemStack(MItems.HyrlNormBoots, 1), new Object[]{"X X","X X", 'X', MItems.HyrlIngot});
		
		GameRegistry.addRecipe(new ItemStack(MItems.ShdwNormHelm, 1), new Object[]{"XXX","X X", 'X', MItems.ShdwIngot});
		GameRegistry.addRecipe(new ItemStack(MItems.ShdwNormChest, 1), new Object[]{"X X","XXX","XXX", 'X', MItems.ShdwIngot});
		GameRegistry.addRecipe(new ItemStack(MItems.ShdwNormLegs, 1), new Object[]{"XXX","X X","X X", 'X', MItems.ShdwIngot});
		GameRegistry.addRecipe(new ItemStack(MItems.ShdwNormBoots, 1), new Object[]{"X X","X X", 'X', MItems.ShdwIngot});
		
		
		//Shaped
		
		GameRegistry.addRecipe(new ItemStack(Blocks.TORCH, 4), new Object[]{"Y","X", 'X', Items.STICK, 'Y', MItems.ChuJellyYellow});

		//Shapeless
		
		
		//1->9 in Square
		GameRegistry.addRecipe(new ItemStack(MBlocksClass.ShdwSteel, 1), new Object[]{"XXX","XXX","XXX", 'X', MItems.ShdwIngot});
		GameRegistry.addRecipe(new ItemStack(MBlocksClass.Ag, 1), new Object[]{"XXX","XXX","XXX", 'X', MItems.AgIngot});
		GameRegistry.addRecipe(new ItemStack(MItems.AgIngot, 1), new Object[]{"XXX","XXX","XXX", 'X', MItems.AgNugget});
		GameRegistry.addRecipe(new ItemStack(MBlocksClass.FeSteel, 1), new Object[]{"XXX","XXX","XXX", 'X', MItems.FeIngot});
		GameRegistry.addRecipe(new ItemStack(MBlocksClass.HyrlSteel, 1), new Object[]{"XXX","XXX","XXX", 'X', MItems.HyrlIngot});

		//9->1 in Square
		GameRegistry.addRecipe(new ItemStack(MItems.ShdwIngot, 9), new Object[]{"X", 'X', MBlocksClass.ShdwSteel});
		GameRegistry.addRecipe(new ItemStack(MItems.AgIngot, 9), new Object[]{"X", 'X', MBlocksClass.Ag});
		GameRegistry.addRecipe(new ItemStack(MItems.AgNugget, 9), new Object[]{"X", 'X', MItems.AgIngot});
		GameRegistry.addRecipe(new ItemStack(MItems.FeIngot, 9), new Object[]{"X", 'X', MBlocksClass.FeSteel});
		GameRegistry.addRecipe(new ItemStack(MItems.HyrlIngot, 9), new Object[]{"X", 'X', MBlocksClass.HyrlSteel});

		
		//Miscellaneous Splitting or Combining
		GameRegistry.addRecipe(new ItemStack(MItems.CoalDust, 2), new Object[]{"X", 'X', Items.COAL});
		GameRegistry.addShapelessRecipe(new ItemStack(MItems.FeIngot, 1), new Object[]{Items.IRON_INGOT, MItems.CoalDust});
		GameRegistry.addShapelessRecipe(new ItemStack(Items.POTIONITEM, 1, 8261), new Object[]{Items.GLASS_BOTTLE, MItems.ChuJellyRed});
		GameRegistry.addShapelessRecipe(new ItemStack(MItems.HyrlIngot, 2), new Object[]{MItems.FeIngot, MItems.AgIngot});
		GameRegistry.addShapelessRecipe(new ItemStack(MItems.ShdwIngot, 2), new Object[]{MItems.FeIngot, MItems.ShdwGem});
		GameRegistry.addShapelessRecipe(new ItemStack(MItems.NewMasterSword, 1), new Object[]{MItems.MasterSword, MItems.MasterIngot});

		
	}
	public static void addSmeltingRec(){
		GameRegistry.addSmelting(MBlocksClass.AgOre, new ItemStack(MItems.AgIngot, 1), 20.0f);
		//GameRegistry.addSmelting(MBlocksClass.MasterOre, new ItemStack(MItems.MasterIngot, 1), 20.0f);
		GameRegistry.addSmelting(Blocks.STONE,  new ItemStack(MItems.RockSteak, 1), 10.0f);
	}
}
