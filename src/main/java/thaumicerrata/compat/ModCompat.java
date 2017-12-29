package thaumicerrata.compat;

import java.util.HashMap;

import thaumcraft.api.ThaumcraftApi;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;
import thaumicerrata.config.ConfigErr;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.registry.GameRegistry;
import fox.spiteful.forbidden.DarkAspects;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Optional;
import mrcomputerghost.runicdungeons.ench.EnchantHandler;

/*
@Optional.InterfaceList({
	@Optional.Interface(modid = "ForbiddenMagic", iface = "fox.spiteful.forbidden.Config"),
	@Optional.Interface(modid = "ForbiddenMagic", iface = "fox.spiteful.forbidden.DarkAspects")
	})
*/

public class ModCompat {
	
	//public static Item FMsubCollar;
	
	public static Boolean ForbiddenMagic;
	public static Boolean BloodMagic;
	public static Boolean Botania;
	
	public static Boolean Automagy;
	
	public static Boolean TwilightForest;
	public static Boolean GoG;
	public static Boolean RunicDungeon;
	public static Boolean ThermalFoundation;
	
	
	public static Enchantment poisonThorns = null;
	public static Enchantment knockbackThorns = null;
	public static Enchantment fireThorns = null;
	public static Enchantment magicResist = null;
	
	
	
	public static void init() {
		
		//FMsubCollar = GameRegistry.findItem("ForbiddenMagic", "SubCollar");
		ForbiddenMagic = Loader.isModLoaded("ForbiddenMagic");
		BloodMagic = Loader.isModLoaded("AWWayofTime");
		Botania = Loader.isModLoaded("Botania");
		
		Automagy = Loader.isModLoaded("Automagy");
		
		TwilightForest = Loader.isModLoaded("TwilightForest");
		GoG = Loader.isModLoaded("GrimoireOfGaia");
		RunicDungeon = Loader.isModLoaded("runicdungeons");
		ThermalFoundation = Loader.isModLoaded("ThermalFoundation");
		
		
		initCompat();
		initAspects();
		
	}
	
	
	public static void initCompat() {
		if (ForbiddenMagic) {
			FMCompat();
		}
		if (RunicDungeon && ConfigErr.enchRunicDungeon) {
			RDCompat();
		}
		
	}
	
	public static void initAspects() { //do it later...
		//ThaumcraftApi.registerObjectTag(new ItemStack(ConfigItems.itemSwordCrimson, 1, 32767), new AspectList().add(Aspect.METAL, 4));
		//ThaumcraftApi.registerEntityTag("Thaumcraft.EldritchWarden", new AspectList().add(Aspect.ELDRITCH, 8));
		
		//might do this in another class
		
	}
	
