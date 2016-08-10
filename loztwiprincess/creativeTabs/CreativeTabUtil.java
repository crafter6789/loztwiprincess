package com.crafter6789.loztwiprincess.creativeTabs;

import com.crafter6789.loztwiprincess.item.MItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class CreativeTabUtil extends CreativeTabs {

	public CreativeTabUtil(String lable) {
		super(lable);
	}

	@Override
	public Item getTabIconItem() {
		return Items.command_block_minecart;
	}

}
