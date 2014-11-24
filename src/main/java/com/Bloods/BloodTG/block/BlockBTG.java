package com.Bloods.BloodTG.block;

import com.Bloods.BloodTG.creativetab.CreativetabBBTG;
import com.Bloods.BloodTG.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

public class BlockBTG extends Block
{
	public BlockBTG(Material material)
	{
		super(material);
		this.setCreativeTab(CreativetabBBTG.BTG_Blocks);
	}

	public BlockBTG()
	{
		super(Material.rock);
		this.setCreativeTab(CreativetabBBTG.BTG_Blocks);
	}

	@Override
	public String getUnlocalizedName()
	{
		return String.format("tile.%s%s", Reference.Mod_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister)
	{
		blockIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
	}
	
	protected String getUnwrappedUnlocalizedName(String unlocalizedName)
	{
		return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
	}
}