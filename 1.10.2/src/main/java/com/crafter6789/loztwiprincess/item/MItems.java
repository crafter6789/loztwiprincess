package com.crafter6789.loztwiprincess.item;

import com.crafter6789.loztwiprincess.creativeTabs.MCreativeTabs;
import com.crafter6789.loztwiprincess.lib.RefStrings;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.sound.SoundEvent;
import net.minecraftforge.common.util.EnumHelper;

public class MItems {



	public static void mainRegistry(){
		initializeItem();
		registerItem();
	}
	
	//ToolArmorMaterial
	public static ToolMaterial HyrlToolMaterial = EnumHelper.addToolMaterial("HyrlToolMaterial", 2, 420, 10.0f, 2.5f, 10);
	public static ToolMaterial ShdwToolMaterial = EnumHelper.addToolMaterial("ShdwToolMaterial", 2, 420, 10.0f, 2.5f, 10);
	public static ToolMaterial MasterToolMaterial = EnumHelper.addToolMaterial("MasterToolMaterial", 4, -1, 14.0f, 3.5f, 23);
	public static ToolMaterial NewMasterToolMaterial = EnumHelper.addToolMaterial("NewMasterToolMaterial", 4, -1, 18.0f, 5.5f, 23);
	public static ToolMaterial WoodShieldToolMaterial = EnumHelper.addToolMaterial("WoodShieldToolMaterial", 1, 130, 0.5f, -4.0f, 10);	
	public static ToolMaterial HylianShieldToolMaterial = EnumHelper.addToolMaterial("HylianShieldToolMaterial", 4, -1, 0.5f, -4.0f, 23);	
	
	public static ArmorMaterial HyrlNormArmorMaterial = EnumHelper.addArmorMaterial("HyrlNormArmorMaterial", null, 19, new int[]{3, 5, 4, 3}, 12, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0);
	public static ArmorMaterial HyrlChanArmorMaterial = EnumHelper.addArmorMaterial("HyrlChanArmorMaterial", null, 19, new int[]{3, 5, 4, 3}, 12, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0);
	public static ArmorMaterial ShdwNormArmorMaterial = EnumHelper.addArmorMaterial("ShdwNormArmorMaterial", null, 19, new int[]{3, 5, 4, 3}, 12, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0);
	
	public static ArmorMaterial GoranTunicMaterial = EnumHelper.addArmorMaterial("GoranTunicMaterial", null, -1, new int[]{4, 5, 4, 3}, 16, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0);
	public static ArmorMaterial HeroTunicMaterial = EnumHelper.addArmorMaterial("HeroTunicMaterial", null, -1, new int[]{4, 5, 4, 3}, 16, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0);
	public static ArmorMaterial ZoraTunicMaterial = EnumHelper.addArmorMaterial("ZoraTunicMaterial", null, -1, new int[]{4, 5, 4, 3}, 16, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0);
													//TODO replace first 'null' with something like this maybe?: (RefStrings.MODID + ":textures/model/armor/" + getUnlocalizedName(stack).substring(5, 13))

	//Miscellaneous
	public static Item MasterSword;
	public static Item MasterIngot;
	public static Item NewMasterSword;
	
	public static Item ChuJellyRed;
	public static Item ChuJellyGreen;
	public static Item ChuJellyBlue;
	public static Item ChuJellyYellow;
	public static Item ChuJellyPurple;
	
	public static Item Rupee;

	public static Item RockSteak;
		
	//Ingot
	public static Item ShdwIngot;
	public static Item AgIngot;
	public static Item AgNugget;
	public static Item CoalDust;
	public static Item FeIngot;
	public static Item HyrlIngot;
	public static Item ShdwGem;
	
	//Tools	
	public static Item HyrlPick;
	public static Item HyrlAxe;
	public static Item HyrlSpade;
	public static Item HyrlHoe;
	public static Item HyrlSword;
	
	public static Item ShdwPick;
	public static Item ShdwAxe;
	public static Item ShdwSpade;
	public static Item ShdwHoe;
	public static Item ShdwSword;
	
	
	//Armour	

