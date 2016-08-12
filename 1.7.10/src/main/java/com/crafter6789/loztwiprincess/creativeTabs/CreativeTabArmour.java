package com.crafter6789.loztwiprincess.creativeTabs;

import com.crafter6789.loztwiprincess.item.MItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabArmour extends CreativeTabs {

	public CreativeTabArmour(String lable) {
		super(lable);
	}

	@Override
	public Item getTabIconItem() {
		return MItems.HyrlNormChest;
	}

}
