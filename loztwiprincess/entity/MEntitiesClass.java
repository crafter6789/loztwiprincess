package com.crafter6789.loztwiprincess.entity;

import com.crafter6789.loztwiprincess.entity.mob.EntityChuBlue;
import com.crafter6789.loztwiprincess.entity.mob.EntityChuGreen;
import com.crafter6789.loztwiprincess.entity.mob.EntityChuPurple;
import com.crafter6789.loztwiprincess.entity.mob.EntityChuRed;
import com.crafter6789.loztwiprincess.entity.mob.EntityChuYellow;
import com.crafter6789.loztwiprincess.main.MainRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;

public class MEntitiesClass {
	
	public static void mainRegistry() {
		
		registerEntity();
	}

	public static void registerEntity() {//TODO register entities here
		
		createEntity(EntityChuRed.class, "EntityChuRed", 0xE2001A, 0xFF141D);
		createEntity(EntityChuGreen.class, "EntityChuGreen", 0x0A6D0A, 0x0AFF0A);
		createEntity(EntityChuBlue.class, "EntityChuBlue", 0x0900B7, 0x3523FF);
		createEntity(EntityChuYellow.class, "EntityChuYellow", 0xFFE900, 0xFFFC5E);
		createEntity(EntityChuPurple.class, "EntityChuPurple", 0xBC00A3, 0xBF3FB0);
		
	}

	public static void createEntity(Class entityClass, String entityName, int solidColor, int spotColor) {
		int randomId = EntityRegistry.findGlobalUniqueEntityId();
		EntityRegistry.registerGlobalEntityID(entityClass, entityName, randomId);
		EntityRegistry.registerModEntity(entityClass, entityName, randomId, MainRegistry.modInstance, 16, 1, true);
		EntityRegistry.addSpawn(entityClass, 2, 0, 1, EnumCreatureType.creature, BiomeGenBase.forest);
		
		createEgg(randomId, solidColor, spotColor);
	}

	private static void createEgg(int randomId, int solidColor, int spotColor) {
		EntityList.entityEggs.put(Integer.valueOf(randomId), new EntityList.EntityEggInfo(randomId, solidColor, spotColor));
	}

}
