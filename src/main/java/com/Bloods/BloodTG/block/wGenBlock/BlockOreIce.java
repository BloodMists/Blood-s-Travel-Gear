package com.Bloods.BloodTG.block.wGenBlock;

import com.Bloods.BloodTG.block.BlockBTG;
import com.Bloods.BloodTG.reference.Reference;

public class BlockOreIce extends BlockBTG
{
	public BlockOreIce()
	{
		super();
		this.setUnlocalName("oreIce");
		this.setHardness(4.0F);
		this.setResistance(15F);
		this.setHarvestLevel("pickaxe", 3);
		this.setStepSound(soundTypePiston);
	}
}
/* Ore, world gen, biome specific, ice biome, smelt in Imbuing furnace with ice to get Packed Ice
 * Extreme rarity:Rarer than Lapis ore
 * 
 */