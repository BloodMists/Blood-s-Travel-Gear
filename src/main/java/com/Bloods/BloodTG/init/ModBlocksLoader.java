package com.Bloods.BloodTG.init;

import com.Bloods.BloodTG.block.BlockBTG;
import com.Bloods.BloodTG.block.BlockCobbleLife;
import com.Bloods.BloodTG.block.BlockInfusion;
import com.Bloods.BloodTG.block.BlockStoneLife;
import com.Bloods.BloodTG.block.wGenBlock.BlockOreEther;
import com.Bloods.BloodTG.block.wGenBlock.BlockOreIce;

import cpw.mods.fml.common.registry.GameRegistry;
import com.Bloods.BloodTG.reference.Reference;

@GameRegistry.ObjectHolder(Reference.Mod_ID)

public class ModBlocksLoader
{
	public static final BlockBTG oreEther = new BlockOreEther();
	public static final BlockBTG oreIce = new BlockOreIce();
	public static final BlockBTG stoneLife = new BlockStoneLife();
	public static final BlockBTG cobbleLife = new BlockCobbleLife();
	public static final BlockBTG infusion_table = new BlockInfusion();
	
	public static void init()
	{
		GameRegistry.registerBlock(oreEther, "oreEther");
		GameRegistry.registerBlock(oreIce, "oreIce");
		GameRegistry.registerBlock(stoneLife, "stoneLife");
		GameRegistry.registerBlock(cobbleLife, "cobbleLife");
		GameRegistry.registerBlock(infusion_table, "infusionTable");
	}
}
