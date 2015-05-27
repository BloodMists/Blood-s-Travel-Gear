package bloods.common.BloodTG.block;

public class BlockCobbleLife extends BlockBTG
{
	public BlockCobbleLife()
	{
		super();
		this.setUnlocalName("cobbleLife");
		this.setHardness(2.0F);
		this.setResistance(30F);
		this.setHarvestLevel("pickaxe", 1);
		//this.getCanBlockGrass();
	}
}
/* Is cobblestone, /can grow grass/, drops from stoneLife
 * is used in some crafting recipes, /can be used in cobblestone recipes/
 */