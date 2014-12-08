package com.Bloods.BloodTG.init;

import com.Bloods.BloodTG.item.ItemBTG;

import com.Bloods.BloodTG.item.ItemBoneDust;
import com.Bloods.BloodTG.item.ItemBracer;
import com.Bloods.BloodTG.item.ItemEtherShard;
import com.Bloods.BloodTG.item.ItemImbuedQuartz;
import com.Bloods.BloodTG.item.ItemObsLeather;
import com.Bloods.BloodTG.item.ItemWitheredDia;

import com.Bloods.BloodTG.item.bracer.ItemBracerEnder;
import com.Bloods.BloodTG.item.bracer.ItemBracerEther;
import com.Bloods.BloodTG.item.bracer.ItemBracerHealth;
import com.Bloods.BloodTG.item.bracer.ItemBracerIce;
import com.Bloods.BloodTG.item.bracer.ItemBracerLife;
import com.Bloods.BloodTG.item.bracer.ItemBracerExtra;

import cpw.mods.fml.common.registry.GameRegistry;
import com.Bloods.BloodTG.reference.Reference;

@GameRegistry.ObjectHolder(Reference.Mod_ID)

public class ModItemsLoader
{
	//General Items
	public static final ItemBTG dustBone = new ItemBoneDust();
	public static final ItemBTG etherShard = new ItemEtherShard();
	public static final ItemBTG imbuedQuartz = new ItemImbuedQuartz();
	public static final ItemBTG obsLeather = new ItemObsLeather();
	public static final ItemBTG witheredDiamond = new ItemWitheredDia();
	//T0
	public static final ItemBTG bracer = new ItemBracer();
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
		GameRegistry.registerItem(dustBone, "dustBone");
		GameRegistry.registerItem(etherShard, "etherShard");
		GameRegistry.registerItem(imbuedQuartz, "imbuedQuartz");
		GameRegistry.registerItem(obsLeather, "obsLeather");
		GameRegistry.registerItem(witheredDiamond, "witheredDiamond");
		
		//T0 items found in dungeon chests, used for crafting only
		GameRegistry.registerItem(bracer, "bracer");
		
		//Bracers
		GameRegistry.registerItem(bracerEnder, "bracerEnder");
		GameRegistry.registerItem(bracerEther, "bracerEther");
		GameRegistry.registerItem(bracerExtra, "bracerExtra");
		GameRegistry.registerItem(bracerHealth, "bracerHealth");
		GameRegistry.registerItem(bracerIce, "bracerIce");
		GameRegistry.registerItem(bracerLife, "bracerLife");
		
	}
}
