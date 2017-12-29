package thaumicerrata.config;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import thaumcraft.api.ThaumcraftApi;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.api.crafting.InfusionEnchantmentRecipe;
import thaumcraft.api.research.ResearchCategories;
import thaumcraft.api.research.ResearchItem;
import thaumcraft.api.research.ResearchPage;
import thaumcraft.common.config.ConfigItems;
import thaumicerrata.compat.ModCompat;
import thaumicerrata.libs.FakeResearchItem;

public class ConfigResearchErr {
	
	
	public static void init() {
		
		
		ResearchCategories.registerCategory(
	    		  "ERRATA", 
	    		  new ResourceLocation("thaumcraft","textures/items/resonator.png"), 
	    		  new ResourceLocation("thaumcraft","textures/gui/gui_researchback.png")
	      );
		
		
		/*
		ConfigResearch.recipes.put("InfEnch7", ThaumcraftApi.addInfusionEnchantmentRecipe("INFUSIONENCHANTMENT", 
			Enchantment.thorns, 2, 
			new AspectList().add(Aspect.MAGIC, 4).add(Aspect.WEAPON, 8).add(Aspect.PLANT, 8), 
			new ItemStack[] { 
				new ItemStack(Blocks.deadbush), 
				new ItemStack(Items.quartz), 
				new ItemStack(ConfigItems.itemResource, 1, 14) }));
				
		ConfigResearch.recipes.put("InfEnch2", ThaumcraftApi.addInfusionEnchantmentRecipe("INFUSIONENCHANTMENT", 
			Enchantment.blastProtection, 1, 
			new AspectList().add(Aspect.MAGIC, 4).add(Aspect.ARMOR, 4).add(Aspect.ENTROPY, 4), 
			new ItemStack[] { 
				new ItemStack(Items.iron_ingot), 
				new ItemStack(Items.gunpowder), 
				new ItemStack(ConfigItems.itemResource, 1, 14) }));
		*/
		
		new FakeResearchItem("ER.INFUSIONENCHANTMENT", "ERRATA", "INFUSIONENCHANTMENT", "ARTIFICE", 0, 0, ResearchCategories.getResearch("INFUSIONENCHANTMENT").icon_resource).registerResearchItem();
		
		if (ConfigErr.enchRunicDungeon) {
			
			if (ModCompat.fireThorns != null) {
				InfusionEnchantmentRecipe fireThorns = ThaumcraftApi.addInfusionEnchantmentRecipe("ER.RUNIC.FIRE",
						   ModCompat.fireThorns, 3, 
						   (new AspectList()).add(Aspect.MAGIC, 4).add(Aspect.WEAPON, 8).add(Aspect.FIRE, 8), 
						   new ItemStack[]{
					   			new ItemStack(Blocks.deadbush),
					   			new ItemStack(Items.blaze_rod),
					   			new ItemStack(ConfigItems.itemResource, 1, 14)
					   			});
				 
				 new ResearchItem("ER.RUNIC.FIRE", "ERRATA", 
						  (new AspectList()).add(Aspect.FIRE, 4).add(Aspect.WEAPON, 4).add(Aspect.MAGIC, 4),
						  2, -1, 1, 
						  new ResourceLocation("thaum_errata","textures/research/iconFlameThorn.png"))
						  .setPages(new ResearchPage[]{
								  new ResearchPage("tc.research_page.ER.RUNIC.FIRE"),
								  new ResearchPage(fireThorns),
								  })
						  .setParents("ER.INFUSIONENCHANTMENT")
						  .setConcealed()
						  .setSecondary()
						  .registerResearchItem();
			}
			
			if (ModCompat.poisonThorns != null) {
				InfusionEnchantmentRecipe poisonThorns = ThaumcraftApi.addInfusionEnchantmentRecipe("ER.RUNIC.FIRE",
						   ModCompat.poisonThorns, 3, 
						   (new AspectList()).add(Aspect.MAGIC, 4).add(Aspect.WEAPON, 8).add(Aspect.POISON, 8), 
						   new ItemStack[]{
					   			new ItemStack(Blocks.deadbush),
					   			new ItemStack(Items.spider_eye),
					   			new ItemStack(ConfigItems.itemResource, 1, 14)
					   			});
				 
				 new ResearchItem("ER.RUNIC.POISON", "ERRATA", 
						  (new AspectList()).add(Aspect.POISON, 4).add(Aspect.WEAPON, 4).add(Aspect.MAGIC, 4),
						  2, 0, 1, 
						  new ResourceLocation("thaum_errata","textures/research/iconPoisonThorn.png"))
						  .setPages(new ResearchPage[]{
								  new ResearchPage("tc.research_page.ER.RUNIC.POISON"),
								  new ResearchPage(poisonThorns),
								  })
						  .setParents("ER.INFUSIONENCHANTMENT")
						  .setConcealed()
						  .setSecondary()
						  .registerResearchItem();
			}
			
			if (ModCompat.knockbackThorns != null) {
				InfusionEnchantmentRecipe knockbackThorns = ThaumcraftApi.addInfusionEnchantmentRecipe("ER.RUNIC.FIRE",
						   ModCompat.knockbackThorns, 3, 
						   (new AspectList()).add(Aspect.MAGIC, 4).add(Aspect.WEAPON, 8).add(Aspect.MOTION, 8), 
						   new ItemStack[]{
					   			new ItemStack(Blocks.deadbush),
					   			new ItemStack(Blocks.piston),
					   			new ItemStack(ConfigItems.itemResource, 1, 14)
					   			});
				 
				 new ResearchItem("ER.RUNIC.KNOCKBACK", "ERRATA", 
						  (new AspectList()).add(Aspect.MOTION, 4).add(Aspect.WEAPON, 4).add(Aspect.MAGIC, 4),
						  2, 1, 1, 
						  new ResourceLocation("thaum_errata","textures/research/iconBlastThorn.png"))
						  .setPages(new ResearchPage[]{
								  new ResearchPage("tc.research_page.ER.RUNIC.KNOCKBACK"),
								  new ResearchPage(knockbackThorns),
								  })
						  .setParents("ER.INFUSIONENCHANTMENT")
						  .setConcealed()
						  .setSecondary()
						  .registerResearchItem();
			}
			
			if (ModCompat.magicResist != null) {
				InfusionEnchantmentRecipe magicResist = ThaumcraftApi.addInfusionEnchantmentRecipe("ER.RUNIC.FIRE",
						   ModCompat.magicResist, 3, 
						   (new AspectList()).add(Aspect.MAGIC, 8).add(Aspect.ARMOR, 8), 
						   new ItemStack[]{
					   			new ItemStack(ConfigItems.itemResource, 1, 7),
					   			new ItemStack(Items.iron_ingot),
					   			new ItemStack(ConfigItems.itemResource, 1, 14)
					   			});
				 
				 new ResearchItem("ER.RUNIC.MAGIC", "ERRATA", 
						  (new AspectList()).add(Aspect.MOTION, 4).add(Aspect.MAGIC, 4),
						  2, 2, 1, 
						  new ResourceLocation("thaum_errata","textures/research/iconMagicResist.png"))
						  .setPages(new ResearchPage[]{
								  new ResearchPage("tc.research_page.ER.RUNIC.MAGIC"),
								  new ResearchPage(magicResist),
								  })
						  .setParents("ER.INFUSIONENCHANTMENT")
						  .setConcealed()
						  .setSecondary()
						  .registerResearchItem();
			}
				
			
		}
		
		 /*
		 */
	}
	
}
