package mods.new_stuff.food;

import cpw.mods.fml.relauncher.Side; 
import cpw.mods.fml.relauncher.SideOnly;
import mods.new_stuff.common.New_Stuff;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.ItemSeedFood;
import net.minecraft.item.ItemStack;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.common.ChestGenHooks;


public class FoodGrape extends ItemSeedFood {

	public FoodGrape(int par1, int par2, float par3, int par4, int par5) {
		super(par1, par2, par3, par4, par5);
	}
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister reg){
		this.itemIcon = reg.registerIcon("new_stuff:Grape");
		
		ChestGenHooks.addItem(ChestGenHooks.DUNGEON_CHEST, new WeightedRandomChestContent(new ItemStack(New_Stuff.Grape), 1, 5, 10 ));
		ChestGenHooks.addItem(ChestGenHooks.PYRAMID_DESERT_CHEST, new WeightedRandomChestContent(new ItemStack(New_Stuff.Grape), 1, 5, 10 ));
		ChestGenHooks.addItem(ChestGenHooks.MINESHAFT_CORRIDOR, new WeightedRandomChestContent(new ItemStack(New_Stuff.Grape), 1, 5, 10 ));
		ChestGenHooks.addItem(ChestGenHooks.PYRAMID_JUNGLE_CHEST, new WeightedRandomChestContent(new ItemStack(New_Stuff.Grape), 1, 5, 10 ));
		ChestGenHooks.addItem(ChestGenHooks.VILLAGE_BLACKSMITH, new WeightedRandomChestContent(new ItemStack(New_Stuff.Grape), 1, 5, 10 ));
		ChestGenHooks.addItem(ChestGenHooks.STRONGHOLD_LIBRARY, new WeightedRandomChestContent(new ItemStack(New_Stuff.Grape), 1, 5, 10 ));
	}	
	
}