	public static Item HyrlNormHelm;
	public static Item HyrlNormChest;
	public static Item HyrlNormLegs;
	public static Item HyrlNormBoots;
	
	public static Item HyrlChanHelm;
	public static Item HyrlChanChest;
	public static Item HyrlChanLegs;
	public static Item HyrlChanBoots;
	
	public static Item ShdwNormHelm;
	public static Item ShdwNormChest;
	public static Item ShdwNormLegs;
	public static Item ShdwNormBoots;
	
	public static Item GoranTunicHelm;
	public static Item GoranTunicChest;
	public static Item GoranTunicLegs;
	public static Item GoranTunicBoots;
	
	public static Item HeroTunicHelm;
	public static Item HeroTunicChest;
	public static Item HeroTunicLegs;
	public static Item HeroTunicBoots;
	
	public static Item ZoraTunicHelm;
	public static Item ZoraTunicChest;
	public static Item ZoraTunicLegs;
	public static Item ZoraTunicBoots;
	
	
	public static void initializeItem(){
		//Miscellaneous
		MasterSword = new com.crafter6789.loztwiprincess.item.tools.MasterSword(MasterToolMaterial).setUnlocalizedName("MasterSword").setCreativeTab(MCreativeTabs.tabTool)/*.setTextureName(RefStrings.MODID + ":MasterSword")*/;
		NewMasterSword = new com.crafter6789.loztwiprincess.item.tools.NewMasterSword(NewMasterToolMaterial).setUnlocalizedName("NewMasterSword").setCreativeTab(MCreativeTabs.tabTool)/*.setTextureName(RefStrings.MODID + ":NewMasterSword")*/;
		
		ChuJellyRed = new Item().setUnlocalizedName("ChuJellyRed").setCreativeTab(MCreativeTabs.tabItem)/*.setTextureName(RefStrings.MODID + ":ChuJellyRed")*/;
		ChuJellyGreen = new Item().setUnlocalizedName("ChuJellyGreen").setCreativeTab(MCreativeTabs.tabItem)/*.setTextureName(RefStrings.MODID + ":ChuJellyGreen")*/;
		ChuJellyBlue = new Item().setUnlocalizedName("ChuJellyBlue").setCreativeTab(MCreativeTabs.tabItem)/*.setTextureName(RefStrings.MODID + ":ChuJellyBlue")*/;
		ChuJellyYellow = new Item().setUnlocalizedName("ChuJellyYellow").setCreativeTab(MCreativeTabs.tabItem)/*.setTextureName(RefStrings.MODID + ":ChuJellyYellow")*/;
		ChuJellyPurple = new Item().setUnlocalizedName("ChuJellyPurple").setCreativeTab(MCreativeTabs.tabItem)/*.setTextureName(RefStrings.MODID + ":ChuJellyPurple")*/;
		
		Rupee = new com.crafter6789.loztwiprincess.item.meta.Rupee("Rupee");
		RockSteak = new com.crafter6789.loztwiprincess.item.RockSteak(1, 1, false, "RockSteak");
		
		//Ingot
		ShdwIngot = new Item().setUnlocalizedName("ShdwIngot").setCreativeTab(MCreativeTabs.tabItem)/*.setTextureName(RefStrings.MODID + ":ShdwIngot")*/;
		AgIngot = new Item().setUnlocalizedName("AgIngot").setCreativeTab(MCreativeTabs.tabItem)/*.setTextureName(RefStrings.MODID + ":SilverIngot")*/;
		AgNugget = new Item().setUnlocalizedName("AgNugget").setCreativeTab(MCreativeTabs.tabItem)/*.setTextureName(RefStrings.MODID + ":SilverNugget")*/;
		CoalDust = new Item().setUnlocalizedName("CoalDust").setCreativeTab(MCreativeTabs.tabItem)/*.setTextureName(RefStrings.MODID + ":CoalDust")*/;
		FeIngot = new Item().setUnlocalizedName("FeIngot").setCreativeTab(MCreativeTabs.tabItem)/*.setTextureName(RefStrings.MODID + ":FeIngot")*/;
		HyrlIngot = new Item().setUnlocalizedName("HyrlIngot").setCreativeTab(MCreativeTabs.tabItem)/*.setTextureName(RefStrings.MODID + ":HyrlIngot")*/;
		ShdwGem = new Item().setUnlocalizedName("ShdwGem").setCreativeTab(MCreativeTabs.tabItem)/*.setTextureName(RefStrings.MODID + ":ShdwGem")*/;
		MasterIngot = new Item().setUnlocalizedName("MasterIngot").setCreativeTab(MCreativeTabs.tabItem)/*.setTextureName(RefStrings.MODID + ":MasterIngot")*/;

		//Tools
		HyrlPick = new com.crafter6789.loztwiprincess.item.tools.HyrlPick(HyrlToolMaterial).setUnlocalizedName("HyrlPick").setCreativeTab(MCreativeTabs.tabTool)/*.setTextureName(RefStrings.MODID + ":HyrlPick")*/;
		HyrlAxe = new com.crafter6789.loztwiprincess.item.tools.HyrlAxe(HyrlToolMaterial).setUnlocalizedName("HyrlAxe").setCreativeTab(MCreativeTabs.tabTool)/*.setTextureName(RefStrings.MODID + ":HyrlAxe")*/;
		HyrlSpade = new com.crafter6789.loztwiprincess.item.tools.HyrlSpade(HyrlToolMaterial).setUnlocalizedName("HyrlSpade").setCreativeTab(MCreativeTabs.tabTool)/*.setTextureName(RefStrings.MODID + ":HyrlSpade")*/;
		HyrlHoe = new com.crafter6789.loztwiprincess.item.tools.HyrlHoe(HyrlToolMaterial).setUnlocalizedName("HyrlHoe").setCreativeTab(MCreativeTabs.tabTool)/*.setTextureName(RefStrings.MODID + ":HyrlHoe")*/;
		HyrlSword = new com.crafter6789.loztwiprincess.item.tools.HyrlSword(HyrlToolMaterial).setUnlocalizedName("HyrlSword").setCreativeTab(MCreativeTabs.tabTool)/*.setTextureName(RefStrings.MODID + ":HyrlSword")*/;
		
		ShdwPick = new com.crafter6789.loztwiprincess.item.tools.ShdwPick(ShdwToolMaterial).setUnlocalizedName("ShdwPick").setCreativeTab(MCreativeTabs.tabTool)/*.setTextureName(RefStrings.MODID + ":ShdwPick")*/;
		ShdwAxe = new com.crafter6789.loztwiprincess.item.tools.ShdwAxe(ShdwToolMaterial).setUnlocalizedName("ShdwAxe").setCreativeTab(MCreativeTabs.tabTool)/*.setTextureName(RefStrings.MODID + ":ShdwAxe")*/;
		ShdwSpade = new com.crafter6789.loztwiprincess.item.tools.ShdwSpade(ShdwToolMaterial).setUnlocalizedName("ShdwSpade").setCreativeTab(MCreativeTabs.tabTool)/*.setTextureName(RefStrings.MODID + ":ShdwSpade")*/;
		ShdwHoe = new com.crafter6789.loztwiprincess.item.tools.ShdwHoe(ShdwToolMaterial).setUnlocalizedName("ShdwHoe").setCreativeTab(MCreativeTabs.tabTool)/*.setTextureName(RefStrings.MODID + ":ShdwHoe")*/;
		ShdwSword = new com.crafter6789.loztwiprincess.item.tools.ShdwSword(ShdwToolMaterial).setUnlocalizedName("ShdwSword").setCreativeTab(MCreativeTabs.tabTool)/*.setTextureName(RefStrings.MODID + ":ShdwSword")*/;
		
		//Armour
		
		HyrlNormHelm = new com.crafter6789.loztwiprincess.item.MArmor("HyrlNormHelm", HyrlNormArmorMaterial, "HyrlNormHelm", EntityEquipmentSlot.HEAD);
		HyrlNormChest = new com.crafter6789.loztwiprincess.item.MArmor("HyrlNormChest", HyrlNormArmorMaterial, "HyrlNormChest", EntityEquipmentSlot.CHEST);
		HyrlNormLegs = new com.crafter6789.loztwiprincess.item.MArmor("HyrlNormLegs", HyrlNormArmorMaterial, "HyrlNormLegs", EntityEquipmentSlot.LEGS);
		HyrlNormBoots = new com.crafter6789.loztwiprincess.item.MArmor("HyrlNormBoots", HyrlNormArmorMaterial, "HyrlNormBoots", EntityEquipmentSlot.FEET);	
		
		HyrlChanHelm = new com.crafter6789.loztwiprincess.item.MArmor("HyrlChanHelm", HyrlChanArmorMaterial, "HyrlChanHelm", EntityEquipmentSlot.HEAD);
		HyrlChanChest = new com.crafter6789.loztwiprincess.item.MArmor("HyrlChanChest", HyrlChanArmorMaterial, "HyrlChanChest", EntityEquipmentSlot.CHEST);
		HyrlChanLegs = new com.crafter6789.loztwiprincess.item.MArmor("HyrlChanLegs", HyrlChanArmorMaterial, "HyrlChanLegs", EntityEquipmentSlot.LEGS);
		HyrlChanBoots = new com.crafter6789.loztwiprincess.item.MArmor("HyrlChanBoots", HyrlChanArmorMaterial, "HyrlChanBoots", EntityEquipmentSlot.FEET);
		

		ShdwNormHelm = new com.crafter6789.loztwiprincess.item.MArmor("ShdwNormHelm", ShdwNormArmorMaterial, "ShdwNormHelm", EntityEquipmentSlot.HEAD);
		ShdwNormChest = new com.crafter6789.loztwiprincess.item.MArmor("ShdwNormChest", ShdwNormArmorMaterial, "ShdwNormChest", EntityEquipmentSlot.CHEST);
		ShdwNormLegs = new com.crafter6789.loztwiprincess.item.MArmor("ShdwNormLegs", ShdwNormArmorMaterial, "ShdwNormLegs", EntityEquipmentSlot.LEGS);
		ShdwNormBoots = new com.crafter6789.loztwiprincess.item.MArmor("ShdwNormBoots", ShdwNormArmorMaterial, "ShdwNormBoots", EntityEquipmentSlot.FEET);

		
		GoranTunicHelm = new com.crafter6789.loztwiprincess.item.MArmor("GoranTunicHelm", GoranTunicMaterial, "GoranTunicHelm", EntityEquipmentSlot.HEAD);
		GoranTunicChest = new com.crafter6789.loztwiprincess.item.MArmor("GoranTunicChest", GoranTunicMaterial, "GoranTunicChest", EntityEquipmentSlot.CHEST);
		GoranTunicLegs = new com.crafter6789.loztwiprincess.item.MArmor("GoranTunicLegs", GoranTunicMaterial, "GoranTunicLegs", EntityEquipmentSlot.LEGS);
		GoranTunicBoots = new com.crafter6789.loztwiprincess.item.MArmor("GoranTunicBoots", GoranTunicMaterial, "GoranTunicBoots", EntityEquipmentSlot.FEET);

		
		HeroTunicHelm = new com.crafter6789.loztwiprincess.item.MArmor("HeroTunicHelm", HeroTunicMaterial, "HeroTunicHelm", EntityEquipmentSlot.HEAD);
		HeroTunicChest = new com.crafter6789.loztwiprincess.item.MArmor("HeroTunicChest", HeroTunicMaterial, "HeroTunicChest", EntityEquipmentSlot.CHEST);
		HeroTunicLegs = new com.crafter6789.loztwiprincess.item.MArmor("HeroTunicLegs", HeroTunicMaterial, "HeroTunicLegs", EntityEquipmentSlot.LEGS);
		HeroTunicBoots = new com.crafter6789.loztwiprincess.item.MArmor("HeroTunicBoots", HeroTunicMaterial, "HeroTunicBoots", EntityEquipmentSlot.FEET);

		
		ZoraTunicHelm = new com.crafter6789.loztwiprincess.item.MArmor("ZoraTunicHelm", ZoraTunicMaterial, "ZoraTunicHelm", EntityEquipmentSlot.HEAD);
		ZoraTunicChest = new com.crafter6789.loztwiprincess.item.MArmor("ZoraTunicChest", ZoraTunicMaterial, "ZoraTunicChest", EntityEquipmentSlot.CHEST);
		ZoraTunicLegs = new com.crafter6789.loztwiprincess.item.MArmor("ZoraTunicLegs", ZoraTunicMaterial, "ZoraTunicLegs", EntityEquipmentSlot.LEGS);
		ZoraTunicBoots = new com.crafter6789.loztwiprincess.item.MArmor("ZoraTunicBoots", ZoraTunicMaterial, "ZoraTunicBoots", EntityEquipmentSlot.FEET);
		
		
	}

