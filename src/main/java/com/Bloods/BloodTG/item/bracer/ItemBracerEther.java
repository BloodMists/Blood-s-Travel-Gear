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

public class ItemBracerEther extends ItemBTG
{
	public static String[] subEther = {"bracerEther", "bracerEtherT2", "bracerEtherT3", "bracerEtherT4", "bracerObsEtLi"};
	IIcon[] icons = new IIcon[subEther.length];
	
	public ItemBracerEther()
	{
		super();
		this.setHasSubtypes(true);
		this.setType("bracer");
	}
	
	@Override
	public void registerIcons(IIconRegister icon)
	{
		for (int i=0; i<icons.length; i++)
			this.icons[i] = icon.registerIcon(Reference.Mod_ID.toLowerCase() + ":" + subEther[i]);
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
		for(int i=0;i<subEther.length;i++)
			list.add(new ItemStack(this,1,i));
	}

	@Override
	public String getUnlocalizedName(ItemStack stack)
	{
		return this.getUnlocalizedName()+"."+subEther[stack.getItemDamage()];
	}

	@Override
	public void onTravelGearTick(EntityPlayer player, ItemStack stack)
	{//effects all bracers
		if (stack.getItemDamage() != 0)
		{//effects all but T1 bracer
			//Teleport. How via enderpearl?, something similar?
		}
		if (stack.getItemDamage() == 2)
		{//effect T3 bracer only
			//reduce fall damage
			if (player.fallDistance > 0.0F)
				player.fallDistance -= 0.66F;
		}
		if (stack.getItemDamage() == 3)
		{//effects T4 bracer only
			player.fallDistance = 0;
		}
		if (stack.getItemDamage() == 4)
		{//effects ObsEtLi bracer only
			player.addPotionEffect(new PotionEffect(Potion.resistance.getId(), 10, 1));
			player.addPotionEffect(new PotionEffect(Potion.regeneration.getId(), 10, 0));
		}
		player.addPotionEffect(new PotionEffect(Potion.invisibility.getId(), 10, 0));
	}
}

/* T1
 * Gives Player invisibility
 * Crafts from bracer, invisibility potion(8min x2), Imbued Quartz(x2), Ether Shard(x4) in Infusion table
 * Temp Crafts from ^^^ in crafting table
 * Crafts with Ender Bracer, Imbued Quartz in Infusion table to T2 Ether bracer
 * Temp Crafts with ^^^ in crafting table
 * 
 * T2
 * Gives player invisibility, allows enderman-like teleporting
 * Crafts from Ender Bracer, T1 Ether Bracer, Imbued Quartz in Infusion table
 * Temp Crafts from ^^^ in crafting table
 * 
 * Crafts with Wind Bracer, Obsidian Bracer, Ether Shard(x2), Imbued Quartz(x4) in Infusion table T3 Ether Bracer
 * Temp crafts with ^^^ in crafting table
 * 
 * Crafts with Obsidian Bracer, T3 Life Bracer, Withered Diamond(x2), Imbued Quartz(x4) in Infusion Table over Lava in Nether to make ObsEtLi Bracer
 * Temp Crafts with ^^^ in crafting table
 * 
 * T3
 * Negates most fall damage, Allows Enderman-like teleporting, gives player invisiblity
 * Crafts from T2 Ether Bracer, Wind Bracer, Obsidian Bracer, Ether Shard(x2), Imbued Quartz(x4) in Infusion table
 * Temp Crafts from ^^^ in crafting table
 * 
 * Crafts with Obsidian Bracer(x2), Quartz(x4), Withered Diamond(x2) in Infusion table to T4 Ether Bracer
 * Temp Crafts with ^^^ in Crafting Table
 * 
 * T4
 * Negates all fall damage, Allows Enderman-like teleporting, gives player invisiblity, gives player resistance 2
 * Crafts from T3 Ether Bracer, Obsidian Bracer(x2), Imbued Quartz(x4), Withered Diamond(x2) in Infusion table
 * Temp Crafts from ^^^ in crafting table
 * 
 * ObsEtLi
 * Allows Enderman-like teleport, makes player invisible, gives player resistance 2, gives player regen
 * Crafts from Obsidian Bracer, T2 Ether Bracer, T3 Life Bracer, Withered Diamond(x2), Imbued Quartz(x4) in Infusion Table over Lava in Nether
 * Temp crafts from ^^^ in crafting table
 */