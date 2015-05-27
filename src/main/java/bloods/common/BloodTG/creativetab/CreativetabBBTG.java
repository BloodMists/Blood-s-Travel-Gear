package bloods.common.BloodTG.creativetab;

import bloods.common.BloodTG.init.BTGBlocksLoader;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativetabBBTG
{
	public static final CreativeTabs BTG_Blocks = new CreativeTabs("tab.bloodtg:BBTG") 
	{
		@Override
		public Item getTabIconItem()
		{
			return Item.getItemFromBlock(BTGBlocksLoader.oreEther);
		}
		
	};
}
