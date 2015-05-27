package bloods.common.BloodTG.init;

import bloods.common.BloodTG.block.BlockBTG;
import bloods.common.BloodTG.block.BlockCobbleLife;
import bloods.common.BloodTG.block.BlockInfusion;
import bloods.common.BloodTG.block.BlockStoneLife;
import bloods.common.BloodTG.block.wGenBlock.BlockOreEther;
import bloods.common.BloodTG.block.wGenBlock.BlockOreIce;
import bloods.common.BloodTG.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.Mod_ID)

public class BTGBlocksLoader
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
