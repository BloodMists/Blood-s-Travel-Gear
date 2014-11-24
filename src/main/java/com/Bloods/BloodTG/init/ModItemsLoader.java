package com.Bloods.BloodTG.init;

import com.Bloods.BloodTG.item.ItemBTG;
import com.Bloods.BloodTG.item.ItemBracer;
import com.Bloods.BloodTG.item.ItemEtherShard;
import com.Bloods.BloodTG.item.ItemImbuedQuartz;
import com.Bloods.BloodTG.item.ItemWitheredDia;
import com.Bloods.BloodTG.item.bracerT1.ItemBracerEnder;
import com.Bloods.BloodTG.item.bracerT1.ItemBracerEther;
import com.Bloods.BloodTG.item.bracerT1.ItemBracerHealth;
import com.Bloods.BloodTG.item.bracerT1.ItemBracerIce;
import com.Bloods.BloodTG.item.bracerT1.ItemBracerLife;
import com.Bloods.BloodTG.item.bracerT1.ItemBracerObsid;
import com.Bloods.BloodTG.item.bracerT2.ItemBracerEtherT2;
import com.Bloods.BloodTG.item.bracerT2.ItemBracerHealthT2;
import com.Bloods.BloodTG.item.bracerT2.ItemBracerIceT2;
import com.Bloods.BloodTG.item.bracerT2.ItemBracerLifeT2;
import com.Bloods.BloodTG.item.bracerT2.ItemBracerWind;
import com.Bloods.BloodTG.item.bracerT3.ItemBracerEtherT3;
import com.Bloods.BloodTG.item.bracerT3.ItemBracerHealthT3;
import com.Bloods.BloodTG.item.bracerT3.ItemBracerIceT3;
import com.Bloods.BloodTG.item.bracerT3.ItemBracerLifeT3;
import com.Bloods.BloodTG.item.bracerT4.ItemBracerEtherT4;
import com.Bloods.BloodTG.item.bracerT4.ItemBracerIceT4;
import com.Bloods.BloodTG.item.bracerT4.ItemBracerObsEtLi;
import com.Bloods.BloodTG.item.bracerT4.ItemBracerObsH;
import cpw.mods.fml.common.registry.GameRegistry;
import com.Bloods.BloodTG.reference.Reference;

@GameRegistry.ObjectHolder(Reference.Mod_ID)

public class ModItemsLoader
{
	//External Items
	public static final ItemBTG witheredDiamond = new ItemWitheredDia();
	public static final ItemBTG imbuedQuartz = new ItemImbuedQuartz();
	public static final ItemBTG etherShard = new ItemEtherShard();
	//T0
	public static final ItemBTG bracer = new ItemBracer();
	//T1
	public static final ItemBTG bracerEnder = new ItemBracerEnder();
	public static final ItemBTG bracerEther = new ItemBracerEther();
	public static final ItemBTG bracerHealth = new ItemBracerHealth();
	public static final ItemBTG bracerIce = new ItemBracerIce();
	public static final ItemBTG bracerLife = new ItemBracerLife();
	public static final ItemBTG bracerObsid = new ItemBracerObsid();
	//T2
	public static final ItemBTG bracerEtherT2 = new ItemBracerEtherT2();
	public static final ItemBTG bracerHealthT2 = new ItemBracerHealthT2();
	public static final ItemBTG bracerIceT2 = new ItemBracerIceT2();
	public static final ItemBTG bracerLifeT2 = new ItemBracerLifeT2();
	public static final ItemBTG bracerWind = new ItemBracerWind();
	//T3
	public static final ItemBTG bracerEtherT3 = new ItemBracerEtherT3();
	public static final ItemBTG bracerHealthT3 = new ItemBracerHealthT3();
	public static final ItemBTG bracerIceT3 = new ItemBracerIceT3();
	public static final ItemBTG bracerLifeT3 = new ItemBracerLifeT3();
	//T4
	public static final ItemBTG bracerEtherT4 = new ItemBracerEtherT4();
	public static final ItemBTG bracerIceT4 = new ItemBracerIceT4();
	public static final ItemBTG bracerObsH = new ItemBracerObsH();
	public static final ItemBTG bracerObsEtLi = new ItemBracerObsEtLi();



	public static void init()
	{
		//External Items
		GameRegistry.registerItem(witheredDiamond, "witheredDiamond");
		GameRegistry.registerItem(imbuedQuartz, "imbuedQuartz");
		GameRegistry.registerItem(etherShard, "etherShard");
		//T0 items found in dungeon chests, used for crafting only
		GameRegistry.registerItem(bracer, "bracer");
		//Tier 1 items, upgradable
		GameRegistry.registerItem(bracerEnder, "bracerEnder");
		GameRegistry.registerItem(bracerEther, "bracerEther");
		GameRegistry.registerItem(bracerHealth, "bracerHealth");
		GameRegistry.registerItem(bracerIce, "bracerIce");
		GameRegistry.registerItem(bracerLife, "bracerLife");
		GameRegistry.registerItem(bracerObsid, "bracerObsid");
		//Tier 2 items, upgradable
		GameRegistry.registerItem(bracerEtherT2, "bracerEtherT2");
		GameRegistry.registerItem(bracerHealthT2, "bracerHealthT2");
		GameRegistry.registerItem(bracerIceT2, "bracerIceT2");
		GameRegistry.registerItem(bracerLifeT2, "bracerLifeT2");
		GameRegistry.registerItem(bracerWind, "bracerWind");
		//Tier 3 items, restricted upgrades
		GameRegistry.registerItem(bracerEtherT3, "bracerEtherT3");
		GameRegistry.registerItem(bracerHealthT3, "bracerHealthT3");
		GameRegistry.registerItem(bracerIceT3, "bracerIceT3");
		GameRegistry.registerItem(bracerLifeT3, "bracerLifeT3");
		//Tier 4 items, end game
		GameRegistry.registerItem(bracerEtherT4, "bracerEtherT4");
		GameRegistry.registerItem(bracerIceT4, "bracerIceT4");
		GameRegistry.registerItem(bracerObsEtLi, "bracerObsEtLi");
		GameRegistry.registerItem(bracerObsH, "bracerObsH");
	}
}