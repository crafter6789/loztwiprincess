package com.crafter6789.loztwiprincess.item;

import com.crafter6789.loztwiprincess.creativeTabs.MCreativeTabs;
import com.crafter6789.loztwiprincess.lib.RefStrings;

import net.minecraft.entity.Entity;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class MArmor extends ItemArmor {

	//private Entity entity;

	public MArmor(String name, ArmorMaterial material, String textureName, EntityEquipmentSlot type) {
	    super(material, 0, type);
	    this.setCreativeTab(MCreativeTabs.tabArmour);
	    this.setRegistryName(name);
		this.setUnlocalizedName(name);
		MItems.ITEMS.put(name, this);

	    //this.setTextureName(RefStrings.MODID  + ":" + unlocalizedName);
	}
	
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
				
		if (slot == 0 || slot == 1 || slot == 3) {
			return RefStrings.MODID + ":textures/model/armor/" + getUnlocalizedName(stack).substring(5, 13) + "/layer_1.png";
		}else if(slot == 2){
			return RefStrings.MODID + ":textures/model/armor/" + getUnlocalizedName(stack).substring(5, 13) + "/layer_2.png";
		}else{
			return null;
		}
		
	}
	
}
