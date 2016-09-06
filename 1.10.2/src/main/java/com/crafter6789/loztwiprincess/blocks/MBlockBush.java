package com.crafter6789.loztwiprincess.blocks;

import java.util.Random;
import javax.annotation.Nullable;

import com.crafter6789.loztwiprincess.lib.RefStrings;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class MBlockBush extends MBlock implements net.minecraftforge.common.IPlantable
{
    protected static AxisAlignedBB BUSH_AABB = new AxisAlignedBB(0.30000001192092896D, 0.0D, 0.30000001192092896D, 0.699999988079071D, 0.6000000238418579D, 0.699999988079071D);

    protected MBlockBush(String name)
    {
        this(name, Material.PLANTS, 0.0F);
    }

    protected MBlockBush(String name, Material materialIn, float hard)
    {
        this(name, materialIn, materialIn.getMaterialMapColor(), hard, BUSH_AABB);
    }

    protected MBlockBush(String name, Material material, MapColor mapColorIn, float hard, AxisAlignedBB box)
    {
        super (name, material, SoundType.PLANT, hard, 0.0F, "all", 0);
        this.blockSoundType = SoundType.PLANT;
        this.setCreativeTab(CreativeTabs.DECORATIONS);
        if (box != null){
        	MBlockBush.BUSH_AABB = box;
        }
    }

    public boolean canPlaceBlockAt(World worldIn, BlockPos pos)
    {
        IBlockState soil = worldIn.getBlockState(pos.down());
        return super.canPlaceBlockAt(worldIn, pos) && soil.getBlock().canSustainPlant(soil, worldIn, pos.down(), net.minecraft.util.EnumFacing.UP, this);
    }

    /**
     * Return true if the block can sustain a Bush
     */
    protected boolean canSustainBush(IBlockState state)
    {
        return state.getBlock() == Blocks.GRASS || state.getBlock() == Blocks.DIRT || state.getBlock() == Blocks.FARMLAND;
    }

    /**
     * Called when a neighboring block was changed and marks that this state should perform any checks during a neighbor
     * change. Cases may include when redstone power is updated, cactus blocks popping off due to a neighboring solid
     * block, etc.
     */
    @SuppressWarnings("deprecation")
	public void neighborChanged(IBlockState state, World worldIn, BlockPos pos, Block blockIn)
    {
        super.neighborChanged(state, worldIn, pos, blockIn);
        this.checkAndDropBlock(worldIn, pos, state);
    }

    public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand)
    {
        this.checkAndDropBlock(worldIn, pos, state);
    }

    protected void checkAndDropBlock(World worldIn, BlockPos pos, IBlockState state)
    {
        if (!this.canBlockStay(worldIn, pos, state))
        {
            this.dropBlockAsItem(worldIn, pos, state, 0);
            worldIn.setBlockState(pos, Blocks.AIR.getDefaultState(), 3);
        }
    }

    public boolean canBlockStay(World worldIn, BlockPos pos, IBlockState state)
    {
        if (state.getBlock() == this) //Forge: This function is called during world gen and placement, before this block is set, so if we are not 'here' then assume it's the pre-check.
        {
            IBlockState soil = worldIn.getBlockState(pos.down());
            return soil.getBlock().canSustainPlant(soil, worldIn, pos.down(), net.minecraft.util.EnumFacing.UP, this);
        }
        return this.canSustainBush(worldIn.getBlockState(pos.down()));
    }

    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos)
    {
        return BUSH_AABB;
    }

    @Nullable
    public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, World worldIn, BlockPos pos)
    {
        return NULL_AABB;
    }

    /**
     * Used to determine ambient occlusion and culling when rebuilding chunks for render
     */
    public boolean isOpaqueCube(IBlockState state)
    {
        return false;
    }

    public boolean isFullCube(IBlockState state)
    {
        return false;
    }

    @Override
    public net.minecraftforge.common.EnumPlantType getPlantType(net.minecraft.world.IBlockAccess world, BlockPos pos)
    {
        if (this == MBlocksClass.RPGrass)          return net.minecraftforge.common.EnumPlantType.Plains;
        /**if (this == MBlocks.CARROTS)        return net.minecraftforge.common.EnumPlantType.Crop;
        if (this == MBlocks.POTATOES)       return net.minecraftforge.common.EnumPlantType.Crop;
        if (this == MBlocks.MELON_STEM)     return net.minecraftforge.common.EnumPlantType.Crop;
        if (this == MBlocks.PUMPKIN_STEM)   return net.minecraftforge.common.EnumPlantType.Crop;
        if (this == MBlocks.DEADBUSH)       return net.minecraftforge.common.EnumPlantType.Desert;
        if (this == MBlocks.WATERLILY)      return net.minecraftforge.common.EnumPlantType.Water;
        if (this == MBlocks.RED_MUSHROOM)   return net.minecraftforge.common.EnumPlantType.Cave;
        if (this == MBlocks.BROWN_MUSHROOM) return net.minecraftforge.common.EnumPlantType.Cave;
        if (this == MBlocks.NETHER_WART)    return net.minecraftforge.common.EnumPlantType.Nether;
        if (this == MBlocks.SAPLING)        return net.minecraftforge.common.EnumPlantType.Plains;
        if (this == MBlocks.TALLGRASS)      return net.minecraftforge.common.EnumPlantType.Plains;
        if (this == MBlocks.DOUBLE_PLANT)   return net.minecraftforge.common.EnumPlantType.Plains;
        if (this == MBlocks.RED_FLOWER)     return net.minecraftforge.common.EnumPlantType.Plains;
        if (this == MBlocks.YELLOW_FLOWER)  return net.minecraftforge.common.EnumPlantType.Plains;*/
        return net.minecraftforge.common.EnumPlantType.Plains;
    }

    @Override
    public IBlockState getPlant(net.minecraft.world.IBlockAccess world, BlockPos pos)
    {
        IBlockState state = world.getBlockState(pos);
        if (state.getBlock() != this) return getDefaultState();
        return state;
    }

    @SideOnly(Side.CLIENT)
    public BlockRenderLayer getBlockLayer()
    {
        return BlockRenderLayer.CUTOUT;
    }
}