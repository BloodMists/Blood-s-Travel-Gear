package com.Bloods.BloodTG.item.bracer;

import java.util.List;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.IIcon;

import com.Bloods.BloodTG.item.ItemBTG;
import com.Bloods.BloodTG.reference.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemBracerExtra extends ItemBTG
{
	public static String[] subObsid = {"bracerWind", "bracerFire"};
	IIcon[] icons = new IIcon[subObsid.length];
	
	public ItemBracerExtra()
	{
		this.setHasSubtypes(true);
		this.setType("bracer");
	}

	@Override
	public void registerIcons(IIconRegister icon)
	{
		for (int i=0; i<icons.length; i++)
			this.icons[i] = icon.registerIcon(Reference.Mod_ID.toLowerCase() + ":" + subObsid[i]);
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
		for(int i=0;i<subObsid.length;i++)
			list.add(new ItemStack(this,1,i));
	}

	@Override
	public String getUnlocalizedName(ItemStack stack)
	{
		return this.getUnlocalizedName()+"."+subObsid[stack.getItemDamage()];
	}

	@Override
	public void onTravelGearTick(EntityPlayer player, ItemStack stack)
	{
		if (stack.getItemDamage() == 1)
		{//effects Wind Bracer only
			//reduce fall damage
		}
		if (stack.getItemDamage() == 2)
		{//effects Fire Bracer only
			player.addPotionEffect(new PotionEffect(Potion.fireResistance.getId(), 10, 0));
		}
	}

}
/* Wind
 * Negates most fall damage
 * Crafts with Ether T2 Bracer to make Ether Bracer T3
 * Crafts from Obsidian Bracer(x2), Air Infused Gold Ingot, Imbued Quartz(x2), Gold Crusted Feather(x4) in Infusion Table @y=200+
 * Temp Crafts from ^^^(gold ingot, feather(x4) in crafting table
 * 
 * Fire
 * Gives player fire resistance
 * Crafts from Obsidian Bracer(x2), Fire Infused Gold Ingot, Imbued Quartz(x2), Blaze Rod(x4) in Infusion table in Nether
 * Temp Crafts from ^^^(gold ingot) in crafting table
 */