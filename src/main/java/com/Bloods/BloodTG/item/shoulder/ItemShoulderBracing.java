package com.Bloods.BloodTG.item.shoulder;

import java.util.List;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

import com.Bloods.BloodTG.item.ItemBTG;
import com.Bloods.BloodTG.reference.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemShoulderBracing extends ItemBTG
{
	private static String[] subBracing = {"shoulderBracing", "shoulderBracingT2" };
	IIcon[] icons = new IIcon[subBracing.length];
	
	public ItemShoulderBracing()
	{
		super();
		this.setHasSubtypes(true);
		this.setType("shoulder");
	}

	@Override
	public void registerIcons(IIconRegister icon)
	{
		for (int i=0; i<icons.length; i++)
			this.icons[i] = icon.registerIcon(Reference.Mod_ID.toLowerCase() + ":" + subBracing[i]);
	}

	@Override
	public IIcon getIconFromDamage(int meta)
	{
		if(meta>=0 && meta<icons.length)
			return this.icons[meta];
		return icons[0];
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void getSubItems(Item item, CreativeTabs tab, List list)
	{
		for(int i=0;i<subBracing.length;i++)
			list.add(new ItemStack(this,1,i));
	}

	@Override
	public String getUnlocalizedName(ItemStack stack)
	{
		return this.getUnlocalizedName()+"."+subBracing[stack.getItemDamage()];
	}

}

/* Resists knockback(10%?)
 * Crafts from ???
 * Crafts with ???
 * temp crafting in crafting table
 * 
 * T2
 * Resists knockback(20%?)
 * Crafts from
 * Crafts with
 * temp crafting in crafting table
 */