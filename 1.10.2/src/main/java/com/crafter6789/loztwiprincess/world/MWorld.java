package com.crafter6789.loztwiprincess.world;

import net.minecraftforge.fml.common.IWorldGenerator;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class MWorld {
	public static void mainRegistry(){
		initializeWorldGen();
		
	}
	
	public static void initializeWorldGen(){
		//TODO list world generators
		registerWorldGen(new ModOre(), 1);
		
	}
	
	public static void registerWorldGen(IWorldGenerator worldGenClass, int weightedProbability){
		GameRegistry.registerWorldGenerator(worldGenClass, weightedProbability);
		
	}
}
