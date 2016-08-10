package com.crafter6789.loztwiprincess.util.item;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public interface IItemPropertyGetter
{
    @SideOnly(Side.CLIENT)
    float apply(ItemStack stack, World worldIn, EntityLivingBase entityIn);
}