	public static void registerItem(){
		
		//TODO GameRegistry.register(itemName[, resourceLocation]);
		//Miscellaneous
		GameRegistry.register(ChuJellyRed);
		GameRegistry.register(ChuJellyGreen);
		GameRegistry.register(ChuJellyBlue);
		GameRegistry.register(ChuJellyYellow);
		GameRegistry.register(ChuJellyPurple);

		GameRegistry.register(Rupee);
		GameRegistry.register(RockSteak);
		
		GameRegistry.register(MasterIngot);
		GameRegistry.register(MasterSword);
		GameRegistry.register(NewMasterSword);
		
		//Ingot
		GameRegistry.register(ShdwIngot);
		GameRegistry.register(AgIngot);
		GameRegistry.register(AgNugget);
		GameRegistry.register(CoalDust);
		GameRegistry.register(FeIngot);
		GameRegistry.register(HyrlIngot);
		GameRegistry.register(ShdwGem);
		
		//Tools
		GameRegistry.register(HyrlPick);
		GameRegistry.register(HyrlAxe);
		GameRegistry.register(HyrlSpade);
		GameRegistry.register(HyrlHoe);
		GameRegistry.register(HyrlSword);
		
		GameRegistry.register(ShdwPick);
		GameRegistry.register(ShdwAxe);
		GameRegistry.register(ShdwSpade);
		GameRegistry.register(ShdwHoe);
		GameRegistry.register(ShdwSword);
		
		//Armour
		
		GameRegistry.register(HyrlNormHelm);
		GameRegistry.register(HyrlNormChest);
		GameRegistry.register(HyrlNormLegs);
		GameRegistry.register(HyrlNormBoots);	
		
		GameRegistry.register(HyrlChanHelm);
		GameRegistry.register(HyrlChanChest);
		GameRegistry.register(HyrlChanLegs);
		GameRegistry.register(HyrlChanBoots);

		GameRegistry.register(ShdwNormHelm);
		GameRegistry.register(ShdwNormChest);
		GameRegistry.register(ShdwNormLegs);
		GameRegistry.register(ShdwNormBoots);

		GameRegistry.register(GoranTunicHelm);
		GameRegistry.register(GoranTunicChest);
		GameRegistry.register(GoranTunicLegs);
		GameRegistry.register(GoranTunicBoots);

		GameRegistry.register(HeroTunicHelm);
		GameRegistry.register(HeroTunicChest);
		GameRegistry.register(HeroTunicLegs);
		GameRegistry.register(HeroTunicBoots);

		GameRegistry.register(ZoraTunicHelm);
		GameRegistry.register(ZoraTunicChest);
		GameRegistry.register(ZoraTunicLegs);
		GameRegistry.register(ZoraTunicBoots);
		
		
		
	}
	
}
