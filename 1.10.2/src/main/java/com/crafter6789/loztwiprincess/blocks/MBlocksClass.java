package com.crafter6789.loztwiprincess.blocks;

import com.crafter6789.loztwiprincess.blocks.ores.RPGrass;
import com.crafter6789.loztwiprincess.blocks.ores.RPGrassUsed;
import com.crafter6789.loztwiprincess.blocks.ores.RupeeOre;
import com.crafter6789.loztwiprincess.creativeTabs.MCreativeTabs;
import com.crafter6789.loztwiprincess.item.MItems;
import com.crafter6789.loztwiprincess.lib.RefStrings;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class MBlocksClass {
	public static void mainRegistry(){
		initializeBlock();
		registerItem();
	}
	
	public static Block ShdwSteel;
	public static Block FeSteel;
	public static Block HyrlSteel;
	public static Block Ag;

	public static Block ShdwOre;
	public static Block AgOre;
	public static Block MasterOre;
	public static Block RupeeOre;
	
	public static Block RPGrass;
	public static Block RPGrassUsed;	
	
	//public static Block TwiHyrulePortal;
	//public static Block TwiHyrulePortalSupport;
	
	//public static Block BeechSapling;
	//public static Block BeechLog;
	//public static Block BeechLeaves;
	
	//public static Block SwordStand;

	public static void initializeBlock(){
		
		//Steel
		
		ShdwSteel = new MBlock("ShdwSteel", Material.IRON, SoundType.METAL, 5.0f, 5.0f, "pickaxe", 0).setCreativeTab(MCreativeTabs.tabBlock);
		FeSteel = new MBlock("FeSteel", Material.IRON, SoundType.METAL, 5.0f, 5.0f, "pickaxe", 0).setCreativeTab(MCreativeTabs.tabBlock);
		HyrlSteel = new MBlock("HyrlSteel", Material.IRON, SoundType.METAL, 5.0f, 5.0f, "pickaxe", 0).setCreativeTab(MCreativeTabs.tabBlock);
		Ag = new MBlock("Ag", Material.IRON, SoundType.METAL, 5.0f, 5.0f, "pickaxe", 0).setCreativeTab(MCreativeTabs.tabBlock);
		
		//Ore
		
		ShdwOre = new MOre("SOre", Material.ROCK, MItems.ITEMS.get("ShdwGem"), 0, 1, 5.0F, 4.0F, 1).setHardness(5.0f).setResistance(5.0f).setCreativeTab(MCreativeTabs.tabBlock);
		AgOre = new MBlock("AgOre", Material.ROCK, SoundType.STONE, 5.0f, 4.0f, "pickaxe", 0).setCreativeTab(MCreativeTabs.tabBlock);
		MasterOre = new MBlock("MasterOre", Material.ROCK, SoundType.STONE, 20.0f, 40.0f, "pickaxe", 3).setCreativeTab(MCreativeTabs.tabBlock);
		RupeeOre = new RupeeOre("RupeeOre", Material.ROCK).setCreativeTab(MCreativeTabs.tabBlock);
		
		//Rupee Grass
		
		RPGrass = new RPGrass("RPGrass", Material.PLANTS).setCreativeTab(MCreativeTabs.tabItem);
		RPGrassUsed = new RPGrassUsed("RPGrassUsed", Material.PLANTS).setCreativeTab(MCreativeTabs.tabUtil);
		
		//Portal
		
		//TwiHyrulePortal = new TwiHyrulePortal();
		//TwiHyrulePortalSupport = new MBlocksStone(Material.ROCK, 5.0f, 4.0f, "pickaxe", 0)/*.setBlockName("TwiHyrulePortalSupport")*/.setCreativeTab(MCreativeTabs.tabUtil).setRegistryName(RefStrings.MODID + ":TwiHyrulePortalSupport");
			
		//Woods
		
		//BeechSapling = new MSapling("BeechSapling");
		//BeechLog = new MLog("BeechLog");
		//BeechLeaves = new MLeaves("BeechLeaves");
		
		//TileEntities
		
		
		//SwordStand = new SwordStand().setBlockName("SwordStand").setCreativeTab(MCreativeTabs.tabBlock);
		
	}
	
	public static void registerItem(){
		GameRegistry.register(ShdwSteel);
		GameRegistry.register(FeSteel);
		GameRegistry.register(HyrlSteel);
		GameRegistry.register(Ag);

		GameRegistry.register(ShdwOre);
		GameRegistry.register(AgOre);
		GameRegistry.register(MasterOre);
		GameRegistry.register(RupeeOre);
		
		GameRegistry.register(RPGrass);
		GameRegistry.register(RPGrassUsed);
		
		//GameRegistry.register(TwiHyrulePortal);
		//GameRegistry.register(TwiHyrulePortalSupport);
		
/**		GameRegistry.register(ShdwSteel);
		GameRegistry.register(Ag);
		GameRegistry.register(FeSteel);
		GameRegistry.register(HyrlSteel);
		GameRegistry.register(ShdwOre);
		GameRegistry.register(AgOre);
		GameRegistry.register(MasterOre);
		GameRegistry.register(RupeeOre);
		GameRegistry.register(RPGrass);
		GameRegistry.register(RPGrassUsed);
		//GameRegistry.register(TwiHyrulePortal);
		GameRegistry.register(TwiHyrulePortalSupport);
		//GameRegistry.register(BeechSapling);
		//GameRegistry.register(BeechLog);
		//GameRegistry.register(BeechLeaves);
		//GameRegistry.register(SwordStand);*/
	}
}
