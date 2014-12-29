package com.Bloods.BloodTG.item;

import java.util.List;

import com.Bloods.BloodTG.reference.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

public class ItemComponents extends ItemBTG
{
	public static String[] subItems = {"etherShard", "dustBone", "fireShard", "imbuedQuartz", "witheredDiamond"};
	IIcon[] icons = new IIcon[subItems.length];
	
	public ItemComponents()
	{
		super();
		this.setHasSubtypes(true);
		this.setMaxStackSize(64);
	}

	@Override
	public void registerIcons(IIconRegister icon)
	{
		for (int i=0; i<icons.length; i++)
			this.icons[i] = icon.registerIcon(Reference.Mod_ID.toLowerCase() + ":" + subItems[i]);
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
		for(int i=0;i<subItems.length;i++)
			list.add(new ItemStack(this,1,i));
	}

	@Override
	public String getUnlocalizedName(ItemStack stack)
	{
		return this.getUnlocalizedName()+"."+subItems[stack.getItemDamage()];
	}

}

/* Ether shards
 * drops from ore, can get from liquid ether in crystalizer, used in many crafting recipes, has storage block
 * 
 * Bone dust(dustBone)
 * crafts from bonemeal, used in crafting recipes, other uses ???
 * 
 * Imbued Quartz
 * Crafts from quartz(x4), water bucket, lava bucket, Gold Crusted Feather, Ether Imbued Stone in Imbuing Furnace
 * Temp crafts from quartz, water bucket, lava bucket, feather, Life Stone in crafting table
 * Used in many crafting recipes
 * 
 * Withered Diamond
 * Crafts from nether star, diamond(x2) (crafts 2), used in most/all high level crafting recipes
 * ?|While held, grants immunity to wither effect|?
 */