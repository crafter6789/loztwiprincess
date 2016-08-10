package com.crafter6789.loztwiprincess.world.biome;

import net.minecraft.world.WorldType;
import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.gen.layer.GenLayerBiome;
import net.minecraft.world.gen.layer.GenLayerBiomeEdge;
import net.minecraft.world.gen.layer.GenLayerZoom;

public class WorldTypeTwilightPrincess extends WorldType{
	
	public final int generatorVersion;
	public final int worldType;


	public WorldTypeTwilightPrincess(int par1, String name, int genver){
		super(name);
		this.worldType = par1;
	    this.generatorVersion = genver;
	}
	
	
	public GenLayer getBiomeLayer(long worldSeed, GenLayer parentLayer)
    {
        GenLayer ret = new HyruleFieldGenLayerBiome(200L, parentLayer, this);
        ret = GenLayerZoom.magnify(1000L, ret, 2);
        ret = new GenLayerBiomeEdge(1000L, ret);
        return ret;
    }

}