package com.Bloods.BloodTG.block;

import com.Bloods.BloodTG.BloodTG;
import com.Bloods.BloodTG.init.ModBlocksLoader;
import com.Bloods.BloodTG.reference.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;

import net.minecraft.init.Blocks;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class BlockInfusion extends BlockBTG
{
	@SideOnly(Side.CLIENT)
    private static IIcon infusionTop, infusionFront, infusionSide;

	public BlockInfusion()
	{
		super(Material.wood);
		this.setUnlocalName("infusion_table");
		this.setHardness(2.5F);
		this.setResistance(12.5F);
		this.setHarvestLevel("axe", 0);
	}
	public boolean renderAsNormalBlock()
	{
		return false;
	}

	@Override @SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister reg) 
	{
		infusionTop = reg.registerIcon(this.getTextureName() + "_top");
		infusionFront = reg.registerIcon(this.getTextureName() + "_front");
		infusionSide = reg.registerIcon(this.getTextureName() + "_side");
	}


    @Override @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta)
    {
    	if (side == 0 )
    	{	return ModBlocksLoader.stoneLife.getBlockTextureFromSide(side);}
    	else if (side == 1 )
    	{	return infusionTop;}
    	else if (side == 2 )
    	{	return infusionFront;}
    	return infusionSide;
    }

   /* @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister par1)
    {
        this.blockIcon = par1.registerIcon(this.getTextureName() + "_side");
        this.infusionTop = par1.registerIcon(this.getTextureName() + "_top");
        this.infusionFront = par1.registerIcon(this.getTextureName() + "_front");
    }*/



	/*@Override
	 public boolean onBlockActivated(World p_149727_1_, int p_149727_2_, int p_149727_3_, int p_149727_4_, EntityPlayer p_149727_5_, int p_149727_6_, float p_149727_7_, float p_149727_8_, float p_149727_9_)
	 {
		if (p_149727_1_.isRemote)
		{
			return true;
		}
		else
		{
			p_149727_5_.displayGUIWorkbench(p_149727_2_, p_149727_3_, p_149727_4_);
			return true;
		}
	 }*/

}
