//Copyright Thomas Norell and Goutam Gadiraju 2013, All Rights Reserved


package mods.new_stuff.common;


import mods.new_stuff.armor.ItemAluminumBoots;
import mods.new_stuff.armor.ItemAluminumChestplate;
import mods.new_stuff.armor.ItemAluminumHelmet;
import mods.new_stuff.armor.ItemAluminumLeggings;
import mods.new_stuff.armor.ItemEnderiteBoots;
import mods.new_stuff.armor.ItemEnderiteChestplate;
import mods.new_stuff.armor.ItemEnderiteHelmet;
import mods.new_stuff.armor.ItemEnderiteLeggings;
import mods.new_stuff.armor.ItemNickelBoots;
import mods.new_stuff.armor.ItemNickelChestplate;
import mods.new_stuff.armor.ItemNickelHelmet;
import mods.new_stuff.armor.ItemNickelLeggings;
import mods.new_stuff.armor.ItemRubyBoots;
import mods.new_stuff.armor.ItemRubyChestplate;
import mods.new_stuff.armor.ItemRubyHelmet;
import mods.new_stuff.armor.ItemRubyLeggings;
import mods.new_stuff.armor.ItemStoneBoots;
import mods.new_stuff.armor.ItemStoneChestplate;
import mods.new_stuff.armor.ItemStoneHelmet;
import mods.new_stuff.armor.ItemStoneLeggings;
import mods.new_stuff.armor.ItemSuperAlloyBoots;
import mods.new_stuff.armor.ItemSuperAlloyChestplate;
import mods.new_stuff.armor.ItemSuperAlloyHelmet;
import mods.new_stuff.armor.ItemSuperAlloyLeggings;
import mods.new_stuff.armor.ItemTitaniumBoots;
import mods.new_stuff.armor.ItemTitaniumChestplate;
import mods.new_stuff.armor.ItemTitaniumHelmet;
import mods.new_stuff.armor.ItemTitaniumLeggings;
import mods.new_stuff.block.BlockAluminumBlock;
import mods.new_stuff.block.BlockAluminumOre;
import mods.new_stuff.block.BlockAmethystBlock;
import mods.new_stuff.block.BlockAmethystOre;
import mods.new_stuff.block.BlockEndDiamondOre;
import mods.new_stuff.block.BlockEnderiteBlock;
import mods.new_stuff.block.BlockEnderiteOre;
import mods.new_stuff.block.BlockNetherGoldOre;
import mods.new_stuff.block.BlockNickelBlock;
import mods.new_stuff.block.BlockNickelOre;
import mods.new_stuff.block.BlockPyroclasticMaterial;
import mods.new_stuff.block.BlockRubyBlock;
import mods.new_stuff.block.BlockRubyOre;
import mods.new_stuff.block.BlockSuperAlloyBlock;
import mods.new_stuff.block.BlockTitaniumBlock;
import mods.new_stuff.block.BlockTitaniumOre;
import mods.new_stuff.block.BlockUraniumOre;
import mods.new_stuff.crop.BlockGrapeBlock;
import mods.new_stuff.explosive.BlockNuclearExplosive;
import mods.new_stuff.explosive.EntityPrimedNuclearExplosive;
import mods.new_stuff.food.FoodGrape;
import mods.new_stuff.food.ItemLemon;
import mods.new_stuff.food.ItemLemonade;
import mods.new_stuff.item.ItemAluminumIngot;
import mods.new_stuff.item.ItemAmethystFragment;
import mods.new_stuff.item.ItemDiamondDust;
import mods.new_stuff.item.ItemDiamondFragment;
import mods.new_stuff.item.ItemEnderite;
import mods.new_stuff.item.ItemEnderiteDust;
import mods.new_stuff.item.ItemHammer;
import mods.new_stuff.item.ItemNickelIngot;
import mods.new_stuff.item.ItemNuclearRod;
import mods.new_stuff.item.ItemRubyFragment;
import mods.new_stuff.item.ItemSuperAlloyBlend;
import mods.new_stuff.item.ItemSuperAlloyIngot;
import mods.new_stuff.item.ItemTitaniumDust;
import mods.new_stuff.item.ItemTitaniumFragment;
import mods.new_stuff.item.ItemTitaniumIngot;
import mods.new_stuff.item.ItemUraniumDust;
import mods.new_stuff.tool.ItemAluminumAxe;
import mods.new_stuff.tool.ItemAluminumHoe;
import mods.new_stuff.tool.ItemAluminumPickaxe;
import mods.new_stuff.tool.ItemAluminumShovel;
import mods.new_stuff.tool.ItemAluminumSword;
import mods.new_stuff.tool.ItemAmethystDagger;
import mods.new_stuff.tool.ItemEnderiteAxe;
import mods.new_stuff.tool.ItemEnderiteHoe;
import mods.new_stuff.tool.ItemEnderitePickaxe;
import mods.new_stuff.tool.ItemEnderiteShovel;
import mods.new_stuff.tool.ItemEnderiteSword;
import mods.new_stuff.tool.ItemNickelAxe;
import mods.new_stuff.tool.ItemNickelHoe;
import mods.new_stuff.tool.ItemNickelPickaxe;
import mods.new_stuff.tool.ItemNickelShovel;
import mods.new_stuff.tool.ItemNickelSword;
import mods.new_stuff.tool.ItemRubyAxe;
import mods.new_stuff.tool.ItemRubyHoe;
import mods.new_stuff.tool.ItemRubyPickaxe;
import mods.new_stuff.tool.ItemRubyShovel;
import mods.new_stuff.tool.ItemRubySword;
import mods.new_stuff.tool.ItemSuperAlloyAxe;
import mods.new_stuff.tool.ItemSuperAlloyHoe;
import mods.new_stuff.tool.ItemSuperAlloyPickaxe;
import mods.new_stuff.tool.ItemSuperAlloyShovel;
import mods.new_stuff.tool.ItemSuperAlloySword;
import mods.new_stuff.tool.ItemTitaniumAxe;
import mods.new_stuff.tool.ItemTitaniumHoe;
import mods.new_stuff.tool.ItemTitaniumPickaxe;
import mods.new_stuff.tool.ItemTitaniumShovel;
import mods.new_stuff.tool.ItemTitaniumSword;
import mods.new_stuff.tree.BlockLemonLeaves;
import mods.new_stuff.tree.BlockLemonSapling;
import mods.new_stuff.tree.BlockLemonWood;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.src.ModLoader;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.EnumHelper;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@Mod(modid = "New Stuff", name = "New Stuff", version = "Pre-Release 1")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)



public class New_Stuff{

	
	public static Item TitaniumPickaxe;
	public static Item TitaniumSword;
	public static Item TitaniumShovel;
	public static Item TitaniumAxe;
	public static Item TitaniumHoe;
	public static Item TitaniumHelmet;
	public static Item TitaniumChestplate;
	public static Item TitaniumLeggings;
	public static Item TitaniumBoots;
	
	public static Item NickelPickaxe;
	public static Item NickelSword;
	public static Item NickelShovel;
	public static Item NickelAxe;
	public static Item NickelHoe;
	public static Item NickelHelmet;
	public static Item NickelChestplate;
	public static Item NickelLeggings;
	public static Item NickelBoots;
	
	public static Item AluminumPickaxe;
	public static Item AluminumSword;
	public static Item AluminumShovel;
	public static Item AluminumAxe;
	public static Item AluminumHoe;
	public static Item AluminumHelmet;
	public static Item AluminumChestplate;
	public static Item AluminumLeggings;
	public static Item AluminumBoots;
	
	public static Item EnderitePickaxe;
	public static Item EnderiteSword;
	public static Item EnderiteShovel;
	public static Item EnderiteAxe;
	public static Item EnderiteHoe;
	public static Item EnderiteHelmet;
	public static Item EnderiteChestplate;
	public static Item EnderiteLeggings;
	public static Item EnderiteBoots;
	
	public static Item StoneHelmet;
	public static Item StoneChestplate;
	public static Item StoneLeggings;
	public static Item StoneBoots;

	public static Item RubyPickaxe;
	public static Item RubySword;
	public static Item RubyShovel;
	public static Item RubyAxe;
	public static Item RubyHoe;
	
	public static Item RubyHelmet;
	public static Item RubyChestplate;
	public static Item RubyLeggings;
	public static Item RubyBoots;
	
	public static Item AmethystDagger;
	
