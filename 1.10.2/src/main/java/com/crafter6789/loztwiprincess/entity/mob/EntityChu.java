package com.crafter6789.loztwiprincess.entity.mob;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackMelee;
import net.minecraft.entity.ai.EntityAIFleeSun;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class EntityChu extends EntityMob {

	private static Item dropitem;

	public EntityChu(World par1world, Item drop) {
		super(par1world);
		EntityChu.dropitem = drop;
		this.setSize(0.8F, 0.8F);
		this.tasks.addTask(0, new EntityAIWander(this, 0.10D));
		this.tasks.addTask(1, new EntityAIFleeSun(this, 0.12D));
		this.tasks.addTask(2, new EntityAIAttackMelee(this, 0.14D, false));
        //this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityPlayer.class, 0.13D, false));
		/*this.targetTasks.addTask(0, new EntityAIHurtByTarget(this, true));
        this.targetTasks.addTask(1, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, true));*/
		this.targetTasks.addTask(0, new EntityAIHurtByTarget(this, true));
        this.targetTasks.addTask(1, new EntityAINearestAttackableTarget<EntityPlayer>(this, EntityPlayer.class, true));
        if (this.isCollided = true){
        	DamageSource source = DamageSource.causeMobDamage(this);
        	par1world.getNearestAttackablePlayer(this, 10, 10).attackEntityFrom(source, 3.0F);
        }
	}

	public boolean isAIEnabled(){
		return true;
	}
	
	protected void applyEntityAttributes(){
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(24.0F);
		this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(3.0F);
		this.getEntityAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE).setBaseValue(1.0D);
		this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(40.0D);
	}
	
	protected Item getDropItem()
    {
		this.dropItem(EntityChu.dropitem, 1);
		return null;
		//return MItems.ChuJellyBlue;
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
