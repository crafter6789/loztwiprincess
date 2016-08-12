package com.crafter6789.loztwiprincess.item.meta;

import java.util.List;

import com.crafter6789.loztwiprincess.creativeTabs.MCreativeTabs;
import com.crafter6789.loztwiprincess.lib.RefStrings;

//import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
//import net.minecraft.util.IIcon;

public class Rupee extends Item {
	
	public int maxnum = 7;
	
	public Rupee(String name) {
		super();
		this.setUnlocalizedName(name);
		this.setCreativeTab(MCreativeTabs.tabItem);
		this.setHasSubtypes(true);
		//this.setMaxDamage(maxnum or 0);
		
	}
/*	public IIcon[] icons = new IIcon[maxnum];

	@Override
	public void registerIcons(IIconRegister reg) {
	    for (int i = 0; i < maxnum; i ++) {
	        this.icons[i] = reg.registerIcon(RefStrings.MODID + ":Rupee_" + i);
	    }
	}
	@Override
	public IIcon getIconFromDamage(int meta) {
	    if (meta > maxnum - 1)
	        meta = 0;

	    return this.icons[meta];
	}*/

	@Override
	public void getSubItems(Item item, CreativeTabs tab, List list) {
	    for (int i = 0; i < maxnum; i ++) {
	        list.add(new ItemStack(item, 1, i));
	    }
	}

	@Override
	public String getUnlocalizedName(ItemStack stack) {
	    return this.getUnlocalizedName() + "_" + stack.getItemDamage();
	}
}
