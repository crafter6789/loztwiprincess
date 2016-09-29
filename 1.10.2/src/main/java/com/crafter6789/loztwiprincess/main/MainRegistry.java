package com.crafter6789.loztwiprincess.main;

import com.crafter6789.loztwiprincess.blocks.MBlocks;
import com.crafter6789.loztwiprincess.creativeTabs.MCreativeTabs;
import com.crafter6789.loztwiprincess.entity.MEntitiesClass;
import com.crafter6789.loztwiprincess.item.MItems;
import com.crafter6789.loztwiprincess.lib.MLogHelper;
import com.crafter6789.loztwiprincess.lib.RefStrings;
import com.crafter6789.loztwiprincess.world.MWorld;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = RefStrings.MODID, name = RefStrings.NAME, version = RefStrings.VERSION, acceptedMinecraftVersions = RefStrings.REQMC)
public class MainRegistry {
	
	private static int loglevel = 4;
	
	@SidedProxy(clientSide = RefStrings.CLIENTSIDE, serverSide = RefStrings.SERVERSIDE)
	public static ServerProxy proxy;
	
	@Instance(RefStrings.MODID)
	public static MainRegistry modInstance;

	@EventHandler
	public static void PreLoad(FMLPreInitializationEvent PreEvent){

		//DimensionRegistry.mainRegistry();
		MCreativeTabs.initializeTabs();
		MItems.mainRegistry();
		MBlocks.mainRegistry();
		MWorld.mainRegistry();
		CraftingManager.mainRegistry();
		MEntitiesClass.mainRegistry();
		//BiomeRegistry.mainRegistry();

		//proxy.registerTileEntities();
		proxy.preInit(PreEvent);
	MLogHelper.addLogLines(loglevel, "Finished PreLoad for domain %s.", RefStrings.MODID);}
	
	@EventHandler
	public static void load(FMLInitializationEvent Event){
		MCreativeTabs.initializeTabs();


		//DimensionRegistry.mainRegistry();
		//DimensionRegistry.registerDimensions();
		//DimensionRegistry.registerWorldProvider();
		proxy.init(Event);
	MLogHelper.addLogLines(loglevel, "Finished Load for domain %s.", RefStrings.MODID);}
	
	@EventHandler
	public static void PostLoad(FMLPostInitializationEvent PostEvent){
		
		//WorldType TWILIGHTPRINCESS = new WorldTypeTwilightPrincess(3, "twilightprincess", 0);
		proxy.postInit(PostEvent);
	MLogHelper.addLogLines(loglevel, "Finished PostLoad for domain %s. The mod successfully loaded with no compile errors. However, there may still be fatal errors in the code.", RefStrings.MODID);}
}
