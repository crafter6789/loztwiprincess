package com.crafter6789.loztwiprincess.item;

import com.crafter6789.loztwiprincess.lib.RefStrings;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class RockSteak extends ItemFood {

	public RockSteak(int par1, int par2, Boolean boolean3, String name) {
		super(par1, par2, boolean3);
		this.setUnlocalizedName("RockSteak");
		this.setTextureName(RefStrings.MODID + ":RockSteak");
		
	}
	protected void onFoodEaten(ItemStack p_77849_1_, World p_77849_2_, EntityPlayer p_77849_3_)
    {
	//boolean flag = (p_77849_3_.inventory.armorItemInSlot(1) == new ItemStack(MItems.GoranTunicHelm) || p_77849_3_.inventory.armorItemInSlot(1) == new ItemStack(MItems.GoranTunicChest) || p_77849_3_.inventory.armorItemInSlot(2) == new ItemStack(MItems.GoranTunicLegs) || p_77849_3_.inventory.armorItemInSlot(3) == new ItemStack(MItems.GoranTunicBoots));
    	if (/*flag*/true) {
            	p_77849_3_.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 600, 0));
            	p_77849_3_.addPotionEffect(new PotionEffect(Potion.resistance.id, 300, 0));
        }
    	if (/*!flag*/true) {
        	p_77849_3_.attackEntityFrom(new DamageSource("eatRock"), 2);
    	}
        if (p_77849_2_.isRemote)
        {
            super.onFoodEaten(p_77849_1_, p_77849_2_, p_77849_3_);
        }
    }
}
