
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
		GameRegistry.addRecipe(new ItemStack(MItems.ITEMS.get("HyrlPick"), 1), new Object[]{"XXX"," Y "," Y ", 'X', MItems.ITEMS.get("HyrlIngot"), 'Y', Items.STICK});
		GameRegistry.addRecipe(new ItemStack(MItems.ITEMS.get("HyrlAxe"), 1), new Object[]{"XX","YX","Y ", 'X', MItems.ITEMS.get("HyrlIngot"), 'Y', Items.STICK});
		GameRegistry.addRecipe(new ItemStack(MItems.ITEMS.get("HyrlAxe"), 1), new Object[]{"XX","XY"," Y", 'X', MItems.ITEMS.get("HyrlIngot"), 'Y', Items.STICK});
		GameRegistry.addRecipe(new ItemStack(MItems.ITEMS.get("HyrlSpade"), 1), new Object[]{"X","Y","Y", 'X', MItems.ITEMS.get("HyrlIngot"), 'Y', Items.STICK});
		GameRegistry.addRecipe(new ItemStack(MItems.ITEMS.get("HyrlHoe"), 1), new Object[]{"XX","Y ","Y ", 'X', MItems.ITEMS.get("HyrlIngot"), 'Y', Items.STICK});
		GameRegistry.addRecipe(new ItemStack(MItems.ITEMS.get("HyrlHoe"), 1), new Object[]{"XX"," Y"," Y", 'X', MItems.ITEMS.get("HyrlIngot"), 'Y', Items.STICK});
		GameRegistry.addRecipe(new ItemStack(MItems.ITEMS.get("HyrlSword"), 1), new Object[]{"X","Y","Y", 'X', MItems.ITEMS.get("HyrlIngot"), 'Y', Items.STICK});
		
		GameRegistry.addRecipe(new ItemStack(MItems.ITEMS.get("ShdwPick"), 1), new Object[]{"XXX"," Y "," Y ", 'X', MItems.ITEMS.get("ShdwIngot"), 'Y', Items.STICK});
		GameRegistry.addRecipe(new ItemStack(MItems.ITEMS.get("ShdwAxe"), 1), new Object[]{"XX","YX","Y ", 'X', MItems.ITEMS.get("ShdwIngot"), 'Y', Items.STICK});
		GameRegistry.addRecipe(new ItemStack(MItems.ITEMS.get("ShdwAxe"), 1), new Object[]{"XX","XY"," Y", 'X', MItems.ITEMS.get("ShdwIngot"), 'Y', Items.STICK});
		GameRegistry.addRecipe(new ItemStack(MItems.ITEMS.get("ShdwSpade"), 1), new Object[]{"X","Y","Y", 'X', MItems.ITEMS.get("ShdwIngot"), 'Y', Items.STICK});
		GameRegistry.addRecipe(new ItemStack(MItems.ITEMS.get("ShdwHoe"), 1), new Object[]{"XX","Y ","Y ", 'X', MItems.ITEMS.get("ShdwIngot"), 'Y', Items.STICK});
		GameRegistry.addRecipe(new ItemStack(MItems.ITEMS.get("ShdwHoe"), 1), new Object[]{"XX"," Y"," Y", 'X', MItems.ITEMS.get("ShdwIngot"), 'Y', Items.STICK});
		GameRegistry.addRecipe(new ItemStack(MItems.ITEMS.get("ShdwSword"), 1), new Object[]{"X","X","Y", 'X', MItems.ITEMS.get("ShdwIngot"), 'Y', Items.STICK});
		
		//Armor
		
		GameRegistry.addRecipe(new ItemStack(MItems.ITEMS.get("HyrlNormHelm"), 1), new Object[]{"XXX","X X", 'X', MItems.ITEMS.get("HyrlIngot")});
		GameRegistry.addRecipe(new ItemStack(MItems.ITEMS.get("HyrlNormChest"), 1), new Object[]{"X X","XXX","XXX", 'X', MItems.ITEMS.get("HyrlIngot")});
		GameRegistry.addRecipe(new ItemStack(MItems.ITEMS.get("HyrlNormLegs"), 1), new Object[]{"XXX","X X","X X", 'X', MItems.ITEMS.get("HyrlIngot")});
		GameRegistry.addRecipe(new ItemStack(MItems.ITEMS.get("HyrlNormBoots"), 1), new Object[]{"X X","X X", 'X', MItems.ITEMS.get("HyrlIngot")});
		
		GameRegistry.addRecipe(new ItemStack(MItems.ITEMS.get("ShdwNormHelm"), 1), new Object[]{"XXX","X X", 'X', MItems.ITEMS.get("ShdwIngot")});
		GameRegistry.addRecipe(new ItemStack(MItems.ITEMS.get("ShdwNormChest"), 1), new Object[]{"X X","XXX","XXX", 'X', MItems.ITEMS.get("ShdwIngot")});
		GameRegistry.addRecipe(new ItemStack(MItems.ITEMS.get("ShdwNormLegs"), 1), new Object[]{"XXX","X X","X X", 'X', MItems.ITEMS.get("ShdwIngot")});
		GameRegistry.addRecipe(new ItemStack(MItems.ITEMS.get("ShdwNormBoots"), 1), new Object[]{"X X","X X", 'X', MItems.ITEMS.get("ShdwIngot")});
		
		
		//Shaped
		
		GameRegistry.addRecipe(new ItemStack(Blocks.TORCH, 4), new Object[]{"Y","X", 'X', Items.STICK, 'Y', MItems.ITEMS.get("ChuJellyYellow")});

		//Shapeless
		
		
		//1->9 in Square
		GameRegistry.addRecipe(new ItemStack(MBlocksClass.ShdwSteel, 1), new Object[]{"XXX","XXX","XXX", 'X', MItems.ITEMS.get("ShdwIngot")});
		GameRegistry.addRecipe(new ItemStack(MBlocksClass.Ag, 1), new Object[]{"XXX","XXX","XXX", 'X', MItems.ITEMS.get("AgIngot")});
		GameRegistry.addRecipe(new ItemStack(MItems.ITEMS.get("AgIngot"), 1), new Object[]{"XXX","XXX","XXX", 'X', MItems.ITEMS.get("AgNugget")});
		GameRegistry.addRecipe(new ItemStack(MBlocksClass.FeSteel, 1), new Object[]{"XXX","XXX","XXX", 'X', MItems.ITEMS.get("FeIngot")});
		GameRegistry.addRecipe(new ItemStack(MBlocksClass.HyrlSteel, 1), new Object[]{"XXX","XXX","XXX", 'X', MItems.ITEMS.get("HyrlIngot")});

		//9->1 in Square
		GameRegistry.addRecipe(new ItemStack(MItems.ITEMS.get("ShdwIngot"), 9), new Object[]{"X", 'X', MBlocksClass.ShdwSteel});
		GameRegistry.addRecipe(new ItemStack(MItems.ITEMS.get("AgIngot"), 9), new Object[]{"X", 'X', MBlocksClass.Ag});
		GameRegistry.addRecipe(new ItemStack(MItems.ITEMS.get("AgNugget"), 9), new Object[]{"X", 'X', MItems.ITEMS.get("AgIngot")});
		GameRegistry.addRecipe(new ItemStack(MItems.ITEMS.get("FeIngot"), 9), new Object[]{"X", 'X', MBlocksClass.FeSteel});
		GameRegistry.addRecipe(new ItemStack(MItems.ITEMS.get("HyrlIngot"), 9), new Object[]{"X", 'X', MBlocksClass.HyrlSteel});

		
		//Miscellaneous Splitting or Combining
		GameRegistry.addRecipe(new ItemStack(MItems.ITEMS.get("CoalDust"), 2), new Object[]{"X", 'X', Items.COAL});
		GameRegistry.addShapelessRecipe(new ItemStack(MItems.ITEMS.get("FeIngot"), 1), new Object[]{Items.IRON_INGOT, MItems.ITEMS.get("CoalDust")});
		GameRegistry.addShapelessRecipe(new ItemStack(Items.POTIONITEM, 1, 8261), new Object[]{Items.GLASS_BOTTLE, MItems.ITEMS.get("ChuJellyRed")});
		GameRegistry.addShapelessRecipe(new ItemStack(MItems.ITEMS.get("HyrlIngot"), 2), new Object[]{MItems.ITEMS.get("FeIngot"), MItems.ITEMS.get("AgIngot")});
		GameRegistry.addShapelessRecipe(new ItemStack(MItems.ITEMS.get("ShdwIngot"), 2), new Object[]{MItems.ITEMS.get("FeIngot"), MItems.ITEMS.get("ShdwGem")});
		GameRegistry.addShapelessRecipe(new ItemStack(MItems.ITEMS.get("NewMasterSword"), 1), new Object[]{MItems.ITEMS.get("MasterSword"), MItems.ITEMS.get("MasterIngot")});

		
	}
	public static void addSmeltingRec(){
		GameRegistry.addSmelting(MBlocksClass.AgOre, new ItemStack(MItems.ITEMS.get("AgIngot"), 1), 20.0f);
		//GameRegistry.addSmelting(MBlocksClass.MasterOre, new ItemStack(MItems.ITEMS.get("MasterIngot"), 1), 20.0f);
		GameRegistry.addSmelting(Blocks.STONE,  new ItemStack(MItems.ITEMS.get("RockSteak"), 1), 10.0f);
	}
}
