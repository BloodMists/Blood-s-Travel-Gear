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

public class ItemBracerIce extends ItemBTG
{
	public static String[] subIce = {"bracerIce", "bracerIceT2", "bracerIceT3", "bracerIceT4"};
	IIcon[] icons = new IIcon[subIce.length];
	
	public ItemBracerIce()
	{
		super();
		this.setHasSubtypes(true);
		this.setType("bracer");
	}

	@Override
	public void registerIcons(IIconRegister icon)
	{
		for (int i=0; i<icons.length; i++)
			this.icons[i] = icon.registerIcon(Reference.Mod_ID.toLowerCase() + ":" + subIce[i]);
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
		for(int i=0;i<subIce.length;i++)
			list.add(new ItemStack(this,1,i));
	}

	@Override
	public String getUnlocalizedName(ItemStack stack)
	{
		return this.getUnlocalizedName()+"."+subIce[stack.getItemDamage()];
	}

	@Override
	public void onTravelGearTick(EntityPlayer player, ItemStack stack)
	{//effects all bracers
		if (stack.getItemDamage() == 0)
		{//effects T1 bracer only
			//gives mobs slowness I if w/in 5 blocks
		}
		if (stack.getItemDamage() == 1)
		{//effect T2 bracer only
			//gives mobs slowness II if w/in 5 blocks
		}
		if (stack.getItemDamage() == 2)
		{//effects T3 bracer only
			//gives mobs Slowness III if w/in 5 blocks
		}
		if (stack.getItemDamage() == 3)
		{//effects T4 bracer only
			//gives mobs slowness IV if w/in 10 blocks
			player.addPotionEffect(new PotionEffect(Potion.resistance.getId(), 10, 1));
		}
	}
}
/* T1
 * Inflicts Slowness 1 on hostile mobs in a 5 block radius from player
 * Crafts from Bracer, Ice(x4), Imbued Quartz(x2), SnowBlock(x2) in Infusion Table on ice
 * Temp Crafts from ^^^ in crafting table
 * Crafts with Ice(x4), Imbued Quartz(x2), SnowBlock(x2) in Infusion Table in ice biome to T2 Ice Bracer
 * Temp Crafts with ^^^ in crafting table
 * 
 * T2
 * Inflicts Slowness 2 on hostile mobs in a 5 block radius from player
 * Crafts from Ice Bracer, Ice(x4), Imbued Quartz(x2), SnowBlock(x2) in Infusion Table in ice biome
 * Temp Crafts from ^^^ in crafting table
 * Crafts with Packed Ice(x4), Imbued Quartz(x2), SnowBlock(x2) in Infusion Table in ice biome to T3 Ice Bracer
 * Temp Crafts with ^^^ in crafting table
 * 
 * T3
 * Inflicts Slowness 3 on hostile mobs in a 5 block radius from player
 * Crafts from T2 Ice Bracer, Packed Ice(x4), Imbued Quartz(x2), SnowBlock(x2) in Infusion Table in ice biome
 * Temp Crafts from ^^^ in crafting table
 * Crafts with Packed Ice(x4), Withered Diamond(x2), Obsidian Bracer(x2)  in Infusion Table in ice biome on ice to T4 Ice Bracer
 * Temp Crafts with ^^^ in crafting table
 * 
 * T4
 * Inflicts Slowness 4 on hostile mobs in a 5 block radius from player, gives player resistance II
 * Crafts from T3 Ice Bracer, Packed Ice(x4), Withered Diamond(x2), Obsidian Bracer(x2) in Infusion Table in ice biome on ice\
 * Temp Crafts from ^^^ in crafting table
 */