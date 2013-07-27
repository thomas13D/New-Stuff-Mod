package mods.new_stuff.ore;



import java.util.Random;

import mods.new_stuff.common.New_Stuff;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class BlockTitaniumOre extends Block{
	
	public BlockTitaniumOre(int id, Material mat){
		super(id, mat);
		this.setCreativeTab(CreativeTabs.tabBlock);
	}
	
	@Override
	public void registerIcons(IconRegister reg){
		this.blockIcon = reg.registerIcon("new_stuff:TitaniumOre");
	}
	
	public int idDropped(int par1, Random rand, int par2){
		return New_Stuff.TitaniumFragment.itemID;
	}
	
	public int quantityDropped(Random rand){
		return rand.nextInt(3);
	}

}

