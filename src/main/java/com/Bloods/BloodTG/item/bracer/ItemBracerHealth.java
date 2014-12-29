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

public class ItemBracerHealth extends ItemBTG
{
	public static String[] subHealth = { "bracerHealth", "bracerHealthT2", "bracerHealthT3", "bracerObsH"};
	IIcon[] icons = new IIcon[subHealth.length];
	
	public ItemBracerHealth()
	{
		super();
		this.setHasSubtypes(true);
		this.setType("bracer");
	}

	@Override
	public void registerIcons(IIconRegister icon)
	{
		for (int i=0; i<icons.length; i++)
			this.icons[i] = icon.registerIcon(Reference.Mod_ID.toLowerCase() + ":" + subHealth[i]);
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
		for(int i=0;i<subHealth.length;i++)
			list.add(new ItemStack(this,1,i));
	}

	@Override
	public String getUnlocalizedName(ItemStack stack)
	{
		return this.getUnlocalizedName()+"."+subHealth[stack.getItemDamage()];
	}

	@Override
	public void onTravelGearTick(EntityPlayer player, ItemStack stack)
	{//effects all bracers
		if (stack.getItemDamage() == 0)
		{//effects T1 bracer only
			//gives 2 extra hearts
		}
		if (stack.getItemDamage() == 1)
		{//effect T2 bracer only
			//gives 4 extra hearts
		}
		if (stack.getItemDamage() == 2)
		{//effects T3 bracer only
			//gives 8 extra hearts
		}
		if (stack.getItemDamage() == 3)
		{//effects ObsH bracer only
			//gives 10 extra hearts
			player.addPotionEffect(new PotionEffect(Potion.resistance.getId(), 10, 1));
		}
	}
}

/* T1
 * Gives player 2 additional hearts
 * Crafts from bracer, instant health potion, Imbued Quartz(x2), Ether Shard(x4) in Infusion table
 * Temp Crafts from ^^^ in crafting table
 * Crafts with bracer, instant health potion(x2), Imbued Quartz(x2), Diamond Block, Fern(x4) in Infusion table to T2 Health Bracer
 * 
 * T2
 * Gives player 4 additional hearts
 * Crafts from bracer, instant health potion(x2), Imbued Quartz(x2), Diamond Block, Fern(x4) in Infusion table
 * Temp Crafts from ^^^ in crafting table
 * Crafts with Obsidian bracer, instant health II potion(x2), Imbued Quartz(x2), Fern(x2), Spruce Leave(x2) in Infusion table to T3 Health Bracer
 * Temp Crafts with ^^^ in crafting table
 * 
 * T3
 * Gives player 8 additional hearts
 * Crafts from Obsidian bracer, instant health II potion(x2), Imbued Quartz(x2), Fern(x2), Spruce Leave(x2) in Infusion table
 * Temp Crafts from ^^^ in crafting table
 * Crafts with Obsidian bracer(x2), instant health potion, Imbued Quartz(x2), Withered Diamond, Spruce Leave(x4)  
 * in Infusion table in spruce forest to T4 Health Bracer(bracerObsH)
 * 
 * ObsH
 * Gives player 10 additional hearts, gives player resistance II
 * Crafts from T3 Healthe Brace, Obsidian bracer(x2), instant health potion, Imbued Quartz(x2), Withered Diamond, Spruce Leave(x4) in Infusion table in spruce forest
 * Temp Crafts from ^^^ in crafting table
 */