	public static Item SuperAlloyPickaxe;
	public static Item SuperAlloySword;
	public static Item SuperAlloyShovel;
	public static Item SuperAlloyAxe;
	public static Item SuperAlloyHoe;
	public static Item SuperAlloyHelmet;
	public static Item SuperAlloyChestplate;
	public static Item SuperAlloyLeggings;
	public static Item SuperAlloyBoots;
	
	public static BiomeGenBase VolcanicWasteland;
	public static BiomeGenBase Glacier;
	
	public static EnumArmorMaterial armorTitanium = EnumHelper.addArmorMaterial("Titanium",40, new int[]{8, 15, 12, 7}, 16);
	public static EnumArmorMaterial armorNickel = EnumHelper.addArmorMaterial("Nickel", 20, new int[]{2, 6, 3, 2}, 18);
	public static EnumArmorMaterial armorStone = EnumHelper.addArmorMaterial("Stone", 6, new int[]{1, 5, 2, 1}, 20);
	public static EnumArmorMaterial armorRuby = EnumHelper.addArmorMaterial("Ruby", 25, new int[]{8, 6, 3, 2}, 17);
	public static EnumArmorMaterial armorAluminum = EnumHelper.addArmorMaterial("Aluminum", 1, new int[]{3, 7, 5, 2}, 10);
	public static EnumArmorMaterial armorEnderite = EnumHelper.addArmorMaterial("Enderite", 45, new int[]{15, 30, 25, 13}, 15);
	public static EnumArmorMaterial armorSuperAlloy = EnumHelper.addArmorMaterial("SuperAlloy", 1000, new int[]{17, 33, 30, 16}, 1);
	
	public static EnumToolMaterial toolEnderite = EnumHelper.addToolMaterial("Enderite", 6, 4500, 88.0F, 10, 90);
	public static EnumToolMaterial toolAluminum = EnumHelper.addToolMaterial("Aluminum", 5, 100, 100.0F, 10, 100);
	public static EnumToolMaterial toolTitanium = EnumHelper.addToolMaterial("Titanium", 4, 4200, 20.0F, 5, 30);
	public static EnumToolMaterial toolNickel = EnumHelper.addToolMaterial("Nickel", 2, 2300, 5F, 2, 30);
	public static EnumToolMaterial toolRuby = EnumHelper.addToolMaterial("Ruby", 3, 4700, 90.0F, 10, 100);
	public static EnumToolMaterial toolAmethyst = EnumHelper.addToolMaterial("Amethyst", 2, 1, 0F, 96, 1);
	public static EnumToolMaterial toolSuperAlloy = EnumHelper.addToolMaterial("SuperAlloy", 7, -1, 50F, 15, 120);
	
public New_Stuff(){
		
		TitaniumPickaxe = new ItemTitaniumPickaxe(3000, toolTitanium).setUnlocalizedName("TitaniumPickaxe").setCreativeTab(CreativeTabs.tabTools);
		TitaniumSword = new ItemTitaniumSword(3001, toolTitanium).setUnlocalizedName("TitaniumSword").setCreativeTab(CreativeTabs.tabCombat);
		TitaniumShovel = new ItemTitaniumShovel(3002, toolTitanium).setUnlocalizedName("TitaniumShovel").setCreativeTab(CreativeTabs.tabTools);
		TitaniumAxe = new ItemTitaniumAxe(3003, toolTitanium).setUnlocalizedName("TitaniumAxe").setCreativeTab(CreativeTabs.tabTools);
		TitaniumHoe = new ItemTitaniumHoe(3004, toolTitanium).setUnlocalizedName("TitaniumHoe").setCreativeTab(CreativeTabs.tabTools);
		
		NickelPickaxe = new ItemNickelPickaxe(3005, toolNickel).setUnlocalizedName("NickelPickaxe").setCreativeTab(CreativeTabs.tabTools);
		NickelSword = new ItemNickelSword(3006, toolNickel).setUnlocalizedName("NickelSword").setCreativeTab(CreativeTabs.tabCombat);
		NickelShovel = new ItemNickelShovel(3007,toolNickel).setUnlocalizedName("NickelShovel").setCreativeTab(CreativeTabs.tabTools);
		NickelAxe = new ItemNickelAxe(3008, toolNickel).setUnlocalizedName("NickelAxe").setCreativeTab(CreativeTabs.tabTools);
		NickelHoe = new ItemNickelHoe(3009, toolNickel).setUnlocalizedName("NickelHoe").setCreativeTab(CreativeTabs.tabTools);
		
		AluminumPickaxe = new ItemAluminumPickaxe(3010, toolAluminum).setUnlocalizedName("AluminumPickaxe").setCreativeTab(CreativeTabs.tabTools);
		AluminumSword = new ItemAluminumSword(3011, toolAluminum).setUnlocalizedName("AluminumSword").setCreativeTab(CreativeTabs.tabCombat);
		AluminumShovel = new ItemAluminumShovel(3012, toolAluminum).setUnlocalizedName("AluminumShovel").setCreativeTab(CreativeTabs.tabTools);
		AluminumAxe = new ItemAluminumAxe(3013, toolAluminum).setUnlocalizedName("AluminumAxe").setCreativeTab(CreativeTabs.tabTools);
		AluminumHoe = new ItemAluminumHoe(3014, toolAluminum).setUnlocalizedName("AluminumHoe").setCreativeTab(CreativeTabs.tabTools);
		
		EnderitePickaxe = new ItemEnderitePickaxe(3015, toolEnderite).setUnlocalizedName("EnderitePickaxe").setCreativeTab(CreativeTabs.tabTools);
		EnderiteSword = new ItemEnderiteSword(3016, toolEnderite).setUnlocalizedName("EnderiteSword").setCreativeTab(CreativeTabs.tabCombat);
		EnderiteShovel = new ItemEnderiteShovel(3017, toolEnderite).setUnlocalizedName("EnderiteShovel").setCreativeTab(CreativeTabs.tabTools);
		EnderiteAxe = new ItemEnderiteAxe(3018, toolEnderite).setUnlocalizedName("EnderiteAxe").setCreativeTab(CreativeTabs.tabTools);
		EnderiteHoe = new ItemEnderiteHoe(3019, toolEnderite).setUnlocalizedName("EnderiteHoe").setCreativeTab(CreativeTabs.tabTools);
		
		TitaniumHelmet = new ItemTitaniumHelmet(3020, armorTitanium, ModLoader.addArmor("titanium"), 0).setUnlocalizedName("TitaniumHelmet").setCreativeTab(CreativeTabs.tabCombat);
		TitaniumChestplate = new ItemTitaniumChestplate(3021, armorTitanium, ModLoader.addArmor("titanium"), 1).setUnlocalizedName("TitaniumChestplate").setCreativeTab(CreativeTabs.tabCombat);
		TitaniumLeggings = new ItemTitaniumLeggings(3022, armorTitanium, ModLoader.addArmor("titanium"), 2).setUnlocalizedName("TitaniumLeggings").setCreativeTab(CreativeTabs.tabCombat);
		TitaniumBoots = new ItemTitaniumBoots(3023, armorTitanium, ModLoader.addArmor("titanium"), 3).setUnlocalizedName("TitaniumBoots").setCreativeTab(CreativeTabs.tabCombat);

		NickelHelmet = new ItemNickelHelmet(3024, armorNickel, ModLoader.addArmor("nickel"), 0).setUnlocalizedName("NickelHelmet").setCreativeTab(CreativeTabs.tabCombat);
		NickelChestplate = new ItemNickelChestplate(3025, armorNickel, ModLoader.addArmor("nickel"), 1).setUnlocalizedName("NickelChestplate").setCreativeTab(CreativeTabs.tabCombat);
		NickelLeggings = new ItemNickelLeggings(3026, armorNickel, ModLoader.addArmor("nickel"), 2).setUnlocalizedName("NickelLeggings").setCreativeTab(CreativeTabs.tabCombat);
		NickelBoots = new ItemNickelBoots(3027, armorNickel, ModLoader.addArmor("nickel"), 3).setUnlocalizedName("NickelBoots").setCreativeTab(CreativeTabs.tabCombat);
		
		StoneHelmet = new ItemStoneHelmet(3028, armorStone, ModLoader.addArmor("stone"), 0).setUnlocalizedName("StoneHelmet").setCreativeTab(CreativeTabs.tabCombat);
		StoneChestplate = new ItemStoneChestplate(3029, armorStone, ModLoader.addArmor("stone"), 1).setUnlocalizedName("StoneChestplate").setCreativeTab(CreativeTabs.tabCombat);
		StoneLeggings = new ItemStoneLeggings(3030, armorStone, ModLoader.addArmor("stone"), 2).setUnlocalizedName("StoneLeggings").setCreativeTab(CreativeTabs.tabCombat);
		StoneBoots = new ItemStoneBoots(3031, armorStone, ModLoader.addArmor("stone"), 3).setUnlocalizedName("StoneBoots").setCreativeTab(CreativeTabs.tabCombat);
		
		RubySword = new ItemRubySword(3032,toolRuby).setUnlocalizedName("RubySword").setCreativeTab(CreativeTabs.tabCombat);
		RubyPickaxe = new ItemRubyPickaxe(3033, toolRuby).setUnlocalizedName("RubyPickaxe").setCreativeTab(CreativeTabs.tabTools);
		RubyShovel = new ItemRubyShovel(3034, toolRuby).setUnlocalizedName("RubyShovel").setCreativeTab(CreativeTabs.tabTools);
		RubyAxe = new ItemRubyAxe(3035, toolRuby).setUnlocalizedName("RubyAxe").setCreativeTab(CreativeTabs.tabTools);
		RubyHoe = new ItemRubyHoe(3036, toolRuby).setUnlocalizedName("RubyHoe").setCreativeTab(CreativeTabs.tabTools);
		
		RubyHelmet = new ItemRubyHelmet(3037, armorRuby, ModLoader.addArmor("ruby"), 0).setUnlocalizedName("RubyHelmet").setCreativeTab(CreativeTabs.tabCombat);
		RubyChestplate = new ItemRubyChestplate(3038, armorRuby, ModLoader.addArmor("ruby"), 1).setUnlocalizedName("RubyChestplate").setCreativeTab(CreativeTabs.tabCombat);
		RubyLeggings = new ItemRubyLeggings(3039, armorRuby, ModLoader.addArmor("ruby"), 2).setUnlocalizedName("RubyLeggings").setCreativeTab(CreativeTabs.tabCombat);
		RubyBoots = new ItemRubyBoots(3040, armorRuby, ModLoader.addArmor("ruby"), 3).setUnlocalizedName("RubyBoots").setCreativeTab(CreativeTabs.tabCombat);
		
		AmethystDagger = new ItemAmethystDagger(3041,toolAmethyst).setUnlocalizedName("AmethystDagger").setCreativeTab(CreativeTabs.tabCombat);
		
		EnderiteHelmet = new ItemEnderiteHelmet(3042, armorEnderite, ModLoader.addArmor("enderite"), 0).setUnlocalizedName("EnderiteHelmet").setCreativeTab(CreativeTabs.tabCombat);
		EnderiteChestplate = new ItemEnderiteChestplate(3043, armorEnderite, ModLoader.addArmor("enderite"), 1).setUnlocalizedName("EnderiteChestplate").setCreativeTab(CreativeTabs.tabCombat);
		EnderiteLeggings = new ItemEnderiteLeggings(3044, armorEnderite, ModLoader.addArmor("enderite"), 2).setUnlocalizedName("EnderiteLeggings").setCreativeTab(CreativeTabs.tabCombat);
		EnderiteBoots = new ItemEnderiteBoots(3045, armorEnderite, ModLoader.addArmor("enderite"), 3).setUnlocalizedName("EnderiteBoots").setCreativeTab(CreativeTabs.tabCombat);

		AluminumHelmet = new ItemAluminumHelmet(3046, armorEnderite, ModLoader.addArmor("aluminum"), 0).setUnlocalizedName("AluminumHelmet").setCreativeTab(CreativeTabs.tabCombat);
		AluminumChestplate = new ItemAluminumChestplate(3047, armorEnderite, ModLoader.addArmor("aluminum"), 1).setUnlocalizedName("AluminumChestplate").setCreativeTab(CreativeTabs.tabCombat);
		AluminumLeggings = new ItemAluminumLeggings(3048, armorEnderite, ModLoader.addArmor("aluminum"), 2).setUnlocalizedName("AluminumLeggings").setCreativeTab(CreativeTabs.tabCombat);
		AluminumBoots = new ItemAluminumBoots(3049, armorEnderite, ModLoader.addArmor("aluminum"), 3).setUnlocalizedName("AluminumBoots").setCreativeTab(CreativeTabs.tabCombat);

		SuperAlloyPickaxe = new ItemSuperAlloyPickaxe(3050, toolSuperAlloy).setUnlocalizedName("SuperAlloyPickaxe").setCreativeTab(CreativeTabs.tabTools);
		SuperAlloySword = new ItemSuperAlloySword(3051, toolSuperAlloy).setUnlocalizedName("SuperAlloySword").setCreativeTab(CreativeTabs.tabCombat);
		SuperAlloyShovel = new ItemSuperAlloyShovel(3052,toolSuperAlloy).setUnlocalizedName("SuperAlloyShovel").setCreativeTab(CreativeTabs.tabTools);
		SuperAlloyAxe = new ItemSuperAlloyAxe(3053, toolSuperAlloy).setUnlocalizedName("SuperAlloyAxe").setCreativeTab(CreativeTabs.tabTools);
		SuperAlloyHoe = new ItemSuperAlloyHoe(3054, toolSuperAlloy).setUnlocalizedName("SuperAlloyHoe").setCreativeTab(CreativeTabs.tabTools);
		
		SuperAlloyHelmet = new ItemSuperAlloyHelmet(3055, armorSuperAlloy, ModLoader.addArmor("superalloy"), 0).setUnlocalizedName("SuperAlloyHelmet").setCreativeTab(CreativeTabs.tabCombat);
		SuperAlloyChestplate = new ItemSuperAlloyChestplate(3056, armorSuperAlloy, ModLoader.addArmor("superalloy"), 1).setUnlocalizedName("SuperAlloyChestplate").setCreativeTab(CreativeTabs.tabCombat);
		SuperAlloyLeggings = new ItemSuperAlloyLeggings(3057, armorEnderite, ModLoader.addArmor("superalloy"), 2).setUnlocalizedName("SuperAlloyLeggings").setCreativeTab(CreativeTabs.tabCombat);
		SuperAlloyBoots = new ItemSuperAlloyBoots(3058, armorEnderite, ModLoader.addArmor("superalloy"), 3).setUnlocalizedName("SuperAlloyBoots").setCreativeTab(CreativeTabs.tabCombat);

}
	
