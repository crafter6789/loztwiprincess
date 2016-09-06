package com.crafter6789.loztwiprincess.main;

import com.crafter6789.loztwiprincess.entity.mob.EntityChuBlue;
import com.crafter6789.loztwiprincess.entity.mob.EntityChuGreen;
import com.crafter6789.loztwiprincess.entity.mob.EntityChuPurple;
import com.crafter6789.loztwiprincess.entity.mob.EntityChuRed;
import com.crafter6789.loztwiprincess.entity.mob.EntityChuYellow;
import com.crafter6789.loztwiprincess.entity.render.ModelEntityChu;
import com.crafter6789.loztwiprincess.entity.render.RenderEntityChuBlue;
import com.crafter6789.loztwiprincess.entity.render.RenderEntityChuGreen;
import com.crafter6789.loztwiprincess.entity.render.RenderEntityChuPurple;
import com.crafter6789.loztwiprincess.entity.render.RenderEntityChuRed;
import com.crafter6789.loztwiprincess.entity.render.RenderEntityChuYellow;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraft.client.model.ModelBase;

public class ClientProxy extends ServerProxy{
	public void registerRenderInfo(){
		RenderingRegistry.registerEntityRenderingHandler(EntityChuRed.class, new RenderEntityChuRed(new ModelEntityChu(), 0F));
		RenderingRegistry.registerEntityRenderingHandler(EntityChuGreen.class, new RenderEntityChuGreen(new ModelEntityChu(), 0F));
		RenderingRegistry.registerEntityRenderingHandler(EntityChuBlue.class, new RenderEntityChuBlue(new ModelEntityChu(), 0F));
		RenderingRegistry.registerEntityRenderingHandler(EntityChuYellow.class, new RenderEntityChuYellow(new ModelEntityChu(), 0F));
		RenderingRegistry.registerEntityRenderingHandler(EntityChuPurple.class, new RenderEntityChuPurple(new ModelEntityChu(), 0F));
	}
	
	/*public int addArmor(String armor){
		return RenderingRegistry.addNewArmourRendererPrefix(armor);
	}*/
}
