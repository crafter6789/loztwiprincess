package com.crafter6789.loztwiprincess.main;

import java.util.Arrays;

import com.crafter6789.loztwiprincess.blocks.MBlocksClass;
import com.crafter6789.loztwiprincess.entity.MEntitiesClass;
import com.crafter6789.loztwiprincess.item.MItems;
import com.crafter6789.loztwiprincess.creativeTabs.MCreativeTabs;
import com.crafter6789.loztwiprincess.lib.RefStrings;
import com.crafter6789.loztwiprincess.world.MWorld;
import com.crafter6789.loztwiprincess.world.biome.BiomeRegistry;
import com.crafter6789.loztwiprincess.world.biome.WorldTypeTwilightPrincess;
import com.crafter6789.loztwiprincess.world.dimension.DimensionRegistry;
import com.crafter6789.loztwiprincess.world.dimension.WorldProviderTwilightPrincess;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.ModMetadata;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.Event;
import net.minecraft.world.WorldType;

@Mod(modid = RefStrings.MODID, name = RefStrings.NAME, version = RefStrings.VERSION, acceptedMinecraftVersions = RefStrings.REQMC)
public class MainRegistry {
	
	@SidedProxy(clientSide = RefStrings.CLIENTSIDE, serverSide = RefStrings.SERVERSIDE)
	public static ServerProxy proxy;
	
	@Instance(RefStrings.MODID)
	public static MainRegistry modInstance;

	@EventHandler
	public static void PreLoad(FMLPreInitializationEvent PreEvent){

		//DimensionRegistry.mainRegistry();
		
		MCreativeTabs.initializeTabs();
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
		//DimensionRegistry.mainRegistry();
		//DimensionRegistry.registerDimensions();
		//DimensionRegistry.registerWorldProvider();
		
	}
	@EventHandler
	public static void PostLoad(FMLPostInitializationEvent PostEvent){
		
		WorldType TWILIGHTPRINCESS = new WorldTypeTwilightPrincess(3, "twilightprincess", 0);
		
	}
}