	public static Block TitaniumOre;
	int TitaniumOreID = 500;
	public static Block NickelOre;
	int NickelOreID = 501;
	public static Block AluminumOre;
	int AluminumOreID = 502;
	public static Block EndDiamondOre;
	int EndDiamondOreID = 503;
	public static Block TitaniumBlock;
	int TitaniumBlockID = 504;
	public static Block NetherGoldOre;
	int NetherGoldOreID = 505;
	public static Block EnderiteOre;
	int EnderiteOreID = 506;
	public static Block RubyOre;
	int RubyOreID = 507;
	public static Block UraniumOre;
	int UraniumOreID = 508;
	public static Block AmethystOre;
	int AmethystOreID = 509;
	public static Block AmethystBlock;
	int AmethystBlockID = 510;
	public static Block NickelBlock;
	int NickelBlockID = 511;
	public static Block RubyBlock;
	int RubyBlockID = 512;
	public static Block AluminumBlock;
	int AluminumBlockID = 513;
	public static Block EnderiteBlock;
	int EnderiteBlockID = 514;
	public static Block LemonWood;
	int LemonWoodID = 515;
	public static Block LemonLeaves;
	int LemonLeavesID = 516;
	public static Block LemonSapling;
	int LemonSaplingID = 517;
	public static Block NuclearExplosive;
	int NuclearExplosiveID = 518;
	public static Block SuperAlloyBlock;
	int SuperAlloyBlockID = 519;
	public static Block GrapeBlock;
	int GrapeBlockID = 520;
	public static Block PyroclasticMaterial;
	int PyroclasticMaterialID = 521;
	
	
	public static Item TitaniumFragment;
	public int TitaniumFragmentID = 1000;
	public static Item TitaniumIngot;
	public int TitaniumIngotID = 1001;
	public static Item NickelIngot;
	public int NickelIngotID = 1003;
	public static Item AluminumIngot;
	public int AluminumIngotID = 1004;
	public static Item DiamondFragment;
	public int DiamondFragmentID = 1005;
	public static Item Enderite;
	public int EnderiteID = 1006;
	public static Item Hammer;
	public int HammerID = 1007;
	public static Item EnderiteDust;
	public int EnderiteDustID = 1008;
	public static Item DiamondDust;
	public int DiamondDustID = 1009;
	public static Item TitaniumDust;
	public int TitaniumDustID = 1010;
	public static Item SuperAlloyBlend;
	public int SuperAlloyBlendID = 1011;
	public static Item UraniumDust;
	public int UraniumDustID = 1012;
	public static Item NuclearRod;
	public int NuclearRodID = 1013;
	public static Item RubyFragment;
	public int RubyFragmentID = 1014;
	public static Item AmethystFragment;
	public int AmethystFragmentID = 1015;
	public static Item Lemon;
	public int LemonID  = 1016;
	public static Item Lemonade;
	public int LemonadeID = 1017;
	public static Item Grape;
	public int GrapeID = 1018;
	public static Item SuperAlloyIngot;
	public int SuperAlloyIngotID = 1019;
	
	
	public static Entity PrimedNuclearExplosive;
	public int PrimedNuclearExplosiveID = 1000;
	
