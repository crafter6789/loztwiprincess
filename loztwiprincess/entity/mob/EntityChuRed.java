package com.crafter6789.loztwiprincess.entity.mob;

import com.crafter6789.loztwiprincess.item.MItems;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIFleeSun;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class EntityChuRed extends EntityMob {

	public EntityChuRed(World par1world) {
		super(par1world);
		this.setSize(0.8F, 0.8F);
		this.getNavigator().setAvoidsWater(true);
		this.tasks.addTask(0, new EntityAIWander(this, 0.10D));
		this.tasks.addTask(1, new EntityAIFleeSun(this, 0.12D));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityPlayer.class, 0.13D, false));
		this.targetTasks.addTask(0, new EntityAIHurtByTarget(this, true));
        this.targetTasks.addTask(1, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, true));
	}

	public boolean isAIEnabled(){
		return true;
	}
	
	protected void applyEntityAttributes(){
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(24.0F);
		this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(3.0F);
		this.getEntityAttribute(SharedMonsterAttributes.knockbackResistance).setBaseValue(1.0D);
		this.getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(40.0D);
	}
	
	protected Item getDropItem()
    {
		this.dropItem(MItems.ChuJellyRed, 1);
		return null;
       // return MItems.ChuJellyRed;
    }
	
	
	
	
//	 protected void dropRareDrop(int p_70600_1_)
//	    {
//	        switch (this.rand.nextInt(3))
//	        {
//	            case 0:
//	                this.dropItem(Items.iron_ingot, 1);
//	                break;
//	            case 1:
//	                this.dropItem(Items.carrot, 1);
//	                break;
//	            case 2:
//	                this.dropItem(Items.potato, 1);
//	        }
//    }
}
