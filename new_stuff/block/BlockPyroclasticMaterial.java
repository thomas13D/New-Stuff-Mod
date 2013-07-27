package mods.new_stuff.block;



import java.util.Random;

import mods.new_stuff.common.New_Stuff;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class BlockPyroclasticMaterial extends Block{
	
	public BlockPyroclasticMaterial(int id, Material mat){
		super(id, mat);
		this.setCreativeTab(CreativeTabs.tabBlock);
	}
	
	@Override
	public void registerIcons(IconRegister reg){
		this.blockIcon = reg.registerIcon("new_stuff:PyroclasticMaterial");
	}
	
	public int idDropped(int par1, Random rand, int par2){
		return New_Stuff.PyroclasticItem.itemID;
				
	}
	
	public int quantityDropped(Random rand){
		return rand.nextInt(4
		);
	}

}

