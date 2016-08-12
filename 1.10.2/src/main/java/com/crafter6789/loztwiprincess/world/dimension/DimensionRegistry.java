package com.crafter6789.loztwiprincess.world.dimension;

import com.crafter6789.loztwiprincess.lib.RefStrings;

import net.minecraft.world.WorldProvider;
import net.minecraftforge.common.DimensionManager;

public class DimensionRegistry {
	
	public static void mainRegistry(){
		//registerWorldProvider();
		registerDimensions();
	}

	public static void registerDimensions(){
		//TODO addEnum(); somewhere
		DimensionManager.registerDimension(RefStrings.dimensionId, RefStrings.dimensionType);
	}
	
	/*public static void registerWorldProvider(){
		//DimensionManager.registerProviderType(RefStrings.dimensionId, WorldProviderTwilightPrincess.class, false);
		DimensionManager.registerProviderType(RefStrings.dimensionId, WorldProviderTwilightPrincess.class, true);
	}*/

}