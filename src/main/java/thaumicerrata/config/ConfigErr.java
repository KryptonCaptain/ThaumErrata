package thaumicerrata.config;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.common.config.Configuration;

public class ConfigErr {
	
	public static int potionTaintWithdrawlID;
	
	public static boolean wrathGoG;
	public static boolean wrathThermal;
	
	public static boolean enchRunicDungeon;

	
	static Configuration config;

	public static void loadConfig(FMLPreInitializationEvent event) {
		config = new Configuration(event.getSuggestedConfigurationFile());
		config.load();
		
		//potionTaintWithdrawlID = config.get("Potion", "Taint Withdrawl", 32).getInt();
		
		wrathGoG = config.get("Wrath Cage", "Allow spawning Grimoire of Gaia mobs", true).getBoolean(true);
		wrathThermal = config.get("Wrath Cage", "Allow spawning Thermal Foundation mobs", true).getBoolean(true);
		
		enchRunicDungeon = config.get("General", "Enable Infusion Enchantment for Runic Dungeons", true).getBoolean(true);

		
		
		config.save();
	}
	
	

}
