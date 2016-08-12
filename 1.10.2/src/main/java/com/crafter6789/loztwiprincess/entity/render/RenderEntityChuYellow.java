package com.crafter6789.loztwiprincess.entity.render;

import com.crafter6789.loztwiprincess.entity.mob.EntityChuYellow;
import com.crafter6789.loztwiprincess.lib.RefStrings;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderEntityChuYellow extends RenderLiving {
	
	private static final ResourceLocation mobTextures = new ResourceLocation(RefStrings.MODID + ":textures/entities/EntityChuYellow.png");

	public RenderEntityChuYellow(ModelBase par1ModelBase, float par2) {
		super(par1ModelBase, par2);
	}
	
	protected ResourceLocation getEntityTexture(EntityChuYellow entity){
		return mobTextures;
	}
	
	protected ResourceLocation getEntityTexture(Entity entity){
		return this.getEntityTexture((EntityChuYellow)entity);
	}

}
