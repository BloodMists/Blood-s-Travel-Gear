package bloods.common.BloodTG.creativetab;

import bloods.common.BloodTG.init.BTGItemsLoader;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

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
