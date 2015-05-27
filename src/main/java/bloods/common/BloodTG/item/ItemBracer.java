package bloods.common.BloodTG.item;

import java.util.List;

import bloods.common.BloodTG.reference.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

public class ItemBracer extends ItemBTG
{
	public static String[] bracer = {"bracer", "bracerObsid"};
	IIcon[] icons = new IIcon[bracer.length];

	public ItemBracer()
	{
		super();
		this.setHasSubtypes(true);
		this.setMaxStackSize(8);
	}

	@Override
	public void registerIcons(IIconRegister icon)
	{
		for (int i=0; i<icons.length; i++)
			this.icons[i] = icon.registerIcon(Reference.Mod_ID.toLowerCase() + ":" + bracer[i]);
	}

	@Override
	public IIcon getIconFromDamage(int meta)
	{
		if(meta>=0 && meta<icons.length)
			return this.icons[meta];
		return icons[0];
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void getSubItems(Item item, CreativeTabs tab, List list)
	{
		for(int i=0;i<bracer.length;i++)
			list.add(new ItemStack(this,1,i));
	}

	@Override
	public String getUnlocalizedName(ItemStack stack)
	{
		return this.getUnlocalizedName()+"."+bracer[stack.getItemDamage()];
	}
}

/* Bracer
 * Can not be crafted, Found in dungeon chests
 * Used in all T1 crafting recipes and additionally in higher tiers
 * 
 * Obsidian Bracer(Obsid)
 * Used in many crafting recipes
 * Crafts from Obsidian Leather(x4), Fire Shard(x2), Pure Shard in Infusion Table
 * Temp Crafts from ^^^(coal(x2)) in crafting table
 * 
 */