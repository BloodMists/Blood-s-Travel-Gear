package com.Bloods.BloodTG.block;

public class BlockOreEther extends BlockBTG
{
	public BlockOreEther()
	{
		super();
		this.setBlockName("oreEther");
		this.setBlockTextureName("oreEther");
		this.setHardness(2.1F);
		this.setHarvestLevel("pickaxe", 2);
		this.setResistance(5.0F);
		this.setLightLevel(3F);
		this.setStepSound(soundTypePiston);
	}
}
/* Ore, world gen, gives 1-5 ether shards w/o fortune, 
 * has alt liquid form, bucket of ether is 5 shards when crystallized
 */