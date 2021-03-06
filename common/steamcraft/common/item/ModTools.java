package common.steamcraft.common.item;

import net.minecraft.item.Item;

import common.steamcraft.common.lib2.ItemIDs;
import common.steamcraft.common.lib2.MaterialMod;

public class ModTools {
	// Drills
	public static Item drillCore;
	public static Item drillBase;
	public static Item drillWood;
	public static Item drillStone;
	public static Item drillIron;
	public static Item drillDiamond;
	public static Item drillGold;
	public static Item drillSteam;
	public static Item drillEtherium;
	public static Item drillObsidian;
	
	// Steam
	public static Item pickaxeSteam;
	public static Item swordSteam;
	public static Item shovelSteam;
	public static Item axeSteam;
	public static Item hoeSteam;
	
	
	// Etherium
	public static Item pickaxeEtherium;
	public static Item swordEtherium;
	public static Item shovelEtherium;
	public static Item axeEtherium;
	public static Item hoeEtherium;
	
	// Obsidian
	public static Item pickaxeObsidian;
	public static Item swordObsidian;
	public static Item shovelObsidian;
	public static Item axeObsidian;
	public static Item hoeObsidian;
	
	// Other
	public static Item chisel;
	public static Item spanner;

	public static void initTools() { 
		drillCore = new ItemCoreDrill(ItemIDs.coreDrillID).setUnlocalizedName("coredrill");
		drillBase = new ItemMod(ItemIDs.drillBaseID).setUnlocalizedName("coredrillbase");
		// int id, int maxEnergy, int toolTier, int energyTier(mostly for IC2)
		drillWood = new ItemElectricDrill(ItemIDs.drillWoodID, 20000, 0, 1).setUnlocalizedName("wooddrill");
		drillStone = new ItemElectricDrill(ItemIDs.drillStoneID, 40000, 1, 1).setUnlocalizedName("stonedrill");
		drillIron = new ItemElectricDrill(ItemIDs.drillIronID, 80000, 2, 1).setUnlocalizedName("irondrill");
		drillDiamond = new ItemElectricDrill(ItemIDs.drillDiamondID, 200000, 3, 2).setUnlocalizedName("diamonddrill");
		drillGold = new ItemElectricDrill(ItemIDs.drillGoldID, 100000, 3, 1).setUnlocalizedName("golddrill");
		drillSteam = new ItemSteamDrill(ItemIDs.drillSteamID).setUnlocalizedName("steamdrill");
		drillEtherium = new ItemElectricDrill(ItemIDs.drillEtheriumID, 300000, 4, 2).setUnlocalizedName("etheriumdrill");
		drillObsidian = new ItemElectricDrill(ItemIDs.drillObsidianID, 200000, 2, 2).setUnlocalizedName("obsidiandrill");
		
		pickaxeSteam = new ItemModPickaxe(ItemIDs.pickaxeSteamID, MaterialMod.STEAM_TOOL).setUnlocalizedName("steampick");
		swordSteam = new ItemModSword(ItemIDs.swordSteamID, MaterialMod.STEAM_TOOL).setUnlocalizedName("steamsword");
		shovelSteam = new ItemModSpade(ItemIDs.shovelSteamID, MaterialMod.STEAM_TOOL).setUnlocalizedName("steamspade");
		axeSteam = new ItemAxeMod(ItemIDs.axeSteamID, MaterialMod.STEAM_TOOL).setUnlocalizedName("steamaxe");
		hoeSteam = new ItemHoeMod(ItemIDs.hoeSteamID, MaterialMod.STEAM_TOOL).setUnlocalizedName("steamhoe");
		
		pickaxeEtherium = new ItemModPickaxe(ItemIDs.pickaxeEtheriumID, MaterialMod.ETHERIUM_TOOL).setUnlocalizedName("etheriumpick");
		swordEtherium = new ItemModSword(ItemIDs.swordEtheriumID, MaterialMod.ETHERIUM_TOOL).setUnlocalizedName("etheriumsword");
		shovelEtherium = new ItemModSpade(ItemIDs.shovelEtheriumID, MaterialMod.ETHERIUM_TOOL).setUnlocalizedName("etheriumspade");
		axeEtherium = new ItemAxeMod(ItemIDs.axeEtheriumID, MaterialMod.ETHERIUM_TOOL).setUnlocalizedName("etheriumaxe");
		hoeEtherium = new ItemHoeMod(ItemIDs.hoeEtheriumID, MaterialMod.ETHERIUM_TOOL).setUnlocalizedName("etheriumhoe");
		
		pickaxeObsidian = new ItemModPickaxe(ItemIDs.pickaxeObsidianID, MaterialMod.OBSIDIAN_TOOL).setUnlocalizedName("obsidianpick");
		swordObsidian = new ItemModSword(ItemIDs.swordObsidianID, MaterialMod.OBSIDIAN_TOOL).setUnlocalizedName("obsidiansword");
		shovelObsidian = new ItemModSpade(ItemIDs.shovelObsidianID, MaterialMod.OBSIDIAN_TOOL).setUnlocalizedName("obsidianspade");
		axeObsidian = new ItemAxeMod(ItemIDs.axeObsidianID, MaterialMod.OBSIDIAN_TOOL).setUnlocalizedName("obsidianaxe");
		hoeObsidian = new ItemHoeMod(ItemIDs.hoeObsidianID, MaterialMod.OBSIDIAN_TOOL).setUnlocalizedName("obsidianhoe");
		
		chisel = new ItemChisel(ItemIDs.chiselID, 64).setUnlocalizedName("chisel"); // TODO: Change from crafting to right-click
		spanner = new ItemChisel(ItemIDs.spannerID, 3).setUnlocalizedName("spanner");	
	}
}