package bloods.common.BloodTG;

import bloods.common.BloodTG.handler.configHandler;
import bloods.common.BloodTG.init.BTGBlocksLoader;
import bloods.common.BloodTG.init.BTGItemsLoader;
import bloods.common.BloodTG.proxy.IProxy;
import bloods.common.BloodTG.reference.Reference;
import bloods.common.BloodTG.utility.logHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.Mod_ID, name = Reference.Mod_Name, version = Reference.Version, guiFactory = Reference.Gui_Factory)
public class BloodTG {
	
	@Mod.Instance(Reference.Mod_ID)
	public static BloodTG instance;
	
	@SidedProxy( clientSide = Reference.Client_Proxy, serverSide = Reference.Server_Proxy)
	public static IProxy proxy;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		configHandler.init(event.getSuggestedConfigurationFile());
		FMLCommonHandler.instance().bus().register(new configHandler());
		logHelper.info("Pre Init Complete.");
		
		BTGItemsLoader.init();
		BTGBlocksLoader.init();
	}
	@Mod.EventHandler
	public void init(FMLInitializationEvent event)
	{
		
	}
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}
}
