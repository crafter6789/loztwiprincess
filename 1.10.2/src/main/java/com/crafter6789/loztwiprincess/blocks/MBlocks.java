package com.crafter6789.loztwiprincess.blocks;

import java.util.HashMap;
import java.util.Map;

import com.crafter6789.loztwiprincess.blocks.ores.RPGrass;
import com.crafter6789.loztwiprincess.blocks.ores.RPGrassUsed;
import com.crafter6789.loztwiprincess.blocks.ores.RupeeOre;
import com.crafter6789.loztwiprincess.creativeTabs.MCreativeTabs;
import com.crafter6789.loztwiprincess.item.MItems;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class MBlocks {
	
	public static Map<String, Block> BLOCKS = new HashMap<String, Block>();
	
	public static void mainRegistry(){
		instantiate();
		register();
	}
	
	public static void instantiate(){
		
		//Steel
		
		new MBlock("ShdwSteel", Material.IRON, SoundType.METAL, 5.0f, 5.0f, "pickaxe", 0);//.setCreativeTab(MCreativeTabs.tabBlock);
		new MBlock("FeSteel", Material.IRON, SoundType.METAL, 5.0f, 5.0f, "pickaxe", 0);//.setCreativeTab(MCreativeTabs.tabBlock);
		new MBlock("HyrlSteel", Material.IRON, SoundType.METAL, 5.0f, 5.0f, "pickaxe", 0);//.setCreativeTab(MCreativeTabs.tabBlock);
		new MBlock("Ag", Material.IRON, SoundType.METAL, 5.0f, 5.0f, "pickaxe", 0);//.setCreativeTab(MCreativeTabs.tabBlock);
		
		//Ore
		
		new MOre("SOre", Material.ROCK, MItems.ITEMS.get("ShdwGem"), 0, 1, 5.0F, 4.0F, 1);//.setCreativeTab(MCreativeTabs.tabBlock);
		new MBlock("AgOre", Material.ROCK, SoundType.STONE, 5.0f, 4.0f, "pickaxe", 0);//.setCreativeTab(MCreativeTabs.tabBlock);
		new MBlock("MasterOre", Material.ROCK, SoundType.STONE, 20.0f, 40.0f, "pickaxe", 3);//.setCreativeTab(MCreativeTabs.tabBlock);
		new RupeeOre("RupeeOre", Material.ROCK);//.setCreativeTab(MCreativeTabs.tabBlock);
		
		//Rupee Grass
		
		new RPGrass("RPGrass", Material.PLANTS);//.setCreativeTab(MCreativeTabs.tabItem);
		new RPGrassUsed("RPGrassUsed", Material.PLANTS);//.setCreativeTab(MCreativeTabs.tabUtil);
		
		//Portal
		
		//new TwiHyrulePortal();
		//new MBlocksStone(Material.ROCK, 5.0f, 4.0f, "pickaxe", 0)/*.setBlockName("TwiHyrulePortalSupport")*/.setCreativeTab(MCreativeTabs.tabUtil).setRegistryName(RefStrings.MODID + ":TwiHyrulePortalSupport");
			
		//Woods
		
		//MSapling("BeechSapling");
		//new MLog("BeechLog");
		//new MLeaves("BeechLeaves");
		
		//TileEntities
		
		
		//new SwordStand().setBlockName("SwordStand").setCreativeTab(MCreativeTabs.tabBlock);
		
	}
	
	private static void register(){
		for(Block block : BLOCKS.values()){
			GameRegistry.register(block);
			GameRegistry.register(new ItemBlock(block).setRegistryName(block.getRegistryName()).setCreativeTab(MCreativeTabs.tabBlock)/*.toString().toLowerCase()*/);// May Reimplement
		}	
	}
	
	public static void registerModels(){
		for(Block block : BLOCKS.values()){
			ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "normal"));
		}
	}
	
}
