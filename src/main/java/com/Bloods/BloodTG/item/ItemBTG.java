package com.Bloods.BloodTG.item;

import travellersgear.api.ITravellersGear;

import baubles.api.BaubleType;
import baubles.api.IBauble;

import com.Bloods.BloodTG.creativetab.CreativetabIBTG;
import com.Bloods.BloodTG.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemBTG extends Item implements ITravellersGear, IBauble
{
	private String type;
	public ItemBTG()
	{
		super();
		this.setMaxStackSize(1);
		this.setCreativeTab(CreativetabIBTG.BTG_Items);
		this.setUnlocalizedName(Reference.Mod_ID.toLowerCase());
	}

	protected void setUnlocalName(String name)
	{
		this.setUnlocalizedName(Reference.Mod_ID.toLowerCase() + "." + name);
		this.setTextureName(Reference.Mod_ID.toLowerCase() + ":" + name);		
	}

	public ItemBTG setType(String type)
	{
		this.type = type;
		return this;
	}

	public String getType(ItemStack type)
	{
		return this.type;
	}

	@Override
	public int getSlot(ItemStack stack)
	{
		if (getType(stack) == "shoulder")
		{
			return 1;//shoulder
		}
		if (getType(stack) == "bracer")
		{
			return 2;//bracer
		}
		if (getType(stack) == "title")
		{
			return 3;//title
		}
		return -1;
	}

	@Override
	public void onTravelGearTick(EntityPlayer player, ItemStack stack) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTravelGearEquip(EntityPlayer player, ItemStack stack) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTravelGearUnequip(EntityPlayer player, ItemStack stack) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public BaubleType getBaubleType(ItemStack itemstack) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void onWornTick(ItemStack itemstack, EntityLivingBase player) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onEquipped(ItemStack itemstack, EntityLivingBase player) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onUnequipped(ItemStack itemstack, EntityLivingBase player) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean canEquip(ItemStack itemstack, EntityLivingBase player) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean canUnequip(ItemStack itemstack, EntityLivingBase player) {
		// TODO Auto-generated method stub
		return false;
	}
}
