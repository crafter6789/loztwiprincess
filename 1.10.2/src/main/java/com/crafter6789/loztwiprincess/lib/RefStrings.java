
package com.crafter6789.loztwiprincess.lib;

import java.util.Arrays;
import java.util.List;

import com.crafter6789.loztwiprincess.world.dimension.MDimensionType;

import net.minecraft.world.DimensionType;

public class RefStrings {
	
	public static final String MODID = "loztwiprincess";
	public static final String NAME = "Legend of Zelda Twilight Princess Mod";
	public static final String VERSION = "0.1.3-pre";
	
	public static final String REQFORGE = "required-after:Forge@[2.18.1.2011,)";
	public static final String REQMC = "[1.10.2]";
	
	public static final String DESC = "FORGE VERSION 2.18.1.2011 FOR MC VERSION 1.10.2 AND JAVA VERSION 1.8.0_101";
//	public static final String URL = "nonexistent";
//	public static final String UPDATEURL = "nonexistent";
	
	public static final List<String> AUTHORS = Arrays.asList(new String[]{ "crafter6789" });
	public static final String CREDITS = "See credits.txt for full credits";
	public static final String LOGOFILE = "/logo.png";
	
	public static final String CLIENTSIDE = "com.crafter6789.loztwiprincess.main.ClientProxy";
	public static final String SERVERSIDE = "com.crafter6789.loztwiprincess.main.ServerProxy";
	public static final int dimensionId = 7;
	public static final DimensionType dimensionType = DimensionType.OVERWORLD/*DimensionType.HYRULE*/;
}
