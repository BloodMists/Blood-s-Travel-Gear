package com.Bloods.BloodTG.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import com.Bloods.BloodTG.init.ModItemsLoader;
import com.Bloods.BloodTG.reference.Reference;

public class CreativetabBBTG
{
	public static final CreativeTabs BTG_Blocks = new CreativeTabs("tab.bloodtg:BBTG") 
	{
		@Override
		public Item getTabIconItem()
		{
			return ModItemsLoader.witheredDiamond;
		}
		
	};
}
