package com.crafter6789.loztwiprincess.world.biome;

import com.crafter6789.loztwiprincess.blocks.MBlocks;
import com.crafter6789.loztwiprincess.lib.RefStrings;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.world.gen.feature.WorldGenBigTree;

import java.util.Random;

public class BiomeHyruleField extends Biome {
	
	public BiomeProperties properties;

    public BiomeHyruleField(BiomeProperties properties) {
        super(com.crafter6789.loztwiprincess.world.biome.BiomeHyruleField.properties);
        
        //setDisableRain();
        Biome.is.addFlower(MBlocks.RPGrass, 0, 20);
        this.setTemperatureRainfall(1.0F, 1.0F);
        //this.hyruleBiomeDecorator.addOre();
    }
}