package com.Bloods.BloodTG.init;

import com.Bloods.BloodTG.block.BlockBTG;
import com.Bloods.BloodTG.block.BlockOreEther;
import cpw.mods.fml.common.registry.GameRegistry;
import com.Bloods.BloodTG.reference.Reference;

@GameRegistry.ObjectHolder(Reference.Mod_ID)

public class ModBlocksLoader
{
	public static final BlockBTG oreEther = new BlockOreEther();
	
	public static void init()
	{
		GameRegistry.registerBlock(oreEther, "oreEther");
	}
}
