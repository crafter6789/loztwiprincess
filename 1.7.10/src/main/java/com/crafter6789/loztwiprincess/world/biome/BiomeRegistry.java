package com.crafter6789.loztwiprincess.world.biome;

import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager;

public class BiomeRegistry {
	
	public static void mainRegistry(){
		initializeBiome();
		registerBiome();
	}
	
	public static BiomeGenBase biomeHyruleField;
	
	public static void initializeBiome(){
		
		biomeHyruleField = new BiomeHyruleField(137).setBiomeName("Sapphire").setTemperatureRainfall(1.2F, 0.9F);
		
	}
	
	public static void registerBiome(){
		BiomeDictionary.registerBiomeType(biomeHyruleField, Type.PLAINS);
		BiomeManager.addSpawnBiome(biomeHyruleField);
		
	}

}