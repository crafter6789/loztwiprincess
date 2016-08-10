package com.crafter6789.loztwiprincess.creativeTabs;

import net.minecraft.creativetab.CreativeTabs;

public class MCreativeTabs {
	
	public static CreativeTabs tabBlock;
	public static CreativeTabs tabItem;
	public static CreativeTabs tabTool;
	public static CreativeTabs tabArmour;
	public static CreativeTabs tabUtil;
	
	public static void initializeTabs(){
		
		tabBlock = new CreativeTabBlock("BlockTab");
		tabItem = new CreativeTabItem("ItemTab");
		tabTool = new CreativeTabTool("ToolTab");
		tabArmour = new CreativeTabArmour("ArmourTab");
		tabUtil = new CreativeTabUtil("UtilityTab");
		
	}
}
