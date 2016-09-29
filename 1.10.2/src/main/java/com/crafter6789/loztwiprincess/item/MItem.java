package com.crafter6789.loztwiprincess.item;

import net.minecraft.item.Item;

public class MItem extends Item {

	public MItem(String name){
		this.setRegistryName(name);
		this.setUnlocalizedName(name);
		MItems.ITEMS.put(name, this);
	}
	
}