	public static void FMCompat() {
		
		//addWrathSpawn("", Aspect);
		//addWrathSpawn("", DarkAspects.NETHER);
		if (GoG && ConfigErr.wrathGoG) {
			//addWrathSpawn("GrimoireOfGaia.", Aspect.BEAST);
			addWrathSpawn("GrimoireOfGaia.Anubis",DarkAspects.PRIDE);
			addWrathSpawn("GrimoireOfGaia.Banshee",Aspect.SOUL);
			addWrathSpawn("GrimoireOfGaia.Baphomet",DarkAspects.NETHER);
			addWrathSpawn("GrimoireOfGaia.Bone Knight",Aspect.UNDEAD);
			addWrathSpawn("GrimoireOfGaia.Centaur",Aspect.BEAST);
			addWrathSpawn("GrimoireOfGaia.Cobble Golem",Aspect.EARTH);
			addWrathSpawn("GrimoireOfGaia.Cobblestone Golem",Aspect.EARTH);
			addWrathSpawn("GrimoireOfGaia.Cockatrice",Aspect.FLIGHT);
			addWrathSpawn("GrimoireOfGaia.Creep",Aspect.FIRE);
			addWrathSpawn("GrimoireOfGaia.Cyclops",Aspect.MAN);
			addWrathSpawn("GrimoireOfGaia.Dhampir",Aspect.SOUL); 
			addWrathSpawn("GrimoireOfGaia.Dryad",Aspect.PLANT);
			addWrathSpawn("GrimoireOfGaia.Dullahan",Aspect.SOUL);
			addWrathSpawn("GrimoireOfGaia.Ender Dragon Girl",Aspect.ELDRITCH);
			addWrathSpawn("GrimoireOfGaia.Ender Eye",Aspect.ELDRITCH);
			addWrathSpawn("GrimoireOfGaia.Flesh Lich",Aspect.FLESH);
			addWrathSpawn("GrimoireOfGaia.FutakuchiOnna",Aspect.HUNGER); 
			addWrathSpawn("GrimoireOfGaia.Gryphon",Aspect.BEAST);
			addWrathSpawn("GrimoireOfGaia.Harpy",Aspect.FLIGHT);
			addWrathSpawn("GrimoireOfGaia.Hunter",Aspect.WEAPON);
			addWrathSpawn("GrimoireOfGaia.Jorogumo",Aspect.BEAST); 
			addWrathSpawn("GrimoireOfGaia.Mermaid",Aspect.WATER);
			addWrathSpawn("GrimoireOfGaia.Mimic",Aspect.HUNGER);
			addWrathSpawn("GrimoireOfGaia.Minotaur",DarkAspects.PRIDE);
			addWrathSpawn("GrimoireOfGaia.Minotaurus",Aspect.BEAST);
			addWrathSpawn("GrimoireOfGaia.Naga",Aspect.WATER);
			addWrathSpawn("GrimoireOfGaia.NineTails",Aspect.FIRE);
			addWrathSpawn("GrimoireOfGaia.Sahuagin",Aspect.BEAST);
			addWrathSpawn("GrimoireOfGaia.Satyr",Aspect.BEAST);
			addWrathSpawn("GrimoireOfGaia.Selkie",Aspect.COLD);
			addWrathSpawn("GrimoireOfGaia.Shaman",Aspect.MAGIC);
			addWrathSpawn("GrimoireOfGaia.Sharko",Aspect.BEAST);
			addWrathSpawn("GrimoireOfGaia.Siren",Aspect.WATER);
			addWrathSpawn("GrimoireOfGaia.Sludge Girl",Aspect.SLIME);
			addWrathSpawn("GrimoireOfGaia.Sphinx",DarkAspects.PRIDE);
			addWrathSpawn("GrimoireOfGaia.Spriggan",Aspect.TREE);
			if(!fox.spiteful.forbidden.Config.noLust)
				addWrathSpawn("GrimoireOfGaia.Succubus",DarkAspects.LUST);
			else
				addWrathSpawn("GrimoireOfGaia.Succubus",DarkAspects.NETHER);
			addWrathSpawn("GrimoireOfGaia.Swamper",Aspect.PLANT);
			addWrathSpawn("GrimoireOfGaia.Valkyrie",DarkAspects.PRIDE);
			addWrathSpawn("GrimoireOfGaia.Vampire",DarkAspects.PRIDE);
			addWrathSpawn("GrimoireOfGaia.Werecat",Aspect.BEAST);
			addWrathSpawn("GrimoireOfGaia.Witch",Aspect.MAGIC);
			addWrathSpawn("GrimoireOfGaia.Wither Cow",DarkAspects.NETHER);
			addWrathSpawn("GrimoireOfGaia.Yeti",Aspect.COLD);
			addWrathSpawn("GrimoireOfGaia.Yuki-Onna",Aspect.COLD); 
			addWrathSpawn("GrimoireOfGaia.Kobold",Aspect.BEAST);
			addWrathSpawn("GrimoireOfGaia.Creeper Girl",Aspect.GREED);
			addWrathSpawn("GrimoireOfGaia.Trader",Aspect.GREED);
			addWrathSpawn("GrimoireOfGaia.Slime Girl",Aspect.GREED);
			addWrathSpawn("GrimoireOfGaia.Ender Girl",Aspect.GREED);
			addWrathSpawn("GrimoireOfGaia.Holstaurus",Aspect.GREED);
			addWrathSpawn("GrimoireOfGaia.Mandragora",Aspect.PLANT);
			addWrathSpawn("GrimoireOfGaia.Butler",Aspect.MAN);
			
		}
		
		if (ThermalFoundation && ConfigErr.wrathThermal) {
			addWrathSpawn("Blizz", Aspect.COLD);
			addWrathSpawn("Blitz", Aspect.AIR);
			addWrathSpawn("Basalz", Aspect.EARTH);
		}
		
		if (Automagy) {
			addWrathSpawn("Automagy.WispNether", Aspect.AURA);
		}

		
	}
	
	public static void addWrathSpawn(String ent, Aspect aspect) {
		fox.spiteful.forbidden.Config.spawnerMobs.put(ent, aspect);
	}
	
	private static void RDCompat() {
		if (EnchantHandler.enableFireThorns) {
			fireThorns = EnchantHandler.fireThorns;
		}
		if (EnchantHandler.enableKnockbackThorns) {
			knockbackThorns = EnchantHandler.knockbackThorns;
		}
		if (EnchantHandler.enablePoisonThorns) {
			poisonThorns = EnchantHandler.poisonThorns;
		}
		if (EnchantHandler.enableMagicResist) {
			magicResist = EnchantHandler.magicResist;
		}
		
	}
	
	
	
    public static Item getItem(String mod, String item) throws ItemNotFoundException {
        Item target = GameRegistry.findItem(mod, item);
        if(target == null)
            throw new ItemNotFoundException(mod, item);
        return target;
    }

    public static class ItemNotFoundException extends Exception {
        public ItemNotFoundException(String mod, String item){
            super("Unable to find item '" + item + "' in mod '" + mod + "'! Are you using the correct version of the mod?");
        }
    }
    
}
