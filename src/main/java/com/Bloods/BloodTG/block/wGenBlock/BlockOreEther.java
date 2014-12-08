package com.Bloods.BloodTG.block.wGenBlock;

import java.util.Random;

import net.minecraft.item.Item;

import com.Bloods.BloodTG.block.BlockBTG;
import com.Bloods.BloodTG.init.ModBlocksLoader;
import com.Bloods.BloodTG.init.ModItemsLoader;
import com.Bloods.BloodTG.reference.Reference;

public class BlockOreEther extends BlockBTG
{
	public BlockOreEther()
	{
		super();
		this.setUnlocalName("oreEther");
		this.setHardness(4.0F);
		this.setResistance(15F);
		this.setHarvestLevel("pickaxe", 2);
		this.setLightLevel(3F);
		this.setStepSound(soundTypePiston);
	}
	
	@Override
	public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
	{
		return ModItemsLoader.etherShard;
	}

	public int quantityDropped(Random p_149745_1_)
	{
		return 1 + p_149745_1_.nextInt(5);

	}
	
}
/* Ore, world gen, gives 1-5 ether shards w/o fortune, 
 * has alt liquid form, bucket of ether is 5 shards when crystallized
 */