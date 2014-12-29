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

public class ItemShoulder extends ItemBTG
{
	public static String[] shoulder = {"shoulder", "shoulderIron"};
	IIcon[] icons = new IIcon[shoulder.length];

	public ItemShoulder()
	{
		super();
		this.setHasSubtypes(true);
		this.setMaxStackSize(8);
	}

	@Override
	public void registerIcons(IIconRegister icon)
	{
		for (int i=0; i<icons.length; i++)
			this.icons[i] = icon.registerIcon(Reference.Mod_ID.toLowerCase() + ":" + shoulder[i]);
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
		for(int i=0;i<shoulder.length;i++)
			list.add(new ItemStack(this,1,i));
	}

	@Override
	public String getUnlocalizedName(ItemStack stack)
	{
		return this.getUnlocalizedName()+"."+shoulder[stack.getItemDamage()];
	}

}

/* Shoulder
 * Basic shoulder, found in dungeon chests, used in crafting T1 shoulders and above
 * 
 * Iron Shoulder
 * Crafts from Iron block, fire charge(x4), hammer in crafting table used in Mid Tier shoulder crafting recipes
 */