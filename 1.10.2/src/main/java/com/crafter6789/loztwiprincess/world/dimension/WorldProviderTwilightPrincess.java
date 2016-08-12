package com.crafter6789.loztwiprincess.world.dimension;

import com.crafter6789.loztwiprincess.lib.RefStrings;

import net.minecraft.world.DimensionType;
import net.minecraft.world.WorldProvider;

public class WorldProviderTwilightPrincess extends WorldProvider {
    private static final String __OBFID = "CL_00000388";
    public String getDimensionName(){
        return "Hyrule";
    }
	public DimensionType getDimensionType() {
		return RefStrings.dimensionType;
	}
}
