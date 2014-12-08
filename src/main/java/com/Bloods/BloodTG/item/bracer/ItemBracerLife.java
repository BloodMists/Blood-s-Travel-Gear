package com.Bloods.BloodTG.item.bracer;

import java.util.List;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
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

public class ItemBracerLife extends ItemBTG
{
	public static String[] subLife = {"bracerLife", "bracerLifeT2", "bracerLifeT3", "bracerLifeT4"};
	IIcon[] icons = new IIcon[subLife.length];
	
	public ItemBracerLife()
	{
		this.setHasSubtypes(true);
		this.setType("bracer");
	}

	@Override
	public void registerIcons(IIconRegister icon)
	{
		for (int i=0; i<icons.length; i++)
			this.icons[i] = icon.registerIcon(Reference.Mod_ID.toLowerCase() + ":" + subLife[i]);
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
		for(int i=0;i<subLife.length;i++)
			list.add(new ItemStack(this,1,i));
	}

	@Override
	public String getUnlocalizedName(ItemStack stack)
	{
		return this.getUnlocalizedName()+"."+subLife[stack.getItemDamage()];
	}

	@Override
	public void onTravelGearTick(EntityPlayer player, ItemStack stack)
	{//effects all bracers
		if (stack.getItemDamage() == 0)
		{//effects T1 bracer only
			player.addPotionEffect(new PotionEffect(Potion.regeneration.getId(), 10, 0));
		}
		if (stack.getItemDamage() == 1)
		{//effect T2 bracer only
			player.addPotionEffect(new PotionEffect(Potion.regeneration.getId(), 10, 1));
		}
		if (stack.getItemDamage() == 2)
		{//effects T3 bracer only
			player.addPotionEffect(new PotionEffect(Potion.regeneration.getId(), 10, 2));
		}
		if (stack.getItemDamage() == 3)
		{
			player.addPotionEffect(new PotionEffect(Potion.regeneration.getId(), 10, 19));
		}
	}

}

/* T1
 * Gives player regen I
 * Crafts from bracer, regen I potion, Imbued Quartz(x2), player head in Infusion table
 * Temp Crafts from ^^^ in crafting table
 * Crafts with regen I potion(x2), Imbued Quartz(x2) in Infusion table above Diamond Ore in Sunlight to T2 Life Bracer
 * Temp Crafts with ^^^ in crafting table
 * 
 * T2
 * Gives player regen II
 * Crafts from regen I potion(x2), Imbued Quartz(x2) in Infusion table above Diamond Ore in Sunlight
 * Temp Crafts from ^^^ in crafting table
 * Crafts with regen II potion(x2), Imbued Quartz(x4), Withered Diamond(x2) in Infusion table above Diamond Ore in Moonlight to T3 Life Bracer
 * Temp Crafts with ^^^ in crafting table
 * 
 * T3
 * Gives player regen III
 * Crafts from regen II potion(x2), Imbued Quartz(x4), Withered Diamond(x2) in Infusion table above Diamond Ore in Moonlight
 * Temp Crafts from ^^^ in crafting table
 * Crafts with Obsidian Bracer, T2 Ether Bracer, Withered Diamond(x2), Imbued Quartz(x4) in Infusion Table over Lava in Nether to make ObsEtLi Bracer
 * Temp Crafts with ^^^ in crafting table
 * 
 * T4
 * Give player regen XX
 * Can not be crafted
 */