package mods.new_stuff.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemEnderPearl;


public class BlockEnderiteOre extends Block{
	
	public BlockEnderiteOre(int id, Material mat){
		super(id, mat);
		this.setCreativeTab(CreativeTabs.tabBlock);
	}
	
	@Override
	public void registerIcons(IconRegister reg){
		this.blockIcon = reg.registerIcon("new_stuff:EnderiteOre");
	}
	
	 public int idDropped(int par1, Random par2Random, int par3)
	    {
	        if (par3 > 3)
	        {
	            par3 = 3;
	        }

	        return par2Random.nextInt(15 - par3 * 3) == 0 ? Item.enderPearl.itemID : this.blockID;
	    }

}

