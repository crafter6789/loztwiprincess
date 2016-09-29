package com.crafter6789.loztwiprincess.item;

import java.util.HashMap;
import java.util.Map;

import com.crafter6789.loztwiprincess.item.meta.Rupee;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class MItems {

	public static Map<String, Item> ITEMS = new HashMap<String, Item>();

	public static void mainRegistry(){
		initializeItems();
		registerItems();
		renderItems();
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

	public static void initializeItems(){
	
	//Miscellaneous
	//new MItem("itemName");
	
	new MItem("MasterSword");
	new MItem("MasterIngot");
	new MItem("NewMasterSword");
	
	new MItem("ChuJellyRed");
	new MItem("ChuJellyGreen");
	new MItem("ChuJellyBlue");
	new MItem("ChuJellyYellow");
	new MItem("ChuJellyPurple");
	
	new Rupee("Rupee");

	new RockSteak(1, 1, false, "RockSteak");
		
	//Ingot
	new MItem("ShdwIngot");
	new MItem("AgIngot");
	new MItem("AgNugget");
	new MItem("CoalDust");
	new MItem("FeIngot");
	new MItem("HyrlIngot");
	new MItem("ShdwGem");
	
	//Tools	
	new MItem("HyrlPick");
	new MItem("HyrlAxe");
	new MItem("HyrlSpade");
	new MItem("HyrlHoe");
	new MItem("HyrlSword");
	
	new MItem("ShdwPick");
	new MItem("ShdwAxe");
	new MItem("ShdwSpade");
	new MItem("ShdwHoe");
	new MItem("ShdwSword");
	
	
	//Armour	

	new MItem("HyrlNormHelm"/*, material, textureName, EntityEquipmentSlot.HEAD*/);
	new MItem("HyrlNormChest");
	new MItem("HyrlNormLegs");
	new MItem("HyrlNormBoots");
	
	new MItem("HyrlChanHelm");
	new MItem("HyrlChanChest");
	new MItem("HyrlChanLegs");
	new MItem("HyrlChanBoots");
	
	new MItem("ShdwNormHelm");
	new MItem("ShdwNormChest");
	new MItem("ShdwNormLegs");
	new MItem("ShdwNormBoots");
	
	new MItem("GoranTunicHelm");
	new MItem("GoranTunicChest");
	new MItem("GoranTunicLegs");
	new MItem("GoranTunicBoots");
	
	new MItem("HeroTunicHelm");
	new MItem("HeroTunicChest");
	new MItem("HeroTunicLegs");
	new MItem("HeroTunicBoots");
	
	new MItem("ZoraTunicHelm");
	new MItem("ZoraTunicChest");
	new MItem("ZoraTunicLegs");
	new MItem("ZoraTunicBoots");
	
	}
	
	
	//public static void initializeItem(){
		/**
		
		//Miscellaneous
		MasterSword = new com.crafter6789.loztwiprincess.item.tools.MasterSword(MasterToolMaterial).setUnlocalizedName("MasterSword").setCreativeTab(MCreativeTabs.tabTool).setRegistryName("MasterSword")/*.setTextureName(RefStrings.MODID + ":MasterSword");
		NewMasterSword = new com.crafter6789.loztwiprincess.item.tools.NewMasterSword(NewMasterToolMaterial).setUnlocalizedName("NewMasterSword").setCreativeTab(MCreativeTabs.tabTool).setRegistryName("NewMasterSword")/*.setTextureName(RefStrings.MODID + ":NewMasterSword");
		
		ChuJellyRed = new Item().setRegistryName("ChuJellyRed").setUnlocalizedName("ChuJellyRed").setCreativeTab(MCreativeTabs.tabItem)/*.setTextureName(RefStrings.MODID + ":ChuJellyRed");
		ChuJellyGreen = new Item().setRegistryName("ChuJellyGreen").setUnlocalizedName("ChuJellyGreen").setCreativeTab(MCreativeTabs.tabItem)/*.setTextureName(RefStrings.MODID + ":ChuJellyGreen");
		ChuJellyBlue = new Item().setRegistryName("ChuJellyBlue").setUnlocalizedName("ChuJellyBlue").setCreativeTab(MCreativeTabs.tabItem)/*.setTextureName(RefStrings.MODID + ":ChuJellyBlue");
		ChuJellyYellow = new Item().setRegistryName("ChuJellyYellow").setUnlocalizedName("ChuJellyYellow").setCreativeTab(MCreativeTabs.tabItem)/*.setTextureName(RefStrings.MODID + ":ChuJellyYellow");
		ChuJellyPurple = new Item().setRegistryName("ChuJellyPurple").setUnlocalizedName("ChuJellyPurple").setCreativeTab(MCreativeTabs.tabItem)/*.setTextureName(RefStrings.MODID + ":ChuJellyPurple");
		
		Rupee = new com.crafter6789.loztwiprincess.item.meta.Rupee("Rupee").setRegistryName("Rupee");
		RockSteak = new com.crafter6789.loztwiprincess.item.RockSteak(1, 1, false, "RockSteak").setRegistryName("RockSteak");
		
		//Ingot
		ShdwIngot = new Item().setRegistryName("ShdwIngot").setUnlocalizedName("ShdwIngot").setCreativeTab(MCreativeTabs.tabItem)/*.setTextureName(RefStrings.MODID + ":ShdwIngot");
		AgIngot = new Item().setRegistryName("AgIngot").setUnlocalizedName("AgIngot").setCreativeTab(MCreativeTabs.tabItem)/*.setTextureName(RefStrings.MODID + ":SilverIngot");
		AgNugget = new Item().setRegistryName("AgNugget").setUnlocalizedName("AgNugget").setCreativeTab(MCreativeTabs.tabItem)/*.setTextureName(RefStrings.MODID + ":SilverNugget");
		CoalDust = new Item().setRegistryName("CoalDust").setUnlocalizedName("CoalDust").setCreativeTab(MCreativeTabs.tabItem)/*.setTextureName(RefStrings.MODID + ":CoalDust");
		FeIngot = new Item().setRegistryName("FeIngot").setUnlocalizedName("FeIngot").setCreativeTab(MCreativeTabs.tabItem)/*.setTextureName(RefStrings.MODID + ":FeIngot");
		HyrlIngot = new Item().setRegistryName("HyrlIngot").setUnlocalizedName("HyrlIngot").setCreativeTab(MCreativeTabs.tabItem)/*.setTextureName(RefStrings.MODID + ":HyrlIngot");
		ShdwGem = new Item().setRegistryName("ShdwGem").setUnlocalizedName("ShdwGem").setCreativeTab(MCreativeTabs.tabItem)/*.setTextureName(RefStrings.MODID + ":ShdwGem");
		MasterIngot = new Item().setRegistryName("MasterIngot").setUnlocalizedName("MasterIngot").setCreativeTab(MCreativeTabs.tabItem)/*.setTextureName(RefStrings.MODID + ":MasterIngot");

		//Tools
		HyrlPick = new com.crafter6789.loztwiprincess.item.tools.HyrlPick(HyrlToolMaterial).setRegistryName("HyrlPick").setUnlocalizedName("HyrlPick").setCreativeTab(MCreativeTabs.tabTool)/*.setTextureName(RefStrings.MODID + ":HyrlPick");
		HyrlAxe = new com.crafter6789.loztwiprincess.item.tools.HyrlAxe(HyrlToolMaterial).setRegistryName("HyrlAxe").setUnlocalizedName("HyrlAxe").setCreativeTab(MCreativeTabs.tabTool)/*.setTextureName(RefStrings.MODID + ":HyrlAxe");
		HyrlSpade = new com.crafter6789.loztwiprincess.item.tools.HyrlSpade(HyrlToolMaterial).setRegistryName("HyrlSpade").setUnlocalizedName("HyrlSpade").setCreativeTab(MCreativeTabs.tabTool)/*.setTextureName(RefStrings.MODID + ":HyrlSpade");
		HyrlHoe = new com.crafter6789.loztwiprincess.item.tools.HyrlHoe(HyrlToolMaterial).setRegistryName("HyrlHoe").setUnlocalizedName("HyrlHoe").setCreativeTab(MCreativeTabs.tabTool)/*.setTextureName(RefStrings.MODID + ":HyrlHoe");
		HyrlSword = new com.crafter6789.loztwiprincess.item.tools.HyrlSword(HyrlToolMaterial).setRegistryName("HyrlSword").setUnlocalizedName("HyrlSword").setCreativeTab(MCreativeTabs.tabTool)/*.setTextureName(RefStrings.MODID + ":HyrlSword");
		
		ShdwPick = new com.crafter6789.loztwiprincess.item.tools.ShdwPick(ShdwToolMaterial).setRegistryName("ShdwPick").setUnlocalizedName("ShdwPick").setCreativeTab(MCreativeTabs.tabTool)/*.setTextureName(RefStrings.MODID + ":ShdwPick");
		ShdwAxe = new com.crafter6789.loztwiprincess.item.tools.ShdwAxe(ShdwToolMaterial).setRegistryName("ShdwAxe").setUnlocalizedName("ShdwAxe").setCreativeTab(MCreativeTabs.tabTool)/*.setTextureName(RefStrings.MODID + ":ShdwAxe");
		ShdwSpade = new com.crafter6789.loztwiprincess.item.tools.ShdwSpade(ShdwToolMaterial).setRegistryName("ShdwSpade").setUnlocalizedName("ShdwSpade").setCreativeTab(MCreativeTabs.tabTool)/*.setTextureName(RefStrings.MODID + ":ShdwSpade");
		ShdwHoe = new com.crafter6789.loztwiprincess.item.tools.ShdwHoe(ShdwToolMaterial).setRegistryName("ShdwHoe").setUnlocalizedName("ShdwHoe").setCreativeTab(MCreativeTabs.tabTool)/*.setTextureName(RefStrings.MODID + ":ShdwHoe");
		ShdwSword = new com.crafter6789.loztwiprincess.item.tools.ShdwSword(ShdwToolMaterial).setRegistryName("ShdwSword").setUnlocalizedName("ShdwSword").setCreativeTab(MCreativeTabs.tabTool)/*.setTextureName(RefStrings.MODID + ":ShdwSword");
		
		//Armour
		
		HyrlNormHelm = new com.crafter6789.loztwiprincess.item.MArmor("HyrlNormHelm", HyrlNormArmorMaterial, "HyrlNormHelm", EntityEquipmentSlot.HEAD).setRegistryName();
		HyrlNormChest = new com.crafter6789.loztwiprincess.item.MArmor("HyrlNormChest", HyrlNormArmorMaterial, "HyrlNormChest", EntityEquipmentSlot.CHEST).setRegistryName();
		HyrlNormLegs = new com.crafter6789.loztwiprincess.item.MArmor("HyrlNormLegs", HyrlNormArmorMaterial, "HyrlNormLegs", EntityEquipmentSlot.LEGS).setRegistryName();
		HyrlNormBoots = new com.crafter6789.loztwiprincess.item.MArmor("HyrlNormBoots", HyrlNormArmorMaterial, "HyrlNormBoots", EntityEquipmentSlot.FEET).setRegistryName();	
		
		HyrlChanHelm = new com.crafter6789.loztwiprincess.item.MArmor("HyrlChanHelm", HyrlChanArmorMaterial, "HyrlChanHelm", EntityEquipmentSlot.HEAD).setRegistryName();
		HyrlChanChest = new com.crafter6789.loztwiprincess.item.MArmor("HyrlChanChest", HyrlChanArmorMaterial, "HyrlChanChest", EntityEquipmentSlot.CHEST).setRegistryName();
		HyrlChanLegs = new com.crafter6789.loztwiprincess.item.MArmor("HyrlChanLegs", HyrlChanArmorMaterial, "HyrlChanLegs", EntityEquipmentSlot.LEGS).setRegistryName();
		HyrlChanBoots = new com.crafter6789.loztwiprincess.item.MArmor("HyrlChanBoots", HyrlChanArmorMaterial, "HyrlChanBoots", EntityEquipmentSlot.FEET).setRegistryName();
		

		ShdwNormHelm = new com.crafter6789.loztwiprincess.item.MArmor("ShdwNormHelm", ShdwNormArmorMaterial, "ShdwNormHelm", EntityEquipmentSlot.HEAD).setRegistryName();
		ShdwNormChest = new com.crafter6789.loztwiprincess.item.MArmor("ShdwNormChest", ShdwNormArmorMaterial, "ShdwNormChest", EntityEquipmentSlot.CHEST).setRegistryName();
		ShdwNormLegs = new com.crafter6789.loztwiprincess.item.MArmor("ShdwNormLegs", ShdwNormArmorMaterial, "ShdwNormLegs", EntityEquipmentSlot.LEGS).setRegistryName();
		ShdwNormBoots = new com.crafter6789.loztwiprincess.item.MArmor("ShdwNormBoots", ShdwNormArmorMaterial, "ShdwNormBoots", EntityEquipmentSlot.FEET).setRegistryName();

		
		GoranTunicHelm = new com.crafter6789.loztwiprincess.item.MArmor("GoranTunicHelm", GoranTunicMaterial, "GoranTunicHelm", EntityEquipmentSlot.HEAD).setRegistryName();
		GoranTunicChest = new com.crafter6789.loztwiprincess.item.MArmor("GoranTunicChest", GoranTunicMaterial, "GoranTunicChest", EntityEquipmentSlot.CHEST).setRegistryName();
		GoranTunicLegs = new com.crafter6789.loztwiprincess.item.MArmor("GoranTunicLegs", GoranTunicMaterial, "GoranTunicLegs", EntityEquipmentSlot.LEGS).setRegistryName();
		GoranTunicBoots = new com.crafter6789.loztwiprincess.item.MArmor("GoranTunicBoots", GoranTunicMaterial, "GoranTunicBoots", EntityEquipmentSlot.FEET).setRegistryName();

		
		HeroTunicHelm = new com.crafter6789.loztwiprincess.item.MArmor("HeroTunicHelm", HeroTunicMaterial, "HeroTunicHelm", EntityEquipmentSlot.HEAD).setRegistryName();
		HeroTunicChest = new com.crafter6789.loztwiprincess.item.MArmor("HeroTunicChest", HeroTunicMaterial, "HeroTunicChest", EntityEquipmentSlot.CHEST).setRegistryName();
		HeroTunicLegs = new com.crafter6789.loztwiprincess.item.MArmor("HeroTunicLegs", HeroTunicMaterial, "HeroTunicLegs", EntityEquipmentSlot.LEGS).setRegistryName();
		HeroTunicBoots = new com.crafter6789.loztwiprincess.item.MArmor("HeroTunicBoots", HeroTunicMaterial, "HeroTunicBoots", EntityEquipmentSlot.FEET).setRegistryName();

		
		ZoraTunicHelm = new com.crafter6789.loztwiprincess.item.MArmor("ZoraTunicHelm", ZoraTunicMaterial, "ZoraTunicHelm", EntityEquipmentSlot.HEAD).setRegistryName();
		ZoraTunicChest = new com.crafter6789.loztwiprincess.item.MArmor("ZoraTunicChest", ZoraTunicMaterial, "ZoraTunicChest", EntityEquipmentSlot.CHEST).setRegistryName();
		ZoraTunicLegs = new com.crafter6789.loztwiprincess.item.MArmor("ZoraTunicLegs", ZoraTunicMaterial, "ZoraTunicLegs", EntityEquipmentSlot.LEGS).setRegistryName();
		ZoraTunicBoots = new com.crafter6789.loztwiprincess.item.MArmor("ZoraTunicBoots", ZoraTunicMaterial, "ZoraTunicBoots", EntityEquipmentSlot.FEET).setRegistryName();*/
		
		
	//}

	public static void registerItems(){
		
		for(Item item : ITEMS.values()){
			GameRegistry.register(item);
		}
		
		
		/**
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
		*/
		
		
	}

	public static void renderItems() {
		
		for(Item item : ITEMS.values()){
			if(item instanceof Rupee){
				ModelLoader.setCustomModelResourceLocation(item, Rupee.maxnum, new ModelResourceLocation(item.getRegistryName(), "inventory"));				
			}else if(item instanceof RockSteak){
				ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
			}else if(item instanceof MItem){
				ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
			}else if(item instanceof MArmor){
				ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
			}else{
				ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
			}
		}
	}
	
}