	@Init
	public void load(FMLInitializationEvent event){
		
		TitaniumOre = new BlockTitaniumOre(TitaniumOreID, Material.iron).setUnlocalizedName("tiletitaniumore").func_111022_d("TitaniumOre").setHardness(25F).setResistance(75F);
		NickelOre = new BlockNickelOre(NickelOreID, Material.iron).setUnlocalizedName("tilenickelore").setHardness(15F).setResistance(5F);
		AluminumOre = new BlockAluminumOre(AluminumOreID, Material.iron).setUnlocalizedName("tilealuminumore").setHardness(10F).setResistance(7F);
		EndDiamondOre = new BlockEndDiamondOre(EndDiamondOreID, Material.iron).setUnlocalizedName("tileenddiamondore").setLightValue(.5F).setHardness(20F).setResistance(50F);
		TitaniumBlock = new BlockTitaniumBlock(TitaniumBlockID, Material.iron).setUnlocalizedName("tiletitaniumblock").setHardness(50F).setResistance(100F);
		NetherGoldOre = new BlockNetherGoldOre(NetherGoldOreID, Material.iron).setUnlocalizedName("tilenethergoldore").setLightValue(.7F).setHardness(17F).setResistance(25F);
		EnderiteOre = new BlockEnderiteOre(EnderiteOreID, Material.iron).setUnlocalizedName("tileenderiteore").setHardness(17F).setResistance(25F);
		RubyOre = new BlockRubyOre(RubyOreID, Material.iron).setUnlocalizedName("tilerubyore").setHardness(20F).setResistance(15F);
		UraniumOre = new BlockUraniumOre(UraniumOreID, Material.iron).setUnlocalizedName("tileuraniumore").setLightValue(.3F).setHardness(20F).setResistance(15F);
		AmethystOre = new BlockAmethystOre(AmethystOreID, Material.iron).setUnlocalizedName("tileamethystore").setHardness(20F).setResistance(50F).setLightValue(0.1F);
		AmethystBlock = new BlockAmethystBlock(AmethystBlockID, Material.iron).setUnlocalizedName("tileamethystblock").setHardness(20F).setResistance(50F);
		NickelBlock = new BlockNickelBlock(NickelBlockID, Material.iron).setUnlocalizedName("tilenickelblock").setHardness(20F).setResistance(50F);
		RubyBlock = new BlockRubyBlock(RubyBlockID, Material.iron).setUnlocalizedName("tilerubyblock").setHardness(20F).setResistance(50F);
		AluminumBlock = new BlockAluminumBlock(AluminumBlockID, Material.iron).setUnlocalizedName("tilealuminumblock").setHardness(20F).setResistance(50F);
		EnderiteBlock = new BlockEnderiteBlock(EnderiteBlockID, Material.iron).setUnlocalizedName("tileenderiteblock").setHardness(20F).setResistance(50F);
		LemonWood = new BlockLemonWood(LemonWoodID).setUnlocalizedName("tilelemonwood").setStepSound(Block.soundWoodFootstep).setHardness(5F).setResistance(55F);
		LemonLeaves = new BlockLemonLeaves(LemonLeavesID).setUnlocalizedName("tilelemonleaves").setLightOpacity(5).setStepSound(Block.soundGrassFootstep).setHardness(.5F).setResistance(1F);
		LemonSapling = new BlockLemonSapling(LemonSaplingID).setUnlocalizedName("tilelemonsapling").setLightOpacity(5).setStepSound(Block.soundGrassFootstep).setHardness(.7F).setResistance(1F);
		NuclearExplosive = new BlockNuclearExplosive(NuclearExplosiveID).setUnlocalizedName("tilenuclearexplosive");
		SuperAlloyBlock = new BlockSuperAlloyBlock(SuperAlloyBlockID, Material.iron).setUnlocalizedName("tilesuperalloyblock").setHardness(20F).setResistance(50F);
		GrapeBlock = new BlockGrapeBlock(GrapeBlockID).setUnlocalizedName("tilegrapeblock").setStepSound(Block.soundGrassFootstep).setHardness(0.0F);
		PyroclasticMaterial = new BlockPyroclasticMaterial(PyroclasticMaterialID, Material.iron).setUnlocalizedName("PyroclasticMaterial").setStepSound(Block.soundMetalFootstep).setHardness(50F).setResistance(20F);
		
		MinecraftForge.setBlockHarvestLevel(RubyOre, "pickaxe", 3);
		MinecraftForge.setBlockHarvestLevel(EnderiteOre, "pickaxe", 3);
		MinecraftForge.setBlockHarvestLevel(NetherGoldOre, "pickaxe", 3);
		MinecraftForge.setBlockHarvestLevel(TitaniumBlock, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(EndDiamondOre, "pickaxe", 3);
		MinecraftForge.setBlockHarvestLevel(AluminumOre, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(TitaniumOre, "pickaxe", 3);
		MinecraftForge.setBlockHarvestLevel(UraniumOre, "pickaxe", 3);
		MinecraftForge.setBlockHarvestLevel(NickelOre, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(AmethystOre, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(AmethystBlock, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(NickelBlock, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(RubyBlock, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(AluminumBlock, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(EnderiteBlock, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(LemonLeaves, "shears", 1);
		MinecraftForge.setBlockHarvestLevel(LemonWood, "axe", 1);
		MinecraftForge.setBlockHarvestLevel(SuperAlloyBlock, "pickaxe", 2);
		
		TitaniumFragment = new ItemTitaniumFragment(TitaniumFragmentID).setUnlocalizedName("FragmentTitanium").setCreativeTab(CreativeTabs.tabMaterials);
		TitaniumIngot = new ItemTitaniumIngot(TitaniumIngotID).setUnlocalizedName("IngotTitanium").setCreativeTab(CreativeTabs.tabMaterials);
		NickelIngot = new ItemNickelIngot(NickelIngotID).setUnlocalizedName("IngotNickel").setCreativeTab(CreativeTabs.tabMaterials);
		AluminumIngot = new ItemAluminumIngot(AluminumIngotID).setUnlocalizedName("IngotAluminum").setCreativeTab(CreativeTabs.tabMaterials);
		DiamondFragment = new ItemDiamondFragment(DiamondFragmentID).setUnlocalizedName("FragmentDiamond").setCreativeTab(CreativeTabs.tabMaterials);
		Enderite = new ItemEnderite(EnderiteID).setUnlocalizedName("Enderite").setCreativeTab(CreativeTabs.tabMaterials);
		Hammer = new ItemHammer(HammerID).setUnlocalizedName("Hammer").setCreativeTab(CreativeTabs.tabTools);
		EnderiteDust = new ItemEnderiteDust(EnderiteDustID).setUnlocalizedName("DustEnderite").setCreativeTab(CreativeTabs.tabMaterials);
		DiamondDust = new ItemDiamondDust(DiamondDustID).setUnlocalizedName("DustDiamond").setCreativeTab(CreativeTabs.tabMaterials);
		TitaniumDust = new ItemTitaniumDust(TitaniumDustID).setUnlocalizedName("DustTitanium").setCreativeTab(CreativeTabs.tabMaterials);
		SuperAlloyBlend = new ItemSuperAlloyBlend(SuperAlloyBlendID).setUnlocalizedName("BlendSuperAlloy").setCreativeTab(CreativeTabs.tabMaterials);
		UraniumDust = new ItemUraniumDust(UraniumDustID).setUnlocalizedName("DustUranium").setCreativeTab(CreativeTabs.tabMaterials);
		NuclearRod = new ItemNuclearRod(NuclearRodID).setUnlocalizedName("RodNuclear").setCreativeTab(CreativeTabs.tabMaterials);
		RubyFragment = new ItemRubyFragment(RubyFragmentID).setUnlocalizedName("FragmentRuby").setCreativeTab(CreativeTabs.tabMaterials);
		AmethystFragment = new ItemAmethystFragment(AmethystFragmentID).setUnlocalizedName("FragmentAmethyst").setCreativeTab(CreativeTabs.tabMaterials);
		Lemon = new ItemLemon(LemonID, 2, false).setPotionEffect(Potion.moveSpeed.id, 20, 1, 2.0F).setUnlocalizedName("Lemon").setCreativeTab(CreativeTabs.tabFood);
		Lemonade = new ItemLemonade(LemonadeID, 5, false).setPotionEffect(Potion.moveSpeed.id, 50, 1, 2.0F).setUnlocalizedName("Lemonade").setCreativeTab(CreativeTabs.tabFood);
		SuperAlloyIngot = new ItemSuperAlloyIngot(SuperAlloyIngotID).setUnlocalizedName("IngotSuperAlloy").setCreativeTab(CreativeTabs.tabMaterials);
		
		Grape = new FoodGrape(1018, 3, 0.4F, GrapeBlock.blockID, Block.tilledField.blockID).setUnlocalizedName("Grape");
		
		VolcanicWasteland = new mods.new_stuff.biome.VolcanicWasteland(30).setBiomeName("Volcanic Wasteland").setDisableRain().setTemperatureRainfall(2.0F, 0.0F).setColor(16421912);
		Glacier = new mods.new_stuff.biome.Glacier(31).setBiomeName("Glacier").setColor(747097).func_76733_a(5159473).setEnableSnow().setTemperatureRainfall(0.05F, 0.8F);
		
		
		
		gameRegisters();
		languageRegisters();
	
	
		GameRegistry.addBiome(VolcanicWasteland);
		GameRegistry.addBiome(Glacier);
		
		GameRegistry.registerWorldGenerator(new WorldGeneratorNew_Stuff());
		
		GameRegistry.addSmelting(AmethystOre.blockID, new ItemStack(AmethystFragment, 1),1F);
		GameRegistry.addSmelting(RubyOre.blockID, new ItemStack(RubyFragment, 1),1F);
		GameRegistry.addSmelting(UraniumOre.blockID, new ItemStack(UraniumDust, 1), 2F); 
		GameRegistry.addSmelting(NickelOre.blockID, new ItemStack(NickelIngot, 1), 1F);
		GameRegistry.addSmelting(TitaniumFragment.itemID, new ItemStack(TitaniumIngot, 1), 3F);
		GameRegistry.addSmelting(AluminumOre.blockID, new ItemStack(AluminumIngot, 1), 1F);
		GameRegistry.addSmelting(DiamondFragment.itemID, new ItemStack(Item.diamond, 2), 5F);
		GameRegistry.addSmelting(NetherGoldOre.blockID, new ItemStack(Item.ingotGold, 2), 2F);
		GameRegistry.addSmelting(EnderiteOre.blockID, new ItemStack(Enderite, 1), 2F);
		GameRegistry.addSmelting(EndDiamondOre.blockID, new ItemStack(Item.diamond, 2), 5F);
		GameRegistry.addSmelting(TitaniumOre.blockID, new ItemStack(TitaniumIngot, 1), 3F);
		GameRegistry.addSmelting(EnderiteDust.itemID, new ItemStack(Enderite, 1), .5F);
		GameRegistry.addSmelting(DiamondDust.itemID, new ItemStack(Item.diamond, 1), .5F);
		GameRegistry.addSmelting(TitaniumDust.itemID, new ItemStack(TitaniumIngot, 1), 0F);
		GameRegistry.addSmelting(SuperAlloyBlend.itemID, new ItemStack(SuperAlloyIngot, 1), .5F);
		
		GameRegistry.addRecipe(new ItemStack(TitaniumPickaxe),new Object[]{
			"TTT", "XSX", "XSX",
			'T', TitaniumIngot,
			'S', Item.stick,
		});
		
		GameRegistry.addRecipe(new ItemStack(TitaniumSword),new Object[]{
			"XTX", "XTX", "XSX",
			'T', TitaniumIngot,
			'S', Item.stick,
		});
		
		GameRegistry.addRecipe(new ItemStack(TitaniumShovel),new Object[]{
			"XTX", "XSX", "XSX",
			'T', TitaniumIngot,
			'S', Item.stick,
		});
		
		GameRegistry.addRecipe(new ItemStack(TitaniumAxe),new Object[]{
			"XTT", "XST", "XSX",
			'T', TitaniumIngot,
			'S', Item.stick,
		});
		
		GameRegistry.addRecipe(new ItemStack(TitaniumHoe),new Object[]{
			"XTT", "XSX", "XSX",
			'T', TitaniumIngot,
			'S', Item.stick,
		});
		
		GameRegistry.addRecipe(new ItemStack(NickelPickaxe),new Object[]{
			"NNN", "XSX", "XSX",
			'N', NickelIngot,
			'S', Item.stick,
		});
		
		GameRegistry.addRecipe(new ItemStack(NickelSword),new Object[]{
			"XNX", "XNX", "XSX",
			'N', NickelIngot,
			'S', Item.stick,
		});
		
		GameRegistry.addRecipe(new ItemStack(NickelShovel),new Object[]{
			"XNX", "XSX", "XSX",
			'N', NickelIngot,
			'S', Item.stick,
		});
		
		GameRegistry.addRecipe(new ItemStack(NickelAxe),new Object[]{
			"XNN", "XSN", "XSX",
			'N', NickelIngot,
			'S', Item.stick,
		});
		
		GameRegistry.addRecipe(new ItemStack(NickelHoe),new Object[]{
			"XNN", "XSX", "XSX",
			'N', NickelIngot,
			'S', Item.stick,
		});
		
		GameRegistry.addRecipe(new ItemStack(AluminumPickaxe),new Object[]{
			"AAA", "XSX", "XSX",
			'A', AluminumIngot,
			'S', Item.stick,
		});
		
		GameRegistry.addRecipe(new ItemStack(AluminumSword),new Object[]{
			"XAX", "XAX", "XSX",
			'A', AluminumIngot,
			'S', Item.stick,
		});
		
		GameRegistry.addRecipe(new ItemStack(AluminumShovel),new Object[]{
			"XAX", "XSX", "XSX",
			'A', AluminumIngot,
			'S', Item.stick,
		});
		
		GameRegistry.addRecipe(new ItemStack(AluminumAxe),new Object[]{
			"XAA", "XSA", "XSX",
			'A', AluminumIngot,
			'S', Item.stick,
		});
		
		GameRegistry.addRecipe(new ItemStack(AluminumHoe),new Object[]{
			"XAA", "XSX", "XSX",
			'A', AluminumIngot,
			'S', Item.stick,
		});
		
		GameRegistry.addRecipe(new ItemStack(TitaniumBlock),new Object[]{
			"TTT", "TTT", "TTT",
			'T', TitaniumIngot,
		});
		
		
		GameRegistry.addRecipe(new ItemStack(TitaniumIngot, 9),new Object[]{
			"TXX", "XXX", "XXX",
			'T', TitaniumBlock,
			
		});	
		
		GameRegistry.addRecipe(new ItemStack(EnderitePickaxe),new Object[]{
			"EEE", "XSX", "XSX",
			'E', Enderite,
			'S', Item.stick,
		});
		
		GameRegistry.addRecipe(new ItemStack(EnderiteSword),new Object[]{
			"XEX", "XEX", "XSX",
			'E', Enderite,
			'S', Item.stick,
		});
		
		GameRegistry.addRecipe(new ItemStack(EnderiteShovel),new Object[]{
			"XEX", "XSX", "XSX",
			'E', Enderite,
			'S', Item.stick,
		});
		
		GameRegistry.addRecipe(new ItemStack(EnderiteAxe),new Object[]{
			"XEE", "XSE", "XSX",
			'E', Enderite,
			'S', Item.stick,
		});
		
		GameRegistry.addRecipe(new ItemStack(EnderiteHoe),new Object[]{
			"XEE", "XSX", "XSX",
			'E', Enderite,
			'S', Item.stick,
		});
		
		GameRegistry.addRecipe(new ItemStack(Hammer),new Object[]{
			"III", "ISI", "XSX",
			'I', Item.ingotIron,
			'S', Item.stick,
		});
		GameRegistry.addRecipe(new ItemStack(EnderiteDust),new Object[]{
			"EHX", "XXX", "XXX",
			'E', Enderite,
			'H', Hammer,
		});
		GameRegistry.addRecipe(new ItemStack(DiamondDust),new Object[]{
			"DHX", "XXX", "XXX",
			'D', Item.diamond,
			'H', Hammer,
		});
		GameRegistry.addRecipe(new ItemStack(TitaniumDust),new Object[]{
			"THX", "XXX", "XXX",
			'T', TitaniumIngot,
			'H', Hammer,
		});
		GameRegistry.addRecipe(new ItemStack(SuperAlloyBlend),new Object[]{
			"TET", "EDE", "TET",
			'T', TitaniumDust,
			'E', EnderiteDust,
			'D', DiamondDust
		});
		GameRegistry.addRecipe(new ItemStack(NuclearRod),new Object[]{
			"GUG", "GUG", "GUG",
			'U', UraniumDust,
			'G', Block.thinGlass,	
		});
		GameRegistry.addRecipe(new ItemStack(TitaniumHelmet),new Object[]{
			"TTT", "TXT", "XXX",
			'T', TitaniumIngot,	
		});
		GameRegistry.addRecipe(new ItemStack(TitaniumChestplate),new Object[]{
			"TXT", "TTT", "TTT",
			'T', TitaniumIngot,	
		});
		GameRegistry.addRecipe(new ItemStack(TitaniumLeggings),new Object[]{
			"TTT", "TXT", "TXT",
			'T', TitaniumIngot,	
		});
		GameRegistry.addRecipe(new ItemStack(TitaniumBoots),new Object[]{
			"XXX", "TXT", "TXT",
			'T', TitaniumIngot,	
		});
		GameRegistry.addRecipe(new ItemStack(NickelHelmet),new Object[]{
			"NNN", "NXN", "XXX",
			'N', NickelIngot,	
		});
		GameRegistry.addRecipe(new ItemStack(NickelChestplate),new Object[]{
			"NXN", "NNN", "NNN",
			'N', NickelIngot,	
		});
		GameRegistry.addRecipe(new ItemStack(NickelLeggings),new Object[]{
			"NNN", "NXN", "NXN",
			'N', NickelIngot,	
		});
		GameRegistry.addRecipe(new ItemStack(NickelBoots),new Object[]{
			"XXX", "NXN", "NXN",
			'N', TitaniumIngot,	
		});
		GameRegistry.addRecipe(new ItemStack(RubySword),new Object[]{
			"XRX", "XRX", "XSX",
			'R', RubyFragment,
			'S', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(RubyHelmet),new Object[]{
			"RRR", "RXR", "XXX",
			'R', RubyFragment
		});
		GameRegistry.addRecipe(new ItemStack(AmethystBlock),new Object[]{
			"AAA", "AAA", "AAA",
			'A', AmethystFragment
		});
		GameRegistry.addRecipe(new ItemStack(AmethystFragment, 9),new Object[]{
			"AXX", "XXX", "XXX",
			'A', AmethystBlock
		});
		GameRegistry.addRecipe(new ItemStack(AmethystDagger),new Object[]{
			"XXX", "XAX", "XSX",
			'A', AmethystBlock,
			'S', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(NickelBlock),new Object[]{
			"NNN", "NNN", "NNN",
			'N', NickelIngot
		});
		GameRegistry.addRecipe(new ItemStack(NickelIngot, 9),new Object[]{
			"NXX", "XXX", "XXX",
			'N', NickelBlock
		});
		GameRegistry.addRecipe(new ItemStack(RubyBlock),new Object[]{
			"RRR", "RRR", "RRR",
			'R', RubyFragment
		});
		GameRegistry.addRecipe(new ItemStack(RubyFragment, 9),new Object[]{
			"RXX", "XXX","XXX",
			'R', RubyBlock
		});
		GameRegistry.addRecipe(new ItemStack(AluminumBlock),new Object[]{
			"AAA", "AAA", "AAA",
			'A', AluminumIngot
		});
		GameRegistry.addRecipe(new ItemStack(AluminumIngot, 9),new Object[]{
			"AXX", "XXX","XXX",
			'A', AluminumBlock
		});
		GameRegistry.addRecipe(new ItemStack(EnderiteBlock),new Object[]{
			"EEE", "EEE", "EEE",
			'E', Enderite
		});
		GameRegistry.addRecipe(new ItemStack(Enderite, 9),new Object[]{
			"EXX", "XXX", "XXX",
			'E', EnderiteBlock
		});
		GameRegistry.addRecipe(new ItemStack(AluminumHelmet),new Object[]{
			"AAA", "AXA", "XXX",
			'A', AluminumIngot
		});
		GameRegistry.addRecipe(new ItemStack(AluminumChestplate),new Object[]{
			"AXA", "AAA", "AAA",
			'A', AluminumIngot
		});
		GameRegistry.addRecipe(new ItemStack(AluminumLeggings),new Object[]{
			"AAA", "AXA", "AXA",
			'A', AluminumIngot
		});
		GameRegistry.addRecipe(new ItemStack(AluminumBoots),new Object[]{
			"XXX", "AXA", "AXA",
			'A', AluminumIngot
		});
		GameRegistry.addRecipe(new ItemStack(Lemonade),new Object[]{
			"HLX", "GLG", "GLG",
			'H', Hammer,
			'L', Lemon,
			'G', Block.thinGlass	
		});
		GameRegistry.addRecipe(new ItemStack(RubyChestplate),new Object[]{
			"RXR", "RRR", "RRR",
			'R', RubyFragment,
		});
		GameRegistry.addRecipe(new ItemStack(RubyLeggings),new Object[]{
			"RRR", "RXR", "RXR",
			'R', RubyFragment
		});
		GameRegistry.addRecipe(new ItemStack(RubyBoots),new Object[]{
			"XXX", "RXR", "RXR",
			'R', RubyFragment
		});
		GameRegistry.addRecipe(new ItemStack(RubyPickaxe),new Object[]{
			"RRR", "XSX", "XSX",
			'R', RubyFragment,
			'S', Item.stick,
		});
		
		GameRegistry.addRecipe(new ItemStack(RubyShovel),new Object[]{
			"XRX", "XSX", "XSX",
			'R', RubyFragment,
			'S', Item.stick,
		});
		
		GameRegistry.addRecipe(new ItemStack(RubyAxe),new Object[]{
			"XRR", "XSR", "XSX",
			'R', RubyFragment,
			'S', Item.stick,
		});
		
		GameRegistry.addRecipe(new ItemStack(RubyHoe),new Object[]{
			"XRR", "XSX", "XSX",
			'R', RubyFragment,
			'S', Item.stick,
		});
		GameRegistry.addRecipe(new ItemStack(SuperAlloyHelmet),new Object[]{
			"SSS", "SXS", "XXX",
			'S', SuperAlloyIngot
		});
		GameRegistry.addRecipe(new ItemStack(SuperAlloyChestplate),new Object[]{
			"SXS", "SSS", "SSS",
			'S', SuperAlloyIngot
		});
		GameRegistry.addRecipe(new ItemStack(SuperAlloyLeggings),new Object[]{
			"SSS", "SXS", "SXS",
			'S', SuperAlloyIngot
		});
		GameRegistry.addRecipe(new ItemStack(SuperAlloyBoots),new Object[]{
			"XXX", "SXS", "SXS",
			'S', SuperAlloyIngot
		});
		GameRegistry.addRecipe(new ItemStack(SuperAlloyPickaxe),new Object[]{
			"III", "XSX", "XSX",
			'I', SuperAlloyIngot,
			'S', Item.stick,
		});
		
		GameRegistry.addRecipe(new ItemStack(SuperAlloySword),new Object[]{
			"XIX", "XIX", "XSX",
			'I', SuperAlloyIngot,
			'S', Item.stick,
		});
		
		GameRegistry.addRecipe(new ItemStack(SuperAlloyShovel),new Object[]{
			"XIX", "XSX", "XSX",
			'I', SuperAlloyIngot,
			'S', Item.stick,
		});
		
		GameRegistry.addRecipe(new ItemStack(SuperAlloyAxe),new Object[]{
			"XII", "XSI", "XSX",
			'I', SuperAlloyIngot,
			'S', Item.stick,
		});
		GameRegistry.addRecipe(new ItemStack(SuperAlloyHoe),new Object[]{
			"XII", "XSX", "XSX",
			'I', SuperAlloyIngot,
			'S', Item.stick,
		});
		GameRegistry.addRecipe(new ItemStack(SuperAlloyBlock),new Object[]{
			"SSS", "SSS", "SSS",
			'S', SuperAlloyIngot,
		});
		
		
		GameRegistry.addRecipe(new ItemStack(SuperAlloyIngot, 9),new Object[]{
			"SXX", "XXX", "XXX",
			'S', SuperAlloyBlock,
			
		});	
		GameRegistry.addRecipe(new ItemStack(EnderiteHelmet),new Object[]{
			"EEE", "EXE", "XXX",
			'E', Enderite,	
		});
		GameRegistry.addRecipe(new ItemStack(EnderiteChestplate),new Object[]{
			"EXE", "EEE", "EEE",
			'E', Enderite,	
		});
		GameRegistry.addRecipe(new ItemStack(EnderiteLeggings),new Object[]{
			"EEE", "EXE", "EXE",
			'E', Enderite,	
		});
		GameRegistry.addRecipe(new ItemStack(EnderiteBoots),new Object[]{
			"XXX", "EXE", "EXE",
			'E', Enderite,	
		});


	}

	
	private static void gameRegisters(){
		
		GameRegistry.registerBlock(TitaniumOre, "TitaniumOre");
		GameRegistry.registerBlock(NickelOre,"NickelOre");
		GameRegistry.registerBlock(AluminumOre, "AluminumOre");
		GameRegistry.registerItem(TitaniumFragment, "Titanium Fragment");
		GameRegistry.registerItem(TitaniumIngot, "Titanium Ingot");
		GameRegistry.registerItem(TitaniumPickaxe, "Titanium Pickaxe");
		GameRegistry.registerItem(TitaniumSword, "Titanium Sword");
		GameRegistry.registerItem(TitaniumShovel, "Titanium Shovel");
		GameRegistry.registerItem(TitaniumAxe, "Titanium Axe");
		GameRegistry.registerItem(TitaniumHoe, "Titanium Hoe");
		GameRegistry.registerItem(NickelIngot, "Nickel Ingot");
		GameRegistry.registerItem(NickelPickaxe, "Nickel Pickaxe");
		GameRegistry.registerItem(NickelSword, "Nickel Sword");
		GameRegistry.registerItem(NickelShovel, "Nickel Shovel");
		GameRegistry.registerItem(NickelAxe, "Nickel Axe");
		GameRegistry.registerItem(NickelHoe, "Nickel Hoe");
		GameRegistry.registerItem(TitaniumHelmet, "Titanium Helmet");
		GameRegistry.registerItem(TitaniumChestplate, "Titanium Chestplate");
		GameRegistry.registerItem(TitaniumLeggings, "Titanium Leggings");
		GameRegistry.registerItem(TitaniumBoots, "Titanium Boots");
		GameRegistry.registerItem(AluminumIngot, "Aluminum Ingot");
		GameRegistry.registerItem(AluminumPickaxe, "Aluminum Pickaxe");
		GameRegistry.registerItem(AluminumSword, "Aluminum Sword");
		GameRegistry.registerItem(AluminumShovel, "Aluminum Shovel");
		GameRegistry.registerItem(AluminumAxe, "Aluminum Axe");
		GameRegistry.registerItem(AluminumHoe, "Aluminum Hoe");
		GameRegistry.registerBlock(EndDiamondOre, "End Diamond Ore");
		GameRegistry.registerItem(DiamondFragment, "Diamond Fragment");
		GameRegistry.registerBlock(TitaniumBlock, "Titanium Block");
		GameRegistry.registerBlock(NetherGoldOre, "Nether Gold Ore");
		GameRegistry.registerBlock(EnderiteOre, "Enderite Ore");
		GameRegistry.registerItem(Enderite, "Enderite");
		GameRegistry.registerItem(EnderitePickaxe, "Enderite Pickaxe");
		GameRegistry.registerItem(EnderiteSword, "Enderite Sword");
		GameRegistry.registerItem(EnderiteShovel, "Enderite Shovel");
		GameRegistry.registerItem(EnderiteAxe, "Enderite Axe");
		GameRegistry.registerItem(EnderiteHoe, "Enderite Hoe");
		GameRegistry.registerItem(Hammer, "Hammer");
		GameRegistry.registerItem(EnderiteDust, "Enderite Dust");
		GameRegistry.registerItem(DiamondDust, "Diamond Dust");
		GameRegistry.registerItem(TitaniumDust, "Titanium Dust");
		GameRegistry.registerItem(SuperAlloyBlend, "SuperAlloyBlend");
		GameRegistry.registerBlock(RubyOre, "Ruby Ore");
		GameRegistry.registerBlock(UraniumOre, "Uranium Ore");
		GameRegistry.registerItem(UraniumDust,"UraniumDust");
		GameRegistry.registerItem(NuclearRod,"NuclearRod");
		GameRegistry.registerItem(RubyFragment,"RubyFragment");
		GameRegistry.registerItem(NickelHelmet, "Nickel Helmet");
		GameRegistry.registerItem(NickelChestplate, "Nickel Chestplate");
		GameRegistry.registerItem(NickelLeggings, "Nickel Leggings");
		GameRegistry.registerItem(NickelBoots, "Nickel Boots");
		GameRegistry.registerItem(StoneHelmet, "Stone Helmet");
		GameRegistry.registerItem(StoneChestplate, "Stone Chestplate");
		GameRegistry.registerItem(StoneLeggings, "Stone Leggings");
		GameRegistry.registerItem(StoneBoots, "Stone Boots");
		GameRegistry.registerItem(RubySword, "Ruby Sword");
		GameRegistry.registerBlock(AmethystOre, "Amethyst Ore");
		GameRegistry.registerItem(AmethystFragment, "Amethyst Fragment");
		GameRegistry.registerItem(RubyHelmet, "Ruby Helmet");
		GameRegistry.registerBlock(AmethystBlock, "Amethyst Block");
		GameRegistry.registerItem(AmethystDagger, "Amethyst Dagger");
		GameRegistry.registerBlock(NickelBlock, "Nickel Block");
		GameRegistry.registerItem(AluminumHelmet, "Aluminum Helmet");
		GameRegistry.registerItem(AluminumChestplate, "Aluminum Chestplate");
		GameRegistry.registerItem(AluminumLeggings, "Aluminum Leggings");
		GameRegistry.registerItem(AluminumBoots, "Aluminum Boots");
		GameRegistry.registerItem(EnderiteHelmet, "Enderite Helmet");
		GameRegistry.registerItem(EnderiteChestplate, "Enderite Chestplate");
		GameRegistry.registerItem(EnderiteLeggings, "Enderite Leggings");
		GameRegistry.registerItem(EnderiteBoots, "Enderite Boots");
		GameRegistry.registerBlock(RubyBlock, "Ruby Block");
		GameRegistry.registerBlock(AluminumBlock, "Aluminum Block");
		GameRegistry.registerBlock(EnderiteBlock, "Enderite Block");
		GameRegistry.registerItem(SuperAlloyPickaxe, "SuperAlloy Pickaxe");
		GameRegistry.registerItem(SuperAlloySword, "SuperAlloy Sword");
		GameRegistry.registerItem(SuperAlloyShovel, "SuperAlloy Shovel");
		GameRegistry.registerItem(SuperAlloyAxe, "SuperAlloy Axe");
		GameRegistry.registerItem(SuperAlloyHoe, "SuperAlloy Hoe");
		GameRegistry.registerItem(SuperAlloyHelmet, "SuperAlloy Helmet");
		GameRegistry.registerItem(SuperAlloyChestplate, "Super Alloy Chestplate");
		GameRegistry.registerItem(SuperAlloyLeggings, "Super Alloy Leggings");
		GameRegistry.registerItem(SuperAlloyBoots, "Super Alloy Boots");
		GameRegistry.registerBlock(LemonWood, "LemonWood");
		GameRegistry.registerBlock(LemonLeaves, "LemonLeaves");
		GameRegistry.registerBlock(LemonSapling, "LemonSapling");
		GameRegistry.registerItem(Lemon, "Lemon");
		GameRegistry.registerItem(Lemonade, "Lemonade");
		GameRegistry.registerBlock(NuclearExplosive, "NuclearExplosive");
		GameRegistry.registerItem(RubyChestplate, "RubyChestplate");
		GameRegistry.registerItem(RubyLeggings, "RubyLeggings");
		GameRegistry.registerItem(RubyBoots, "RubyBoots");
		GameRegistry.registerItem(RubyPickaxe, "RubyPickaxe");
		GameRegistry.registerItem(RubyShovel, "RubyShovel");
		GameRegistry.registerItem(RubyAxe, "RubyAxe");
		GameRegistry.registerItem(RubyHoe, "RubyHoe");
		GameRegistry.registerItem(SuperAlloyIngot, "SuperAlloyIngot");
		GameRegistry.registerBlock(SuperAlloyBlock, "SuperAlloyBlock");
		GameRegistry.registerItem(Grape, "Grape");
		GameRegistry.registerBlock(GrapeBlock, "GrapeBlock");
		GameRegistry.registerBlock(PyroclasticMaterial, "PyroclasticMaterial");
		GameRegistry.registerBlock(LemonWood, "LemonWood");
		GameRegistry.registerBlock(LemonLeaves, "LemonLeaves");
		GameRegistry.registerBlock(LemonSapling, "LemonSapling");
	}
	
	private static void languageRegisters(){
		
		LanguageRegistry.addName(TitaniumOre, "Titanium Ore");
		LanguageRegistry.addName(NickelOre, "Nickel Ore");
		LanguageRegistry.addName(AluminumOre, "Aluminum Ore");
		LanguageRegistry.addName(TitaniumFragment, "Titanium Fragment");
		LanguageRegistry.addName(TitaniumIngot, "Titanium Ingot");
		LanguageRegistry.addName(TitaniumPickaxe, "Titanium Pickaxe");
		LanguageRegistry.addName(TitaniumSword, "Titanium Sword");
		LanguageRegistry.addName(TitaniumShovel, "Titanium Shovel");
		LanguageRegistry.addName(TitaniumAxe, "Titanium Axe");
		LanguageRegistry.addName(TitaniumHoe, "Titanium Hoe");
		LanguageRegistry.addName(NickelIngot, "Nickel Ingot");
		LanguageRegistry.addName(NickelPickaxe, "Nickel Pickaxe");
		LanguageRegistry.addName(NickelSword, "Nickel Sword");
		LanguageRegistry.addName(NickelShovel, "Nickel Shovel");
		LanguageRegistry.addName(NickelAxe, "Nickel Axe");
		LanguageRegistry.addName(NickelHoe, "Nickel Hoe");
		LanguageRegistry.addName(TitaniumHelmet, "Titanium Helmet");
		LanguageRegistry.addName(TitaniumChestplate, "Titanium Chestplate");
		LanguageRegistry.addName(TitaniumLeggings, "Titanium Leggings");
		LanguageRegistry.addName(TitaniumBoots, "Titanium Boots");
		LanguageRegistry.addName(AluminumIngot, "Aluminum Ingot");
		LanguageRegistry.addName(AluminumPickaxe, "Aluminum Pickaxe");
		LanguageRegistry.addName(AluminumSword, "Aluminum Sword");
		LanguageRegistry.addName(AluminumShovel, "Aluminum Shovel");
		LanguageRegistry.addName(AluminumAxe, "Aluminum Axe");
		LanguageRegistry.addName(AluminumHoe, "Aluminum Hoe");
		LanguageRegistry.addName(EndDiamondOre, "End Diamond Ore");
		LanguageRegistry.addName(DiamondFragment, "Diamond Fragment");
		LanguageRegistry.addName(TitaniumBlock, "Titanium Block");
		LanguageRegistry.addName(NetherGoldOre, "Nether Gold Ore");
		LanguageRegistry.addName(EnderiteOre, "Enderite Ore");
		LanguageRegistry.addName(Enderite, "Enderite");
		LanguageRegistry.addName(EnderitePickaxe, "Enderite Pickaxe");
		LanguageRegistry.addName(EnderiteSword, "Enderite Sword");
		LanguageRegistry.addName(EnderiteShovel, "Enderite Shovel");
		LanguageRegistry.addName(EnderiteAxe, "Enderite Axe");
		LanguageRegistry.addName(EnderiteHoe, "Enderite Hoe");
		LanguageRegistry.addName(Hammer, "Hammer");
		LanguageRegistry.addName(EnderiteDust, "Enderite Dust");
		LanguageRegistry.addName(DiamondDust, "Diamond Dust");
		LanguageRegistry.addName(TitaniumDust, "Titanium Dust");
		LanguageRegistry.addName(SuperAlloyBlend, "Super Alloy Blend");
		LanguageRegistry.addName(RubyOre, "Ruby Ore");
		LanguageRegistry.addName(UraniumOre, "Uranium Ore");
		LanguageRegistry.addName(UraniumDust, "Uranium Dust");
		LanguageRegistry.addName(NuclearRod,"Nuclear Rod");
		LanguageRegistry.addName(RubyFragment,"Ruby Fragment");
		LanguageRegistry.addName(NickelHelmet, "Nickel Helmet");
		LanguageRegistry.addName(NickelChestplate, "Nickel Chestplate");
		LanguageRegistry.addName(NickelLeggings, "Nickel Leggings");
		LanguageRegistry.addName(NickelBoots, "Nickel Boots");
		LanguageRegistry.addName(StoneHelmet, "Stone Helmet");
		LanguageRegistry.addName(StoneChestplate, "Stone Chestplate");
		LanguageRegistry.addName(StoneLeggings, "Stone Leggings");
		LanguageRegistry.addName(StoneBoots, "Stone Boots");
		LanguageRegistry.addName(RubySword, "Ruby Sword");
		LanguageRegistry.addName(AmethystOre, "Amethyst Ore");
		LanguageRegistry.addName(AmethystFragment, "Amethyst Fragment");
		LanguageRegistry.addName(RubyHelmet, "Ruby Helmet");
		LanguageRegistry.addName(AmethystBlock, "Amethyst Block");
		LanguageRegistry.addName(AmethystDagger, "Amethyst Dagger");
		LanguageRegistry.addName(NickelBlock, "Nickel Block");
		LanguageRegistry.addName(AluminumHelmet, "Aluminum Helmet");
		LanguageRegistry.addName(AluminumChestplate, "Aluminum Chestplate");
		LanguageRegistry.addName(AluminumLeggings, "Aluminum Leggings");
		LanguageRegistry.addName(AluminumBoots, "Aluminum Boots");
		LanguageRegistry.addName(EnderiteHelmet, "Enderite Helmet");
		LanguageRegistry.addName(EnderiteChestplate, "Enderite Chestplate");
		LanguageRegistry.addName(EnderiteLeggings, "Enderite Leggings");
		LanguageRegistry.addName(EnderiteBoots, "Enderite Boots");
		LanguageRegistry.addName(RubyBlock, "Ruby Block");
		LanguageRegistry.addName(AluminumBlock, "Aluminum Block");
		LanguageRegistry.addName(EnderiteBlock, "Enderite Block");
		LanguageRegistry.addName(SuperAlloyPickaxe, "Super Alloy Pickaxe");
		LanguageRegistry.addName(SuperAlloySword, "Super Alloy Sword");
		LanguageRegistry.addName(SuperAlloyShovel, "Super Alloy Shovel");
		LanguageRegistry.addName(SuperAlloyAxe, "Super Alloy Axe");
		LanguageRegistry.addName(SuperAlloyHoe, "Super Alloy Hoe");
		LanguageRegistry.addName(SuperAlloyHelmet, "Super Alloy Helmet");
		LanguageRegistry.addName(SuperAlloyChestplate, "Super Alloy Chestplate");
		LanguageRegistry.addName(SuperAlloyLeggings, "Super Alloy Leggings");
		LanguageRegistry.addName(SuperAlloyBoots, "Super Alloy Boots");
		LanguageRegistry.addName(LemonWood, "Lemon Wood");
		LanguageRegistry.addName(LemonLeaves, "Lemon Leaves");
		LanguageRegistry.addName(LemonSapling, "Lemon Sapling");
		LanguageRegistry.addName(Lemon, "Lemon");
		LanguageRegistry.addName(Lemonade, "Lemonade");
		LanguageRegistry.addName(NuclearExplosive, "Nuke");
		LanguageRegistry.addName(RubyChestplate, "Ruby Chestplate");
		LanguageRegistry.addName(RubyLeggings, "Ruby Leggings");
		LanguageRegistry.addName(RubyBoots, "Ruby Boots");
		LanguageRegistry.addName(RubyPickaxe, "Ruby Pickaxe");
		LanguageRegistry.addName(RubyShovel, "Ruby Shovel");
		LanguageRegistry.addName(RubyAxe, "Ruby Axe");
		LanguageRegistry.addName(RubyHoe, "Ruby Hoe");
		LanguageRegistry.addName(SuperAlloyIngot, "Super Alloy Ingot");
		LanguageRegistry.addName(SuperAlloyBlock, "Super Alloy Block");
		LanguageRegistry.addName(GrapeBlock, "Grape Block");
		LanguageRegistry.addName(Grape, "Grape");
		LanguageRegistry.addName(PyroclasticMaterial, "Pyroclastic Material");
		
	}
}


	


