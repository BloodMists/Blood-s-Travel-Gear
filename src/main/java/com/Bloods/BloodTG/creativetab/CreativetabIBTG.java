package com.Bloods.BloodTG.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.Bloods.BloodTG.init.BTGItemsLoader;
import com.Bloods.BloodTG.reference.Reference;

public class CreativetabIBTG
{
	public static final CreativeTabs BTG_Items = new CreativeTabs("tab.bloodtg:IBTG") 
	{
		@Override
		public Item getTabIconItem()
		{
			return BTGItemsLoader.bracer;
		}
		
	};
}
