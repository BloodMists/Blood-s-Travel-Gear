package bloods.common.BloodTG.init;

import bloods.common.BloodTG.item.ItemBTG;
import bloods.common.BloodTG.item.ItemBracer;
import bloods.common.BloodTG.item.ItemComponents;
import bloods.common.BloodTG.item.ItemObsLeather;
import bloods.common.BloodTG.item.ItemShoulder;
import bloods.common.BloodTG.item.bracer.ItemBracerEnder;
import bloods.common.BloodTG.item.bracer.ItemBracerEther;
import bloods.common.BloodTG.item.bracer.ItemBracerExtra;
import bloods.common.BloodTG.item.bracer.ItemBracerHealth;
import bloods.common.BloodTG.item.bracer.ItemBracerIce;
import bloods.common.BloodTG.item.bracer.ItemBracerLife;
import bloods.common.BloodTG.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.Mod_ID)

public class BTGItemsLoader
{
	//General Items
	public static final ItemBTG components = new ItemComponents();
	public static final ItemBTG obsLeather = new ItemObsLeather();
	//T0
	public static final ItemBTG bracer = new ItemBracer();
	public static final ItemBTG shoulder = new ItemShoulder();
	//Bracers
	public static final ItemBTG bracerEnder = new ItemBracerEnder();
	public static final ItemBTG bracerEther = new ItemBracerEther();
	public static final ItemBTG bracerExtra = new ItemBracerExtra();
	public static final ItemBTG bracerHealth = new ItemBracerHealth();
	public static final ItemBTG bracerIce = new ItemBracerIce();
	public static final ItemBTG bracerLife = new ItemBracerLife();



	public static void init()
	{
		//General Items
		GameRegistry.registerItem(components, "components");
		GameRegistry.registerItem(obsLeather, "obsLeather");
		
		//T0 items found in dungeon chests, used for crafting only
		GameRegistry.registerItem(bracer, "bracer");
		GameRegistry.registerItem(shoulder, "shoulder");
		
		//Bracers
		GameRegistry.registerItem(bracerEnder, "bracerEnder");
		GameRegistry.registerItem(bracerEther, "bracerEther");
		GameRegistry.registerItem(bracerExtra, "bracerExtra");
		GameRegistry.registerItem(bracerHealth, "bracerHealth");
		GameRegistry.registerItem(bracerIce, "bracerIce");
		GameRegistry.registerItem(bracerLife, "bracerLife");
		
	}
}
