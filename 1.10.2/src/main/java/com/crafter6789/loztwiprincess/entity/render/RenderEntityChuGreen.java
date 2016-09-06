package com.crafter6789.loztwiprincess.entity.render;

import com.crafter6789.loztwiprincess.entity.mob.EntityChuGreen;
import com.crafter6789.loztwiprincess.lib.RefStrings;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderEntityChuGreen extends RenderLiving {
	
	private static final RenderManager render = Minecraft.getMinecraft().getRenderManager();

	
	private static final ResourceLocation mobTextures = new ResourceLocation(RefStrings.MODID + ":textures/entities/EntityChuGreen.png");

	public RenderEntityChuGreen(ModelBase par1ModelBase, float par2) {
		super(render, par1ModelBase, par2);
	}
	
	protected ResourceLocation getEntityTexture(EntityChuGreen entity){
		return mobTextures;
	}
	
	protected ResourceLocation getEntityTexture(Entity entity){
		return this.getEntityTexture((EntityChuGreen)entity);
	}

}
