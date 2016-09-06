package com.crafter6789.loztwiprincess.main;

import com.crafter6789.loztwiprincess.blocks.MBlocksClass;
import com.crafter6789.loztwiprincess.creativeTabs.MCreativeTabs;
import com.crafter6789.loztwiprincess.entity.MEntitiesClass;
import com.crafter6789.loztwiprincess.item.MItems;
import com.crafter6789.loztwiprincess.lib.RefStrings;
import com.crafter6789.loztwiprincess.world.MWorld;
import com.crafter6789.loztwiprincess.world.biome.WorldTypeTwilightPrincess;

import net.minecraft.world.WorldType;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = RefStrings.MODID, name = RefStrings.NAME, version = RefStrings.VERSION, acceptedMinecraftVersions = RefStrings.REQMC)
public class MainRegistry {
	
	@SidedProxy(clientSide = RefStrings.CLIENTSIDE, serverSide = RefStrings.SERVERSIDE)
	public static ServerProxy proxy;
	
	@Instance(RefStrings.MODID)
	public static MainRegistry modInstance;

	@EventHandler
	public static void PreLoad(FMLPreInitializationEvent PreEvent){

		//DimensionRegistry.mainRegistry();
		
		MItems.mainRegistry();
		MBlocksClass.mainRegistry();
		MWorld.mainRegistry();
		CraftingManager.mainRegistry();
		MEntitiesClass.mainRegistry();
		//BiomeRegistry.mainRegistry();

		
		proxy.registerTileEntities();
		proxy.registerRenderInfo();
	}
	@EventHandler
	public static void load(FMLInitializationEvent event){
		
		MCreativeTabs.initializeTabs();

		//DimensionRegistry.mainRegistry();
		//DimensionRegistry.registerDimensions();
		//DimensionRegistry.registerWorldProvider();
		
	}
	@EventHandler
	public static void PostLoad(FMLPostInitializationEvent PostEvent){
		
		WorldType TWILIGHTPRINCESS = new WorldTypeTwilightPrincess(3, "twilightprincess", 0);
		
	}
}
