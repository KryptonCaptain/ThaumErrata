package thaumicerrata;

import thaumicerrata.compat.ModCompat;
import thaumicerrata.config.ConfigErr;
import thaumicerrata.config.ConfigResearchErr;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

	
@Mod(
		modid = "tErrata", 
		name = "Thaumic Errata", 
		version = "${version}",
		dependencies = "required-after:Thaumcraft@[4.2.3.5,);after:ForbiddenMagic;after:Botania;after:AWWayofTime;after:Automagy;after:TwilightForest;after:GrimoireOfGaia;after:runicdungeons;"
	)

public class Errata {
	
    @Mod.Instance("tErrata")
    public static Errata instance;
    
    /*
    @SidedProxy(
    	      clientSide = "thaumicreliquary.proxy.ClientProxy",
    	      serverSide = "thaumicreliquary.proxy.ServerProxy"
    	   )
   	public static ServerProxy proxy;
    */
    
    @Mod.EventHandler
    public void preInit(final FMLPreInitializationEvent event) {
    	//config
    	ConfigErr.loadConfig(event);
    	
        
    }
    
    @Mod.EventHandler
    public void init(final FMLInitializationEvent event) {
    	//event init?
    	        
    }
    
    @Mod.EventHandler
    public void postInit(final FMLPostInitializationEvent event) {
    	ModCompat.init();
    	
    	//recipes
    	//research
    	if (ModCompat.RunicDungeon) //pointless without it right now
    		ConfigResearchErr.init();
    	//aspects

    	
    }
	

}
