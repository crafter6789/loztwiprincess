package com.crafter6789.loztwiprincess.creativeTabs;

import com.crafter6789.loztwiprincess.item.MItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabTool extends CreativeTabs {

	public CreativeTabTool(String lable) {
		super(lable);
	}

	@Override
	public Item getTabIconItem() {
		return MItems.HyrlPick;
	}

}
