package com.Bloods.BloodTG.block.wGenBlock;

import java.util.Random;

import net.minecraft.item.Item;

import com.Bloods.BloodTG.block.BlockBTG;
import com.Bloods.BloodTG.init.BTGItemsLoader;

public class BlockOreFire extends BlockBTG
{
	public BlockOreFire()
	{
		super();
		this.setUnlocalName("oreFire");
		this.setHardness(2.0F);
		this.setResistance(15F);
		this.setHarvestLevel("pickaxe", 3);
		this.setStepSound(soundTypeMetal);
	}

/*	@Override
	public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
	{
		return ModItemsLoader.components;//drops Firestone Shards
	}
*/
}
