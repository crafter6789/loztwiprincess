package com.crafter6789.loztwiprincess.entity;

import com.crafter6789.loztwiprincess.entity.mob.EntityChuBlue;
import com.crafter6789.loztwiprincess.entity.mob.EntityChuGreen;
import com.crafter6789.loztwiprincess.entity.mob.EntityChuPurple;
import com.crafter6789.loztwiprincess.entity.mob.EntityChuRed;
import com.crafter6789.loztwiprincess.entity.mob.EntityChuYellow;
import com.crafter6789.loztwiprincess.main.MainRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.init.Biomes;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeCache;
import net.minecraftforge.fml.common.registry.EntityRegistry.EntityRegistration;

public class MEntitiesClass {
	
	public static void mainRegistry() {
		
		registerEntity();
	}

	public static void registerEntity() {//TODO register entities here
		
		createEntity(1, EntityChuRed.class, "EntityChuRed", 0xE2001A, 0xFF141D);
		createEntity(2, EntityChuGreen.class, "EntityChuGreen", 0x0A6D0A, 0x0AFF0A);
		createEntity(3, EntityChuBlue.class, "EntityChuBlue", 0x0900B7, 0x3523FF);
		createEntity(4, EntityChuYellow.class, "EntityChuYellow", 0xFFE900, 0xFFFC5E);
		createEntity(5, EntityChuPurple.class, "EntityChuPurple", 0xBC00A3, 0xBF3FB0);
		
	}

	public static void createEntity(int Id, Class entityClass, String entityName, int solidColor, int spotColor) {
		//int Id = EntityRegistry.findGlobalUniqueEntityId();
		//EntityRegistry.registerGlobalEntityID(entityClass, entityName, Id);
		EntityRegistry.registerModEntity(entityClass, entityName, Id, MainRegistry.modInstance, 16, 1, true);
		EntityRegistry.addSpawn(entityClass, 2, 0, 1, EnumCreatureType.CREATURE, Biomes.FOREST);
		
		//createEgg(String.valueOf(randomId), solidColor, spotColor);
	}

	//private static void createEgg(String randomId, int solidColor, int spotColor) {
	//	EntityList.ENTITY_EGGS.put(randomId, new EntityList.EntityEggInfo(randomId, solidColor, spotColor));
	//}

}
