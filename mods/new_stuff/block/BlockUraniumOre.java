package mods.new_stuff.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.MinecraftForge;

public class BlockUraniumOre extends Block{
	
	public BlockUraniumOre(int id, Material mat){
		super(id, mat);
		this.setCreativeTab(CreativeTabs.tabBlock);
		
	}
	
	
	
	@Override
	public void registerIcons(IconRegister reg){
		this.blockIcon = reg.registerIcon("new_stuff:UraniumOre");
	}

}