package com.Bloods.BloodTG.block;

import java.util.Random;

import com.Bloods.BloodTG.init.BTGBlocksLoader;
import com.Bloods.BloodTG.reference.Reference;

import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

public class BlockStoneLife extends BlockBTG
{
	public BlockStoneLife()
	{
		super();
		this.setUnlocalName("stoneLife");
		this.setHardness(1.5F);
		this.setResistance(30F);
		this.setHarvestLevel("pickaxe", 1);
		//this.getCanBlockGrass();
	}

	@Override
	public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
    {
        return Item.getItemFromBlock(BTGBlocksLoader.cobbleLife);
    }
}
//Is stone, /can grow grass/, drops cobbleLife, is crafted from stone(x4), grass(x4), Bone Dust
//used in some crafting recipes