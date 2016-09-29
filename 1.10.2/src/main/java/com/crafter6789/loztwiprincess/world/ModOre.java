package com.crafter6789.loztwiprincess.world;

import java.util.Random;

import com.crafter6789.loztwiprincess.blocks.MBlocks;

import net.minecraftforge.fml.common.IWorldGenerator;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

public class ModOre implements IWorldGenerator {
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		switch(world.provider.getDimension()){
		case -1:
			generateNether(random, chunkX * 16, chunkZ * 16, world);
			break;
		case 0:
			generateOverworld(random, chunkX * 16, chunkZ * 16, world);
			break;
		case 1:
			generateEnd(random, chunkX * 16, chunkZ * 16, world);
			break;
		}

	}
	
	private void addOre(Block block, Block blockspawn, Random random, World world, int posX, int posZ, int minY, int maxY, int minVein, int maxVein, int spawnChance){
		for(int i = 0; i < spawnChance; i++){
			int defaultChunkSize = 16;
						
			int xPos = posX + random.nextInt(defaultChunkSize);
			int yPos = minY + random.nextInt(maxY - minY);
			int zPos = posZ + random.nextInt(defaultChunkSize);
			
			
			//new WorldGenMinable(block, (minVein + random.nextInt(maxVein - minVein)), blockspawn).generate(world, random, xPos, yPos, zPos);
			new WorldGenMinable(block.getDefaultState(), (minVein + random.nextInt(maxVein - minVein))).generate(world, random, new BlockPos(xPos, yPos, zPos));
		}
	}

	private void generateEnd(Random random, int chunkX, int chunkZ, World world) {
		
	}

	private void generateOverworld(Random random, int chunkX, int chunkZ, World world) {
		addOre(MBlocks.ShdwOre, Blocks.STONE, random, world, chunkX, chunkZ, 8, 20, 5, 9, 10);
		addOre(MBlocks.AgOre, Blocks.STONE, random, world, chunkX, chunkZ, 8, 30, 10, 11, 7);
		addOre(MBlocks.MasterOre, Blocks.STONE, random, world, chunkX, chunkZ, 6, 14, 2, 4, 18);
		addOre(MBlocks.RupeeOre, Blocks.STONE, random, world, chunkX, chunkZ, 10, 24, 4, 7, 12);
		
	}

	private void generateNether(Random random, int chunkX, int chunkZ, World world) {
		
	}

}
